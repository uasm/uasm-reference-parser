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

/**
 * The implementation of the UASM Parsers as described by the UASM team.
 * @author Michael
 *
 * @param <N>
 */
public final class UASMParsers<N> {
	

	// production rule names
	public static final String ASM = "Asm";
	public static final String HEADER = "Header";
	public static final String USE_DIRECTIVE = "UseDirective";
	public static final String IMPORT_DIRECTIVE = "ImportDirective";
	public static final String EXPORT_DIRECTIVE = "ExportDirective";
	public static final String BODY = "Body";
	public static final String DEFINITION = "Definition";
	public static final String TYPE_DEFINITION = "TypeDefinition";
	public static final String DOMAIN_DEFINITION = "DomainDefinition";
	public static final String INITIAL_DOMAIN_DEFINITION = "InitialDomainDefinition";
	public static final String RULE_DEFINITION = "RuleDefinition";
	public static final String FUNCTION_DEFINITION = "FunctionDefinition";
	public static final String ENUMERATE_DEFINITION = "EnumerateDefinition";
	public static final String CONTROLLED_FUNCTION = "ControlledFunction";
	public static final String EXTENDABLE_DOMAIN = "ExtendableDomain";
	public static final String RULE = "Rule";
	public static final String UPDATE_RULE = "UpdateRule";
	public static final String PAR_BLOCK_RULE = "ParBlock";
	public static final String BASIC_DOMAIN = "BasicDomain";
	private static final String STRING_LITERAL = "StringLiteral";
	private static final String CHAR_LITERAL = "CharLiteral";
	private static final String NUMBER_LITERAL = "NumberLiteral";
	
	// keywords
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
			"choose", "with", "do", "ifnone", "endchoose",
			"forall", "endforall",
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
		LEXERS.add(Scanners.pattern(floatParser, "NUMBER").source().map(new Map<String,Fragment>() {
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
	/*
	 * Precedences taken from http://fmse.di.unimi.it/asmeta/download/AsmetaL_quickguide.html but
	 * modified to reflect correct precedence of the power operator "^"
	 */
	static {
		BINARY_OPERATORS.put("^", 9);
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
		
		UNARY_OPERATORS.put("+", 8);
		UNARY_OPERATORS.put("-", 8);
		UNARY_OPERATORS.put("not", 3);
	}
	private final ParseMapProvider<N> mapperProvider;
	private final Map<Token, N> identifierMapper;
	private final Map<Token, N> keywordMapper;
	private final Map<Token, N> operatorMapper;
	private final Map<Token, N> stringMapper;
	private final Map<Token, N> charMapper;
	private final Map<Token, N> numberMapper;
	private final Terminals terminals;
	private final Parser<Object> tokenizer;
	private final Parser<Void> delimiter = Parsers.or(Scanners.JAVA_LINE_COMMENT, Scanners.JAVA_BLOCK_COMMENT, Scanners.WHITESPACES).skipMany();
	private Parser<N> idParser;
	private Parser<N> stringParser;
	private Parser<N> numberParser;
	private Parser<N> charParser;
	private HashMap<String, Parser<N>> keywordParsers = new HashMap<String, Parser<N>>();
	private HashMap<String, Parser<N>> operatorParsers = new HashMap<String, Parser<N>>();
	private HashMap<String, List<Parser<N>>> additionalParsers = new HashMap<String, List<Parser<N>>>();
	private HashMap<String, Parser.Reference<N>> parsers;
	
	public UASMParsers(ParseMapProvider<N> mapperProvider) {
		this(mapperProvider, null, null, null);
	}
	
	public UASMParsers(ParseMapProvider<N> mapperProvider, Set<String> additionalKeywords, Set<String> additionalOperators, Set<Parser<? extends Object>> additionalLexers) {
		if (mapperProvider == null)
			throw new NullPointerException("The argument 'mapperProvider' must not be null.");
		if (mapperProvider.getIdentifierMap() == null)
			throw new NullPointerException("The IdentifierMapper must not be null.");
		if (mapperProvider.getKeywordMap() == null)
			throw new NullPointerException("The KeywordMapper must not be null.");
		if (mapperProvider.getOperatorMap() == null)
			throw new NullPointerException("The OperatorMapper must not be null.");
		if (mapperProvider.getStringMap() == null)
			throw new NullPointerException("The StringMapper must not be null.");
		if (mapperProvider.getStringMap() == null)
			throw new NullPointerException("The CharMapper must not be null.");
		if (mapperProvider.getNumberMap() == null)
			throw new NullPointerException("The NumberMapper must not be null.");
		
		if (additionalKeywords != null)
			KEYWORDS.addAll(additionalKeywords);
		if (additionalOperators != null)
			OPERATORS.addAll(additionalOperators);
		if (additionalLexers != null)
			LEXERS.addAll(additionalLexers);
		
		this.mapperProvider = mapperProvider;
		this.identifierMapper = mapperProvider.getIdentifierMap();
		this.keywordMapper = mapperProvider.getKeywordMap();
		this.operatorMapper = mapperProvider.getOperatorMap();
		this.stringMapper = mapperProvider.getStringMap();
		this.charMapper = mapperProvider.getCharMap();
		this.numberMapper = mapperProvider.getNumberMap();
		
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
	
	public Collection<String> getDefaultKeywords() {
		return Collections.unmodifiableCollection(KEYWORDS);
	}
	
	public Collection<String> getDefaultOperators() {
		return Collections.unmodifiableCollection(OPERATORS);
	}
	
	public Collection<Parser<? extends Object>> getDefaultLexers() {
		return Collections.unmodifiableCollection(LEXERS);
	}
	
	public Parser<N> getParser(String nonTerminal) {
		if (parsers == null)
			parsers = new HashMap<String, Parser.Reference<N>>();
		Parser.Reference<N> parserRef = parsers.get(nonTerminal);
		if (parserRef == null) {
			parserRef = Parser.newReference();
			parsers.put(nonTerminal, parserRef);
			if (ASM.equals(nonTerminal))
				createAsmParser();
			else if (HEADER.equals(nonTerminal))
				createHeaderParser();
			else if (USE_DIRECTIVE.equals(nonTerminal))
				createUseDirectiveParser();
			else if (IMPORT_DIRECTIVE.equals(nonTerminal))
				createImportDirectiveParser();
			else if (EXPORT_DIRECTIVE.equals(nonTerminal))
				createExportDirectiveParser();
			else if (BODY.equals(nonTerminal))
				createBodyParser();
			else if (DEFINITION.equals(nonTerminal))
				createDefinitionParser();
			else if (TYPE_DEFINITION.equals(nonTerminal))
				createTypeDefinitionParser();
			else if (DOMAIN_DEFINITION.equals(nonTerminal))
				createDomainDefinitionParser();
			else if (INITIAL_DOMAIN_DEFINITION.equals(nonTerminal))
				createInitialDomainDefinitionParser();
			else if (ENUMERATE_DEFINITION.equals(nonTerminal))
				createEnumerateDefinitionParser();
			else if ("DomainParameterDefinition".equals(nonTerminal))
				createDomainParameterDefinitionParser();
			else if ("ParameterDefinition".equals(nonTerminal))
				createParameterDefinitionParser();
			else if (CONTROLLED_FUNCTION.equals(nonTerminal))
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
			else if (FUNCTION_DEFINITION.equals(nonTerminal))
				createFunctionDefinitionParser();
			else if (RULE_DEFINITION.equals(nonTerminal))
				createRuleDefinitionParser();
			else if (PAR_BLOCK_RULE.equals(nonTerminal))
				createParBlockParser();
			else if ("SeqBlock".equals(nonTerminal))
				createSeqBlockParser();
			else if ("SeqNext".equals(nonTerminal))
				createSeqNextParser();
			else if (RULE.equals(nonTerminal))
				createRuleParser();
			else if ("CallRule".equals(nonTerminal))
				createCallRuleParser();
			else if ("SkipRule".equals(nonTerminal))
				createSkipRuleParser();
			else if (UPDATE_RULE.equals(nonTerminal))
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
			else if (EXTENDABLE_DOMAIN.equals(nonTerminal))
				createExtendableDomainParser();
			else if (BASIC_DOMAIN.equals(nonTerminal))
				createBasicDomainParser();
			else {
				parsers.remove(nonTerminal);
				if ("Id".equals(nonTerminal))
					return getIdParser();
				else if (STRING_LITERAL.equals(nonTerminal))
					return getStringParser();
				else if (CHAR_LITERAL.equals(nonTerminal))
					return getCharParser();
				else if (NUMBER_LITERAL.equals(nonTerminal))
					return getNumberParser();
				throw new IllegalArgumentException("Unknown parser requested: '" + nonTerminal + "'");
			}
		}
		return parsers.get(nonTerminal).lazy();
	}
	
	private List<Parser<N>> getAdditionalParsers(String nonTerminal) {
		List<Parser<N>> parsers = additionalParsers.get(nonTerminal);
		if (parsers == null)
			parsers = Collections.emptyList();
		return parsers;
	}
	
	/**
	 * Asm ::= ('asm' | 'asmmodule') Id Header Body
	 */
	private void createAsmParser() {
		createArrayParser(ASM, Parsers.array(	Parsers.or(	getKeywordParser("asm"),
															getKeywordParser("asmmodule")),
												getParser("Id"),
												getParser(HEADER),
												getParser(BODY)));
	}
	
	/**
	 * Header ::= (UseDirective | ImportDirective | ExportDirective)*
	 */
	private void createHeaderParser() {
		createArrayParser(HEADER, Parsers.array(star(Parsers.or(	getParser(USE_DIRECTIVE),
																	getParser(IMPORT_DIRECTIVE),
																	getParser(EXPORT_DIRECTIVE)))));
	}
	
	/**
	 * UseDirective ::= 'use' Id
	 */
	private void createUseDirectiveParser() {
		createArrayParser(USE_DIRECTIVE, Parsers.array(getKeywordParser("use"),
														getParser("Id")));
	}
	
	/**
	 * ImportDirective ::= 'import' Id ('(' (IdDomain | IdFunction | IdRule) (',' (IdDomain | IdFunction | IdRule))* ')')?
	 */
	private void createImportDirectiveParser() {
		createArrayParser(IMPORT_DIRECTIVE, Parsers.array(	getKeywordParser("import"),
															getParser("Id"),
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
		createArrayParser(EXPORT_DIRECTIVE, Parsers.array(	getKeywordParser("export"),
															getParser("Id"),
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
		createArrayParser(BODY,	Parsers.array(	star(getParser(DEFINITION)),
													Parsers.array(	getKeywordParser("exec"),
																	getParser("IdRule")).optional()));
	}
	
	/**
	 * Definition ::= TypeDefinition | FunctionDefinition | RuleDefinition
	 */
	private void createDefinitionParser() {
		createParser(DEFINITION, Parsers.or(	getParser(TYPE_DEFINITION),
												getParser(FUNCTION_DEFINITION),
												getParser(RULE_DEFINITION)));
	}
	
	/**
	 * TypeDefinition ::= DomainDefinition | EnumerateDefinition
	 */
	private void createTypeDefinitionParser() {
		createParser(TYPE_DEFINITION, Parsers.or(	getParser(DOMAIN_DEFINITION),
													getParser(ENUMERATE_DEFINITION)));
	}
	
	/**
	 * DomainDefinition ::= 'domain' IdDomain | ('of' DomainParameterDefinition)? InitialDomainDefinition?
	 */
	private void createDomainDefinitionParser() {
		createArrayParser(DOMAIN_DEFINITION, Parsers.array(	getKeywordParser("domain"),
																getParser("IdDomain"),
																Parsers.array(	getKeywordParser("of"),
																				getParser("DomainParameterDefinition")).optional(),
																getParser(INITIAL_DOMAIN_DEFINITION).optional()));
	}
	
	/**
	 * InitialDomainDefinition ::= 'initially' '{' Literal (',' Literal)* '}'
	 */
	private void createInitialDomainDefinitionParser() {
		createArrayParser(INITIAL_DOMAIN_DEFINITION, Parsers.array(	getKeywordParser("initially"),
																	getOperatorParser("{"),
																	csplus(getParser("Literal")),
																	getOperatorParser("}")));
	}
	
	/**
	 * EnumerateDefinition ::= 'enum' Id '=' '{' EnumTerm (',' EnumTerm)* '}'
	 */
	private void createEnumerateDefinitionParser() {
		createArrayParser(ENUMERATE_DEFINITION, Parsers.array(	getKeywordParser("enum"),
																getParser("Id"),
																getOperatorParser("="),
																getOperatorParser("{"),
																csplus(getParser("EnumTerm")),
																getOperatorParser("}")));
	}
	
	/**
	 * DomainParameterDefinition ::= Domain | ParameterDefinition
	 */
	private void createDomainParameterDefinitionParser() {
		createParser("DomainParameterDefinition", Parsers.or(	getParser("Domain"),
																getParser("ParameterDefinition")));
	}
	
	/**
	 * ParameterDefinition ::= '(' (Id 'in' Domain | Id | Domain) (',' (Id 'in' Domain | Id | Domain))* ')'
	 */
	private void createParameterDefinitionParser() {
		createArrayParser("ParameterDefinition", Parsers.array(	getOperatorParser("("),
																csplus(Parsers.or(	Parsers.array(	getParser("Id"),
																									getKeywordParser("in"),
																									getParser("Domain")),
																					getParser("Id"),
																					getParser("Domain"))),
																getOperatorParser(")")));
	}
	
	/**
	 * ControlledFunction ::= ('controlled' | 'function' | 'controlled function') IdFunction ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?
	 */
	private void createControlledFunctionParser() {
		createArrayParser(CONTROLLED_FUNCTION, Parsers.array(	Parsers.or(	getKeywordParser("controlled"),
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
		createParser(FUNCTION_DEFINITION, Parsers.or(	getParser(CONTROLLED_FUNCTION),
														getParser("StaticFunction"),
														getParser("DerivedFunction"),
														getParser("MonitoredFunction"),
														getParser("SharedFunction"),
														getParser("OutFunction")));
	}
	
	/**
	 * RuleDefinition ::= 'rule' IdRule ParameterDefinition? '=' Rule
	 */
	private void createRuleDefinitionParser() {
		createArrayParser(RULE_DEFINITION, Parsers.array(	getKeywordParser("rule"),
															getParser("IdRule"),
															getParser("ParameterDefinition").optional(),
															getOperatorParser("="),
															getParser(RULE)));
	}
	
	/**
	 * ParBlock ::= 'par' Rule+ 'endpar' | '{' Rule+ '}'
	 */
	private void createParBlockParser() {
		createArrayParser(PAR_BLOCK_RULE, Parsers.or(	Parsers.array(	getKeywordParser("par"),
																	plus(getParser(RULE)),
																	getKeywordParser("endpar")),
													Parsers.array(	getOperatorParser("{"),
																	plus(getParser(RULE)),
																	getOperatorParser("}"))));
	}
	
	/**
	 * SeqBlock ::= 'seq' Rule+ 'endseq' | '[' Rule+ ']'
	 */
	private void createSeqBlockParser() {
		createArrayParser("SeqBlock", Parsers.or(	Parsers.array(	getKeywordParser("seq"),
																	plus(getParser(RULE)),
																	getKeywordParser("endseq")),
													Parsers.array(	getOperatorParser("["),
																	plus(getParser(RULE)),
																	getOperatorParser("]"))));
	}
	
	/**
	 * SeqNext ::= 'seq' Rule ('next' Rule)+ ('endseq')?
	 */
	private void createSeqNextParser() {
		createArrayParser("SeqNext", Parsers.array(	getKeywordParser("seq"),
													getParser(RULE),
													plus(Parsers.array(	getKeywordParser("next"),
																		getParser(RULE))),
													getKeywordParser("endseq").optional()));
	}
	
	/**
	 * Rule ::= ParBlock | SeqBlock | CaseRule | ChooseRule | ConditionalRule | ExtendRule | ForAllRule | ImportRule | IterateRule | LetRule | TurboReturnRule | WhileRule | UpdateRule | SkipRule | CallRule | LocalRule | PrintRule
	 */
	@SuppressWarnings("unchecked")
	private void createRuleParser() {
		createParser(RULE, Parsers.or(getParser(PAR_BLOCK_RULE),
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
										getParser(UPDATE_RULE),
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
		createArrayParser(UPDATE_RULE, Parsers.array(	getParser("LocationTerm"),
														getOperatorParser(":="),
														getParser("Term")));
	}
	
	/**
	 * ConditionalRule ::= 'if' Term 'then' Rule ('else' Rule)? 'endif'?
	 */
	private void createConditionalRuleParser() {
		createArrayParser("ConditionalRule", Parsers.array(	getKeywordParser("if"),
															getParser("Term"),
															getKeywordParser("then"),
															getParser(RULE),
															Parsers.array(	getKeywordParser("else"),
																			getParser(RULE)).optional(),
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
																		getParser(RULE))),
													Parsers.array(	getKeywordParser("otherwise"),
																	getParser(RULE)).optional(),
													getKeywordParser("endcase")));
	}
	
	/**
	 * ChooseRule ::= 'choose' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? 'do' Rule ('ifnone' Rule)? 'endchoose'?
	 */
	private void createChooseRuleParser() {
		createArrayParser("ChooseRule", Parsers.array(	getKeywordParser("choose"),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("EnumerableTerm"))),
														Parsers.array(	getKeywordParser("with"),
																		getParser("Term")).optional(),
														Parsers.array(	getKeywordParser("do"),
																		getParser(RULE)),
														Parsers.array(	getKeywordParser("ifnone"),
																		getParser(RULE)).optional(),
														getKeywordParser("endchoose").optional()));
	}
	
	/**
	 * ForAllRule ::= 'forall' VariableTerm 'in' EnumerableTerm (',' VariableTerm 'in' EnumerableTerm)* ('with' Term)? 'do' Rule ('ifnone' Rule)? 'endforall'?
	 */
	private void createForAllRuleParser() {
		createArrayParser("ForAllRule", Parsers.array(	getKeywordParser("forall"),
														csplus(Parsers.array(	getParser("VariableTerm"),
																				getKeywordParser("in"),
																				getParser("EnumerableTerm"))),
														Parsers.array(	getKeywordParser("with"),
																		getParser("Term")).optional(),
														Parsers.array(	getKeywordParser("do"),
																		getParser(RULE)),
														Parsers.array(	getKeywordParser("ifnone"),
																		getParser(RULE)).optional(),
														getKeywordParser("endforall").optional()));
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
													getParser(RULE)));
	}
	
	/**
	 * ExtendRule ::= 'extend' ExtendableDomain 'with' VariableTerm (',' VariableTerm)* ('as' VariableTerm)? 'do' Rule
	 */
	private void createExtendRuleParser() {
		createArrayParser("ExtendRule", Parsers.array(	getKeywordParser("extend"),
														getParser(EXTENDABLE_DOMAIN),
														getKeywordParser("with"),
														csplus(getParser("VariableTerm")),
														Parsers.array(	getKeywordParser("as"),
																		getParser("VariableTerm")).optional(),
														getKeywordParser("do"),
														getParser(RULE)));
	}
	
	/**
	 * ImportRule ::= 'import' VariableTerm 'do' Rule
	 */
	private void createImportRuleParser() {
		createArrayParser("ImportRule", Parsers.array(	getKeywordParser("import"),
														getParser("VariableTerm"),
														getKeywordParser("do"),
														getParser(RULE)));
	}
	
	/**
	 * IterateRule ::= 'iterate' Rule
	 */
	private void createIterateRuleParser() {
		createArrayParser("IterateRule", Parsers.array(	getKeywordParser("iterate"),
														getParser(RULE)));
	}
	
	/**
	 * WhileRule ::= 'while' Term 'do' Rule
	 */
	private void createWhileRuleParser() {
		createArrayParser("WhileRule", Parsers.array(	getKeywordParser("while"),
														getParser("Term"),
														getKeywordParser("do"),
														getParser(RULE)));
	}
	
	/**
	 * TurboReturnRule ::= LocationTerm '<-' Rule
	 */
	private void createTurboReturnRuleParser() {
		createArrayParser("TurboReturnRule", Parsers.array(	getParser("LocationTerm"),
															getOperatorParser("<-"),
															getParser(RULE)));
	}
	
	/**
	 * LocalRule ::= 'local' Id ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)? (',' Id ParameterDefinition? ('->' Domain)? ('initially' InitialFunctionDefinition)?)* 'in' Rule
	 */
	private void createLocalRuleParser() {
		createArrayParser("LocalRule", Parsers.array(	getKeywordParser("local"),
														csplus(Parsers.array(	getParser("Id"),
																				getParser("ParameterDefinition").optional(),
																				Parsers.array(	getOperatorParser("->"),
																								getParser("Domain")).optional(),
																				Parsers.array(	getKeywordParser("initially"),
																								getParser("InitialFunctionDefinition")).optional())),
														getKeywordParser("in"),
														getParser(RULE)));
	}
	
	/**
	 * PrintRule ::= 'print' Term
	 */
	private void createPrintRuleParser() {
		createArrayParser("PrintRule", Parsers.array(	getKeywordParser("print"),
														getParser("Term")));
	}
	
	/**
	 * BasicTerm ::= LocationTerm | ComprehensionTerm | StructureTerm | PickTerm | ConditionalTerm | CaseTerm | RuleAsTerm | ReturnTerm | ForAllTerm | ExistsTerm | SizeOfEnumerableTerm | Literal
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
		createParser("EnumTerm", getParser("Id"));
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
	 * Term ::= BasicExpression | BasicExpression BinaryOperator BasicExpression | UnaryOperator BasicExpression
	 * BasicExpression ::= BasicTerm | '(' Term ')'
	 */
	private void createTermParser() {
		OperatorTable<N> table = new OperatorTable<N>();
		for (Entry<String, Integer> entry : BINARY_OPERATORS.entrySet())
			table.infixl(createBinaryOperator(entry.getKey()), entry.getValue());
		for (Entry<String, Integer> entry : UNARY_OPERATORS.entrySet())
			table.prefix(createUnaryOperator(entry.getKey()), entry.getValue());
		parsers.put("BasicExpression", Parser.<N>newReference());
		createArrayParser("BasicExpression", Parsers.array(Parsers.or(	getParser("BasicTerm"),
																		Parsers.array(	getOperatorParser("("),
																						getParser("Term"),
																						getOperatorParser(")")))));
		createParser("Term", table.build(getParser("BasicExpression")));
	}
	
	private Parser<Binary<N>> createBinaryOperator(String operator) {
		Binary<N> operatorMap = mapperProvider.getBinaryOperatorMap(operator);
		if (operatorMap == null)
			throw new NullPointerException("An operator map must not be null. The operator map for '" + operator + "' was null.");
		return terminals.token(operator).retn(operatorMap);
	}
	
	private Parser<Unary<N>> createUnaryOperator(String operator) {
		Unary<N> operatorMap = mapperProvider.getUnaryOperatorMap(operator);
		if (operatorMap == null)
			throw new NullPointerException("An operator map must not be null. The operator map for '" + operator + "' was null.");
		return terminals.token(operator).retn(operatorMap);
	}
	
	/**
	 * Literal ::= NumberLiteral | BooleanLiteral | KernelLiteral | StringLiteral | CharLiteral | EnumTerm
	 */
	private void createLiteralParser() {
		createParser("Literal", Parsers.or(	getParser(NUMBER_LITERAL),
											getParser("BooleanLiteral"),
											getParser("KernelLiteral"),
											getParser(STRING_LITERAL),
											getParser(CHAR_LITERAL),
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
	 * ReturnTerm ::= 'return' Term 'in' Rule
	 */
	private void createReturnTermParser() {
		createArrayParser("ReturnTerm", Parsers.array(	getKeywordParser("return"),
														getParser("Term"),
														getKeywordParser("in"),
														getParser(RULE)));
	}
	
	/**
	 * ComprehensionTerm ::= SetComprehensionTerm | ListComprehensionTerm | MapComprehensionTerm | BagComprehensionTerm | NumberRangeTerm
	 */
	private void createComprehensionTermParser() {
		createParser("ComprehensionTerm", Parsers.or(	getParser("SetComprehensionTerm"),
														getParser("ListComprehensionTerm"),
														getParser("MapComprehensionTerm"),
														getParser("BagComprehensionTerm"),
														getParser("NumberRangeTerm")));
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
		createParser("IdDomain", getParser("Id"));
	}
	
	/**
	 * IdFunction ::= Id
	 */
	private void createIdFunctionParser() {
		createParser("IdFunction", getParser("Id"));
	}
	
	/**
	 * IdRule ::= Id
	 */
	private void createIdRuleParser() {
		createParser("IdRule", getParser("Id"));
	}
	
	/**
	 * Domain ::= StructuredDomain | BasicDomain | ExtendableDomain
	 */
	private void createDomainParser() {
		createParser("Domain", Parsers.or(	getParser("StructuredDomain"),
											getParser(BASIC_DOMAIN),
											getParser(EXTENDABLE_DOMAIN)));
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
		createParser(EXTENDABLE_DOMAIN, Parsers.or(getKeywordParser("ANY"),
													getKeywordParser("AGENT"),
													getParser("IdDomain")));
	}
	
	/**
	 * BasicDomain ::= 'NUMBER' | 'INTEGER' | 'STRING' | 'CHAR' | 'BOOLEAN' | 'RULE'
	 */
	private void createBasicDomainParser() {
		createParser(BASIC_DOMAIN, Parsers.or(	getKeywordParser("NUMBER"),
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
		Map<Object[], N> arrayMap = mapperProvider.getArrayMap(nonTerminal);
		if (arrayMap == null)
			throw new NullPointerException("An array map must not be null. The array map for '" + nonTerminal + "' was null.");
		createParser(nonTerminal, parser.map(arrayMap), false);
	}
	
	private void createParser(String nonTerminal, Parser<N> parser) {
		createParser(nonTerminal, parser, true);
	}
	
	private void createParser(String nonTerminal, Parser<N> parser, boolean shouldMap) {
		LinkedList<Parser<N>> parsers = new LinkedList<Parser<N>>();
		parsers.add(parser);
		parsers.addAll(getAdditionalParsers(nonTerminal));
		Parser.Reference<N> ref = this.parsers.get(nonTerminal);
		if (shouldMap && mapperProvider.getNodeMap(nonTerminal) != null)
			ref.set(Parsers.longest(parsers).map(mapperProvider.getNodeMap(nonTerminal)));
		else
			ref.set(Parsers.longest(parsers));
	}
	
	public void addParser(String nonTerminal, Parser<N> parser) {
		if (parsers != null)
			throw new IllegalStateException("Parsers have already been created. Parsers must be added before the first call of getParsers.");
		List<Parser<N>> parsers = additionalParsers.get(nonTerminal);
		if (parsers == null) {
			parsers = new LinkedList<Parser<N>>();
			additionalParsers.put(nonTerminal, parsers);
		}
		parsers.add(parser);
	}
	/** return the parser for the main ASM*/
	public Parser<N> getRootParser() {
		return getParser(ASM).from(getTokenizer(), getDelimiter());
	}
	
	public Parser<Object> getTokenizer() {
		return tokenizer;
	}
	
	public Parser<Void> getDelimiter() {
		return delimiter;
	}
	
	private Parser<N> getIdParser() {
		if (idParser == null)
			idParser = Terminals.Identifier.PARSER.token().map(identifierMapper);
		return idParser;
	}
	
	private Parser<N> getStringParser() {
		if (stringParser == null)
			stringParser = Terminals.StringLiteral.PARSER.token().map(stringMapper);
		return stringParser;
	}
	
	private Parser<N> getCharParser() {
		if (charParser == null)
			charParser = Terminals.CharLiteral.PARSER.token().map(charMapper);
		return charParser;
	}
	
	private Parser<N> getNumberParser() {
		if (numberParser == null)
			numberParser = Terminals.fragment(Tag.DECIMAL).token().map(numberMapper);
		return numberParser;
	}
	
	private Parser<N> getOperatorParser(String token) {
		Parser<N> parser = operatorParsers.get(token);
		if (parser == null) {
			parser = terminals.token(token).map(operatorMapper);
			operatorParsers.put(token, parser);
		}
		return parser;
	}
	
	private Parser<N> getKeywordParser(String token) {
		Parser<N> parser = keywordParsers.get(token);
		if (parser == null) {
			parser = terminals.token(token).map(keywordMapper);
			keywordParsers.put(token, parser);
		}
		return parser;
	}
}
