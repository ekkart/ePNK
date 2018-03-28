package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLPNGInscriptionLanguageLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_INTSTRING=5;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalHLPNGInscriptionLanguageLexer() {;} 
    public InternalHLPNGInscriptionLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalHLPNGInscriptionLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:11:7: ( ';' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:12:7: ( 'sorts' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:12:9: 'sorts'
            {
            match("sorts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:13:7: ( ',' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:14:7: ( 'vars' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:14:9: 'vars'
            {
            match("vars"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:15:7: ( 'ops' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:15:9: 'ops'
            {
            match("ops"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:16:7: ( 'sortsymbols' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:16:9: 'sortsymbols'
            {
            match("sortsymbols"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:17:7: ( 'opsymbols' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:17:9: 'opsymbols'
            {
            match("opsymbols"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:18:7: ( ':' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:18:9: ':'
            {
            match(':'); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:19:7: ( '=' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:19:9: '='
            {
            match('='); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:20:7: ( '(' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:20:9: '('
            {
            match('('); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:21:7: ( ')' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:21:9: ')'
            {
            match(')'); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:22:7: ( 'MS' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:22:9: 'MS'
            {
            match("MS"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:23:7: ( '*' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:23:9: '*'
            {
            match('*'); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:24:7: ( 'or' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:24:9: 'or'
            {
            match("or"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:25:7: ( 'implies' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:25:9: 'implies'
            {
            match("implies"); 


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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:26:7: ( 'and' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:26:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:27:7: ( '>' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:28:7: ( '>=' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:28:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:29:7: ( '<' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:29:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:30:7: ( '<=' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:30:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:31:7: ( 'contains' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:31:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:32:7: ( '<r' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:32:9: '<r'
            {
            match("<r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:33:7: ( '<=r' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:33:9: '<=r'
            {
            match("<=r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:34:7: ( '>r' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:34:9: '>r'
            {
            match(">r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:35:7: ( '>=r' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:35:9: '>=r'
            {
            match(">=r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:36:7: ( '<p' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:36:9: '<p'
            {
            match("<p"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:37:7: ( '>p' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:37:9: '>p'
            {
            match(">p"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:38:7: ( '>=s' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:38:9: '>=s'
            {
            match(">=s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:39:7: ( '>s' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:39:9: '>s'
            {
            match(">s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:40:7: ( '<=s' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:40:9: '<=s'
            {
            match("<=s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:41:7: ( '<s' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:41:9: '<s'
            {
            match("<s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:42:7: ( '==' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:42:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:43:7: ( '!=' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:43:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:44:7: ( '++' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:44:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:45:7: ( '--' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:45:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:46:7: ( '`' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:46:9: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:47:7: ( '+' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:47:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:48:7: ( '-' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:48:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:49:7: ( '**' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:49:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:50:7: ( '/' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:50:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:51:7: ( '%' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:51:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:52:7: ( 'not' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:52:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:53:7: ( '|' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:53:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:54:7: ( '#(' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:54:9: '#('
            {
            match("#("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:55:7: ( 'all' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:55:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:56:7: ( 'empty' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:56:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:57:7: ( 'DOT' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:57:9: 'DOT'
            {
            match("DOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:58:7: ( 'dot' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:58:9: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:59:7: ( 'BOOL' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:59:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:60:7: ( 'true' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:60:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:61:7: ( 'false' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:61:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:62:7: ( 'INT' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:62:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:63:7: ( 'NAT' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:63:9: 'NAT'
            {
            match("NAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:64:7: ( 'POS' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:64:9: 'POS'
            {
            match("POS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:65:7: ( 'enum' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:65:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:66:7: ( '{' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:66:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:67:7: ( '}' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:67:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:68:7: ( 'cyclic' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:68:9: 'cyclic'
            {
            match("cyclic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:69:7: ( 'succ' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:69:9: 'succ'
            {
            match("succ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:70:7: ( 'pred' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:70:9: 'pred'
            {
            match("pred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:71:7: ( '[' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:71:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:72:7: ( '..' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:72:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:73:7: ( ']' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:73:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:74:7: ( 'partition' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:74:9: 'partition'
            {
            match("partition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:75:7: ( 'in' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:75:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:76:7: ( 'STRING' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:76:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:77:7: ( 'concatstring' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:77:9: 'concatstring'
            {
            match("concatstring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:78:7: ( 'stringlength' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:78:9: 'stringlength'
            {
            match("stringlength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:79:7: ( 'substring' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:79:9: 'substring'
            {
            match("substring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:7: ( 'LIST' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:9: 'LIST'
            {
            match("LIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:81:7: ( 'concatlists' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:81:9: 'concatlists'
            {
            match("concatlists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:82:7: ( 'appendtolist' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:82:9: 'appendtolist'
            {
            match("appendtolist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:83:7: ( 'listlength' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:83:9: 'listlength'
            {
            match("listlength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:84:7: ( 'sublist' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:84:9: 'sublist'
            {
            match("sublist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:85:7: ( 'memberat' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:85:9: 'memberat'
            {
            match("memberat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:86:7: ( 'makelist' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:86:9: 'makelist'
            {
            match("makelist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:87:7: ( 'emptylist' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:87:9: 'emptylist'
            {
            match("emptylist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:88:7: ( '->' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:88:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "RULE_INTSTRING"
    public final void mRULE_INTSTRING() throws RecognitionException {
        try {
            int _type = RULE_INTSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:16: ( ( '-' )? ( '0' .. '9' )+ )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:18: ( '-' )? ( '0' .. '9' )+
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:18: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:18: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:23: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4673:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4675:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4675:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4675:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4675:11: '^'
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

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4675:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:
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
            	    break loop4;
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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4677:10: ( ( '0' .. '9' )+ )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4677:12: ( '0' .. '9' )+
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4677:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4677:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4679:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4681:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4681:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4681:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4681:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:41: ( '\\r' )? '\\n'
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4683:41: '\\r'
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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4685:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4685:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4685:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4687:16: ( . )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4687:18: .
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
        // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_INTSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=86;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:478: RULE_INTSTRING
                {
                mRULE_INTSTRING(); 

                }
                break;
            case 80 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:493: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:501: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:510: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:522: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:538: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:554: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 86 :
                // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1:562: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\70\1\uffff\2\70\1\uffff\1\77\2\uffff\1\70\1\104\2\70"+
        "\1\116\1\123\1\70\1\63\1\130\1\133\1\uffff\1\140\1\uffff\1\70\1"+
        "\uffff\1\63\11\70\2\uffff\1\70\1\uffff\1\63\1\uffff\4\70\1\134\1"+
        "\63\1\uffff\2\63\3\uffff\3\70\2\uffff\2\70\1\u0084\5\uffff\1\u0085"+
        "\2\uffff\1\70\1\u0087\3\70\1\u008d\4\uffff\1\u0090\4\uffff\2\70"+
        "\14\uffff\1\70\2\uffff\12\70\2\uffff\2\70\3\uffff\5\70\1\134\2\uffff"+
        "\5\70\1\u00ac\2\uffff\1\70\1\uffff\1\u00ae\1\u00af\1\70\6\uffff"+
        "\2\70\1\u00b4\2\70\1\u00b7\1\u00b8\3\70\1\u00bc\1\u00bd\1\u00be"+
        "\10\70\1\u00c7\3\70\1\u00cb\1\70\1\uffff\1\70\2\uffff\4\70\1\uffff"+
        "\1\70\1\u00d3\2\uffff\1\u00d4\1\u00d5\1\70\3\uffff\1\u00d7\2\70"+
        "\1\u00da\3\70\1\u00df\1\uffff\3\70\1\uffff\6\70\1\u00ea\3\uffff"+
        "\1\u00eb\1\uffff\2\70\1\uffff\4\70\1\uffff\10\70\1\u00fb\1\70\2"+
        "\uffff\1\70\1\u00fe\5\70\1\u0104\2\70\1\u0107\4\70\1\uffff\2\70"+
        "\1\uffff\5\70\1\uffff\2\70\1\uffff\1\70\1\u0116\5\70\1\u011c\1\u011d"+
        "\1\70\1\u011f\1\70\1\u0121\1\70\1\uffff\2\70\1\u0125\1\u0126\1\70"+
        "\2\uffff\1\70\1\uffff\1\70\1\uffff\3\70\2\uffff\1\u012d\1\u012e"+
        "\3\70\1\u0132\2\uffff\1\u0133\1\u0134\1\u0135\4\uffff";
    static final String DFA14_eofS =
        "\u0136\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\157\1\uffff\1\141\1\160\1\uffff\1\75\2\uffff\1\123"+
        "\1\52\1\155\1\154\2\75\1\157\1\75\1\53\1\55\1\uffff\1\52\1\uffff"+
        "\1\157\1\uffff\1\50\1\155\1\117\1\157\1\117\1\162\1\141\1\116\1"+
        "\101\1\117\2\uffff\1\141\1\uffff\1\56\1\uffff\1\124\1\111\1\151"+
        "\1\141\1\60\1\101\1\uffff\2\0\3\uffff\1\162\1\142\1\162\2\uffff"+
        "\1\162\1\163\1\60\5\uffff\1\60\2\uffff\1\160\1\60\1\144\1\154\1"+
        "\160\1\162\4\uffff\1\162\4\uffff\1\156\1\143\14\uffff\1\164\2\uffff"+
        "\1\160\1\165\1\124\1\164\1\117\1\165\1\154\2\124\1\123\2\uffff\1"+
        "\145\1\162\3\uffff\1\122\1\123\1\163\1\155\1\153\1\60\2\uffff\1"+
        "\164\1\143\1\154\1\151\1\163\1\60\2\uffff\1\154\1\uffff\2\60\1\145"+
        "\6\uffff\1\143\1\154\1\60\1\164\1\155\2\60\1\114\1\145\1\163\3\60"+
        "\1\144\1\164\1\111\1\124\1\164\1\142\1\145\1\163\1\60\1\164\1\151"+
        "\1\156\1\60\1\155\1\uffff\1\151\2\uffff\1\156\2\141\1\151\1\uffff"+
        "\1\171\1\60\2\uffff\2\60\1\145\3\uffff\1\60\1\151\1\116\1\60\1\154"+
        "\1\145\1\154\1\60\1\uffff\1\162\1\163\1\147\1\uffff\1\142\1\145"+
        "\1\144\1\151\1\164\1\143\1\60\3\uffff\1\60\1\uffff\1\164\1\107\1"+
        "\uffff\1\145\1\162\1\151\1\155\1\uffff\1\151\1\164\1\154\1\157\1"+
        "\163\1\164\1\156\1\154\1\60\1\151\2\uffff\1\151\1\60\1\156\1\141"+
        "\1\163\1\142\1\156\1\60\1\145\1\154\1\60\1\157\1\163\1\164\1\151"+
        "\1\uffff\1\163\1\157\1\uffff\1\147\2\164\1\157\1\147\1\uffff\1\156"+
        "\1\163\1\uffff\1\154\1\60\1\162\1\163\1\164\1\156\1\164\2\60\1\154"+
        "\1\60\1\147\1\60\1\151\1\uffff\1\151\1\164\2\60\1\150\2\uffff\1"+
        "\163\1\uffff\1\164\1\uffff\1\163\1\156\1\163\2\uffff\2\60\1\150"+
        "\1\164\1\147\1\60\2\uffff\3\60\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\165\1\uffff\1\141\1\162\1\uffff\1\75\2\uffff"+
        "\1\123\1\52\1\156\1\160\2\163\1\171\1\75\1\53\1\76\1\uffff\1\57"+
        "\1\uffff\1\157\1\uffff\1\50\1\156\1\117\1\157\1\117\1\162\1\141"+
        "\1\116\1\101\1\117\2\uffff\1\162\1\uffff\1\56\1\uffff\1\124\1\111"+
        "\1\151\1\145\1\71\1\172\1\uffff\2\uffff\3\uffff\1\162\1\143\1\162"+
        "\2\uffff\1\162\1\163\1\172\5\uffff\1\172\2\uffff\1\160\1\172\1\144"+
        "\1\154\1\160\1\163\4\uffff\1\163\4\uffff\1\156\1\143\14\uffff\1"+
        "\164\2\uffff\1\160\1\165\1\124\1\164\1\117\1\165\1\154\2\124\1\123"+
        "\2\uffff\1\145\1\162\3\uffff\1\122\1\123\1\163\1\155\1\153\1\71"+
        "\2\uffff\1\164\1\143\1\163\1\151\1\163\1\172\2\uffff\1\154\1\uffff"+
        "\2\172\1\145\6\uffff\1\164\1\154\1\172\1\164\1\155\2\172\1\114\1"+
        "\145\1\163\3\172\1\144\1\164\1\111\1\124\1\164\1\142\1\145\1\163"+
        "\1\172\1\164\1\151\1\156\1\172\1\155\1\uffff\1\151\2\uffff\1\156"+
        "\2\141\1\151\1\uffff\1\171\1\172\2\uffff\2\172\1\145\3\uffff\1\172"+
        "\1\151\1\116\1\172\1\154\1\145\1\154\1\172\1\uffff\1\162\1\163\1"+
        "\147\1\uffff\1\142\1\145\1\144\1\151\1\164\1\143\1\172\3\uffff\1"+
        "\172\1\uffff\1\164\1\107\1\uffff\1\145\1\162\1\151\1\155\1\uffff"+
        "\1\151\1\164\1\154\1\157\1\163\1\164\1\156\1\163\1\172\1\151\2\uffff"+
        "\1\151\1\172\1\156\1\141\1\163\1\142\1\156\1\172\1\145\1\154\1\172"+
        "\1\157\1\163\1\164\1\151\1\uffff\1\163\1\157\1\uffff\1\147\2\164"+
        "\1\157\1\147\1\uffff\1\156\1\163\1\uffff\1\154\1\172\1\162\1\163"+
        "\1\164\1\156\1\164\2\172\1\154\1\172\1\147\1\172\1\151\1\uffff\1"+
        "\151\1\164\2\172\1\150\2\uffff\1\163\1\uffff\1\164\1\uffff\1\163"+
        "\1\156\1\163\2\uffff\2\172\1\150\1\164\1\147\1\172\2\uffff\3\172"+
        "\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\10\1\uffff\1\12\1\13\12\uffff"+
        "\1\44\1\uffff\1\51\1\uffff\1\53\12\uffff\1\70\1\71\1\uffff\1\75"+
        "\1\uffff\1\77\6\uffff\1\120\2\uffff\1\125\1\126\1\1\3\uffff\1\120"+
        "\1\3\3\uffff\1\10\1\40\1\11\1\12\1\13\1\uffff\1\47\1\15\6\uffff"+
        "\1\30\1\33\1\35\1\21\1\uffff\1\26\1\32\1\37\1\23\2\uffff\1\41\1"+
        "\42\1\45\1\43\1\116\1\46\1\117\1\44\1\123\1\124\1\50\1\51\1\uffff"+
        "\1\53\1\54\12\uffff\1\70\1\71\2\uffff\1\75\1\76\1\77\6\uffff\1\122"+
        "\1\125\6\uffff\1\16\1\14\1\uffff\1\101\3\uffff\1\31\1\34\1\22\1"+
        "\27\1\36\1\24\33\uffff\1\5\1\uffff\1\20\1\55\4\uffff\1\52\2\uffff"+
        "\1\57\1\60\3\uffff\1\64\1\65\1\66\10\uffff\1\73\3\uffff\1\4\7\uffff"+
        "\1\67\1\61\1\62\1\uffff\1\74\2\uffff\1\106\4\uffff\1\2\12\uffff"+
        "\1\56\1\63\17\uffff\1\72\2\uffff\1\102\5\uffff\1\112\2\uffff\1\17"+
        "\16\uffff\1\25\5\uffff\1\113\1\114\1\uffff\1\105\1\uffff\1\7\3\uffff"+
        "\1\115\1\100\6\uffff\1\111\1\6\3\uffff\1\107\1\104\1\110\1\103";
    static final String DFA14_specialS =
        "\1\2\57\uffff\1\0\1\1\u0104\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\21\1\60\1\31\1\63\1\26\1"+
            "\63\1\61\1\10\1\11\1\13\1\22\1\3\1\23\1\47\1\25\12\55\1\6\1"+
            "\1\1\17\1\7\1\16\2\63\1\57\1\35\1\57\1\33\4\57\1\40\2\57\1\52"+
            "\1\12\1\41\1\57\1\42\2\57\1\51\7\57\1\46\1\63\1\50\1\56\1\57"+
            "\1\24\1\15\1\57\1\20\1\34\1\32\1\37\2\57\1\14\2\57\1\53\1\54"+
            "\1\27\1\5\1\45\2\57\1\2\1\36\1\57\1\4\4\57\1\43\1\30\1\44\uff82"+
            "\63",
            "",
            "\1\65\4\uffff\1\67\1\66",
            "",
            "\1\72",
            "\1\73\1\uffff\1\74",
            "",
            "\1\76",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\105\1\106",
            "\1\110\1\uffff\1\107\1\uffff\1\111",
            "\1\112\62\uffff\1\114\1\uffff\1\113\1\115",
            "\1\117\62\uffff\1\121\1\uffff\1\120\1\122",
            "\1\124\11\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\131\2\uffff\12\134\4\uffff\1\132",
            "",
            "\1\136\4\uffff\1\137",
            "",
            "\1\142",
            "",
            "\1\144",
            "\1\145\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\162\20\uffff\1\161",
            "",
            "\1\164",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\3\uffff\1\171",
            "\12\173",
            "\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\0\174",
            "\0\174",
            "",
            "",
            "",
            "\1\176",
            "\1\u0080\1\177",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u0086",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\1\u008c",
            "",
            "",
            "",
            "",
            "\1\u008e\1\u008f",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
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
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\173",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\6\uffff\1\u00a7",
            "\1\u00a9",
            "\1\u00aa",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\u00ab\1"+
            "\70",
            "",
            "",
            "\1\u00ad",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2\20\uffff\1\u00b1",
            "\1\u00b3",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b5",
            "\1\u00b6",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00d6",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00d8",
            "\1\u00d9",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\u00de\1"+
            "\70",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00e9\16"+
            "\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00fa\6\uffff\1\u00f9",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00fc",
            "",
            "",
            "\1\u00fd",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0105",
            "\1\u0106",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0120",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0127",
            "",
            "",
            "\1\u0128",
            "",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_INTSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( ((LA14_48>='\u0000' && LA14_48<='\uFFFF')) ) {s = 124;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( ((LA14_49>='\u0000' && LA14_49<='\uFFFF')) ) {s = 124;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==';') ) {s = 1;}

                        else if ( (LA14_0=='s') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0=='v') ) {s = 4;}

                        else if ( (LA14_0=='o') ) {s = 5;}

                        else if ( (LA14_0==':') ) {s = 6;}

                        else if ( (LA14_0=='=') ) {s = 7;}

                        else if ( (LA14_0=='(') ) {s = 8;}

                        else if ( (LA14_0==')') ) {s = 9;}

                        else if ( (LA14_0=='M') ) {s = 10;}

                        else if ( (LA14_0=='*') ) {s = 11;}

                        else if ( (LA14_0=='i') ) {s = 12;}

                        else if ( (LA14_0=='a') ) {s = 13;}

                        else if ( (LA14_0=='>') ) {s = 14;}

                        else if ( (LA14_0=='<') ) {s = 15;}

                        else if ( (LA14_0=='c') ) {s = 16;}

                        else if ( (LA14_0=='!') ) {s = 17;}

                        else if ( (LA14_0=='+') ) {s = 18;}

                        else if ( (LA14_0=='-') ) {s = 19;}

                        else if ( (LA14_0=='`') ) {s = 20;}

                        else if ( (LA14_0=='/') ) {s = 21;}

                        else if ( (LA14_0=='%') ) {s = 22;}

                        else if ( (LA14_0=='n') ) {s = 23;}

                        else if ( (LA14_0=='|') ) {s = 24;}

                        else if ( (LA14_0=='#') ) {s = 25;}

                        else if ( (LA14_0=='e') ) {s = 26;}

                        else if ( (LA14_0=='D') ) {s = 27;}

                        else if ( (LA14_0=='d') ) {s = 28;}

                        else if ( (LA14_0=='B') ) {s = 29;}

                        else if ( (LA14_0=='t') ) {s = 30;}

                        else if ( (LA14_0=='f') ) {s = 31;}

                        else if ( (LA14_0=='I') ) {s = 32;}

                        else if ( (LA14_0=='N') ) {s = 33;}

                        else if ( (LA14_0=='P') ) {s = 34;}

                        else if ( (LA14_0=='{') ) {s = 35;}

                        else if ( (LA14_0=='}') ) {s = 36;}

                        else if ( (LA14_0=='p') ) {s = 37;}

                        else if ( (LA14_0=='[') ) {s = 38;}

                        else if ( (LA14_0=='.') ) {s = 39;}

                        else if ( (LA14_0==']') ) {s = 40;}

                        else if ( (LA14_0=='S') ) {s = 41;}

                        else if ( (LA14_0=='L') ) {s = 42;}

                        else if ( (LA14_0=='l') ) {s = 43;}

                        else if ( (LA14_0=='m') ) {s = 44;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 45;}

                        else if ( (LA14_0=='^') ) {s = 46;}

                        else if ( (LA14_0=='A'||LA14_0=='C'||(LA14_0>='E' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='K')||LA14_0=='O'||(LA14_0>='Q' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='q' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 47;}

                        else if ( (LA14_0=='\"') ) {s = 48;}

                        else if ( (LA14_0=='\'') ) {s = 49;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 50;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='$'||LA14_0=='&'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}