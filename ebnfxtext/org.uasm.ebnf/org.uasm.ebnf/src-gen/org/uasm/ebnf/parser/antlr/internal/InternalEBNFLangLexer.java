package org.uasm.ebnf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEBNFLangLexer extends Lexer {
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

    public InternalEBNFLangLexer() {;} 
    public InternalEBNFLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEBNFLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEBNFLang.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:11:7: ( '=' )
            // InternalEBNFLang.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:12:7: ( ';' )
            // InternalEBNFLang.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:13:7: ( '|' )
            // InternalEBNFLang.g:13:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:14:7: ( ',' )
            // InternalEBNFLang.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:15:7: ( '-' )
            // InternalEBNFLang.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:16:7: ( '*' )
            // InternalEBNFLang.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:17:7: ( '{' )
            // InternalEBNFLang.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:18:7: ( '}' )
            // InternalEBNFLang.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:19:7: ( '[' )
            // InternalEBNFLang.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:20:7: ( ']' )
            // InternalEBNFLang.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:21:7: ( '(' )
            // InternalEBNFLang.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:22:7: ( ')' )
            // InternalEBNFLang.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:828:14: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalEBNFLang.g:828:16: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalEBNFLang.g:828:21: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==')') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='(')||(LA1_1>='*' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEBNFLang.g:828:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:830:13: ( '1' .. '9' ( '0' .. '9' )* )
            // InternalEBNFLang.g:830:15: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // InternalEBNFLang.g:830:24: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEBNFLang.g:830:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:832:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // InternalEBNFLang.g:832:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // InternalEBNFLang.g:832:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEBNFLang.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_TERMINAL_SYMBOL"
    public final void mRULE_TERMINAL_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:834:22: ( ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' ) )
            // InternalEBNFLang.g:834:24: ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' )
            {
            // InternalEBNFLang.g:834:24: ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEBNFLang.g:834:25: '\"' (~ ( '\"' ) )+ '\"'
                    {
                    match('\"'); 
                    // InternalEBNFLang.g:834:29: (~ ( '\"' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEBNFLang.g:834:29: ~ ( '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:834:41: '\\'' (~ ( '\\'' ) )+ '\\''
                    {
                    match('\''); 
                    // InternalEBNFLang.g:834:46: (~ ( '\\'' ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEBNFLang.g:834:46: ~ ( '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_SYMBOL"

    // $ANTLR start "RULE_SPECIAL_SEQUENCE"
    public final void mRULE_SPECIAL_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:836:23: ( '?' (~ ( '?' ) )+ '?' )
            // InternalEBNFLang.g:836:25: '?' (~ ( '?' ) )+ '?'
            {
            match('?'); 
            // InternalEBNFLang.g:836:29: (~ ( '?' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='>')||(LA7_0>='@' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEBNFLang.g:836:29: ~ ( '?' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIAL_SEQUENCE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:838:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEBNFLang.g:838:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEBNFLang.g:838:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEBNFLang.g:838:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEBNFLang.g:838:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEBNFLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:840:10: ( ( '0' .. '9' )+ )
            // InternalEBNFLang.g:840:12: ( '0' .. '9' )+
            {
            // InternalEBNFLang.g:840:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEBNFLang.g:840:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:842:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEBNFLang.g:842:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEBNFLang.g:842:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEBNFLang.g:842:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEBNFLang.g:842:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEBNFLang.g:842:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEBNFLang.g:842:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEBNFLang.g:842:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEBNFLang.g:842:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEBNFLang.g:842:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEBNFLang.g:842:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:844:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEBNFLang.g:844:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEBNFLang.g:844:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEBNFLang.g:844:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:846:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEBNFLang.g:846:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEBNFLang.g:846:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEBNFLang.g:846:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalEBNFLang.g:846:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEBNFLang.g:846:41: ( '\\r' )? '\\n'
                    {
                    // InternalEBNFLang.g:846:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEBNFLang.g:846:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:848:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEBNFLang.g:848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEBNFLang.g:848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEBNFLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEBNFLang.g:850:16: ( . )
            // InternalEBNFLang.g:850:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEBNFLang.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_COMMENT | RULE_NUMBER | RULE_NAME | RULE_TERMINAL_SYMBOL | RULE_SPECIAL_SEQUENCE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=24;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalEBNFLang.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalEBNFLang.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalEBNFLang.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalEBNFLang.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalEBNFLang.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalEBNFLang.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalEBNFLang.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalEBNFLang.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalEBNFLang.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalEBNFLang.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalEBNFLang.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalEBNFLang.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalEBNFLang.g:1:82: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 14 :
                // InternalEBNFLang.g:1:95: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 15 :
                // InternalEBNFLang.g:1:107: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 16 :
                // InternalEBNFLang.g:1:117: RULE_TERMINAL_SYMBOL
                {
                mRULE_TERMINAL_SYMBOL(); 

                }
                break;
            case 17 :
                // InternalEBNFLang.g:1:138: RULE_SPECIAL_SEQUENCE
                {
                mRULE_SPECIAL_SEQUENCE(); 

                }
                break;
            case 18 :
                // InternalEBNFLang.g:1:160: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalEBNFLang.g:1:168: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // InternalEBNFLang.g:1:177: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // InternalEBNFLang.g:1:189: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // InternalEBNFLang.g:1:205: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // InternalEBNFLang.g:1:221: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalEBNFLang.g:1:229: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\13\uffff\1\42\1\uffff\1\44\1\46\4\26\1\uffff\1\26\20\uffff\1\44\1\uffff\1\46\13\uffff\1\71\2\uffff\1\71\3\uffff";
    static final String DFA19_eofS =
        "\72\uffff";
    static final String DFA19_minS =
        "\1\0\12\uffff\1\52\1\uffff\2\60\3\0\1\101\1\uffff\1\52\20\uffff\1\60\1\uffff\1\60\1\uffff\2\0\1\uffff\2\0\5\uffff\2\0\1\uffff\2\0\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\12\uffff\1\52\1\uffff\1\71\1\172\3\uffff\1\172\1\uffff\1\57\20\uffff\1\71\1\uffff\1\172\1\uffff\2\uffff\1\uffff\2\uffff\5\uffff\2\uffff\1\uffff\2\uffff\2\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\6\uffff\1\23\1\uffff\1\27\1\30\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\15\1\13\1\14\1\16\1\uffff\1\17\1\uffff\1\22\2\uffff\1\24\2\uffff\1\21\1\23\1\25\1\26\1\27\2\uffff\1\20\2\uffff\2\20";
    static final String DFA19_specialS =
        "\1\3\16\uffff\1\7\1\13\1\4\27\uffff\1\11\1\5\1\uffff\1\1\1\12\5\uffff\1\0\1\2\1\uffff\1\6\1\10\2\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\17\4\26\1\20\1\13\1\14\1\6\1\26\1\4\1\5\1\26\1\24\1\23\11\15\1\26\1\2\1\26\1\1\1\26\1\21\1\26\32\16\1\11\1\26\1\12\1\22\1\16\1\26\32\16\1\7\1\3\1\10\uff82\26",
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
            "\1\41",
            "",
            "\12\45",
            "\12\50\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\42\52\1\53\71\52\1\51\uffa3\52",
            "\47\55\1\53\64\55\1\54\uffa3\55",
            "\77\56\1\uffff\uffc0\56",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\60\4\uffff\1\61",
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
            "\12\45",
            "",
            "\12\50\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\42\64\1\63\uffdd\64",
            "\42\52\1\65\71\52\1\51\uffa3\52",
            "",
            "\47\67\1\66\uffd8\67",
            "\47\55\1\70\64\55\1\54\uffa3\55",
            "",
            "",
            "",
            "",
            "",
            "\0\53",
            "\42\52\1\65\71\52\1\51\uffa3\52",
            "",
            "\0\53",
            "\47\55\1\70\64\55\1\54\uffa3\55",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_COMMENT | RULE_NUMBER | RULE_NAME | RULE_TERMINAL_SYMBOL | RULE_SPECIAL_SEQUENCE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_51 = input.LA(1);

                        s = -1;
                        if ( ((LA19_51>='\u0000' && LA19_51<='\uFFFF')) ) {s = 43;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_44 = input.LA(1);

                        s = -1;
                        if ( (LA19_44=='\'') ) {s = 54;}

                        else if ( ((LA19_44>='\u0000' && LA19_44<='&')||(LA19_44>='(' && LA19_44<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_52 = input.LA(1);

                        s = -1;
                        if ( (LA19_52=='\"') ) {s = 53;}

                        else if ( (LA19_52=='\\') ) {s = 41;}

                        else if ( ((LA19_52>='\u0000' && LA19_52<='!')||(LA19_52>='#' && LA19_52<='[')||(LA19_52>=']' && LA19_52<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='=') ) {s = 1;}

                        else if ( (LA19_0==';') ) {s = 2;}

                        else if ( (LA19_0=='|') ) {s = 3;}

                        else if ( (LA19_0==',') ) {s = 4;}

                        else if ( (LA19_0=='-') ) {s = 5;}

                        else if ( (LA19_0=='*') ) {s = 6;}

                        else if ( (LA19_0=='{') ) {s = 7;}

                        else if ( (LA19_0=='}') ) {s = 8;}

                        else if ( (LA19_0=='[') ) {s = 9;}

                        else if ( (LA19_0==']') ) {s = 10;}

                        else if ( (LA19_0=='(') ) {s = 11;}

                        else if ( (LA19_0==')') ) {s = 12;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 13;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {s = 14;}

                        else if ( (LA19_0=='\"') ) {s = 15;}

                        else if ( (LA19_0=='\'') ) {s = 16;}

                        else if ( (LA19_0=='?') ) {s = 17;}

                        else if ( (LA19_0=='^') ) {s = 18;}

                        else if ( (LA19_0=='0') ) {s = 19;}

                        else if ( (LA19_0=='/') ) {s = 20;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 21;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||LA19_0=='+'||LA19_0=='.'||LA19_0==':'||LA19_0=='<'||LA19_0=='>'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_17 = input.LA(1);

                        s = -1;
                        if ( ((LA19_17>='\u0000' && LA19_17<='>')||(LA19_17>='@' && LA19_17<='\uFFFF')) ) {s = 46;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_42 = input.LA(1);

                        s = -1;
                        if ( (LA19_42=='\"') ) {s = 53;}

                        else if ( (LA19_42=='\\') ) {s = 41;}

                        else if ( ((LA19_42>='\u0000' && LA19_42<='!')||(LA19_42>='#' && LA19_42<='[')||(LA19_42>=']' && LA19_42<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_54 = input.LA(1);

                        s = -1;
                        if ( ((LA19_54>='\u0000' && LA19_54<='\uFFFF')) ) {s = 43;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_15 = input.LA(1);

                        s = -1;
                        if ( (LA19_15=='\\') ) {s = 41;}

                        else if ( ((LA19_15>='\u0000' && LA19_15<='!')||(LA19_15>='#' && LA19_15<='[')||(LA19_15>=']' && LA19_15<='\uFFFF')) ) {s = 42;}

                        else if ( (LA19_15=='\"') ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_55 = input.LA(1);

                        s = -1;
                        if ( (LA19_55=='\'') ) {s = 56;}

                        else if ( (LA19_55=='\\') ) {s = 44;}

                        else if ( ((LA19_55>='\u0000' && LA19_55<='&')||(LA19_55>='(' && LA19_55<='[')||(LA19_55>=']' && LA19_55<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_41 = input.LA(1);

                        s = -1;
                        if ( (LA19_41=='\"') ) {s = 51;}

                        else if ( ((LA19_41>='\u0000' && LA19_41<='!')||(LA19_41>='#' && LA19_41<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_45 = input.LA(1);

                        s = -1;
                        if ( (LA19_45=='\'') ) {s = 56;}

                        else if ( (LA19_45=='\\') ) {s = 44;}

                        else if ( ((LA19_45>='\u0000' && LA19_45<='&')||(LA19_45>='(' && LA19_45<='[')||(LA19_45>=']' && LA19_45<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_16 = input.LA(1);

                        s = -1;
                        if ( (LA19_16=='\\') ) {s = 44;}

                        else if ( ((LA19_16>='\u0000' && LA19_16<='&')||(LA19_16>='(' && LA19_16<='[')||(LA19_16>=']' && LA19_16<='\uFFFF')) ) {s = 45;}

                        else if ( (LA19_16=='\'') ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}