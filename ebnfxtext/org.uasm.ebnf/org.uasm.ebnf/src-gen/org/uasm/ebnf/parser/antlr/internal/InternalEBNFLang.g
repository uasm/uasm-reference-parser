/*
 * generated by Xtext 2.10.0
 */
grammar InternalEBNFLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.uasm.ebnf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.uasm.ebnf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uasm.ebnf.services.EBNFLangGrammarAccess;

}

@parser::members {

 	private EBNFLangGrammarAccess grammarAccess;

    public InternalEBNFLangParser(TokenStream input, EBNFLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EbnfGrammar";
   	}

   	@Override
   	protected EBNFLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEbnfGrammar
entryRuleEbnfGrammar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEbnfGrammarRule()); }
	iv_ruleEbnfGrammar=ruleEbnfGrammar
	{ $current=$iv_ruleEbnfGrammar.current; }
	EOF;

// Rule EbnfGrammar
ruleEbnfGrammar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0());
				}
				lv_rules_1_0=ruleProductionRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEbnfGrammarRule());
					}
					add(
						$current,
						"rules",
						lv_rules_1_0,
						"org.uasm.ebnf.EBNFLang.ProductionRule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProductionRule
entryRuleProductionRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductionRuleRule()); }
	iv_ruleProductionRule=ruleProductionRule
	{ $current=$iv_ruleProductionRule.current; }
	EOF;

// Rule ProductionRule
ruleProductionRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_NAME
				{
					newLeafNode(lv_name_0_0, grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProductionRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.uasm.ebnf.EBNFLang.NAME");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductionRuleRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.uasm.ebnf.EBNFLang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall());
	}
	this_Expression_Alternative_0=ruleExpression_Alternative
	{
		$current = $this_Expression_Alternative_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleExpression_Alternative
entryRuleExpression_Alternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_AlternativeRule()); }
	iv_ruleExpression_Alternative=ruleExpression_Alternative
	{ $current=$iv_ruleExpression_Alternative.current; }
	EOF;

// Rule Expression_Alternative
ruleExpression_Alternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0());
		}
		this_Expression_Concatenation_0=ruleExpression_Concatenation
		{
			$current = $this_Expression_Concatenation_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='|'
				{
					newLeafNode(otherlv_2, grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleExpression_Concatenation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpression_AlternativeRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.uasm.ebnf.EBNFLang.Expression_Concatenation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleExpression_Concatenation
entryRuleExpression_Concatenation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_ConcatenationRule()); }
	iv_ruleExpression_Concatenation=ruleExpression_Concatenation
	{ $current=$iv_ruleExpression_Concatenation.current; }
	EOF;

// Rule Expression_Concatenation
ruleExpression_Concatenation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0());
		}
		this_Expression_Exception_0=ruleExpression_Exception
		{
			$current = $this_Expression_Exception_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleExpression_Exception
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpression_ConcatenationRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.uasm.ebnf.EBNFLang.Expression_Exception");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleExpression_Exception
entryRuleExpression_Exception returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_ExceptionRule()); }
	iv_ruleExpression_Exception=ruleExpression_Exception
	{ $current=$iv_ruleExpression_Exception.current; }
	EOF;

// Rule Expression_Exception
ruleExpression_Exception returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0());
		}
		this_Expression_Repetition_0=ruleExpression_Repetition
		{
			$current = $this_Expression_Repetition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='-'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleExpression_Repetition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpression_ExceptionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.uasm.ebnf.EBNFLang.Expression_Repetition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpression_Repetition
entryRuleExpression_Repetition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_RepetitionRule()); }
	iv_ruleExpression_Repetition=ruleExpression_Repetition
	{ $current=$iv_ruleExpression_Repetition.current; }
	EOF;

// Rule Expression_Repetition
ruleExpression_Repetition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0());
		}
		this_Expression_Terminal_0=ruleExpression_Terminal
		{
			$current = $this_Expression_Terminal_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_repetitions_2_0=RULE_NUMBER
					{
						newLeafNode(lv_repetitions_2_0, grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpression_RepetitionRule());
						}
						setWithLastConsumed(
							$current,
							"repetitions",
							lv_repetitions_2_0,
							"org.uasm.ebnf.EBNFLang.NUMBER");
					}
				)
			)
			otherlv_3='*'
			{
				newLeafNode(otherlv_3, grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0());
					}
					lv_expr_4_0=ruleExpression_Terminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpression_RepetitionRule());
						}
						set(
							$current,
							"expr",
							lv_expr_4_0,
							"org.uasm.ebnf.EBNFLang.Expression_Terminal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleExpression_Terminal
entryRuleExpression_Terminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_TerminalRule()); }
	iv_ruleExpression_Terminal=ruleExpression_Terminal
	{ $current=$iv_ruleExpression_Terminal.current; }
	EOF;

// Rule Expression_Terminal
ruleExpression_Terminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0());
		}
		this_Expression_Rule_Reference_0=ruleExpression_Rule_Reference
		{
			$current = $this_Expression_Rule_Reference_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1());
		}
		this_Expression_Terminal_Symbol_1=ruleExpression_Terminal_Symbol
		{
			$current = $this_Expression_Terminal_Symbol_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2());
		}
		this_Expression_Repetition_Group_2=ruleExpression_Repetition_Group
		{
			$current = $this_Expression_Repetition_Group_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3());
		}
		this_Expression_Optional_Group_3=ruleExpression_Optional_Group
		{
			$current = $this_Expression_Optional_Group_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4());
		}
		this_Expression_Group_4=ruleExpression_Group
		{
			$current = $this_Expression_Group_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5());
		}
		this_Expression_Special_Sequence_5=ruleExpression_Special_Sequence
		{
			$current = $this_Expression_Special_Sequence_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExpression_Rule_Reference
entryRuleExpression_Rule_Reference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_Rule_ReferenceRule()); }
	iv_ruleExpression_Rule_Reference=ruleExpression_Rule_Reference
	{ $current=$iv_ruleExpression_Rule_Reference.current; }
	EOF;

// Rule Expression_Rule_Reference
ruleExpression_Rule_Reference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpression_Rule_ReferenceRule());
					}
				}
				otherlv_1=RULE_NAME
				{
					newLeafNode(otherlv_1, grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleExpression_Special_Sequence
entryRuleExpression_Special_Sequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_Special_SequenceRule()); }
	iv_ruleExpression_Special_Sequence=ruleExpression_Special_Sequence
	{ $current=$iv_ruleExpression_Special_Sequence.current; }
	EOF;

// Rule Expression_Special_Sequence
ruleExpression_Special_Sequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0(),
					$current);
			}
		)
		(
			(
				lv_text_1_0=RULE_SPECIAL_SEQUENCE
				{
					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpression_Special_SequenceRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_1_0,
						"org.uasm.ebnf.EBNFLang.SPECIAL_SEQUENCE");
				}
			)
		)
	)
;

// Entry rule entryRuleExpression_Terminal_Symbol
entryRuleExpression_Terminal_Symbol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_Terminal_SymbolRule()); }
	iv_ruleExpression_Terminal_Symbol=ruleExpression_Terminal_Symbol
	{ $current=$iv_ruleExpression_Terminal_Symbol.current; }
	EOF;

// Rule Expression_Terminal_Symbol
ruleExpression_Terminal_Symbol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0(),
					$current);
			}
		)
		(
			(
				lv_text_1_0=RULE_TERMINAL_SYMBOL
				{
					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpression_Terminal_SymbolRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_1_0,
						"org.uasm.ebnf.EBNFLang.TERMINAL_SYMBOL");
				}
			)
		)
	)
;

// Entry rule entryRuleExpression_Repetition_Group
entryRuleExpression_Repetition_Group returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_Repetition_GroupRule()); }
	iv_ruleExpression_Repetition_Group=ruleExpression_Repetition_Group
	{ $current=$iv_ruleExpression_Repetition_Group.current; }
	EOF;

// Rule Expression_Repetition_Group
ruleExpression_Repetition_Group returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpression_Repetition_GroupRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.uasm.ebnf.EBNFLang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3());
		}
		(
			(
				lv_atLeastOne_4_0='-'
				{
					newLeafNode(lv_atLeastOne_4_0, grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpression_Repetition_GroupRule());
					}
					setWithLastConsumed($current, "atLeastOne", true, "-");
				}
			)
		)?
	)
;

// Entry rule entryRuleExpression_Optional_Group
entryRuleExpression_Optional_Group returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_Optional_GroupRule()); }
	iv_ruleExpression_Optional_Group=ruleExpression_Optional_Group
	{ $current=$iv_ruleExpression_Optional_Group.current; }
	EOF;

// Rule Expression_Optional_Group
ruleExpression_Optional_Group returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpression_Optional_GroupRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.uasm.ebnf.EBNFLang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleExpression_Group
entryRuleExpression_Group returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_GroupRule()); }
	iv_ruleExpression_Group=ruleExpression_Group
	{ $current=$iv_ruleExpression_Group.current; }
	EOF;

// Rule Expression_Group
ruleExpression_Group returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpression_GroupRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.uasm.ebnf.EBNFLang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3());
		}
	)
;

RULE_COMMENT : '(*' ( options {greedy=false;} : . )*'*)';

RULE_NUMBER : '1'..'9' ('0'..'9')*;

RULE_NAME : ('a'..'z'|'A'..'Z'|'_')+;

RULE_TERMINAL_SYMBOL : ('"' ~('"')+ '"'|'\'' ~('\'')+ '\'');

RULE_SPECIAL_SEQUENCE : '?' ~('?')+ '?';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
