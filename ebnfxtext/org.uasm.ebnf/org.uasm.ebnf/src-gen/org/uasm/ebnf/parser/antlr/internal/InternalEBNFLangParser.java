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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEBNFLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_NUMBER", "RULE_SPECIAL_SEQUENCE", "RULE_TERMINAL_SYMBOL", "RULE_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'|'", "','", "'-'", "'*'", "'{'", "'}'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_TERMINAL_SYMBOL=7;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_SPECIAL_SEQUENCE=6;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEBNFLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEBNFLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEBNFLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEBNFLang.g"; }



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




    // $ANTLR start "entryRuleEbnfGrammar"
    // InternalEBNFLang.g:64:1: entryRuleEbnfGrammar returns [EObject current=null] : iv_ruleEbnfGrammar= ruleEbnfGrammar EOF ;
    public final EObject entryRuleEbnfGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbnfGrammar = null;


        try {
            // InternalEBNFLang.g:64:52: (iv_ruleEbnfGrammar= ruleEbnfGrammar EOF )
            // InternalEBNFLang.g:65:2: iv_ruleEbnfGrammar= ruleEbnfGrammar EOF
            {
             newCompositeNode(grammarAccess.getEbnfGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEbnfGrammar=ruleEbnfGrammar();

            state._fsp--;

             current =iv_ruleEbnfGrammar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEbnfGrammar"


    // $ANTLR start "ruleEbnfGrammar"
    // InternalEBNFLang.g:71:1: ruleEbnfGrammar returns [EObject current=null] : ( () ( (lv_rules_1_0= ruleProductionRule ) )* ) ;
    public final EObject ruleEbnfGrammar() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:77:2: ( ( () ( (lv_rules_1_0= ruleProductionRule ) )* ) )
            // InternalEBNFLang.g:78:2: ( () ( (lv_rules_1_0= ruleProductionRule ) )* )
            {
            // InternalEBNFLang.g:78:2: ( () ( (lv_rules_1_0= ruleProductionRule ) )* )
            // InternalEBNFLang.g:79:3: () ( (lv_rules_1_0= ruleProductionRule ) )*
            {
            // InternalEBNFLang.g:79:3: ()
            // InternalEBNFLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0(),
            					current);
            			

            }

            // InternalEBNFLang.g:86:3: ( (lv_rules_1_0= ruleProductionRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEBNFLang.g:87:4: (lv_rules_1_0= ruleProductionRule )
            	    {
            	    // InternalEBNFLang.g:87:4: (lv_rules_1_0= ruleProductionRule )
            	    // InternalEBNFLang.g:88:5: lv_rules_1_0= ruleProductionRule
            	    {

            	    					newCompositeNode(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=ruleProductionRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEbnfGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"org.uasm.ebnf.EBNFLang.ProductionRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEbnfGrammar"


    // $ANTLR start "entryRuleProductionRule"
    // InternalEBNFLang.g:109:1: entryRuleProductionRule returns [EObject current=null] : iv_ruleProductionRule= ruleProductionRule EOF ;
    public final EObject entryRuleProductionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductionRule = null;


        try {
            // InternalEBNFLang.g:109:55: (iv_ruleProductionRule= ruleProductionRule EOF )
            // InternalEBNFLang.g:110:2: iv_ruleProductionRule= ruleProductionRule EOF
            {
             newCompositeNode(grammarAccess.getProductionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductionRule=ruleProductionRule();

            state._fsp--;

             current =iv_ruleProductionRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductionRule"


    // $ANTLR start "ruleProductionRule"
    // InternalEBNFLang.g:116:1: ruleProductionRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProductionRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:122:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalEBNFLang.g:123:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalEBNFLang.g:123:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalEBNFLang.g:124:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalEBNFLang.g:124:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalEBNFLang.g:125:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalEBNFLang.g:125:4: (lv_name_0_0= RULE_NAME )
            // InternalEBNFLang.g:126:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductionRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.uasm.ebnf.EBNFLang.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1());
            		
            // InternalEBNFLang.g:146:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEBNFLang.g:147:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEBNFLang.g:147:4: (lv_expr_2_0= ruleExpression )
            // InternalEBNFLang.g:148:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRuleRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.uasm.ebnf.EBNFLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductionRule"


    // $ANTLR start "entryRuleExpression"
    // InternalEBNFLang.g:173:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEBNFLang.g:173:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEBNFLang.g:174:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEBNFLang.g:180:1: ruleExpression returns [EObject current=null] : this_Expression_Alternative_0= ruleExpression_Alternative ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Alternative_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:186:2: (this_Expression_Alternative_0= ruleExpression_Alternative )
            // InternalEBNFLang.g:187:2: this_Expression_Alternative_0= ruleExpression_Alternative
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_Alternative_0=ruleExpression_Alternative();

            state._fsp--;


            		current = this_Expression_Alternative_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Alternative"
    // InternalEBNFLang.g:198:1: entryRuleExpression_Alternative returns [EObject current=null] : iv_ruleExpression_Alternative= ruleExpression_Alternative EOF ;
    public final EObject entryRuleExpression_Alternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Alternative = null;


        try {
            // InternalEBNFLang.g:198:63: (iv_ruleExpression_Alternative= ruleExpression_Alternative EOF )
            // InternalEBNFLang.g:199:2: iv_ruleExpression_Alternative= ruleExpression_Alternative EOF
            {
             newCompositeNode(grammarAccess.getExpression_AlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Alternative=ruleExpression_Alternative();

            state._fsp--;

             current =iv_ruleExpression_Alternative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Alternative"


    // $ANTLR start "ruleExpression_Alternative"
    // InternalEBNFLang.g:205:1: ruleExpression_Alternative returns [EObject current=null] : (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? ) ;
    public final EObject ruleExpression_Alternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Concatenation_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:211:2: ( (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? ) )
            // InternalEBNFLang.g:212:2: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? )
            {
            // InternalEBNFLang.g:212:2: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? )
            // InternalEBNFLang.g:213:3: this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Expression_Concatenation_0=ruleExpression_Concatenation();

            state._fsp--;


            			current = this_Expression_Concatenation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEBNFLang.g:221:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEBNFLang.g:222:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+
                    {
                    // InternalEBNFLang.g:222:4: ()
                    // InternalEBNFLang.g:223:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEBNFLang.g:229:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalEBNFLang.g:230:5: otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalEBNFLang.g:234:5: ( (lv_elements_3_0= ruleExpression_Concatenation ) )
                    	    // InternalEBNFLang.g:235:6: (lv_elements_3_0= ruleExpression_Concatenation )
                    	    {
                    	    // InternalEBNFLang.g:235:6: (lv_elements_3_0= ruleExpression_Concatenation )
                    	    // InternalEBNFLang.g:236:7: lv_elements_3_0= ruleExpression_Concatenation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_3_0=ruleExpression_Concatenation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpression_AlternativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.uasm.ebnf.EBNFLang.Expression_Concatenation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Alternative"


    // $ANTLR start "entryRuleExpression_Concatenation"
    // InternalEBNFLang.g:259:1: entryRuleExpression_Concatenation returns [EObject current=null] : iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF ;
    public final EObject entryRuleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Concatenation = null;


        try {
            // InternalEBNFLang.g:259:65: (iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF )
            // InternalEBNFLang.g:260:2: iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF
            {
             newCompositeNode(grammarAccess.getExpression_ConcatenationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Concatenation=ruleExpression_Concatenation();

            state._fsp--;

             current =iv_ruleExpression_Concatenation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Concatenation"


    // $ANTLR start "ruleExpression_Concatenation"
    // InternalEBNFLang.g:266:1: ruleExpression_Concatenation returns [EObject current=null] : (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? ) ;
    public final EObject ruleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Exception_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:272:2: ( (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? ) )
            // InternalEBNFLang.g:273:2: (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? )
            {
            // InternalEBNFLang.g:273:2: (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? )
            // InternalEBNFLang.g:274:3: this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Expression_Exception_0=ruleExpression_Exception();

            state._fsp--;


            			current = this_Expression_Exception_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEBNFLang.g:282:3: ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEBNFLang.g:283:4: () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+
                    {
                    // InternalEBNFLang.g:283:4: ()
                    // InternalEBNFLang.g:284:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEBNFLang.g:290:4: (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEBNFLang.g:291:5: otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEBNFLang.g:295:5: ( (lv_elements_3_0= ruleExpression_Exception ) )
                    	    // InternalEBNFLang.g:296:6: (lv_elements_3_0= ruleExpression_Exception )
                    	    {
                    	    // InternalEBNFLang.g:296:6: (lv_elements_3_0= ruleExpression_Exception )
                    	    // InternalEBNFLang.g:297:7: lv_elements_3_0= ruleExpression_Exception
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_elements_3_0=ruleExpression_Exception();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpression_ConcatenationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.uasm.ebnf.EBNFLang.Expression_Exception");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Concatenation"


    // $ANTLR start "entryRuleExpression_Exception"
    // InternalEBNFLang.g:320:1: entryRuleExpression_Exception returns [EObject current=null] : iv_ruleExpression_Exception= ruleExpression_Exception EOF ;
    public final EObject entryRuleExpression_Exception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Exception = null;


        try {
            // InternalEBNFLang.g:320:61: (iv_ruleExpression_Exception= ruleExpression_Exception EOF )
            // InternalEBNFLang.g:321:2: iv_ruleExpression_Exception= ruleExpression_Exception EOF
            {
             newCompositeNode(grammarAccess.getExpression_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Exception=ruleExpression_Exception();

            state._fsp--;

             current =iv_ruleExpression_Exception; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Exception"


    // $ANTLR start "ruleExpression_Exception"
    // InternalEBNFLang.g:327:1: ruleExpression_Exception returns [EObject current=null] : (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* ) ;
    public final EObject ruleExpression_Exception() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Repetition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:333:2: ( (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* ) )
            // InternalEBNFLang.g:334:2: (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* )
            {
            // InternalEBNFLang.g:334:2: (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* )
            // InternalEBNFLang.g:335:3: this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression_Repetition_0=ruleExpression_Repetition();

            state._fsp--;


            			current = this_Expression_Repetition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEBNFLang.g:343:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEBNFLang.g:344:4: () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) )
            	    {
            	    // InternalEBNFLang.g:344:4: ()
            	    // InternalEBNFLang.g:345:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalEBNFLang.g:355:4: ( (lv_right_3_0= ruleExpression_Repetition ) )
            	    // InternalEBNFLang.g:356:5: (lv_right_3_0= ruleExpression_Repetition )
            	    {
            	    // InternalEBNFLang.g:356:5: (lv_right_3_0= ruleExpression_Repetition )
            	    // InternalEBNFLang.g:357:6: lv_right_3_0= ruleExpression_Repetition
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleExpression_Repetition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_ExceptionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.uasm.ebnf.EBNFLang.Expression_Repetition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Exception"


    // $ANTLR start "entryRuleExpression_Repetition"
    // InternalEBNFLang.g:379:1: entryRuleExpression_Repetition returns [EObject current=null] : iv_ruleExpression_Repetition= ruleExpression_Repetition EOF ;
    public final EObject entryRuleExpression_Repetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Repetition = null;


        try {
            // InternalEBNFLang.g:379:62: (iv_ruleExpression_Repetition= ruleExpression_Repetition EOF )
            // InternalEBNFLang.g:380:2: iv_ruleExpression_Repetition= ruleExpression_Repetition EOF
            {
             newCompositeNode(grammarAccess.getExpression_RepetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Repetition=ruleExpression_Repetition();

            state._fsp--;

             current =iv_ruleExpression_Repetition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Repetition"


    // $ANTLR start "ruleExpression_Repetition"
    // InternalEBNFLang.g:386:1: ruleExpression_Repetition returns [EObject current=null] : (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) ) ;
    public final EObject ruleExpression_Repetition() throws RecognitionException {
        EObject current = null;

        Token lv_repetitions_2_0=null;
        Token otherlv_3=null;
        EObject this_Expression_Terminal_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:392:2: ( (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) ) )
            // InternalEBNFLang.g:393:2: (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) )
            {
            // InternalEBNFLang.g:393:2: (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NAME||(LA7_0>=RULE_SPECIAL_SEQUENCE && LA7_0<=RULE_TERMINAL_SYMBOL)||LA7_0==22||LA7_0==24||LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_NUMBER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEBNFLang.g:394:3: this_Expression_Terminal_0= ruleExpression_Terminal
                    {

                    			newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Terminal_0=ruleExpression_Terminal();

                    state._fsp--;


                    			current = this_Expression_Terminal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:403:3: ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) )
                    {
                    // InternalEBNFLang.g:403:3: ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) )
                    // InternalEBNFLang.g:404:4: () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) )
                    {
                    // InternalEBNFLang.g:404:4: ()
                    // InternalEBNFLang.g:405:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEBNFLang.g:411:4: ( (lv_repetitions_2_0= RULE_NUMBER ) )
                    // InternalEBNFLang.g:412:5: (lv_repetitions_2_0= RULE_NUMBER )
                    {
                    // InternalEBNFLang.g:412:5: (lv_repetitions_2_0= RULE_NUMBER )
                    // InternalEBNFLang.g:413:6: lv_repetitions_2_0= RULE_NUMBER
                    {
                    lv_repetitions_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_10); 

                    						newLeafNode(lv_repetitions_2_0, grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpression_RepetitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"repetitions",
                    							lv_repetitions_2_0,
                    							"org.uasm.ebnf.EBNFLang.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2());
                    			
                    // InternalEBNFLang.g:433:4: ( (lv_expr_4_0= ruleExpression_Terminal ) )
                    // InternalEBNFLang.g:434:5: (lv_expr_4_0= ruleExpression_Terminal )
                    {
                    // InternalEBNFLang.g:434:5: (lv_expr_4_0= ruleExpression_Terminal )
                    // InternalEBNFLang.g:435:6: lv_expr_4_0= ruleExpression_Terminal
                    {

                    						newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleExpression_Terminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression_RepetitionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"org.uasm.ebnf.EBNFLang.Expression_Terminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Repetition"


    // $ANTLR start "entryRuleExpression_Terminal"
    // InternalEBNFLang.g:457:1: entryRuleExpression_Terminal returns [EObject current=null] : iv_ruleExpression_Terminal= ruleExpression_Terminal EOF ;
    public final EObject entryRuleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Terminal = null;


        try {
            // InternalEBNFLang.g:457:60: (iv_ruleExpression_Terminal= ruleExpression_Terminal EOF )
            // InternalEBNFLang.g:458:2: iv_ruleExpression_Terminal= ruleExpression_Terminal EOF
            {
             newCompositeNode(grammarAccess.getExpression_TerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Terminal=ruleExpression_Terminal();

            state._fsp--;

             current =iv_ruleExpression_Terminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Terminal"


    // $ANTLR start "ruleExpression_Terminal"
    // InternalEBNFLang.g:464:1: ruleExpression_Terminal returns [EObject current=null] : (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence ) ;
    public final EObject ruleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Rule_Reference_0 = null;

        EObject this_Expression_Terminal_Symbol_1 = null;

        EObject this_Expression_Repetition_Group_2 = null;

        EObject this_Expression_Optional_Group_3 = null;

        EObject this_Expression_Group_4 = null;

        EObject this_Expression_Special_Sequence_5 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:470:2: ( (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence ) )
            // InternalEBNFLang.g:471:2: (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence )
            {
            // InternalEBNFLang.g:471:2: (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt8=1;
                }
                break;
            case RULE_TERMINAL_SYMBOL:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case RULE_SPECIAL_SEQUENCE:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEBNFLang.g:472:3: this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Rule_Reference_0=ruleExpression_Rule_Reference();

                    state._fsp--;


                    			current = this_Expression_Rule_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:481:3: this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Terminal_Symbol_1=ruleExpression_Terminal_Symbol();

                    state._fsp--;


                    			current = this_Expression_Terminal_Symbol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEBNFLang.g:490:3: this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Repetition_Group_2=ruleExpression_Repetition_Group();

                    state._fsp--;


                    			current = this_Expression_Repetition_Group_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEBNFLang.g:499:3: this_Expression_Optional_Group_3= ruleExpression_Optional_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Optional_Group_3=ruleExpression_Optional_Group();

                    state._fsp--;


                    			current = this_Expression_Optional_Group_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEBNFLang.g:508:3: this_Expression_Group_4= ruleExpression_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Group_4=ruleExpression_Group();

                    state._fsp--;


                    			current = this_Expression_Group_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEBNFLang.g:517:3: this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Special_Sequence_5=ruleExpression_Special_Sequence();

                    state._fsp--;


                    			current = this_Expression_Special_Sequence_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Terminal"


    // $ANTLR start "entryRuleExpression_Rule_Reference"
    // InternalEBNFLang.g:529:1: entryRuleExpression_Rule_Reference returns [EObject current=null] : iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF ;
    public final EObject entryRuleExpression_Rule_Reference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Rule_Reference = null;


        try {
            // InternalEBNFLang.g:529:66: (iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF )
            // InternalEBNFLang.g:530:2: iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF
            {
             newCompositeNode(grammarAccess.getExpression_Rule_ReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Rule_Reference=ruleExpression_Rule_Reference();

            state._fsp--;

             current =iv_ruleExpression_Rule_Reference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Rule_Reference"


    // $ANTLR start "ruleExpression_Rule_Reference"
    // InternalEBNFLang.g:536:1: ruleExpression_Rule_Reference returns [EObject current=null] : ( () ( (otherlv_1= RULE_NAME ) ) ) ;
    public final EObject ruleExpression_Rule_Reference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEBNFLang.g:542:2: ( ( () ( (otherlv_1= RULE_NAME ) ) ) )
            // InternalEBNFLang.g:543:2: ( () ( (otherlv_1= RULE_NAME ) ) )
            {
            // InternalEBNFLang.g:543:2: ( () ( (otherlv_1= RULE_NAME ) ) )
            // InternalEBNFLang.g:544:3: () ( (otherlv_1= RULE_NAME ) )
            {
            // InternalEBNFLang.g:544:3: ()
            // InternalEBNFLang.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0(),
            					current);
            			

            }

            // InternalEBNFLang.g:551:3: ( (otherlv_1= RULE_NAME ) )
            // InternalEBNFLang.g:552:4: (otherlv_1= RULE_NAME )
            {
            // InternalEBNFLang.g:552:4: (otherlv_1= RULE_NAME )
            // InternalEBNFLang.g:553:5: otherlv_1= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Rule_ReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Rule_Reference"


    // $ANTLR start "entryRuleExpression_Special_Sequence"
    // InternalEBNFLang.g:568:1: entryRuleExpression_Special_Sequence returns [EObject current=null] : iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF ;
    public final EObject entryRuleExpression_Special_Sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Special_Sequence = null;


        try {
            // InternalEBNFLang.g:568:68: (iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF )
            // InternalEBNFLang.g:569:2: iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF
            {
             newCompositeNode(grammarAccess.getExpression_Special_SequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Special_Sequence=ruleExpression_Special_Sequence();

            state._fsp--;

             current =iv_ruleExpression_Special_Sequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Special_Sequence"


    // $ANTLR start "ruleExpression_Special_Sequence"
    // InternalEBNFLang.g:575:1: ruleExpression_Special_Sequence returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) ) ;
    public final EObject ruleExpression_Special_Sequence() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalEBNFLang.g:581:2: ( ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) ) )
            // InternalEBNFLang.g:582:2: ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) )
            {
            // InternalEBNFLang.g:582:2: ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) )
            // InternalEBNFLang.g:583:3: () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) )
            {
            // InternalEBNFLang.g:583:3: ()
            // InternalEBNFLang.g:584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0(),
            					current);
            			

            }

            // InternalEBNFLang.g:590:3: ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) )
            // InternalEBNFLang.g:591:4: (lv_text_1_0= RULE_SPECIAL_SEQUENCE )
            {
            // InternalEBNFLang.g:591:4: (lv_text_1_0= RULE_SPECIAL_SEQUENCE )
            // InternalEBNFLang.g:592:5: lv_text_1_0= RULE_SPECIAL_SEQUENCE
            {
            lv_text_1_0=(Token)match(input,RULE_SPECIAL_SEQUENCE,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Special_SequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.uasm.ebnf.EBNFLang.SPECIAL_SEQUENCE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Special_Sequence"


    // $ANTLR start "entryRuleExpression_Terminal_Symbol"
    // InternalEBNFLang.g:612:1: entryRuleExpression_Terminal_Symbol returns [EObject current=null] : iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF ;
    public final EObject entryRuleExpression_Terminal_Symbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Terminal_Symbol = null;


        try {
            // InternalEBNFLang.g:612:67: (iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF )
            // InternalEBNFLang.g:613:2: iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF
            {
             newCompositeNode(grammarAccess.getExpression_Terminal_SymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Terminal_Symbol=ruleExpression_Terminal_Symbol();

            state._fsp--;

             current =iv_ruleExpression_Terminal_Symbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Terminal_Symbol"


    // $ANTLR start "ruleExpression_Terminal_Symbol"
    // InternalEBNFLang.g:619:1: ruleExpression_Terminal_Symbol returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) ) ;
    public final EObject ruleExpression_Terminal_Symbol() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalEBNFLang.g:625:2: ( ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) ) )
            // InternalEBNFLang.g:626:2: ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) )
            {
            // InternalEBNFLang.g:626:2: ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) )
            // InternalEBNFLang.g:627:3: () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) )
            {
            // InternalEBNFLang.g:627:3: ()
            // InternalEBNFLang.g:628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0(),
            					current);
            			

            }

            // InternalEBNFLang.g:634:3: ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) )
            // InternalEBNFLang.g:635:4: (lv_text_1_0= RULE_TERMINAL_SYMBOL )
            {
            // InternalEBNFLang.g:635:4: (lv_text_1_0= RULE_TERMINAL_SYMBOL )
            // InternalEBNFLang.g:636:5: lv_text_1_0= RULE_TERMINAL_SYMBOL
            {
            lv_text_1_0=(Token)match(input,RULE_TERMINAL_SYMBOL,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Terminal_SymbolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.uasm.ebnf.EBNFLang.TERMINAL_SYMBOL");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Terminal_Symbol"


    // $ANTLR start "entryRuleExpression_Repetition_Group"
    // InternalEBNFLang.g:656:1: entryRuleExpression_Repetition_Group returns [EObject current=null] : iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF ;
    public final EObject entryRuleExpression_Repetition_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Repetition_Group = null;


        try {
            // InternalEBNFLang.g:656:68: (iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF )
            // InternalEBNFLang.g:657:2: iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_Repetition_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Repetition_Group=ruleExpression_Repetition_Group();

            state._fsp--;

             current =iv_ruleExpression_Repetition_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Repetition_Group"


    // $ANTLR start "ruleExpression_Repetition_Group"
    // InternalEBNFLang.g:663:1: ruleExpression_Repetition_Group returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? ) ;
    public final EObject ruleExpression_Repetition_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_atLeastOne_4_0=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:669:2: ( ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? ) )
            // InternalEBNFLang.g:670:2: ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? )
            {
            // InternalEBNFLang.g:670:2: ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? )
            // InternalEBNFLang.g:671:3: () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )?
            {
            // InternalEBNFLang.g:671:3: ()
            // InternalEBNFLang.g:672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEBNFLang.g:682:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEBNFLang.g:683:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEBNFLang.g:683:4: (lv_expr_2_0= ruleExpression )
            // InternalEBNFLang.g:684:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_Repetition_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.uasm.ebnf.EBNFLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalEBNFLang.g:705:3: ( (lv_atLeastOne_4_0= '-' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=17 && LA9_1<=20)||LA9_1==23||LA9_1==25||LA9_1==27) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalEBNFLang.g:706:4: (lv_atLeastOne_4_0= '-' )
                    {
                    // InternalEBNFLang.g:706:4: (lv_atLeastOne_4_0= '-' )
                    // InternalEBNFLang.g:707:5: lv_atLeastOne_4_0= '-'
                    {
                    lv_atLeastOne_4_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_atLeastOne_4_0, grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpression_Repetition_GroupRule());
                    					}
                    					setWithLastConsumed(current, "atLeastOne", true, "-");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Repetition_Group"


    // $ANTLR start "entryRuleExpression_Optional_Group"
    // InternalEBNFLang.g:723:1: entryRuleExpression_Optional_Group returns [EObject current=null] : iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF ;
    public final EObject entryRuleExpression_Optional_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Optional_Group = null;


        try {
            // InternalEBNFLang.g:723:66: (iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF )
            // InternalEBNFLang.g:724:2: iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_Optional_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Optional_Group=ruleExpression_Optional_Group();

            state._fsp--;

             current =iv_ruleExpression_Optional_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Optional_Group"


    // $ANTLR start "ruleExpression_Optional_Group"
    // InternalEBNFLang.g:730:1: ruleExpression_Optional_Group returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' ) ;
    public final EObject ruleExpression_Optional_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:736:2: ( ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' ) )
            // InternalEBNFLang.g:737:2: ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' )
            {
            // InternalEBNFLang.g:737:2: ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' )
            // InternalEBNFLang.g:738:3: () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']'
            {
            // InternalEBNFLang.g:738:3: ()
            // InternalEBNFLang.g:739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEBNFLang.g:749:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEBNFLang.g:750:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEBNFLang.g:750:4: (lv_expr_2_0= ruleExpression )
            // InternalEBNFLang.g:751:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_Optional_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.uasm.ebnf.EBNFLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Optional_Group"


    // $ANTLR start "entryRuleExpression_Group"
    // InternalEBNFLang.g:776:1: entryRuleExpression_Group returns [EObject current=null] : iv_ruleExpression_Group= ruleExpression_Group EOF ;
    public final EObject entryRuleExpression_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Group = null;


        try {
            // InternalEBNFLang.g:776:57: (iv_ruleExpression_Group= ruleExpression_Group EOF )
            // InternalEBNFLang.g:777:2: iv_ruleExpression_Group= ruleExpression_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Group=ruleExpression_Group();

            state._fsp--;

             current =iv_ruleExpression_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Group"


    // $ANTLR start "ruleExpression_Group"
    // InternalEBNFLang.g:783:1: ruleExpression_Group returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEBNFLang.g:789:2: ( ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalEBNFLang.g:790:2: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalEBNFLang.g:790:2: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalEBNFLang.g:791:3: () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalEBNFLang.g:791:3: ()
            // InternalEBNFLang.g:792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEBNFLang.g:802:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEBNFLang.g:803:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEBNFLang.g:803:4: (lv_expr_2_0= ruleExpression )
            // InternalEBNFLang.g:804:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.uasm.ebnf.EBNFLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Group"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000054000D0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});

}