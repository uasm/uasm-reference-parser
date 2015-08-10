package de.uni.ulm.uasm.parsers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jparsec.OperatorTable;
import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Parsers;
import org.codehaus.jparsec.Scanners;
import org.codehaus.jparsec.Terminals;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.Tokens;
import org.codehaus.jparsec.Tokens.Fragment;
import org.codehaus.jparsec.Tokens.Tag;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;
import org.codehaus.jparsec.pattern.Pattern;
import org.codehaus.jparsec.pattern.Patterns;

public final class UASMParsers {
	private static final HashSet<String> KEYWORDS = new HashSet<String>(Arrays.asList(new String[] {
			"asm", "asmmodule",
			"use",
			"import", "export",
			"exec",
			"domain", "enum",
			"in", "of", "from",
			"controlled", "static", "derived", "shared", "monitored", "out", "function", "initially", "always",
			"rule",
			"par", "endpar",
			"seq", "next", "endseq",
			"skip",
			"if", "then", "else", "endif",
			"case", "otherwise", "endcase",
			"choose", "with", "do", "ifnone",
			"forall",
			"let",
			"extend", "as",
			"iterate", "while",
			"local",
			"print",
			"result", "return",
			"true", "false", "undef", "self",
			"exists", "unique", "holds",
			"pick",
			"step",
			"SET", "LIST", "MAP",
			"ANY", "AGENT",
			"NUMBER", "INTEGER", "STRING", "CHAR", "BOOLEAN", "RULE"
	}));
	private static final HashSet<String> OPERATORS = new HashSet<String>(Arrays.asList(new String[] {
			"(", ")", "{", "}", "[", "]",
			",",
			":=",
			"<", ">", "<=", ">=", "!=", "=", "memberof", "-", "+", "*", "div", "/", "mod", "^", "and", "or", "xor", "implies", "iff", "not",
			"->", "<-",
			"?", ":",
			"@", "|",
			".."
	}));
	private static final HashSet<Parser<? extends Object>> LEXERS = new HashSet<Parser<? extends Object>>();
	static {
		Pattern digitParser = Patterns.range('0', '9').many1();
		Pattern floatParser = digitParser.next(Patterns.isChar('.').next(digitParser).optional());
		LEXERS.add(Scanners.pattern(floatParser, "NUMBER").source().map(new org.codehaus.jparsec.functors.Map<String,Fragment>() {
			@Override
			public Fragment map(String from) {
				return Tokens.fragment(from, Tag.DECIMAL);
			}
		}));
		LEXERS.add(Terminals.StringLiteral.DOUBLE_QUOTE_TOKENIZER);
		LEXERS.add(Terminals.CharLiteral.SINGLE_QUOTE_TOKENIZER);
	}
	private static final HashMap<String, Integer> BINARY_OPERATORS = new HashMap<String, Integer>();
	private static final HashMap<String, Integer> UNARY_OPERATORS = new HashMap<String, Integer>();
	static {
		BINARY_OPERATORS.put("^", 8);
		BINARY_OPERATORS.put("*", 7);
		BINARY_OPERATORS.put("/", 7);
		BINARY_OPERATORS.put("div", 7);
		BINARY_OPERATORS.put("mod", 7);
		BINARY_OPERATORS.put("+", 6);
		BINARY_OPERATORS.put("-", 6);
		BINARY_OPERATORS.put("<", 5);
		BINARY_OPERATORS.put("<=", 5);
		BINARY_OPERATORS.put(">", 5);
		BINARY_OPERATORS.put(">=", 5);
		BINARY_OPERATORS.put("=", 5);
		BINARY_OPERATORS.put("!=", 5);
		BINARY_OPERATORS.put("memberof", 4);
		BINARY_OPERATORS.put("and", 2);
		BINARY_OPERATORS.put("xor", 1);
		BINARY_OPERATORS.put("or", 1);
		BINARY_OPERATORS.put("implies", 0);
		BINARY_OPERATORS.put("iff", 0);
		
		UNARY_OPERATORS.put("+", 9);
		UNARY_OPERATORS.put("-", 9);
		UNARY_OPERATORS.put("not", 3);
	}
	private static UASMParsers instance;
	private final MapperProvider mapperProvider;
	private final Map<Token, UASMNode> identifierMapper;
	private final Map<Token, UASMNode> keywordMapper;
	private final Map<Token, UASMNode> operatorMapper;
	private final Map<Token, UASMNode> stringMapper;
	private final Map<Token, UASMNode> charMapper;
	private final Map<Token, UASMNode> numberMapper;
	private final Terminals terminals;
	private final Parser<Object> tokenizer;
	private Parser<UASMNode> idParser;
	private Parser<UASMNode> stringParser;
	private Parser<UASMNode> numberParser;
	private Parser<UASMNode> charParser;
	private HashMap<String, Parser<UASMNode>> keywordParsers = new HashMap<String, Parser<UASMNode>>();
	private HashMap<String, Parser<UASMNode>> operatorParsers = new HashMap<String, Parser<UASMNode>>();
	private HashMap<String, List<Parser<UASMNode>>> additionalParsers = new HashMap<String, List<Parser<UASMNode>>>();
	private HashMap<String, Parser.Reference<UASMNode>> parsers;
	
	private UASMParsers(MapperProvider mapperProvider) {
		this(mapperProvider, null, null, null);
	}
	
	private UASMParsers(MapperProvider mapperProvider, Set<String> additionalKeywords, Set<String> additionalOperators, Set<Parser<? extends Object>> additionalLexers) {
		if (mapperProvider == null)
			throw new NullPointerException("The argument 'mapperProvider' must not be null.");
		if (mapperProvider.getIdentifierMapper() == null)
			throw new NullPointerException("The IdentifierMapper must not be null.");
		if (mapperProvider.getKeywordMapper() == null)
			throw new NullPointerException("The KeywordMapper must not be null.");
		if (mapperProvider.getOperatorMapper() == null)
			throw new NullPointerException("The OperatorMapper must not be null.");
		if (mapperProvider.getStringMapper() == null)
			throw new NullPointerException("The StringMapper must not be null.");
		if (mapperProvider.getStringMapper() == null)
			throw new NullPointerException("The CharMapper must not be null.");
		if (mapperProvider.getNumberMapper() == null)
			throw new NullPointerException("The NumberMapper must not be null.");
		if (additionalKeywords != null)
			KEYWORDS.addAll(additionalKeywords);
		if (additionalOperators != null)
			OPERATORS.addAll(additionalOperators);
		if (additionalLexers == null)
			additionalLexers = Collections.emptySet();
		this.mapperProvider = mapperProvider;
		this.identifierMapper = mapperProvider.getIdentifierMapper();
		this.keywordMapper = mapperProvider.getKeywordMapper();
		this.operatorMapper = mapperProvider.getOperatorMapper();
		this.stringMapper = mapperProvider.getStringMapper();
		this.charMapper = mapperProvider.getCharMapper();
		this.numberMapper = mapperProvider.getNumberMapper();
		
		// Treat operators consisting of letters as keywords to avoid parsing prefixes of keywords as operators (e.g. 'mode' would be parsed as 'mod' 'e')
		Iterator<String> it = OPERATORS.iterator();
		while (it.hasNext()) {
			String operator = it.next();
			if (Character.isLetter(operator.charAt(operator.length() - 1))) {
				it.remove();
				KEYWORDS.add(operator);
			}
		}
		
		terminals = Terminals.caseSensitive(OPERATORS.toArray(new String[OPERATORS.size()]), KEYWORDS.toArray(new String[KEYWORDS.size()]));
		LinkedList<Parser<? extends Object>> list = new LinkedList<Parser<? extends Object>>();
		list.add(terminals.tokenizer());
		list.addAll(LEXERS);
		list.add(Terminals.Identifier.TOKENIZER);
		tokenizer = Parsers.or(list);
	}
	
	public Collection<String> getKeywords() {
		return Collections.unmodifiableCollection(KEYWORDS);
	}
	
	public Collection<String> getOperators() {
		return Collections.unmodifiableCollection(OPERATORS);
	}
	
	public Collection<Parser<? extends Object>> getLexers() {
		return Collections.unmodifiableCollection(LEXERS);
	}
	
	public Parser<UASMNode> getParser(String nonTerminal) {
		if (parsers == null)
			parsers = new HashMap<String, Parser.Reference<UASMNode>>();
		Parser.Reference<UASMNode> parserRef = parsers.get(nonTerminal);
		if (parserRef == null) {
			parserRef = Parser.newReference();
			parsers.put(nonTerminal, parserRef);
			if ("Asm".equals(nonTerminal))
				createAsmParser();
			else if ("Header".equals(nonTerminal))
				createHeaderParser();
			else if ("UseDirective".equals(nonTerminal))
				createUseDirectiveParser();
			else if ("ImportDirective".equals(nonTerminal))
				createImportDirectiveParser();
			else if ("ExportDirective".equals(nonTerminal))
				createExportDirectiveParser();
			else if ("Body".equals(nonTerminal))
				createBodyParser();
			else if ("Definition".equals(nonTerminal))
				createDefinitionParser();
			else if ("TypeDefinition".equals(nonTerminal))
				createTypeDefinitionParser();
			else if ("DomainDefinition".equals(nonTerminal))
				createDomainDefinitionParser();
			else if ("InitialDomainDefinition".equals(nonTerminal))
				createInitialDomainDefinitionParser();
			else if ("EnumerateDefinition".equals(nonTerminal))
				createEnumerateDefinitionParser();
			else if ("DomainParameterDefinition".equals(nonTerminal))
				createDomainParameterDefinitionParser();
			else if ("ParameterDefinition".equals(nonTerminal))
				createParameterDefinitionParser();
			else if ("ControlledFunction".equals(nonTerminal))
				createControlledFunctionParser();
			else if ("StaticFunction".equals(nonTerminal))
				createStaticFunctionParser();
			else if ("DerivedFunction".equals(nonTerminal))
				createDerivedFunctionParser();
			else if ("MonitoredFunction".equals(nonTerminal))
				createMonitoredFunctionParser();
			else if ("SharedFunction".equals(nonTerminal))
				createSharedFunctionParser();
			else if ("OutFunction".equals(nonTerminal))
				createOutFunctionParser();
			else if ("InitialFunctionDefinition".equals(nonTerminal))
				createInitialFunctionDefinitionParser();
			else if ("FunctionDefinition".equals(nonTerminal))
				createFunctionDefinitionParser();
			else if ("RuleDefinition".equals(nonTerminal))
				createRuleDefinitionParser();
			else if ("ParBlock".equals(nonTerminal))
				createParBlockParser();
			else if ("SeqBlock".equals(nonTerminal))
				createSeqBlockParser();
			else if ("SeqNext".equals(nonTerminal))
				createSeqNextParser();
			else if ("Rule".equals(nonTerminal))
				createRuleParser();
			else if ("CallRule".equals(nonTerminal))
				createCallRuleParser();
			else if ("SkipRule".equals(nonTerminal))
				createSkipRuleParser();
			else if ("UpdateRule".equals(nonTerminal))
				createUpdateRuleParser();
			else if ("ConditionalRule".equals(nonTerminal))
				createConditionalRuleParser();
			else if ("CaseRule".equals(nonTerminal))
				createCaseRuleParser();
			else if ("ChooseRule".equals(nonTerminal))
				createChooseRuleParser();
			else if ("ForAllRule".equals(nonTerminal))
				createForAllRuleParser();
			else if ("LetRule".equals(nonTerminal))
				createLetRuleParser();
			else if ("ExtendRule".equals(nonTerminal))
				createExtendRuleParser();
			else if ("ImportRule".equals(nonTerminal))
				createImportRuleParser();
			else if ("IterateRule".equals(nonTerminal))
				createIterateRuleParser();
			else if ("WhileRule".equals(nonTerminal))
				createWhileRuleParser();
			else if ("TurboReturnRule".equals(nonTerminal))
				createTurboReturnRuleParser();
			else if ("LocalRule".equals(nonTerminal))
				createLocalRuleParser();
			else if ("PrintRule".equals(nonTerminal))
				createPrintRuleParser();
			else if ("Term".equals(nonTerminal))
				createTermParser();
			else if ("BasicTerm".equals(nonTerminal))
				createBasicTermParser();
			else if ("FunctionTerm".equals(nonTerminal))
				createFunctionTermParser();
			else if ("EnumTerm".equals(nonTerminal))
				createEnumTermParser();
			else if ("EnumerableTerm".equals(nonTerminal))
				createEnumerableTermParser();
			else if ("VariableTerm".equals(nonTerminal))
				createVariableTermParser();
			else if ("LocationTerm".equals(nonTerminal))
				createLocationTermParser();
			else if ("Literal".equals(nonTerminal))
				createLiteralParser();
			else if ("BooleanLiteral".equals(nonTerminal))
				createBooleanLiteralParser();
			else if ("KernelLiteral".equals(nonTerminal))
				createKernelLiteralParser();
			else if ("ForAllTerm".equals(nonTerminal))
				createForAllTermParser();
			else if ("ExistsTerm".equals(nonTerminal))
				createExistsTermParser();
			else if ("SizeOfEnumerableTerm".equals(nonTerminal))
				createSizeOfEnumerableTermParser();
			else if ("PickTerm".equals(nonTerminal))
				createPickTermParser();
			else if ("ConditionalTerm".equals(nonTerminal))
				createConditionalTermParser();
			else if ("CaseTerm".equals(nonTerminal))
				createCaseTermParser();
			else if ("RuleAsTerm".equals(nonTerminal))
				createRuleAsTermParser();
			else if ("ReturnTerm".equals(nonTerminal))
				createReturnTermParser();
			else if ("ComprehensionTerm".equals(nonTerminal))
				createComprehensionTermParser();
			else if ("SetComprehensionTerm".equals(nonTerminal))
				createSetComprehensionTermParser();
			else if ("ListComprehensionTerm".equals(nonTerminal))
				createListComprehensionTermParser();
			else if ("BagComprehensionTerm".equals(nonTerminal))
				createBagComprehensionTermParser();
			else if ("MapComprehensionTerm".equals(nonTerminal))
				createMapComprehensionTermParser();
			else if ("StructureTerm".equals(nonTerminal))
				createStructureTermParser();
			else if ("SetTerm".equals(nonTerminal))
				createSetTermParser();
			else if ("ListTerm".equals(nonTerminal))
				createListTermParser();
			else if ("BagTerm".equals(nonTerminal))
				createBagTermParser();
			else if ("MapTerm".equals(nonTerminal))
				createMapTermParser();
			else if ("NumberRangeTerm".equals(nonTerminal))
				createNumberRangeTermParser();
			else if ("IdDomain".equals(nonTerminal))
				createIdDomainParser();
			else if ("IdFunction".equals(nonTerminal))
				createIdFunctionParser();
			else if ("IdRule".equals(nonTerminal))
				createIdRuleParser();
			else if ("Domain".equals(nonTerminal))
				createDomainParser();
			else if ("StructuredDomain".equals(nonTerminal))
				createStructuredDomainParser();
			else if ("ExtendableDomain".equals(nonTerminal))
				createExtendableDomainParser();
			else if ("BasicDomain".equals(nonTerminal))
				createBasicDomainParser();
			else {
				parsers.remove(nonTerminal);
				throw new IllegalArgumentException("Unknown parser requested: '" + nonTerminal + "'");
			}
		}
		return parsers.get(nonTerminal).lazy();
	}
	
	private List<Parser<UASMNode>> getAdditionalParsers(String nonTerminal) {
		List<Parser<UASMNode>> parsers = additionalParsers.get(nonTerminal);
		if (parsers == null)
			parsers = Collections.emptyList();
		return parsers;
	}
	
	/**
	 * Asm ::= ('asm' | 'asmmodule') Id Header Body
	 */
	private void createAsmParser() {
		createArrayParser("Asm", Parsers.array(	Parsers.or(	getKeywordParser("asm"),
															getKeywordParser("asmmodule")),
												getIdParser(),
												getParser("Header"),
												getParser("Body")));
	}
	
	/**
	 * Header ::= (UseDirective | ImportDirective | ExportDirective)*
	 */
	private void createHeaderParser() {
		createArrayParser("Header", Parsers.array(star(Parsers.or(	getParser("UseDirective"),
																	getParser("ImportDirective"),
																	getParser("ExportDirective")))));
	}
	
	/**
	 * UseDirective ::= 'use' Id
	 */
	private void createUseDirectiveParser() {
		createArrayParser("UseDirective", Parsers.array(getKeywordParser("use"),
														getIdParser()));
	}
	
	/**
	 * ImportDirective ::= 'import' Id ('(' (IdDomain | IdFunction | IdRule) (',' (IdDomain | IdFunction | IdRule))* ')')?
	 */
	private void createImportDirectiveParser() {
		createArrayParser("ImportDirective", Parsers.array(	getKeywordParser("import"),
															getIdParser(),
															Parsers.array(	getOperatorParser("("),
																			csplus(Parsers.or(	getParser("IdDomain"),
																								getParser("IdFunction"),
																								getParser("IdRule"))),
																			getOperatorParser(")")).optional()));
	}
	
	/**
	 * ExportDirective ::= 'export' Id ('(' (IdDomain | IdFunction | IdRule) (',' (IdDomain | IdFunction | IdRule))* ')' | '*')?
	 */
	private void createExportDirectiveParser() {
		createArrayParser("ExportDirective", Parsers.array(	getKeywordParser("export"),
															getIdParser(),
															Parsers.or(	Parsers.array(	getOperatorParser("("),
																						csplus(Parsers.or(	getParser("IdDomain"),
																											getParser("IdFunction"),
																											getParser("IdRule"))),
																						getOperatorParser(")")),
																		getOperatorParser("*")).optional()));
	}
	
	/**
	 * Body ::= Definition* ('exec' IdRule)?
	 */
	private void createBodyParser() {
		createArrayParser("Body",	Parsers.array(	star(getParser("Definition")),
													Parsers.array(	getKeywordParser("exec"),
																	getParser("IdRule")).optional()));
	}
	
	/**
	 * Definition ::= TypeDefinition | FunctionDefinition | RuleDefinition
	 */
	private void createDefinitionParser() {
		createParser("Definition", Parsers.or(	getParser("TypeDefinition"),
												getParser("FunctionDefinition"),
												getParser("RuleDefinition")));
	}
	
	/**
	 * TypeDefinition ::= DomainDefinition | EnumerateDefinition
	 */
	private void createTypeDefinitionParser() {
		createParser("TypeDefinition", Parsers.or(	getParser("DomainDefinition"),
													getParser("EnumerateDefinition")));
	}
	
	/**
	 * DomainDefinition ::= 'domain' IdDomain | ('of' DomainParameterDefinition)? InitialDomainDefinition?
	 */
	private void createDomainDefinitionParser() {
		createArrayParser("DomainDefinition", Parsers.array(	getKeywordParser("domain"),
																getParser("IdDomain"),
																Parsers.array(	getKeywordParser("of"),
																				getParser("DomainParameterDefinition")).optional(),
																getParser("InitialDomainDefinition").optional()));
	}
	
	/**
	 * InitialDomainDefinition ::= 'initially' '{' Literal (',' Literal)* '}'
	 */
	private void createInitialDomainDefinitionParser() {
		createArrayParser("InitialDomainDefinition", Parsers.array(	getKeywordParser("initially"),
																	getOperatorParser("{"),
																	csplus(getParser("Literal")),
																	getOperatorParser("}")));
	}
	
	/**
	 * EnumerateDefinition ::= 'enum' Id '=' '{' EnumTerm (',' EnumTerm)* '}'
	 */
	private void createEnumerateDefinitionParser() {
		createArrayParser("EnumerateDefinition", Parsers.array(	getKeywordParser("enum"),
																getIdParser(),
																getOperatorParser("="),
																getOperatorParser("{"),
																csplus(getParser("EnumTerm")),
																getOperatorParser("}")));
	}
	
	/**
	 * DomainParameterDefinition ::= Domain ParameterDefinition
	 */
	private void createDomainParameterDefinitionParser() {
		createArrayParser("DomainParameterDefinition", Parsers.array(	getParser("Domain"),
																		getParser("ParameterDefinition")));
	}
	
	/**
	 * ParameterDefinition ::= '(' (Id 'in' Domain | Id | Domain) (',' (Id 'in' Domain | Id | Domain))* ')'
	 */
	private void createParameterDefinitionParser() {
		createArrayParser("ParameterDefinition", Parsers.array(	getOperatorParser("("),
																csplus(Parsers.or(	Parsers.array(	getIdParser(),
																									getKeywordParser("in"),
																									getParser("Domain")),
																					getIdParser(),
																					getParser("Domain"))),
																getOperatorParser(")")));
	}
	
	/**
	 * ControlledFunction ::= ('controlled' | 'function' | 'controlled function') IdFunction ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?
	 */
	private void createControlledFunctionParser() {
		createArrayParser("ControlledFunction", Parsers.array(	Parsers.or(	getKeywordParser("controlled"),
																			getKeywordParser("function"),
																			Parsers.array(	getKeywordParser("controlled"),
																							getKeywordParser("function"))),
																getParser("IdFunction"),
																getParser("ParameterDefinition").optional(),
																Parsers.array(	getOperatorParser("->"),
																				getParser("Domain")).optional(),
																Parsers.array(	getKeywordParser("initially"),
																				getParser("InitialFunctionDefinition")).optional()));
	}
	
	/**
	 * StaticFunction ::= 'static' 'function'? IdFunction ParameterDefinition? ('->' Domain)? ('always' InitialFunctionDefinition)
	 */
	private void createStaticFunctionParser() {
		createArrayParser("StaticFunction", Parsers.array(	getKeywordParser("static"),
															getKeywordParser("function").optional(),
															getParser("IdFunction"),
															getParser("ParameterDefinition").optional(),
															Parsers.array(	getOperatorParser("->"),
																			getParser("Domain")).optional(),
															Parsers.array(	getKeywordParser("always"),
																			getParser("InitialFunctionDefinition"))));
	}
	
	/**
	 * DerivedFunction ::= 'derived' 'function'? IdFunction ParameterDefinition? ('->' Domain)? '=' InitialFunctionDefinition
	 */
	private void createDerivedFunctionParser() {
		createArrayParser("DerivedFunction", Parsers.array(	getKeywordParser("derived"),
															getKeywordParser("function").optional(),
															getParser("IdFunction"),
															getParser("ParameterDefinition").optional(),
															Parsers.array(	getOperatorParser("->"),
																			getParser("Domain")).optional(),
															Parsers.array(	getOperatorParser("="),
																			getParser("InitialFunctionDefinition"))));
	}
	
	/**
	 * MonitoredFunction ::= 'monitored' 'function'? IdFunction ParameterDefinition? ('->' Domain)?
	 */
	private void createMonitoredFunctionParser() {
		createArrayParser("MonitoredFunction", Parsers.array(	getKeywordParser("monitored"),
																getKeywordParser("function").optional(),
																getParser("IdFunction"),
																getParser("ParameterDefinition").optional(),
																Parsers.array(	getOperatorParser("->"),
																				getParser("Domain")).optional()));
	}
	
	/**
	 * SharedFunction ::= 'shared' 'function'? IdFunction ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?
	 */
	private void createSharedFunctionParser() {
		createArrayParser("SharedFunction", Parsers.array(	getKeywordParser("shared"),
															getKeywordParser("function").optional(),
															getParser("IdFunction"),
															getParser("ParameterDefinition").optional(),
															Parsers.array(	getOperatorParser("->"),
																			getParser("Domain")).optional(),
															Parsers.array(	getKeywordParser("initially"),
																			getParser("InitialFunctionDefinition")).optional()));
	}
	
	/**
	 * OutFunction ::= 'out' 'function'? IdFunction ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?
	 */
	private void createOutFunctionParser() {
		createArrayParser("OutFunction", Parsers.array(	getKeywordParser("out"),
														getKeywordParser("function").optional(),
														getParser("IdFunction"),
														getParser("ParameterDefinition").optional(),
														Parsers.array(	getOperatorParser("->"),
																		getParser("Domain")).optional(),
														Parsers.array(	getKeywordParser("initially"),
																		getParser("InitialFunctionDefinition")).optional()));
	}
	
	/**
	 * InitialFunctionDefinition ::= 'from'? Term
	 */
	private void createInitialFunctionDefinitionParser() {
		createArrayParser("InitialFunctionDefinition", Parsers.array(	getKeywordParser("from").optional(),
																		getParser("Term")));
	}
	
	/**
	 * FunctionDefinition ::= ControlledFunction | StaticFunction | DerivedFunction | MonitoredFunction | SharedFunction | OutFunction
	 */
	private void createFunctionDefinitionParser() {
		createParser("FunctionDefinition", Parsers.or(	getParser("ControlledFunction"),
														getParser("StaticFunction"),
														getParser("DerivedFunction"),
														getParser("MonitoredFunction"),
														getParser("SharedFunction"),
														getParser("OutFunction")));
	}
	
	/**
	 * RuleDefinition ::= 'rule' IdRule ParameterDefinition '=' Rule
	 */
	private void createRuleDefinitionParser() {
		createArrayParser("RuleDefinition", Parsers.array(	getKeywordParser("rule"),
															getParser("IdRule"),
															getParser("ParameterDefinition").optional(),
															getOperatorParser("="),
															getParser("Rule")));
	}
	
	/**
	 * ParBlock ::= 'par' Rule+ 'endpar' | '{' Rule+ '}'
	 */
	private void createParBlockParser() {
		createArrayParser("ParBlock", Parsers.or(	Parsers.array(	getKeywordParser("par"),
																	plus(getParser("Rule")),
																	getKeywordParser("endpar")),
													Parsers.array(	getOperatorParser("{"),
																	plus(getParser("Rule")),
																	getOperatorParser("}"))));
	}
	
	/**
	 * SeqBlock ::= 'seq' Rule+ 'endseq' | '[' Rule+ ']'
	 */
	private void createSeqBlockParser() {
		createArrayParser("SeqBlock", Parsers.or(	Parsers.array(	getKeywordParser("seq"),
																	plus(getParser("Rule")),
																	getKeywordParser("endseq")),
													Parsers.array(	getOperatorParser("["),
																	plus(getParser("Rule")),
																	getOperatorParser("]"))));
	}
	
	/**
	 * SeqNext ::= 'seq' Rule ('next' Rule)+ ('endseq')?
	 */
	private void createSeqNextParser() {
		createArrayParser("SeqNext", Parsers.array(	getKeywordParser("seq"),
													getParser("Rule"),
													plus(Parsers.array(	getKeywordParser("next"),
																		getParser("Rule"))),
													getKeywordParser("endseq").optional()));
	}
	
	/**
	 * Rule ::= ParBlock | SeqBlock | CaseRule | ChooseRule | ConditionalRule | ExtendRule | ForAllRule | ImportRule | IterateRule | LetRule | TurboReturnRule | WhileRule | UpdateRule | SkipRule | CallRule | LocalRule | PrintRule
	 */
	@SuppressWarnings("unchecked")
	private void createRuleParser() {
		createParser("Rule", Parsers.or(getParser("ParBlock"),
										getParser("SeqBlock"),
										getParser("SeqNext"),
										getParser("CaseRule"),
										getParser("ChooseRule"),
										getParser("ConditionalRule"),
										getParser("ExtendRule"),
										getParser("ForAllRule"),
										getParser("ImportRule"),
										getParser("IterateRule"),
										getParser("LetRule"),
										getParser("TurboReturnRule"),
										getParser("WhileRule"),
										getParser("UpdateRule"),
										getParser("SkipRule"),
										getParser("CallRule"),
										getParser("LocalRule"),
										getParser("PrintRule")));
	}
	
	/**
	 * CallRule ::= IdRule ('(' Term (',' Term)* ')')?
	 */
	private void createCallRuleParser() {
		createArrayParser("CallRule", Parsers.array(getParser("IdRule"),
													Parsers.array(	getOperatorParser("("),
																	csplus(getParser("Term")),
																	getOperatorParser(")")).optional()));
	}
	
	/**
	 * SkipRule ::= 'skip'
	 */
	private void createSkipRuleParser() {
		createParser("SkipRule", getKeywordParser("skip"));
	}
	
	/**
	 * UpdateRule ::= LocationTerm ':=' Term
	 */
	private void createUpdateRuleParser() {
		createArrayParser("UpdateRule", Parsers.array(	getParser("LocationTerm"),
														getOperatorParser(":="),
														getParser("Term")));
	}
	
	/**
	 * ConditionalRule ::= 'if' Term 'then' Rule ('else' Rule)?
	 */
	private void createConditionalRuleParser() {
		createArrayParser("ConditionalRule", Parsers.array(	getKeywordParser("if"),
															getParser("Term"),
															getKeywordParser("then"),
															getParser("Rule"),
															Parsers.array(	getKeywordParser("else"),
																			getParser("Rule")).optional(),
															getKeywordParser("endif").optional()));
	}
	
	/**
	 * CaseRule ::= 'case' Term 'of' (Term ':' Rule)+ ('otherwise' Rule)? 'endcase'
	 */
	private void createCaseRuleParser() {
		createArrayParser("CaseRule", Parsers.array(getKeywordParser("case"),
													getParser("Term"),
													getKeywordParser("of"),
													plus(Parsers.array(	getParser("Term"),
																		getOperatorParser(":"),
																		getParser("Rule"))),
													Parsers.array(	getKeywordParser("otherwise"),
																	getParser("Rule")).optional(),
													getKeywordParser("endcase")));
	}
	
	/**
	 * ChooseRule ::= 'choose' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? 'do' Rule ('ifnone' Rule)? 
	 */
	private void createChooseRuleParser() {
		createArrayParser("ChooseRule", Parsers.array(	getKeywordParser("choose"),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("EnumerableTerm"))),
														Parsers.array(	getKeywordParser("with"),
																		getParser("Term")).optional(),
														Parsers.array(	getKeywordParser("do"),
																		getParser("Rule")),
														Parsers.array(	getKeywordParser("ifnone"),
																		getParser("Rule")).optional()));
	}
	
	/**
	 * ForAllRule ::= 'forall' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? 'do' Rule ('ifnone' Rule)?
	 */
	private void createForAllRuleParser() {
		createArrayParser("ForAllRule", Parsers.array(	getKeywordParser("forall"),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("EnumerableTerm"))),
														Parsers.array(	getKeywordParser("with"),
																		getParser("Term")).optional(),
														Parsers.array(	getKeywordParser("do"),
																		getParser("Rule")),
														Parsers.array(	getKeywordParser("ifnone"),
																		getParser("Rule")).optional()));
	}
	
	/**
	 * LetRule ::= 'let' VariableTerm 'in' Term (',' VariableTerm '=' Term)* 'in' Rule
	 */
	private void createLetRuleParser() {
		createArrayParser("LetRule", Parsers.array(	getKeywordParser("let"),
													csplus(Parsers.array(	getParser("VariableTerm"),
																			getKeywordParser("="),
																			getParser("Term"))),
													getKeywordParser("in"),
													getParser("Rule")));
	}
	
	/**
	 * ExtendRule ::= 'extend' ExtendableDomain 'with' VariableTerm (',' VariableTerm)* ('as' VariableTerm)? 'do' Rule
	 */
	private void createExtendRuleParser() {
		createArrayParser("ExtendRule", Parsers.array(	getKeywordParser("extend"),
														getParser("ExtendableDomain"),
														getKeywordParser("with"),
														csplus(getParser("VariableTerm")),
														Parsers.array(	getKeywordParser("as"),
																		getParser("VariableTerm")).optional(),
														getKeywordParser("do"),
														getParser("Rule")));
	}
	
	/**
	 * ImportRule ::= 'import' VariableTerm 'do' Rule
	 */
	private void createImportRuleParser() {
		createArrayParser("ImportRule", Parsers.array(	getKeywordParser("import"),
														getParser("VariableTerm"),
														getKeywordParser("do"),
														getParser("Rule")));
	}
	
	/**
	 * IterateRule ::= 'iterate' Rule
	 */
	private void createIterateRuleParser() {
		createArrayParser("IterateRule", Parsers.array(	getKeywordParser("iterate"),
														getParser("Rule")));
	}
	
	/**
	 * WhileRule ::= 'while' Term 'do' Rule
	 */
	private void createWhileRuleParser() {
		createArrayParser("WhileRule", Parsers.array(	getKeywordParser("while"),
														getParser("Term"),
														getKeywordParser("do"),
														getParser("Rule")));
	}
	
	/**
	 * TurboReturnRule ::= LocationTerm '<-' Rule
	 */
	private void createTurboReturnRuleParser() {
		createArrayParser("TurboReturnRule", Parsers.array(	getParser("LocationTerm"),
															getOperatorParser("<-"),
															getParser("Rule")));
	}
	
	/**
	 * LocalRule ::= 'local' Id ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)? (',' Id ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?)* 'in' Rule
	 */
	private void createLocalRuleParser() {
		createArrayParser("LocalRule", Parsers.array(	getKeywordParser("local"),
														csplus(Parsers.array(	getIdParser(),
																				getParser("ParameterDefinition").optional(),
																				Parsers.array(	getOperatorParser("->"),
																								getParser("Domain")).optional(),
																				Parsers.array(	getKeywordParser("initially"),
																								getParser("InitialFunctionDefinition")).optional())),
														getKeywordParser("in"),
														getParser("Rule")));
	}
	
	/**
	 * PrintRule ::= 'print' Term
	 */
	private void createPrintRuleParser() {
		createArrayParser("PrintRule", Parsers.array(	getKeywordParser("print"),
														getParser("Term")));
	}
	
	/**
	 * BasicTerm ::= LocationTerm | ComprehensionTerm | StructureTerm | PickTerm | ConditionalTerm | CaseTerm | RuleAsTerm | ReturnTerm | ForAllTerm | ExistsTerm | SizeOfEnumerableTerm | NumberRangeTerm | Literal
	 */
	@SuppressWarnings("unchecked")
	private void createBasicTermParser() {
		createParser("BasicTerm", Parsers.or(	getParser("LocationTerm"),
												getParser("ComprehensionTerm"),
												getParser("StructureTerm"),
												getParser("PickTerm"),
												getParser("ConditionalTerm"),
												getParser("CaseTerm"),
												getParser("RuleAsTerm"),
												getParser("ReturnTerm"),
												getParser("ForAllTerm"),
												getParser("ExistsTerm"),
												getParser("SizeOfEnumerableTerm"),
												getParser("NumberRangeTerm"),
												getParser("Literal")));
	}
	
	/**
	 * FunctionTerm ::= IdFunction ('(' Term ')')?
	 */
	private void createFunctionTermParser() {
		createArrayParser("FunctionTerm", Parsers.array(getParser("IdFunction"),
														Parsers.array(	getOperatorParser("("),
																		csplus(getParser("Term")),
																		getOperatorParser(")")).optional()));
	}
	
	/**
	 * EnumTerm ::= Id
	 */
	private void createEnumTermParser() {
		createParser("EnumTerm", getIdParser());
	}
	
	/**
	 * EnumerableTerm ::= Term | Domain
	 */
	private void createEnumerableTermParser() {
		createParser("EnumerableTerm", Parsers.or(	getParser("Term"),
													getParser("Domain")));
	}
	
	/**
	 * VariableTerm ::= IdFunction
	 */
	private void createVariableTermParser() {
		createParser("VariableTerm", getParser("IdFunction"));
	}
	
	/**
	 * LocationTerm ::= FunctionTerm | 'result'
	 */
	private void createLocationTermParser() {
		createParser("LocationTerm", Parsers.or(getParser("FunctionTerm"),
												getKeywordParser("result")));
	}
	
	/**
	 * Term ::= BasicExpression BinaryOperator BasicExpression | UnaryOperator BasicExpression
	 * BasicExpression ::= BasicTerm | '(' Term ')'
	 */
	private void createTermParser() {
		OperatorTable<UASMNode> table = new OperatorTable<UASMNode>();
		for (Entry<String, Integer> entry : BINARY_OPERATORS.entrySet())
			table.infixl(createBinaryOperator(entry.getKey()), entry.getValue());
		for (Entry<String, Integer> entry : UNARY_OPERATORS.entrySet())
			table.prefix(createUnaryOperator(entry.getKey()), entry.getValue());
		parsers.put("BasicExpression", Parser.<UASMNode>newReference());
		createArrayParser("BasicExpression", Parsers.array(Parsers.or(	getParser("BasicTerm"),
																		Parsers.array(	getOperatorParser("("),
																						getParser("Term"),
																						getOperatorParser(")")))));
		createParser("Term", table.build(getParser("BasicExpression")));
	}
	
	private Parser<Binary<UASMNode>> createBinaryOperator(String operator) {
		return terminals.token(operator).retn(mapperProvider.getBinaryOperatorMapper(operator));
	}
	
	private Parser<Unary<UASMNode>> createUnaryOperator(String operator) {
		return terminals.token(operator).retn(mapperProvider.getUnaryOperatorMapper(operator));
	}
	
	/**
	 * Literal ::= NumberLiteral | BooleanLiteral | KernelLiteral | StringLiteral | CharLiteral | EnumTerm
	 */
	private void createLiteralParser() {
		createParser("Literal", Parsers.or(	getNumberParser(),
											getParser("BooleanLiteral"),
											getParser("KernelLiteral"),
											getStringParser(),
											getCharParser(),
											getParser("EnumTerm")));
	}
	
	/**
	 * BooleanLiteral ::= 'true' | 'false'
	 */
	private void createBooleanLiteralParser() {
		createParser("BooleanLiteral", Parsers.or(	getKeywordParser("true"),
													getKeywordParser("false")));
	}
	
	/**
	 * KernelLiteral ::= 'undef' | 'self'
	 */
	private void createKernelLiteralParser() {
		createParser("KernelLiteral", Parsers.or(	getKeywordParser("undef"),
													getKeywordParser("self")));
	}
	
	/**
	 * ForAllTerm ::= 'forall' VariableTerm 'in' Term (',' VariableTerm 'in' Term)* 'holds' Term
	 */
	private void createForAllTermParser() {
		createArrayParser("ForAllTerm", Parsers.array(	getKeywordParser("forall"),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("Term"))),
														getKeywordParser("holds"),
														getParser("Term")));
	}
	
	/**
	 * ExistsTerm ::= 'exists' 'unique'? VariableTerm 'in' Term (',' VariableTerm 'in' Term)* 'with' Term
	 */
	private void createExistsTermParser() {
		createArrayParser("ExistsTerm", Parsers.array(	getKeywordParser("exists"),
														getKeywordParser("unique").optional(),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("Term"))),
														getKeywordParser("with"),
														getParser("Term")));
	}
	
	/**
	 * SizeOfEnumerableTerm ::= '|' EnumerableTerm '|'
	 */
	private void createSizeOfEnumerableTermParser() {
		createArrayParser("SizeOfEnumerableTerm", Parsers.array(getOperatorParser("|"),
																getParser("EnumerableTerm"),
																getOperatorParser("|")));
	}
	
	/**
	 * PickTerm ::= 'pick' VariableTerm 'in' EnumerableTerm ('with' Term)?
	 */
	private void createPickTermParser() {
		createArrayParser("PickTerm", Parsers.array(getKeywordParser("pick"),
													getParser("VariableTerm"),
													getKeywordParser("in"),
													getParser("EnumerableTerm"),
													Parsers.array(	getKeywordParser("with"),
																	getParser("Term")).optional()));
	}
	
	/**
	 * ConditionalTerm ::= 'if' Term 'then' Term 'else' Term
	 */
	private void createConditionalTermParser() {
		createArrayParser("ConditionalTerm", Parsers.array(	getKeywordParser("if"),
																		getParser("Term"),
																		getKeywordParser("then"),
																		getParser("Term"),
																		getKeywordParser("else"),
																		getParser("Term")));
	}
	
	/**
	 * CaseTerm ::= 'case' Term 'of' (Term ':' Term)+ ('otherwise' Term)? 'endcase'
	 */
	private void createCaseTermParser() {
		createArrayParser("CaseTerm", Parsers.array(getKeywordParser("case"),
													getParser("Term"),
													getKeywordParser("of"),
													plus(Parsers.array(	getParser("Term"),
																		getOperatorParser(":"),
																		getParser("Term"))),
													Parsers.array(	getKeywordParser("otherwise"),
																	getParser("Term")).optional(),
													getKeywordParser("endcase")));
	}
	
	/**
	 * RuleAsTerm ::= '@' IdRule
	 */
	private void createRuleAsTermParser() {
		createArrayParser("RuleAsTerm", Parsers.array(	getOperatorParser("@"),
														getParser("IdRule")));
	}
	
	/**
	 * ReturnTerm ::= 'return' VariableTerm 'in' Rule
	 */
	private void createReturnTermParser() {
		createArrayParser("ReturnTerm", Parsers.array(	getKeywordParser("return"),
														getParser("VariableTerm"),
														getKeywordParser("in"),
														getParser("Rule")));
	}
	
	/**
	 * ComprehensionTerm ::= SetComprehensionTerm | ListComprehensionTerm | MapComprehensionTerm | BagComprehensionTerm
	 */
	private void createComprehensionTermParser() {
		createParser("ComprehensionTerm", Parsers.or(	getParser("SetComprehensionTerm"),
														getParser("ListComprehensionTerm"),
														getParser("MapComprehensionTerm"),
														getParser("BagComprehensionTerm")));
	}
	
	/**
	 * SetComprehensionTerm ::= '{' Term '|' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? '}'
	 */
	private void createSetComprehensionTermParser() {
		createArrayParser("SetComprehensionTerm", Parsers.array(getOperatorParser("{"),
																getParser("Term"),
																getOperatorParser("|"),
																csplus(Parsers.array(	getParser("VariableTerm"),
																						getKeywordParser("in"),
																						getParser("EnumerableTerm"))),
																Parsers.array(getKeywordParser("with"), getParser("Term")).optional(),
																getOperatorParser("}")));
	}
	
	/**
	 * ListComprehensionTerm ::= '[' Term '|' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? ']'
	 */
	private void createListComprehensionTermParser() {
		createArrayParser("ListComprehensionTerm", Parsers.array(	getOperatorParser("["),
																	getParser("Term"),
																	getOperatorParser("|"),
																	csplus(Parsers.array(	getParser("VariableTerm"),
																							getKeywordParser("in"),
																							getParser("EnumerableTerm"))),
																	Parsers.array(getKeywordParser("with"), getParser("Term")).optional(),
																	getOperatorParser("]")));
	}
	
	/**
	 * BagComprehensionTerm ::= '<' Term '|' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? '>'
	 */
	private void createBagComprehensionTermParser() {
		createArrayParser("BagComprehensionTerm", Parsers.array(getOperatorParser("<"),
																getParser("Term"),
																getOperatorParser("|"),
																csplus(Parsers.array(	getParser("VariableTerm"),
																						getKeywordParser("in"),
																						getParser("EnumerableTerm"))),
																Parsers.array(getKeywordParser("with"), getParser("Term")).optional(),
																getOperatorParser(">")));
	}
	
	/**
	 * MapComprehensionTerm ::= '{' Term '->' Term '|' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? '}'
	 */
	private void createMapComprehensionTermParser() {
		createArrayParser("MapComprehensionTerm", Parsers.array(getOperatorParser("{"),
																getParser("Term"),
																getOperatorParser("->"),
																getParser("Term"),
																getOperatorParser("|"),
																csplus(Parsers.array(	getParser("VariableTerm"),
																						getKeywordParser("in"),
																						getParser("EnumerableTerm"))),
																Parsers.array(getKeywordParser("with"), getParser("Term")).optional(),
																getOperatorParser("}")));
	}
	
	/**
	 * StructureTerm ::= SetTerm | ListTerm | BagTerm | MapTerm
	 */
	private void createStructureTermParser() {
		createParser("StructureTerm", Parsers.or(	getParser("SetTerm"),
													getParser("ListTerm"),
													getParser("BagTerm"),
													getParser("MapTerm")));
	}
	
	/**
	 * SetTerm ::= ('{' Term (',' Term)* '}') | ('{' '}') 
	 */
	private void createSetTermParser() {
		createArrayParser("SetTerm", Parsers.or(Parsers.array(	getOperatorParser("{"),
																csplus(getParser("Term")),
																getOperatorParser("}")),
																Parsers.array(	getOperatorParser("{"),
																				getOperatorParser("}"))));
	}
	
	/**
	 * ListTerm ::= ('[' Term (',' Term)* ']') | ('[' ']') 
	 */
	private void createListTermParser() {
		createArrayParser("ListTerm", Parsers.or(Parsers.array(	getOperatorParser("["),
																csplus(getParser("Term")),
																getOperatorParser("]")),
																Parsers.array(	getOperatorParser("["),
																				getOperatorParser("]"))));
	}
	
	/**
	 * SetTerm ::= ('<' Term (',' Term)* '>') | ('<' '>') 
	 */
	private void createBagTermParser() {
		createArrayParser("BagTerm", Parsers.or(Parsers.array(	getOperatorParser("<"),
																csplus(getParser("Term")),
																getOperatorParser(">")),
																Parsers.array(	getOperatorParser("<"),
																				getOperatorParser(">"))));
	}
	
	/**
	 * MapTerm ::= ('{' Term '->' Term (',' Term '->' Term)* '}') | ('{' '->' '}')
	 */
	private void createMapTermParser() {
		createArrayParser("MapTerm", Parsers.or(Parsers.array(	getOperatorParser("{"),
																csplus(Parsers.array(	getParser("Term"),
																						getOperatorParser("->"),
																						getParser("Term"))),
																getOperatorParser("}")),
												Parsers.array(	getOperatorParser("{"),
																getOperatorParser("->"),
																getOperatorParser("}"))));
	}
	
	/**
	 * NumberRangeTerm ::= '[' Term '..' Term ('step' Term)? ']'
	 */
	private void createNumberRangeTermParser() {
		createArrayParser("NumberRangeTerm", Parsers.array(	getOperatorParser("["),
															getParser("Term"),
															getOperatorParser(".."),
															getParser("Term"),
															Parsers.array(	getKeywordParser("step"),
																			getParser("Term")).optional(),
															getOperatorParser("]")));
	}
	
	/**
	 * IdDomain ::= Id
	 */
	private void createIdDomainParser() {
		createParser("IdDomain", getIdParser());
	}
	
	/**
	 * IdFunction ::= Id
	 */
	private void createIdFunctionParser() {
		createParser("IdFunction", getIdParser());
	}
	
	/**
	 * IdRule ::= Id
	 */
	private void createIdRuleParser() {
		createParser("IdRule", getIdParser());
	}
	
	/**
	 * Domain ::= StructuredDomain | BasicDomain | ExtendableDomain
	 */
	private void createDomainParser() {
		createParser("Domain", Parsers.or(	getParser("StructuredDomain"),
											getParser("BasicDomain"),
											getParser("ExtendableDomain")));
	}
	
	/**
	 * StructuredDomain ::= ('SET' ('(' Domain ')')?) | ('LIST' ('(' Domain ')')?) | ('MAP' ('(' Domain ')')?)
	 */
	private void createStructuredDomainParser() {
		createArrayParser("StructuredDomain", Parsers.or(	Parsers.array(	getKeywordParser("SET"),
																			Parsers.array(	getKeywordParser("("),
																							getParser("Domain"),
																							getKeywordParser(")")).optional()),
															Parsers.array(	getKeywordParser("LIST"),
																			Parsers.array(	getKeywordParser("("),
																							getParser("Domain"),
																							getKeywordParser(")")).optional()),
															Parsers.array(	getKeywordParser("MAP"),
																			Parsers.array(	getKeywordParser("("),
																							getParser("Domain"),
																							getKeywordParser(")")).optional())));
	}
	
	/**
	 * ExtendableDomain ::= 'ANY' | 'AGENT' | IdDomain
	 */
	private void createExtendableDomainParser() {
		createParser("ExtendableDomain", Parsers.or(getKeywordParser("ANY"),
													getKeywordParser("AGENT"),
													getParser("IdDomain")));
	}
	
	/**
	 * BasicDomain ::= 'NUMBER' | 'INTEGER' | 'STRING' | 'CHAR' | 'BOOLEAN' | 'RULE'
	 */
	private void createBasicDomainParser() {
		createParser("BasicDomain", Parsers.or(	getKeywordParser("NUMBER"),
												getKeywordParser("INTEGER"),
												getKeywordParser("STRING"),
												getKeywordParser("CHAR"),
												getKeywordParser("BOOLEAN"),
												getKeywordParser("RULE")));
	}
	
	private Parser<Object[]> csplus(Parser<? extends Object> parser) {
		return Parsers.array(parser, star(Parsers.array(getOperatorParser(","), parser)));
	}
	
	private Parser<Object[]> star(Parser<? extends Object> parser) {
		return parser.many().map(new Map<List<? extends Object>, Object[]>() {

			@Override
			public Object[] map(List<? extends Object> from) {
				return from.toArray();
			}
		});
	}
	
	private Parser<Object[]> plus(Parser<? extends Object> parser) {
		return parser.many1().map(new Map<List<? extends Object>, Object[]>() {

			@Override
			public Object[] map(List<? extends Object> from) {
				return from.toArray();
			}
		});
	}
	
	private void createArrayParser(String nonTerminal, Parser<Object[]> parser) {
		createParser(nonTerminal, parser.map(mapperProvider.getArrayMapper(nonTerminal)), false);
	}
	
	private void createParser(String nonTerminal, Parser<UASMNode> parser) {
		createParser(nonTerminal, parser, true);
	}
	
	private void createParser(String nonTerminal, Parser<UASMNode> parser, boolean shouldMap) {
		LinkedList<Parser<UASMNode>> parsers = new LinkedList<Parser<UASMNode>>();
		parsers.add(parser);
		parsers.addAll(getAdditionalParsers(nonTerminal));
		Parser.Reference<UASMNode> ref = this.parsers.get(nonTerminal);
		if (shouldMap && mapperProvider.getMapper(nonTerminal) != null)
			ref.set(Parsers.longest(parsers).map(mapperProvider.getMapper(nonTerminal)));
		else
			ref.set(Parsers.longest(parsers));
	}
	
	public void addParser(String nonTerminal, Parser<UASMNode> parser) {
		if (parsers != null)
			throw new IllegalStateException("Parsers have already been created. Parsers must be added before the first call of getParsers.");
		List<Parser<UASMNode>> parsers = additionalParsers.get(nonTerminal);
		if (parsers == null) {
			parsers = new LinkedList<Parser<UASMNode>>();
			additionalParsers.put(nonTerminal, parsers);
		}
		parsers.add(parser);
	}
	
	public Parser<UASMNode> getRootParser() {
		return getParser("Asm").from(tokenizer, Parsers.or(Scanners.JAVA_LINE_COMMENT, Scanners.JAVA_BLOCK_COMMENT, Scanners.WHITESPACES).skipMany());
	}
	
	public Parser<UASMNode> getIdParser() {
		if (idParser == null)
			idParser = Terminals.Identifier.PARSER.token().map(identifierMapper);
		return idParser;
	}
	
	private Parser<UASMNode> getStringParser() {
		if (stringParser == null)
			stringParser = Terminals.StringLiteral.PARSER.token().map(stringMapper);
		return stringParser;
	}
	
	private Parser<UASMNode> getCharParser() {
		if (charParser == null)
			charParser = Terminals.CharLiteral.PARSER.token().map(charMapper);
		return charParser;
	}
	
	public Parser<UASMNode> getNumberParser() {
		if (numberParser == null)
			numberParser = Terminals.fragment(Tag.DECIMAL).token().map(numberMapper);
		return numberParser;
	}
	
	public Parser<UASMNode> getOperatorParser(String token) {
		Parser<UASMNode> parser = operatorParsers.get(token);
		if (parser == null) {
			parser = terminals.token(token).map(operatorMapper);
			operatorParsers.put(token, parser);
		}
		return parser;
	}
	
	public Parser<UASMNode> getKeywordParser(String token) {
		Parser<UASMNode> parser = keywordParsers.get(token);
		if (parser == null) {
			parser = terminals.token(token).map(keywordMapper);
			keywordParsers.put(token, parser);
		}
		return parser;
	}
	
	public static void initialize(MapperProvider mapperProvider) {
		if (isInitialized())
			throw new IllegalStateException("The UASM Parsers have already been initialized.");
		instance = new UASMParsers(mapperProvider);
	}
	
	public static void initialize(MapperProvider mapperProvider, Set<String> keywords, Set<String> operators, Set<Parser<? extends Object>> lexers) {
		if (isInitialized())
			throw new IllegalStateException("The UASM Parsers have already been initialized.");
		instance = new UASMParsers(mapperProvider, keywords, operators, lexers);
	}
	
	public static boolean isInitialized() {
		return instance != null;
	}
	
	public static UASMParsers getInstance() {
		if (instance == null)
			throw new IllegalStateException("The UASM Parsers must be initialized before they can be used. Please call initialze.");
		return instance;
	}
}
