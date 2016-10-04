package org.uasm.ebnf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.uasm.ebnf.services.EBNFLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEBNFLangParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(EBNFLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEbnfGrammar"
    // InternalEBNFLang.g:53:1: entryRuleEbnfGrammar : ruleEbnfGrammar EOF ;
    public final void entryRuleEbnfGrammar() throws RecognitionException {
        try {
            // InternalEBNFLang.g:54:1: ( ruleEbnfGrammar EOF )
            // InternalEBNFLang.g:55:1: ruleEbnfGrammar EOF
            {
             before(grammarAccess.getEbnfGrammarRule()); 
            pushFollow(FOLLOW_1);
            ruleEbnfGrammar();

            state._fsp--;

             after(grammarAccess.getEbnfGrammarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEbnfGrammar"


    // $ANTLR start "ruleEbnfGrammar"
    // InternalEBNFLang.g:62:1: ruleEbnfGrammar : ( ( rule__EbnfGrammar__Group__0 ) ) ;
    public final void ruleEbnfGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:66:2: ( ( ( rule__EbnfGrammar__Group__0 ) ) )
            // InternalEBNFLang.g:67:2: ( ( rule__EbnfGrammar__Group__0 ) )
            {
            // InternalEBNFLang.g:67:2: ( ( rule__EbnfGrammar__Group__0 ) )
            // InternalEBNFLang.g:68:3: ( rule__EbnfGrammar__Group__0 )
            {
             before(grammarAccess.getEbnfGrammarAccess().getGroup()); 
            // InternalEBNFLang.g:69:3: ( rule__EbnfGrammar__Group__0 )
            // InternalEBNFLang.g:69:4: rule__EbnfGrammar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEbnfGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEbnfGrammar"


    // $ANTLR start "entryRuleProductionRule"
    // InternalEBNFLang.g:78:1: entryRuleProductionRule : ruleProductionRule EOF ;
    public final void entryRuleProductionRule() throws RecognitionException {
        try {
            // InternalEBNFLang.g:79:1: ( ruleProductionRule EOF )
            // InternalEBNFLang.g:80:1: ruleProductionRule EOF
            {
             before(grammarAccess.getProductionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleProductionRule();

            state._fsp--;

             after(grammarAccess.getProductionRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductionRule"


    // $ANTLR start "ruleProductionRule"
    // InternalEBNFLang.g:87:1: ruleProductionRule : ( ( rule__ProductionRule__Group__0 ) ) ;
    public final void ruleProductionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:91:2: ( ( ( rule__ProductionRule__Group__0 ) ) )
            // InternalEBNFLang.g:92:2: ( ( rule__ProductionRule__Group__0 ) )
            {
            // InternalEBNFLang.g:92:2: ( ( rule__ProductionRule__Group__0 ) )
            // InternalEBNFLang.g:93:3: ( rule__ProductionRule__Group__0 )
            {
             before(grammarAccess.getProductionRuleAccess().getGroup()); 
            // InternalEBNFLang.g:94:3: ( rule__ProductionRule__Group__0 )
            // InternalEBNFLang.g:94:4: rule__ProductionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductionRule"


    // $ANTLR start "entryRuleExpression"
    // InternalEBNFLang.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEBNFLang.g:104:1: ( ruleExpression EOF )
            // InternalEBNFLang.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEBNFLang.g:112:1: ruleExpression : ( ruleExpression_Alternative ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:116:2: ( ( ruleExpression_Alternative ) )
            // InternalEBNFLang.g:117:2: ( ruleExpression_Alternative )
            {
            // InternalEBNFLang.g:117:2: ( ruleExpression_Alternative )
            // InternalEBNFLang.g:118:3: ruleExpression_Alternative
            {
             before(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Alternative();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Alternative"
    // InternalEBNFLang.g:128:1: entryRuleExpression_Alternative : ruleExpression_Alternative EOF ;
    public final void entryRuleExpression_Alternative() throws RecognitionException {
        try {
            // InternalEBNFLang.g:129:1: ( ruleExpression_Alternative EOF )
            // InternalEBNFLang.g:130:1: ruleExpression_Alternative EOF
            {
             before(grammarAccess.getExpression_AlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Alternative();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Alternative"


    // $ANTLR start "ruleExpression_Alternative"
    // InternalEBNFLang.g:137:1: ruleExpression_Alternative : ( ( rule__Expression_Alternative__Group__0 ) ) ;
    public final void ruleExpression_Alternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:141:2: ( ( ( rule__Expression_Alternative__Group__0 ) ) )
            // InternalEBNFLang.g:142:2: ( ( rule__Expression_Alternative__Group__0 ) )
            {
            // InternalEBNFLang.g:142:2: ( ( rule__Expression_Alternative__Group__0 ) )
            // InternalEBNFLang.g:143:3: ( rule__Expression_Alternative__Group__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup()); 
            // InternalEBNFLang.g:144:3: ( rule__Expression_Alternative__Group__0 )
            // InternalEBNFLang.g:144:4: rule__Expression_Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Alternative"


    // $ANTLR start "entryRuleExpression_Concatenation"
    // InternalEBNFLang.g:153:1: entryRuleExpression_Concatenation : ruleExpression_Concatenation EOF ;
    public final void entryRuleExpression_Concatenation() throws RecognitionException {
        try {
            // InternalEBNFLang.g:154:1: ( ruleExpression_Concatenation EOF )
            // InternalEBNFLang.g:155:1: ruleExpression_Concatenation EOF
            {
             before(grammarAccess.getExpression_ConcatenationRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Concatenation"


    // $ANTLR start "ruleExpression_Concatenation"
    // InternalEBNFLang.g:162:1: ruleExpression_Concatenation : ( ( rule__Expression_Concatenation__Group__0 ) ) ;
    public final void ruleExpression_Concatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:166:2: ( ( ( rule__Expression_Concatenation__Group__0 ) ) )
            // InternalEBNFLang.g:167:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            {
            // InternalEBNFLang.g:167:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            // InternalEBNFLang.g:168:3: ( rule__Expression_Concatenation__Group__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup()); 
            // InternalEBNFLang.g:169:3: ( rule__Expression_Concatenation__Group__0 )
            // InternalEBNFLang.g:169:4: rule__Expression_Concatenation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Concatenation"


    // $ANTLR start "entryRuleExpression_Exception"
    // InternalEBNFLang.g:178:1: entryRuleExpression_Exception : ruleExpression_Exception EOF ;
    public final void entryRuleExpression_Exception() throws RecognitionException {
        try {
            // InternalEBNFLang.g:179:1: ( ruleExpression_Exception EOF )
            // InternalEBNFLang.g:180:1: ruleExpression_Exception EOF
            {
             before(grammarAccess.getExpression_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Exception"


    // $ANTLR start "ruleExpression_Exception"
    // InternalEBNFLang.g:187:1: ruleExpression_Exception : ( ( rule__Expression_Exception__Group__0 ) ) ;
    public final void ruleExpression_Exception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:191:2: ( ( ( rule__Expression_Exception__Group__0 ) ) )
            // InternalEBNFLang.g:192:2: ( ( rule__Expression_Exception__Group__0 ) )
            {
            // InternalEBNFLang.g:192:2: ( ( rule__Expression_Exception__Group__0 ) )
            // InternalEBNFLang.g:193:3: ( rule__Expression_Exception__Group__0 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup()); 
            // InternalEBNFLang.g:194:3: ( rule__Expression_Exception__Group__0 )
            // InternalEBNFLang.g:194:4: rule__Expression_Exception__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ExceptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Exception"


    // $ANTLR start "entryRuleExpression_Repetition"
    // InternalEBNFLang.g:203:1: entryRuleExpression_Repetition : ruleExpression_Repetition EOF ;
    public final void entryRuleExpression_Repetition() throws RecognitionException {
        try {
            // InternalEBNFLang.g:204:1: ( ruleExpression_Repetition EOF )
            // InternalEBNFLang.g:205:1: ruleExpression_Repetition EOF
            {
             before(grammarAccess.getExpression_RepetitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_RepetitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Repetition"


    // $ANTLR start "ruleExpression_Repetition"
    // InternalEBNFLang.g:212:1: ruleExpression_Repetition : ( ( rule__Expression_Repetition__Alternatives ) ) ;
    public final void ruleExpression_Repetition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:216:2: ( ( ( rule__Expression_Repetition__Alternatives ) ) )
            // InternalEBNFLang.g:217:2: ( ( rule__Expression_Repetition__Alternatives ) )
            {
            // InternalEBNFLang.g:217:2: ( ( rule__Expression_Repetition__Alternatives ) )
            // InternalEBNFLang.g:218:3: ( rule__Expression_Repetition__Alternatives )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAlternatives()); 
            // InternalEBNFLang.g:219:3: ( rule__Expression_Repetition__Alternatives )
            // InternalEBNFLang.g:219:4: rule__Expression_Repetition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Repetition"


    // $ANTLR start "entryRuleExpression_Terminal"
    // InternalEBNFLang.g:228:1: entryRuleExpression_Terminal : ruleExpression_Terminal EOF ;
    public final void entryRuleExpression_Terminal() throws RecognitionException {
        try {
            // InternalEBNFLang.g:229:1: ( ruleExpression_Terminal EOF )
            // InternalEBNFLang.g:230:1: ruleExpression_Terminal EOF
            {
             before(grammarAccess.getExpression_TerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Terminal();

            state._fsp--;

             after(grammarAccess.getExpression_TerminalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Terminal"


    // $ANTLR start "ruleExpression_Terminal"
    // InternalEBNFLang.g:237:1: ruleExpression_Terminal : ( ( rule__Expression_Terminal__Alternatives ) ) ;
    public final void ruleExpression_Terminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:241:2: ( ( ( rule__Expression_Terminal__Alternatives ) ) )
            // InternalEBNFLang.g:242:2: ( ( rule__Expression_Terminal__Alternatives ) )
            {
            // InternalEBNFLang.g:242:2: ( ( rule__Expression_Terminal__Alternatives ) )
            // InternalEBNFLang.g:243:3: ( rule__Expression_Terminal__Alternatives )
            {
             before(grammarAccess.getExpression_TerminalAccess().getAlternatives()); 
            // InternalEBNFLang.g:244:3: ( rule__Expression_Terminal__Alternatives )
            // InternalEBNFLang.g:244:4: rule__Expression_Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression_TerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Terminal"


    // $ANTLR start "entryRuleExpression_Rule_Reference"
    // InternalEBNFLang.g:253:1: entryRuleExpression_Rule_Reference : ruleExpression_Rule_Reference EOF ;
    public final void entryRuleExpression_Rule_Reference() throws RecognitionException {
        try {
            // InternalEBNFLang.g:254:1: ( ruleExpression_Rule_Reference EOF )
            // InternalEBNFLang.g:255:1: ruleExpression_Rule_Reference EOF
            {
             before(grammarAccess.getExpression_Rule_ReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Rule_Reference();

            state._fsp--;

             after(grammarAccess.getExpression_Rule_ReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Rule_Reference"


    // $ANTLR start "ruleExpression_Rule_Reference"
    // InternalEBNFLang.g:262:1: ruleExpression_Rule_Reference : ( ( rule__Expression_Rule_Reference__Group__0 ) ) ;
    public final void ruleExpression_Rule_Reference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:266:2: ( ( ( rule__Expression_Rule_Reference__Group__0 ) ) )
            // InternalEBNFLang.g:267:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            {
            // InternalEBNFLang.g:267:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            // InternalEBNFLang.g:268:3: ( rule__Expression_Rule_Reference__Group__0 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup()); 
            // InternalEBNFLang.g:269:3: ( rule__Expression_Rule_Reference__Group__0 )
            // InternalEBNFLang.g:269:4: rule__Expression_Rule_Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Rule_Reference"


    // $ANTLR start "entryRuleExpression_Special_Sequence"
    // InternalEBNFLang.g:278:1: entryRuleExpression_Special_Sequence : ruleExpression_Special_Sequence EOF ;
    public final void entryRuleExpression_Special_Sequence() throws RecognitionException {
        try {
            // InternalEBNFLang.g:279:1: ( ruleExpression_Special_Sequence EOF )
            // InternalEBNFLang.g:280:1: ruleExpression_Special_Sequence EOF
            {
             before(grammarAccess.getExpression_Special_SequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Special_Sequence();

            state._fsp--;

             after(grammarAccess.getExpression_Special_SequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Special_Sequence"


    // $ANTLR start "ruleExpression_Special_Sequence"
    // InternalEBNFLang.g:287:1: ruleExpression_Special_Sequence : ( ( rule__Expression_Special_Sequence__Group__0 ) ) ;
    public final void ruleExpression_Special_Sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:291:2: ( ( ( rule__Expression_Special_Sequence__Group__0 ) ) )
            // InternalEBNFLang.g:292:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            {
            // InternalEBNFLang.g:292:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            // InternalEBNFLang.g:293:3: ( rule__Expression_Special_Sequence__Group__0 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getGroup()); 
            // InternalEBNFLang.g:294:3: ( rule__Expression_Special_Sequence__Group__0 )
            // InternalEBNFLang.g:294:4: rule__Expression_Special_Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Special_Sequence"


    // $ANTLR start "entryRuleExpression_Terminal_Symbol"
    // InternalEBNFLang.g:303:1: entryRuleExpression_Terminal_Symbol : ruleExpression_Terminal_Symbol EOF ;
    public final void entryRuleExpression_Terminal_Symbol() throws RecognitionException {
        try {
            // InternalEBNFLang.g:304:1: ( ruleExpression_Terminal_Symbol EOF )
            // InternalEBNFLang.g:305:1: ruleExpression_Terminal_Symbol EOF
            {
             before(grammarAccess.getExpression_Terminal_SymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Terminal_Symbol();

            state._fsp--;

             after(grammarAccess.getExpression_Terminal_SymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Terminal_Symbol"


    // $ANTLR start "ruleExpression_Terminal_Symbol"
    // InternalEBNFLang.g:312:1: ruleExpression_Terminal_Symbol : ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) ;
    public final void ruleExpression_Terminal_Symbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:316:2: ( ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) )
            // InternalEBNFLang.g:317:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            {
            // InternalEBNFLang.g:317:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            // InternalEBNFLang.g:318:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup()); 
            // InternalEBNFLang.g:319:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            // InternalEBNFLang.g:319:4: rule__Expression_Terminal_Symbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Terminal_Symbol"


    // $ANTLR start "entryRuleExpression_Repetition_Group"
    // InternalEBNFLang.g:328:1: entryRuleExpression_Repetition_Group : ruleExpression_Repetition_Group EOF ;
    public final void entryRuleExpression_Repetition_Group() throws RecognitionException {
        try {
            // InternalEBNFLang.g:329:1: ( ruleExpression_Repetition_Group EOF )
            // InternalEBNFLang.g:330:1: ruleExpression_Repetition_Group EOF
            {
             before(grammarAccess.getExpression_Repetition_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Repetition_Group();

            state._fsp--;

             after(grammarAccess.getExpression_Repetition_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Repetition_Group"


    // $ANTLR start "ruleExpression_Repetition_Group"
    // InternalEBNFLang.g:337:1: ruleExpression_Repetition_Group : ( ( rule__Expression_Repetition_Group__Group__0 ) ) ;
    public final void ruleExpression_Repetition_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:341:2: ( ( ( rule__Expression_Repetition_Group__Group__0 ) ) )
            // InternalEBNFLang.g:342:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            {
            // InternalEBNFLang.g:342:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            // InternalEBNFLang.g:343:3: ( rule__Expression_Repetition_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getGroup()); 
            // InternalEBNFLang.g:344:3: ( rule__Expression_Repetition_Group__Group__0 )
            // InternalEBNFLang.g:344:4: rule__Expression_Repetition_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Repetition_Group"


    // $ANTLR start "entryRuleExpression_Optional_Group"
    // InternalEBNFLang.g:353:1: entryRuleExpression_Optional_Group : ruleExpression_Optional_Group EOF ;
    public final void entryRuleExpression_Optional_Group() throws RecognitionException {
        try {
            // InternalEBNFLang.g:354:1: ( ruleExpression_Optional_Group EOF )
            // InternalEBNFLang.g:355:1: ruleExpression_Optional_Group EOF
            {
             before(grammarAccess.getExpression_Optional_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Optional_Group();

            state._fsp--;

             after(grammarAccess.getExpression_Optional_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Optional_Group"


    // $ANTLR start "ruleExpression_Optional_Group"
    // InternalEBNFLang.g:362:1: ruleExpression_Optional_Group : ( ( rule__Expression_Optional_Group__Group__0 ) ) ;
    public final void ruleExpression_Optional_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:366:2: ( ( ( rule__Expression_Optional_Group__Group__0 ) ) )
            // InternalEBNFLang.g:367:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            {
            // InternalEBNFLang.g:367:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            // InternalEBNFLang.g:368:3: ( rule__Expression_Optional_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getGroup()); 
            // InternalEBNFLang.g:369:3: ( rule__Expression_Optional_Group__Group__0 )
            // InternalEBNFLang.g:369:4: rule__Expression_Optional_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Optional_Group"


    // $ANTLR start "entryRuleExpression_Group"
    // InternalEBNFLang.g:378:1: entryRuleExpression_Group : ruleExpression_Group EOF ;
    public final void entryRuleExpression_Group() throws RecognitionException {
        try {
            // InternalEBNFLang.g:379:1: ( ruleExpression_Group EOF )
            // InternalEBNFLang.g:380:1: ruleExpression_Group EOF
            {
             before(grammarAccess.getExpression_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Group();

            state._fsp--;

             after(grammarAccess.getExpression_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Group"


    // $ANTLR start "ruleExpression_Group"
    // InternalEBNFLang.g:387:1: ruleExpression_Group : ( ( rule__Expression_Group__Group__0 ) ) ;
    public final void ruleExpression_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:391:2: ( ( ( rule__Expression_Group__Group__0 ) ) )
            // InternalEBNFLang.g:392:2: ( ( rule__Expression_Group__Group__0 ) )
            {
            // InternalEBNFLang.g:392:2: ( ( rule__Expression_Group__Group__0 ) )
            // InternalEBNFLang.g:393:3: ( rule__Expression_Group__Group__0 )
            {
             before(grammarAccess.getExpression_GroupAccess().getGroup()); 
            // InternalEBNFLang.g:394:3: ( rule__Expression_Group__Group__0 )
            // InternalEBNFLang.g:394:4: rule__Expression_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Group"


    // $ANTLR start "rule__Expression_Repetition__Alternatives"
    // InternalEBNFLang.g:402:1: rule__Expression_Repetition__Alternatives : ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) );
    public final void rule__Expression_Repetition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:406:1: ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NAME||(LA1_0>=RULE_SPECIAL_SEQUENCE && LA1_0<=RULE_TERMINAL_SYMBOL)||LA1_0==22||LA1_0==24||LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_NUMBER) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEBNFLang.g:407:2: ( ruleExpression_Terminal )
                    {
                    // InternalEBNFLang.g:407:2: ( ruleExpression_Terminal )
                    // InternalEBNFLang.g:408:3: ruleExpression_Terminal
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Terminal();

                    state._fsp--;

                     after(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:413:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    {
                    // InternalEBNFLang.g:413:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    // InternalEBNFLang.g:414:3: ( rule__Expression_Repetition__Group_1__0 )
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 
                    // InternalEBNFLang.g:415:3: ( rule__Expression_Repetition__Group_1__0 )
                    // InternalEBNFLang.g:415:4: rule__Expression_Repetition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Repetition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Alternatives"


    // $ANTLR start "rule__Expression_Terminal__Alternatives"
    // InternalEBNFLang.g:423:1: rule__Expression_Terminal__Alternatives : ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) );
    public final void rule__Expression_Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:427:1: ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt2=1;
                }
                break;
            case RULE_TERMINAL_SYMBOL:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case RULE_SPECIAL_SEQUENCE:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEBNFLang.g:428:2: ( ruleExpression_Rule_Reference )
                    {
                    // InternalEBNFLang.g:428:2: ( ruleExpression_Rule_Reference )
                    // InternalEBNFLang.g:429:3: ruleExpression_Rule_Reference
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Rule_Reference();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:434:2: ( ruleExpression_Terminal_Symbol )
                    {
                    // InternalEBNFLang.g:434:2: ( ruleExpression_Terminal_Symbol )
                    // InternalEBNFLang.g:435:3: ruleExpression_Terminal_Symbol
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Terminal_Symbol();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEBNFLang.g:440:2: ( ruleExpression_Repetition_Group )
                    {
                    // InternalEBNFLang.g:440:2: ( ruleExpression_Repetition_Group )
                    // InternalEBNFLang.g:441:3: ruleExpression_Repetition_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Repetition_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEBNFLang.g:446:2: ( ruleExpression_Optional_Group )
                    {
                    // InternalEBNFLang.g:446:2: ( ruleExpression_Optional_Group )
                    // InternalEBNFLang.g:447:3: ruleExpression_Optional_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Optional_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEBNFLang.g:452:2: ( ruleExpression_Group )
                    {
                    // InternalEBNFLang.g:452:2: ( ruleExpression_Group )
                    // InternalEBNFLang.g:453:3: ruleExpression_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEBNFLang.g:458:2: ( ruleExpression_Special_Sequence )
                    {
                    // InternalEBNFLang.g:458:2: ( ruleExpression_Special_Sequence )
                    // InternalEBNFLang.g:459:3: ruleExpression_Special_Sequence
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Special_Sequence();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal__Alternatives"


    // $ANTLR start "rule__EbnfGrammar__Group__0"
    // InternalEBNFLang.g:468:1: rule__EbnfGrammar__Group__0 : rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 ;
    public final void rule__EbnfGrammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:472:1: ( rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 )
            // InternalEBNFLang.g:473:2: rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EbnfGrammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__0"


    // $ANTLR start "rule__EbnfGrammar__Group__0__Impl"
    // InternalEBNFLang.g:480:1: rule__EbnfGrammar__Group__0__Impl : ( () ) ;
    public final void rule__EbnfGrammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:484:1: ( ( () ) )
            // InternalEBNFLang.g:485:1: ( () )
            {
            // InternalEBNFLang.g:485:1: ( () )
            // InternalEBNFLang.g:486:2: ()
            {
             before(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 
            // InternalEBNFLang.g:487:2: ()
            // InternalEBNFLang.g:487:3: 
            {
            }

             after(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__0__Impl"


    // $ANTLR start "rule__EbnfGrammar__Group__1"
    // InternalEBNFLang.g:495:1: rule__EbnfGrammar__Group__1 : rule__EbnfGrammar__Group__1__Impl ;
    public final void rule__EbnfGrammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:499:1: ( rule__EbnfGrammar__Group__1__Impl )
            // InternalEBNFLang.g:500:2: rule__EbnfGrammar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__1"


    // $ANTLR start "rule__EbnfGrammar__Group__1__Impl"
    // InternalEBNFLang.g:506:1: rule__EbnfGrammar__Group__1__Impl : ( ( rule__EbnfGrammar__RulesAssignment_1 )* ) ;
    public final void rule__EbnfGrammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:510:1: ( ( ( rule__EbnfGrammar__RulesAssignment_1 )* ) )
            // InternalEBNFLang.g:511:1: ( ( rule__EbnfGrammar__RulesAssignment_1 )* )
            {
            // InternalEBNFLang.g:511:1: ( ( rule__EbnfGrammar__RulesAssignment_1 )* )
            // InternalEBNFLang.g:512:2: ( rule__EbnfGrammar__RulesAssignment_1 )*
            {
             before(grammarAccess.getEbnfGrammarAccess().getRulesAssignment_1()); 
            // InternalEBNFLang.g:513:2: ( rule__EbnfGrammar__RulesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NAME) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEBNFLang.g:513:3: rule__EbnfGrammar__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EbnfGrammar__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEbnfGrammarAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__1__Impl"


    // $ANTLR start "rule__ProductionRule__Group__0"
    // InternalEBNFLang.g:522:1: rule__ProductionRule__Group__0 : rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 ;
    public final void rule__ProductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:526:1: ( rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 )
            // InternalEBNFLang.g:527:2: rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ProductionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__0"


    // $ANTLR start "rule__ProductionRule__Group__0__Impl"
    // InternalEBNFLang.g:534:1: rule__ProductionRule__Group__0__Impl : ( ( rule__ProductionRule__NameAssignment_0 ) ) ;
    public final void rule__ProductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:538:1: ( ( ( rule__ProductionRule__NameAssignment_0 ) ) )
            // InternalEBNFLang.g:539:1: ( ( rule__ProductionRule__NameAssignment_0 ) )
            {
            // InternalEBNFLang.g:539:1: ( ( rule__ProductionRule__NameAssignment_0 ) )
            // InternalEBNFLang.g:540:2: ( rule__ProductionRule__NameAssignment_0 )
            {
             before(grammarAccess.getProductionRuleAccess().getNameAssignment_0()); 
            // InternalEBNFLang.g:541:2: ( rule__ProductionRule__NameAssignment_0 )
            // InternalEBNFLang.g:541:3: rule__ProductionRule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__0__Impl"


    // $ANTLR start "rule__ProductionRule__Group__1"
    // InternalEBNFLang.g:549:1: rule__ProductionRule__Group__1 : rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 ;
    public final void rule__ProductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:553:1: ( rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 )
            // InternalEBNFLang.g:554:2: rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProductionRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__1"


    // $ANTLR start "rule__ProductionRule__Group__1__Impl"
    // InternalEBNFLang.g:561:1: rule__ProductionRule__Group__1__Impl : ( '=' ) ;
    public final void rule__ProductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:565:1: ( ( '=' ) )
            // InternalEBNFLang.g:566:1: ( '=' )
            {
            // InternalEBNFLang.g:566:1: ( '=' )
            // InternalEBNFLang.g:567:2: '='
            {
             before(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__1__Impl"


    // $ANTLR start "rule__ProductionRule__Group__2"
    // InternalEBNFLang.g:576:1: rule__ProductionRule__Group__2 : rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 ;
    public final void rule__ProductionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:580:1: ( rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 )
            // InternalEBNFLang.g:581:2: rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ProductionRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__2"


    // $ANTLR start "rule__ProductionRule__Group__2__Impl"
    // InternalEBNFLang.g:588:1: rule__ProductionRule__Group__2__Impl : ( ( rule__ProductionRule__ExprAssignment_2 ) ) ;
    public final void rule__ProductionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:592:1: ( ( ( rule__ProductionRule__ExprAssignment_2 ) ) )
            // InternalEBNFLang.g:593:1: ( ( rule__ProductionRule__ExprAssignment_2 ) )
            {
            // InternalEBNFLang.g:593:1: ( ( rule__ProductionRule__ExprAssignment_2 ) )
            // InternalEBNFLang.g:594:2: ( rule__ProductionRule__ExprAssignment_2 )
            {
             before(grammarAccess.getProductionRuleAccess().getExprAssignment_2()); 
            // InternalEBNFLang.g:595:2: ( rule__ProductionRule__ExprAssignment_2 )
            // InternalEBNFLang.g:595:3: rule__ProductionRule__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__2__Impl"


    // $ANTLR start "rule__ProductionRule__Group__3"
    // InternalEBNFLang.g:603:1: rule__ProductionRule__Group__3 : rule__ProductionRule__Group__3__Impl ;
    public final void rule__ProductionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:607:1: ( rule__ProductionRule__Group__3__Impl )
            // InternalEBNFLang.g:608:2: rule__ProductionRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__3"


    // $ANTLR start "rule__ProductionRule__Group__3__Impl"
    // InternalEBNFLang.g:614:1: rule__ProductionRule__Group__3__Impl : ( ';' ) ;
    public final void rule__ProductionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:618:1: ( ( ';' ) )
            // InternalEBNFLang.g:619:1: ( ';' )
            {
            // InternalEBNFLang.g:619:1: ( ';' )
            // InternalEBNFLang.g:620:2: ';'
            {
             before(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__3__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group__0"
    // InternalEBNFLang.g:630:1: rule__Expression_Alternative__Group__0 : rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 ;
    public final void rule__Expression_Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:634:1: ( rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 )
            // InternalEBNFLang.g:635:2: rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression_Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__0"


    // $ANTLR start "rule__Expression_Alternative__Group__0__Impl"
    // InternalEBNFLang.g:642:1: rule__Expression_Alternative__Group__0__Impl : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:646:1: ( ( ruleExpression_Concatenation ) )
            // InternalEBNFLang.g:647:1: ( ruleExpression_Concatenation )
            {
            // InternalEBNFLang.g:647:1: ( ruleExpression_Concatenation )
            // InternalEBNFLang.g:648:2: ruleExpression_Concatenation
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group__1"
    // InternalEBNFLang.g:657:1: rule__Expression_Alternative__Group__1 : rule__Expression_Alternative__Group__1__Impl ;
    public final void rule__Expression_Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:661:1: ( rule__Expression_Alternative__Group__1__Impl )
            // InternalEBNFLang.g:662:2: rule__Expression_Alternative__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__1"


    // $ANTLR start "rule__Expression_Alternative__Group__1__Impl"
    // InternalEBNFLang.g:668:1: rule__Expression_Alternative__Group__1__Impl : ( ( rule__Expression_Alternative__Group_1__0 )? ) ;
    public final void rule__Expression_Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:672:1: ( ( ( rule__Expression_Alternative__Group_1__0 )? ) )
            // InternalEBNFLang.g:673:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            {
            // InternalEBNFLang.g:673:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            // InternalEBNFLang.g:674:2: ( rule__Expression_Alternative__Group_1__0 )?
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 
            // InternalEBNFLang.g:675:2: ( rule__Expression_Alternative__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEBNFLang.g:675:3: rule__Expression_Alternative__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Alternative__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__1__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1__0"
    // InternalEBNFLang.g:684:1: rule__Expression_Alternative__Group_1__0 : rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 ;
    public final void rule__Expression_Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:688:1: ( rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 )
            // InternalEBNFLang.g:689:2: rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression_Alternative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__0"


    // $ANTLR start "rule__Expression_Alternative__Group_1__0__Impl"
    // InternalEBNFLang.g:696:1: rule__Expression_Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:700:1: ( ( () ) )
            // InternalEBNFLang.g:701:1: ( () )
            {
            // InternalEBNFLang.g:701:1: ( () )
            // InternalEBNFLang.g:702:2: ()
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 
            // InternalEBNFLang.g:703:2: ()
            // InternalEBNFLang.g:703:3: 
            {
            }

             after(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1__1"
    // InternalEBNFLang.g:711:1: rule__Expression_Alternative__Group_1__1 : rule__Expression_Alternative__Group_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:715:1: ( rule__Expression_Alternative__Group_1__1__Impl )
            // InternalEBNFLang.g:716:2: rule__Expression_Alternative__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__1"


    // $ANTLR start "rule__Expression_Alternative__Group_1__1__Impl"
    // InternalEBNFLang.g:722:1: rule__Expression_Alternative__Group_1__1__Impl : ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:726:1: ( ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) )
            // InternalEBNFLang.g:727:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            {
            // InternalEBNFLang.g:727:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            // InternalEBNFLang.g:728:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            {
            // InternalEBNFLang.g:728:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) )
            // InternalEBNFLang.g:729:3: ( rule__Expression_Alternative__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEBNFLang.g:730:3: ( rule__Expression_Alternative__Group_1_1__0 )
            // InternalEBNFLang.g:730:4: rule__Expression_Alternative__Group_1_1__0
            {
            pushFollow(FOLLOW_9);
            rule__Expression_Alternative__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }

            // InternalEBNFLang.g:733:2: ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            // InternalEBNFLang.g:734:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEBNFLang.g:735:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEBNFLang.g:735:4: rule__Expression_Alternative__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Expression_Alternative__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__0"
    // InternalEBNFLang.g:745:1: rule__Expression_Alternative__Group_1_1__0 : rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 ;
    public final void rule__Expression_Alternative__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:749:1: ( rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 )
            // InternalEBNFLang.g:750:2: rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Alternative__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__0"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__0__Impl"
    // InternalEBNFLang.g:757:1: rule__Expression_Alternative__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Expression_Alternative__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:761:1: ( ( '|' ) )
            // InternalEBNFLang.g:762:1: ( '|' )
            {
            // InternalEBNFLang.g:762:1: ( '|' )
            // InternalEBNFLang.g:763:2: '|'
            {
             before(grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__1"
    // InternalEBNFLang.g:772:1: rule__Expression_Alternative__Group_1_1__1 : rule__Expression_Alternative__Group_1_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:776:1: ( rule__Expression_Alternative__Group_1_1__1__Impl )
            // InternalEBNFLang.g:777:2: rule__Expression_Alternative__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__1"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__1__Impl"
    // InternalEBNFLang.g:783:1: rule__Expression_Alternative__Group_1_1__1__Impl : ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Alternative__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:787:1: ( ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) )
            // InternalEBNFLang.g:788:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            {
            // InternalEBNFLang.g:788:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            // InternalEBNFLang.g:789:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 
            // InternalEBNFLang.g:790:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            // InternalEBNFLang.g:790:3: rule__Expression_Alternative__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group__0"
    // InternalEBNFLang.g:799:1: rule__Expression_Concatenation__Group__0 : rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 ;
    public final void rule__Expression_Concatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:803:1: ( rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 )
            // InternalEBNFLang.g:804:2: rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression_Concatenation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__0"


    // $ANTLR start "rule__Expression_Concatenation__Group__0__Impl"
    // InternalEBNFLang.g:811:1: rule__Expression_Concatenation__Group__0__Impl : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:815:1: ( ( ruleExpression_Exception ) )
            // InternalEBNFLang.g:816:1: ( ruleExpression_Exception )
            {
            // InternalEBNFLang.g:816:1: ( ruleExpression_Exception )
            // InternalEBNFLang.g:817:2: ruleExpression_Exception
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group__1"
    // InternalEBNFLang.g:826:1: rule__Expression_Concatenation__Group__1 : rule__Expression_Concatenation__Group__1__Impl ;
    public final void rule__Expression_Concatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:830:1: ( rule__Expression_Concatenation__Group__1__Impl )
            // InternalEBNFLang.g:831:2: rule__Expression_Concatenation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__1"


    // $ANTLR start "rule__Expression_Concatenation__Group__1__Impl"
    // InternalEBNFLang.g:837:1: rule__Expression_Concatenation__Group__1__Impl : ( ( rule__Expression_Concatenation__Group_1__0 )? ) ;
    public final void rule__Expression_Concatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:841:1: ( ( ( rule__Expression_Concatenation__Group_1__0 )? ) )
            // InternalEBNFLang.g:842:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            {
            // InternalEBNFLang.g:842:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            // InternalEBNFLang.g:843:2: ( rule__Expression_Concatenation__Group_1__0 )?
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 
            // InternalEBNFLang.g:844:2: ( rule__Expression_Concatenation__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEBNFLang.g:844:3: rule__Expression_Concatenation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Concatenation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__0"
    // InternalEBNFLang.g:853:1: rule__Expression_Concatenation__Group_1__0 : rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 ;
    public final void rule__Expression_Concatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:857:1: ( rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 )
            // InternalEBNFLang.g:858:2: rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression_Concatenation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__0"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__0__Impl"
    // InternalEBNFLang.g:865:1: rule__Expression_Concatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Concatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:869:1: ( ( () ) )
            // InternalEBNFLang.g:870:1: ( () )
            {
            // InternalEBNFLang.g:870:1: ( () )
            // InternalEBNFLang.g:871:2: ()
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 
            // InternalEBNFLang.g:872:2: ()
            // InternalEBNFLang.g:872:3: 
            {
            }

             after(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__1"
    // InternalEBNFLang.g:880:1: rule__Expression_Concatenation__Group_1__1 : rule__Expression_Concatenation__Group_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:884:1: ( rule__Expression_Concatenation__Group_1__1__Impl )
            // InternalEBNFLang.g:885:2: rule__Expression_Concatenation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__1"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__1__Impl"
    // InternalEBNFLang.g:891:1: rule__Expression_Concatenation__Group_1__1__Impl : ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Concatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:895:1: ( ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) )
            // InternalEBNFLang.g:896:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            {
            // InternalEBNFLang.g:896:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            // InternalEBNFLang.g:897:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            {
            // InternalEBNFLang.g:897:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) )
            // InternalEBNFLang.g:898:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEBNFLang.g:899:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            // InternalEBNFLang.g:899:4: rule__Expression_Concatenation__Group_1_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Expression_Concatenation__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }

            // InternalEBNFLang.g:902:2: ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            // InternalEBNFLang.g:903:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEBNFLang.g:904:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEBNFLang.g:904:4: rule__Expression_Concatenation__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Expression_Concatenation__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__0"
    // InternalEBNFLang.g:914:1: rule__Expression_Concatenation__Group_1_1__0 : rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 ;
    public final void rule__Expression_Concatenation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:918:1: ( rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 )
            // InternalEBNFLang.g:919:2: rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Concatenation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__0"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__0__Impl"
    // InternalEBNFLang.g:926:1: rule__Expression_Concatenation__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_Concatenation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:930:1: ( ( ',' ) )
            // InternalEBNFLang.g:931:1: ( ',' )
            {
            // InternalEBNFLang.g:931:1: ( ',' )
            // InternalEBNFLang.g:932:2: ','
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__1"
    // InternalEBNFLang.g:941:1: rule__Expression_Concatenation__Group_1_1__1 : rule__Expression_Concatenation__Group_1_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:945:1: ( rule__Expression_Concatenation__Group_1_1__1__Impl )
            // InternalEBNFLang.g:946:2: rule__Expression_Concatenation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__1"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__1__Impl"
    // InternalEBNFLang.g:952:1: rule__Expression_Concatenation__Group_1_1__1__Impl : ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Concatenation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:956:1: ( ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) )
            // InternalEBNFLang.g:957:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            {
            // InternalEBNFLang.g:957:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            // InternalEBNFLang.g:958:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 
            // InternalEBNFLang.g:959:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            // InternalEBNFLang.g:959:3: rule__Expression_Concatenation__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group__0"
    // InternalEBNFLang.g:968:1: rule__Expression_Exception__Group__0 : rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 ;
    public final void rule__Expression_Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:972:1: ( rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 )
            // InternalEBNFLang.g:973:2: rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression_Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__0"


    // $ANTLR start "rule__Expression_Exception__Group__0__Impl"
    // InternalEBNFLang.g:980:1: rule__Expression_Exception__Group__0__Impl : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:984:1: ( ( ruleExpression_Repetition ) )
            // InternalEBNFLang.g:985:1: ( ruleExpression_Repetition )
            {
            // InternalEBNFLang.g:985:1: ( ruleExpression_Repetition )
            // InternalEBNFLang.g:986:2: ruleExpression_Repetition
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__0__Impl"


    // $ANTLR start "rule__Expression_Exception__Group__1"
    // InternalEBNFLang.g:995:1: rule__Expression_Exception__Group__1 : rule__Expression_Exception__Group__1__Impl ;
    public final void rule__Expression_Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:999:1: ( rule__Expression_Exception__Group__1__Impl )
            // InternalEBNFLang.g:1000:2: rule__Expression_Exception__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__1"


    // $ANTLR start "rule__Expression_Exception__Group__1__Impl"
    // InternalEBNFLang.g:1006:1: rule__Expression_Exception__Group__1__Impl : ( ( rule__Expression_Exception__Group_1__0 )* ) ;
    public final void rule__Expression_Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1010:1: ( ( ( rule__Expression_Exception__Group_1__0 )* ) )
            // InternalEBNFLang.g:1011:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            {
            // InternalEBNFLang.g:1011:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            // InternalEBNFLang.g:1012:2: ( rule__Expression_Exception__Group_1__0 )*
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 
            // InternalEBNFLang.g:1013:2: ( rule__Expression_Exception__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEBNFLang.g:1013:3: rule__Expression_Exception__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Expression_Exception__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__0"
    // InternalEBNFLang.g:1022:1: rule__Expression_Exception__Group_1__0 : rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 ;
    public final void rule__Expression_Exception__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1026:1: ( rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 )
            // InternalEBNFLang.g:1027:2: rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression_Exception__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__0"


    // $ANTLR start "rule__Expression_Exception__Group_1__0__Impl"
    // InternalEBNFLang.g:1034:1: rule__Expression_Exception__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Exception__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1038:1: ( ( () ) )
            // InternalEBNFLang.g:1039:1: ( () )
            {
            // InternalEBNFLang.g:1039:1: ( () )
            // InternalEBNFLang.g:1040:2: ()
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 
            // InternalEBNFLang.g:1041:2: ()
            // InternalEBNFLang.g:1041:3: 
            {
            }

             after(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__1"
    // InternalEBNFLang.g:1049:1: rule__Expression_Exception__Group_1__1 : rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 ;
    public final void rule__Expression_Exception__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1053:1: ( rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 )
            // InternalEBNFLang.g:1054:2: rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Exception__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__1"


    // $ANTLR start "rule__Expression_Exception__Group_1__1__Impl"
    // InternalEBNFLang.g:1061:1: rule__Expression_Exception__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Expression_Exception__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1065:1: ( ( '-' ) )
            // InternalEBNFLang.g:1066:1: ( '-' )
            {
            // InternalEBNFLang.g:1066:1: ( '-' )
            // InternalEBNFLang.g:1067:2: '-'
            {
             before(grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__2"
    // InternalEBNFLang.g:1076:1: rule__Expression_Exception__Group_1__2 : rule__Expression_Exception__Group_1__2__Impl ;
    public final void rule__Expression_Exception__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1080:1: ( rule__Expression_Exception__Group_1__2__Impl )
            // InternalEBNFLang.g:1081:2: rule__Expression_Exception__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__2"


    // $ANTLR start "rule__Expression_Exception__Group_1__2__Impl"
    // InternalEBNFLang.g:1087:1: rule__Expression_Exception__Group_1__2__Impl : ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) ;
    public final void rule__Expression_Exception__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1091:1: ( ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) )
            // InternalEBNFLang.g:1092:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            {
            // InternalEBNFLang.g:1092:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            // InternalEBNFLang.g:1093:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 
            // InternalEBNFLang.g:1094:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            // InternalEBNFLang.g:1094:3: rule__Expression_Exception__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__2__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__0"
    // InternalEBNFLang.g:1103:1: rule__Expression_Repetition__Group_1__0 : rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 ;
    public final void rule__Expression_Repetition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1107:1: ( rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 )
            // InternalEBNFLang.g:1108:2: rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Repetition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__0"


    // $ANTLR start "rule__Expression_Repetition__Group_1__0__Impl"
    // InternalEBNFLang.g:1115:1: rule__Expression_Repetition__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1119:1: ( ( () ) )
            // InternalEBNFLang.g:1120:1: ( () )
            {
            // InternalEBNFLang.g:1120:1: ( () )
            // InternalEBNFLang.g:1121:2: ()
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 
            // InternalEBNFLang.g:1122:2: ()
            // InternalEBNFLang.g:1122:3: 
            {
            }

             after(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__1"
    // InternalEBNFLang.g:1130:1: rule__Expression_Repetition__Group_1__1 : rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 ;
    public final void rule__Expression_Repetition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1134:1: ( rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 )
            // InternalEBNFLang.g:1135:2: rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Expression_Repetition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__1"


    // $ANTLR start "rule__Expression_Repetition__Group_1__1__Impl"
    // InternalEBNFLang.g:1142:1: rule__Expression_Repetition__Group_1__1__Impl : ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) ;
    public final void rule__Expression_Repetition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1146:1: ( ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) )
            // InternalEBNFLang.g:1147:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            {
            // InternalEBNFLang.g:1147:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            // InternalEBNFLang.g:1148:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 
            // InternalEBNFLang.g:1149:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            // InternalEBNFLang.g:1149:3: rule__Expression_Repetition__RepetitionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__RepetitionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__2"
    // InternalEBNFLang.g:1157:1: rule__Expression_Repetition__Group_1__2 : rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 ;
    public final void rule__Expression_Repetition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1161:1: ( rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 )
            // InternalEBNFLang.g:1162:2: rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Expression_Repetition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__2"


    // $ANTLR start "rule__Expression_Repetition__Group_1__2__Impl"
    // InternalEBNFLang.g:1169:1: rule__Expression_Repetition__Group_1__2__Impl : ( '*' ) ;
    public final void rule__Expression_Repetition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1173:1: ( ( '*' ) )
            // InternalEBNFLang.g:1174:1: ( '*' )
            {
            // InternalEBNFLang.g:1174:1: ( '*' )
            // InternalEBNFLang.g:1175:2: '*'
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__2__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__3"
    // InternalEBNFLang.g:1184:1: rule__Expression_Repetition__Group_1__3 : rule__Expression_Repetition__Group_1__3__Impl ;
    public final void rule__Expression_Repetition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1188:1: ( rule__Expression_Repetition__Group_1__3__Impl )
            // InternalEBNFLang.g:1189:2: rule__Expression_Repetition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__3"


    // $ANTLR start "rule__Expression_Repetition__Group_1__3__Impl"
    // InternalEBNFLang.g:1195:1: rule__Expression_Repetition__Group_1__3__Impl : ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) ;
    public final void rule__Expression_Repetition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1199:1: ( ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) )
            // InternalEBNFLang.g:1200:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            {
            // InternalEBNFLang.g:1200:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            // InternalEBNFLang.g:1201:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 
            // InternalEBNFLang.g:1202:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            // InternalEBNFLang.g:1202:3: rule__Expression_Repetition__ExprAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__ExprAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__3__Impl"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__0"
    // InternalEBNFLang.g:1211:1: rule__Expression_Rule_Reference__Group__0 : rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 ;
    public final void rule__Expression_Rule_Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1215:1: ( rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 )
            // InternalEBNFLang.g:1216:2: rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Expression_Rule_Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__0"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__0__Impl"
    // InternalEBNFLang.g:1223:1: rule__Expression_Rule_Reference__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Rule_Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1227:1: ( ( () ) )
            // InternalEBNFLang.g:1228:1: ( () )
            {
            // InternalEBNFLang.g:1228:1: ( () )
            // InternalEBNFLang.g:1229:2: ()
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 
            // InternalEBNFLang.g:1230:2: ()
            // InternalEBNFLang.g:1230:3: 
            {
            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__0__Impl"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__1"
    // InternalEBNFLang.g:1238:1: rule__Expression_Rule_Reference__Group__1 : rule__Expression_Rule_Reference__Group__1__Impl ;
    public final void rule__Expression_Rule_Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1242:1: ( rule__Expression_Rule_Reference__Group__1__Impl )
            // InternalEBNFLang.g:1243:2: rule__Expression_Rule_Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__1"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__1__Impl"
    // InternalEBNFLang.g:1249:1: rule__Expression_Rule_Reference__Group__1__Impl : ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) ;
    public final void rule__Expression_Rule_Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1253:1: ( ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) )
            // InternalEBNFLang.g:1254:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            {
            // InternalEBNFLang.g:1254:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            // InternalEBNFLang.g:1255:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 
            // InternalEBNFLang.g:1256:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            // InternalEBNFLang.g:1256:3: rule__Expression_Rule_Reference__RuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__1__Impl"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__0"
    // InternalEBNFLang.g:1265:1: rule__Expression_Special_Sequence__Group__0 : rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 ;
    public final void rule__Expression_Special_Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1269:1: ( rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 )
            // InternalEBNFLang.g:1270:2: rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression_Special_Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__0"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__0__Impl"
    // InternalEBNFLang.g:1277:1: rule__Expression_Special_Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Special_Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1281:1: ( ( () ) )
            // InternalEBNFLang.g:1282:1: ( () )
            {
            // InternalEBNFLang.g:1282:1: ( () )
            // InternalEBNFLang.g:1283:2: ()
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 
            // InternalEBNFLang.g:1284:2: ()
            // InternalEBNFLang.g:1284:3: 
            {
            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__0__Impl"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__1"
    // InternalEBNFLang.g:1292:1: rule__Expression_Special_Sequence__Group__1 : rule__Expression_Special_Sequence__Group__1__Impl ;
    public final void rule__Expression_Special_Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1296:1: ( rule__Expression_Special_Sequence__Group__1__Impl )
            // InternalEBNFLang.g:1297:2: rule__Expression_Special_Sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__1"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__1__Impl"
    // InternalEBNFLang.g:1303:1: rule__Expression_Special_Sequence__Group__1__Impl : ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) ;
    public final void rule__Expression_Special_Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1307:1: ( ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) )
            // InternalEBNFLang.g:1308:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            {
            // InternalEBNFLang.g:1308:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            // InternalEBNFLang.g:1309:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 
            // InternalEBNFLang.g:1310:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            // InternalEBNFLang.g:1310:3: rule__Expression_Special_Sequence__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__1__Impl"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__0"
    // InternalEBNFLang.g:1319:1: rule__Expression_Terminal_Symbol__Group__0 : rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 ;
    public final void rule__Expression_Terminal_Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1323:1: ( rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 )
            // InternalEBNFLang.g:1324:2: rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression_Terminal_Symbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__0"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__0__Impl"
    // InternalEBNFLang.g:1331:1: rule__Expression_Terminal_Symbol__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Terminal_Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1335:1: ( ( () ) )
            // InternalEBNFLang.g:1336:1: ( () )
            {
            // InternalEBNFLang.g:1336:1: ( () )
            // InternalEBNFLang.g:1337:2: ()
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 
            // InternalEBNFLang.g:1338:2: ()
            // InternalEBNFLang.g:1338:3: 
            {
            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__0__Impl"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__1"
    // InternalEBNFLang.g:1346:1: rule__Expression_Terminal_Symbol__Group__1 : rule__Expression_Terminal_Symbol__Group__1__Impl ;
    public final void rule__Expression_Terminal_Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1350:1: ( rule__Expression_Terminal_Symbol__Group__1__Impl )
            // InternalEBNFLang.g:1351:2: rule__Expression_Terminal_Symbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__1"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__1__Impl"
    // InternalEBNFLang.g:1357:1: rule__Expression_Terminal_Symbol__Group__1__Impl : ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) ;
    public final void rule__Expression_Terminal_Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1361:1: ( ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) )
            // InternalEBNFLang.g:1362:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            {
            // InternalEBNFLang.g:1362:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            // InternalEBNFLang.g:1363:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 
            // InternalEBNFLang.g:1364:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            // InternalEBNFLang.g:1364:3: rule__Expression_Terminal_Symbol__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__1__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__0"
    // InternalEBNFLang.g:1373:1: rule__Expression_Repetition_Group__Group__0 : rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 ;
    public final void rule__Expression_Repetition_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1377:1: ( rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 )
            // InternalEBNFLang.g:1378:2: rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression_Repetition_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__0"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__0__Impl"
    // InternalEBNFLang.g:1385:1: rule__Expression_Repetition_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1389:1: ( ( () ) )
            // InternalEBNFLang.g:1390:1: ( () )
            {
            // InternalEBNFLang.g:1390:1: ( () )
            // InternalEBNFLang.g:1391:2: ()
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 
            // InternalEBNFLang.g:1392:2: ()
            // InternalEBNFLang.g:1392:3: 
            {
            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__1"
    // InternalEBNFLang.g:1400:1: rule__Expression_Repetition_Group__Group__1 : rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 ;
    public final void rule__Expression_Repetition_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1404:1: ( rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 )
            // InternalEBNFLang.g:1405:2: rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Repetition_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__1"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__1__Impl"
    // InternalEBNFLang.g:1412:1: rule__Expression_Repetition_Group__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression_Repetition_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1416:1: ( ( '{' ) )
            // InternalEBNFLang.g:1417:1: ( '{' )
            {
            // InternalEBNFLang.g:1417:1: ( '{' )
            // InternalEBNFLang.g:1418:2: '{'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__2"
    // InternalEBNFLang.g:1427:1: rule__Expression_Repetition_Group__Group__2 : rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 ;
    public final void rule__Expression_Repetition_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1431:1: ( rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 )
            // InternalEBNFLang.g:1432:2: rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Expression_Repetition_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__2"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__2__Impl"
    // InternalEBNFLang.g:1439:1: rule__Expression_Repetition_Group__Group__2__Impl : ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Repetition_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1443:1: ( ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) )
            // InternalEBNFLang.g:1444:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            {
            // InternalEBNFLang.g:1444:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            // InternalEBNFLang.g:1445:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 
            // InternalEBNFLang.g:1446:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            // InternalEBNFLang.g:1446:3: rule__Expression_Repetition_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__3"
    // InternalEBNFLang.g:1454:1: rule__Expression_Repetition_Group__Group__3 : rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 ;
    public final void rule__Expression_Repetition_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1458:1: ( rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 )
            // InternalEBNFLang.g:1459:2: rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Expression_Repetition_Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__3"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__3__Impl"
    // InternalEBNFLang.g:1466:1: rule__Expression_Repetition_Group__Group__3__Impl : ( '}' ) ;
    public final void rule__Expression_Repetition_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1470:1: ( ( '}' ) )
            // InternalEBNFLang.g:1471:1: ( '}' )
            {
            // InternalEBNFLang.g:1471:1: ( '}' )
            // InternalEBNFLang.g:1472:2: '}'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__3__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__4"
    // InternalEBNFLang.g:1481:1: rule__Expression_Repetition_Group__Group__4 : rule__Expression_Repetition_Group__Group__4__Impl ;
    public final void rule__Expression_Repetition_Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1485:1: ( rule__Expression_Repetition_Group__Group__4__Impl )
            // InternalEBNFLang.g:1486:2: rule__Expression_Repetition_Group__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__4"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__4__Impl"
    // InternalEBNFLang.g:1492:1: rule__Expression_Repetition_Group__Group__4__Impl : ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) ;
    public final void rule__Expression_Repetition_Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1496:1: ( ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) )
            // InternalEBNFLang.g:1497:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            {
            // InternalEBNFLang.g:1497:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            // InternalEBNFLang.g:1498:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 
            // InternalEBNFLang.g:1499:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
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
                    // InternalEBNFLang.g:1499:3: rule__Expression_Repetition_Group__AtLeastOneAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Repetition_Group__AtLeastOneAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__4__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__0"
    // InternalEBNFLang.g:1508:1: rule__Expression_Optional_Group__Group__0 : rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 ;
    public final void rule__Expression_Optional_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1512:1: ( rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 )
            // InternalEBNFLang.g:1513:2: rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression_Optional_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__0"


    // $ANTLR start "rule__Expression_Optional_Group__Group__0__Impl"
    // InternalEBNFLang.g:1520:1: rule__Expression_Optional_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Optional_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1524:1: ( ( () ) )
            // InternalEBNFLang.g:1525:1: ( () )
            {
            // InternalEBNFLang.g:1525:1: ( () )
            // InternalEBNFLang.g:1526:2: ()
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 
            // InternalEBNFLang.g:1527:2: ()
            // InternalEBNFLang.g:1527:3: 
            {
            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__1"
    // InternalEBNFLang.g:1535:1: rule__Expression_Optional_Group__Group__1 : rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 ;
    public final void rule__Expression_Optional_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1539:1: ( rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 )
            // InternalEBNFLang.g:1540:2: rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Optional_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__1"


    // $ANTLR start "rule__Expression_Optional_Group__Group__1__Impl"
    // InternalEBNFLang.g:1547:1: rule__Expression_Optional_Group__Group__1__Impl : ( '[' ) ;
    public final void rule__Expression_Optional_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1551:1: ( ( '[' ) )
            // InternalEBNFLang.g:1552:1: ( '[' )
            {
            // InternalEBNFLang.g:1552:1: ( '[' )
            // InternalEBNFLang.g:1553:2: '['
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__2"
    // InternalEBNFLang.g:1562:1: rule__Expression_Optional_Group__Group__2 : rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 ;
    public final void rule__Expression_Optional_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1566:1: ( rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 )
            // InternalEBNFLang.g:1567:2: rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Expression_Optional_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__2"


    // $ANTLR start "rule__Expression_Optional_Group__Group__2__Impl"
    // InternalEBNFLang.g:1574:1: rule__Expression_Optional_Group__Group__2__Impl : ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Optional_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1578:1: ( ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) )
            // InternalEBNFLang.g:1579:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            {
            // InternalEBNFLang.g:1579:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            // InternalEBNFLang.g:1580:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 
            // InternalEBNFLang.g:1581:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            // InternalEBNFLang.g:1581:3: rule__Expression_Optional_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__3"
    // InternalEBNFLang.g:1589:1: rule__Expression_Optional_Group__Group__3 : rule__Expression_Optional_Group__Group__3__Impl ;
    public final void rule__Expression_Optional_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1593:1: ( rule__Expression_Optional_Group__Group__3__Impl )
            // InternalEBNFLang.g:1594:2: rule__Expression_Optional_Group__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__3"


    // $ANTLR start "rule__Expression_Optional_Group__Group__3__Impl"
    // InternalEBNFLang.g:1600:1: rule__Expression_Optional_Group__Group__3__Impl : ( ']' ) ;
    public final void rule__Expression_Optional_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1604:1: ( ( ']' ) )
            // InternalEBNFLang.g:1605:1: ( ']' )
            {
            // InternalEBNFLang.g:1605:1: ( ']' )
            // InternalEBNFLang.g:1606:2: ']'
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__3__Impl"


    // $ANTLR start "rule__Expression_Group__Group__0"
    // InternalEBNFLang.g:1616:1: rule__Expression_Group__Group__0 : rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 ;
    public final void rule__Expression_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1620:1: ( rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 )
            // InternalEBNFLang.g:1621:2: rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Expression_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__0"


    // $ANTLR start "rule__Expression_Group__Group__0__Impl"
    // InternalEBNFLang.g:1628:1: rule__Expression_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1632:1: ( ( () ) )
            // InternalEBNFLang.g:1633:1: ( () )
            {
            // InternalEBNFLang.g:1633:1: ( () )
            // InternalEBNFLang.g:1634:2: ()
            {
             before(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 
            // InternalEBNFLang.g:1635:2: ()
            // InternalEBNFLang.g:1635:3: 
            {
            }

             after(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Group__Group__1"
    // InternalEBNFLang.g:1643:1: rule__Expression_Group__Group__1 : rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 ;
    public final void rule__Expression_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1647:1: ( rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 )
            // InternalEBNFLang.g:1648:2: rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__1"


    // $ANTLR start "rule__Expression_Group__Group__1__Impl"
    // InternalEBNFLang.g:1655:1: rule__Expression_Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Expression_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1659:1: ( ( '(' ) )
            // InternalEBNFLang.g:1660:1: ( '(' )
            {
            // InternalEBNFLang.g:1660:1: ( '(' )
            // InternalEBNFLang.g:1661:2: '('
            {
             before(grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Group__Group__2"
    // InternalEBNFLang.g:1670:1: rule__Expression_Group__Group__2 : rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 ;
    public final void rule__Expression_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1674:1: ( rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 )
            // InternalEBNFLang.g:1675:2: rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Expression_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__2"


    // $ANTLR start "rule__Expression_Group__Group__2__Impl"
    // InternalEBNFLang.g:1682:1: rule__Expression_Group__Group__2__Impl : ( ( rule__Expression_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1686:1: ( ( ( rule__Expression_Group__ExprAssignment_2 ) ) )
            // InternalEBNFLang.g:1687:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            {
            // InternalEBNFLang.g:1687:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            // InternalEBNFLang.g:1688:2: ( rule__Expression_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 
            // InternalEBNFLang.g:1689:2: ( rule__Expression_Group__ExprAssignment_2 )
            // InternalEBNFLang.g:1689:3: rule__Expression_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Group__Group__3"
    // InternalEBNFLang.g:1697:1: rule__Expression_Group__Group__3 : rule__Expression_Group__Group__3__Impl ;
    public final void rule__Expression_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1701:1: ( rule__Expression_Group__Group__3__Impl )
            // InternalEBNFLang.g:1702:2: rule__Expression_Group__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__3"


    // $ANTLR start "rule__Expression_Group__Group__3__Impl"
    // InternalEBNFLang.g:1708:1: rule__Expression_Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Expression_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1712:1: ( ( ')' ) )
            // InternalEBNFLang.g:1713:1: ( ')' )
            {
            // InternalEBNFLang.g:1713:1: ( ')' )
            // InternalEBNFLang.g:1714:2: ')'
            {
             before(grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__3__Impl"


    // $ANTLR start "rule__EbnfGrammar__RulesAssignment_1"
    // InternalEBNFLang.g:1724:1: rule__EbnfGrammar__RulesAssignment_1 : ( ruleProductionRule ) ;
    public final void rule__EbnfGrammar__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1728:1: ( ( ruleProductionRule ) )
            // InternalEBNFLang.g:1729:2: ( ruleProductionRule )
            {
            // InternalEBNFLang.g:1729:2: ( ruleProductionRule )
            // InternalEBNFLang.g:1730:3: ruleProductionRule
            {
             before(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProductionRule();

            state._fsp--;

             after(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__RulesAssignment_1"


    // $ANTLR start "rule__ProductionRule__NameAssignment_0"
    // InternalEBNFLang.g:1739:1: rule__ProductionRule__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__ProductionRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1743:1: ( ( RULE_NAME ) )
            // InternalEBNFLang.g:1744:2: ( RULE_NAME )
            {
            // InternalEBNFLang.g:1744:2: ( RULE_NAME )
            // InternalEBNFLang.g:1745:3: RULE_NAME
            {
             before(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__NameAssignment_0"


    // $ANTLR start "rule__ProductionRule__ExprAssignment_2"
    // InternalEBNFLang.g:1754:1: rule__ProductionRule__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProductionRule__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1758:1: ( ( ruleExpression ) )
            // InternalEBNFLang.g:1759:2: ( ruleExpression )
            {
            // InternalEBNFLang.g:1759:2: ( ruleExpression )
            // InternalEBNFLang.g:1760:3: ruleExpression
            {
             before(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Alternative__ElementsAssignment_1_1_1"
    // InternalEBNFLang.g:1769:1: rule__Expression_Alternative__ElementsAssignment_1_1_1 : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1773:1: ( ( ruleExpression_Concatenation ) )
            // InternalEBNFLang.g:1774:2: ( ruleExpression_Concatenation )
            {
            // InternalEBNFLang.g:1774:2: ( ruleExpression_Concatenation )
            // InternalEBNFLang.g:1775:3: ruleExpression_Concatenation
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Expression_Concatenation__ElementsAssignment_1_1_1"
    // InternalEBNFLang.g:1784:1: rule__Expression_Concatenation__ElementsAssignment_1_1_1 : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1788:1: ( ( ruleExpression_Exception ) )
            // InternalEBNFLang.g:1789:2: ( ruleExpression_Exception )
            {
            // InternalEBNFLang.g:1789:2: ( ruleExpression_Exception )
            // InternalEBNFLang.g:1790:3: ruleExpression_Exception
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Expression_Exception__RightAssignment_1_2"
    // InternalEBNFLang.g:1799:1: rule__Expression_Exception__RightAssignment_1_2 : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1803:1: ( ( ruleExpression_Repetition ) )
            // InternalEBNFLang.g:1804:2: ( ruleExpression_Repetition )
            {
            // InternalEBNFLang.g:1804:2: ( ruleExpression_Repetition )
            // InternalEBNFLang.g:1805:3: ruleExpression_Repetition
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__RightAssignment_1_2"


    // $ANTLR start "rule__Expression_Repetition__RepetitionsAssignment_1_1"
    // InternalEBNFLang.g:1814:1: rule__Expression_Repetition__RepetitionsAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Expression_Repetition__RepetitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1818:1: ( ( RULE_NUMBER ) )
            // InternalEBNFLang.g:1819:2: ( RULE_NUMBER )
            {
            // InternalEBNFLang.g:1819:2: ( RULE_NUMBER )
            // InternalEBNFLang.g:1820:3: RULE_NUMBER
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__RepetitionsAssignment_1_1"


    // $ANTLR start "rule__Expression_Repetition__ExprAssignment_1_3"
    // InternalEBNFLang.g:1829:1: rule__Expression_Repetition__ExprAssignment_1_3 : ( ruleExpression_Terminal ) ;
    public final void rule__Expression_Repetition__ExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1833:1: ( ( ruleExpression_Terminal ) )
            // InternalEBNFLang.g:1834:2: ( ruleExpression_Terminal )
            {
            // InternalEBNFLang.g:1834:2: ( ruleExpression_Terminal )
            // InternalEBNFLang.g:1835:3: ruleExpression_Terminal
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Terminal();

            state._fsp--;

             after(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__ExprAssignment_1_3"


    // $ANTLR start "rule__Expression_Rule_Reference__RuleAssignment_1"
    // InternalEBNFLang.g:1844:1: rule__Expression_Rule_Reference__RuleAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__Expression_Rule_Reference__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1848:1: ( ( ( RULE_NAME ) ) )
            // InternalEBNFLang.g:1849:2: ( ( RULE_NAME ) )
            {
            // InternalEBNFLang.g:1849:2: ( ( RULE_NAME ) )
            // InternalEBNFLang.g:1850:3: ( RULE_NAME )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 
            // InternalEBNFLang.g:1851:3: ( RULE_NAME )
            // InternalEBNFLang.g:1852:4: RULE_NAME
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__RuleAssignment_1"


    // $ANTLR start "rule__Expression_Special_Sequence__TextAssignment_1"
    // InternalEBNFLang.g:1863:1: rule__Expression_Special_Sequence__TextAssignment_1 : ( RULE_SPECIAL_SEQUENCE ) ;
    public final void rule__Expression_Special_Sequence__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1867:1: ( ( RULE_SPECIAL_SEQUENCE ) )
            // InternalEBNFLang.g:1868:2: ( RULE_SPECIAL_SEQUENCE )
            {
            // InternalEBNFLang.g:1868:2: ( RULE_SPECIAL_SEQUENCE )
            // InternalEBNFLang.g:1869:3: RULE_SPECIAL_SEQUENCE
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0()); 
            match(input,RULE_SPECIAL_SEQUENCE,FOLLOW_2); 
             after(grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__TextAssignment_1"


    // $ANTLR start "rule__Expression_Terminal_Symbol__TextAssignment_1"
    // InternalEBNFLang.g:1878:1: rule__Expression_Terminal_Symbol__TextAssignment_1 : ( RULE_TERMINAL_SYMBOL ) ;
    public final void rule__Expression_Terminal_Symbol__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1882:1: ( ( RULE_TERMINAL_SYMBOL ) )
            // InternalEBNFLang.g:1883:2: ( RULE_TERMINAL_SYMBOL )
            {
            // InternalEBNFLang.g:1883:2: ( RULE_TERMINAL_SYMBOL )
            // InternalEBNFLang.g:1884:3: RULE_TERMINAL_SYMBOL
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0()); 
            match(input,RULE_TERMINAL_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__TextAssignment_1"


    // $ANTLR start "rule__Expression_Repetition_Group__ExprAssignment_2"
    // InternalEBNFLang.g:1893:1: rule__Expression_Repetition_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Repetition_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1897:1: ( ( ruleExpression ) )
            // InternalEBNFLang.g:1898:2: ( ruleExpression )
            {
            // InternalEBNFLang.g:1898:2: ( ruleExpression )
            // InternalEBNFLang.g:1899:3: ruleExpression
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Repetition_Group__AtLeastOneAssignment_4"
    // InternalEBNFLang.g:1908:1: rule__Expression_Repetition_Group__AtLeastOneAssignment_4 : ( ( '-' ) ) ;
    public final void rule__Expression_Repetition_Group__AtLeastOneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1912:1: ( ( ( '-' ) ) )
            // InternalEBNFLang.g:1913:2: ( ( '-' ) )
            {
            // InternalEBNFLang.g:1913:2: ( ( '-' ) )
            // InternalEBNFLang.g:1914:3: ( '-' )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            // InternalEBNFLang.g:1915:3: ( '-' )
            // InternalEBNFLang.g:1916:4: '-'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 

            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__AtLeastOneAssignment_4"


    // $ANTLR start "rule__Expression_Optional_Group__ExprAssignment_2"
    // InternalEBNFLang.g:1927:1: rule__Expression_Optional_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Optional_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1931:1: ( ( ruleExpression ) )
            // InternalEBNFLang.g:1932:2: ( ruleExpression )
            {
            // InternalEBNFLang.g:1932:2: ( ruleExpression )
            // InternalEBNFLang.g:1933:3: ruleExpression
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Group__ExprAssignment_2"
    // InternalEBNFLang.g:1942:1: rule__Expression_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEBNFLang.g:1946:1: ( ( ruleExpression ) )
            // InternalEBNFLang.g:1947:2: ( ruleExpression )
            {
            // InternalEBNFLang.g:1947:2: ( ruleExpression )
            // InternalEBNFLang.g:1948:3: ruleExpression
            {
             before(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__ExprAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000054000D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});

}