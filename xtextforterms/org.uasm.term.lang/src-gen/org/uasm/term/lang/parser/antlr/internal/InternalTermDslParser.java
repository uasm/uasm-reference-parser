package org.uasm.term.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uasm.term.lang.services.TermDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTermDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STN", "RULE_INT", "RULE_TK_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "':'", "'implies'", "'or'", "'xor'", "'and'", "'!='", "'='", "'<'", "'>'", "'<='", "'>='", "'memberof'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'div'", "'^'", "'not'", "'('", "')'", "','", "'result'", "'true'", "'false'", "'undef'", "'self'", "'['", "'..'", "'step'", "']'", "'{'", "'}'", "'->'", "'forall'", "'in'", "'holds'", "'exists'", "'unique'", "'with'", "'|'", "'pick'", "'if'", "'then'", "'else'", "'endif'", "'case'", "'of'", "'otherwise'", "'endcase'", "'let'", "'@'", "'return'", "'SET'", "'BAG'", "'LIST'", "'MAP'", "'ANY'", "'AGENT'", "'STRING'", "'NUMBER'", "'INTEGER'", "'CHAR'", "'BOOLEAN'", "'RULE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_TK_FLOAT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_STN=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTermDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTermDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTermDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTermDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TermDslGrammarAccess grammarAccess;

        public InternalTermDslParser(TokenStream input, TermDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Term";
       	}

       	@Override
       	protected TermDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTerm"
    // InternalTermDsl.g:71:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalTermDsl.g:71:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalTermDsl.g:72:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalTermDsl.g:78:1: ruleTerm returns [EObject current=null] : this_CondTernaryExpression_0= ruleCondTernaryExpression ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CondTernaryExpression_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:84:2: (this_CondTernaryExpression_0= ruleCondTernaryExpression )
            // InternalTermDsl.g:85:2: this_CondTernaryExpression_0= ruleCondTernaryExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTermAccess().getCondTernaryExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_CondTernaryExpression_0=ruleCondTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_CondTernaryExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleCondTernaryExpression"
    // InternalTermDsl.g:99:1: entryRuleCondTernaryExpression returns [EObject current=null] : iv_ruleCondTernaryExpression= ruleCondTernaryExpression EOF ;
    public final EObject entryRuleCondTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondTernaryExpression = null;


        try {
            // InternalTermDsl.g:99:62: (iv_ruleCondTernaryExpression= ruleCondTernaryExpression EOF )
            // InternalTermDsl.g:100:2: iv_ruleCondTernaryExpression= ruleCondTernaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondTernaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondTernaryExpression=ruleCondTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondTernaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondTernaryExpression"


    // $ANTLR start "ruleCondTernaryExpression"
    // InternalTermDsl.g:106:1: ruleCondTernaryExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleCondTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ImpliesExpression_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:112:2: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )* ) )
            // InternalTermDsl.g:113:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )* )
            {
            // InternalTermDsl.g:113:2: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )* )
            // InternalTermDsl.g:114:3: this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCondTernaryExpressionAccess().getImpliesExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImpliesExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:125:3: ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_InternalTermDsl()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalTermDsl.g:126:4: () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) )
            	    {
            	    // InternalTermDsl.g:126:4: ()
            	    // InternalTermDsl.g:127:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getCondTernaryExpressionAccess().getCondTernaryExpressionCondAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getCondTernaryExpressionAccess().getQuestionMarkKeyword_1_1());
            	      			
            	    }
            	    // InternalTermDsl.g:140:4: ( (lv_then_3_0= ruleImpliesExpression ) )
            	    // InternalTermDsl.g:141:5: (lv_then_3_0= ruleImpliesExpression )
            	    {
            	    // InternalTermDsl.g:141:5: (lv_then_3_0= ruleImpliesExpression )
            	    // InternalTermDsl.g:142:6: lv_then_3_0= ruleImpliesExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCondTernaryExpressionAccess().getThenImpliesExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_then_3_0=ruleImpliesExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCondTernaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"then",
            	      							lv_then_3_0,
            	      							"org.uasm.term.lang.TermDsl.ImpliesExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCondTernaryExpressionAccess().getColonKeyword_1_3());
            	      			
            	    }
            	    // InternalTermDsl.g:163:4: ( (lv_else_5_0= ruleImpliesExpression ) )
            	    // InternalTermDsl.g:164:5: (lv_else_5_0= ruleImpliesExpression )
            	    {
            	    // InternalTermDsl.g:164:5: (lv_else_5_0= ruleImpliesExpression )
            	    // InternalTermDsl.g:165:6: lv_else_5_0= ruleImpliesExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCondTernaryExpressionAccess().getElseImpliesExpressionParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_else_5_0=ruleImpliesExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCondTernaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"else",
            	      							lv_else_5_0,
            	      							"org.uasm.term.lang.TermDsl.ImpliesExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCondTernaryExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalTermDsl.g:187:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalTermDsl.g:187:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalTermDsl.g:188:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalTermDsl.g:194:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:200:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalTermDsl.g:201:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalTermDsl.g:201:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalTermDsl.g:202:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:213:3: ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalTermDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTermDsl.g:214:4: () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalTermDsl.g:214:4: ()
            	    // InternalTermDsl.g:215:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getImpliesExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:224:4: ( (lv_op_2_0= 'implies' ) )
            	    // InternalTermDsl.g:225:5: (lv_op_2_0= 'implies' )
            	    {
            	    // InternalTermDsl.g:225:5: (lv_op_2_0= 'implies' )
            	    // InternalTermDsl.g:226:6: lv_op_2_0= 'implies'
            	    {
            	    lv_op_2_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getImpliesExpressionAccess().getOpImpliesKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getImpliesExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "implies");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTermDsl.g:238:4: ( (lv_right_3_0= ruleOrExpression ) )
            	    // InternalTermDsl.g:239:5: (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalTermDsl.g:239:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalTermDsl.g:240:6: lv_right_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.OrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalTermDsl.g:262:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalTermDsl.g:262:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalTermDsl.g:263:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalTermDsl.g:269:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:275:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalTermDsl.g:276:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalTermDsl.g:276:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalTermDsl.g:277:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:288:3: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3_InternalTermDsl()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalTermDsl.g:289:4: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalTermDsl.g:289:4: ()
            	    // InternalTermDsl.g:290:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:299:4: ( (lv_op_2_0= 'or' ) )
            	    // InternalTermDsl.g:300:5: (lv_op_2_0= 'or' )
            	    {
            	    // InternalTermDsl.g:300:5: (lv_op_2_0= 'or' )
            	    // InternalTermDsl.g:301:6: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTermDsl.g:313:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalTermDsl.g:314:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalTermDsl.g:314:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalTermDsl.g:315:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.XorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalTermDsl.g:337:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalTermDsl.g:337:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalTermDsl.g:338:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalTermDsl.g:344:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:350:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalTermDsl.g:351:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalTermDsl.g:351:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalTermDsl.g:352:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:363:3: ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4_InternalTermDsl()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalTermDsl.g:364:4: () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalTermDsl.g:364:4: ()
            	    // InternalTermDsl.g:365:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getXorExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:374:4: ( (lv_op_2_0= 'xor' ) )
            	    // InternalTermDsl.g:375:5: (lv_op_2_0= 'xor' )
            	    {
            	    // InternalTermDsl.g:375:5: (lv_op_2_0= 'xor' )
            	    // InternalTermDsl.g:376:6: lv_op_2_0= 'xor'
            	    {
            	    lv_op_2_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getXorExpressionAccess().getOpXorKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getXorExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "xor");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTermDsl.g:388:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalTermDsl.g:389:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalTermDsl.g:389:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalTermDsl.g:390:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalTermDsl.g:412:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalTermDsl.g:412:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalTermDsl.g:413:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalTermDsl.g:419:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:425:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalTermDsl.g:426:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalTermDsl.g:426:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalTermDsl.g:427:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:438:3: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_InternalTermDsl()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalTermDsl.g:439:4: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalTermDsl.g:439:4: ()
            	    // InternalTermDsl.g:440:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:449:4: ( (lv_op_2_0= 'and' ) )
            	    // InternalTermDsl.g:450:5: (lv_op_2_0= 'and' )
            	    {
            	    // InternalTermDsl.g:450:5: (lv_op_2_0= 'and' )
            	    // InternalTermDsl.g:451:6: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTermDsl.g:463:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalTermDsl.g:464:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalTermDsl.g:464:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalTermDsl.g:465:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalTermDsl.g:487:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalTermDsl.g:487:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalTermDsl.g:488:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalTermDsl.g:494:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationExpression_0= ruleRelationExpression ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_RelationExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:500:2: ( (this_RelationExpression_0= ruleRelationExpression ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) )
            // InternalTermDsl.g:501:2: (this_RelationExpression_0= ruleRelationExpression ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            {
            // InternalTermDsl.g:501:2: (this_RelationExpression_0= ruleRelationExpression ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            // InternalTermDsl.g:502:3: this_RelationExpression_0= ruleRelationExpression ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_RelationExpression_0=ruleRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:513:3: ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_InternalTermDsl()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==20) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred7_InternalTermDsl()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalTermDsl.g:514:4: () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) )
            	    {
            	    // InternalTermDsl.g:514:4: ()
            	    // InternalTermDsl.g:515:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:524:4: ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) )
            	    // InternalTermDsl.g:525:5: ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) )
            	    {
            	    // InternalTermDsl.g:525:5: ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) )
            	    // InternalTermDsl.g:526:6: (lv_op_2_1= '!=' | lv_op_2_2= '=' )
            	    {
            	    // InternalTermDsl.g:526:6: (lv_op_2_1= '!=' | lv_op_2_2= '=' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==19) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==20) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalTermDsl.g:527:7: lv_op_2_1= '!='
            	            {
            	            lv_op_2_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTermDsl.g:538:7: lv_op_2_2= '='
            	            {
            	            lv_op_2_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTermDsl.g:551:4: ( (lv_right_3_0= ruleRelationExpression ) )
            	    // InternalTermDsl.g:552:5: (lv_right_3_0= ruleRelationExpression )
            	    {
            	    // InternalTermDsl.g:552:5: (lv_right_3_0= ruleRelationExpression )
            	    // InternalTermDsl.g:553:6: lv_right_3_0= ruleRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.RelationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalTermDsl.g:575:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalTermDsl.g:575:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalTermDsl.g:576:2: iv_ruleRelationExpression= ruleRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationExpression=ruleRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalTermDsl.g:582:1: ruleRelationExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:588:2: ( (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalTermDsl.g:589:2: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalTermDsl.g:589:2: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalTermDsl.g:590:3: this_AddExpression_0= ruleAddExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:601:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred12_InternalTermDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred12_InternalTermDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred12_InternalTermDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred12_InternalTermDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred12_InternalTermDsl()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalTermDsl.g:602:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalTermDsl.g:602:4: ()
            	    // InternalTermDsl.g:603:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelationExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:612:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) )
            	    // InternalTermDsl.g:613:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) )
            	    {
            	    // InternalTermDsl.g:613:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) )
            	    // InternalTermDsl.g:614:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' )
            	    {
            	    // InternalTermDsl.g:614:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' )
            	    int alt8=5;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // InternalTermDsl.g:615:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getRelationExpressionAccess().getOpLessThanSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTermDsl.g:626:7: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getRelationExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalTermDsl.g:637:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getRelationExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalTermDsl.g:648:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getRelationExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalTermDsl.g:659:7: lv_op_2_5= 'memberof'
            	            {
            	            lv_op_2_5=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_5, grammarAccess.getRelationExpressionAccess().getOpMemberofKeyword_1_1_0_4());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTermDsl.g:672:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalTermDsl.g:673:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalTermDsl.g:673:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalTermDsl.g:674:6: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRightAddExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAddExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.AddExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalTermDsl.g:696:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalTermDsl.g:696:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalTermDsl.g:697:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalTermDsl.g:703:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:709:2: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )* ) )
            // InternalTermDsl.g:710:2: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )* )
            {
            // InternalTermDsl.g:710:2: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )* )
            // InternalTermDsl.g:711:3: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:722:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred14_InternalTermDsl()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==27) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred14_InternalTermDsl()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalTermDsl.g:723:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) )
            	    {
            	    // InternalTermDsl.g:723:4: ()
            	    // InternalTermDsl.g:724:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAddExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:733:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalTermDsl.g:734:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalTermDsl.g:734:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalTermDsl.g:735:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalTermDsl.g:735:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==26) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==27) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalTermDsl.g:736:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAddExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTermDsl.g:747:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAddExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTermDsl.g:760:4: ( (lv_right_3_0= ruleMultExpression ) )
            	    // InternalTermDsl.g:761:5: (lv_right_3_0= ruleMultExpression )
            	    {
            	    // InternalTermDsl.g:761:5: (lv_right_3_0= ruleMultExpression )
            	    // InternalTermDsl.g:762:6: lv_right_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleMultExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.MultExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalTermDsl.g:784:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalTermDsl.g:784:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalTermDsl.g:785:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalTermDsl.g:791:1: ruleMultExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PowerExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:797:2: ( (this_PowerExpression_0= rulePowerExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalTermDsl.g:798:2: (this_PowerExpression_0= rulePowerExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalTermDsl.g:798:2: (this_PowerExpression_0= rulePowerExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalTermDsl.g:799:3: this_PowerExpression_0= rulePowerExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultExpressionAccess().getPowerExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PowerExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:810:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred18_InternalTermDsl()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred18_InternalTermDsl()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred18_InternalTermDsl()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred18_InternalTermDsl()) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalTermDsl.g:811:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalTermDsl.g:811:4: ()
            	    // InternalTermDsl.g:812:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:821:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) )
            	    // InternalTermDsl.g:822:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) )
            	    {
            	    // InternalTermDsl.g:822:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) )
            	    // InternalTermDsl.g:823:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' )
            	    {
            	    // InternalTermDsl.g:823:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalTermDsl.g:824:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTermDsl.g:835:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMultExpressionAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalTermDsl.g:846:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getMultExpressionAccess().getOpModKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalTermDsl.g:857:7: lv_op_2_4= 'div'
            	            {
            	            lv_op_2_4=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getMultExpressionAccess().getOpDivKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTermDsl.g:870:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalTermDsl.g:871:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalTermDsl.g:871:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalTermDsl.g:872:6: lv_right_3_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultExpressionAccess().getRightPowerExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=rulePowerExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.PowerExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalTermDsl.g:894:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalTermDsl.g:894:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalTermDsl.g:895:2: iv_rulePowerExpression= rulePowerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePowerExpression=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePowerExpression"


    // $ANTLR start "rulePowerExpression"
    // InternalTermDsl.g:901:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:907:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalTermDsl.g:908:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalTermDsl.g:908:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalTermDsl.g:909:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTermDsl.g:920:3: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred19_InternalTermDsl()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalTermDsl.g:921:4: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalTermDsl.g:921:4: ()
            	    // InternalTermDsl.g:922:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPowerExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTermDsl.g:931:4: ( (lv_op_2_0= '^' ) )
            	    // InternalTermDsl.g:932:5: (lv_op_2_0= '^' )
            	    {
            	    // InternalTermDsl.g:932:5: (lv_op_2_0= '^' )
            	    // InternalTermDsl.g:933:6: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPowerExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTermDsl.g:945:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalTermDsl.g:946:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalTermDsl.g:946:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalTermDsl.g:947:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.uasm.term.lang.TermDsl.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalTermDsl.g:969:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalTermDsl.g:969:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalTermDsl.g:970:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalTermDsl.g:976:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) ) | ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) ) | this_BasicExpression_6= ruleBasicExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_4_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_BasicExpression_6 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:982:2: ( ( ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) ) | ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) ) | this_BasicExpression_6= ruleBasicExpression ) )
            // InternalTermDsl.g:983:2: ( ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) ) | ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) ) | this_BasicExpression_6= ruleBasicExpression )
            {
            // InternalTermDsl.g:983:2: ( ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) ) | ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) ) | this_BasicExpression_6= ruleBasicExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
            case RULE_STN:
            case RULE_INT:
            case RULE_TK_FLOAT:
            case 21:
            case 34:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 46:
            case 49:
            case 52:
            case 55:
            case 56:
            case 57:
            case 61:
            case 65:
            case 66:
            case 67:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTermDsl.g:984:3: ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) )
                    {
                    // InternalTermDsl.g:984:3: ( () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) ) )
                    // InternalTermDsl.g:985:4: () ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) ) ( (lv_expression_2_0= ruleBasicExpression ) )
                    {
                    // InternalTermDsl.g:985:4: ()
                    // InternalTermDsl.g:986:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:995:4: ( ( ( 'not' ) )=> (lv_op_1_0= 'not' ) )
                    // InternalTermDsl.g:996:5: ( ( 'not' ) )=> (lv_op_1_0= 'not' )
                    {
                    // InternalTermDsl.g:1000:5: (lv_op_1_0= 'not' )
                    // InternalTermDsl.g:1001:6: lv_op_1_0= 'not'
                    {
                    lv_op_1_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_0, grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_0, "not");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:1013:4: ( (lv_expression_2_0= ruleBasicExpression ) )
                    // InternalTermDsl.g:1014:5: (lv_expression_2_0= ruleBasicExpression )
                    {
                    // InternalTermDsl.g:1014:5: (lv_expression_2_0= ruleBasicExpression )
                    // InternalTermDsl.g:1015:6: lv_expression_2_0= ruleBasicExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionBasicExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleBasicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.uasm.term.lang.TermDsl.BasicExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1034:3: ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) )
                    {
                    // InternalTermDsl.g:1034:3: ( () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) ) )
                    // InternalTermDsl.g:1035:4: () ( ( ( '-' ) )=> (lv_op_4_0= '-' ) ) ( (lv_expression_5_0= ruleBasicExpression ) )
                    {
                    // InternalTermDsl.g:1035:4: ()
                    // InternalTermDsl.g:1036:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:1045:4: ( ( ( '-' ) )=> (lv_op_4_0= '-' ) )
                    // InternalTermDsl.g:1046:5: ( ( '-' ) )=> (lv_op_4_0= '-' )
                    {
                    // InternalTermDsl.g:1050:5: (lv_op_4_0= '-' )
                    // InternalTermDsl.g:1051:6: lv_op_4_0= '-'
                    {
                    lv_op_4_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_4_0, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_4_0, "-");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:1063:4: ( (lv_expression_5_0= ruleBasicExpression ) )
                    // InternalTermDsl.g:1064:5: (lv_expression_5_0= ruleBasicExpression )
                    {
                    // InternalTermDsl.g:1064:5: (lv_expression_5_0= ruleBasicExpression )
                    // InternalTermDsl.g:1065:6: lv_expression_5_0= ruleBasicExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionBasicExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleBasicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"org.uasm.term.lang.TermDsl.BasicExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:1084:3: this_BasicExpression_6= ruleBasicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBasicExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicExpression_6=ruleBasicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleBasicExpression"
    // InternalTermDsl.g:1099:1: entryRuleBasicExpression returns [EObject current=null] : iv_ruleBasicExpression= ruleBasicExpression EOF ;
    public final EObject entryRuleBasicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicExpression = null;


        try {
            // InternalTermDsl.g:1099:56: (iv_ruleBasicExpression= ruleBasicExpression EOF )
            // InternalTermDsl.g:1100:2: iv_ruleBasicExpression= ruleBasicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicExpression=ruleBasicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicExpression"


    // $ANTLR start "ruleBasicExpression"
    // InternalTermDsl.g:1106:1: ruleBasicExpression returns [EObject current=null] : (this_BasicTerm_0= ruleBasicTerm | (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' ) ) ;
    public final EObject ruleBasicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BasicTerm_0 = null;

        EObject this_Term_2 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1112:2: ( (this_BasicTerm_0= ruleBasicTerm | (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' ) ) )
            // InternalTermDsl.g:1113:2: (this_BasicTerm_0= ruleBasicTerm | (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' ) )
            {
            // InternalTermDsl.g:1113:2: (this_BasicTerm_0= ruleBasicTerm | (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalTermDsl.g:1114:3: this_BasicTerm_0= ruleBasicTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicExpressionAccess().getBasicTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicTerm_0=ruleBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1126:3: (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' )
                    {
                    // InternalTermDsl.g:1126:3: (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' )
                    // InternalTermDsl.g:1127:4: otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBasicExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBasicExpressionAccess().getTermParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Term_2=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Term_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBasicExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicExpression"


    // $ANTLR start "entryRuleBasicTerm"
    // InternalTermDsl.g:1151:1: entryRuleBasicTerm returns [EObject current=null] : iv_ruleBasicTerm= ruleBasicTerm EOF ;
    public final EObject entryRuleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTerm = null;


        try {
            // InternalTermDsl.g:1151:50: (iv_ruleBasicTerm= ruleBasicTerm EOF )
            // InternalTermDsl.g:1152:2: iv_ruleBasicTerm= ruleBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicTerm=ruleBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicTerm"


    // $ANTLR start "ruleBasicTerm"
    // InternalTermDsl.g:1158:1: ruleBasicTerm returns [EObject current=null] : (this_TupleTerm_0= ruleTupleTerm | this_LocationTerm_1= ruleLocationTerm | this_ComprehensionTerm_2= ruleComprehensionTerm | this_StructureTerm_3= ruleStructureTerm | this_PickTerm_4= rulePickTerm | this_ConditionalTerm_5= ruleConditionalTerm | this_CaseTerm_6= ruleCaseTerm | this_RuleAsTerm_7= ruleRuleAsTerm | this_ReturnTerm_8= ruleReturnTerm | this_ForAllTerm_9= ruleForAllTerm | this_ExistsTerm_10= ruleExistsTerm | this_LetTerm_11= ruleLetTerm | this_Literal_12= ruleLiteral | this_TupleLiteral_13= ruleTupleLiteral | this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm ) ;
    public final EObject ruleBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject this_TupleTerm_0 = null;

        EObject this_LocationTerm_1 = null;

        EObject this_ComprehensionTerm_2 = null;

        EObject this_StructureTerm_3 = null;

        EObject this_PickTerm_4 = null;

        EObject this_ConditionalTerm_5 = null;

        EObject this_CaseTerm_6 = null;

        EObject this_RuleAsTerm_7 = null;

        EObject this_ReturnTerm_8 = null;

        EObject this_ForAllTerm_9 = null;

        EObject this_ExistsTerm_10 = null;

        EObject this_LetTerm_11 = null;

        EObject this_Literal_12 = null;

        EObject this_TupleLiteral_13 = null;

        EObject this_SizeOfEnumerableTerm_14 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1164:2: ( (this_TupleTerm_0= ruleTupleTerm | this_LocationTerm_1= ruleLocationTerm | this_ComprehensionTerm_2= ruleComprehensionTerm | this_StructureTerm_3= ruleStructureTerm | this_PickTerm_4= rulePickTerm | this_ConditionalTerm_5= ruleConditionalTerm | this_CaseTerm_6= ruleCaseTerm | this_RuleAsTerm_7= ruleRuleAsTerm | this_ReturnTerm_8= ruleReturnTerm | this_ForAllTerm_9= ruleForAllTerm | this_ExistsTerm_10= ruleExistsTerm | this_LetTerm_11= ruleLetTerm | this_Literal_12= ruleLiteral | this_TupleLiteral_13= ruleTupleLiteral | this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm ) )
            // InternalTermDsl.g:1165:2: (this_TupleTerm_0= ruleTupleTerm | this_LocationTerm_1= ruleLocationTerm | this_ComprehensionTerm_2= ruleComprehensionTerm | this_StructureTerm_3= ruleStructureTerm | this_PickTerm_4= rulePickTerm | this_ConditionalTerm_5= ruleConditionalTerm | this_CaseTerm_6= ruleCaseTerm | this_RuleAsTerm_7= ruleRuleAsTerm | this_ReturnTerm_8= ruleReturnTerm | this_ForAllTerm_9= ruleForAllTerm | this_ExistsTerm_10= ruleExistsTerm | this_LetTerm_11= ruleLetTerm | this_Literal_12= ruleLiteral | this_TupleLiteral_13= ruleTupleLiteral | this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm )
            {
            // InternalTermDsl.g:1165:2: (this_TupleTerm_0= ruleTupleTerm | this_LocationTerm_1= ruleLocationTerm | this_ComprehensionTerm_2= ruleComprehensionTerm | this_StructureTerm_3= ruleStructureTerm | this_PickTerm_4= rulePickTerm | this_ConditionalTerm_5= ruleConditionalTerm | this_CaseTerm_6= ruleCaseTerm | this_RuleAsTerm_7= ruleRuleAsTerm | this_ReturnTerm_8= ruleReturnTerm | this_ForAllTerm_9= ruleForAllTerm | this_ExistsTerm_10= ruleExistsTerm | this_LetTerm_11= ruleLetTerm | this_Literal_12= ruleLiteral | this_TupleLiteral_13= ruleTupleLiteral | this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm )
            int alt17=15;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalTermDsl.g:1166:3: this_TupleTerm_0= ruleTupleTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getTupleTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleTerm_0=ruleTupleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1178:3: this_LocationTerm_1= ruleLocationTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getLocationTermParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocationTerm_1=ruleLocationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocationTerm_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:1190:3: this_ComprehensionTerm_2= ruleComprehensionTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getComprehensionTermParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComprehensionTerm_2=ruleComprehensionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComprehensionTerm_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:1202:3: this_StructureTerm_3= ruleStructureTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getStructureTermParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructureTerm_3=ruleStructureTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructureTerm_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTermDsl.g:1214:3: this_PickTerm_4= rulePickTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getPickTermParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PickTerm_4=rulePickTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PickTerm_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTermDsl.g:1226:3: this_ConditionalTerm_5= ruleConditionalTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getConditionalTermParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionalTerm_5=ruleConditionalTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionalTerm_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTermDsl.g:1238:3: this_CaseTerm_6= ruleCaseTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getCaseTermParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CaseTerm_6=ruleCaseTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseTerm_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTermDsl.g:1250:3: this_RuleAsTerm_7= ruleRuleAsTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getRuleAsTermParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RuleAsTerm_7=ruleRuleAsTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RuleAsTerm_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTermDsl.g:1262:3: this_ReturnTerm_8= ruleReturnTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getReturnTermParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnTerm_8=ruleReturnTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnTerm_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTermDsl.g:1274:3: this_ForAllTerm_9= ruleForAllTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getForAllTermParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForAllTerm_9=ruleForAllTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForAllTerm_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTermDsl.g:1286:3: this_ExistsTerm_10= ruleExistsTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getExistsTermParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExistsTerm_10=ruleExistsTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExistsTerm_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalTermDsl.g:1298:3: this_LetTerm_11= ruleLetTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getLetTermParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetTerm_11=ruleLetTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetTerm_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalTermDsl.g:1310:3: this_Literal_12= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getLiteralParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_12=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalTermDsl.g:1322:3: this_TupleLiteral_13= ruleTupleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getTupleLiteralParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleLiteral_13=ruleTupleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteral_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalTermDsl.g:1334:3: this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicTermAccess().getSizeOfEnumerableTermParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SizeOfEnumerableTerm_14=ruleSizeOfEnumerableTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SizeOfEnumerableTerm_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicTerm"


    // $ANTLR start "entryRuleTupleTerm"
    // InternalTermDsl.g:1349:1: entryRuleTupleTerm returns [EObject current=null] : iv_ruleTupleTerm= ruleTupleTerm EOF ;
    public final EObject entryRuleTupleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTerm = null;


        try {
            // InternalTermDsl.g:1349:50: (iv_ruleTupleTerm= ruleTupleTerm EOF )
            // InternalTermDsl.g:1350:2: iv_ruleTupleTerm= ruleTupleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleTerm=ruleTupleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTerm"


    // $ANTLR start "ruleTupleTerm"
    // InternalTermDsl.g:1356:1: ruleTupleTerm returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+ otherlv_5= ')' ) ;
    public final EObject ruleTupleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1362:2: ( ( () otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+ otherlv_5= ')' ) )
            // InternalTermDsl.g:1363:2: ( () otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+ otherlv_5= ')' )
            {
            // InternalTermDsl.g:1363:2: ( () otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+ otherlv_5= ')' )
            // InternalTermDsl.g:1364:3: () otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+ otherlv_5= ')'
            {
            // InternalTermDsl.g:1364:3: ()
            // InternalTermDsl.g:1365:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleTermAccess().getTupleTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTermDsl.g:1378:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalTermDsl.g:1379:4: (lv_term_2_0= ruleTerm )
            {
            // InternalTermDsl.g:1379:4: (lv_term_2_0= ruleTerm )
            // InternalTermDsl.g:1380:5: lv_term_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleTermAccess().getTermTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_term_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleTermRule());
              					}
              					add(
              						current,
              						"term",
              						lv_term_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:1397:3: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTermDsl.g:1398:4: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleTermAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalTermDsl.g:1402:4: ( (lv_term_4_0= ruleTerm ) )
            	    // InternalTermDsl.g:1403:5: (lv_term_4_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:1403:5: (lv_term_4_0= ruleTerm )
            	    // InternalTermDsl.g:1404:6: lv_term_4_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleTermAccess().getTermTermParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_term_4_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"term",
            	      							lv_term_4_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleTermAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleTerm"


    // $ANTLR start "entryRuleFunctionTerm"
    // InternalTermDsl.g:1430:1: entryRuleFunctionTerm returns [EObject current=null] : iv_ruleFunctionTerm= ruleFunctionTerm EOF ;
    public final EObject entryRuleFunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTerm = null;


        try {
            // InternalTermDsl.g:1430:53: (iv_ruleFunctionTerm= ruleFunctionTerm EOF )
            // InternalTermDsl.g:1431:2: iv_ruleFunctionTerm= ruleFunctionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionTerm=ruleFunctionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionTerm"


    // $ANTLR start "ruleFunctionTerm"
    // InternalTermDsl.g:1437:1: ruleFunctionTerm returns [EObject current=null] : ( () ( (lv_function_1_0= ruleIdFunction ) ) ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )? ) ;
    public final EObject ruleFunctionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_argsTuple_5_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1443:2: ( ( () ( (lv_function_1_0= ruleIdFunction ) ) ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )? ) )
            // InternalTermDsl.g:1444:2: ( () ( (lv_function_1_0= ruleIdFunction ) ) ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )? )
            {
            // InternalTermDsl.g:1444:2: ( () ( (lv_function_1_0= ruleIdFunction ) ) ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )? )
            // InternalTermDsl.g:1445:3: () ( (lv_function_1_0= ruleIdFunction ) ) ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )?
            {
            // InternalTermDsl.g:1445:3: ()
            // InternalTermDsl.g:1446:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionTermAccess().getFunctionTermAction_0(),
              					current);
              			
            }

            }

            // InternalTermDsl.g:1455:3: ( (lv_function_1_0= ruleIdFunction ) )
            // InternalTermDsl.g:1456:4: (lv_function_1_0= ruleIdFunction )
            {
            // InternalTermDsl.g:1456:4: (lv_function_1_0= ruleIdFunction )
            // InternalTermDsl.g:1457:5: lv_function_1_0= ruleIdFunction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionTermAccess().getFunctionIdFunctionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_function_1_0=ruleIdFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionTermRule());
              					}
              					set(
              						current,
              						"function",
              						lv_function_1_0,
              						"org.uasm.term.lang.TermDsl.IdFunction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:1474:3: ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )?
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalTermDsl.g:1475:4: (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalTermDsl.g:1475:4: (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalTermDsl.g:1476:5: otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionTermAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalTermDsl.g:1480:5: ( (lv_args_3_0= ruleTerm ) )
                    // InternalTermDsl.g:1481:6: (lv_args_3_0= ruleTerm )
                    {
                    // InternalTermDsl.g:1481:6: (lv_args_3_0= ruleTerm )
                    // InternalTermDsl.g:1482:7: lv_args_3_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionTermAccess().getArgsTermParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_args_3_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionTermRule());
                      							}
                      							set(
                      								current,
                      								"args",
                      								lv_args_3_0,
                      								"org.uasm.term.lang.TermDsl.Term");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getFunctionTermAccess().getRightParenthesisKeyword_2_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1505:4: ( (lv_argsTuple_5_0= ruleTupleTerm ) )
                    {
                    // InternalTermDsl.g:1505:4: ( (lv_argsTuple_5_0= ruleTupleTerm ) )
                    // InternalTermDsl.g:1506:5: (lv_argsTuple_5_0= ruleTupleTerm )
                    {
                    // InternalTermDsl.g:1506:5: (lv_argsTuple_5_0= ruleTupleTerm )
                    // InternalTermDsl.g:1507:6: lv_argsTuple_5_0= ruleTupleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionTermAccess().getArgsTupleTupleTermParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_argsTuple_5_0=ruleTupleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionTermRule());
                      						}
                      						set(
                      							current,
                      							"argsTuple",
                      							lv_argsTuple_5_0,
                      							"org.uasm.term.lang.TermDsl.TupleTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionTerm"


    // $ANTLR start "entryRuleEnumTerm"
    // InternalTermDsl.g:1529:1: entryRuleEnumTerm returns [String current=null] : iv_ruleEnumTerm= ruleEnumTerm EOF ;
    public final String entryRuleEnumTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumTerm = null;


        try {
            // InternalTermDsl.g:1529:48: (iv_ruleEnumTerm= ruleEnumTerm EOF )
            // InternalTermDsl.g:1530:2: iv_ruleEnumTerm= ruleEnumTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumTerm=ruleEnumTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumTerm.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumTerm"


    // $ANTLR start "ruleEnumTerm"
    // InternalTermDsl.g:1536:1: ruleEnumTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEnumTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:1542:2: (this_ID_0= RULE_ID )
            // InternalTermDsl.g:1543:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getEnumTermAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumTerm"


    // $ANTLR start "entryRuleEnumerableTerm"
    // InternalTermDsl.g:1553:1: entryRuleEnumerableTerm returns [EObject current=null] : iv_ruleEnumerableTerm= ruleEnumerableTerm EOF ;
    public final EObject entryRuleEnumerableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerableTerm = null;


        try {
            // InternalTermDsl.g:1553:55: (iv_ruleEnumerableTerm= ruleEnumerableTerm EOF )
            // InternalTermDsl.g:1554:2: iv_ruleEnumerableTerm= ruleEnumerableTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerableTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerableTerm=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerableTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerableTerm"


    // $ANTLR start "ruleEnumerableTerm"
    // InternalTermDsl.g:1560:1: ruleEnumerableTerm returns [EObject current=null] : (this_Term_0= ruleTerm | ( (lv_dom_1_0= ruleDomain ) ) ) ;
    public final EObject ruleEnumerableTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject lv_dom_1_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1566:2: ( (this_Term_0= ruleTerm | ( (lv_dom_1_0= ruleDomain ) ) ) )
            // InternalTermDsl.g:1567:2: (this_Term_0= ruleTerm | ( (lv_dom_1_0= ruleDomain ) ) )
            {
            // InternalTermDsl.g:1567:2: (this_Term_0= ruleTerm | ( (lv_dom_1_0= ruleDomain ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case RULE_STN:
            case RULE_INT:
            case RULE_TK_FLOAT:
            case 21:
            case 27:
            case 33:
            case 34:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 46:
            case 49:
            case 52:
            case 55:
            case 56:
            case 57:
            case 61:
            case 65:
            case 66:
            case 67:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (synpred42_InternalTermDsl()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTermDsl.g:1568:3: this_Term_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumerableTermAccess().getTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Term_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Term_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1580:3: ( (lv_dom_1_0= ruleDomain ) )
                    {
                    // InternalTermDsl.g:1580:3: ( (lv_dom_1_0= ruleDomain ) )
                    // InternalTermDsl.g:1581:4: (lv_dom_1_0= ruleDomain )
                    {
                    // InternalTermDsl.g:1581:4: (lv_dom_1_0= ruleDomain )
                    // InternalTermDsl.g:1582:5: lv_dom_1_0= ruleDomain
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumerableTermAccess().getDomDomainParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_dom_1_0=ruleDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEnumerableTermRule());
                      					}
                      					set(
                      						current,
                      						"dom",
                      						lv_dom_1_0,
                      						"org.uasm.term.lang.TermDsl.Domain");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerableTerm"


    // $ANTLR start "entryRuleVariableTerm"
    // InternalTermDsl.g:1603:1: entryRuleVariableTerm returns [String current=null] : iv_ruleVariableTerm= ruleVariableTerm EOF ;
    public final String entryRuleVariableTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableTerm = null;


        try {
            // InternalTermDsl.g:1603:52: (iv_ruleVariableTerm= ruleVariableTerm EOF )
            // InternalTermDsl.g:1604:2: iv_ruleVariableTerm= ruleVariableTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableTerm=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableTerm.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableTerm"


    // $ANTLR start "ruleVariableTerm"
    // InternalTermDsl.g:1610:1: ruleVariableTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IdFunction_0= ruleIdFunction ;
    public final AntlrDatatypeRuleToken ruleVariableTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IdFunction_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1616:2: (this_IdFunction_0= ruleIdFunction )
            // InternalTermDsl.g:1617:2: this_IdFunction_0= ruleIdFunction
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getVariableTermAccess().getIdFunctionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IdFunction_0=ruleIdFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IdFunction_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableTerm"


    // $ANTLR start "entryRuleLocationTerm"
    // InternalTermDsl.g:1630:1: entryRuleLocationTerm returns [EObject current=null] : iv_ruleLocationTerm= ruleLocationTerm EOF ;
    public final EObject entryRuleLocationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationTerm = null;


        try {
            // InternalTermDsl.g:1630:53: (iv_ruleLocationTerm= ruleLocationTerm EOF )
            // InternalTermDsl.g:1631:2: iv_ruleLocationTerm= ruleLocationTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationTerm=ruleLocationTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocationTerm"


    // $ANTLR start "ruleLocationTerm"
    // InternalTermDsl.g:1637:1: ruleLocationTerm returns [EObject current=null] : ( ( () ( (lv_function_1_0= ruleFunctionTerm ) ) ) | ( (lv_result_2_0= 'result' ) ) ) ;
    public final EObject ruleLocationTerm() throws RecognitionException {
        EObject current = null;

        Token lv_result_2_0=null;
        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1643:2: ( ( ( () ( (lv_function_1_0= ruleFunctionTerm ) ) ) | ( (lv_result_2_0= 'result' ) ) ) )
            // InternalTermDsl.g:1644:2: ( ( () ( (lv_function_1_0= ruleFunctionTerm ) ) ) | ( (lv_result_2_0= 'result' ) ) )
            {
            // InternalTermDsl.g:1644:2: ( ( () ( (lv_function_1_0= ruleFunctionTerm ) ) ) | ( (lv_result_2_0= 'result' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTermDsl.g:1645:3: ( () ( (lv_function_1_0= ruleFunctionTerm ) ) )
                    {
                    // InternalTermDsl.g:1645:3: ( () ( (lv_function_1_0= ruleFunctionTerm ) ) )
                    // InternalTermDsl.g:1646:4: () ( (lv_function_1_0= ruleFunctionTerm ) )
                    {
                    // InternalTermDsl.g:1646:4: ()
                    // InternalTermDsl.g:1647:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLocationTermAccess().getLocationTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:1656:4: ( (lv_function_1_0= ruleFunctionTerm ) )
                    // InternalTermDsl.g:1657:5: (lv_function_1_0= ruleFunctionTerm )
                    {
                    // InternalTermDsl.g:1657:5: (lv_function_1_0= ruleFunctionTerm )
                    // InternalTermDsl.g:1658:6: lv_function_1_0= ruleFunctionTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocationTermAccess().getFunctionFunctionTermParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=ruleFunctionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLocationTermRule());
                      						}
                      						set(
                      							current,
                      							"function",
                      							lv_function_1_0,
                      							"org.uasm.term.lang.TermDsl.FunctionTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1677:3: ( (lv_result_2_0= 'result' ) )
                    {
                    // InternalTermDsl.g:1677:3: ( (lv_result_2_0= 'result' ) )
                    // InternalTermDsl.g:1678:4: (lv_result_2_0= 'result' )
                    {
                    // InternalTermDsl.g:1678:4: (lv_result_2_0= 'result' )
                    // InternalTermDsl.g:1679:5: lv_result_2_0= 'result'
                    {
                    lv_result_2_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_result_2_0, grammarAccess.getLocationTermAccess().getResultResultKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLocationTermRule());
                      					}
                      					setWithLastConsumed(current, "result", lv_result_2_0, "result");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocationTerm"


    // $ANTLR start "entryRuleLiteral"
    // InternalTermDsl.g:1695:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTermDsl.g:1695:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTermDsl.g:1696:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTermDsl.g:1702:1: ruleLiteral returns [EObject current=null] : (this_IntervalLiteral_0= ruleIntervalLiteral | this_SetLiteral_1= ruleSetLiteral | this_ListLiteral_2= ruleListLiteral | this_BagLiteral_3= ruleBagLiteral | this_MapLiteral_4= ruleMapLiteral | this_NumberLiteral_5= ruleNumberLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_KernelLiteral_7= ruleKernelLiteral | this_StringLiteral_8= ruleStringLiteral | this_CharLiteral_9= ruleCharLiteral | ruleEnumTerm ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntervalLiteral_0 = null;

        EObject this_SetLiteral_1 = null;

        EObject this_ListLiteral_2 = null;

        EObject this_BagLiteral_3 = null;

        EObject this_MapLiteral_4 = null;

        EObject this_NumberLiteral_5 = null;

        EObject this_BooleanLiteral_6 = null;

        EObject this_KernelLiteral_7 = null;

        EObject this_StringLiteral_8 = null;

        EObject this_CharLiteral_9 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1708:2: ( (this_IntervalLiteral_0= ruleIntervalLiteral | this_SetLiteral_1= ruleSetLiteral | this_ListLiteral_2= ruleListLiteral | this_BagLiteral_3= ruleBagLiteral | this_MapLiteral_4= ruleMapLiteral | this_NumberLiteral_5= ruleNumberLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_KernelLiteral_7= ruleKernelLiteral | this_StringLiteral_8= ruleStringLiteral | this_CharLiteral_9= ruleCharLiteral | ruleEnumTerm ) )
            // InternalTermDsl.g:1709:2: (this_IntervalLiteral_0= ruleIntervalLiteral | this_SetLiteral_1= ruleSetLiteral | this_ListLiteral_2= ruleListLiteral | this_BagLiteral_3= ruleBagLiteral | this_MapLiteral_4= ruleMapLiteral | this_NumberLiteral_5= ruleNumberLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_KernelLiteral_7= ruleKernelLiteral | this_StringLiteral_8= ruleStringLiteral | this_CharLiteral_9= ruleCharLiteral | ruleEnumTerm )
            {
            // InternalTermDsl.g:1709:2: (this_IntervalLiteral_0= ruleIntervalLiteral | this_SetLiteral_1= ruleSetLiteral | this_ListLiteral_2= ruleListLiteral | this_BagLiteral_3= ruleBagLiteral | this_MapLiteral_4= ruleMapLiteral | this_NumberLiteral_5= ruleNumberLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_KernelLiteral_7= ruleKernelLiteral | this_StringLiteral_8= ruleStringLiteral | this_CharLiteral_9= ruleCharLiteral | ruleEnumTerm )
            int alt22=11;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalTermDsl.g:1710:3: this_IntervalLiteral_0= ruleIntervalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntervalLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntervalLiteral_0=ruleIntervalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntervalLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1722:3: this_SetLiteral_1= ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetLiteral_1=ruleSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:1734:3: this_ListLiteral_2= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLiteral_2=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:1746:3: this_BagLiteral_3= ruleBagLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBagLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BagLiteral_3=ruleBagLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BagLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTermDsl.g:1758:3: this_MapLiteral_4= ruleMapLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapLiteral_4=ruleMapLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTermDsl.g:1770:3: this_NumberLiteral_5= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_5=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTermDsl.g:1782:3: this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_6=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTermDsl.g:1794:3: this_KernelLiteral_7= ruleKernelLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getKernelLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KernelLiteral_7=ruleKernelLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KernelLiteral_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTermDsl.g:1806:3: this_StringLiteral_8= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_8=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTermDsl.g:1818:3: this_CharLiteral_9= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CharLiteral_9=ruleCharLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CharLiteral_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTermDsl.g:1830:3: ruleEnumTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEnumTermParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalTermDsl.g:1844:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalTermDsl.g:1844:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalTermDsl.g:1845:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalTermDsl.g:1851:1: ruleBooleanLiteral returns [EObject current=null] : ( ( () ( (lv_val_1_0= 'true' ) ) ) | ( (lv_val_2_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_2_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:1857:2: ( ( ( () ( (lv_val_1_0= 'true' ) ) ) | ( (lv_val_2_0= 'false' ) ) ) )
            // InternalTermDsl.g:1858:2: ( ( () ( (lv_val_1_0= 'true' ) ) ) | ( (lv_val_2_0= 'false' ) ) )
            {
            // InternalTermDsl.g:1858:2: ( ( () ( (lv_val_1_0= 'true' ) ) ) | ( (lv_val_2_0= 'false' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTermDsl.g:1859:3: ( () ( (lv_val_1_0= 'true' ) ) )
                    {
                    // InternalTermDsl.g:1859:3: ( () ( (lv_val_1_0= 'true' ) ) )
                    // InternalTermDsl.g:1860:4: () ( (lv_val_1_0= 'true' ) )
                    {
                    // InternalTermDsl.g:1860:4: ()
                    // InternalTermDsl.g:1861:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:1870:4: ( (lv_val_1_0= 'true' ) )
                    // InternalTermDsl.g:1871:5: (lv_val_1_0= 'true' )
                    {
                    // InternalTermDsl.g:1871:5: (lv_val_1_0= 'true' )
                    // InternalTermDsl.g:1872:6: lv_val_1_0= 'true'
                    {
                    lv_val_1_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_1_0, grammarAccess.getBooleanLiteralAccess().getValTrueKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "val", lv_val_1_0, "true");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1886:3: ( (lv_val_2_0= 'false' ) )
                    {
                    // InternalTermDsl.g:1886:3: ( (lv_val_2_0= 'false' ) )
                    // InternalTermDsl.g:1887:4: (lv_val_2_0= 'false' )
                    {
                    // InternalTermDsl.g:1887:4: (lv_val_2_0= 'false' )
                    // InternalTermDsl.g:1888:5: lv_val_2_0= 'false'
                    {
                    lv_val_2_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_2_0, grammarAccess.getBooleanLiteralAccess().getValFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      					}
                      					setWithLastConsumed(current, "val", lv_val_2_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleKernelLiteral"
    // InternalTermDsl.g:1904:1: entryRuleKernelLiteral returns [EObject current=null] : iv_ruleKernelLiteral= ruleKernelLiteral EOF ;
    public final EObject entryRuleKernelLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKernelLiteral = null;


        try {
            // InternalTermDsl.g:1904:54: (iv_ruleKernelLiteral= ruleKernelLiteral EOF )
            // InternalTermDsl.g:1905:2: iv_ruleKernelLiteral= ruleKernelLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKernelLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKernelLiteral=ruleKernelLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKernelLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKernelLiteral"


    // $ANTLR start "ruleKernelLiteral"
    // InternalTermDsl.g:1911:1: ruleKernelLiteral returns [EObject current=null] : ( ( () ( (lv_val_1_0= 'undef' ) ) ) | ( (lv_val_2_0= 'self' ) ) ) ;
    public final EObject ruleKernelLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_2_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:1917:2: ( ( ( () ( (lv_val_1_0= 'undef' ) ) ) | ( (lv_val_2_0= 'self' ) ) ) )
            // InternalTermDsl.g:1918:2: ( ( () ( (lv_val_1_0= 'undef' ) ) ) | ( (lv_val_2_0= 'self' ) ) )
            {
            // InternalTermDsl.g:1918:2: ( ( () ( (lv_val_1_0= 'undef' ) ) ) | ( (lv_val_2_0= 'self' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==41) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalTermDsl.g:1919:3: ( () ( (lv_val_1_0= 'undef' ) ) )
                    {
                    // InternalTermDsl.g:1919:3: ( () ( (lv_val_1_0= 'undef' ) ) )
                    // InternalTermDsl.g:1920:4: () ( (lv_val_1_0= 'undef' ) )
                    {
                    // InternalTermDsl.g:1920:4: ()
                    // InternalTermDsl.g:1921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getKernelLiteralAccess().getKernelLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:1930:4: ( (lv_val_1_0= 'undef' ) )
                    // InternalTermDsl.g:1931:5: (lv_val_1_0= 'undef' )
                    {
                    // InternalTermDsl.g:1931:5: (lv_val_1_0= 'undef' )
                    // InternalTermDsl.g:1932:6: lv_val_1_0= 'undef'
                    {
                    lv_val_1_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_1_0, grammarAccess.getKernelLiteralAccess().getValUndefKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getKernelLiteralRule());
                      						}
                      						setWithLastConsumed(current, "val", lv_val_1_0, "undef");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:1946:3: ( (lv_val_2_0= 'self' ) )
                    {
                    // InternalTermDsl.g:1946:3: ( (lv_val_2_0= 'self' ) )
                    // InternalTermDsl.g:1947:4: (lv_val_2_0= 'self' )
                    {
                    // InternalTermDsl.g:1947:4: (lv_val_2_0= 'self' )
                    // InternalTermDsl.g:1948:5: lv_val_2_0= 'self'
                    {
                    lv_val_2_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_2_0, grammarAccess.getKernelLiteralAccess().getValSelfKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getKernelLiteralRule());
                      					}
                      					setWithLastConsumed(current, "val", lv_val_2_0, "self");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKernelLiteral"


    // $ANTLR start "entryRuleIntervalLiteral"
    // InternalTermDsl.g:1964:1: entryRuleIntervalLiteral returns [EObject current=null] : iv_ruleIntervalLiteral= ruleIntervalLiteral EOF ;
    public final EObject entryRuleIntervalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervalLiteral = null;


        try {
            // InternalTermDsl.g:1964:56: (iv_ruleIntervalLiteral= ruleIntervalLiteral EOF )
            // InternalTermDsl.g:1965:2: iv_ruleIntervalLiteral= ruleIntervalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntervalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntervalLiteral=ruleIntervalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntervalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntervalLiteral"


    // $ANTLR start "ruleIntervalLiteral"
    // InternalTermDsl.g:1971:1: ruleIntervalLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_start_2_0= ruleLiteral ) ) otherlv_3= '..' ( (lv_end_4_0= ruleLiteral ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleIntervalLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;

        EObject lv_step_6_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:1977:2: ( ( () otherlv_1= '[' ( (lv_start_2_0= ruleLiteral ) ) otherlv_3= '..' ( (lv_end_4_0= ruleLiteral ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )? otherlv_7= ']' ) )
            // InternalTermDsl.g:1978:2: ( () otherlv_1= '[' ( (lv_start_2_0= ruleLiteral ) ) otherlv_3= '..' ( (lv_end_4_0= ruleLiteral ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )? otherlv_7= ']' )
            {
            // InternalTermDsl.g:1978:2: ( () otherlv_1= '[' ( (lv_start_2_0= ruleLiteral ) ) otherlv_3= '..' ( (lv_end_4_0= ruleLiteral ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )? otherlv_7= ']' )
            // InternalTermDsl.g:1979:3: () otherlv_1= '[' ( (lv_start_2_0= ruleLiteral ) ) otherlv_3= '..' ( (lv_end_4_0= ruleLiteral ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )? otherlv_7= ']'
            {
            // InternalTermDsl.g:1979:3: ()
            // InternalTermDsl.g:1980:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntervalLiteralAccess().getIntervalLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntervalLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTermDsl.g:1993:3: ( (lv_start_2_0= ruleLiteral ) )
            // InternalTermDsl.g:1994:4: (lv_start_2_0= ruleLiteral )
            {
            // InternalTermDsl.g:1994:4: (lv_start_2_0= ruleLiteral )
            // InternalTermDsl.g:1995:5: lv_start_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalLiteralAccess().getStartLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_start_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntervalLiteralRule());
              					}
              					set(
              						current,
              						"start",
              						lv_start_2_0,
              						"org.uasm.term.lang.TermDsl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIntervalLiteralAccess().getFullStopFullStopKeyword_3());
              		
            }
            // InternalTermDsl.g:2016:3: ( (lv_end_4_0= ruleLiteral ) )
            // InternalTermDsl.g:2017:4: (lv_end_4_0= ruleLiteral )
            {
            // InternalTermDsl.g:2017:4: (lv_end_4_0= ruleLiteral )
            // InternalTermDsl.g:2018:5: lv_end_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalLiteralAccess().getEndLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_end_4_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntervalLiteralRule());
              					}
              					set(
              						current,
              						"end",
              						lv_end_4_0,
              						"org.uasm.term.lang.TermDsl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:2035:3: (otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTermDsl.g:2036:4: otherlv_5= 'step' ( (lv_step_6_0= ruleLiteral ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIntervalLiteralAccess().getStepKeyword_5_0());
                      			
                    }
                    // InternalTermDsl.g:2040:4: ( (lv_step_6_0= ruleLiteral ) )
                    // InternalTermDsl.g:2041:5: (lv_step_6_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2041:5: (lv_step_6_0= ruleLiteral )
                    // InternalTermDsl.g:2042:6: lv_step_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIntervalLiteralAccess().getStepLiteralParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_step_6_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIntervalLiteralRule());
                      						}
                      						set(
                      							current,
                      							"step",
                      							lv_step_6_0,
                      							"org.uasm.term.lang.TermDsl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIntervalLiteralAccess().getRightSquareBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntervalLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // InternalTermDsl.g:2068:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // InternalTermDsl.g:2068:51: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // InternalTermDsl.g:2069:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // InternalTermDsl.g:2075:1: ruleSetLiteral returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_literal_2_0 = null;

        EObject lv_literal_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2081:2: ( ( ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) ) )
            // InternalTermDsl.g:2082:2: ( ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) )
            {
            // InternalTermDsl.g:2082:2: ( ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=RULE_ID && LA27_1<=RULE_TK_FLOAT)||LA27_1==21||(LA27_1>=38 && LA27_1<=42)||LA27_1==46) ) {
                    alt27=1;
                }
                else if ( (LA27_1==47) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTermDsl.g:2083:3: ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' )
                    {
                    // InternalTermDsl.g:2083:3: ( () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}' )
                    // InternalTermDsl.g:2084:4: () otherlv_1= '{' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '}'
                    {
                    // InternalTermDsl.g:2084:4: ()
                    // InternalTermDsl.g:2085:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSetLiteralAccess().getSetLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:2098:4: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalTermDsl.g:2099:5: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2099:5: (lv_literal_2_0= ruleLiteral )
                    // InternalTermDsl.g:2100:6: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSetLiteralAccess().getLiteralLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                      						}
                      						add(
                      							current,
                      							"literal",
                      							lv_literal_2_0,
                      							"org.uasm.term.lang.TermDsl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:2117:4: (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==36) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTermDsl.g:2118:5: otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:2122:5: ( (lv_literal_4_0= ruleLiteral ) )
                    	    // InternalTermDsl.g:2123:6: (lv_literal_4_0= ruleLiteral )
                    	    {
                    	    // InternalTermDsl.g:2123:6: (lv_literal_4_0= ruleLiteral )
                    	    // InternalTermDsl.g:2124:7: lv_literal_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSetLiteralAccess().getLiteralLiteralParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_literal_4_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literal",
                    	      								lv_literal_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:2148:3: (otherlv_6= '{' otherlv_7= '}' )
                    {
                    // InternalTermDsl.g:2148:3: (otherlv_6= '{' otherlv_7= '}' )
                    // InternalTermDsl.g:2149:4: otherlv_6= '{' otherlv_7= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // InternalTermDsl.g:2162:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalTermDsl.g:2162:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalTermDsl.g:2163:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // InternalTermDsl.g:2169:1: ruleListLiteral returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_literal_2_0 = null;

        EObject lv_literal_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2175:2: ( ( ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) ) )
            // InternalTermDsl.g:2176:2: ( ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) )
            {
            // InternalTermDsl.g:2176:2: ( ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==45) ) {
                    alt29=2;
                }
                else if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_TK_FLOAT)||LA29_1==21||(LA29_1>=38 && LA29_1<=42)||LA29_1==46) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTermDsl.g:2177:3: ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' )
                    {
                    // InternalTermDsl.g:2177:3: ( () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']' )
                    // InternalTermDsl.g:2178:4: () otherlv_1= '[' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= ']'
                    {
                    // InternalTermDsl.g:2178:4: ()
                    // InternalTermDsl.g:2179:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListLiteralAccess().getListLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:2192:4: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalTermDsl.g:2193:5: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2193:5: (lv_literal_2_0= ruleLiteral )
                    // InternalTermDsl.g:2194:6: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getLiteralLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListLiteralRule());
                      						}
                      						add(
                      							current,
                      							"literal",
                      							lv_literal_2_0,
                      							"org.uasm.term.lang.TermDsl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:2211:4: (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==36) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTermDsl.g:2212:5: otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:2216:5: ( (lv_literal_4_0= ruleLiteral ) )
                    	    // InternalTermDsl.g:2217:6: (lv_literal_4_0= ruleLiteral )
                    	    {
                    	    // InternalTermDsl.g:2217:6: (lv_literal_4_0= ruleLiteral )
                    	    // InternalTermDsl.g:2218:7: lv_literal_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getLiteralLiteralParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_literal_4_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literal",
                    	      								lv_literal_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:2242:3: (otherlv_6= '[' otherlv_7= ']' )
                    {
                    // InternalTermDsl.g:2242:3: (otherlv_6= '[' otherlv_7= ']' )
                    // InternalTermDsl.g:2243:4: otherlv_6= '[' otherlv_7= ']'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleBagLiteral"
    // InternalTermDsl.g:2256:1: entryRuleBagLiteral returns [EObject current=null] : iv_ruleBagLiteral= ruleBagLiteral EOF ;
    public final EObject entryRuleBagLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagLiteral = null;


        try {
            // InternalTermDsl.g:2256:51: (iv_ruleBagLiteral= ruleBagLiteral EOF )
            // InternalTermDsl.g:2257:2: iv_ruleBagLiteral= ruleBagLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBagLiteral=ruleBagLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagLiteral"


    // $ANTLR start "ruleBagLiteral"
    // InternalTermDsl.g:2263:1: ruleBagLiteral returns [EObject current=null] : ( ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) ) ;
    public final EObject ruleBagLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_literal_2_0 = null;

        EObject lv_literal_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2269:2: ( ( ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) ) )
            // InternalTermDsl.g:2270:2: ( ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) )
            {
            // InternalTermDsl.g:2270:2: ( ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==22) ) {
                    alt31=2;
                }
                else if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_TK_FLOAT)||LA31_1==21||(LA31_1>=38 && LA31_1<=42)||LA31_1==46) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalTermDsl.g:2271:3: ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' )
                    {
                    // InternalTermDsl.g:2271:3: ( () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>' )
                    // InternalTermDsl.g:2272:4: () otherlv_1= '<' ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* otherlv_5= '>'
                    {
                    // InternalTermDsl.g:2272:4: ()
                    // InternalTermDsl.g:2273:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBagLiteralAccess().getBagLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBagLiteralAccess().getLessThanSignKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:2286:4: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalTermDsl.g:2287:5: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2287:5: (lv_literal_2_0= ruleLiteral )
                    // InternalTermDsl.g:2288:6: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBagLiteralAccess().getLiteralLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBagLiteralRule());
                      						}
                      						add(
                      							current,
                      							"literal",
                      							lv_literal_2_0,
                      							"org.uasm.term.lang.TermDsl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:2305:4: (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==36) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalTermDsl.g:2306:5: otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getBagLiteralAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:2310:5: ( (lv_literal_4_0= ruleLiteral ) )
                    	    // InternalTermDsl.g:2311:6: (lv_literal_4_0= ruleLiteral )
                    	    {
                    	    // InternalTermDsl.g:2311:6: (lv_literal_4_0= ruleLiteral )
                    	    // InternalTermDsl.g:2312:7: lv_literal_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBagLiteralAccess().getLiteralLiteralParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_literal_4_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBagLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literal",
                    	      								lv_literal_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBagLiteralAccess().getGreaterThanSignKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:2336:3: (otherlv_6= '<' otherlv_7= '>' )
                    {
                    // InternalTermDsl.g:2336:3: (otherlv_6= '<' otherlv_7= '>' )
                    // InternalTermDsl.g:2337:4: otherlv_6= '<' otherlv_7= '>'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBagLiteralAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getBagLiteralAccess().getGreaterThanSignKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBagLiteral"


    // $ANTLR start "entryRuleMapLiteral"
    // InternalTermDsl.g:2350:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalTermDsl.g:2350:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalTermDsl.g:2351:2: iv_ruleMapLiteral= ruleMapLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteral=ruleMapLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteral"


    // $ANTLR start "ruleMapLiteral"
    // InternalTermDsl.g:2357:1: ruleMapLiteral returns [EObject current=null] : ( ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) ) ;
    public final EObject ruleMapLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_literal_2_0 = null;

        EObject lv_literal_4_0 = null;

        EObject lv_literal_6_0 = null;

        EObject lv_literal_8_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2363:2: ( ( ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) ) )
            // InternalTermDsl.g:2364:2: ( ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) )
            {
            // InternalTermDsl.g:2364:2: ( ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=RULE_ID && LA33_1<=RULE_TK_FLOAT)||LA33_1==21||(LA33_1>=38 && LA33_1<=42)||LA33_1==46) ) {
                    alt33=1;
                }
                else if ( (LA33_1==48) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalTermDsl.g:2365:3: ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' )
                    {
                    // InternalTermDsl.g:2365:3: ( () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}' )
                    // InternalTermDsl.g:2366:4: () otherlv_1= '{' ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) ) (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )* otherlv_9= '}'
                    {
                    // InternalTermDsl.g:2366:4: ()
                    // InternalTermDsl.g:2367:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:2380:4: ( ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) ) )
                    // InternalTermDsl.g:2381:5: ( (lv_literal_2_0= ruleLiteral ) ) otherlv_3= '->' ( (lv_literal_4_0= ruleLiteral ) )
                    {
                    // InternalTermDsl.g:2381:5: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalTermDsl.g:2382:6: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2382:6: (lv_literal_2_0= ruleLiteral )
                    // InternalTermDsl.g:2383:7: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapLiteralAccess().getLiteralLiteralParserRuleCall_0_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                      							}
                      							add(
                      								current,
                      								"literal",
                      								lv_literal_2_0,
                      								"org.uasm.term.lang.TermDsl.Literal");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getHyphenMinusGreaterThanSignKeyword_0_2_1());
                      				
                    }
                    // InternalTermDsl.g:2404:5: ( (lv_literal_4_0= ruleLiteral ) )
                    // InternalTermDsl.g:2405:6: (lv_literal_4_0= ruleLiteral )
                    {
                    // InternalTermDsl.g:2405:6: (lv_literal_4_0= ruleLiteral )
                    // InternalTermDsl.g:2406:7: lv_literal_4_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapLiteralAccess().getLiteralLiteralParserRuleCall_0_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_literal_4_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                      							}
                      							add(
                      								current,
                      								"literal",
                      								lv_literal_4_0,
                      								"org.uasm.term.lang.TermDsl.Literal");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalTermDsl.g:2424:4: (otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==36) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalTermDsl.g:2425:5: otherlv_5= ',' ( (lv_literal_6_0= ruleLiteral ) ) otherlv_7= '->' ( (lv_literal_8_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:2429:5: ( (lv_literal_6_0= ruleLiteral ) )
                    	    // InternalTermDsl.g:2430:6: (lv_literal_6_0= ruleLiteral )
                    	    {
                    	    // InternalTermDsl.g:2430:6: (lv_literal_6_0= ruleLiteral )
                    	    // InternalTermDsl.g:2431:7: lv_literal_6_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralAccess().getLiteralLiteralParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_literal_6_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literal",
                    	      								lv_literal_6_0,
                    	      								"org.uasm.term.lang.TermDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getMapLiteralAccess().getHyphenMinusGreaterThanSignKeyword_0_3_2());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:2452:5: ( (lv_literal_8_0= ruleLiteral ) )
                    	    // InternalTermDsl.g:2453:6: (lv_literal_8_0= ruleLiteral )
                    	    {
                    	    // InternalTermDsl.g:2453:6: (lv_literal_8_0= ruleLiteral )
                    	    // InternalTermDsl.g:2454:7: lv_literal_8_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralAccess().getLiteralLiteralParserRuleCall_0_3_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_literal_8_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literal",
                    	      								lv_literal_8_0,
                    	      								"org.uasm.term.lang.TermDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:2478:3: (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' )
                    {
                    // InternalTermDsl.g:2478:3: (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' )
                    // InternalTermDsl.g:2479:4: otherlv_10= '{' otherlv_11= '->' otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    otherlv_11=(Token)match(input,48,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMapLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                      			
                    }
                    otherlv_12=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapLiteral"


    // $ANTLR start "entryRuleForAllTerm"
    // InternalTermDsl.g:2496:1: entryRuleForAllTerm returns [EObject current=null] : iv_ruleForAllTerm= ruleForAllTerm EOF ;
    public final EObject entryRuleForAllTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAllTerm = null;


        try {
            // InternalTermDsl.g:2496:51: (iv_ruleForAllTerm= ruleForAllTerm EOF )
            // InternalTermDsl.g:2497:2: iv_ruleForAllTerm= ruleForAllTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAllTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForAllTerm=ruleForAllTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAllTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForAllTerm"


    // $ANTLR start "ruleForAllTerm"
    // InternalTermDsl.g:2503:1: ruleForAllTerm returns [EObject current=null] : ( () otherlv_1= 'forall' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= 'in' ( (lv_inTerm_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )* otherlv_9= 'holds' ( (lv_withTerm_10_0= ruleTerm ) ) ) ;
    public final EObject ruleForAllTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_varTerm_2_0 = null;

        EObject lv_inTerm_4_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_6_0 = null;

        EObject lv_inTerm_8_0 = null;

        EObject lv_withTerm_10_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2509:2: ( ( () otherlv_1= 'forall' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= 'in' ( (lv_inTerm_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )* otherlv_9= 'holds' ( (lv_withTerm_10_0= ruleTerm ) ) ) )
            // InternalTermDsl.g:2510:2: ( () otherlv_1= 'forall' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= 'in' ( (lv_inTerm_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )* otherlv_9= 'holds' ( (lv_withTerm_10_0= ruleTerm ) ) )
            {
            // InternalTermDsl.g:2510:2: ( () otherlv_1= 'forall' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= 'in' ( (lv_inTerm_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )* otherlv_9= 'holds' ( (lv_withTerm_10_0= ruleTerm ) ) )
            // InternalTermDsl.g:2511:3: () otherlv_1= 'forall' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= 'in' ( (lv_inTerm_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )* otherlv_9= 'holds' ( (lv_withTerm_10_0= ruleTerm ) )
            {
            // InternalTermDsl.g:2511:3: ()
            // InternalTermDsl.g:2512:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForAllTermAccess().getForAllTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForAllTermAccess().getForallKeyword_1());
              		
            }
            // InternalTermDsl.g:2525:3: ( (lv_varTerm_2_0= ruleVariableTerm ) )
            // InternalTermDsl.g:2526:4: (lv_varTerm_2_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:2526:4: (lv_varTerm_2_0= ruleVariableTerm )
            // InternalTermDsl.g:2527:5: lv_varTerm_2_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAllTermAccess().getVarTermVariableTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_2_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForAllTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_2_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForAllTermAccess().getInKeyword_3());
              		
            }
            // InternalTermDsl.g:2548:3: ( (lv_inTerm_4_0= ruleTerm ) )
            // InternalTermDsl.g:2549:4: (lv_inTerm_4_0= ruleTerm )
            {
            // InternalTermDsl.g:2549:4: (lv_inTerm_4_0= ruleTerm )
            // InternalTermDsl.g:2550:5: lv_inTerm_4_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAllTermAccess().getInTermTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_inTerm_4_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForAllTermRule());
              					}
              					add(
              						current,
              						"inTerm",
              						lv_inTerm_4_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:2567:3: (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTermDsl.g:2568:4: otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_inTerm_8_0= ruleTerm ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getForAllTermAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalTermDsl.g:2572:4: ( (lv_varTerm_6_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:2573:5: (lv_varTerm_6_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:2573:5: (lv_varTerm_6_0= ruleVariableTerm )
            	    // InternalTermDsl.g:2574:6: lv_varTerm_6_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getForAllTermAccess().getVarTermVariableTermParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_6_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getForAllTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_6_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getForAllTermAccess().getInKeyword_5_2());
            	      			
            	    }
            	    // InternalTermDsl.g:2595:4: ( (lv_inTerm_8_0= ruleTerm ) )
            	    // InternalTermDsl.g:2596:5: (lv_inTerm_8_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:2596:5: (lv_inTerm_8_0= ruleTerm )
            	    // InternalTermDsl.g:2597:6: lv_inTerm_8_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getForAllTermAccess().getInTermTermParserRuleCall_5_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_inTerm_8_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getForAllTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inTerm",
            	      							lv_inTerm_8_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_9=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getForAllTermAccess().getHoldsKeyword_6());
              		
            }
            // InternalTermDsl.g:2619:3: ( (lv_withTerm_10_0= ruleTerm ) )
            // InternalTermDsl.g:2620:4: (lv_withTerm_10_0= ruleTerm )
            {
            // InternalTermDsl.g:2620:4: (lv_withTerm_10_0= ruleTerm )
            // InternalTermDsl.g:2621:5: lv_withTerm_10_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAllTermAccess().getWithTermTermParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_withTerm_10_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForAllTermRule());
              					}
              					set(
              						current,
              						"withTerm",
              						lv_withTerm_10_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForAllTerm"


    // $ANTLR start "entryRuleExistsTerm"
    // InternalTermDsl.g:2642:1: entryRuleExistsTerm returns [EObject current=null] : iv_ruleExistsTerm= ruleExistsTerm EOF ;
    public final EObject entryRuleExistsTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsTerm = null;


        try {
            // InternalTermDsl.g:2642:51: (iv_ruleExistsTerm= ruleExistsTerm EOF )
            // InternalTermDsl.g:2643:2: iv_ruleExistsTerm= ruleExistsTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistsTerm=ruleExistsTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExistsTerm"


    // $ANTLR start "ruleExistsTerm"
    // InternalTermDsl.g:2649:1: ruleExistsTerm returns [EObject current=null] : ( () otherlv_1= 'exists' ( (lv_unique_2_0= 'unique' ) )? ( (lv_varTerm_3_0= ruleVariableTerm ) ) otherlv_4= 'in' ( (lv_inTerm_5_0= ruleTerm ) ) (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )* otherlv_10= 'with' ( (lv_withTerm_11_0= ruleTerm ) ) ) ;
    public final EObject ruleExistsTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_unique_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_varTerm_3_0 = null;

        EObject lv_inTerm_5_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_7_0 = null;

        EObject lv_inTerm_9_0 = null;

        EObject lv_withTerm_11_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2655:2: ( ( () otherlv_1= 'exists' ( (lv_unique_2_0= 'unique' ) )? ( (lv_varTerm_3_0= ruleVariableTerm ) ) otherlv_4= 'in' ( (lv_inTerm_5_0= ruleTerm ) ) (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )* otherlv_10= 'with' ( (lv_withTerm_11_0= ruleTerm ) ) ) )
            // InternalTermDsl.g:2656:2: ( () otherlv_1= 'exists' ( (lv_unique_2_0= 'unique' ) )? ( (lv_varTerm_3_0= ruleVariableTerm ) ) otherlv_4= 'in' ( (lv_inTerm_5_0= ruleTerm ) ) (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )* otherlv_10= 'with' ( (lv_withTerm_11_0= ruleTerm ) ) )
            {
            // InternalTermDsl.g:2656:2: ( () otherlv_1= 'exists' ( (lv_unique_2_0= 'unique' ) )? ( (lv_varTerm_3_0= ruleVariableTerm ) ) otherlv_4= 'in' ( (lv_inTerm_5_0= ruleTerm ) ) (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )* otherlv_10= 'with' ( (lv_withTerm_11_0= ruleTerm ) ) )
            // InternalTermDsl.g:2657:3: () otherlv_1= 'exists' ( (lv_unique_2_0= 'unique' ) )? ( (lv_varTerm_3_0= ruleVariableTerm ) ) otherlv_4= 'in' ( (lv_inTerm_5_0= ruleTerm ) ) (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )* otherlv_10= 'with' ( (lv_withTerm_11_0= ruleTerm ) )
            {
            // InternalTermDsl.g:2657:3: ()
            // InternalTermDsl.g:2658:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExistsTermAccess().getExistsTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExistsTermAccess().getExistsKeyword_1());
              		
            }
            // InternalTermDsl.g:2671:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTermDsl.g:2672:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalTermDsl.g:2672:4: (lv_unique_2_0= 'unique' )
                    // InternalTermDsl.g:2673:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,53,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_unique_2_0, grammarAccess.getExistsTermAccess().getUniqueUniqueKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExistsTermRule());
                      					}
                      					setWithLastConsumed(current, "unique", lv_unique_2_0, "unique");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTermDsl.g:2685:3: ( (lv_varTerm_3_0= ruleVariableTerm ) )
            // InternalTermDsl.g:2686:4: (lv_varTerm_3_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:2686:4: (lv_varTerm_3_0= ruleVariableTerm )
            // InternalTermDsl.g:2687:5: lv_varTerm_3_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsTermAccess().getVarTermVariableTermParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_3_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_3_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExistsTermAccess().getInKeyword_4());
              		
            }
            // InternalTermDsl.g:2708:3: ( (lv_inTerm_5_0= ruleTerm ) )
            // InternalTermDsl.g:2709:4: (lv_inTerm_5_0= ruleTerm )
            {
            // InternalTermDsl.g:2709:4: (lv_inTerm_5_0= ruleTerm )
            // InternalTermDsl.g:2710:5: lv_inTerm_5_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsTermAccess().getInTermTermParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_inTerm_5_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsTermRule());
              					}
              					add(
              						current,
              						"inTerm",
              						lv_inTerm_5_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:2727:3: (otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalTermDsl.g:2728:4: otherlv_6= ',' ( (lv_varTerm_7_0= ruleVariableTerm ) ) otherlv_8= 'in' ( (lv_inTerm_9_0= ruleTerm ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getExistsTermAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalTermDsl.g:2732:4: ( (lv_varTerm_7_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:2733:5: (lv_varTerm_7_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:2733:5: (lv_varTerm_7_0= ruleVariableTerm )
            	    // InternalTermDsl.g:2734:6: lv_varTerm_7_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExistsTermAccess().getVarTermVariableTermParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_7_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExistsTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_7_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getExistsTermAccess().getInKeyword_6_2());
            	      			
            	    }
            	    // InternalTermDsl.g:2755:4: ( (lv_inTerm_9_0= ruleTerm ) )
            	    // InternalTermDsl.g:2756:5: (lv_inTerm_9_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:2756:5: (lv_inTerm_9_0= ruleTerm )
            	    // InternalTermDsl.g:2757:6: lv_inTerm_9_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExistsTermAccess().getInTermTermParserRuleCall_6_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_inTerm_9_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExistsTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inTerm",
            	      							lv_inTerm_9_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getExistsTermAccess().getWithKeyword_7());
              		
            }
            // InternalTermDsl.g:2779:3: ( (lv_withTerm_11_0= ruleTerm ) )
            // InternalTermDsl.g:2780:4: (lv_withTerm_11_0= ruleTerm )
            {
            // InternalTermDsl.g:2780:4: (lv_withTerm_11_0= ruleTerm )
            // InternalTermDsl.g:2781:5: lv_withTerm_11_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsTermAccess().getWithTermTermParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_withTerm_11_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsTermRule());
              					}
              					set(
              						current,
              						"withTerm",
              						lv_withTerm_11_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExistsTerm"


    // $ANTLR start "entryRuleSizeOfEnumerableTerm"
    // InternalTermDsl.g:2802:1: entryRuleSizeOfEnumerableTerm returns [EObject current=null] : iv_ruleSizeOfEnumerableTerm= ruleSizeOfEnumerableTerm EOF ;
    public final EObject entryRuleSizeOfEnumerableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeOfEnumerableTerm = null;


        try {
            // InternalTermDsl.g:2802:61: (iv_ruleSizeOfEnumerableTerm= ruleSizeOfEnumerableTerm EOF )
            // InternalTermDsl.g:2803:2: iv_ruleSizeOfEnumerableTerm= ruleSizeOfEnumerableTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSizeOfEnumerableTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSizeOfEnumerableTerm=ruleSizeOfEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSizeOfEnumerableTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSizeOfEnumerableTerm"


    // $ANTLR start "ruleSizeOfEnumerableTerm"
    // InternalTermDsl.g:2809:1: ruleSizeOfEnumerableTerm returns [EObject current=null] : ( () otherlv_1= '|' ( (lv_enumTerm_2_0= ruleEnumerableTerm ) ) otherlv_3= '|' ) ;
    public final EObject ruleSizeOfEnumerableTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_enumTerm_2_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2815:2: ( ( () otherlv_1= '|' ( (lv_enumTerm_2_0= ruleEnumerableTerm ) ) otherlv_3= '|' ) )
            // InternalTermDsl.g:2816:2: ( () otherlv_1= '|' ( (lv_enumTerm_2_0= ruleEnumerableTerm ) ) otherlv_3= '|' )
            {
            // InternalTermDsl.g:2816:2: ( () otherlv_1= '|' ( (lv_enumTerm_2_0= ruleEnumerableTerm ) ) otherlv_3= '|' )
            // InternalTermDsl.g:2817:3: () otherlv_1= '|' ( (lv_enumTerm_2_0= ruleEnumerableTerm ) ) otherlv_3= '|'
            {
            // InternalTermDsl.g:2817:3: ()
            // InternalTermDsl.g:2818:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSizeOfEnumerableTermAccess().getSizeOfEnumerableTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSizeOfEnumerableTermAccess().getVerticalLineKeyword_1());
              		
            }
            // InternalTermDsl.g:2831:3: ( (lv_enumTerm_2_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:2832:4: (lv_enumTerm_2_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:2832:4: (lv_enumTerm_2_0= ruleEnumerableTerm )
            // InternalTermDsl.g:2833:5: lv_enumTerm_2_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSizeOfEnumerableTermAccess().getEnumTermEnumerableTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_enumTerm_2_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSizeOfEnumerableTermRule());
              					}
              					set(
              						current,
              						"enumTerm",
              						lv_enumTerm_2_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSizeOfEnumerableTermAccess().getVerticalLineKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSizeOfEnumerableTerm"


    // $ANTLR start "entryRulePickTerm"
    // InternalTermDsl.g:2858:1: entryRulePickTerm returns [EObject current=null] : iv_rulePickTerm= rulePickTerm EOF ;
    public final EObject entryRulePickTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickTerm = null;


        try {
            // InternalTermDsl.g:2858:49: (iv_rulePickTerm= rulePickTerm EOF )
            // InternalTermDsl.g:2859:2: iv_rulePickTerm= rulePickTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPickTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePickTerm=rulePickTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePickTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePickTerm"


    // $ANTLR start "rulePickTerm"
    // InternalTermDsl.g:2865:1: rulePickTerm returns [EObject current=null] : (otherlv_0= 'pick' ( (lv_varTerm_1_0= ruleVariableTerm ) ) otherlv_2= 'in' ( (lv_enumTerm_3_0= ruleEnumerableTerm ) ) (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )? ) ;
    public final EObject rulePickTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_varTerm_1_0 = null;

        EObject lv_enumTerm_3_0 = null;

        EObject lv_term_5_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2871:2: ( (otherlv_0= 'pick' ( (lv_varTerm_1_0= ruleVariableTerm ) ) otherlv_2= 'in' ( (lv_enumTerm_3_0= ruleEnumerableTerm ) ) (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )? ) )
            // InternalTermDsl.g:2872:2: (otherlv_0= 'pick' ( (lv_varTerm_1_0= ruleVariableTerm ) ) otherlv_2= 'in' ( (lv_enumTerm_3_0= ruleEnumerableTerm ) ) (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )? )
            {
            // InternalTermDsl.g:2872:2: (otherlv_0= 'pick' ( (lv_varTerm_1_0= ruleVariableTerm ) ) otherlv_2= 'in' ( (lv_enumTerm_3_0= ruleEnumerableTerm ) ) (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )? )
            // InternalTermDsl.g:2873:3: otherlv_0= 'pick' ( (lv_varTerm_1_0= ruleVariableTerm ) ) otherlv_2= 'in' ( (lv_enumTerm_3_0= ruleEnumerableTerm ) ) (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPickTermAccess().getPickKeyword_0());
              		
            }
            // InternalTermDsl.g:2877:3: ( (lv_varTerm_1_0= ruleVariableTerm ) )
            // InternalTermDsl.g:2878:4: (lv_varTerm_1_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:2878:4: (lv_varTerm_1_0= ruleVariableTerm )
            // InternalTermDsl.g:2879:5: lv_varTerm_1_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPickTermAccess().getVarTermVariableTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_1_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPickTermRule());
              					}
              					set(
              						current,
              						"varTerm",
              						lv_varTerm_1_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPickTermAccess().getInKeyword_2());
              		
            }
            // InternalTermDsl.g:2900:3: ( (lv_enumTerm_3_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:2901:4: (lv_enumTerm_3_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:2901:4: (lv_enumTerm_3_0= ruleEnumerableTerm )
            // InternalTermDsl.g:2902:5: lv_enumTerm_3_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPickTermAccess().getEnumTermEnumerableTermParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_enumTerm_3_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPickTermRule());
              					}
              					set(
              						current,
              						"enumTerm",
              						lv_enumTerm_3_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:2919:3: (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred68_InternalTermDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalTermDsl.g:2920:4: otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPickTermAccess().getWithKeyword_4_0());
                      			
                    }
                    // InternalTermDsl.g:2924:4: ( (lv_term_5_0= ruleTerm ) )
                    // InternalTermDsl.g:2925:5: (lv_term_5_0= ruleTerm )
                    {
                    // InternalTermDsl.g:2925:5: (lv_term_5_0= ruleTerm )
                    // InternalTermDsl.g:2926:6: lv_term_5_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPickTermAccess().getTermTermParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_term_5_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPickTermRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_5_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePickTerm"


    // $ANTLR start "entryRuleConditionalTerm"
    // InternalTermDsl.g:2948:1: entryRuleConditionalTerm returns [EObject current=null] : iv_ruleConditionalTerm= ruleConditionalTerm EOF ;
    public final EObject entryRuleConditionalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalTerm = null;


        try {
            // InternalTermDsl.g:2948:56: (iv_ruleConditionalTerm= ruleConditionalTerm EOF )
            // InternalTermDsl.g:2949:2: iv_ruleConditionalTerm= ruleConditionalTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalTerm=ruleConditionalTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalTerm"


    // $ANTLR start "ruleConditionalTerm"
    // InternalTermDsl.g:2955:1: ruleConditionalTerm returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerm ) ) otherlv_2= 'then' ( (lv_thenTerm_3_0= ruleTerm ) ) otherlv_4= 'else' ( (lv_elseTerm_5_0= ruleTerm ) ) (otherlv_6= 'endif' )? ) ;
    public final EObject ruleConditionalTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_thenTerm_3_0 = null;

        EObject lv_elseTerm_5_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:2961:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerm ) ) otherlv_2= 'then' ( (lv_thenTerm_3_0= ruleTerm ) ) otherlv_4= 'else' ( (lv_elseTerm_5_0= ruleTerm ) ) (otherlv_6= 'endif' )? ) )
            // InternalTermDsl.g:2962:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerm ) ) otherlv_2= 'then' ( (lv_thenTerm_3_0= ruleTerm ) ) otherlv_4= 'else' ( (lv_elseTerm_5_0= ruleTerm ) ) (otherlv_6= 'endif' )? )
            {
            // InternalTermDsl.g:2962:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerm ) ) otherlv_2= 'then' ( (lv_thenTerm_3_0= ruleTerm ) ) otherlv_4= 'else' ( (lv_elseTerm_5_0= ruleTerm ) ) (otherlv_6= 'endif' )? )
            // InternalTermDsl.g:2963:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleTerm ) ) otherlv_2= 'then' ( (lv_thenTerm_3_0= ruleTerm ) ) otherlv_4= 'else' ( (lv_elseTerm_5_0= ruleTerm ) ) (otherlv_6= 'endif' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionalTermAccess().getIfKeyword_0());
              		
            }
            // InternalTermDsl.g:2967:3: ( (lv_cond_1_0= ruleTerm ) )
            // InternalTermDsl.g:2968:4: (lv_cond_1_0= ruleTerm )
            {
            // InternalTermDsl.g:2968:4: (lv_cond_1_0= ruleTerm )
            // InternalTermDsl.g:2969:5: lv_cond_1_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalTermAccess().getCondTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_cond_1_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalTermRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConditionalTermAccess().getThenKeyword_2());
              		
            }
            // InternalTermDsl.g:2990:3: ( (lv_thenTerm_3_0= ruleTerm ) )
            // InternalTermDsl.g:2991:4: (lv_thenTerm_3_0= ruleTerm )
            {
            // InternalTermDsl.g:2991:4: (lv_thenTerm_3_0= ruleTerm )
            // InternalTermDsl.g:2992:5: lv_thenTerm_3_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalTermAccess().getThenTermTermParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_thenTerm_3_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalTermRule());
              					}
              					set(
              						current,
              						"thenTerm",
              						lv_thenTerm_3_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConditionalTermAccess().getElseKeyword_4());
              		
            }
            // InternalTermDsl.g:3013:3: ( (lv_elseTerm_5_0= ruleTerm ) )
            // InternalTermDsl.g:3014:4: (lv_elseTerm_5_0= ruleTerm )
            {
            // InternalTermDsl.g:3014:4: (lv_elseTerm_5_0= ruleTerm )
            // InternalTermDsl.g:3015:5: lv_elseTerm_5_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalTermAccess().getElseTermTermParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_elseTerm_5_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalTermRule());
              					}
              					set(
              						current,
              						"elseTerm",
              						lv_elseTerm_5_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:3032:3: (otherlv_6= 'endif' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred69_InternalTermDsl()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalTermDsl.g:3033:4: otherlv_6= 'endif'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConditionalTermAccess().getEndifKeyword_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConditionalTerm"


    // $ANTLR start "entryRuleCaseTerm"
    // InternalTermDsl.g:3042:1: entryRuleCaseTerm returns [EObject current=null] : iv_ruleCaseTerm= ruleCaseTerm EOF ;
    public final EObject entryRuleCaseTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseTerm = null;


        try {
            // InternalTermDsl.g:3042:49: (iv_ruleCaseTerm= ruleCaseTerm EOF )
            // InternalTermDsl.g:3043:2: iv_ruleCaseTerm= ruleCaseTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseTerm=ruleCaseTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseTerm"


    // $ANTLR start "ruleCaseTerm"
    // InternalTermDsl.g:3049:1: ruleCaseTerm returns [EObject current=null] : (otherlv_0= 'case' ( (lv_caseTerm_1_0= ruleTerm ) ) otherlv_2= 'of' ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+ (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )? otherlv_8= 'endcase' ) ;
    public final EObject ruleCaseTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_caseTerm_1_0 = null;

        EObject lv_term_3_0 = null;

        EObject lv_termAction_5_0 = null;

        EObject lv_otherwiseTerm_7_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3055:2: ( (otherlv_0= 'case' ( (lv_caseTerm_1_0= ruleTerm ) ) otherlv_2= 'of' ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+ (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )? otherlv_8= 'endcase' ) )
            // InternalTermDsl.g:3056:2: (otherlv_0= 'case' ( (lv_caseTerm_1_0= ruleTerm ) ) otherlv_2= 'of' ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+ (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )? otherlv_8= 'endcase' )
            {
            // InternalTermDsl.g:3056:2: (otherlv_0= 'case' ( (lv_caseTerm_1_0= ruleTerm ) ) otherlv_2= 'of' ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+ (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )? otherlv_8= 'endcase' )
            // InternalTermDsl.g:3057:3: otherlv_0= 'case' ( (lv_caseTerm_1_0= ruleTerm ) ) otherlv_2= 'of' ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+ (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )? otherlv_8= 'endcase'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseTermAccess().getCaseKeyword_0());
              		
            }
            // InternalTermDsl.g:3061:3: ( (lv_caseTerm_1_0= ruleTerm ) )
            // InternalTermDsl.g:3062:4: (lv_caseTerm_1_0= ruleTerm )
            {
            // InternalTermDsl.g:3062:4: (lv_caseTerm_1_0= ruleTerm )
            // InternalTermDsl.g:3063:5: lv_caseTerm_1_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseTermAccess().getCaseTermTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_caseTerm_1_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseTermRule());
              					}
              					set(
              						current,
              						"caseTerm",
              						lv_caseTerm_1_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseTermAccess().getOfKeyword_2());
              		
            }
            // InternalTermDsl.g:3084:3: ( ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_TK_FLOAT)||LA39_0==21||LA39_0==27||(LA39_0>=33 && LA39_0<=34)||(LA39_0>=37 && LA39_0<=42)||LA39_0==46||LA39_0==49||LA39_0==52||(LA39_0>=55 && LA39_0<=57)||LA39_0==61||(LA39_0>=65 && LA39_0<=67)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalTermDsl.g:3085:4: ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ':' ( (lv_termAction_5_0= ruleTerm ) )
            	    {
            	    // InternalTermDsl.g:3085:4: ( (lv_term_3_0= ruleTerm ) )
            	    // InternalTermDsl.g:3086:5: (lv_term_3_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:3086:5: (lv_term_3_0= ruleTerm )
            	    // InternalTermDsl.g:3087:6: lv_term_3_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCaseTermAccess().getTermTermParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_term_3_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCaseTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"term",
            	      							lv_term_3_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCaseTermAccess().getColonKeyword_3_1());
            	      			
            	    }
            	    // InternalTermDsl.g:3108:4: ( (lv_termAction_5_0= ruleTerm ) )
            	    // InternalTermDsl.g:3109:5: (lv_termAction_5_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:3109:5: (lv_termAction_5_0= ruleTerm )
            	    // InternalTermDsl.g:3110:6: lv_termAction_5_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCaseTermAccess().getTermActionTermParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_termAction_5_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCaseTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"termAction",
            	      							lv_termAction_5_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // InternalTermDsl.g:3128:3: (otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTermDsl.g:3129:4: otherlv_6= 'otherwise' ( (lv_otherwiseTerm_7_0= ruleTerm ) )
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCaseTermAccess().getOtherwiseKeyword_4_0());
                      			
                    }
                    // InternalTermDsl.g:3133:4: ( (lv_otherwiseTerm_7_0= ruleTerm ) )
                    // InternalTermDsl.g:3134:5: (lv_otherwiseTerm_7_0= ruleTerm )
                    {
                    // InternalTermDsl.g:3134:5: (lv_otherwiseTerm_7_0= ruleTerm )
                    // InternalTermDsl.g:3135:6: lv_otherwiseTerm_7_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCaseTermAccess().getOtherwiseTermTermParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_otherwiseTerm_7_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCaseTermRule());
                      						}
                      						set(
                      							current,
                      							"otherwiseTerm",
                      							lv_otherwiseTerm_7_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getCaseTermAccess().getEndcaseKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCaseTerm"


    // $ANTLR start "entryRuleLetTerm"
    // InternalTermDsl.g:3161:1: entryRuleLetTerm returns [EObject current=null] : iv_ruleLetTerm= ruleLetTerm EOF ;
    public final EObject entryRuleLetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetTerm = null;


        try {
            // InternalTermDsl.g:3161:48: (iv_ruleLetTerm= ruleLetTerm EOF )
            // InternalTermDsl.g:3162:2: iv_ruleLetTerm= ruleLetTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetTerm=ruleLetTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetTerm"


    // $ANTLR start "ruleLetTerm"
    // InternalTermDsl.g:3168:1: ruleLetTerm returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= '=' ( (lv_term_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= 'in' ( (lv_body_10_0= ruleTerm ) ) ) ;
    public final EObject ruleLetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_varTerm_2_0 = null;

        EObject lv_term_4_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_6_0 = null;

        EObject lv_term_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3174:2: ( ( () otherlv_1= 'let' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= '=' ( (lv_term_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= 'in' ( (lv_body_10_0= ruleTerm ) ) ) )
            // InternalTermDsl.g:3175:2: ( () otherlv_1= 'let' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= '=' ( (lv_term_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= 'in' ( (lv_body_10_0= ruleTerm ) ) )
            {
            // InternalTermDsl.g:3175:2: ( () otherlv_1= 'let' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= '=' ( (lv_term_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= 'in' ( (lv_body_10_0= ruleTerm ) ) )
            // InternalTermDsl.g:3176:3: () otherlv_1= 'let' ( (lv_varTerm_2_0= ruleVariableTerm ) ) otherlv_3= '=' ( (lv_term_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= 'in' ( (lv_body_10_0= ruleTerm ) )
            {
            // InternalTermDsl.g:3176:3: ()
            // InternalTermDsl.g:3177:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetTermAccess().getLetTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetTermAccess().getLetKeyword_1());
              		
            }
            // InternalTermDsl.g:3190:3: ( (lv_varTerm_2_0= ruleVariableTerm ) )
            // InternalTermDsl.g:3191:4: (lv_varTerm_2_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:3191:4: (lv_varTerm_2_0= ruleVariableTerm )
            // InternalTermDsl.g:3192:5: lv_varTerm_2_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetTermAccess().getVarTermVariableTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_varTerm_2_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_2_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLetTermAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalTermDsl.g:3213:3: ( (lv_term_4_0= ruleTerm ) )
            // InternalTermDsl.g:3214:4: (lv_term_4_0= ruleTerm )
            {
            // InternalTermDsl.g:3214:4: (lv_term_4_0= ruleTerm )
            // InternalTermDsl.g:3215:5: lv_term_4_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetTermAccess().getTermTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_term_4_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetTermRule());
              					}
              					add(
              						current,
              						"term",
              						lv_term_4_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:3232:3: (otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==36) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTermDsl.g:3233:4: otherlv_5= ',' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= '=' ( (lv_term_8_0= ruleTerm ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getLetTermAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalTermDsl.g:3237:4: ( (lv_varTerm_6_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:3238:5: (lv_varTerm_6_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:3238:5: (lv_varTerm_6_0= ruleVariableTerm )
            	    // InternalTermDsl.g:3239:6: lv_varTerm_6_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetTermAccess().getVarTermVariableTermParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_varTerm_6_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_6_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getLetTermAccess().getEqualsSignKeyword_5_2());
            	      			
            	    }
            	    // InternalTermDsl.g:3260:4: ( (lv_term_8_0= ruleTerm ) )
            	    // InternalTermDsl.g:3261:5: (lv_term_8_0= ruleTerm )
            	    {
            	    // InternalTermDsl.g:3261:5: (lv_term_8_0= ruleTerm )
            	    // InternalTermDsl.g:3262:6: lv_term_8_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetTermAccess().getTermTermParserRuleCall_5_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_term_8_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"term",
            	      							lv_term_8_0,
            	      							"org.uasm.term.lang.TermDsl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_9=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getLetTermAccess().getInKeyword_6());
              		
            }
            // InternalTermDsl.g:3284:3: ( (lv_body_10_0= ruleTerm ) )
            // InternalTermDsl.g:3285:4: (lv_body_10_0= ruleTerm )
            {
            // InternalTermDsl.g:3285:4: (lv_body_10_0= ruleTerm )
            // InternalTermDsl.g:3286:5: lv_body_10_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetTermAccess().getBodyTermParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetTermRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetTerm"


    // $ANTLR start "entryRuleRuleAsTerm"
    // InternalTermDsl.g:3307:1: entryRuleRuleAsTerm returns [EObject current=null] : iv_ruleRuleAsTerm= ruleRuleAsTerm EOF ;
    public final EObject entryRuleRuleAsTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleAsTerm = null;


        try {
            // InternalTermDsl.g:3307:51: (iv_ruleRuleAsTerm= ruleRuleAsTerm EOF )
            // InternalTermDsl.g:3308:2: iv_ruleRuleAsTerm= ruleRuleAsTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleAsTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleAsTerm=ruleRuleAsTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleAsTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleAsTerm"


    // $ANTLR start "ruleRuleAsTerm"
    // InternalTermDsl.g:3314:1: ruleRuleAsTerm returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_rule_2_0= ruleIdRule ) ) ) ;
    public final EObject ruleRuleAsTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3320:2: ( ( () otherlv_1= '@' ( (lv_rule_2_0= ruleIdRule ) ) ) )
            // InternalTermDsl.g:3321:2: ( () otherlv_1= '@' ( (lv_rule_2_0= ruleIdRule ) ) )
            {
            // InternalTermDsl.g:3321:2: ( () otherlv_1= '@' ( (lv_rule_2_0= ruleIdRule ) ) )
            // InternalTermDsl.g:3322:3: () otherlv_1= '@' ( (lv_rule_2_0= ruleIdRule ) )
            {
            // InternalTermDsl.g:3322:3: ()
            // InternalTermDsl.g:3323:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRuleAsTermAccess().getRuleAsTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRuleAsTermAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalTermDsl.g:3336:3: ( (lv_rule_2_0= ruleIdRule ) )
            // InternalTermDsl.g:3337:4: (lv_rule_2_0= ruleIdRule )
            {
            // InternalTermDsl.g:3337:4: (lv_rule_2_0= ruleIdRule )
            // InternalTermDsl.g:3338:5: lv_rule_2_0= ruleIdRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAsTermAccess().getRuleIdRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rule_2_0=ruleIdRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleAsTermRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_2_0,
              						"org.uasm.term.lang.TermDsl.IdRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRuleAsTerm"


    // $ANTLR start "entryRuleReturnTerm"
    // InternalTermDsl.g:3359:1: entryRuleReturnTerm returns [EObject current=null] : iv_ruleReturnTerm= ruleReturnTerm EOF ;
    public final EObject entryRuleReturnTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTerm = null;


        try {
            // InternalTermDsl.g:3359:51: (iv_ruleReturnTerm= ruleReturnTerm EOF )
            // InternalTermDsl.g:3360:2: iv_ruleReturnTerm= ruleReturnTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnTerm=ruleReturnTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnTerm"


    // $ANTLR start "ruleReturnTerm"
    // InternalTermDsl.g:3366:1: ruleReturnTerm returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= 'in' ) ;
    public final EObject ruleReturnTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3372:2: ( ( () otherlv_1= 'return' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= 'in' ) )
            // InternalTermDsl.g:3373:2: ( () otherlv_1= 'return' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= 'in' )
            {
            // InternalTermDsl.g:3373:2: ( () otherlv_1= 'return' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= 'in' )
            // InternalTermDsl.g:3374:3: () otherlv_1= 'return' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= 'in'
            {
            // InternalTermDsl.g:3374:3: ()
            // InternalTermDsl.g:3375:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnTermAccess().getReturnTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnTermAccess().getReturnKeyword_1());
              		
            }
            // InternalTermDsl.g:3388:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalTermDsl.g:3389:4: (lv_term_2_0= ruleTerm )
            {
            // InternalTermDsl.g:3389:4: (lv_term_2_0= ruleTerm )
            // InternalTermDsl.g:3390:5: lv_term_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnTermAccess().getTermTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_term_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnTermRule());
              					}
              					set(
              						current,
              						"term",
              						lv_term_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReturnTermAccess().getInKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturnTerm"


    // $ANTLR start "entryRuleComprehensionTerm"
    // InternalTermDsl.g:3415:1: entryRuleComprehensionTerm returns [EObject current=null] : iv_ruleComprehensionTerm= ruleComprehensionTerm EOF ;
    public final EObject entryRuleComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComprehensionTerm = null;


        try {
            // InternalTermDsl.g:3415:58: (iv_ruleComprehensionTerm= ruleComprehensionTerm EOF )
            // InternalTermDsl.g:3416:2: iv_ruleComprehensionTerm= ruleComprehensionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComprehensionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComprehensionTerm=ruleComprehensionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComprehensionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComprehensionTerm"


    // $ANTLR start "ruleComprehensionTerm"
    // InternalTermDsl.g:3422:1: ruleComprehensionTerm returns [EObject current=null] : (this_SetComprehensionTerm_0= ruleSetComprehensionTerm | this_ListComprehensionTerm_1= ruleListComprehensionTerm | this_MapComprehensionTerm_2= ruleMapComprehensionTerm | this_BagComprehensionTerm_3= ruleBagComprehensionTerm | this_NumberRangeTerm_4= ruleNumberRangeTerm ) ;
    public final EObject ruleComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_SetComprehensionTerm_0 = null;

        EObject this_ListComprehensionTerm_1 = null;

        EObject this_MapComprehensionTerm_2 = null;

        EObject this_BagComprehensionTerm_3 = null;

        EObject this_NumberRangeTerm_4 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3428:2: ( (this_SetComprehensionTerm_0= ruleSetComprehensionTerm | this_ListComprehensionTerm_1= ruleListComprehensionTerm | this_MapComprehensionTerm_2= ruleMapComprehensionTerm | this_BagComprehensionTerm_3= ruleBagComprehensionTerm | this_NumberRangeTerm_4= ruleNumberRangeTerm ) )
            // InternalTermDsl.g:3429:2: (this_SetComprehensionTerm_0= ruleSetComprehensionTerm | this_ListComprehensionTerm_1= ruleListComprehensionTerm | this_MapComprehensionTerm_2= ruleMapComprehensionTerm | this_BagComprehensionTerm_3= ruleBagComprehensionTerm | this_NumberRangeTerm_4= ruleNumberRangeTerm )
            {
            // InternalTermDsl.g:3429:2: (this_SetComprehensionTerm_0= ruleSetComprehensionTerm | this_ListComprehensionTerm_1= ruleListComprehensionTerm | this_MapComprehensionTerm_2= ruleMapComprehensionTerm | this_BagComprehensionTerm_3= ruleBagComprehensionTerm | this_NumberRangeTerm_4= ruleNumberRangeTerm )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred73_InternalTermDsl()) ) {
                    alt42=1;
                }
                else if ( (synpred75_InternalTermDsl()) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA42_2 = input.LA(2);

                if ( (synpred74_InternalTermDsl()) ) {
                    alt42=2;
                }
                else if ( (true) ) {
                    alt42=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalTermDsl.g:3430:3: this_SetComprehensionTerm_0= ruleSetComprehensionTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComprehensionTermAccess().getSetComprehensionTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetComprehensionTerm_0=ruleSetComprehensionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetComprehensionTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:3442:3: this_ListComprehensionTerm_1= ruleListComprehensionTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComprehensionTermAccess().getListComprehensionTermParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListComprehensionTerm_1=ruleListComprehensionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListComprehensionTerm_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:3454:3: this_MapComprehensionTerm_2= ruleMapComprehensionTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComprehensionTermAccess().getMapComprehensionTermParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapComprehensionTerm_2=ruleMapComprehensionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapComprehensionTerm_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:3466:3: this_BagComprehensionTerm_3= ruleBagComprehensionTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComprehensionTermAccess().getBagComprehensionTermParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BagComprehensionTerm_3=ruleBagComprehensionTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BagComprehensionTerm_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTermDsl.g:3478:3: this_NumberRangeTerm_4= ruleNumberRangeTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComprehensionTermAccess().getNumberRangeTermParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberRangeTerm_4=ruleNumberRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberRangeTerm_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComprehensionTerm"


    // $ANTLR start "entryRuleSetComprehensionTerm"
    // InternalTermDsl.g:3493:1: entryRuleSetComprehensionTerm returns [EObject current=null] : iv_ruleSetComprehensionTerm= ruleSetComprehensionTerm EOF ;
    public final EObject entryRuleSetComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetComprehensionTerm = null;


        try {
            // InternalTermDsl.g:3493:61: (iv_ruleSetComprehensionTerm= ruleSetComprehensionTerm EOF )
            // InternalTermDsl.g:3494:2: iv_ruleSetComprehensionTerm= ruleSetComprehensionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetComprehensionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetComprehensionTerm=ruleSetComprehensionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetComprehensionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetComprehensionTerm"


    // $ANTLR start "ruleSetComprehensionTerm"
    // InternalTermDsl.g:3500:1: ruleSetComprehensionTerm returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSetComprehensionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_term_2_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_4_0 = null;

        EObject lv_enumTerm_6_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_8_0 = null;

        EObject lv_enumTerm_10_0 = null;

        EObject lv_termWith_12_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3506:2: ( ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '}' ) )
            // InternalTermDsl.g:3507:2: ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '}' )
            {
            // InternalTermDsl.g:3507:2: ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '}' )
            // InternalTermDsl.g:3508:3: () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '}'
            {
            // InternalTermDsl.g:3508:3: ()
            // InternalTermDsl.g:3509:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSetComprehensionTermAccess().getSetComprehensionTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetComprehensionTermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTermDsl.g:3522:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalTermDsl.g:3523:4: (lv_term_2_0= ruleTerm )
            {
            // InternalTermDsl.g:3523:4: (lv_term_2_0= ruleTerm )
            // InternalTermDsl.g:3524:5: lv_term_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getTermTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_term_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
              					}
              					set(
              						current,
              						"term",
              						lv_term_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSetComprehensionTermAccess().getVerticalLineKeyword_3());
              		
            }
            // InternalTermDsl.g:3545:3: ( (lv_varTerm_4_0= ruleVariableTerm ) )
            // InternalTermDsl.g:3546:4: (lv_varTerm_4_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:3546:4: (lv_varTerm_4_0= ruleVariableTerm )
            // InternalTermDsl.g:3547:5: lv_varTerm_4_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getVarTermVariableTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_4_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_4_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSetComprehensionTermAccess().getInKeyword_5());
              		
            }
            // InternalTermDsl.g:3568:3: ( (lv_enumTerm_6_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:3569:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:3569:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            // InternalTermDsl.g:3570:5: lv_enumTerm_6_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_enumTerm_6_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
              					}
              					add(
              						current,
              						"enumTerm",
              						lv_enumTerm_6_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:3587:3: (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==36) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalTermDsl.g:3588:4: otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getSetComprehensionTermAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalTermDsl.g:3592:4: ( (lv_varTerm_8_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:3593:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:3593:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    // InternalTermDsl.g:3594:6: lv_varTerm_8_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getVarTermVariableTermParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_8_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_8_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getSetComprehensionTermAccess().getInKeyword_7_2());
            	      			
            	    }
            	    // InternalTermDsl.g:3615:4: ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    // InternalTermDsl.g:3616:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    {
            	    // InternalTermDsl.g:3616:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    // InternalTermDsl.g:3617:6: lv_enumTerm_10_0= ruleEnumerableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_7_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_enumTerm_10_0=ruleEnumerableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumTerm",
            	      							lv_enumTerm_10_0,
            	      							"org.uasm.term.lang.TermDsl.EnumerableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalTermDsl.g:3635:3: (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTermDsl.g:3636:4: otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) )
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSetComprehensionTermAccess().getWithKeyword_8_0());
                      			
                    }
                    // InternalTermDsl.g:3640:4: ( (lv_termWith_12_0= ruleTerm ) )
                    // InternalTermDsl.g:3641:5: (lv_termWith_12_0= ruleTerm )
                    {
                    // InternalTermDsl.g:3641:5: (lv_termWith_12_0= ruleTerm )
                    // InternalTermDsl.g:3642:6: lv_termWith_12_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSetComprehensionTermAccess().getTermWithTermParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_termWith_12_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSetComprehensionTermRule());
                      						}
                      						set(
                      							current,
                      							"termWith",
                      							lv_termWith_12_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getSetComprehensionTermAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSetComprehensionTerm"


    // $ANTLR start "entryRuleListComprehensionTerm"
    // InternalTermDsl.g:3668:1: entryRuleListComprehensionTerm returns [EObject current=null] : iv_ruleListComprehensionTerm= ruleListComprehensionTerm EOF ;
    public final EObject entryRuleListComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListComprehensionTerm = null;


        try {
            // InternalTermDsl.g:3668:62: (iv_ruleListComprehensionTerm= ruleListComprehensionTerm EOF )
            // InternalTermDsl.g:3669:2: iv_ruleListComprehensionTerm= ruleListComprehensionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListComprehensionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListComprehensionTerm=ruleListComprehensionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListComprehensionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListComprehensionTerm"


    // $ANTLR start "ruleListComprehensionTerm"
    // InternalTermDsl.g:3675:1: ruleListComprehensionTerm returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= ']' ) ;
    public final EObject ruleListComprehensionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_term_2_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_4_0 = null;

        EObject lv_enumTerm_6_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_8_0 = null;

        EObject lv_enumTerm_10_0 = null;

        EObject lv_termWith_12_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3681:2: ( ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= ']' ) )
            // InternalTermDsl.g:3682:2: ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= ']' )
            {
            // InternalTermDsl.g:3682:2: ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= ']' )
            // InternalTermDsl.g:3683:3: () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= ']'
            {
            // InternalTermDsl.g:3683:3: ()
            // InternalTermDsl.g:3684:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListComprehensionTermAccess().getListComprehensionTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListComprehensionTermAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTermDsl.g:3697:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalTermDsl.g:3698:4: (lv_term_2_0= ruleTerm )
            {
            // InternalTermDsl.g:3698:4: (lv_term_2_0= ruleTerm )
            // InternalTermDsl.g:3699:5: lv_term_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListComprehensionTermAccess().getTermTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_term_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
              					}
              					set(
              						current,
              						"term",
              						lv_term_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListComprehensionTermAccess().getVerticalLineKeyword_3());
              		
            }
            // InternalTermDsl.g:3720:3: ( (lv_varTerm_4_0= ruleVariableTerm ) )
            // InternalTermDsl.g:3721:4: (lv_varTerm_4_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:3721:4: (lv_varTerm_4_0= ruleVariableTerm )
            // InternalTermDsl.g:3722:5: lv_varTerm_4_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListComprehensionTermAccess().getVarTermVariableTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_4_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_4_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListComprehensionTermAccess().getInKeyword_5());
              		
            }
            // InternalTermDsl.g:3743:3: ( (lv_enumTerm_6_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:3744:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:3744:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            // InternalTermDsl.g:3745:5: lv_enumTerm_6_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_enumTerm_6_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
              					}
              					add(
              						current,
              						"enumTerm",
              						lv_enumTerm_6_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:3762:3: (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==36) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalTermDsl.g:3763:4: otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getListComprehensionTermAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalTermDsl.g:3767:4: ( (lv_varTerm_8_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:3768:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:3768:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    // InternalTermDsl.g:3769:6: lv_varTerm_8_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListComprehensionTermAccess().getVarTermVariableTermParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_8_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_8_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getListComprehensionTermAccess().getInKeyword_7_2());
            	      			
            	    }
            	    // InternalTermDsl.g:3790:4: ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    // InternalTermDsl.g:3791:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    {
            	    // InternalTermDsl.g:3791:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    // InternalTermDsl.g:3792:6: lv_enumTerm_10_0= ruleEnumerableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_7_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_enumTerm_10_0=ruleEnumerableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumTerm",
            	      							lv_enumTerm_10_0,
            	      							"org.uasm.term.lang.TermDsl.EnumerableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalTermDsl.g:3810:3: (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTermDsl.g:3811:4: otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) )
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getListComprehensionTermAccess().getWithKeyword_8_0());
                      			
                    }
                    // InternalTermDsl.g:3815:4: ( (lv_termWith_12_0= ruleTerm ) )
                    // InternalTermDsl.g:3816:5: (lv_termWith_12_0= ruleTerm )
                    {
                    // InternalTermDsl.g:3816:5: (lv_termWith_12_0= ruleTerm )
                    // InternalTermDsl.g:3817:6: lv_termWith_12_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListComprehensionTermAccess().getTermWithTermParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_termWith_12_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListComprehensionTermRule());
                      						}
                      						set(
                      							current,
                      							"termWith",
                      							lv_termWith_12_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getListComprehensionTermAccess().getRightSquareBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleListComprehensionTerm"


    // $ANTLR start "entryRuleBagComprehensionTerm"
    // InternalTermDsl.g:3843:1: entryRuleBagComprehensionTerm returns [EObject current=null] : iv_ruleBagComprehensionTerm= ruleBagComprehensionTerm EOF ;
    public final EObject entryRuleBagComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagComprehensionTerm = null;


        try {
            // InternalTermDsl.g:3843:61: (iv_ruleBagComprehensionTerm= ruleBagComprehensionTerm EOF )
            // InternalTermDsl.g:3844:2: iv_ruleBagComprehensionTerm= ruleBagComprehensionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagComprehensionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBagComprehensionTerm=ruleBagComprehensionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagComprehensionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagComprehensionTerm"


    // $ANTLR start "ruleBagComprehensionTerm"
    // InternalTermDsl.g:3850:1: ruleBagComprehensionTerm returns [EObject current=null] : ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '>' ) ;
    public final EObject ruleBagComprehensionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_term_2_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_4_0 = null;

        EObject lv_enumTerm_6_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_8_0 = null;

        EObject lv_enumTerm_10_0 = null;

        EObject lv_termWith_12_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:3856:2: ( ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '>' ) )
            // InternalTermDsl.g:3857:2: ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '>' )
            {
            // InternalTermDsl.g:3857:2: ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '>' )
            // InternalTermDsl.g:3858:3: () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '|' ( (lv_varTerm_4_0= ruleVariableTerm ) ) otherlv_5= 'in' ( (lv_enumTerm_6_0= ruleEnumerableTerm ) ) (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )* (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )? otherlv_13= '>'
            {
            // InternalTermDsl.g:3858:3: ()
            // InternalTermDsl.g:3859:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBagComprehensionTermAccess().getBagComprehensionTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBagComprehensionTermAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalTermDsl.g:3872:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalTermDsl.g:3873:4: (lv_term_2_0= ruleTerm )
            {
            // InternalTermDsl.g:3873:4: (lv_term_2_0= ruleTerm )
            // InternalTermDsl.g:3874:5: lv_term_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getTermTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_term_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
              					}
              					set(
              						current,
              						"term",
              						lv_term_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBagComprehensionTermAccess().getVerticalLineKeyword_3());
              		
            }
            // InternalTermDsl.g:3895:3: ( (lv_varTerm_4_0= ruleVariableTerm ) )
            // InternalTermDsl.g:3896:4: (lv_varTerm_4_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:3896:4: (lv_varTerm_4_0= ruleVariableTerm )
            // InternalTermDsl.g:3897:5: lv_varTerm_4_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getVarTermVariableTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_4_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_4_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBagComprehensionTermAccess().getInKeyword_5());
              		
            }
            // InternalTermDsl.g:3918:3: ( (lv_enumTerm_6_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:3919:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:3919:4: (lv_enumTerm_6_0= ruleEnumerableTerm )
            // InternalTermDsl.g:3920:5: lv_enumTerm_6_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_enumTerm_6_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
              					}
              					add(
              						current,
              						"enumTerm",
              						lv_enumTerm_6_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:3937:3: (otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==36) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalTermDsl.g:3938:4: otherlv_7= ',' ( (lv_varTerm_8_0= ruleVariableTerm ) ) otherlv_9= 'in' ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getBagComprehensionTermAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalTermDsl.g:3942:4: ( (lv_varTerm_8_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:3943:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:3943:5: (lv_varTerm_8_0= ruleVariableTerm )
            	    // InternalTermDsl.g:3944:6: lv_varTerm_8_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getVarTermVariableTermParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_8_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_8_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getBagComprehensionTermAccess().getInKeyword_7_2());
            	      			
            	    }
            	    // InternalTermDsl.g:3965:4: ( (lv_enumTerm_10_0= ruleEnumerableTerm ) )
            	    // InternalTermDsl.g:3966:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    {
            	    // InternalTermDsl.g:3966:5: (lv_enumTerm_10_0= ruleEnumerableTerm )
            	    // InternalTermDsl.g:3967:6: lv_enumTerm_10_0= ruleEnumerableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_7_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_enumTerm_10_0=ruleEnumerableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumTerm",
            	      							lv_enumTerm_10_0,
            	      							"org.uasm.term.lang.TermDsl.EnumerableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalTermDsl.g:3985:3: (otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTermDsl.g:3986:4: otherlv_11= 'with' ( (lv_termWith_12_0= ruleTerm ) )
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getBagComprehensionTermAccess().getWithKeyword_8_0());
                      			
                    }
                    // InternalTermDsl.g:3990:4: ( (lv_termWith_12_0= ruleTerm ) )
                    // InternalTermDsl.g:3991:5: (lv_termWith_12_0= ruleTerm )
                    {
                    // InternalTermDsl.g:3991:5: (lv_termWith_12_0= ruleTerm )
                    // InternalTermDsl.g:3992:6: lv_termWith_12_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBagComprehensionTermAccess().getTermWithTermParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_termWith_12_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBagComprehensionTermRule());
                      						}
                      						set(
                      							current,
                      							"termWith",
                      							lv_termWith_12_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getBagComprehensionTermAccess().getGreaterThanSignKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBagComprehensionTerm"


    // $ANTLR start "entryRuleMapComprehensionTerm"
    // InternalTermDsl.g:4018:1: entryRuleMapComprehensionTerm returns [EObject current=null] : iv_ruleMapComprehensionTerm= ruleMapComprehensionTerm EOF ;
    public final EObject entryRuleMapComprehensionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapComprehensionTerm = null;


        try {
            // InternalTermDsl.g:4018:61: (iv_ruleMapComprehensionTerm= ruleMapComprehensionTerm EOF )
            // InternalTermDsl.g:4019:2: iv_ruleMapComprehensionTerm= ruleMapComprehensionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapComprehensionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapComprehensionTerm=ruleMapComprehensionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapComprehensionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapComprehensionTerm"


    // $ANTLR start "ruleMapComprehensionTerm"
    // InternalTermDsl.g:4025:1: ruleMapComprehensionTerm returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_term1_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term2_4_0= ruleTerm ) ) otherlv_5= '|' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_enumTerm_8_0= ruleEnumerableTerm ) ) (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )* (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleMapComprehensionTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_term1_2_0 = null;

        EObject lv_term2_4_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_6_0 = null;

        EObject lv_enumTerm_8_0 = null;

        AntlrDatatypeRuleToken lv_varTerm_10_0 = null;

        EObject lv_enumTerm_12_0 = null;

        EObject lv_termWith_14_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4031:2: ( ( () otherlv_1= '{' ( (lv_term1_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term2_4_0= ruleTerm ) ) otherlv_5= '|' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_enumTerm_8_0= ruleEnumerableTerm ) ) (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )* (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )? otherlv_15= '}' ) )
            // InternalTermDsl.g:4032:2: ( () otherlv_1= '{' ( (lv_term1_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term2_4_0= ruleTerm ) ) otherlv_5= '|' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_enumTerm_8_0= ruleEnumerableTerm ) ) (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )* (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )? otherlv_15= '}' )
            {
            // InternalTermDsl.g:4032:2: ( () otherlv_1= '{' ( (lv_term1_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term2_4_0= ruleTerm ) ) otherlv_5= '|' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_enumTerm_8_0= ruleEnumerableTerm ) ) (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )* (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )? otherlv_15= '}' )
            // InternalTermDsl.g:4033:3: () otherlv_1= '{' ( (lv_term1_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term2_4_0= ruleTerm ) ) otherlv_5= '|' ( (lv_varTerm_6_0= ruleVariableTerm ) ) otherlv_7= 'in' ( (lv_enumTerm_8_0= ruleEnumerableTerm ) ) (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )* (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )? otherlv_15= '}'
            {
            // InternalTermDsl.g:4033:3: ()
            // InternalTermDsl.g:4034:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMapComprehensionTermAccess().getMapComprehensionTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapComprehensionTermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTermDsl.g:4047:3: ( (lv_term1_2_0= ruleTerm ) )
            // InternalTermDsl.g:4048:4: (lv_term1_2_0= ruleTerm )
            {
            // InternalTermDsl.g:4048:4: (lv_term1_2_0= ruleTerm )
            // InternalTermDsl.g:4049:5: lv_term1_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getTerm1TermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_term1_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
              					}
              					set(
              						current,
              						"term1",
              						lv_term1_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMapComprehensionTermAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalTermDsl.g:4070:3: ( (lv_term2_4_0= ruleTerm ) )
            // InternalTermDsl.g:4071:4: (lv_term2_4_0= ruleTerm )
            {
            // InternalTermDsl.g:4071:4: (lv_term2_4_0= ruleTerm )
            // InternalTermDsl.g:4072:5: lv_term2_4_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getTerm2TermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_term2_4_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
              					}
              					set(
              						current,
              						"term2",
              						lv_term2_4_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapComprehensionTermAccess().getVerticalLineKeyword_5());
              		
            }
            // InternalTermDsl.g:4093:3: ( (lv_varTerm_6_0= ruleVariableTerm ) )
            // InternalTermDsl.g:4094:4: (lv_varTerm_6_0= ruleVariableTerm )
            {
            // InternalTermDsl.g:4094:4: (lv_varTerm_6_0= ruleVariableTerm )
            // InternalTermDsl.g:4095:5: lv_varTerm_6_0= ruleVariableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getVarTermVariableTermParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_varTerm_6_0=ruleVariableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
              					}
              					add(
              						current,
              						"varTerm",
              						lv_varTerm_6_0,
              						"org.uasm.term.lang.TermDsl.VariableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMapComprehensionTermAccess().getInKeyword_7());
              		
            }
            // InternalTermDsl.g:4116:3: ( (lv_enumTerm_8_0= ruleEnumerableTerm ) )
            // InternalTermDsl.g:4117:4: (lv_enumTerm_8_0= ruleEnumerableTerm )
            {
            // InternalTermDsl.g:4117:4: (lv_enumTerm_8_0= ruleEnumerableTerm )
            // InternalTermDsl.g:4118:5: lv_enumTerm_8_0= ruleEnumerableTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_enumTerm_8_0=ruleEnumerableTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
              					}
              					add(
              						current,
              						"enumTerm",
              						lv_enumTerm_8_0,
              						"org.uasm.term.lang.TermDsl.EnumerableTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:4135:3: (otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalTermDsl.g:4136:4: otherlv_9= ',' ( (lv_varTerm_10_0= ruleVariableTerm ) ) otherlv_11= 'in' ( (lv_enumTerm_12_0= ruleEnumerableTerm ) )
            	    {
            	    otherlv_9=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getMapComprehensionTermAccess().getCommaKeyword_9_0());
            	      			
            	    }
            	    // InternalTermDsl.g:4140:4: ( (lv_varTerm_10_0= ruleVariableTerm ) )
            	    // InternalTermDsl.g:4141:5: (lv_varTerm_10_0= ruleVariableTerm )
            	    {
            	    // InternalTermDsl.g:4141:5: (lv_varTerm_10_0= ruleVariableTerm )
            	    // InternalTermDsl.g:4142:6: lv_varTerm_10_0= ruleVariableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getVarTermVariableTermParserRuleCall_9_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_varTerm_10_0=ruleVariableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varTerm",
            	      							lv_varTerm_10_0,
            	      							"org.uasm.term.lang.TermDsl.VariableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getMapComprehensionTermAccess().getInKeyword_9_2());
            	      			
            	    }
            	    // InternalTermDsl.g:4163:4: ( (lv_enumTerm_12_0= ruleEnumerableTerm ) )
            	    // InternalTermDsl.g:4164:5: (lv_enumTerm_12_0= ruleEnumerableTerm )
            	    {
            	    // InternalTermDsl.g:4164:5: (lv_enumTerm_12_0= ruleEnumerableTerm )
            	    // InternalTermDsl.g:4165:6: lv_enumTerm_12_0= ruleEnumerableTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getEnumTermEnumerableTermParserRuleCall_9_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_enumTerm_12_0=ruleEnumerableTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumTerm",
            	      							lv_enumTerm_12_0,
            	      							"org.uasm.term.lang.TermDsl.EnumerableTerm");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalTermDsl.g:4183:3: (otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTermDsl.g:4184:4: otherlv_13= 'with' ( (lv_termWith_14_0= ruleTerm ) )
                    {
                    otherlv_13=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getMapComprehensionTermAccess().getWithKeyword_10_0());
                      			
                    }
                    // InternalTermDsl.g:4188:4: ( (lv_termWith_14_0= ruleTerm ) )
                    // InternalTermDsl.g:4189:5: (lv_termWith_14_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4189:5: (lv_termWith_14_0= ruleTerm )
                    // InternalTermDsl.g:4190:6: lv_termWith_14_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapComprehensionTermAccess().getTermWithTermParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_termWith_14_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapComprehensionTermRule());
                      						}
                      						set(
                      							current,
                      							"termWith",
                      							lv_termWith_14_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getMapComprehensionTermAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapComprehensionTerm"


    // $ANTLR start "entryRuleNumberRangeTerm"
    // InternalTermDsl.g:4216:1: entryRuleNumberRangeTerm returns [EObject current=null] : iv_ruleNumberRangeTerm= ruleNumberRangeTerm EOF ;
    public final EObject entryRuleNumberRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberRangeTerm = null;


        try {
            // InternalTermDsl.g:4216:56: (iv_ruleNumberRangeTerm= ruleNumberRangeTerm EOF )
            // InternalTermDsl.g:4217:2: iv_ruleNumberRangeTerm= ruleNumberRangeTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRangeTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberRangeTerm=ruleNumberRangeTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberRangeTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberRangeTerm"


    // $ANTLR start "ruleNumberRangeTerm"
    // InternalTermDsl.g:4223:1: ruleNumberRangeTerm returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_start_2_0= ruleTerm ) ) otherlv_3= '..' ( (lv_end_4_0= ruleTerm ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleNumberRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;

        EObject lv_step_6_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4229:2: ( ( () otherlv_1= '[' ( (lv_start_2_0= ruleTerm ) ) otherlv_3= '..' ( (lv_end_4_0= ruleTerm ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )? otherlv_7= ']' ) )
            // InternalTermDsl.g:4230:2: ( () otherlv_1= '[' ( (lv_start_2_0= ruleTerm ) ) otherlv_3= '..' ( (lv_end_4_0= ruleTerm ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )? otherlv_7= ']' )
            {
            // InternalTermDsl.g:4230:2: ( () otherlv_1= '[' ( (lv_start_2_0= ruleTerm ) ) otherlv_3= '..' ( (lv_end_4_0= ruleTerm ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )? otherlv_7= ']' )
            // InternalTermDsl.g:4231:3: () otherlv_1= '[' ( (lv_start_2_0= ruleTerm ) ) otherlv_3= '..' ( (lv_end_4_0= ruleTerm ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )? otherlv_7= ']'
            {
            // InternalTermDsl.g:4231:3: ()
            // InternalTermDsl.g:4232:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNumberRangeTermAccess().getNumberRangeTermAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumberRangeTermAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTermDsl.g:4245:3: ( (lv_start_2_0= ruleTerm ) )
            // InternalTermDsl.g:4246:4: (lv_start_2_0= ruleTerm )
            {
            // InternalTermDsl.g:4246:4: (lv_start_2_0= ruleTerm )
            // InternalTermDsl.g:4247:5: lv_start_2_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumberRangeTermAccess().getStartTermParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_start_2_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumberRangeTermRule());
              					}
              					set(
              						current,
              						"start",
              						lv_start_2_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNumberRangeTermAccess().getFullStopFullStopKeyword_3());
              		
            }
            // InternalTermDsl.g:4268:3: ( (lv_end_4_0= ruleTerm ) )
            // InternalTermDsl.g:4269:4: (lv_end_4_0= ruleTerm )
            {
            // InternalTermDsl.g:4269:4: (lv_end_4_0= ruleTerm )
            // InternalTermDsl.g:4270:5: lv_end_4_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumberRangeTermAccess().getEndTermParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_end_4_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumberRangeTermRule());
              					}
              					set(
              						current,
              						"end",
              						lv_end_4_0,
              						"org.uasm.term.lang.TermDsl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:4287:3: (otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTermDsl.g:4288:4: otherlv_5= 'step' ( (lv_step_6_0= ruleTerm ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNumberRangeTermAccess().getStepKeyword_5_0());
                      			
                    }
                    // InternalTermDsl.g:4292:4: ( (lv_step_6_0= ruleTerm ) )
                    // InternalTermDsl.g:4293:5: (lv_step_6_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4293:5: (lv_step_6_0= ruleTerm )
                    // InternalTermDsl.g:4294:6: lv_step_6_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumberRangeTermAccess().getStepTermParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_step_6_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumberRangeTermRule());
                      						}
                      						set(
                      							current,
                      							"step",
                      							lv_step_6_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNumberRangeTermAccess().getRightSquareBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberRangeTerm"


    // $ANTLR start "entryRuleStructureTerm"
    // InternalTermDsl.g:4320:1: entryRuleStructureTerm returns [EObject current=null] : iv_ruleStructureTerm= ruleStructureTerm EOF ;
    public final EObject entryRuleStructureTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureTerm = null;


        try {
            // InternalTermDsl.g:4320:54: (iv_ruleStructureTerm= ruleStructureTerm EOF )
            // InternalTermDsl.g:4321:2: iv_ruleStructureTerm= ruleStructureTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructureTerm=ruleStructureTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructureTerm"


    // $ANTLR start "ruleStructureTerm"
    // InternalTermDsl.g:4327:1: ruleStructureTerm returns [EObject current=null] : (this_SetTerm_0= ruleSetTerm | this_ListTerm_1= ruleListTerm | this_BagTerm_2= ruleBagTerm | this_MapTerm_3= ruleMapTerm ) ;
    public final EObject ruleStructureTerm() throws RecognitionException {
        EObject current = null;

        EObject this_SetTerm_0 = null;

        EObject this_ListTerm_1 = null;

        EObject this_BagTerm_2 = null;

        EObject this_MapTerm_3 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4333:2: ( (this_SetTerm_0= ruleSetTerm | this_ListTerm_1= ruleListTerm | this_BagTerm_2= ruleBagTerm | this_MapTerm_3= ruleMapTerm ) )
            // InternalTermDsl.g:4334:2: (this_SetTerm_0= ruleSetTerm | this_ListTerm_1= ruleListTerm | this_BagTerm_2= ruleBagTerm | this_MapTerm_3= ruleMapTerm )
            {
            // InternalTermDsl.g:4334:2: (this_SetTerm_0= ruleSetTerm | this_ListTerm_1= ruleListTerm | this_BagTerm_2= ruleBagTerm | this_MapTerm_3= ruleMapTerm )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA52_1 = input.LA(2);

                if ( (synpred86_InternalTermDsl()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt52=2;
                }
                break;
            case 21:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalTermDsl.g:4335:3: this_SetTerm_0= ruleSetTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureTermAccess().getSetTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetTerm_0=ruleSetTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:4347:3: this_ListTerm_1= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureTermAccess().getListTermParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListTerm_1=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListTerm_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:4359:3: this_BagTerm_2= ruleBagTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureTermAccess().getBagTermParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BagTerm_2=ruleBagTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BagTerm_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:4371:3: this_MapTerm_3= ruleMapTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureTermAccess().getMapTermParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapTerm_3=ruleMapTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTerm_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStructureTerm"


    // $ANTLR start "entryRuleSetTerm"
    // InternalTermDsl.g:4386:1: entryRuleSetTerm returns [EObject current=null] : iv_ruleSetTerm= ruleSetTerm EOF ;
    public final EObject entryRuleSetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetTerm = null;


        try {
            // InternalTermDsl.g:4386:48: (iv_ruleSetTerm= ruleSetTerm EOF )
            // InternalTermDsl.g:4387:2: iv_ruleSetTerm= ruleSetTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetTerm=ruleSetTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetTerm"


    // $ANTLR start "ruleSetTerm"
    // InternalTermDsl.g:4393:1: ruleSetTerm returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) ) ;
    public final EObject ruleSetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4399:2: ( ( ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) ) )
            // InternalTermDsl.g:4400:2: ( ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) )
            {
            // InternalTermDsl.g:4400:2: ( ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' ) | (otherlv_6= '{' otherlv_7= '}' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                int LA54_1 = input.LA(2);

                if ( ((LA54_1>=RULE_ID && LA54_1<=RULE_TK_FLOAT)||LA54_1==21||LA54_1==27||(LA54_1>=33 && LA54_1<=34)||(LA54_1>=37 && LA54_1<=42)||LA54_1==46||LA54_1==49||LA54_1==52||(LA54_1>=55 && LA54_1<=57)||LA54_1==61||(LA54_1>=65 && LA54_1<=67)) ) {
                    alt54=1;
                }
                else if ( (LA54_1==47) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalTermDsl.g:4401:3: ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' )
                    {
                    // InternalTermDsl.g:4401:3: ( () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}' )
                    // InternalTermDsl.g:4402:4: () otherlv_1= '{' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '}'
                    {
                    // InternalTermDsl.g:4402:4: ()
                    // InternalTermDsl.g:4403:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSetTermAccess().getSetTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSetTermAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:4416:4: ( (lv_term_2_0= ruleTerm ) )
                    // InternalTermDsl.g:4417:5: (lv_term_2_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4417:5: (lv_term_2_0= ruleTerm )
                    // InternalTermDsl.g:4418:6: lv_term_2_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSetTermAccess().getTermTermParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSetTermRule());
                      						}
                      						add(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:4435:4: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==36) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalTermDsl.g:4436:5: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSetTermAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:4440:5: ( (lv_term_4_0= ruleTerm ) )
                    	    // InternalTermDsl.g:4441:6: (lv_term_4_0= ruleTerm )
                    	    {
                    	    // InternalTermDsl.g:4441:6: (lv_term_4_0= ruleTerm )
                    	    // InternalTermDsl.g:4442:7: lv_term_4_0= ruleTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSetTermAccess().getTermTermParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_term_4_0=ruleTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSetTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term",
                    	      								lv_term_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Term");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSetTermAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:4466:3: (otherlv_6= '{' otherlv_7= '}' )
                    {
                    // InternalTermDsl.g:4466:3: (otherlv_6= '{' otherlv_7= '}' )
                    // InternalTermDsl.g:4467:4: otherlv_6= '{' otherlv_7= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSetTermAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSetTermAccess().getRightCurlyBracketKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSetTerm"


    // $ANTLR start "entryRuleListTerm"
    // InternalTermDsl.g:4480:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalTermDsl.g:4480:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalTermDsl.g:4481:2: iv_ruleListTerm= ruleListTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // InternalTermDsl.g:4487:1: ruleListTerm returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4493:2: ( ( ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) ) )
            // InternalTermDsl.g:4494:2: ( ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) )
            {
            // InternalTermDsl.g:4494:2: ( ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' ) | (otherlv_6= '[' otherlv_7= ']' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==45) ) {
                    alt56=2;
                }
                else if ( ((LA56_1>=RULE_ID && LA56_1<=RULE_TK_FLOAT)||LA56_1==21||LA56_1==27||(LA56_1>=33 && LA56_1<=34)||(LA56_1>=37 && LA56_1<=42)||LA56_1==46||LA56_1==49||LA56_1==52||(LA56_1>=55 && LA56_1<=57)||LA56_1==61||(LA56_1>=65 && LA56_1<=67)) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalTermDsl.g:4495:3: ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' )
                    {
                    // InternalTermDsl.g:4495:3: ( () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']' )
                    // InternalTermDsl.g:4496:4: () otherlv_1= '[' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= ']'
                    {
                    // InternalTermDsl.g:4496:4: ()
                    // InternalTermDsl.g:4497:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListTermAccess().getListTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:4510:4: ( (lv_term_2_0= ruleTerm ) )
                    // InternalTermDsl.g:4511:5: (lv_term_2_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4511:5: (lv_term_2_0= ruleTerm )
                    // InternalTermDsl.g:4512:6: lv_term_2_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getTermTermParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListTermRule());
                      						}
                      						add(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:4529:4: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==36) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTermDsl.g:4530:5: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:4534:5: ( (lv_term_4_0= ruleTerm ) )
                    	    // InternalTermDsl.g:4535:6: (lv_term_4_0= ruleTerm )
                    	    {
                    	    // InternalTermDsl.g:4535:6: (lv_term_4_0= ruleTerm )
                    	    // InternalTermDsl.g:4536:7: lv_term_4_0= ruleTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getTermTermParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_term_4_0=ruleTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term",
                    	      								lv_term_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Term");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:4560:3: (otherlv_6= '[' otherlv_7= ']' )
                    {
                    // InternalTermDsl.g:4560:3: (otherlv_6= '[' otherlv_7= ']' )
                    // InternalTermDsl.g:4561:4: otherlv_6= '[' otherlv_7= ']'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getListTermAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getListTermAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleBagTerm"
    // InternalTermDsl.g:4574:1: entryRuleBagTerm returns [EObject current=null] : iv_ruleBagTerm= ruleBagTerm EOF ;
    public final EObject entryRuleBagTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagTerm = null;


        try {
            // InternalTermDsl.g:4574:48: (iv_ruleBagTerm= ruleBagTerm EOF )
            // InternalTermDsl.g:4575:2: iv_ruleBagTerm= ruleBagTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBagTerm=ruleBagTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagTerm"


    // $ANTLR start "ruleBagTerm"
    // InternalTermDsl.g:4581:1: ruleBagTerm returns [EObject current=null] : ( ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) ) ;
    public final EObject ruleBagTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4587:2: ( ( ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) ) )
            // InternalTermDsl.g:4588:2: ( ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) )
            {
            // InternalTermDsl.g:4588:2: ( ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' ) | (otherlv_6= '<' otherlv_7= '>' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==21) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==22) ) {
                    alt58=2;
                }
                else if ( ((LA58_1>=RULE_ID && LA58_1<=RULE_TK_FLOAT)||LA58_1==21||LA58_1==27||(LA58_1>=33 && LA58_1<=34)||(LA58_1>=37 && LA58_1<=42)||LA58_1==46||LA58_1==49||LA58_1==52||(LA58_1>=55 && LA58_1<=57)||LA58_1==61||(LA58_1>=65 && LA58_1<=67)) ) {
                    alt58=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalTermDsl.g:4589:3: ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' )
                    {
                    // InternalTermDsl.g:4589:3: ( () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>' )
                    // InternalTermDsl.g:4590:4: () otherlv_1= '<' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* otherlv_5= '>'
                    {
                    // InternalTermDsl.g:4590:4: ()
                    // InternalTermDsl.g:4591:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBagTermAccess().getBagTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBagTermAccess().getLessThanSignKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:4604:4: ( (lv_term_2_0= ruleTerm ) )
                    // InternalTermDsl.g:4605:5: (lv_term_2_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4605:5: (lv_term_2_0= ruleTerm )
                    // InternalTermDsl.g:4606:6: lv_term_2_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBagTermAccess().getTermTermParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBagTermRule());
                      						}
                      						add(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"org.uasm.term.lang.TermDsl.Term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:4623:4: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==36) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTermDsl.g:4624:5: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getBagTermAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:4628:5: ( (lv_term_4_0= ruleTerm ) )
                    	    // InternalTermDsl.g:4629:6: (lv_term_4_0= ruleTerm )
                    	    {
                    	    // InternalTermDsl.g:4629:6: (lv_term_4_0= ruleTerm )
                    	    // InternalTermDsl.g:4630:7: lv_term_4_0= ruleTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBagTermAccess().getTermTermParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_term_4_0=ruleTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBagTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term",
                    	      								lv_term_4_0,
                    	      								"org.uasm.term.lang.TermDsl.Term");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBagTermAccess().getGreaterThanSignKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:4654:3: (otherlv_6= '<' otherlv_7= '>' )
                    {
                    // InternalTermDsl.g:4654:3: (otherlv_6= '<' otherlv_7= '>' )
                    // InternalTermDsl.g:4655:4: otherlv_6= '<' otherlv_7= '>'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBagTermAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getBagTermAccess().getGreaterThanSignKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBagTerm"


    // $ANTLR start "entryRuleMapTerm"
    // InternalTermDsl.g:4668:1: entryRuleMapTerm returns [EObject current=null] : iv_ruleMapTerm= ruleMapTerm EOF ;
    public final EObject entryRuleMapTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTerm = null;


        try {
            // InternalTermDsl.g:4668:48: (iv_ruleMapTerm= ruleMapTerm EOF )
            // InternalTermDsl.g:4669:2: iv_ruleMapTerm= ruleMapTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapTerm=ruleMapTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTerm"


    // $ANTLR start "ruleMapTerm"
    // InternalTermDsl.g:4675:1: ruleMapTerm returns [EObject current=null] : ( ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) ) ;
    public final EObject ruleMapTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;

        EObject lv_term_6_0 = null;

        EObject lv_term_8_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4681:2: ( ( ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) ) )
            // InternalTermDsl.g:4682:2: ( ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) )
            {
            // InternalTermDsl.g:4682:2: ( ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' ) | (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                int LA60_1 = input.LA(2);

                if ( ((LA60_1>=RULE_ID && LA60_1<=RULE_TK_FLOAT)||LA60_1==21||LA60_1==27||(LA60_1>=33 && LA60_1<=34)||(LA60_1>=37 && LA60_1<=42)||LA60_1==46||LA60_1==49||LA60_1==52||(LA60_1>=55 && LA60_1<=57)||LA60_1==61||(LA60_1>=65 && LA60_1<=67)) ) {
                    alt60=1;
                }
                else if ( (LA60_1==48) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalTermDsl.g:4683:3: ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' )
                    {
                    // InternalTermDsl.g:4683:3: ( () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}' )
                    // InternalTermDsl.g:4684:4: () otherlv_1= '{' ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) ) (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )* otherlv_9= '}'
                    {
                    // InternalTermDsl.g:4684:4: ()
                    // InternalTermDsl.g:4685:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapTermAccess().getMapTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTermAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTermDsl.g:4698:4: ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) ) )
                    // InternalTermDsl.g:4699:5: ( (lv_term_2_0= ruleTerm ) ) otherlv_3= '->' ( (lv_term_4_0= ruleTerm ) )
                    {
                    // InternalTermDsl.g:4699:5: ( (lv_term_2_0= ruleTerm ) )
                    // InternalTermDsl.g:4700:6: (lv_term_2_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4700:6: (lv_term_2_0= ruleTerm )
                    // InternalTermDsl.g:4701:7: lv_term_2_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapTermAccess().getTermTermParserRuleCall_0_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapTermRule());
                      							}
                      							add(
                      								current,
                      								"term",
                      								lv_term_2_0,
                      								"org.uasm.term.lang.TermDsl.Term");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getMapTermAccess().getHyphenMinusGreaterThanSignKeyword_0_2_1());
                      				
                    }
                    // InternalTermDsl.g:4722:5: ( (lv_term_4_0= ruleTerm ) )
                    // InternalTermDsl.g:4723:6: (lv_term_4_0= ruleTerm )
                    {
                    // InternalTermDsl.g:4723:6: (lv_term_4_0= ruleTerm )
                    // InternalTermDsl.g:4724:7: lv_term_4_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapTermAccess().getTermTermParserRuleCall_0_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_term_4_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapTermRule());
                      							}
                      							add(
                      								current,
                      								"term",
                      								lv_term_4_0,
                      								"org.uasm.term.lang.TermDsl.Term");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalTermDsl.g:4742:4: (otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==36) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalTermDsl.g:4743:5: otherlv_5= ',' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= '->' ( (lv_term_8_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getMapTermAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:4747:5: ( (lv_term_6_0= ruleTerm ) )
                    	    // InternalTermDsl.g:4748:6: (lv_term_6_0= ruleTerm )
                    	    {
                    	    // InternalTermDsl.g:4748:6: (lv_term_6_0= ruleTerm )
                    	    // InternalTermDsl.g:4749:7: lv_term_6_0= ruleTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapTermAccess().getTermTermParserRuleCall_0_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_term_6_0=ruleTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term",
                    	      								lv_term_6_0,
                    	      								"org.uasm.term.lang.TermDsl.Term");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getMapTermAccess().getHyphenMinusGreaterThanSignKeyword_0_3_2());
                    	      				
                    	    }
                    	    // InternalTermDsl.g:4770:5: ( (lv_term_8_0= ruleTerm ) )
                    	    // InternalTermDsl.g:4771:6: (lv_term_8_0= ruleTerm )
                    	    {
                    	    // InternalTermDsl.g:4771:6: (lv_term_8_0= ruleTerm )
                    	    // InternalTermDsl.g:4772:7: lv_term_8_0= ruleTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapTermAccess().getTermTermParserRuleCall_0_3_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_term_8_0=ruleTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term",
                    	      								lv_term_8_0,
                    	      								"org.uasm.term.lang.TermDsl.Term");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMapTermAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:4796:3: (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' )
                    {
                    // InternalTermDsl.g:4796:3: (otherlv_10= '{' otherlv_11= '->' otherlv_12= '}' )
                    // InternalTermDsl.g:4797:4: otherlv_10= '{' otherlv_11= '->' otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMapTermAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    otherlv_11=(Token)match(input,48,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMapTermAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                      			
                    }
                    otherlv_12=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMapTermAccess().getRightCurlyBracketKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapTerm"


    // $ANTLR start "entryRuleIdDomain"
    // InternalTermDsl.g:4814:1: entryRuleIdDomain returns [String current=null] : iv_ruleIdDomain= ruleIdDomain EOF ;
    public final String entryRuleIdDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdDomain = null;


        try {
            // InternalTermDsl.g:4814:48: (iv_ruleIdDomain= ruleIdDomain EOF )
            // InternalTermDsl.g:4815:2: iv_ruleIdDomain= ruleIdDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdDomain=ruleIdDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdDomain.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdDomain"


    // $ANTLR start "ruleIdDomain"
    // InternalTermDsl.g:4821:1: ruleIdDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:4827:2: (this_ID_0= RULE_ID )
            // InternalTermDsl.g:4828:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdDomainAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdDomain"


    // $ANTLR start "entryRuleIdFunction"
    // InternalTermDsl.g:4838:1: entryRuleIdFunction returns [String current=null] : iv_ruleIdFunction= ruleIdFunction EOF ;
    public final String entryRuleIdFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdFunction = null;


        try {
            // InternalTermDsl.g:4838:50: (iv_ruleIdFunction= ruleIdFunction EOF )
            // InternalTermDsl.g:4839:2: iv_ruleIdFunction= ruleIdFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdFunction=ruleIdFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdFunction.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdFunction"


    // $ANTLR start "ruleIdFunction"
    // InternalTermDsl.g:4845:1: ruleIdFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:4851:2: (this_ID_0= RULE_ID )
            // InternalTermDsl.g:4852:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdFunctionAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdFunction"


    // $ANTLR start "entryRuleIdRule"
    // InternalTermDsl.g:4862:1: entryRuleIdRule returns [String current=null] : iv_ruleIdRule= ruleIdRule EOF ;
    public final String entryRuleIdRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdRule = null;


        try {
            // InternalTermDsl.g:4862:46: (iv_ruleIdRule= ruleIdRule EOF )
            // InternalTermDsl.g:4863:2: iv_ruleIdRule= ruleIdRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdRule=ruleIdRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdRule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdRule"


    // $ANTLR start "ruleIdRule"
    // InternalTermDsl.g:4869:1: ruleIdRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:4875:2: (this_ID_0= RULE_ID )
            // InternalTermDsl.g:4876:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdRuleAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdRule"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalTermDsl.g:4886:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTermDsl.g:4886:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTermDsl.g:4887:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalTermDsl.g:4893:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_STN ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:4899:2: ( ( () ( (lv_text_1_0= RULE_STN ) ) ) )
            // InternalTermDsl.g:4900:2: ( () ( (lv_text_1_0= RULE_STN ) ) )
            {
            // InternalTermDsl.g:4900:2: ( () ( (lv_text_1_0= RULE_STN ) ) )
            // InternalTermDsl.g:4901:3: () ( (lv_text_1_0= RULE_STN ) )
            {
            // InternalTermDsl.g:4901:3: ()
            // InternalTermDsl.g:4902:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalTermDsl.g:4911:3: ( (lv_text_1_0= RULE_STN ) )
            // InternalTermDsl.g:4912:4: (lv_text_1_0= RULE_STN )
            {
            // InternalTermDsl.g:4912:4: (lv_text_1_0= RULE_STN )
            // InternalTermDsl.g:4913:5: lv_text_1_0= RULE_STN
            {
            lv_text_1_0=(Token)match(input,RULE_STN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getStringLiteralAccess().getTextSTNTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_1_0,
              						"org.uasm.term.lang.TermDsl.STN");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalTermDsl.g:4933:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalTermDsl.g:4933:52: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalTermDsl.g:4934:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalTermDsl.g:4940:1: ruleCharLiteral returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_STN ) ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:4946:2: ( ( () ( (lv_text_1_0= RULE_STN ) ) ) )
            // InternalTermDsl.g:4947:2: ( () ( (lv_text_1_0= RULE_STN ) ) )
            {
            // InternalTermDsl.g:4947:2: ( () ( (lv_text_1_0= RULE_STN ) ) )
            // InternalTermDsl.g:4948:3: () ( (lv_text_1_0= RULE_STN ) )
            {
            // InternalTermDsl.g:4948:3: ()
            // InternalTermDsl.g:4949:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCharLiteralAccess().getCharLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalTermDsl.g:4958:3: ( (lv_text_1_0= RULE_STN ) )
            // InternalTermDsl.g:4959:4: (lv_text_1_0= RULE_STN )
            {
            // InternalTermDsl.g:4959:4: (lv_text_1_0= RULE_STN )
            // InternalTermDsl.g:4960:5: lv_text_1_0= RULE_STN
            {
            lv_text_1_0=(Token)match(input,RULE_STN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getCharLiteralAccess().getTextSTNTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCharLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_1_0,
              						"org.uasm.term.lang.TermDsl.STN");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleDomain"
    // InternalTermDsl.g:4980:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalTermDsl.g:4980:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalTermDsl.g:4981:2: iv_ruleDomain= ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalTermDsl.g:4987:1: ruleDomain returns [EObject current=null] : (this_StructuredDomain_0= ruleStructuredDomain | this_BasicDomain_1= ruleBasicDomain | this_ExtendableDomain_2= ruleExtendableDomain ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject this_StructuredDomain_0 = null;

        EObject this_BasicDomain_1 = null;

        EObject this_ExtendableDomain_2 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:4993:2: ( (this_StructuredDomain_0= ruleStructuredDomain | this_BasicDomain_1= ruleBasicDomain | this_ExtendableDomain_2= ruleExtendableDomain ) )
            // InternalTermDsl.g:4994:2: (this_StructuredDomain_0= ruleStructuredDomain | this_BasicDomain_1= ruleBasicDomain | this_ExtendableDomain_2= ruleExtendableDomain )
            {
            // InternalTermDsl.g:4994:2: (this_StructuredDomain_0= ruleStructuredDomain | this_BasicDomain_1= ruleBasicDomain | this_ExtendableDomain_2= ruleExtendableDomain )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt61=1;
                }
                break;
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt61=2;
                }
                break;
            case RULE_ID:
            case 72:
            case 73:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalTermDsl.g:4995:3: this_StructuredDomain_0= ruleStructuredDomain
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainAccess().getStructuredDomainParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructuredDomain_0=ruleStructuredDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructuredDomain_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:5007:3: this_BasicDomain_1= ruleBasicDomain
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainAccess().getBasicDomainParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicDomain_1=ruleBasicDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicDomain_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:5019:3: this_ExtendableDomain_2= ruleExtendableDomain
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainAccess().getExtendableDomainParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtendableDomain_2=ruleExtendableDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtendableDomain_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleStructuredDomain"
    // InternalTermDsl.g:5034:1: entryRuleStructuredDomain returns [EObject current=null] : iv_ruleStructuredDomain= ruleStructuredDomain EOF ;
    public final EObject entryRuleStructuredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDomain = null;


        try {
            // InternalTermDsl.g:5034:57: (iv_ruleStructuredDomain= ruleStructuredDomain EOF )
            // InternalTermDsl.g:5035:2: iv_ruleStructuredDomain= ruleStructuredDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructuredDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructuredDomain=ruleStructuredDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructuredDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructuredDomain"


    // $ANTLR start "ruleStructuredDomain"
    // InternalTermDsl.g:5041:1: ruleStructuredDomain returns [EObject current=null] : ( ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? ) | ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? ) | ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? ) | ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? ) ) ;
    public final EObject ruleStructuredDomain() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_type_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_domainSet_3_0 = null;

        EObject lv_domainBag_7_0 = null;

        EObject lv_domainList_11_0 = null;

        EObject lv_domainMap_15_0 = null;

        EObject lv_domainMap_17_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:5047:2: ( ( ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? ) | ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? ) | ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? ) | ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? ) ) )
            // InternalTermDsl.g:5048:2: ( ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? ) | ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? ) | ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? ) | ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? ) )
            {
            // InternalTermDsl.g:5048:2: ( ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? ) | ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? ) | ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? ) | ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt66=1;
                }
                break;
            case 69:
                {
                alt66=2;
                }
                break;
            case 70:
                {
                alt66=3;
                }
                break;
            case 71:
                {
                alt66=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalTermDsl.g:5049:3: ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? )
                    {
                    // InternalTermDsl.g:5049:3: ( () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )? )
                    // InternalTermDsl.g:5050:4: () ( (lv_type_1_0= 'SET' ) ) (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )?
                    {
                    // InternalTermDsl.g:5050:4: ()
                    // InternalTermDsl.g:5051:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStructuredDomainAccess().getStructuredDomainAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:5060:4: ( (lv_type_1_0= 'SET' ) )
                    // InternalTermDsl.g:5061:5: (lv_type_1_0= 'SET' )
                    {
                    // InternalTermDsl.g:5061:5: (lv_type_1_0= 'SET' )
                    // InternalTermDsl.g:5062:6: lv_type_1_0= 'SET'
                    {
                    lv_type_1_0=(Token)match(input,68,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_1_0, grammarAccess.getStructuredDomainAccess().getTypeSETKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStructuredDomainRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_1_0, "SET");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:5074:4: (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==34) ) {
                        int LA62_1 = input.LA(2);

                        if ( (LA62_1==RULE_ID) ) {
                            int LA62_3 = input.LA(3);

                            if ( (LA62_3==35) ) {
                                int LA62_5 = input.LA(4);

                                if ( (synpred99_InternalTermDsl()) ) {
                                    alt62=1;
                                }
                            }
                        }
                        else if ( ((LA62_1>=68 && LA62_1<=79)) ) {
                            alt62=1;
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalTermDsl.g:5075:5: otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getStructuredDomainAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalTermDsl.g:5079:5: ( (lv_domainSet_3_0= ruleDomain ) )
                            // InternalTermDsl.g:5080:6: (lv_domainSet_3_0= ruleDomain )
                            {
                            // InternalTermDsl.g:5080:6: (lv_domainSet_3_0= ruleDomain )
                            // InternalTermDsl.g:5081:7: lv_domainSet_3_0= ruleDomain
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainSetDomainParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_domainSet_3_0=ruleDomain();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStructuredDomainRule());
                              							}
                              							set(
                              								current,
                              								"domainSet",
                              								lv_domainSet_3_0,
                              								"org.uasm.term.lang.TermDsl.Domain");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getStructuredDomainAccess().getRightParenthesisKeyword_0_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:5105:3: ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? )
                    {
                    // InternalTermDsl.g:5105:3: ( ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )? )
                    // InternalTermDsl.g:5106:4: ( (lv_type_5_0= 'BAG' ) ) (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )?
                    {
                    // InternalTermDsl.g:5106:4: ( (lv_type_5_0= 'BAG' ) )
                    // InternalTermDsl.g:5107:5: (lv_type_5_0= 'BAG' )
                    {
                    // InternalTermDsl.g:5107:5: (lv_type_5_0= 'BAG' )
                    // InternalTermDsl.g:5108:6: lv_type_5_0= 'BAG'
                    {
                    lv_type_5_0=(Token)match(input,69,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_5_0, grammarAccess.getStructuredDomainAccess().getTypeBAGKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStructuredDomainRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_5_0, "BAG");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:5120:4: (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==34) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==RULE_ID) ) {
                            int LA63_3 = input.LA(3);

                            if ( (LA63_3==35) ) {
                                int LA63_5 = input.LA(4);

                                if ( (synpred101_InternalTermDsl()) ) {
                                    alt63=1;
                                }
                            }
                        }
                        else if ( ((LA63_1>=68 && LA63_1<=79)) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalTermDsl.g:5121:5: otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')'
                            {
                            otherlv_6=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getStructuredDomainAccess().getLeftParenthesisKeyword_1_1_0());
                              				
                            }
                            // InternalTermDsl.g:5125:5: ( (lv_domainBag_7_0= ruleDomain ) )
                            // InternalTermDsl.g:5126:6: (lv_domainBag_7_0= ruleDomain )
                            {
                            // InternalTermDsl.g:5126:6: (lv_domainBag_7_0= ruleDomain )
                            // InternalTermDsl.g:5127:7: lv_domainBag_7_0= ruleDomain
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainBagDomainParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_domainBag_7_0=ruleDomain();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStructuredDomainRule());
                              							}
                              							set(
                              								current,
                              								"domainBag",
                              								lv_domainBag_7_0,
                              								"org.uasm.term.lang.TermDsl.Domain");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getStructuredDomainAccess().getRightParenthesisKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:5151:3: ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? )
                    {
                    // InternalTermDsl.g:5151:3: ( ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )? )
                    // InternalTermDsl.g:5152:4: ( (lv_type_9_0= 'LIST' ) ) (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )?
                    {
                    // InternalTermDsl.g:5152:4: ( (lv_type_9_0= 'LIST' ) )
                    // InternalTermDsl.g:5153:5: (lv_type_9_0= 'LIST' )
                    {
                    // InternalTermDsl.g:5153:5: (lv_type_9_0= 'LIST' )
                    // InternalTermDsl.g:5154:6: lv_type_9_0= 'LIST'
                    {
                    lv_type_9_0=(Token)match(input,70,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_9_0, grammarAccess.getStructuredDomainAccess().getTypeLISTKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStructuredDomainRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_9_0, "LIST");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:5166:4: (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==34) ) {
                        int LA64_1 = input.LA(2);

                        if ( (LA64_1==RULE_ID) ) {
                            int LA64_3 = input.LA(3);

                            if ( (LA64_3==35) ) {
                                int LA64_5 = input.LA(4);

                                if ( (synpred103_InternalTermDsl()) ) {
                                    alt64=1;
                                }
                            }
                        }
                        else if ( ((LA64_1>=68 && LA64_1<=79)) ) {
                            alt64=1;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalTermDsl.g:5167:5: otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')'
                            {
                            otherlv_10=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getStructuredDomainAccess().getLeftParenthesisKeyword_2_1_0());
                              				
                            }
                            // InternalTermDsl.g:5171:5: ( (lv_domainList_11_0= ruleDomain ) )
                            // InternalTermDsl.g:5172:6: (lv_domainList_11_0= ruleDomain )
                            {
                            // InternalTermDsl.g:5172:6: (lv_domainList_11_0= ruleDomain )
                            // InternalTermDsl.g:5173:7: lv_domainList_11_0= ruleDomain
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainListDomainParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_domainList_11_0=ruleDomain();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStructuredDomainRule());
                              							}
                              							set(
                              								current,
                              								"domainList",
                              								lv_domainList_11_0,
                              								"org.uasm.term.lang.TermDsl.Domain");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_12=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getStructuredDomainAccess().getRightParenthesisKeyword_2_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:5197:3: ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? )
                    {
                    // InternalTermDsl.g:5197:3: ( ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )? )
                    // InternalTermDsl.g:5198:4: ( (lv_type_13_0= 'MAP' ) ) (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )?
                    {
                    // InternalTermDsl.g:5198:4: ( (lv_type_13_0= 'MAP' ) )
                    // InternalTermDsl.g:5199:5: (lv_type_13_0= 'MAP' )
                    {
                    // InternalTermDsl.g:5199:5: (lv_type_13_0= 'MAP' )
                    // InternalTermDsl.g:5200:6: lv_type_13_0= 'MAP'
                    {
                    lv_type_13_0=(Token)match(input,71,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_13_0, grammarAccess.getStructuredDomainAccess().getTypeMAPKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStructuredDomainRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_13_0, "MAP");
                      					
                    }

                    }


                    }

                    // InternalTermDsl.g:5212:4: (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==34) ) {
                        int LA65_1 = input.LA(2);

                        if ( (LA65_1==RULE_ID) ) {
                            int LA65_3 = input.LA(3);

                            if ( (LA65_3==36) ) {
                                int LA65_5 = input.LA(4);

                                if ( (LA65_5==RULE_ID) ) {
                                    int LA65_6 = input.LA(5);

                                    if ( (LA65_6==35) ) {
                                        int LA65_7 = input.LA(6);

                                        if ( (synpred105_InternalTermDsl()) ) {
                                            alt65=1;
                                        }
                                    }
                                }
                                else if ( ((LA65_5>=68 && LA65_5<=79)) ) {
                                    alt65=1;
                                }
                            }
                        }
                        else if ( ((LA65_1>=68 && LA65_1<=79)) ) {
                            alt65=1;
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalTermDsl.g:5213:5: otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')'
                            {
                            otherlv_14=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getStructuredDomainAccess().getLeftParenthesisKeyword_3_1_0());
                              				
                            }
                            // InternalTermDsl.g:5217:5: ( (lv_domainMap_15_0= ruleDomain ) )
                            // InternalTermDsl.g:5218:6: (lv_domainMap_15_0= ruleDomain )
                            {
                            // InternalTermDsl.g:5218:6: (lv_domainMap_15_0= ruleDomain )
                            // InternalTermDsl.g:5219:7: lv_domainMap_15_0= ruleDomain
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainMapDomainParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_domainMap_15_0=ruleDomain();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStructuredDomainRule());
                              							}
                              							add(
                              								current,
                              								"domainMap",
                              								lv_domainMap_15_0,
                              								"org.uasm.term.lang.TermDsl.Domain");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_16=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getStructuredDomainAccess().getCommaKeyword_3_1_2());
                              				
                            }
                            // InternalTermDsl.g:5240:5: ( (lv_domainMap_17_0= ruleDomain ) )
                            // InternalTermDsl.g:5241:6: (lv_domainMap_17_0= ruleDomain )
                            {
                            // InternalTermDsl.g:5241:6: (lv_domainMap_17_0= ruleDomain )
                            // InternalTermDsl.g:5242:7: lv_domainMap_17_0= ruleDomain
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainMapDomainParserRuleCall_3_1_3_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_domainMap_17_0=ruleDomain();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getStructuredDomainRule());
                              							}
                              							add(
                              								current,
                              								"domainMap",
                              								lv_domainMap_17_0,
                              								"org.uasm.term.lang.TermDsl.Domain");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_18=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getStructuredDomainAccess().getRightParenthesisKeyword_3_1_4());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStructuredDomain"


    // $ANTLR start "entryRuleExtendableDomain"
    // InternalTermDsl.g:5269:1: entryRuleExtendableDomain returns [EObject current=null] : iv_ruleExtendableDomain= ruleExtendableDomain EOF ;
    public final EObject entryRuleExtendableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendableDomain = null;


        try {
            // InternalTermDsl.g:5269:57: (iv_ruleExtendableDomain= ruleExtendableDomain EOF )
            // InternalTermDsl.g:5270:2: iv_ruleExtendableDomain= ruleExtendableDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendableDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtendableDomain=ruleExtendableDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendableDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtendableDomain"


    // $ANTLR start "ruleExtendableDomain"
    // InternalTermDsl.g:5276:1: ruleExtendableDomain returns [EObject current=null] : ( ( () ( (lv_type_1_0= 'ANY' ) ) ) | ( (lv_type_2_0= 'AGENT' ) ) | ( (lv_type_3_0= ruleIdDomain ) ) ) ;
    public final EObject ruleExtendableDomain() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:5282:2: ( ( ( () ( (lv_type_1_0= 'ANY' ) ) ) | ( (lv_type_2_0= 'AGENT' ) ) | ( (lv_type_3_0= ruleIdDomain ) ) ) )
            // InternalTermDsl.g:5283:2: ( ( () ( (lv_type_1_0= 'ANY' ) ) ) | ( (lv_type_2_0= 'AGENT' ) ) | ( (lv_type_3_0= ruleIdDomain ) ) )
            {
            // InternalTermDsl.g:5283:2: ( ( () ( (lv_type_1_0= 'ANY' ) ) ) | ( (lv_type_2_0= 'AGENT' ) ) | ( (lv_type_3_0= ruleIdDomain ) ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt67=1;
                }
                break;
            case 73:
                {
                alt67=2;
                }
                break;
            case RULE_ID:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalTermDsl.g:5284:3: ( () ( (lv_type_1_0= 'ANY' ) ) )
                    {
                    // InternalTermDsl.g:5284:3: ( () ( (lv_type_1_0= 'ANY' ) ) )
                    // InternalTermDsl.g:5285:4: () ( (lv_type_1_0= 'ANY' ) )
                    {
                    // InternalTermDsl.g:5285:4: ()
                    // InternalTermDsl.g:5286:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExtendableDomainAccess().getExtendableDomainAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:5295:4: ( (lv_type_1_0= 'ANY' ) )
                    // InternalTermDsl.g:5296:5: (lv_type_1_0= 'ANY' )
                    {
                    // InternalTermDsl.g:5296:5: (lv_type_1_0= 'ANY' )
                    // InternalTermDsl.g:5297:6: lv_type_1_0= 'ANY'
                    {
                    lv_type_1_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_1_0, grammarAccess.getExtendableDomainAccess().getTypeANYKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExtendableDomainRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_1_0, "ANY");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:5311:3: ( (lv_type_2_0= 'AGENT' ) )
                    {
                    // InternalTermDsl.g:5311:3: ( (lv_type_2_0= 'AGENT' ) )
                    // InternalTermDsl.g:5312:4: (lv_type_2_0= 'AGENT' )
                    {
                    // InternalTermDsl.g:5312:4: (lv_type_2_0= 'AGENT' )
                    // InternalTermDsl.g:5313:5: lv_type_2_0= 'AGENT'
                    {
                    lv_type_2_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_2_0, grammarAccess.getExtendableDomainAccess().getTypeAGENTKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExtendableDomainRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_2_0, "AGENT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:5326:3: ( (lv_type_3_0= ruleIdDomain ) )
                    {
                    // InternalTermDsl.g:5326:3: ( (lv_type_3_0= ruleIdDomain ) )
                    // InternalTermDsl.g:5327:4: (lv_type_3_0= ruleIdDomain )
                    {
                    // InternalTermDsl.g:5327:4: (lv_type_3_0= ruleIdDomain )
                    // InternalTermDsl.g:5328:5: lv_type_3_0= ruleIdDomain
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExtendableDomainAccess().getTypeIdDomainParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleIdDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExtendableDomainRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_3_0,
                      						"org.uasm.term.lang.TermDsl.IdDomain");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExtendableDomain"


    // $ANTLR start "entryRuleBasicDomain"
    // InternalTermDsl.g:5349:1: entryRuleBasicDomain returns [EObject current=null] : iv_ruleBasicDomain= ruleBasicDomain EOF ;
    public final EObject entryRuleBasicDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicDomain = null;


        try {
            // InternalTermDsl.g:5349:52: (iv_ruleBasicDomain= ruleBasicDomain EOF )
            // InternalTermDsl.g:5350:2: iv_ruleBasicDomain= ruleBasicDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicDomain=ruleBasicDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicDomain"


    // $ANTLR start "ruleBasicDomain"
    // InternalTermDsl.g:5356:1: ruleBasicDomain returns [EObject current=null] : ( () ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) ) ) ;
    public final EObject ruleBasicDomain() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeBasicDom_1_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:5362:2: ( ( () ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) ) ) )
            // InternalTermDsl.g:5363:2: ( () ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) ) )
            {
            // InternalTermDsl.g:5363:2: ( () ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) ) )
            // InternalTermDsl.g:5364:3: () ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) )
            {
            // InternalTermDsl.g:5364:3: ()
            // InternalTermDsl.g:5365:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBasicDomainAccess().getBasicDomainAction_0(),
              					current);
              			
            }

            }

            // InternalTermDsl.g:5374:3: ( (lv_typeBasicDom_1_0= ruleBasicDomainEnum ) )
            // InternalTermDsl.g:5375:4: (lv_typeBasicDom_1_0= ruleBasicDomainEnum )
            {
            // InternalTermDsl.g:5375:4: (lv_typeBasicDom_1_0= ruleBasicDomainEnum )
            // InternalTermDsl.g:5376:5: lv_typeBasicDom_1_0= ruleBasicDomainEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicDomainAccess().getTypeBasicDomBasicDomainEnumEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeBasicDom_1_0=ruleBasicDomainEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBasicDomainRule());
              					}
              					set(
              						current,
              						"typeBasicDom",
              						lv_typeBasicDom_1_0,
              						"org.uasm.term.lang.TermDsl.BasicDomainEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicDomain"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalTermDsl.g:5397:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalTermDsl.g:5397:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalTermDsl.g:5398:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalTermDsl.g:5404:1: ruleNumberLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_valueDec_2_0= RULE_TK_FLOAT ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_valueDec_2_0=null;


        	enterRule();

        try {
            // InternalTermDsl.g:5410:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_valueDec_2_0= RULE_TK_FLOAT ) ) ) )
            // InternalTermDsl.g:5411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_valueDec_2_0= RULE_TK_FLOAT ) ) )
            {
            // InternalTermDsl.g:5411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_valueDec_2_0= RULE_TK_FLOAT ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_TK_FLOAT) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalTermDsl.g:5412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalTermDsl.g:5412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalTermDsl.g:5413:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalTermDsl.g:5413:4: ()
                    // InternalTermDsl.g:5414:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTermDsl.g:5423:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalTermDsl.g:5424:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalTermDsl.g:5424:5: (lv_value_1_0= RULE_INT )
                    // InternalTermDsl.g:5425:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNumberLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:5443:3: ( (lv_valueDec_2_0= RULE_TK_FLOAT ) )
                    {
                    // InternalTermDsl.g:5443:3: ( (lv_valueDec_2_0= RULE_TK_FLOAT ) )
                    // InternalTermDsl.g:5444:4: (lv_valueDec_2_0= RULE_TK_FLOAT )
                    {
                    // InternalTermDsl.g:5444:4: (lv_valueDec_2_0= RULE_TK_FLOAT )
                    // InternalTermDsl.g:5445:5: lv_valueDec_2_0= RULE_TK_FLOAT
                    {
                    lv_valueDec_2_0=(Token)match(input,RULE_TK_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valueDec_2_0, grammarAccess.getNumberLiteralAccess().getValueDecTK_FLOATTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNumberLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"valueDec",
                      						lv_valueDec_2_0,
                      						"org.uasm.term.lang.TermDsl.TK_FLOAT");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleTupleLiteral"
    // InternalTermDsl.g:5465:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // InternalTermDsl.g:5465:53: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // InternalTermDsl.g:5466:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteral"


    // $ANTLR start "ruleTupleLiteral"
    // InternalTermDsl.g:5472:1: ruleTupleLiteral returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literals_2_0 = null;

        EObject lv_literals_4_0 = null;



        	enterRule();

        try {
            // InternalTermDsl.g:5478:2: ( ( () otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )* otherlv_5= ')' ) )
            // InternalTermDsl.g:5479:2: ( () otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )* otherlv_5= ')' )
            {
            // InternalTermDsl.g:5479:2: ( () otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )* otherlv_5= ')' )
            // InternalTermDsl.g:5480:3: () otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )* otherlv_5= ')'
            {
            // InternalTermDsl.g:5480:3: ()
            // InternalTermDsl.g:5481:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTermDsl.g:5494:3: ( (lv_literals_2_0= ruleLiteral ) )
            // InternalTermDsl.g:5495:4: (lv_literals_2_0= ruleLiteral )
            {
            // InternalTermDsl.g:5495:4: (lv_literals_2_0= ruleLiteral )
            // InternalTermDsl.g:5496:5: lv_literals_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralAccess().getLiteralsLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_literals_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
              					}
              					add(
              						current,
              						"literals",
              						lv_literals_2_0,
              						"org.uasm.term.lang.TermDsl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTermDsl.g:5513:3: (otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==36) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalTermDsl.g:5514:4: otherlv_3= ',' ( (lv_literals_4_0= ruleLiteral ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalTermDsl.g:5518:4: ( (lv_literals_4_0= ruleLiteral ) )
            	    // InternalTermDsl.g:5519:5: (lv_literals_4_0= ruleLiteral )
            	    {
            	    // InternalTermDsl.g:5519:5: (lv_literals_4_0= ruleLiteral )
            	    // InternalTermDsl.g:5520:6: lv_literals_4_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralAccess().getLiteralsLiteralParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_literals_4_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
            	      						}
            	      						add(
            	      							current,
            	      							"literals",
            	      							lv_literals_4_0,
            	      							"org.uasm.term.lang.TermDsl.Literal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteral"


    // $ANTLR start "ruleBasicDomainEnum"
    // InternalTermDsl.g:5546:1: ruleBasicDomainEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'CHAR' ) | (enumLiteral_4= 'BOOLEAN' ) | (enumLiteral_5= 'RULE' ) ) ;
    public final Enumerator ruleBasicDomainEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTermDsl.g:5552:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'CHAR' ) | (enumLiteral_4= 'BOOLEAN' ) | (enumLiteral_5= 'RULE' ) ) )
            // InternalTermDsl.g:5553:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'CHAR' ) | (enumLiteral_4= 'BOOLEAN' ) | (enumLiteral_5= 'RULE' ) )
            {
            // InternalTermDsl.g:5553:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'CHAR' ) | (enumLiteral_4= 'BOOLEAN' ) | (enumLiteral_5= 'RULE' ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt70=1;
                }
                break;
            case 75:
                {
                alt70=2;
                }
                break;
            case 76:
                {
                alt70=3;
                }
                break;
            case 77:
                {
                alt70=4;
                }
                break;
            case 78:
                {
                alt70=5;
                }
                break;
            case 79:
                {
                alt70=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalTermDsl.g:5554:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalTermDsl.g:5554:3: (enumLiteral_0= 'STRING' )
                    // InternalTermDsl.g:5555:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicDomainEnumAccess().getStringEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTermDsl.g:5562:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalTermDsl.g:5562:3: (enumLiteral_1= 'NUMBER' )
                    // InternalTermDsl.g:5563:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicDomainEnumAccess().getNumberEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTermDsl.g:5570:3: (enumLiteral_2= 'INTEGER' )
                    {
                    // InternalTermDsl.g:5570:3: (enumLiteral_2= 'INTEGER' )
                    // InternalTermDsl.g:5571:4: enumLiteral_2= 'INTEGER'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicDomainEnumAccess().getIntegerEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTermDsl.g:5578:3: (enumLiteral_3= 'CHAR' )
                    {
                    // InternalTermDsl.g:5578:3: (enumLiteral_3= 'CHAR' )
                    // InternalTermDsl.g:5579:4: enumLiteral_3= 'CHAR'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicDomainEnumAccess().getCharEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTermDsl.g:5586:3: (enumLiteral_4= 'BOOLEAN' )
                    {
                    // InternalTermDsl.g:5586:3: (enumLiteral_4= 'BOOLEAN' )
                    // InternalTermDsl.g:5587:4: enumLiteral_4= 'BOOLEAN'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBasicDomainEnumAccess().getBooleanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTermDsl.g:5594:3: (enumLiteral_5= 'RULE' )
                    {
                    // InternalTermDsl.g:5594:3: (enumLiteral_5= 'RULE' )
                    // InternalTermDsl.g:5595:4: enumLiteral_5= 'RULE'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicDomainEnumAccess().getRuleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBasicDomainEnumAccess().getRuleEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicDomainEnum"

    // $ANTLR start synpred1_InternalTermDsl
    public final void synpred1_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


        // InternalTermDsl.g:126:4: ( () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) ) )
        // InternalTermDsl.g:126:4: () otherlv_2= '?' ( (lv_then_3_0= ruleImpliesExpression ) ) otherlv_4= ':' ( (lv_else_5_0= ruleImpliesExpression ) )
        {
        // InternalTermDsl.g:126:4: ()
        // InternalTermDsl.g:127:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTermDsl.g:140:4: ( (lv_then_3_0= ruleImpliesExpression ) )
        // InternalTermDsl.g:141:5: (lv_then_3_0= ruleImpliesExpression )
        {
        // InternalTermDsl.g:141:5: (lv_then_3_0= ruleImpliesExpression )
        // InternalTermDsl.g:142:6: lv_then_3_0= ruleImpliesExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondTernaryExpressionAccess().getThenImpliesExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_5);
        lv_then_3_0=ruleImpliesExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,14,FOLLOW_4); if (state.failed) return ;
        // InternalTermDsl.g:163:4: ( (lv_else_5_0= ruleImpliesExpression ) )
        // InternalTermDsl.g:164:5: (lv_else_5_0= ruleImpliesExpression )
        {
        // InternalTermDsl.g:164:5: (lv_else_5_0= ruleImpliesExpression )
        // InternalTermDsl.g:165:6: lv_else_5_0= ruleImpliesExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondTernaryExpressionAccess().getElseImpliesExpressionParserRuleCall_1_4_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_else_5_0=ruleImpliesExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalTermDsl

    // $ANTLR start synpred2_InternalTermDsl
    public final void synpred2_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:214:4: ( () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )
        // InternalTermDsl.g:214:4: () ( (lv_op_2_0= 'implies' ) ) ( (lv_right_3_0= ruleOrExpression ) )
        {
        // InternalTermDsl.g:214:4: ()
        // InternalTermDsl.g:215:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:224:4: ( (lv_op_2_0= 'implies' ) )
        // InternalTermDsl.g:225:5: (lv_op_2_0= 'implies' )
        {
        // InternalTermDsl.g:225:5: (lv_op_2_0= 'implies' )
        // InternalTermDsl.g:226:6: lv_op_2_0= 'implies'
        {
        lv_op_2_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalTermDsl.g:238:4: ( (lv_right_3_0= ruleOrExpression ) )
        // InternalTermDsl.g:239:5: (lv_right_3_0= ruleOrExpression )
        {
        // InternalTermDsl.g:239:5: (lv_right_3_0= ruleOrExpression )
        // InternalTermDsl.g:240:6: lv_right_3_0= ruleOrExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalTermDsl

    // $ANTLR start synpred3_InternalTermDsl
    public final void synpred3_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:289:4: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )
        // InternalTermDsl.g:289:4: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleXorExpression ) )
        {
        // InternalTermDsl.g:289:4: ()
        // InternalTermDsl.g:290:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:299:4: ( (lv_op_2_0= 'or' ) )
        // InternalTermDsl.g:300:5: (lv_op_2_0= 'or' )
        {
        // InternalTermDsl.g:300:5: (lv_op_2_0= 'or' )
        // InternalTermDsl.g:301:6: lv_op_2_0= 'or'
        {
        lv_op_2_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalTermDsl.g:313:4: ( (lv_right_3_0= ruleXorExpression ) )
        // InternalTermDsl.g:314:5: (lv_right_3_0= ruleXorExpression )
        {
        // InternalTermDsl.g:314:5: (lv_right_3_0= ruleXorExpression )
        // InternalTermDsl.g:315:6: lv_right_3_0= ruleXorExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleXorExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalTermDsl

    // $ANTLR start synpred4_InternalTermDsl
    public final void synpred4_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:364:4: ( () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )
        // InternalTermDsl.g:364:4: () ( (lv_op_2_0= 'xor' ) ) ( (lv_right_3_0= ruleAndExpression ) )
        {
        // InternalTermDsl.g:364:4: ()
        // InternalTermDsl.g:365:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:374:4: ( (lv_op_2_0= 'xor' ) )
        // InternalTermDsl.g:375:5: (lv_op_2_0= 'xor' )
        {
        // InternalTermDsl.g:375:5: (lv_op_2_0= 'xor' )
        // InternalTermDsl.g:376:6: lv_op_2_0= 'xor'
        {
        lv_op_2_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalTermDsl.g:388:4: ( (lv_right_3_0= ruleAndExpression ) )
        // InternalTermDsl.g:389:5: (lv_right_3_0= ruleAndExpression )
        {
        // InternalTermDsl.g:389:5: (lv_right_3_0= ruleAndExpression )
        // InternalTermDsl.g:390:6: lv_right_3_0= ruleAndExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalTermDsl

    // $ANTLR start synpred5_InternalTermDsl
    public final void synpred5_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:439:4: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )
        // InternalTermDsl.g:439:4: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
        {
        // InternalTermDsl.g:439:4: ()
        // InternalTermDsl.g:440:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:449:4: ( (lv_op_2_0= 'and' ) )
        // InternalTermDsl.g:450:5: (lv_op_2_0= 'and' )
        {
        // InternalTermDsl.g:450:5: (lv_op_2_0= 'and' )
        // InternalTermDsl.g:451:6: lv_op_2_0= 'and'
        {
        lv_op_2_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalTermDsl.g:463:4: ( (lv_right_3_0= ruleEqualityExpression ) )
        // InternalTermDsl.g:464:5: (lv_right_3_0= ruleEqualityExpression )
        {
        // InternalTermDsl.g:464:5: (lv_right_3_0= ruleEqualityExpression )
        // InternalTermDsl.g:465:6: lv_right_3_0= ruleEqualityExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleEqualityExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalTermDsl

    // $ANTLR start synpred7_InternalTermDsl
    public final void synpred7_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:514:4: ( () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )
        // InternalTermDsl.g:514:4: () ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) ) ( (lv_right_3_0= ruleRelationExpression ) )
        {
        // InternalTermDsl.g:514:4: ()
        // InternalTermDsl.g:515:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:524:4: ( ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) ) )
        // InternalTermDsl.g:525:5: ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) )
        {
        // InternalTermDsl.g:525:5: ( (lv_op_2_1= '!=' | lv_op_2_2= '=' ) )
        // InternalTermDsl.g:526:6: (lv_op_2_1= '!=' | lv_op_2_2= '=' )
        {
        // InternalTermDsl.g:526:6: (lv_op_2_1= '!=' | lv_op_2_2= '=' )
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==19) ) {
            alt71=1;
        }
        else if ( (LA71_0==20) ) {
            alt71=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 71, 0, input);

            throw nvae;
        }
        switch (alt71) {
            case 1 :
                // InternalTermDsl.g:527:7: lv_op_2_1= '!='
                {
                lv_op_2_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalTermDsl.g:538:7: lv_op_2_2= '='
                {
                lv_op_2_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalTermDsl.g:551:4: ( (lv_right_3_0= ruleRelationExpression ) )
        // InternalTermDsl.g:552:5: (lv_right_3_0= ruleRelationExpression )
        {
        // InternalTermDsl.g:552:5: (lv_right_3_0= ruleRelationExpression )
        // InternalTermDsl.g:553:6: lv_right_3_0= ruleRelationExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleRelationExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalTermDsl

    // $ANTLR start synpred12_InternalTermDsl
    public final void synpred12_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:602:4: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )
        // InternalTermDsl.g:602:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
        {
        // InternalTermDsl.g:602:4: ()
        // InternalTermDsl.g:603:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:612:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) ) )
        // InternalTermDsl.g:613:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) )
        {
        // InternalTermDsl.g:613:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' ) )
        // InternalTermDsl.g:614:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' )
        {
        // InternalTermDsl.g:614:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'memberof' )
        int alt72=5;
        switch ( input.LA(1) ) {
        case 21:
            {
            alt72=1;
            }
            break;
        case 22:
            {
            alt72=2;
            }
            break;
        case 23:
            {
            alt72=3;
            }
            break;
        case 24:
            {
            alt72=4;
            }
            break;
        case 25:
            {
            alt72=5;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 72, 0, input);

            throw nvae;
        }

        switch (alt72) {
            case 1 :
                // InternalTermDsl.g:615:7: lv_op_2_1= '<'
                {
                lv_op_2_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalTermDsl.g:626:7: lv_op_2_2= '>'
                {
                lv_op_2_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalTermDsl.g:637:7: lv_op_2_3= '<='
                {
                lv_op_2_3=(Token)match(input,23,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalTermDsl.g:648:7: lv_op_2_4= '>='
                {
                lv_op_2_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalTermDsl.g:659:7: lv_op_2_5= 'memberof'
                {
                lv_op_2_5=(Token)match(input,25,FOLLOW_4); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalTermDsl.g:672:4: ( (lv_right_3_0= ruleAddExpression ) )
        // InternalTermDsl.g:673:5: (lv_right_3_0= ruleAddExpression )
        {
        // InternalTermDsl.g:673:5: (lv_right_3_0= ruleAddExpression )
        // InternalTermDsl.g:674:6: lv_right_3_0= ruleAddExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRightAddExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalTermDsl

    // $ANTLR start synpred14_InternalTermDsl
    public final void synpred14_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:723:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) ) )
        // InternalTermDsl.g:723:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpression ) )
        {
        // InternalTermDsl.g:723:4: ()
        // InternalTermDsl.g:724:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:733:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
        // InternalTermDsl.g:734:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
        {
        // InternalTermDsl.g:734:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
        // InternalTermDsl.g:735:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
        {
        // InternalTermDsl.g:735:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
        int alt73=2;
        int LA73_0 = input.LA(1);

        if ( (LA73_0==26) ) {
            alt73=1;
        }
        else if ( (LA73_0==27) ) {
            alt73=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 73, 0, input);

            throw nvae;
        }
        switch (alt73) {
            case 1 :
                // InternalTermDsl.g:736:7: lv_op_2_1= '+'
                {
                lv_op_2_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalTermDsl.g:747:7: lv_op_2_2= '-'
                {
                lv_op_2_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalTermDsl.g:760:4: ( (lv_right_3_0= ruleMultExpression ) )
        // InternalTermDsl.g:761:5: (lv_right_3_0= ruleMultExpression )
        {
        // InternalTermDsl.g:761:5: (lv_right_3_0= ruleMultExpression )
        // InternalTermDsl.g:762:6: lv_right_3_0= ruleMultExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleMultExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalTermDsl

    // $ANTLR start synpred18_InternalTermDsl
    public final void synpred18_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:811:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )
        // InternalTermDsl.g:811:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
        {
        // InternalTermDsl.g:811:4: ()
        // InternalTermDsl.g:812:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:821:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) ) )
        // InternalTermDsl.g:822:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) )
        {
        // InternalTermDsl.g:822:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' ) )
        // InternalTermDsl.g:823:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' )
        {
        // InternalTermDsl.g:823:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' | lv_op_2_4= 'div' )
        int alt74=4;
        switch ( input.LA(1) ) {
        case 28:
            {
            alt74=1;
            }
            break;
        case 29:
            {
            alt74=2;
            }
            break;
        case 30:
            {
            alt74=3;
            }
            break;
        case 31:
            {
            alt74=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 74, 0, input);

            throw nvae;
        }

        switch (alt74) {
            case 1 :
                // InternalTermDsl.g:824:7: lv_op_2_1= '*'
                {
                lv_op_2_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalTermDsl.g:835:7: lv_op_2_2= '/'
                {
                lv_op_2_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalTermDsl.g:846:7: lv_op_2_3= 'mod'
                {
                lv_op_2_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalTermDsl.g:857:7: lv_op_2_4= 'div'
                {
                lv_op_2_4=(Token)match(input,31,FOLLOW_4); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalTermDsl.g:870:4: ( (lv_right_3_0= rulePowerExpression ) )
        // InternalTermDsl.g:871:5: (lv_right_3_0= rulePowerExpression )
        {
        // InternalTermDsl.g:871:5: (lv_right_3_0= rulePowerExpression )
        // InternalTermDsl.g:872:6: lv_right_3_0= rulePowerExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getMultExpressionAccess().getRightPowerExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=rulePowerExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalTermDsl

    // $ANTLR start synpred19_InternalTermDsl
    public final void synpred19_InternalTermDsl_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalTermDsl.g:921:4: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )
        // InternalTermDsl.g:921:4: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
        {
        // InternalTermDsl.g:921:4: ()
        // InternalTermDsl.g:922:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTermDsl.g:931:4: ( (lv_op_2_0= '^' ) )
        // InternalTermDsl.g:932:5: (lv_op_2_0= '^' )
        {
        // InternalTermDsl.g:932:5: (lv_op_2_0= '^' )
        // InternalTermDsl.g:933:6: lv_op_2_0= '^'
        {
        lv_op_2_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalTermDsl.g:945:4: ( (lv_right_3_0= ruleUnaryExpression ) )
        // InternalTermDsl.g:946:5: (lv_right_3_0= ruleUnaryExpression )
        {
        // InternalTermDsl.g:946:5: (lv_right_3_0= ruleUnaryExpression )
        // InternalTermDsl.g:947:6: lv_right_3_0= ruleUnaryExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleUnaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalTermDsl

    // $ANTLR start synpred24_InternalTermDsl
    public final void synpred24_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_BasicTerm_0 = null;


        // InternalTermDsl.g:1114:3: (this_BasicTerm_0= ruleBasicTerm )
        // InternalTermDsl.g:1114:3: this_BasicTerm_0= ruleBasicTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_BasicTerm_0=ruleBasicTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalTermDsl

    // $ANTLR start synpred25_InternalTermDsl
    public final void synpred25_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_TupleTerm_0 = null;


        // InternalTermDsl.g:1166:3: (this_TupleTerm_0= ruleTupleTerm )
        // InternalTermDsl.g:1166:3: this_TupleTerm_0= ruleTupleTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TupleTerm_0=ruleTupleTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalTermDsl

    // $ANTLR start synpred26_InternalTermDsl
    public final void synpred26_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_LocationTerm_1 = null;


        // InternalTermDsl.g:1178:3: (this_LocationTerm_1= ruleLocationTerm )
        // InternalTermDsl.g:1178:3: this_LocationTerm_1= ruleLocationTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LocationTerm_1=ruleLocationTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalTermDsl

    // $ANTLR start synpred27_InternalTermDsl
    public final void synpred27_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_ComprehensionTerm_2 = null;


        // InternalTermDsl.g:1190:3: (this_ComprehensionTerm_2= ruleComprehensionTerm )
        // InternalTermDsl.g:1190:3: this_ComprehensionTerm_2= ruleComprehensionTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ComprehensionTerm_2=ruleComprehensionTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalTermDsl

    // $ANTLR start synpred28_InternalTermDsl
    public final void synpred28_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_StructureTerm_3 = null;


        // InternalTermDsl.g:1202:3: (this_StructureTerm_3= ruleStructureTerm )
        // InternalTermDsl.g:1202:3: this_StructureTerm_3= ruleStructureTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_StructureTerm_3=ruleStructureTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalTermDsl

    // $ANTLR start synpred37_InternalTermDsl
    public final void synpred37_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_Literal_12 = null;


        // InternalTermDsl.g:1310:3: (this_Literal_12= ruleLiteral )
        // InternalTermDsl.g:1310:3: this_Literal_12= ruleLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Literal_12=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalTermDsl

    // $ANTLR start synpred38_InternalTermDsl
    public final void synpred38_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_TupleLiteral_13 = null;


        // InternalTermDsl.g:1322:3: (this_TupleLiteral_13= ruleTupleLiteral )
        // InternalTermDsl.g:1322:3: this_TupleLiteral_13= ruleTupleLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TupleLiteral_13=ruleTupleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalTermDsl

    // $ANTLR start synpred40_InternalTermDsl
    public final void synpred40_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_3_0 = null;


        // InternalTermDsl.g:1475:4: ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) )
        // InternalTermDsl.g:1475:4: (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' )
        {
        // InternalTermDsl.g:1475:4: (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' )
        // InternalTermDsl.g:1476:5: otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return ;
        // InternalTermDsl.g:1480:5: ( (lv_args_3_0= ruleTerm ) )
        // InternalTermDsl.g:1481:6: (lv_args_3_0= ruleTerm )
        {
        // InternalTermDsl.g:1481:6: (lv_args_3_0= ruleTerm )
        // InternalTermDsl.g:1482:7: lv_args_3_0= ruleTerm
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getFunctionTermAccess().getArgsTermParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FOLLOW_15);
        lv_args_3_0=ruleTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred40_InternalTermDsl

    // $ANTLR start synpred41_InternalTermDsl
    public final void synpred41_InternalTermDsl_fragment() throws RecognitionException {   
        EObject lv_argsTuple_5_0 = null;


        // InternalTermDsl.g:1505:4: ( ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )
        // InternalTermDsl.g:1505:4: ( (lv_argsTuple_5_0= ruleTupleTerm ) )
        {
        // InternalTermDsl.g:1505:4: ( (lv_argsTuple_5_0= ruleTupleTerm ) )
        // InternalTermDsl.g:1506:5: (lv_argsTuple_5_0= ruleTupleTerm )
        {
        // InternalTermDsl.g:1506:5: (lv_argsTuple_5_0= ruleTupleTerm )
        // InternalTermDsl.g:1507:6: lv_argsTuple_5_0= ruleTupleTerm
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFunctionTermAccess().getArgsTupleTupleTermParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_argsTuple_5_0=ruleTupleTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41_InternalTermDsl

    // $ANTLR start synpred42_InternalTermDsl
    public final void synpred42_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_Term_0 = null;


        // InternalTermDsl.g:1568:3: (this_Term_0= ruleTerm )
        // InternalTermDsl.g:1568:3: this_Term_0= ruleTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Term_0=ruleTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalTermDsl

    // $ANTLR start synpred44_InternalTermDsl
    public final void synpred44_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_IntervalLiteral_0 = null;


        // InternalTermDsl.g:1710:3: (this_IntervalLiteral_0= ruleIntervalLiteral )
        // InternalTermDsl.g:1710:3: this_IntervalLiteral_0= ruleIntervalLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_IntervalLiteral_0=ruleIntervalLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalTermDsl

    // $ANTLR start synpred45_InternalTermDsl
    public final void synpred45_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_SetLiteral_1 = null;


        // InternalTermDsl.g:1722:3: (this_SetLiteral_1= ruleSetLiteral )
        // InternalTermDsl.g:1722:3: this_SetLiteral_1= ruleSetLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SetLiteral_1=ruleSetLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalTermDsl

    // $ANTLR start synpred46_InternalTermDsl
    public final void synpred46_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_ListLiteral_2 = null;


        // InternalTermDsl.g:1734:3: (this_ListLiteral_2= ruleListLiteral )
        // InternalTermDsl.g:1734:3: this_ListLiteral_2= ruleListLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ListLiteral_2=ruleListLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalTermDsl

    // $ANTLR start synpred48_InternalTermDsl
    public final void synpred48_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_MapLiteral_4 = null;


        // InternalTermDsl.g:1758:3: (this_MapLiteral_4= ruleMapLiteral )
        // InternalTermDsl.g:1758:3: this_MapLiteral_4= ruleMapLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_MapLiteral_4=ruleMapLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalTermDsl

    // $ANTLR start synpred52_InternalTermDsl
    public final void synpred52_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_StringLiteral_8 = null;


        // InternalTermDsl.g:1806:3: (this_StringLiteral_8= ruleStringLiteral )
        // InternalTermDsl.g:1806:3: this_StringLiteral_8= ruleStringLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_StringLiteral_8=ruleStringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalTermDsl

    // $ANTLR start synpred53_InternalTermDsl
    public final void synpred53_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_CharLiteral_9 = null;


        // InternalTermDsl.g:1818:3: (this_CharLiteral_9= ruleCharLiteral )
        // InternalTermDsl.g:1818:3: this_CharLiteral_9= ruleCharLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CharLiteral_9=ruleCharLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalTermDsl

    // $ANTLR start synpred68_InternalTermDsl
    public final void synpred68_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_term_5_0 = null;


        // InternalTermDsl.g:2920:4: (otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) ) )
        // InternalTermDsl.g:2920:4: otherlv_4= 'with' ( (lv_term_5_0= ruleTerm ) )
        {
        otherlv_4=(Token)match(input,54,FOLLOW_4); if (state.failed) return ;
        // InternalTermDsl.g:2924:4: ( (lv_term_5_0= ruleTerm ) )
        // InternalTermDsl.g:2925:5: (lv_term_5_0= ruleTerm )
        {
        // InternalTermDsl.g:2925:5: (lv_term_5_0= ruleTerm )
        // InternalTermDsl.g:2926:6: lv_term_5_0= ruleTerm
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPickTermAccess().getTermTermParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_term_5_0=ruleTerm();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred68_InternalTermDsl

    // $ANTLR start synpred69_InternalTermDsl
    public final void synpred69_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;

        // InternalTermDsl.g:3033:4: (otherlv_6= 'endif' )
        // InternalTermDsl.g:3033:4: otherlv_6= 'endif'
        {
        otherlv_6=(Token)match(input,60,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalTermDsl

    // $ANTLR start synpred73_InternalTermDsl
    public final void synpred73_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_SetComprehensionTerm_0 = null;


        // InternalTermDsl.g:3430:3: (this_SetComprehensionTerm_0= ruleSetComprehensionTerm )
        // InternalTermDsl.g:3430:3: this_SetComprehensionTerm_0= ruleSetComprehensionTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SetComprehensionTerm_0=ruleSetComprehensionTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalTermDsl

    // $ANTLR start synpred74_InternalTermDsl
    public final void synpred74_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_ListComprehensionTerm_1 = null;


        // InternalTermDsl.g:3442:3: (this_ListComprehensionTerm_1= ruleListComprehensionTerm )
        // InternalTermDsl.g:3442:3: this_ListComprehensionTerm_1= ruleListComprehensionTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ListComprehensionTerm_1=ruleListComprehensionTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalTermDsl

    // $ANTLR start synpred75_InternalTermDsl
    public final void synpred75_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_MapComprehensionTerm_2 = null;


        // InternalTermDsl.g:3454:3: (this_MapComprehensionTerm_2= ruleMapComprehensionTerm )
        // InternalTermDsl.g:3454:3: this_MapComprehensionTerm_2= ruleMapComprehensionTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_MapComprehensionTerm_2=ruleMapComprehensionTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalTermDsl

    // $ANTLR start synpred86_InternalTermDsl
    public final void synpred86_InternalTermDsl_fragment() throws RecognitionException {   
        EObject this_SetTerm_0 = null;


        // InternalTermDsl.g:4335:3: (this_SetTerm_0= ruleSetTerm )
        // InternalTermDsl.g:4335:3: this_SetTerm_0= ruleSetTerm
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SetTerm_0=ruleSetTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalTermDsl

    // $ANTLR start synpred99_InternalTermDsl
    public final void synpred99_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_domainSet_3_0 = null;


        // InternalTermDsl.g:5075:5: (otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')' )
        // InternalTermDsl.g:5075:5: otherlv_2= '(' ( (lv_domainSet_3_0= ruleDomain ) ) otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,34,FOLLOW_34); if (state.failed) return ;
        // InternalTermDsl.g:5079:5: ( (lv_domainSet_3_0= ruleDomain ) )
        // InternalTermDsl.g:5080:6: (lv_domainSet_3_0= ruleDomain )
        {
        // InternalTermDsl.g:5080:6: (lv_domainSet_3_0= ruleDomain )
        // InternalTermDsl.g:5081:7: lv_domainSet_3_0= ruleDomain
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainSetDomainParserRuleCall_0_2_1_0());
          						
        }
        pushFollow(FOLLOW_15);
        lv_domainSet_3_0=ruleDomain();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_InternalTermDsl

    // $ANTLR start synpred101_InternalTermDsl
    public final void synpred101_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_domainBag_7_0 = null;


        // InternalTermDsl.g:5121:5: (otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')' )
        // InternalTermDsl.g:5121:5: otherlv_6= '(' ( (lv_domainBag_7_0= ruleDomain ) ) otherlv_8= ')'
        {
        otherlv_6=(Token)match(input,34,FOLLOW_34); if (state.failed) return ;
        // InternalTermDsl.g:5125:5: ( (lv_domainBag_7_0= ruleDomain ) )
        // InternalTermDsl.g:5126:6: (lv_domainBag_7_0= ruleDomain )
        {
        // InternalTermDsl.g:5126:6: (lv_domainBag_7_0= ruleDomain )
        // InternalTermDsl.g:5127:7: lv_domainBag_7_0= ruleDomain
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainBagDomainParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_15);
        lv_domainBag_7_0=ruleDomain();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalTermDsl

    // $ANTLR start synpred103_InternalTermDsl
    public final void synpred103_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_domainList_11_0 = null;


        // InternalTermDsl.g:5167:5: (otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')' )
        // InternalTermDsl.g:5167:5: otherlv_10= '(' ( (lv_domainList_11_0= ruleDomain ) ) otherlv_12= ')'
        {
        otherlv_10=(Token)match(input,34,FOLLOW_34); if (state.failed) return ;
        // InternalTermDsl.g:5171:5: ( (lv_domainList_11_0= ruleDomain ) )
        // InternalTermDsl.g:5172:6: (lv_domainList_11_0= ruleDomain )
        {
        // InternalTermDsl.g:5172:6: (lv_domainList_11_0= ruleDomain )
        // InternalTermDsl.g:5173:7: lv_domainList_11_0= ruleDomain
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainListDomainParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_15);
        lv_domainList_11_0=ruleDomain();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalTermDsl

    // $ANTLR start synpred105_InternalTermDsl
    public final void synpred105_InternalTermDsl_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_domainMap_15_0 = null;

        EObject lv_domainMap_17_0 = null;


        // InternalTermDsl.g:5213:5: (otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')' )
        // InternalTermDsl.g:5213:5: otherlv_14= '(' ( (lv_domainMap_15_0= ruleDomain ) ) otherlv_16= ',' ( (lv_domainMap_17_0= ruleDomain ) ) otherlv_18= ')'
        {
        otherlv_14=(Token)match(input,34,FOLLOW_34); if (state.failed) return ;
        // InternalTermDsl.g:5217:5: ( (lv_domainMap_15_0= ruleDomain ) )
        // InternalTermDsl.g:5218:6: (lv_domainMap_15_0= ruleDomain )
        {
        // InternalTermDsl.g:5218:6: (lv_domainMap_15_0= ruleDomain )
        // InternalTermDsl.g:5219:7: lv_domainMap_15_0= ruleDomain
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainMapDomainParserRuleCall_3_1_1_0());
          						
        }
        pushFollow(FOLLOW_16);
        lv_domainMap_15_0=ruleDomain();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_16=(Token)match(input,36,FOLLOW_34); if (state.failed) return ;
        // InternalTermDsl.g:5240:5: ( (lv_domainMap_17_0= ruleDomain ) )
        // InternalTermDsl.g:5241:6: (lv_domainMap_17_0= ruleDomain )
        {
        // InternalTermDsl.g:5241:6: (lv_domainMap_17_0= ruleDomain )
        // InternalTermDsl.g:5242:7: lv_domainMap_17_0= ruleDomain
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getStructuredDomainAccess().getDomainMapDomainParserRuleCall_3_1_3_0());
          						
        }
        pushFollow(FOLLOW_15);
        lv_domainMap_17_0=ruleDomain();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_18=(Token)match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalTermDsl

    // Delegated rules

    public final boolean synpred38_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalTermDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalTermDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\1\0\26\uffff";
    static final String dfa_3s = "\1\103\1\0\26\uffff";
    static final String dfa_4s = "\2\uffff\1\1\24\uffff\1\2";
    static final String dfa_5s = "\1\uffff\1\0\26\uffff}>";
    static final String[] dfa_6s = {
            "\4\2\15\uffff\1\2\14\uffff\1\1\2\uffff\6\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\2\uffff\3\2\3\uffff\1\2\3\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1113:2: (this_BasicTerm_0= ruleBasicTerm | (otherlv_1= '(' this_Term_2= ruleTerm otherlv_3= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalTermDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\1\4\2\0\1\uffff\3\0\24\uffff";
    static final String dfa_9s = "\1\103\2\0\1\uffff\3\0\24\uffff";
    static final String dfa_10s = "\3\uffff\1\2\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\6\uffff\1\17\1\1\1\16\1\3\1\4";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\uffff\1\2\1\3\1\4\24\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\3\17\15\uffff\1\6\14\uffff\1\1\2\uffff\1\3\4\17\1\5\3\uffff\1\4\2\uffff\1\14\2\uffff\1\15\2\uffff\1\26\1\7\1\10\3\uffff\1\11\3\uffff\1\16\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1165:2: (this_TupleTerm_0= ruleTupleTerm | this_LocationTerm_1= ruleLocationTerm | this_ComprehensionTerm_2= ruleComprehensionTerm | this_StructureTerm_3= ruleStructureTerm | this_PickTerm_4= rulePickTerm | this_ConditionalTerm_5= ruleConditionalTerm | this_CaseTerm_6= ruleCaseTerm | this_RuleAsTerm_7= ruleRuleAsTerm | this_ReturnTerm_8= ruleReturnTerm | this_ForAllTerm_9= ruleForAllTerm | this_ExistsTerm_10= ruleExistsTerm | this_LetTerm_11= ruleLetTerm | this_Literal_12= ruleLiteral | this_TupleLiteral_13= ruleTupleLiteral | this_SizeOfEnumerableTerm_14= ruleSizeOfEnumerableTerm )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalTermDsl()) ) {s = 23;}

                        else if ( (synpred38_InternalTermDsl()) ) {s = 24;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalTermDsl()) ) {s = 3;}

                        else if ( (synpred37_InternalTermDsl()) ) {s = 15;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalTermDsl()) ) {s = 25;}

                        else if ( (synpred28_InternalTermDsl()) ) {s = 26;}

                        else if ( (synpred37_InternalTermDsl()) ) {s = 15;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalTermDsl()) ) {s = 25;}

                        else if ( (synpred28_InternalTermDsl()) ) {s = 26;}

                        else if ( (synpred37_InternalTermDsl()) ) {s = 15;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalTermDsl()) ) {s = 25;}

                        else if ( (synpred28_InternalTermDsl()) ) {s = 26;}

                        else if ( (synpred37_InternalTermDsl()) ) {s = 15;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\76\uffff";
    static final String dfa_14s = "\1\2\75\uffff";
    static final String dfa_15s = "\1\4\1\0\74\uffff";
    static final String dfa_16s = "\1\103\1\0\74\uffff";
    static final String dfa_17s = "\2\uffff\1\3\71\uffff\1\1\1\2";
    static final String dfa_18s = "\1\uffff\1\0\74\uffff}>";
    static final String[] dfa_19s = {
            "\4\2\5\uffff\25\2\1\1\22\2\1\uffff\16\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1474:3: ( (otherlv_2= '(' ( (lv_args_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( (lv_argsTuple_5_0= ruleTupleTerm ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalTermDsl()) ) {s = 60;}

                        else if ( (synpred41_InternalTermDsl()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\22\uffff";
    static final String dfa_21s = "\1\4\2\0\7\uffff\1\0\7\uffff";
    static final String dfa_22s = "\1\56\2\0\7\uffff\1\0\7\uffff";
    static final String dfa_23s = "\3\uffff\1\4\1\6\1\uffff\1\7\1\uffff\1\10\2\uffff\1\13\1\1\1\3\1\2\1\5\1\11\1\12";
    static final String dfa_24s = "\1\uffff\1\0\1\1\7\uffff\1\2\7\uffff}>";
    static final String[] dfa_25s = {
            "\1\13\1\12\2\4\15\uffff\1\3\20\uffff\2\6\2\10\1\1\3\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1709:2: (this_IntervalLiteral_0= ruleIntervalLiteral | this_SetLiteral_1= ruleSetLiteral | this_ListLiteral_2= ruleListLiteral | this_BagLiteral_3= ruleBagLiteral | this_MapLiteral_4= ruleMapLiteral | this_NumberLiteral_5= ruleNumberLiteral | this_BooleanLiteral_6= ruleBooleanLiteral | this_KernelLiteral_7= ruleKernelLiteral | this_StringLiteral_8= ruleStringLiteral | this_CharLiteral_9= ruleCharLiteral | ruleEnumTerm )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalTermDsl()) ) {s = 12;}

                        else if ( (synpred46_InternalTermDsl()) ) {s = 13;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTermDsl()) ) {s = 14;}

                        else if ( (synpred48_InternalTermDsl()) ) {s = 15;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalTermDsl()) ) {s = 16;}

                        else if ( (synpred53_InternalTermDsl()) ) {s = 17;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x239247E6082000F0L,0x000000000000000EL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000047C0002000F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x239247E6082000F0L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xA39247E6082000F0L,0x000000000000000FL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004001000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040801000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040201000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040001000400000L});

}