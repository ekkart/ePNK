package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.services.HLPNGInscriptionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHLPNGInscriptionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTSTRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'sorts'", "','", "'vars'", "'ops'", "'sortsymbols'", "'opsymbols'", "':'", "'='", "'('", "')'", "'MS'", "'*'", "'or'", "'implies'", "'and'", "'>'", "'>='", "'<'", "'<='", "'contains'", "'<r'", "'<=r'", "'>r'", "'>=r'", "'<p'", "'>p'", "'>=s'", "'>s'", "'<=s'", "'<s'", "'=='", "'!='", "'++'", "'--'", "'`'", "'+'", "'-'", "'**'", "'/'", "'%'", "'not'", "'|'", "'#('", "'all'", "'empty'", "'DOT'", "'dot'", "'BOOL'", "'true'", "'false'", "'INT'", "'NAT'", "'POS'", "'enum'", "'{'", "'}'", "'cyclic'", "'succ'", "'pred'", "'['", "'..'", "']'", "'partition'", "'in'", "'STRING'", "'concatstring'", "'stringlength'", "'substring'", "'LIST'", "'concatlists'", "'appendtolist'", "'listlength'", "'sublist'", "'memberat'", "'makelist'", "'emptylist'", "'->'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_INTSTRING=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalHLPNGInscriptionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHLPNGInscriptionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHLPNGInscriptionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g"; }



     	private HLPNGInscriptionLanguageGrammarAccess grammarAccess;
     	
        public InternalHLPNGInscriptionLanguageParser(TokenStream input, HLPNGInscriptionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected HLPNGInscriptionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:76:1: ruleDocument returns [EObject current=null] : ( ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' ) | ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' ) )* ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:79:28: ( ( ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' ) | ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:1: ( ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' ) | ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' ) )*
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:1: ( ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' ) | ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=15 && LA1_0<=18)) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==21||(LA1_0>=53 && LA1_0<=57)||LA1_0==59||(LA1_0>=61 && LA1_0<=62)||(LA1_0>=70 && LA1_0<=71)||LA1_0==75||(LA1_0>=78 && LA1_0<=80)||(LA1_0>=82 && LA1_0<=88)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:2: ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:2: ( ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:3: ( (lv_declarations_0_0= ruleDeclarations ) ) otherlv_1= ';'
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:80:3: ( (lv_declarations_0_0= ruleDeclarations ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:81:1: (lv_declarations_0_0= ruleDeclarations )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:81:1: (lv_declarations_0_0= ruleDeclarations )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:82:3: lv_declarations_0_0= ruleDeclarations
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getDeclarationsDeclarationsParserRuleCall_0_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarations_in_ruleDocument132);
            	    lv_declarations_0_0=ruleDeclarations();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_0_0, 
            	            		"Declarations");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDocument144); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getSemicolonKeyword_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:103:6: ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:103:6: ( ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:103:7: ( (lv_term_2_0= ruleTerm ) ) otherlv_3= ';'
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:103:7: ( (lv_term_2_0= ruleTerm ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:104:1: (lv_term_2_0= ruleTerm )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:104:1: (lv_term_2_0= ruleTerm )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:105:3: lv_term_2_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getTermTermParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleDocument173);
            	    lv_term_2_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"term",
            	            		lv_term_2_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDocument185); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDocumentAccess().getSemicolonKeyword_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDeclarations"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:133:1: entryRuleDeclarations returns [EObject current=null] : iv_ruleDeclarations= ruleDeclarations EOF ;
    public final EObject entryRuleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarations = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:134:2: (iv_ruleDeclarations= ruleDeclarations EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:135:2: iv_ruleDeclarations= ruleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getDeclarationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclarations_in_entryRuleDeclarations223);
            iv_ruleDeclarations=ruleDeclarations();

            state._fsp--;

             current =iv_ruleDeclarations; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarations233); 

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
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:142:1: ruleDeclarations returns [EObject current=null] : ( () ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )* ) ;
    public final EObject ruleDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_declaration_2_0 = null;

        EObject lv_declaration_4_0 = null;

        EObject lv_declaration_7_0 = null;

        EObject lv_declaration_9_0 = null;

        EObject lv_declaration_12_0 = null;

        EObject lv_declaration_14_0 = null;

        EObject lv_declaration_17_0 = null;

        EObject lv_declaration_19_0 = null;

        EObject lv_declaration_22_0 = null;

        EObject lv_declaration_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:145:28: ( ( () ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:146:1: ( () ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:146:1: ( () ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:146:2: () ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )*
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:146:2: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:147:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeclarationsAccess().getDeclarationsAction_0(),
                        current);
                

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:152:2: ( (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' ) | (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' ) | (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' ) | (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' ) | (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' ) )*
            loop7:
            do {
                int alt7=6;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt7=1;
                    }
                    break;
                case 15:
                    {
                    alt7=2;
                    }
                    break;
                case 16:
                    {
                    alt7=3;
                    }
                    break;
                case 17:
                    {
                    alt7=4;
                    }
                    break;
                case 18:
                    {
                    alt7=5;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:152:3: (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:152:3: (otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:152:5: otherlv_1= 'sorts' ( (lv_declaration_2_0= ruleSortDecl ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )* otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDeclarations281); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDeclarationsAccess().getSortsKeyword_1_0_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:156:1: ( (lv_declaration_2_0= ruleSortDecl ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:157:1: (lv_declaration_2_0= ruleSortDecl )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:157:1: (lv_declaration_2_0= ruleSortDecl )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:158:3: lv_declaration_2_0= ruleSortDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationSortDeclParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSortDecl_in_ruleDeclarations302);
            	    lv_declaration_2_0=ruleSortDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_2_0, 
            	            		"SortDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:174:2: (otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==14) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:174:4: otherlv_3= ',' ( (lv_declaration_4_0= ruleSortDecl ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeclarations315); 

            	    	        	newLeafNode(otherlv_3, grammarAccess.getDeclarationsAccess().getCommaKeyword_1_0_2_0());
            	    	        
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:178:1: ( (lv_declaration_4_0= ruleSortDecl ) )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:179:1: (lv_declaration_4_0= ruleSortDecl )
            	    	    {
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:179:1: (lv_declaration_4_0= ruleSortDecl )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:180:3: lv_declaration_4_0= ruleSortDecl
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationSortDeclParserRuleCall_1_0_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSortDecl_in_ruleDeclarations336);
            	    	    lv_declaration_4_0=ruleSortDecl();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"declaration",
            	    	            		lv_declaration_4_0, 
            	    	            		"SortDecl");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDeclarations350); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_0_3());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:201:6: (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:201:6: (otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:201:8: otherlv_6= 'vars' ( (lv_declaration_7_0= ruleVariableDecl ) ) (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )* otherlv_10= ';'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDeclarations370); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDeclarationsAccess().getVarsKeyword_1_1_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:205:1: ( (lv_declaration_7_0= ruleVariableDecl ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:206:1: (lv_declaration_7_0= ruleVariableDecl )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:206:1: (lv_declaration_7_0= ruleVariableDecl )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:207:3: lv_declaration_7_0= ruleVariableDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationVariableDeclParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleDeclarations391);
            	    lv_declaration_7_0=ruleVariableDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_7_0, 
            	            		"VariableDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:223:2: (otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:223:4: otherlv_8= ',' ( (lv_declaration_9_0= ruleVariableDecl ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeclarations404); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getDeclarationsAccess().getCommaKeyword_1_1_2_0());
            	    	        
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:227:1: ( (lv_declaration_9_0= ruleVariableDecl ) )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:228:1: (lv_declaration_9_0= ruleVariableDecl )
            	    	    {
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:228:1: (lv_declaration_9_0= ruleVariableDecl )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:229:3: lv_declaration_9_0= ruleVariableDecl
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationVariableDeclParserRuleCall_1_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleDeclarations425);
            	    	    lv_declaration_9_0=ruleVariableDecl();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"declaration",
            	    	            		lv_declaration_9_0, 
            	    	            		"VariableDecl");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDeclarations439); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_1_3());
            	        

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:250:6: (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:250:6: (otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:250:8: otherlv_11= 'ops' ( (lv_declaration_12_0= ruleOperatorDecl ) ) (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )* otherlv_15= ';'
            	    {
            	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDeclarations459); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDeclarationsAccess().getOpsKeyword_1_2_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:254:1: ( (lv_declaration_12_0= ruleOperatorDecl ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:255:1: (lv_declaration_12_0= ruleOperatorDecl )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:255:1: (lv_declaration_12_0= ruleOperatorDecl )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:256:3: lv_declaration_12_0= ruleOperatorDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationOperatorDeclParserRuleCall_1_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperatorDecl_in_ruleDeclarations480);
            	    lv_declaration_12_0=ruleOperatorDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_12_0, 
            	            		"OperatorDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:272:2: (otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==14) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:272:4: otherlv_13= ',' ( (lv_declaration_14_0= ruleOperatorDecl ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeclarations493); 

            	    	        	newLeafNode(otherlv_13, grammarAccess.getDeclarationsAccess().getCommaKeyword_1_2_2_0());
            	    	        
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:276:1: ( (lv_declaration_14_0= ruleOperatorDecl ) )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:277:1: (lv_declaration_14_0= ruleOperatorDecl )
            	    	    {
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:277:1: (lv_declaration_14_0= ruleOperatorDecl )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:278:3: lv_declaration_14_0= ruleOperatorDecl
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationOperatorDeclParserRuleCall_1_2_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOperatorDecl_in_ruleDeclarations514);
            	    	    lv_declaration_14_0=ruleOperatorDecl();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"declaration",
            	    	            		lv_declaration_14_0, 
            	    	            		"OperatorDecl");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDeclarations528); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_2_3());
            	        

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:299:6: (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:299:6: (otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:299:8: otherlv_16= 'sortsymbols' ( (lv_declaration_17_0= ruleArbitrarySort ) ) (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )* otherlv_20= ';'
            	    {
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDeclarations548); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDeclarationsAccess().getSortsymbolsKeyword_1_3_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:303:1: ( (lv_declaration_17_0= ruleArbitrarySort ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:304:1: (lv_declaration_17_0= ruleArbitrarySort )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:304:1: (lv_declaration_17_0= ruleArbitrarySort )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:305:3: lv_declaration_17_0= ruleArbitrarySort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationArbitrarySortParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArbitrarySort_in_ruleDeclarations569);
            	    lv_declaration_17_0=ruleArbitrarySort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_17_0, 
            	            		"ArbitrarySort");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:321:2: (otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==14) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:321:4: otherlv_18= ',' ( (lv_declaration_19_0= ruleArbitrarySort ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeclarations582); 

            	    	        	newLeafNode(otherlv_18, grammarAccess.getDeclarationsAccess().getCommaKeyword_1_3_2_0());
            	    	        
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:325:1: ( (lv_declaration_19_0= ruleArbitrarySort ) )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:326:1: (lv_declaration_19_0= ruleArbitrarySort )
            	    	    {
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:326:1: (lv_declaration_19_0= ruleArbitrarySort )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:327:3: lv_declaration_19_0= ruleArbitrarySort
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationArbitrarySortParserRuleCall_1_3_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleArbitrarySort_in_ruleDeclarations603);
            	    	    lv_declaration_19_0=ruleArbitrarySort();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"declaration",
            	    	            		lv_declaration_19_0, 
            	    	            		"ArbitrarySort");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDeclarations617); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_3_3());
            	        

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:348:6: (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:348:6: (otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';' )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:348:8: otherlv_21= 'opsymbols' ( (lv_declaration_22_0= ruleArbitraryOperator ) ) (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )* otherlv_25= ';'
            	    {
            	    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclarations637); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDeclarationsAccess().getOpsymbolsKeyword_1_4_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:352:1: ( (lv_declaration_22_0= ruleArbitraryOperator ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:353:1: (lv_declaration_22_0= ruleArbitraryOperator )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:353:1: (lv_declaration_22_0= ruleArbitraryOperator )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:354:3: lv_declaration_22_0= ruleArbitraryOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationArbitraryOperatorParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArbitraryOperator_in_ruleDeclarations658);
            	    lv_declaration_22_0=ruleArbitraryOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_22_0, 
            	            		"ArbitraryOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:370:2: (otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==14) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:370:4: otherlv_23= ',' ( (lv_declaration_24_0= ruleArbitraryOperator ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeclarations671); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getDeclarationsAccess().getCommaKeyword_1_4_2_0());
            	    	        
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:374:1: ( (lv_declaration_24_0= ruleArbitraryOperator ) )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:375:1: (lv_declaration_24_0= ruleArbitraryOperator )
            	    	    {
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:375:1: (lv_declaration_24_0= ruleArbitraryOperator )
            	    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:376:3: lv_declaration_24_0= ruleArbitraryOperator
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclarationArbitraryOperatorParserRuleCall_1_4_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleArbitraryOperator_in_ruleDeclarations692);
            	    	    lv_declaration_24_0=ruleArbitraryOperator();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"declaration",
            	    	            		lv_declaration_24_0, 
            	    	            		"ArbitraryOperator");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDeclarations706); 

            	        	newLeafNode(otherlv_25, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_4_3());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleSortDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:406:1: entryRuleSortDecl returns [EObject current=null] : iv_ruleSortDecl= ruleSortDecl EOF ;
    public final EObject entryRuleSortDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDecl = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:407:2: (iv_ruleSortDecl= ruleSortDecl EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:408:2: iv_ruleSortDecl= ruleSortDecl EOF
            {
             newCompositeNode(grammarAccess.getSortDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSortDecl_in_entryRuleSortDecl747);
            iv_ruleSortDecl=ruleSortDecl();

            state._fsp--;

             current =iv_ruleSortDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSortDecl757); 

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
    // $ANTLR end "entryRuleSortDecl"


    // $ANTLR start "ruleSortDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:415:1: ruleSortDecl returns [EObject current=null] : (this_NamedSort_0= ruleNamedSort | this_Partition_1= rulePartition ) ;
    public final EObject ruleSortDecl() throws RecognitionException {
        EObject current = null;

        EObject this_NamedSort_0 = null;

        EObject this_Partition_1 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:418:28: ( (this_NamedSort_0= ruleNamedSort | this_Partition_1= rulePartition ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:419:1: (this_NamedSort_0= ruleNamedSort | this_Partition_1= rulePartition )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:419:1: (this_NamedSort_0= ruleNamedSort | this_Partition_1= rulePartition )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==75) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:420:5: this_NamedSort_0= ruleNamedSort
                    {
                     
                            newCompositeNode(grammarAccess.getSortDeclAccess().getNamedSortParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNamedSort_in_ruleSortDecl804);
                    this_NamedSort_0=ruleNamedSort();

                    state._fsp--;

                     
                            current = this_NamedSort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:430:5: this_Partition_1= rulePartition
                    {
                     
                            newCompositeNode(grammarAccess.getSortDeclAccess().getPartitionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePartition_in_ruleSortDecl831);
                    this_Partition_1=rulePartition();

                    state._fsp--;

                     
                            current = this_Partition_1; 
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
    // $ANTLR end "ruleSortDecl"


    // $ANTLR start "entryRuleVariableDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:446:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:447:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:448:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl866);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;

             current =iv_ruleVariableDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDecl876); 

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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:455:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSort ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_sort_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:458:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSort ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:459:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSort ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:459:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSort ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:459:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSort ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:460:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:460:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:461:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableDecl918); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleVariableDecl935); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:481:1: ( (lv_sort_2_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:482:1: (lv_sort_2_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:482:1: (lv_sort_2_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:483:3: lv_sort_2_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclAccess().getSortSortParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleVariableDecl956);
            lv_sort_2_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclRule());
            	        }
                   		set(
                   			current, 
                   			"sort",
                    		lv_sort_2_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleNamedSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:507:1: entryRuleNamedSort returns [EObject current=null] : iv_ruleNamedSort= ruleNamedSort EOF ;
    public final EObject entryRuleNamedSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:508:2: (iv_ruleNamedSort= ruleNamedSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:509:2: iv_ruleNamedSort= ruleNamedSort EOF
            {
             newCompositeNode(grammarAccess.getNamedSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedSort_in_entryRuleNamedSort992);
            iv_ruleNamedSort=ruleNamedSort();

            state._fsp--;

             current =iv_ruleNamedSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedSort1002); 

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
    // $ANTLR end "entryRuleNamedSort"


    // $ANTLR start "ruleNamedSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:516:1: ruleNamedSort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_def_2_0= ruleSort ) ) ) ;
    public final EObject ruleNamedSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:519:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_def_2_0= ruleSort ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:520:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_def_2_0= ruleSort ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:520:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_def_2_0= ruleSort ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:520:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_def_2_0= ruleSort ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:520:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:521:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:521:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:522:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedSort1044); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedSortAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedSortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedSort1061); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedSortAccess().getEqualsSignKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:542:1: ( (lv_def_2_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:543:1: (lv_def_2_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:543:1: (lv_def_2_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:544:3: lv_def_2_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getNamedSortAccess().getDefSortParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleNamedSort1082);
            lv_def_2_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedSortRule());
            	        }
                   		set(
                   			current, 
                   			"def",
                    		lv_def_2_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNamedSort"


    // $ANTLR start "entryRuleOperatorDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:568:1: entryRuleOperatorDecl returns [EObject current=null] : iv_ruleOperatorDecl= ruleOperatorDecl EOF ;
    public final EObject entryRuleOperatorDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDecl = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:569:2: (iv_ruleOperatorDecl= ruleOperatorDecl EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:570:2: iv_ruleOperatorDecl= ruleOperatorDecl EOF
            {
             newCompositeNode(grammarAccess.getOperatorDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperatorDecl_in_entryRuleOperatorDecl1118);
            iv_ruleOperatorDecl=ruleOperatorDecl();

            state._fsp--;

             current =iv_ruleOperatorDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperatorDecl1128); 

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
    // $ANTLR end "entryRuleOperatorDecl"


    // $ANTLR start "ruleOperatorDecl"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:577:1: ruleOperatorDecl returns [EObject current=null] : this_NamedOperator_0= ruleNamedOperator ;
    public final EObject ruleOperatorDecl() throws RecognitionException {
        EObject current = null;

        EObject this_NamedOperator_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:580:28: (this_NamedOperator_0= ruleNamedOperator )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:582:5: this_NamedOperator_0= ruleNamedOperator
            {
             
                    newCompositeNode(grammarAccess.getOperatorDeclAccess().getNamedOperatorParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamedOperator_in_ruleOperatorDecl1174);
            this_NamedOperator_0=ruleNamedOperator();

            state._fsp--;

             
                    current = this_NamedOperator_0; 
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
    // $ANTLR end "ruleOperatorDecl"


    // $ANTLR start "entryRuleNamedOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:598:1: entryRuleNamedOperator returns [EObject current=null] : iv_ruleNamedOperator= ruleNamedOperator EOF ;
    public final EObject entryRuleNamedOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:599:2: (iv_ruleNamedOperator= ruleNamedOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:600:2: iv_ruleNamedOperator= ruleNamedOperator EOF
            {
             newCompositeNode(grammarAccess.getNamedOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedOperator_in_entryRuleNamedOperator1208);
            iv_ruleNamedOperator=ruleNamedOperator();

            state._fsp--;

             current =iv_ruleNamedOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedOperator1218); 

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
    // $ANTLR end "entryRuleNamedOperator"


    // $ANTLR start "ruleNamedOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:607:1: ruleNamedOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_def_7_0= ruleTerm ) ) ) ;
    public final EObject ruleNamedOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_def_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:610:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_def_7_0= ruleTerm ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_def_7_0= ruleTerm ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_def_7_0= ruleTerm ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:611:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_def_7_0= ruleTerm ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:611:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:612:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:612:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:613:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedOperator1260); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNamedOperator1277); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:633:1: ( ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:633:2: ( (lv_parameters_2_0= ruleVariableDecl ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )*
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:633:2: ( (lv_parameters_2_0= ruleVariableDecl ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:634:1: (lv_parameters_2_0= ruleVariableDecl )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:634:1: (lv_parameters_2_0= ruleVariableDecl )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:635:3: lv_parameters_2_0= ruleVariableDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedOperatorAccess().getParametersVariableDeclParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleNamedOperator1299);
                    lv_parameters_2_0=ruleVariableDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"VariableDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:651:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:651:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNamedOperator1312); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getNamedOperatorAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:655:1: ( (lv_parameters_4_0= ruleVariableDecl ) )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:656:1: (lv_parameters_4_0= ruleVariableDecl )
                    	    {
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:656:1: (lv_parameters_4_0= ruleVariableDecl )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:657:3: lv_parameters_4_0= ruleVariableDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNamedOperatorAccess().getParametersVariableDeclParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleNamedOperator1333);
                    	    lv_parameters_4_0=ruleVariableDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNamedOperatorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_4_0, 
                    	            		"VariableDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNamedOperator1349); 

                	newLeafNode(otherlv_5, grammarAccess.getNamedOperatorAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedOperator1361); 

                	newLeafNode(otherlv_6, grammarAccess.getNamedOperatorAccess().getEqualsSignKeyword_4());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:681:1: ( (lv_def_7_0= ruleTerm ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:682:1: (lv_def_7_0= ruleTerm )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:682:1: (lv_def_7_0= ruleTerm )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:683:3: lv_def_7_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getNamedOperatorAccess().getDefTermParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleNamedOperator1382);
            lv_def_7_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"def",
                    		lv_def_7_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNamedOperator"


    // $ANTLR start "entryRuleSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:707:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:708:2: (iv_ruleSort= ruleSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:709:2: iv_ruleSort= ruleSort EOF
            {
             newCompositeNode(grammarAccess.getSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_entryRuleSort1418);
            iv_ruleSort=ruleSort();

            state._fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSort1428); 

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
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:716:1: ruleSort returns [EObject current=null] : (this_BuiltInSort_0= ruleBuiltInSort | this_MultiSetSort_1= ruleMultiSetSort | this_ProductSort_2= ruleProductSort | this_UserSort_3= ruleUserSort ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInSort_0 = null;

        EObject this_MultiSetSort_1 = null;

        EObject this_ProductSort_2 = null;

        EObject this_UserSort_3 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:719:28: ( (this_BuiltInSort_0= ruleBuiltInSort | this_MultiSetSort_1= ruleMultiSetSort | this_ProductSort_2= ruleProductSort | this_UserSort_3= ruleUserSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:720:1: (this_BuiltInSort_0= ruleBuiltInSort | this_MultiSetSort_1= ruleMultiSetSort | this_ProductSort_2= ruleProductSort | this_UserSort_3= ruleUserSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:720:1: (this_BuiltInSort_0= ruleBuiltInSort | this_MultiSetSort_1= ruleMultiSetSort | this_ProductSort_2= ruleProductSort | this_UserSort_3= ruleUserSort )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 58:
            case 60:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 72:
            case 77:
            case 81:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case RULE_ID:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:721:5: this_BuiltInSort_0= ruleBuiltInSort
                    {
                     
                            newCompositeNode(grammarAccess.getSortAccess().getBuiltInSortParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBuiltInSort_in_ruleSort1475);
                    this_BuiltInSort_0=ruleBuiltInSort();

                    state._fsp--;

                     
                            current = this_BuiltInSort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:731:5: this_MultiSetSort_1= ruleMultiSetSort
                    {
                     
                            newCompositeNode(grammarAccess.getSortAccess().getMultiSetSortParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiSetSort_in_ruleSort1502);
                    this_MultiSetSort_1=ruleMultiSetSort();

                    state._fsp--;

                     
                            current = this_MultiSetSort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:741:5: this_ProductSort_2= ruleProductSort
                    {
                     
                            newCompositeNode(grammarAccess.getSortAccess().getProductSortParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProductSort_in_ruleSort1529);
                    this_ProductSort_2=ruleProductSort();

                    state._fsp--;

                     
                            current = this_ProductSort_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:751:5: this_UserSort_3= ruleUserSort
                    {
                     
                            newCompositeNode(grammarAccess.getSortAccess().getUserSortParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUserSort_in_ruleSort1556);
                    this_UserSort_3=ruleUserSort();

                    state._fsp--;

                     
                            current = this_UserSort_3; 
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
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleMultiSetSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:767:1: entryRuleMultiSetSort returns [EObject current=null] : iv_ruleMultiSetSort= ruleMultiSetSort EOF ;
    public final EObject entryRuleMultiSetSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiSetSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:768:2: (iv_ruleMultiSetSort= ruleMultiSetSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:769:2: iv_ruleMultiSetSort= ruleMultiSetSort EOF
            {
             newCompositeNode(grammarAccess.getMultiSetSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiSetSort_in_entryRuleMultiSetSort1591);
            iv_ruleMultiSetSort=ruleMultiSetSort();

            state._fsp--;

             current =iv_ruleMultiSetSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiSetSort1601); 

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
    // $ANTLR end "entryRuleMultiSetSort"


    // $ANTLR start "ruleMultiSetSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:776:1: ruleMultiSetSort returns [EObject current=null] : (otherlv_0= 'MS' otherlv_1= '(' ( (lv_basis_2_0= ruleSort ) ) otherlv_3= ')' ) ;
    public final EObject ruleMultiSetSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_basis_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:779:28: ( (otherlv_0= 'MS' otherlv_1= '(' ( (lv_basis_2_0= ruleSort ) ) otherlv_3= ')' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:780:1: (otherlv_0= 'MS' otherlv_1= '(' ( (lv_basis_2_0= ruleSort ) ) otherlv_3= ')' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:780:1: (otherlv_0= 'MS' otherlv_1= '(' ( (lv_basis_2_0= ruleSort ) ) otherlv_3= ')' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:780:3: otherlv_0= 'MS' otherlv_1= '(' ( (lv_basis_2_0= ruleSort ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiSetSort1638); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiSetSortAccess().getMSKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultiSetSort1650); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiSetSortAccess().getLeftParenthesisKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:788:1: ( (lv_basis_2_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:789:1: (lv_basis_2_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:789:1: (lv_basis_2_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:790:3: lv_basis_2_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getMultiSetSortAccess().getBasisSortParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleMultiSetSort1671);
            lv_basis_2_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiSetSortRule());
            	        }
                   		set(
                   			current, 
                   			"basis",
                    		lv_basis_2_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiSetSort1683); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiSetSortAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMultiSetSort"


    // $ANTLR start "entryRuleProductSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:818:1: entryRuleProductSort returns [EObject current=null] : iv_ruleProductSort= ruleProductSort EOF ;
    public final EObject entryRuleProductSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:819:2: (iv_ruleProductSort= ruleProductSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:820:2: iv_ruleProductSort= ruleProductSort EOF
            {
             newCompositeNode(grammarAccess.getProductSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductSort_in_entryRuleProductSort1719);
            iv_ruleProductSort=ruleProductSort();

            state._fsp--;

             current =iv_ruleProductSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductSort1729); 

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
    // $ANTLR end "entryRuleProductSort"


    // $ANTLR start "ruleProductSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:827:1: ruleProductSort returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleProductSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elementSort_2_0 = null;

        EObject lv_elementSort_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:830:28: ( (otherlv_0= '(' () ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )? otherlv_5= ')' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:831:1: (otherlv_0= '(' () ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )? otherlv_5= ')' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:831:1: (otherlv_0= '(' () ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )? otherlv_5= ')' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:831:3: otherlv_0= '(' () ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleProductSort1766); 

                	newLeafNode(otherlv_0, grammarAccess.getProductSortAccess().getLeftParenthesisKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:835:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:836:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductSortAccess().getProductSortAction_1(),
                        current);
                

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:841:2: ( ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==21||LA13_0==23||LA13_0==58||LA13_0==60||(LA13_0>=63 && LA13_0<=66)||LA13_0==69||LA13_0==72||LA13_0==77||LA13_0==81) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:841:3: ( (lv_elementSort_2_0= ruleSort ) ) (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )*
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:841:3: ( (lv_elementSort_2_0= ruleSort ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:842:1: (lv_elementSort_2_0= ruleSort )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:842:1: (lv_elementSort_2_0= ruleSort )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:843:3: lv_elementSort_2_0= ruleSort
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductSortAccess().getElementSortSortParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleProductSort1797);
                    lv_elementSort_2_0=ruleSort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductSortRule());
                    	        }
                           		add(
                           			current, 
                           			"elementSort",
                            		lv_elementSort_2_0, 
                            		"Sort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:859:2: (otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==24) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:859:4: otherlv_3= '*' ( (lv_elementSort_4_0= ruleSort ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProductSort1810); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProductSortAccess().getAsteriskKeyword_2_1_0());
                    	        
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:863:1: ( (lv_elementSort_4_0= ruleSort ) )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:864:1: (lv_elementSort_4_0= ruleSort )
                    	    {
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:864:1: (lv_elementSort_4_0= ruleSort )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:865:3: lv_elementSort_4_0= ruleSort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductSortAccess().getElementSortSortParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleProductSort1831);
                    	    lv_elementSort_4_0=ruleSort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProductSortRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elementSort",
                    	            		lv_elementSort_4_0, 
                    	            		"Sort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProductSort1847); 

                	newLeafNode(otherlv_5, grammarAccess.getProductSortAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleProductSort"


    // $ANTLR start "entryRuleUserSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:893:1: entryRuleUserSort returns [EObject current=null] : iv_ruleUserSort= ruleUserSort EOF ;
    public final EObject entryRuleUserSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:894:2: (iv_ruleUserSort= ruleUserSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:895:2: iv_ruleUserSort= ruleUserSort EOF
            {
             newCompositeNode(grammarAccess.getUserSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUserSort_in_entryRuleUserSort1883);
            iv_ruleUserSort=ruleUserSort();

            state._fsp--;

             current =iv_ruleUserSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUserSort1893); 

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
    // $ANTLR end "entryRuleUserSort"


    // $ANTLR start "ruleUserSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:902:1: ruleUserSort returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUserSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:905:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:906:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:906:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:907:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:907:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:908:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUserSort1934); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUserSortAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserSortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleUserSort"


    // $ANTLR start "entryRuleTerm"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:932:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:933:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:934:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm1974);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm1984); 

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
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:941:1: ruleTerm returns [EObject current=null] : this_Term1_0= ruleTerm1 ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Term1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:944:28: (this_Term1_0= ruleTerm1 )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:946:5: this_Term1_0= ruleTerm1
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getTerm1ParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm1_in_ruleTerm2030);
            this_Term1_0=ruleTerm1();

            state._fsp--;

             
                    current = this_Term1_0; 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTerm1"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:962:1: entryRuleTerm1 returns [EObject current=null] : iv_ruleTerm1= ruleTerm1 EOF ;
    public final EObject entryRuleTerm1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm1 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:963:2: (iv_ruleTerm1= ruleTerm1 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:964:2: iv_ruleTerm1= ruleTerm1 EOF
            {
             newCompositeNode(grammarAccess.getTerm1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm1_in_entryRuleTerm12064);
            iv_ruleTerm1=ruleTerm1();

            state._fsp--;

             current =iv_ruleTerm1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm12074); 

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
    // $ANTLR end "entryRuleTerm1"


    // $ANTLR start "ruleTerm1"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:971:1: ruleTerm1 returns [EObject current=null] : (this_Term2_0= ruleTerm2 ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )* ) ;
    public final EObject ruleTerm1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term2_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:974:28: ( (this_Term2_0= ruleTerm2 ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:975:1: (this_Term2_0= ruleTerm2 ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:975:1: (this_Term2_0= ruleTerm2 ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:976:5: this_Term2_0= ruleTerm2 ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm1Access().getTerm2ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm2_in_ruleTerm12121);
            this_Term2_0=ruleTerm2();

            state._fsp--;

             
                    current = this_Term2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:984:1: ( ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) ) | ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }
                else if ( (LA14_0==26) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:984:2: ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:984:2: ( () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:984:3: () otherlv_2= 'or' ( (lv_subterm_3_0= ruleTerm2 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:984:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:985:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm1Access().getOrSubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTerm12143); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm1Access().getOrKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:994:1: ( (lv_subterm_3_0= ruleTerm2 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:995:1: (lv_subterm_3_0= ruleTerm2 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:995:1: (lv_subterm_3_0= ruleTerm2 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:996:3: lv_subterm_3_0= ruleTerm2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm1Access().getSubtermTerm2ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm2_in_ruleTerm12164);
            	    lv_subterm_3_0=ruleTerm2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1013:6: ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1013:6: ( () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1013:7: () otherlv_5= 'implies' ( (lv_subterm_6_0= ruleTerm2 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1013:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1014:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm1Access().getImplySubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTerm12193); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm1Access().getImpliesKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1023:1: ( (lv_subterm_6_0= ruleTerm2 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1024:1: (lv_subterm_6_0= ruleTerm2 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1024:1: (lv_subterm_6_0= ruleTerm2 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1025:3: lv_subterm_6_0= ruleTerm2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm1Access().getSubtermTerm2ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm2_in_ruleTerm12214);
            	    lv_subterm_6_0=ruleTerm2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term2");
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
    // $ANTLR end "ruleTerm1"


    // $ANTLR start "entryRuleTerm2"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1049:1: entryRuleTerm2 returns [EObject current=null] : iv_ruleTerm2= ruleTerm2 EOF ;
    public final EObject entryRuleTerm2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm2 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1050:2: (iv_ruleTerm2= ruleTerm2 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1051:2: iv_ruleTerm2= ruleTerm2 EOF
            {
             newCompositeNode(grammarAccess.getTerm2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm2_in_entryRuleTerm22253);
            iv_ruleTerm2=ruleTerm2();

            state._fsp--;

             current =iv_ruleTerm2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm22263); 

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
    // $ANTLR end "entryRuleTerm2"


    // $ANTLR start "ruleTerm2"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1058:1: ruleTerm2 returns [EObject current=null] : (this_Term3_0= ruleTerm3 ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )* ) ;
    public final EObject ruleTerm2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Term3_0 = null;

        EObject lv_subterm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1061:28: ( (this_Term3_0= ruleTerm3 ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1062:1: (this_Term3_0= ruleTerm3 ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1062:1: (this_Term3_0= ruleTerm3 ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1063:5: this_Term3_0= ruleTerm3 ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm2Access().getTerm3ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm3_in_ruleTerm22310);
            this_Term3_0=ruleTerm3();

            state._fsp--;

             
                    current = this_Term3_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1071:1: ( () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1071:2: () otherlv_2= 'and' ( (lv_subterm_3_0= ruleTerm3 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1071:2: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1072:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm2Access().getAndSubtermAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTerm22331); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm2Access().getAndKeyword_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1081:1: ( (lv_subterm_3_0= ruleTerm3 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1082:1: (lv_subterm_3_0= ruleTerm3 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1082:1: (lv_subterm_3_0= ruleTerm3 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1083:3: lv_subterm_3_0= ruleTerm3
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm2Access().getSubtermTerm3ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm3_in_ruleTerm22352);
            	    lv_subterm_3_0=ruleTerm3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term3");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleTerm2"


    // $ANTLR start "entryRuleTerm3"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1107:1: entryRuleTerm3 returns [EObject current=null] : iv_ruleTerm3= ruleTerm3 EOF ;
    public final EObject entryRuleTerm3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm3 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1108:2: (iv_ruleTerm3= ruleTerm3 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1109:2: iv_ruleTerm3= ruleTerm3 EOF
            {
             newCompositeNode(grammarAccess.getTerm3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm3_in_entryRuleTerm32390);
            iv_ruleTerm3=ruleTerm3();

            state._fsp--;

             current =iv_ruleTerm3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm32400); 

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
    // $ANTLR end "entryRuleTerm3"


    // $ANTLR start "ruleTerm3"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1116:1: ruleTerm3 returns [EObject current=null] : (this_Term4_0= ruleTerm4 ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )* ) ;
    public final EObject ruleTerm3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_35=null;
        Token otherlv_38=null;
        Token otherlv_41=null;
        Token otherlv_44=null;
        EObject this_Term4_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;

        EObject lv_subterm_9_0 = null;

        EObject lv_subterm_12_0 = null;

        EObject lv_subterm_15_0 = null;

        EObject lv_subterm_18_0 = null;

        EObject lv_subterm_21_0 = null;

        EObject lv_subterm_24_0 = null;

        EObject lv_subterm_27_0 = null;

        EObject lv_subterm_30_0 = null;

        EObject lv_subterm_33_0 = null;

        EObject lv_subterm_36_0 = null;

        EObject lv_subterm_39_0 = null;

        EObject lv_subterm_42_0 = null;

        EObject lv_subterm_45_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1119:28: ( (this_Term4_0= ruleTerm4 ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1120:1: (this_Term4_0= ruleTerm4 ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1120:1: (this_Term4_0= ruleTerm4 ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1121:5: this_Term4_0= ruleTerm4 ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm3Access().getTerm4ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32447);
            this_Term4_0=ruleTerm4();

            state._fsp--;

             
                    current = this_Term4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1129:1: ( ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) ) | ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) ) | ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) ) | ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) ) | ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) ) | ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) ) | ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) ) | ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) ) | ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) ) | ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) ) | ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) ) | ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) ) | ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) ) | ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) ) | ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) ) )*
            loop16:
            do {
                int alt16=16;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt16=1;
                    }
                    break;
                case 29:
                    {
                    alt16=2;
                    }
                    break;
                case 30:
                    {
                    alt16=3;
                    }
                    break;
                case 31:
                    {
                    alt16=4;
                    }
                    break;
                case 32:
                    {
                    alt16=5;
                    }
                    break;
                case 33:
                    {
                    alt16=6;
                    }
                    break;
                case 34:
                    {
                    alt16=7;
                    }
                    break;
                case 35:
                    {
                    alt16=8;
                    }
                    break;
                case 36:
                    {
                    alt16=9;
                    }
                    break;
                case 37:
                    {
                    alt16=10;
                    }
                    break;
                case 38:
                    {
                    alt16=11;
                    }
                    break;
                case 39:
                    {
                    alt16=12;
                    }
                    break;
                case 40:
                    {
                    alt16=13;
                    }
                    break;
                case 41:
                    {
                    alt16=14;
                    }
                    break;
                case 42:
                    {
                    alt16=15;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1129:2: ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1129:2: ( () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1129:3: () otherlv_2= '>' ( (lv_subterm_3_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1129:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1130:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanSubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTerm32469); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm3Access().getGreaterThanSignKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1139:1: ( (lv_subterm_3_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1140:1: (lv_subterm_3_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1140:1: (lv_subterm_3_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1141:3: lv_subterm_3_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32490);
            	    lv_subterm_3_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1158:6: ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1158:6: ( () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1158:7: () otherlv_5= '>=' ( (lv_subterm_6_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1158:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1159:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanOrEqualSubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerm32519); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm3Access().getGreaterThanSignEqualsSignKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1168:1: ( (lv_subterm_6_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1169:1: (lv_subterm_6_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1169:1: (lv_subterm_6_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1170:3: lv_subterm_6_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32540);
            	    lv_subterm_6_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1187:6: ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1187:6: ( () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1187:7: () otherlv_8= '<' ( (lv_subterm_9_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1187:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1188:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanSubtermAction_1_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTerm32569); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTerm3Access().getLessThanSignKeyword_1_2_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1197:1: ( (lv_subterm_9_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1198:1: (lv_subterm_9_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1198:1: (lv_subterm_9_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1199:3: lv_subterm_9_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32590);
            	    lv_subterm_9_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_9_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1216:6: ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1216:6: ( () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1216:7: () otherlv_11= '<=' ( (lv_subterm_12_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1216:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1217:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanOrEqualSubtermAction_1_3_0(),
            	                current);
            	        

            	    }

            	    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTerm32619); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTerm3Access().getLessThanSignEqualsSignKeyword_1_3_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1226:1: ( (lv_subterm_12_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1227:1: (lv_subterm_12_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1227:1: (lv_subterm_12_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1228:3: lv_subterm_12_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32640);
            	    lv_subterm_12_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_12_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1245:6: ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1245:6: ( () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1245:7: () otherlv_14= 'contains' ( (lv_subterm_15_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1245:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1246:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getContainsSubtermAction_1_4_0(),
            	                current);
            	        

            	    }

            	    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTerm32669); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTerm3Access().getContainsKeyword_1_4_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1255:1: ( (lv_subterm_15_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1256:1: (lv_subterm_15_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1256:1: (lv_subterm_15_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1257:3: lv_subterm_15_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32690);
            	    lv_subterm_15_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_15_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1274:6: ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1274:6: ( () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1274:7: () otherlv_17= '<r' ( (lv_subterm_18_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1274:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1275:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanSubtermAction_1_5_0(),
            	                current);
            	        

            	    }

            	    otherlv_17=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTerm32719); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTerm3Access().getRKeyword_1_5_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1284:1: ( (lv_subterm_18_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1285:1: (lv_subterm_18_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1285:1: (lv_subterm_18_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1286:3: lv_subterm_18_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32740);
            	    lv_subterm_18_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_18_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1303:6: ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1303:6: ( () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1303:7: () otherlv_20= '<=r' ( (lv_subterm_21_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1303:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1304:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanOrEqualSubtermAction_1_6_0(),
            	                current);
            	        

            	    }

            	    otherlv_20=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTerm32769); 

            	        	newLeafNode(otherlv_20, grammarAccess.getTerm3Access().getRKeyword_1_6_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1313:1: ( (lv_subterm_21_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1314:1: (lv_subterm_21_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1314:1: (lv_subterm_21_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1315:3: lv_subterm_21_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32790);
            	    lv_subterm_21_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_21_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1332:6: ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1332:6: ( () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1332:7: () otherlv_23= '>r' ( (lv_subterm_24_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1332:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1333:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanSubtermAction_1_7_0(),
            	                current);
            	        

            	    }

            	    otherlv_23=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTerm32819); 

            	        	newLeafNode(otherlv_23, grammarAccess.getTerm3Access().getRKeyword_1_7_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1342:1: ( (lv_subterm_24_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1343:1: (lv_subterm_24_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1343:1: (lv_subterm_24_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1344:3: lv_subterm_24_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_7_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32840);
            	    lv_subterm_24_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_24_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1361:6: ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1361:6: ( () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1361:7: () otherlv_26= '>=r' ( (lv_subterm_27_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1361:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1362:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanOrEqualSubtermAction_1_8_0(),
            	                current);
            	        

            	    }

            	    otherlv_26=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTerm32869); 

            	        	newLeafNode(otherlv_26, grammarAccess.getTerm3Access().getRKeyword_1_8_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1371:1: ( (lv_subterm_27_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1372:1: (lv_subterm_27_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1372:1: (lv_subterm_27_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1373:3: lv_subterm_27_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_8_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32890);
            	    lv_subterm_27_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_27_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1390:6: ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1390:6: ( () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1390:7: () otherlv_29= '<p' ( (lv_subterm_30_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1390:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1391:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanSubtermAction_1_9_0(),
            	                current);
            	        

            	    }

            	    otherlv_29=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTerm32919); 

            	        	newLeafNode(otherlv_29, grammarAccess.getTerm3Access().getPKeyword_1_9_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1400:1: ( (lv_subterm_30_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1401:1: (lv_subterm_30_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1401:1: (lv_subterm_30_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1402:3: lv_subterm_30_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_9_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32940);
            	    lv_subterm_30_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_30_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1419:6: ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1419:6: ( () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1419:7: () otherlv_32= '>p' ( (lv_subterm_33_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1419:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1420:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanSubtermAction_1_10_0(),
            	                current);
            	        

            	    }

            	    otherlv_32=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTerm32969); 

            	        	newLeafNode(otherlv_32, grammarAccess.getTerm3Access().getPKeyword_1_10_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1429:1: ( (lv_subterm_33_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1430:1: (lv_subterm_33_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1430:1: (lv_subterm_33_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1431:3: lv_subterm_33_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_10_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm32990);
            	    lv_subterm_33_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_33_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1448:6: ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1448:6: ( () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1448:7: () otherlv_35= '>=s' ( (lv_subterm_36_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1448:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1449:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanOrEqualSubtermAction_1_11_0(),
            	                current);
            	        

            	    }

            	    otherlv_35=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTerm33019); 

            	        	newLeafNode(otherlv_35, grammarAccess.getTerm3Access().getSKeyword_1_11_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1458:1: ( (lv_subterm_36_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1459:1: (lv_subterm_36_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1459:1: (lv_subterm_36_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1460:3: lv_subterm_36_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_11_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm33040);
            	    lv_subterm_36_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_36_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1477:6: ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1477:6: ( () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1477:7: () otherlv_38= '>s' ( (lv_subterm_39_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1477:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1478:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getGreaterThanSubtermAction_1_12_0(),
            	                current);
            	        

            	    }

            	    otherlv_38=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTerm33069); 

            	        	newLeafNode(otherlv_38, grammarAccess.getTerm3Access().getSKeyword_1_12_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1487:1: ( (lv_subterm_39_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1488:1: (lv_subterm_39_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1488:1: (lv_subterm_39_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1489:3: lv_subterm_39_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_12_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm33090);
            	    lv_subterm_39_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_39_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1506:6: ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1506:6: ( () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1506:7: () otherlv_41= '<=s' ( (lv_subterm_42_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1506:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1507:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanOrEqualSubtermAction_1_13_0(),
            	                current);
            	        

            	    }

            	    otherlv_41=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTerm33119); 

            	        	newLeafNode(otherlv_41, grammarAccess.getTerm3Access().getSKeyword_1_13_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1516:1: ( (lv_subterm_42_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1517:1: (lv_subterm_42_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1517:1: (lv_subterm_42_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1518:3: lv_subterm_42_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_13_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm33140);
            	    lv_subterm_42_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_42_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1535:6: ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1535:6: ( () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1535:7: () otherlv_44= '<s' ( (lv_subterm_45_0= ruleTerm4 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1535:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1536:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm3Access().getLessThanSubtermAction_1_14_0(),
            	                current);
            	        

            	    }

            	    otherlv_44=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTerm33169); 

            	        	newLeafNode(otherlv_44, grammarAccess.getTerm3Access().getSKeyword_1_14_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1545:1: ( (lv_subterm_45_0= ruleTerm4 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1546:1: (lv_subterm_45_0= ruleTerm4 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1546:1: (lv_subterm_45_0= ruleTerm4 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1547:3: lv_subterm_45_0= ruleTerm4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm3Access().getSubtermTerm4ParserRuleCall_1_14_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_ruleTerm33190);
            	    lv_subterm_45_0=ruleTerm4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_45_0, 
            	            		"Term4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleTerm3"


    // $ANTLR start "entryRuleTerm4"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1571:1: entryRuleTerm4 returns [EObject current=null] : iv_ruleTerm4= ruleTerm4 EOF ;
    public final EObject entryRuleTerm4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm4 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1572:2: (iv_ruleTerm4= ruleTerm4 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1573:2: iv_ruleTerm4= ruleTerm4 EOF
            {
             newCompositeNode(grammarAccess.getTerm4Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm4_in_entryRuleTerm43229);
            iv_ruleTerm4=ruleTerm4();

            state._fsp--;

             current =iv_ruleTerm4; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm43239); 

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
    // $ANTLR end "entryRuleTerm4"


    // $ANTLR start "ruleTerm4"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1580:1: ruleTerm4 returns [EObject current=null] : (this_Term5_0= ruleTerm5 ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )* ) ;
    public final EObject ruleTerm4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term5_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1583:28: ( (this_Term5_0= ruleTerm5 ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1584:1: (this_Term5_0= ruleTerm5 ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1584:1: (this_Term5_0= ruleTerm5 ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1585:5: this_Term5_0= ruleTerm5 ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm4Access().getTerm5ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm5_in_ruleTerm43286);
            this_Term5_0=ruleTerm5();

            state._fsp--;

             
                    current = this_Term5_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1593:1: ( ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) ) | ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }
                else if ( (LA17_0==44) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1593:2: ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1593:2: ( () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1593:3: () otherlv_2= '==' ( (lv_subterm_3_0= ruleTerm5 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1593:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1594:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm4Access().getEqualitySubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTerm43308); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm4Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1603:1: ( (lv_subterm_3_0= ruleTerm5 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1604:1: (lv_subterm_3_0= ruleTerm5 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1604:1: (lv_subterm_3_0= ruleTerm5 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1605:3: lv_subterm_3_0= ruleTerm5
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm4Access().getSubtermTerm5ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm5_in_ruleTerm43329);
            	    lv_subterm_3_0=ruleTerm5();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm4Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term5");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1622:6: ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1622:6: ( () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1622:7: () otherlv_5= '!=' ( (lv_subterm_6_0= ruleTerm5 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1622:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1623:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm4Access().getInequalitySubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTerm43358); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm4Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1632:1: ( (lv_subterm_6_0= ruleTerm5 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1633:1: (lv_subterm_6_0= ruleTerm5 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1633:1: (lv_subterm_6_0= ruleTerm5 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1634:3: lv_subterm_6_0= ruleTerm5
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm4Access().getSubtermTerm5ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm5_in_ruleTerm43379);
            	    lv_subterm_6_0=ruleTerm5();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm4Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term5");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleTerm4"


    // $ANTLR start "entryRuleTerm5"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1658:1: entryRuleTerm5 returns [EObject current=null] : iv_ruleTerm5= ruleTerm5 EOF ;
    public final EObject entryRuleTerm5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm5 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1659:2: (iv_ruleTerm5= ruleTerm5 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1660:2: iv_ruleTerm5= ruleTerm5 EOF
            {
             newCompositeNode(grammarAccess.getTerm5Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm5_in_entryRuleTerm53418);
            iv_ruleTerm5=ruleTerm5();

            state._fsp--;

             current =iv_ruleTerm5; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm53428); 

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
    // $ANTLR end "entryRuleTerm5"


    // $ANTLR start "ruleTerm5"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1667:1: ruleTerm5 returns [EObject current=null] : (this_Term6_0= ruleTerm6 ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )* ) ;
    public final EObject ruleTerm5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term6_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1670:28: ( (this_Term6_0= ruleTerm6 ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1671:1: (this_Term6_0= ruleTerm6 ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1671:1: (this_Term6_0= ruleTerm6 ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1672:5: this_Term6_0= ruleTerm6 ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm5Access().getTerm6ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm6_in_ruleTerm53475);
            this_Term6_0=ruleTerm6();

            state._fsp--;

             
                    current = this_Term6_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1680:1: ( ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) ) | ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }
                else if ( (LA18_0==46) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1680:2: ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1680:2: ( () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1680:3: () otherlv_2= '++' ( (lv_subterm_3_0= ruleTerm6 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1680:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1681:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm5Access().getAddSubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTerm53497); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm5Access().getPlusSignPlusSignKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1690:1: ( (lv_subterm_3_0= ruleTerm6 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1691:1: (lv_subterm_3_0= ruleTerm6 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1691:1: (lv_subterm_3_0= ruleTerm6 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1692:3: lv_subterm_3_0= ruleTerm6
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm5Access().getSubtermTerm6ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm6_in_ruleTerm53518);
            	    lv_subterm_3_0=ruleTerm6();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm5Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term6");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1709:6: ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1709:6: ( () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1709:7: () otherlv_5= '--' ( (lv_subterm_6_0= ruleTerm6 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1709:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1710:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm5Access().getSubtractSubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTerm53547); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm5Access().getHyphenMinusHyphenMinusKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1719:1: ( (lv_subterm_6_0= ruleTerm6 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1720:1: (lv_subterm_6_0= ruleTerm6 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1720:1: (lv_subterm_6_0= ruleTerm6 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1721:3: lv_subterm_6_0= ruleTerm6
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm5Access().getSubtermTerm6ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm6_in_ruleTerm53568);
            	    lv_subterm_6_0=ruleTerm6();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm5Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term6");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleTerm5"


    // $ANTLR start "entryRuleTerm6"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1745:1: entryRuleTerm6 returns [EObject current=null] : iv_ruleTerm6= ruleTerm6 EOF ;
    public final EObject entryRuleTerm6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm6 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1746:2: (iv_ruleTerm6= ruleTerm6 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1747:2: iv_ruleTerm6= ruleTerm6 EOF
            {
             newCompositeNode(grammarAccess.getTerm6Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm6_in_entryRuleTerm63607);
            iv_ruleTerm6=ruleTerm6();

            state._fsp--;

             current =iv_ruleTerm6; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm63617); 

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
    // $ANTLR end "entryRuleTerm6"


    // $ANTLR start "ruleTerm6"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1754:1: ruleTerm6 returns [EObject current=null] : (this_Term7_0= ruleTerm7 ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )* ) ;
    public final EObject ruleTerm6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Term7_0 = null;

        EObject lv_subterm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1757:28: ( (this_Term7_0= ruleTerm7 ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1758:1: (this_Term7_0= ruleTerm7 ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1758:1: (this_Term7_0= ruleTerm7 ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1759:5: this_Term7_0= ruleTerm7 ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm6Access().getTerm7ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm7_in_ruleTerm63664);
            this_Term7_0=ruleTerm7();

            state._fsp--;

             
                    current = this_Term7_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1767:1: ( () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1767:2: () otherlv_2= '`' ( (lv_subterm_3_0= ruleTerm7 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1767:2: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1768:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm6Access().getNumberOfSubtermAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTerm63685); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm6Access().getGraveAccentKeyword_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1777:1: ( (lv_subterm_3_0= ruleTerm7 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1778:1: (lv_subterm_3_0= ruleTerm7 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1778:1: (lv_subterm_3_0= ruleTerm7 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1779:3: lv_subterm_3_0= ruleTerm7
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm6Access().getSubtermTerm7ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm7_in_ruleTerm63706);
            	    lv_subterm_3_0=ruleTerm7();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm6Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term7");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleTerm6"


    // $ANTLR start "entryRuleTerm7"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1803:1: entryRuleTerm7 returns [EObject current=null] : iv_ruleTerm7= ruleTerm7 EOF ;
    public final EObject entryRuleTerm7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm7 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1804:2: (iv_ruleTerm7= ruleTerm7 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1805:2: iv_ruleTerm7= ruleTerm7 EOF
            {
             newCompositeNode(grammarAccess.getTerm7Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm7_in_entryRuleTerm73744);
            iv_ruleTerm7=ruleTerm7();

            state._fsp--;

             current =iv_ruleTerm7; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm73754); 

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
    // $ANTLR end "entryRuleTerm7"


    // $ANTLR start "ruleTerm7"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1812:1: ruleTerm7 returns [EObject current=null] : (this_Term8_0= ruleTerm8 ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )* ) ;
    public final EObject ruleTerm7() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term8_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1815:28: ( (this_Term8_0= ruleTerm8 ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1816:1: (this_Term8_0= ruleTerm8 ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1816:1: (this_Term8_0= ruleTerm8 ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1817:5: this_Term8_0= ruleTerm8 ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm7Access().getTerm8ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm8_in_ruleTerm73801);
            this_Term8_0=ruleTerm8();

            state._fsp--;

             
                    current = this_Term8_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1825:1: ( ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) ) | ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }
                else if ( (LA20_0==49) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1825:2: ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1825:2: ( () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1825:3: () otherlv_2= '+' ( (lv_subterm_3_0= ruleTerm8 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1825:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1826:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm7Access().getAdditionSubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTerm73823); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm7Access().getPlusSignKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1835:1: ( (lv_subterm_3_0= ruleTerm8 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1836:1: (lv_subterm_3_0= ruleTerm8 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1836:1: (lv_subterm_3_0= ruleTerm8 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1837:3: lv_subterm_3_0= ruleTerm8
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm7Access().getSubtermTerm8ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm8_in_ruleTerm73844);
            	    lv_subterm_3_0=ruleTerm8();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm7Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term8");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1854:6: ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1854:6: ( () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1854:7: () otherlv_5= '-' ( (lv_subterm_6_0= ruleTerm8 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1854:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1855:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm7Access().getSubtractionSubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTerm73873); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm7Access().getHyphenMinusKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1864:1: ( (lv_subterm_6_0= ruleTerm8 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1865:1: (lv_subterm_6_0= ruleTerm8 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1865:1: (lv_subterm_6_0= ruleTerm8 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1866:3: lv_subterm_6_0= ruleTerm8
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm7Access().getSubtermTerm8ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm8_in_ruleTerm73894);
            	    lv_subterm_6_0=ruleTerm8();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm7Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term8");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleTerm7"


    // $ANTLR start "entryRuleTerm8"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1890:1: entryRuleTerm8 returns [EObject current=null] : iv_ruleTerm8= ruleTerm8 EOF ;
    public final EObject entryRuleTerm8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm8 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1891:2: (iv_ruleTerm8= ruleTerm8 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1892:2: iv_ruleTerm8= ruleTerm8 EOF
            {
             newCompositeNode(grammarAccess.getTerm8Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm8_in_entryRuleTerm83933);
            iv_ruleTerm8=ruleTerm8();

            state._fsp--;

             current =iv_ruleTerm8; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm83943); 

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
    // $ANTLR end "entryRuleTerm8"


    // $ANTLR start "ruleTerm8"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1899:1: ruleTerm8 returns [EObject current=null] : (this_Term9_0= ruleTerm9 ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )* ) ;
    public final EObject ruleTerm8() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Term9_0 = null;

        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_6_0 = null;

        EObject lv_subterm_9_0 = null;

        EObject lv_subterm_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1902:28: ( (this_Term9_0= ruleTerm9 ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1903:1: (this_Term9_0= ruleTerm9 ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1903:1: (this_Term9_0= ruleTerm9 ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1904:5: this_Term9_0= ruleTerm9 ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTerm8Access().getTerm9ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm83990);
            this_Term9_0=ruleTerm9();

            state._fsp--;

             
                    current = this_Term9_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1912:1: ( ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) ) | ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) ) | ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) ) | ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) ) )*
            loop21:
            do {
                int alt21=5;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt21=1;
                    }
                    break;
                case 50:
                    {
                    alt21=2;
                    }
                    break;
                case 51:
                    {
                    alt21=3;
                    }
                    break;
                case 52:
                    {
                    alt21=4;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1912:2: ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1912:2: ( () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1912:3: () otherlv_2= '*' ( (lv_subterm_3_0= ruleTerm9 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1912:3: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1913:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm8Access().getMultiplicationSubtermAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerm84012); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTerm8Access().getAsteriskKeyword_1_0_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1922:1: ( (lv_subterm_3_0= ruleTerm9 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1923:1: (lv_subterm_3_0= ruleTerm9 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1923:1: (lv_subterm_3_0= ruleTerm9 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1924:3: lv_subterm_3_0= ruleTerm9
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm8Access().getSubtermTerm9ParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm84033);
            	    lv_subterm_3_0=ruleTerm9();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm8Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_3_0, 
            	            		"Term9");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1941:6: ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1941:6: ( () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1941:7: () otherlv_5= '**' ( (lv_subterm_6_0= ruleTerm9 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1941:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1942:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm8Access().getScalarProductSubtermAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTerm84062); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTerm8Access().getAsteriskAsteriskKeyword_1_1_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1951:1: ( (lv_subterm_6_0= ruleTerm9 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1952:1: (lv_subterm_6_0= ruleTerm9 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1952:1: (lv_subterm_6_0= ruleTerm9 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1953:3: lv_subterm_6_0= ruleTerm9
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm8Access().getSubtermTerm9ParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm84083);
            	    lv_subterm_6_0=ruleTerm9();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm8Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_6_0, 
            	            		"Term9");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1970:6: ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1970:6: ( () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1970:7: () otherlv_8= '/' ( (lv_subterm_9_0= ruleTerm9 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1970:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1971:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm8Access().getDivisionSubtermAction_1_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTerm84112); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTerm8Access().getSolidusKeyword_1_2_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1980:1: ( (lv_subterm_9_0= ruleTerm9 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1981:1: (lv_subterm_9_0= ruleTerm9 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1981:1: (lv_subterm_9_0= ruleTerm9 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1982:3: lv_subterm_9_0= ruleTerm9
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm8Access().getSubtermTerm9ParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm84133);
            	    lv_subterm_9_0=ruleTerm9();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm8Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_9_0, 
            	            		"Term9");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1999:6: ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1999:6: ( () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1999:7: () otherlv_11= '%' ( (lv_subterm_12_0= ruleTerm9 ) )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:1999:7: ()
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2000:5: 
            	    {

            	            current = forceCreateModelElementAndAdd(
            	                grammarAccess.getTerm8Access().getModuloSubtermAction_1_3_0(),
            	                current);
            	        

            	    }

            	    otherlv_11=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTerm84162); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTerm8Access().getPercentSignKeyword_1_3_1());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2009:1: ( (lv_subterm_12_0= ruleTerm9 ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2010:1: (lv_subterm_12_0= ruleTerm9 )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2010:1: (lv_subterm_12_0= ruleTerm9 )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2011:3: lv_subterm_12_0= ruleTerm9
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTerm8Access().getSubtermTerm9ParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm84183);
            	    lv_subterm_12_0=ruleTerm9();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTerm8Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subterm",
            	            		lv_subterm_12_0, 
            	            		"Term9");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleTerm8"


    // $ANTLR start "entryRuleTerm9"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2035:1: entryRuleTerm9 returns [EObject current=null] : iv_ruleTerm9= ruleTerm9 EOF ;
    public final EObject entryRuleTerm9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm9 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2036:2: (iv_ruleTerm9= ruleTerm9 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2037:2: iv_ruleTerm9= ruleTerm9 EOF
            {
             newCompositeNode(grammarAccess.getTerm9Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_entryRuleTerm94222);
            iv_ruleTerm9=ruleTerm9();

            state._fsp--;

             current =iv_ruleTerm9; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm94232); 

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
    // $ANTLR end "entryRuleTerm9"


    // $ANTLR start "ruleTerm9"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2044:1: ruleTerm9 returns [EObject current=null] : ( (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) ) | this_Term10_3= ruleTerm10 ) ;
    public final EObject ruleTerm9() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_subterm_2_0 = null;

        EObject this_Term10_3 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2047:28: ( ( (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) ) | this_Term10_3= ruleTerm10 ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2048:1: ( (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) ) | this_Term10_3= ruleTerm10 )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2048:1: ( (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) ) | this_Term10_3= ruleTerm10 )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==21||(LA22_0>=54 && LA22_0<=57)||LA22_0==59||(LA22_0>=61 && LA22_0<=62)||(LA22_0>=70 && LA22_0<=71)||LA22_0==75||(LA22_0>=78 && LA22_0<=80)||(LA22_0>=82 && LA22_0<=88)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2048:2: (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2048:2: (otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2048:4: otherlv_0= 'not' () ( (lv_subterm_2_0= ruleTerm9 ) )
                    {
                    otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTerm94270); 

                        	newLeafNode(otherlv_0, grammarAccess.getTerm9Access().getNotKeyword_0_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2052:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2053:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerm9Access().getNotAction_0_1(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2058:2: ( (lv_subterm_2_0= ruleTerm9 ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2059:1: (lv_subterm_2_0= ruleTerm9 )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2059:1: (lv_subterm_2_0= ruleTerm9 )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2060:3: lv_subterm_2_0= ruleTerm9
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerm9Access().getSubtermTerm9ParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm9_in_ruleTerm94300);
                    lv_subterm_2_0=ruleTerm9();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerm9Rule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_2_0, 
                            		"Term9");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2078:5: this_Term10_3= ruleTerm10
                    {
                     
                            newCompositeNode(grammarAccess.getTerm9Access().getTerm10ParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTerm10_in_ruleTerm94329);
                    this_Term10_3=ruleTerm10();

                    state._fsp--;

                     
                            current = this_Term10_3; 
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
    // $ANTLR end "ruleTerm9"


    // $ANTLR start "entryRuleTerm10"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2094:1: entryRuleTerm10 returns [EObject current=null] : iv_ruleTerm10= ruleTerm10 EOF ;
    public final EObject entryRuleTerm10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm10 = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2095:2: (iv_ruleTerm10= ruleTerm10 EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2096:2: iv_ruleTerm10= ruleTerm10 EOF
            {
             newCompositeNode(grammarAccess.getTerm10Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm10_in_entryRuleTerm104364);
            iv_ruleTerm10=ruleTerm10();

            state._fsp--;

             current =iv_ruleTerm10; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm104374); 

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
    // $ANTLR end "entryRuleTerm10"


    // $ANTLR start "ruleTerm10"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2103:1: ruleTerm10 returns [EObject current=null] : (this_Variable_0= ruleVariable | this_UserOperator_1= ruleUserOperator | this_OtherBuiltInOperator_2= ruleOtherBuiltInOperator | this_BuiltInConst_3= ruleBuiltInConst | (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) ) ) ;
    public final EObject ruleTerm10() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Variable_0 = null;

        EObject this_UserOperator_1 = null;

        EObject this_OtherBuiltInOperator_2 = null;

        EObject this_BuiltInConst_3 = null;

        EObject this_Term_5 = null;

        EObject lv_subterm_9_0 = null;

        EObject lv_subterm_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2106:28: ( (this_Variable_0= ruleVariable | this_UserOperator_1= ruleUserOperator | this_OtherBuiltInOperator_2= ruleOtherBuiltInOperator | this_BuiltInConst_3= ruleBuiltInConst | (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2107:1: (this_Variable_0= ruleVariable | this_UserOperator_1= ruleUserOperator | this_OtherBuiltInOperator_2= ruleOtherBuiltInOperator | this_BuiltInConst_3= ruleBuiltInConst | (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2107:1: (this_Variable_0= ruleVariable | this_UserOperator_1= ruleUserOperator | this_OtherBuiltInOperator_2= ruleOtherBuiltInOperator | this_BuiltInConst_3= ruleBuiltInConst | (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==21) ) {
                    alt25=2;
                }
                else if ( (LA25_1==EOF||LA25_1==12||LA25_1==14||LA25_1==22||(LA25_1>=24 && LA25_1<=52)||LA25_1==54||LA25_1==68) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
            case 55:
            case 70:
            case 71:
            case 75:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt25=3;
                }
                break;
            case RULE_INTSTRING:
            case RULE_STRING:
            case 56:
            case 57:
            case 59:
            case 61:
            case 62:
            case 88:
                {
                alt25=4;
                }
                break;
            case 21:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2108:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTerm10Access().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleTerm104421);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2118:5: this_UserOperator_1= ruleUserOperator
                    {
                     
                            newCompositeNode(grammarAccess.getTerm10Access().getUserOperatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUserOperator_in_ruleTerm104448);
                    this_UserOperator_1=ruleUserOperator();

                    state._fsp--;

                     
                            current = this_UserOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2128:5: this_OtherBuiltInOperator_2= ruleOtherBuiltInOperator
                    {
                     
                            newCompositeNode(grammarAccess.getTerm10Access().getOtherBuiltInOperatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOtherBuiltInOperator_in_ruleTerm104475);
                    this_OtherBuiltInOperator_2=ruleOtherBuiltInOperator();

                    state._fsp--;

                     
                            current = this_OtherBuiltInOperator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2138:5: this_BuiltInConst_3= ruleBuiltInConst
                    {
                     
                            newCompositeNode(grammarAccess.getTerm10Access().getBuiltInConstParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBuiltInConst_in_ruleTerm104502);
                    this_BuiltInConst_3=ruleBuiltInConst();

                    state._fsp--;

                     
                            current = this_BuiltInConst_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2147:6: (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2147:6: (otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2147:8: otherlv_4= '(' this_Term_5= ruleTerm (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerm104520); 

                        	newLeafNode(otherlv_4, grammarAccess.getTerm10Access().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getTerm10Access().getTermParserRuleCall_4_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleTerm104542);
                    this_Term_5=ruleTerm();

                    state._fsp--;

                     
                            current = this_Term_5; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2160:1: (otherlv_6= ')' | (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==22) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==14) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2160:3: otherlv_6= ')'
                            {
                            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerm104554); 

                                	newLeafNode(otherlv_6, grammarAccess.getTerm10Access().getRightParenthesisKeyword_4_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2165:6: (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' )
                            {
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2165:6: (otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')' )
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2165:8: otherlv_7= ',' () ( (lv_subterm_9_0= ruleTerm ) ) (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )* otherlv_12= ')'
                            {
                            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTerm104573); 

                                	newLeafNode(otherlv_7, grammarAccess.getTerm10Access().getCommaKeyword_4_2_1_0());
                                
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2169:1: ()
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2170:5: 
                            {

                                    current = forceCreateModelElementAndAdd(
                                        grammarAccess.getTerm10Access().getTupleSubtermAction_4_2_1_1(),
                                        current);
                                

                            }

                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2175:2: ( (lv_subterm_9_0= ruleTerm ) )
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2176:1: (lv_subterm_9_0= ruleTerm )
                            {
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2176:1: (lv_subterm_9_0= ruleTerm )
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2177:3: lv_subterm_9_0= ruleTerm
                            {
                             
                            	        newCompositeNode(grammarAccess.getTerm10Access().getSubtermTermParserRuleCall_4_2_1_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleTerm104603);
                            lv_subterm_9_0=ruleTerm();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTerm10Rule());
                            	        }
                                   		add(
                                   			current, 
                                   			"subterm",
                                    		lv_subterm_9_0, 
                                    		"Term");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2193:2: (otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==14) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2193:4: otherlv_10= ',' ( (lv_subterm_11_0= ruleTerm ) )
                            	    {
                            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTerm104616); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getTerm10Access().getCommaKeyword_4_2_1_3_0());
                            	        
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2197:1: ( (lv_subterm_11_0= ruleTerm ) )
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2198:1: (lv_subterm_11_0= ruleTerm )
                            	    {
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2198:1: (lv_subterm_11_0= ruleTerm )
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2199:3: lv_subterm_11_0= ruleTerm
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getTerm10Access().getSubtermTermParserRuleCall_4_2_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleTerm104637);
                            	    lv_subterm_11_0=ruleTerm();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getTerm10Rule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"subterm",
                            	            		lv_subterm_11_0, 
                            	            		"Term");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerm104651); 

                                	newLeafNode(otherlv_12, grammarAccess.getTerm10Access().getRightParenthesisKeyword_4_2_1_4());
                                

                            }


                            }
                            break;

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
    // $ANTLR end "ruleTerm10"


    // $ANTLR start "entryRuleVariable"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2227:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2228:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2229:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable4690);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable4700); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2236:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2239:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2240:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2240:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2241:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2241:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2242:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariable4741); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUserOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2266:1: entryRuleUserOperator returns [EObject current=null] : iv_ruleUserOperator= ruleUserOperator EOF ;
    public final EObject entryRuleUserOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2267:2: (iv_ruleUserOperator= ruleUserOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2268:2: iv_ruleUserOperator= ruleUserOperator EOF
            {
             newCompositeNode(grammarAccess.getUserOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUserOperator_in_entryRuleUserOperator4781);
            iv_ruleUserOperator=ruleUserOperator();

            state._fsp--;

             current =iv_ruleUserOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUserOperator4791); 

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
    // $ANTLR end "entryRuleUserOperator"


    // $ANTLR start "ruleUserOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2275:1: ruleUserOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleUserOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subterm_2_0 = null;

        EObject lv_subterm_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2278:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )? otherlv_5= ')' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2279:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )? otherlv_5= ')' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2279:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )? otherlv_5= ')' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2279:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )? otherlv_5= ')'
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2279:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2280:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2280:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2281:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUserOperator4833); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUserOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleUserOperator4850); 

                	newLeafNode(otherlv_1, grammarAccess.getUserOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2301:1: ( ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||LA27_0==21||(LA27_0>=53 && LA27_0<=57)||LA27_0==59||(LA27_0>=61 && LA27_0<=62)||(LA27_0>=70 && LA27_0<=71)||LA27_0==75||(LA27_0>=78 && LA27_0<=80)||(LA27_0>=82 && LA27_0<=88)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2301:2: ( (lv_subterm_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )*
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2301:2: ( (lv_subterm_2_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2302:1: (lv_subterm_2_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2302:1: (lv_subterm_2_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2303:3: lv_subterm_2_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserOperatorAccess().getSubtermTermParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleUserOperator4872);
                    lv_subterm_2_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_2_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2319:2: (otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2319:4: otherlv_3= ',' ( (lv_subterm_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUserOperator4885); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getUserOperatorAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2323:1: ( (lv_subterm_4_0= ruleTerm ) )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2324:1: (lv_subterm_4_0= ruleTerm )
                    	    {
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2324:1: (lv_subterm_4_0= ruleTerm )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2325:3: lv_subterm_4_0= ruleTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUserOperatorAccess().getSubtermTermParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleUserOperator4906);
                    	    lv_subterm_4_0=ruleTerm();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUserOperatorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subterm",
                    	            		lv_subterm_4_0, 
                    	            		"Term");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUserOperator4922); 

                	newLeafNode(otherlv_5, grammarAccess.getUserOperatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUserOperator"


    // $ANTLR start "entryRuleOtherBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2353:1: entryRuleOtherBuiltInOperator returns [EObject current=null] : iv_ruleOtherBuiltInOperator= ruleOtherBuiltInOperator EOF ;
    public final EObject entryRuleOtherBuiltInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherBuiltInOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2354:2: (iv_ruleOtherBuiltInOperator= ruleOtherBuiltInOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2355:2: iv_ruleOtherBuiltInOperator= ruleOtherBuiltInOperator EOF
            {
             newCompositeNode(grammarAccess.getOtherBuiltInOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOtherBuiltInOperator_in_entryRuleOtherBuiltInOperator4958);
            iv_ruleOtherBuiltInOperator=ruleOtherBuiltInOperator();

            state._fsp--;

             current =iv_ruleOtherBuiltInOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOtherBuiltInOperator4968); 

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
    // $ANTLR end "entryRuleOtherBuiltInOperator"


    // $ANTLR start "ruleOtherBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2362:1: ruleOtherBuiltInOperator returns [EObject current=null] : ( (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' ) | (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) | this_CyclicEnumsBuiltInOperator_10= ruleCyclicEnumsBuiltInOperator | this_PartitionsBuiltInOperator_11= rulePartitionsBuiltInOperator | this_StringsBuiltInOperator_12= ruleStringsBuiltInOperator | this_ListsBuiltInOperator_13= ruleListsBuiltInOperator ) ;
    public final EObject ruleOtherBuiltInOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_subterm_2_0 = null;

        EObject lv_subterm_6_0 = null;

        EObject lv_subterm_8_0 = null;

        EObject this_CyclicEnumsBuiltInOperator_10 = null;

        EObject this_PartitionsBuiltInOperator_11 = null;

        EObject this_StringsBuiltInOperator_12 = null;

        EObject this_ListsBuiltInOperator_13 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2365:28: ( ( (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' ) | (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) | this_CyclicEnumsBuiltInOperator_10= ruleCyclicEnumsBuiltInOperator | this_PartitionsBuiltInOperator_11= rulePartitionsBuiltInOperator | this_StringsBuiltInOperator_12= ruleStringsBuiltInOperator | this_ListsBuiltInOperator_13= ruleListsBuiltInOperator ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2366:1: ( (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' ) | (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) | this_CyclicEnumsBuiltInOperator_10= ruleCyclicEnumsBuiltInOperator | this_PartitionsBuiltInOperator_11= rulePartitionsBuiltInOperator | this_StringsBuiltInOperator_12= ruleStringsBuiltInOperator | this_ListsBuiltInOperator_13= ruleListsBuiltInOperator )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2366:1: ( (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' ) | (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) | this_CyclicEnumsBuiltInOperator_10= ruleCyclicEnumsBuiltInOperator | this_PartitionsBuiltInOperator_11= rulePartitionsBuiltInOperator | this_StringsBuiltInOperator_12= ruleStringsBuiltInOperator | this_ListsBuiltInOperator_13= ruleListsBuiltInOperator )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt28=1;
                }
                break;
            case 55:
                {
                alt28=2;
                }
                break;
            case 70:
            case 71:
                {
                alt28=3;
                }
                break;
            case 75:
                {
                alt28=4;
                }
                break;
            case 78:
            case 79:
            case 80:
                {
                alt28=5;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2366:2: (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2366:2: (otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2366:4: otherlv_0= '|' () ( (lv_subterm_2_0= ruleTerm10 ) ) otherlv_3= '|'
                    {
                    otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOtherBuiltInOperator5006); 

                        	newLeafNode(otherlv_0, grammarAccess.getOtherBuiltInOperatorAccess().getVerticalLineKeyword_0_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2370:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2371:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOtherBuiltInOperatorAccess().getCardinalityAction_0_1(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2376:2: ( (lv_subterm_2_0= ruleTerm10 ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2377:1: (lv_subterm_2_0= ruleTerm10 )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2377:1: (lv_subterm_2_0= ruleTerm10 )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2378:3: lv_subterm_2_0= ruleTerm10
                    {
                     
                    	        newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermTerm10ParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm10_in_ruleOtherBuiltInOperator5036);
                    lv_subterm_2_0=ruleTerm10();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOtherBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_2_0, 
                            		"Term10");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOtherBuiltInOperator5048); 

                        	newLeafNode(otherlv_3, grammarAccess.getOtherBuiltInOperatorAccess().getVerticalLineKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2399:6: (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2399:6: (otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2399:8: otherlv_4= '#(' () ( (lv_subterm_6_0= ruleTerm ) ) otherlv_7= ',' ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOtherBuiltInOperator5068); 

                        	newLeafNode(otherlv_4, grammarAccess.getOtherBuiltInOperatorAccess().getNumberSignLeftParenthesisKeyword_1_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2403:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2404:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOtherBuiltInOperatorAccess().getCardinalityOfAction_1_1(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2409:2: ( (lv_subterm_6_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2410:1: (lv_subterm_6_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2410:1: (lv_subterm_6_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2411:3: lv_subterm_6_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleOtherBuiltInOperator5098);
                    lv_subterm_6_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOtherBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_6_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOtherBuiltInOperator5110); 

                        	newLeafNode(otherlv_7, grammarAccess.getOtherBuiltInOperatorAccess().getCommaKeyword_1_3());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2431:1: ( (lv_subterm_8_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2432:1: (lv_subterm_8_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2432:1: (lv_subterm_8_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2433:3: lv_subterm_8_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleOtherBuiltInOperator5131);
                    lv_subterm_8_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOtherBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_8_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOtherBuiltInOperator5143); 

                        	newLeafNode(otherlv_9, grammarAccess.getOtherBuiltInOperatorAccess().getRightParenthesisKeyword_1_5());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2455:5: this_CyclicEnumsBuiltInOperator_10= ruleCyclicEnumsBuiltInOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getCyclicEnumsBuiltInOperatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCyclicEnumsBuiltInOperator_in_ruleOtherBuiltInOperator5172);
                    this_CyclicEnumsBuiltInOperator_10=ruleCyclicEnumsBuiltInOperator();

                    state._fsp--;

                     
                            current = this_CyclicEnumsBuiltInOperator_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2465:5: this_PartitionsBuiltInOperator_11= rulePartitionsBuiltInOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getPartitionsBuiltInOperatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePartitionsBuiltInOperator_in_ruleOtherBuiltInOperator5199);
                    this_PartitionsBuiltInOperator_11=rulePartitionsBuiltInOperator();

                    state._fsp--;

                     
                            current = this_PartitionsBuiltInOperator_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2475:5: this_StringsBuiltInOperator_12= ruleStringsBuiltInOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getStringsBuiltInOperatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringsBuiltInOperator_in_ruleOtherBuiltInOperator5226);
                    this_StringsBuiltInOperator_12=ruleStringsBuiltInOperator();

                    state._fsp--;

                     
                            current = this_StringsBuiltInOperator_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2485:5: this_ListsBuiltInOperator_13= ruleListsBuiltInOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOtherBuiltInOperatorAccess().getListsBuiltInOperatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListsBuiltInOperator_in_ruleOtherBuiltInOperator5253);
                    this_ListsBuiltInOperator_13=ruleListsBuiltInOperator();

                    state._fsp--;

                     
                            current = this_ListsBuiltInOperator_13; 
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
    // $ANTLR end "ruleOtherBuiltInOperator"


    // $ANTLR start "entryRuleBuiltInSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2501:1: entryRuleBuiltInSort returns [EObject current=null] : iv_ruleBuiltInSort= ruleBuiltInSort EOF ;
    public final EObject entryRuleBuiltInSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2502:2: (iv_ruleBuiltInSort= ruleBuiltInSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2503:2: iv_ruleBuiltInSort= ruleBuiltInSort EOF
            {
             newCompositeNode(grammarAccess.getBuiltInSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuiltInSort_in_entryRuleBuiltInSort5288);
            iv_ruleBuiltInSort=ruleBuiltInSort();

            state._fsp--;

             current =iv_ruleBuiltInSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuiltInSort5298); 

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
    // $ANTLR end "entryRuleBuiltInSort"


    // $ANTLR start "ruleBuiltInSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2510:1: ruleBuiltInSort returns [EObject current=null] : (this_Dot_0= ruleDot | this_Boolean_1= ruleBoolean | this_Number_2= ruleNumber | this_FiniteEnumeration_3= ruleFiniteEnumeration | this_CyclicEnumeration_4= ruleCyclicEnumeration | this_FiniteIntRange_5= ruleFiniteIntRange | this_StringSort_6= ruleStringSort | this_ListSort_7= ruleListSort ) ;
    public final EObject ruleBuiltInSort() throws RecognitionException {
        EObject current = null;

        EObject this_Dot_0 = null;

        EObject this_Boolean_1 = null;

        EObject this_Number_2 = null;

        EObject this_FiniteEnumeration_3 = null;

        EObject this_CyclicEnumeration_4 = null;

        EObject this_FiniteIntRange_5 = null;

        EObject this_StringSort_6 = null;

        EObject this_ListSort_7 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2513:28: ( (this_Dot_0= ruleDot | this_Boolean_1= ruleBoolean | this_Number_2= ruleNumber | this_FiniteEnumeration_3= ruleFiniteEnumeration | this_CyclicEnumeration_4= ruleCyclicEnumeration | this_FiniteIntRange_5= ruleFiniteIntRange | this_StringSort_6= ruleStringSort | this_ListSort_7= ruleListSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2514:1: (this_Dot_0= ruleDot | this_Boolean_1= ruleBoolean | this_Number_2= ruleNumber | this_FiniteEnumeration_3= ruleFiniteEnumeration | this_CyclicEnumeration_4= ruleCyclicEnumeration | this_FiniteIntRange_5= ruleFiniteIntRange | this_StringSort_6= ruleStringSort | this_ListSort_7= ruleListSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2514:1: (this_Dot_0= ruleDot | this_Boolean_1= ruleBoolean | this_Number_2= ruleNumber | this_FiniteEnumeration_3= ruleFiniteEnumeration | this_CyclicEnumeration_4= ruleCyclicEnumeration | this_FiniteIntRange_5= ruleFiniteIntRange | this_StringSort_6= ruleStringSort | this_ListSort_7= ruleListSort )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt29=1;
                }
                break;
            case 60:
                {
                alt29=2;
                }
                break;
            case 63:
            case 64:
            case 65:
                {
                alt29=3;
                }
                break;
            case 66:
                {
                alt29=4;
                }
                break;
            case 69:
                {
                alt29=5;
                }
                break;
            case 72:
                {
                alt29=6;
                }
                break;
            case 77:
                {
                alt29=7;
                }
                break;
            case 81:
                {
                alt29=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2515:5: this_Dot_0= ruleDot
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getDotParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDot_in_ruleBuiltInSort5345);
                    this_Dot_0=ruleDot();

                    state._fsp--;

                     
                            current = this_Dot_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2525:5: this_Boolean_1= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getBooleanParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleBuiltInSort5372);
                    this_Boolean_1=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2535:5: this_Number_2= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getNumberParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleBuiltInSort5399);
                    this_Number_2=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2545:5: this_FiniteEnumeration_3= ruleFiniteEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getFiniteEnumerationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFiniteEnumeration_in_ruleBuiltInSort5426);
                    this_FiniteEnumeration_3=ruleFiniteEnumeration();

                    state._fsp--;

                     
                            current = this_FiniteEnumeration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2555:5: this_CyclicEnumeration_4= ruleCyclicEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getCyclicEnumerationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCyclicEnumeration_in_ruleBuiltInSort5453);
                    this_CyclicEnumeration_4=ruleCyclicEnumeration();

                    state._fsp--;

                     
                            current = this_CyclicEnumeration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2565:5: this_FiniteIntRange_5= ruleFiniteIntRange
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getFiniteIntRangeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFiniteIntRange_in_ruleBuiltInSort5480);
                    this_FiniteIntRange_5=ruleFiniteIntRange();

                    state._fsp--;

                     
                            current = this_FiniteIntRange_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2575:5: this_StringSort_6= ruleStringSort
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getStringSortParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringSort_in_ruleBuiltInSort5507);
                    this_StringSort_6=ruleStringSort();

                    state._fsp--;

                     
                            current = this_StringSort_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2585:5: this_ListSort_7= ruleListSort
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInSortAccess().getListSortParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListSort_in_ruleBuiltInSort5534);
                    this_ListSort_7=ruleListSort();

                    state._fsp--;

                     
                            current = this_ListSort_7; 
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
    // $ANTLR end "ruleBuiltInSort"


    // $ANTLR start "entryRuleBuiltInConst"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2601:1: entryRuleBuiltInConst returns [EObject current=null] : iv_ruleBuiltInConst= ruleBuiltInConst EOF ;
    public final EObject entryRuleBuiltInConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInConst = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2602:2: (iv_ruleBuiltInConst= ruleBuiltInConst EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2603:2: iv_ruleBuiltInConst= ruleBuiltInConst EOF
            {
             newCompositeNode(grammarAccess.getBuiltInConstRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuiltInConst_in_entryRuleBuiltInConst5569);
            iv_ruleBuiltInConst=ruleBuiltInConst();

            state._fsp--;

             current =iv_ruleBuiltInConst; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuiltInConst5579); 

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
    // $ANTLR end "entryRuleBuiltInConst"


    // $ANTLR start "ruleBuiltInConst"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2610:1: ruleBuiltInConst returns [EObject current=null] : (this_DotConstant_0= ruleDotConstant | this_BooleanConstant_1= ruleBooleanConstant | this_MultisetConstant_2= ruleMultisetConstant | this_NumberConstant_3= ruleNumberConstant | this_FiniteIntRangeConstant_4= ruleFiniteIntRangeConstant | this_StringConstant_5= ruleStringConstant | this_ListConstant_6= ruleListConstant ) ;
    public final EObject ruleBuiltInConst() throws RecognitionException {
        EObject current = null;

        EObject this_DotConstant_0 = null;

        EObject this_BooleanConstant_1 = null;

        EObject this_MultisetConstant_2 = null;

        EObject this_NumberConstant_3 = null;

        EObject this_FiniteIntRangeConstant_4 = null;

        EObject this_StringConstant_5 = null;

        EObject this_ListConstant_6 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2613:28: ( (this_DotConstant_0= ruleDotConstant | this_BooleanConstant_1= ruleBooleanConstant | this_MultisetConstant_2= ruleMultisetConstant | this_NumberConstant_3= ruleNumberConstant | this_FiniteIntRangeConstant_4= ruleFiniteIntRangeConstant | this_StringConstant_5= ruleStringConstant | this_ListConstant_6= ruleListConstant ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2614:1: (this_DotConstant_0= ruleDotConstant | this_BooleanConstant_1= ruleBooleanConstant | this_MultisetConstant_2= ruleMultisetConstant | this_NumberConstant_3= ruleNumberConstant | this_FiniteIntRangeConstant_4= ruleFiniteIntRangeConstant | this_StringConstant_5= ruleStringConstant | this_ListConstant_6= ruleListConstant )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2614:1: (this_DotConstant_0= ruleDotConstant | this_BooleanConstant_1= ruleBooleanConstant | this_MultisetConstant_2= ruleMultisetConstant | this_NumberConstant_3= ruleNumberConstant | this_FiniteIntRangeConstant_4= ruleFiniteIntRangeConstant | this_StringConstant_5= ruleStringConstant | this_ListConstant_6= ruleListConstant )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt30=1;
                }
                break;
            case 61:
            case 62:
                {
                alt30=2;
                }
                break;
            case 56:
            case 57:
                {
                alt30=3;
                }
                break;
            case RULE_INTSTRING:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==72) ) {
                    alt30=5;
                }
                else if ( (LA30_4==EOF||LA30_4==12||LA30_4==14||LA30_4==19||LA30_4==22||(LA30_4>=24 && LA30_4<=52)||LA30_4==54||LA30_4==68) ) {
                    alt30=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt30=6;
                }
                break;
            case 88:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2615:5: this_DotConstant_0= ruleDotConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getDotConstantParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDotConstant_in_ruleBuiltInConst5626);
                    this_DotConstant_0=ruleDotConstant();

                    state._fsp--;

                     
                            current = this_DotConstant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2625:5: this_BooleanConstant_1= ruleBooleanConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getBooleanConstantParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanConstant_in_ruleBuiltInConst5653);
                    this_BooleanConstant_1=ruleBooleanConstant();

                    state._fsp--;

                     
                            current = this_BooleanConstant_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2635:5: this_MultisetConstant_2= ruleMultisetConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getMultisetConstantParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultisetConstant_in_ruleBuiltInConst5680);
                    this_MultisetConstant_2=ruleMultisetConstant();

                    state._fsp--;

                     
                            current = this_MultisetConstant_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2645:5: this_NumberConstant_3= ruleNumberConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getNumberConstantParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberConstant_in_ruleBuiltInConst5707);
                    this_NumberConstant_3=ruleNumberConstant();

                    state._fsp--;

                     
                            current = this_NumberConstant_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2655:5: this_FiniteIntRangeConstant_4= ruleFiniteIntRangeConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getFiniteIntRangeConstantParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFiniteIntRangeConstant_in_ruleBuiltInConst5734);
                    this_FiniteIntRangeConstant_4=ruleFiniteIntRangeConstant();

                    state._fsp--;

                     
                            current = this_FiniteIntRangeConstant_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2665:5: this_StringConstant_5= ruleStringConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getStringConstantParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringConstant_in_ruleBuiltInConst5761);
                    this_StringConstant_5=ruleStringConstant();

                    state._fsp--;

                     
                            current = this_StringConstant_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2675:5: this_ListConstant_6= ruleListConstant
                    {
                     
                            newCompositeNode(grammarAccess.getBuiltInConstAccess().getListConstantParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListConstant_in_ruleBuiltInConst5788);
                    this_ListConstant_6=ruleListConstant();

                    state._fsp--;

                     
                            current = this_ListConstant_6; 
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
    // $ANTLR end "ruleBuiltInConst"


    // $ANTLR start "entryRuleMultisetConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2691:1: entryRuleMultisetConstant returns [EObject current=null] : iv_ruleMultisetConstant= ruleMultisetConstant EOF ;
    public final EObject entryRuleMultisetConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultisetConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2692:2: (iv_ruleMultisetConstant= ruleMultisetConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2693:2: iv_ruleMultisetConstant= ruleMultisetConstant EOF
            {
             newCompositeNode(grammarAccess.getMultisetConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultisetConstant_in_entryRuleMultisetConstant5823);
            iv_ruleMultisetConstant=ruleMultisetConstant();

            state._fsp--;

             current =iv_ruleMultisetConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultisetConstant5833); 

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
    // $ANTLR end "entryRuleMultisetConstant"


    // $ANTLR start "ruleMultisetConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2700:1: ruleMultisetConstant returns [EObject current=null] : ( (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) ) | (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) ) ) ;
    public final EObject ruleMultisetConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_refsort_3_0 = null;

        EObject lv_refsort_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2703:28: ( ( (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) ) | (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2704:1: ( (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) ) | (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2704:1: ( (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) ) | (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==56) ) {
                alt31=1;
            }
            else if ( (LA31_0==57) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2704:2: (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2704:2: (otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2704:4: otherlv_0= 'all' () otherlv_2= ':' ( (lv_refsort_3_0= ruleSort ) )
                    {
                    otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMultisetConstant5871); 

                        	newLeafNode(otherlv_0, grammarAccess.getMultisetConstantAccess().getAllKeyword_0_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2708:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2709:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultisetConstantAccess().getAllAction_0_1(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultisetConstant5892); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultisetConstantAccess().getColonKeyword_0_2());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2718:1: ( (lv_refsort_3_0= ruleSort ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2719:1: (lv_refsort_3_0= ruleSort )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2719:1: (lv_refsort_3_0= ruleSort )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2720:3: lv_refsort_3_0= ruleSort
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultisetConstantAccess().getRefsortSortParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleMultisetConstant5913);
                    lv_refsort_3_0=ruleSort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultisetConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"refsort",
                            		lv_refsort_3_0, 
                            		"Sort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2737:6: (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2737:6: (otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2737:8: otherlv_4= 'empty' () otherlv_6= ':' ( (lv_refsort_7_0= ruleSort ) )
                    {
                    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMultisetConstant5933); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultisetConstantAccess().getEmptyKeyword_1_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2741:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2742:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultisetConstantAccess().getEmptyAction_1_1(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultisetConstant5954); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultisetConstantAccess().getColonKeyword_1_2());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2751:1: ( (lv_refsort_7_0= ruleSort ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2752:1: (lv_refsort_7_0= ruleSort )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2752:1: (lv_refsort_7_0= ruleSort )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2753:3: lv_refsort_7_0= ruleSort
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultisetConstantAccess().getRefsortSortParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleMultisetConstant5975);
                    lv_refsort_7_0=ruleSort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultisetConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"refsort",
                            		lv_refsort_7_0, 
                            		"Sort");
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
    // $ANTLR end "ruleMultisetConstant"


    // $ANTLR start "entryRuleDot"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2777:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2778:2: (iv_ruleDot= ruleDot EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2779:2: iv_ruleDot= ruleDot EOF
            {
             newCompositeNode(grammarAccess.getDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDot_in_entryRuleDot6012);
            iv_ruleDot=ruleDot();

            state._fsp--;

             current =iv_ruleDot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDot6022); 

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
    // $ANTLR end "entryRuleDot"


    // $ANTLR start "ruleDot"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2786:1: ruleDot returns [EObject current=null] : (otherlv_0= 'DOT' () ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2789:28: ( (otherlv_0= 'DOT' () ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2790:1: (otherlv_0= 'DOT' () )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2790:1: (otherlv_0= 'DOT' () )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2790:3: otherlv_0= 'DOT' ()
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleDot6059); 

                	newLeafNode(otherlv_0, grammarAccess.getDotAccess().getDOTKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2794:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2795:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotAccess().getDotAction_1(),
                        current);
                

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
    // $ANTLR end "ruleDot"


    // $ANTLR start "entryRuleDotConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2808:1: entryRuleDotConstant returns [EObject current=null] : iv_ruleDotConstant= ruleDotConstant EOF ;
    public final EObject entryRuleDotConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2809:2: (iv_ruleDotConstant= ruleDotConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2810:2: iv_ruleDotConstant= ruleDotConstant EOF
            {
             newCompositeNode(grammarAccess.getDotConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotConstant_in_entryRuleDotConstant6104);
            iv_ruleDotConstant=ruleDotConstant();

            state._fsp--;

             current =iv_ruleDotConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotConstant6114); 

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
    // $ANTLR end "entryRuleDotConstant"


    // $ANTLR start "ruleDotConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2817:1: ruleDotConstant returns [EObject current=null] : (otherlv_0= 'dot' () ) ;
    public final EObject ruleDotConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2820:28: ( (otherlv_0= 'dot' () ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2821:1: (otherlv_0= 'dot' () )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2821:1: (otherlv_0= 'dot' () )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2821:3: otherlv_0= 'dot' ()
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleDotConstant6151); 

                	newLeafNode(otherlv_0, grammarAccess.getDotConstantAccess().getDotKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2825:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotConstantAccess().getDotConstantAction_1(),
                        current);
                

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
    // $ANTLR end "ruleDotConstant"


    // $ANTLR start "entryRuleBoolean"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2839:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2840:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2841:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean6196);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean6206); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2848:1: ruleBoolean returns [EObject current=null] : (otherlv_0= 'BOOL' () ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2851:28: ( (otherlv_0= 'BOOL' () ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2852:1: (otherlv_0= 'BOOL' () )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2852:1: (otherlv_0= 'BOOL' () )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2852:3: otherlv_0= 'BOOL' ()
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleBoolean6243); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanAccess().getBOOLKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2856:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2857:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanAccess().getBoolAction_1(),
                        current);
                

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBooleanConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2870:1: entryRuleBooleanConstant returns [EObject current=null] : iv_ruleBooleanConstant= ruleBooleanConstant EOF ;
    public final EObject entryRuleBooleanConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2871:2: (iv_ruleBooleanConstant= ruleBooleanConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2872:2: iv_ruleBooleanConstant= ruleBooleanConstant EOF
            {
             newCompositeNode(grammarAccess.getBooleanConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanConstant_in_entryRuleBooleanConstant6288);
            iv_ruleBooleanConstant=ruleBooleanConstant();

            state._fsp--;

             current =iv_ruleBooleanConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanConstant6298); 

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
    // $ANTLR end "entryRuleBooleanConstant"


    // $ANTLR start "ruleBooleanConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2879:1: ruleBooleanConstant returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2882:28: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2883:1: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2883:1: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2883:2: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2883:2: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2884:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanConstantAccess().getBooleanConstantAction_0(),
                        current);
                

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2889:2: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==61) ) {
                alt32=1;
            }
            else if ( (LA32_0==62) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2889:3: ( (lv_value_1_0= 'true' ) )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2889:3: ( (lv_value_1_0= 'true' ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2890:1: (lv_value_1_0= 'true' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2890:1: (lv_value_1_0= 'true' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2891:3: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleBooleanConstant6351); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanConstantAccess().getValueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanConstantRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2905:7: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleBooleanConstant6382); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanConstantAccess().getFalseKeyword_1_1());
                        

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
    // $ANTLR end "ruleBooleanConstant"


    // $ANTLR start "entryRuleNumber"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2917:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2918:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2919:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber6419);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber6429); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2926:1: ruleNumber returns [EObject current=null] : ( (otherlv_0= 'INT' () ) | (otherlv_2= 'NAT' () ) | (otherlv_4= 'POS' () ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2929:28: ( ( (otherlv_0= 'INT' () ) | (otherlv_2= 'NAT' () ) | (otherlv_4= 'POS' () ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2930:1: ( (otherlv_0= 'INT' () ) | (otherlv_2= 'NAT' () ) | (otherlv_4= 'POS' () ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2930:1: ( (otherlv_0= 'INT' () ) | (otherlv_2= 'NAT' () ) | (otherlv_4= 'POS' () ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt33=1;
                }
                break;
            case 64:
                {
                alt33=2;
                }
                break;
            case 65:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2930:2: (otherlv_0= 'INT' () )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2930:2: (otherlv_0= 'INT' () )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2930:4: otherlv_0= 'INT' ()
                    {
                    otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleNumber6467); 

                        	newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getINTKeyword_0_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2934:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2935:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNumberAccess().getIntegerAction_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2941:6: (otherlv_2= 'NAT' () )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2941:6: (otherlv_2= 'NAT' () )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2941:8: otherlv_2= 'NAT' ()
                    {
                    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleNumber6496); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getNATKeyword_1_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2945:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2946:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNumberAccess().getNaturalAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2952:6: (otherlv_4= 'POS' () )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2952:6: (otherlv_4= 'POS' () )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2952:8: otherlv_4= 'POS' ()
                    {
                    otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleNumber6525); 

                        	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getPOSKeyword_2_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2956:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2957:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNumberAccess().getPositiveAction_2_1(),
                                current);
                        

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleNumberConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2970:1: entryRuleNumberConstant returns [EObject current=null] : iv_ruleNumberConstant= ruleNumberConstant EOF ;
    public final EObject entryRuleNumberConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2971:2: (iv_ruleNumberConstant= ruleNumberConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2972:2: iv_ruleNumberConstant= ruleNumberConstant EOF
            {
             newCompositeNode(grammarAccess.getNumberConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberConstant_in_entryRuleNumberConstant6571);
            iv_ruleNumberConstant=ruleNumberConstant();

            state._fsp--;

             current =iv_ruleNumberConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberConstant6581); 

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
    // $ANTLR end "entryRuleNumberConstant"


    // $ANTLR start "ruleNumberConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2979:1: ruleNumberConstant returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )? ) ;
    public final EObject ruleNumberConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2982:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )? ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2983:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )? )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2983:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )? )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2983:2: () ( (lv_value_1_0= ruleINTEGER ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )?
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2983:2: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberConstantAccess().getNumberConstantAction_0(),
                        current);
                

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2989:2: ( (lv_value_1_0= ruleINTEGER ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2990:1: (lv_value_1_0= ruleINTEGER )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2990:1: (lv_value_1_0= ruleINTEGER )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:2991:3: lv_value_1_0= ruleINTEGER
            {
             
            	        newCompositeNode(grammarAccess.getNumberConstantAccess().getValueINTEGERParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleNumberConstant6636);
            lv_value_1_0=ruleINTEGER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INTEGER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3007:2: (otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3007:4: otherlv_2= ':' ( (lv_type_3_0= ruleNumber ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNumberConstant6649); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumberConstantAccess().getColonKeyword_2_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3011:1: ( (lv_type_3_0= ruleNumber ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3012:1: (lv_type_3_0= ruleNumber )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3012:1: (lv_type_3_0= ruleNumber )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3013:3: lv_type_3_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberConstantAccess().getTypeNumberParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleNumberConstant6670);
                    lv_type_3_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleNumberConstant"


    // $ANTLR start "entryRuleINTEGER"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3037:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3038:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3039:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
             newCompositeNode(grammarAccess.getINTEGERRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_entryRuleINTEGER6709);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;

             current =iv_ruleINTEGER.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTEGER6720); 

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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3046:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTSTRING_0= RULE_INTSTRING ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTSTRING_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3049:28: (this_INTSTRING_0= RULE_INTSTRING )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3050:5: this_INTSTRING_0= RULE_INTSTRING
            {
            this_INTSTRING_0=(Token)match(input,RULE_INTSTRING,FollowSets000.FOLLOW_RULE_INTSTRING_in_ruleINTEGER6759); 

            		current.merge(this_INTSTRING_0);
                
             
                newLeafNode(this_INTSTRING_0, grammarAccess.getINTEGERAccess().getINTSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleNAT"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3065:1: entryRuleNAT returns [String current=null] : iv_ruleNAT= ruleNAT EOF ;
    public final String entryRuleNAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAT = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3066:2: (iv_ruleNAT= ruleNAT EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3067:2: iv_ruleNAT= ruleNAT EOF
            {
             newCompositeNode(grammarAccess.getNATRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNAT_in_entryRuleNAT6804);
            iv_ruleNAT=ruleNAT();

            state._fsp--;

             current =iv_ruleNAT.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNAT6815); 

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
    // $ANTLR end "entryRuleNAT"


    // $ANTLR start "ruleNAT"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3074:1: ruleNAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTSTRING_0= RULE_INTSTRING ;
    public final AntlrDatatypeRuleToken ruleNAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTSTRING_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3077:28: (this_INTSTRING_0= RULE_INTSTRING )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3078:5: this_INTSTRING_0= RULE_INTSTRING
            {
            this_INTSTRING_0=(Token)match(input,RULE_INTSTRING,FollowSets000.FOLLOW_RULE_INTSTRING_in_ruleNAT6854); 

            		current.merge(this_INTSTRING_0);
                
             
                newLeafNode(this_INTSTRING_0, grammarAccess.getNATAccess().getINTSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNAT"


    // $ANTLR start "entryRuleFiniteEnumeration"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3093:1: entryRuleFiniteEnumeration returns [EObject current=null] : iv_ruleFiniteEnumeration= ruleFiniteEnumeration EOF ;
    public final EObject entryRuleFiniteEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiniteEnumeration = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3094:2: (iv_ruleFiniteEnumeration= ruleFiniteEnumeration EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3095:2: iv_ruleFiniteEnumeration= ruleFiniteEnumeration EOF
            {
             newCompositeNode(grammarAccess.getFiniteEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFiniteEnumeration_in_entryRuleFiniteEnumeration6898);
            iv_ruleFiniteEnumeration=ruleFiniteEnumeration();

            state._fsp--;

             current =iv_ruleFiniteEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFiniteEnumeration6908); 

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
    // $ANTLR end "entryRuleFiniteEnumeration"


    // $ANTLR start "ruleFiniteEnumeration"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3102:1: ruleFiniteEnumeration returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleFiniteEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3105:28: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3106:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3106:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3106:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFiniteEnumeration6945); 

                	newLeafNode(otherlv_0, grammarAccess.getFiniteEnumerationAccess().getEnumKeyword_0());
                
            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleFiniteEnumeration6957); 

                	newLeafNode(otherlv_1, grammarAccess.getFiniteEnumerationAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3114:1: ( (lv_elements_2_0= ruleFEConstant ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3115:1: (lv_elements_2_0= ruleFEConstant )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3115:1: (lv_elements_2_0= ruleFEConstant )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3116:3: lv_elements_2_0= ruleFEConstant
            {
             
            	        newCompositeNode(grammarAccess.getFiniteEnumerationAccess().getElementsFEConstantParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFEConstant_in_ruleFiniteEnumeration6978);
            lv_elements_2_0=ruleFEConstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiniteEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"FEConstant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3132:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==14) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3132:4: otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFiniteEnumeration6991); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFiniteEnumerationAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3136:1: ( (lv_elements_4_0= ruleFEConstant ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3137:1: (lv_elements_4_0= ruleFEConstant )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3137:1: (lv_elements_4_0= ruleFEConstant )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3138:3: lv_elements_4_0= ruleFEConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFiniteEnumerationAccess().getElementsFEConstantParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFEConstant_in_ruleFiniteEnumeration7012);
            	    lv_elements_4_0=ruleFEConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFiniteEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"FEConstant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_5=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFiniteEnumeration7026); 

                	newLeafNode(otherlv_5, grammarAccess.getFiniteEnumerationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleFiniteEnumeration"


    // $ANTLR start "entryRuleFEConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3166:1: entryRuleFEConstant returns [EObject current=null] : iv_ruleFEConstant= ruleFEConstant EOF ;
    public final EObject entryRuleFEConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3167:2: (iv_ruleFEConstant= ruleFEConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3168:2: iv_ruleFEConstant= ruleFEConstant EOF
            {
             newCompositeNode(grammarAccess.getFEConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFEConstant_in_entryRuleFEConstant7062);
            iv_ruleFEConstant=ruleFEConstant();

            state._fsp--;

             current =iv_ruleFEConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFEConstant7072); 

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
    // $ANTLR end "entryRuleFEConstant"


    // $ANTLR start "ruleFEConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3175:1: ruleFEConstant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFEConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3178:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3179:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3179:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3180:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3180:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3181:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFEConstant7113); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFEConstantAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFEConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFEConstant"


    // $ANTLR start "entryRuleCyclicEnumeration"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3205:1: entryRuleCyclicEnumeration returns [EObject current=null] : iv_ruleCyclicEnumeration= ruleCyclicEnumeration EOF ;
    public final EObject entryRuleCyclicEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicEnumeration = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3206:2: (iv_ruleCyclicEnumeration= ruleCyclicEnumeration EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3207:2: iv_ruleCyclicEnumeration= ruleCyclicEnumeration EOF
            {
             newCompositeNode(grammarAccess.getCyclicEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCyclicEnumeration_in_entryRuleCyclicEnumeration7153);
            iv_ruleCyclicEnumeration=ruleCyclicEnumeration();

            state._fsp--;

             current =iv_ruleCyclicEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCyclicEnumeration7163); 

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
    // $ANTLR end "entryRuleCyclicEnumeration"


    // $ANTLR start "ruleCyclicEnumeration"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3214:1: ruleCyclicEnumeration returns [EObject current=null] : (otherlv_0= 'cyclic' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCyclicEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3217:28: ( (otherlv_0= 'cyclic' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3218:1: (otherlv_0= 'cyclic' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3218:1: (otherlv_0= 'cyclic' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3218:3: otherlv_0= 'cyclic' otherlv_1= '{' ( (lv_elements_2_0= ruleFEConstant ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCyclicEnumeration7200); 

                	newLeafNode(otherlv_0, grammarAccess.getCyclicEnumerationAccess().getCyclicKeyword_0());
                
            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCyclicEnumeration7212); 

                	newLeafNode(otherlv_1, grammarAccess.getCyclicEnumerationAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3226:1: ( (lv_elements_2_0= ruleFEConstant ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3227:1: (lv_elements_2_0= ruleFEConstant )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3227:1: (lv_elements_2_0= ruleFEConstant )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3228:3: lv_elements_2_0= ruleFEConstant
            {
             
            	        newCompositeNode(grammarAccess.getCyclicEnumerationAccess().getElementsFEConstantParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFEConstant_in_ruleCyclicEnumeration7233);
            lv_elements_2_0=ruleFEConstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCyclicEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"FEConstant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3244:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==14) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3244:4: otherlv_3= ',' ( (lv_elements_4_0= ruleFEConstant ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCyclicEnumeration7246); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCyclicEnumerationAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3248:1: ( (lv_elements_4_0= ruleFEConstant ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3249:1: (lv_elements_4_0= ruleFEConstant )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3249:1: (lv_elements_4_0= ruleFEConstant )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3250:3: lv_elements_4_0= ruleFEConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCyclicEnumerationAccess().getElementsFEConstantParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFEConstant_in_ruleCyclicEnumeration7267);
            	    lv_elements_4_0=ruleFEConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCyclicEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"FEConstant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCyclicEnumeration7281); 

                	newLeafNode(otherlv_5, grammarAccess.getCyclicEnumerationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCyclicEnumeration"


    // $ANTLR start "entryRuleCyclicEnumsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3278:1: entryRuleCyclicEnumsBuiltInOperator returns [EObject current=null] : iv_ruleCyclicEnumsBuiltInOperator= ruleCyclicEnumsBuiltInOperator EOF ;
    public final EObject entryRuleCyclicEnumsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicEnumsBuiltInOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3279:2: (iv_ruleCyclicEnumsBuiltInOperator= ruleCyclicEnumsBuiltInOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3280:2: iv_ruleCyclicEnumsBuiltInOperator= ruleCyclicEnumsBuiltInOperator EOF
            {
             newCompositeNode(grammarAccess.getCyclicEnumsBuiltInOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCyclicEnumsBuiltInOperator_in_entryRuleCyclicEnumsBuiltInOperator7317);
            iv_ruleCyclicEnumsBuiltInOperator=ruleCyclicEnumsBuiltInOperator();

            state._fsp--;

             current =iv_ruleCyclicEnumsBuiltInOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCyclicEnumsBuiltInOperator7327); 

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
    // $ANTLR end "entryRuleCyclicEnumsBuiltInOperator"


    // $ANTLR start "ruleCyclicEnumsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3287:1: ruleCyclicEnumsBuiltInOperator returns [EObject current=null] : ( (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' ) | (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleCyclicEnumsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3290:28: ( ( (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' ) | (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3291:1: ( (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' ) | (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3291:1: ( (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' ) | (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==70) ) {
                alt37=1;
            }
            else if ( (LA37_0==71) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3291:2: (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3291:2: (otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3291:4: otherlv_0= 'succ' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCyclicEnumsBuiltInOperator7365); 

                        	newLeafNode(otherlv_0, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSuccKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCyclicEnumsBuiltInOperator7377); 

                        	newLeafNode(otherlv_1, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3299:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3300:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSuccessorAction_0_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3305:2: ( (lv_subterm_3_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3306:1: (lv_subterm_3_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3306:1: (lv_subterm_3_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3307:3: lv_subterm_3_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSubtermTermParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleCyclicEnumsBuiltInOperator7407);
                    lv_subterm_3_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCyclicEnumsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_3_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCyclicEnumsBuiltInOperator7419); 

                        	newLeafNode(otherlv_4, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3328:6: (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3328:6: (otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3328:8: otherlv_5= 'pred' otherlv_6= '(' () ( (lv_subterm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleCyclicEnumsBuiltInOperator7439); 

                        	newLeafNode(otherlv_5, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getPredKeyword_1_0());
                        
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCyclicEnumsBuiltInOperator7451); 

                        	newLeafNode(otherlv_6, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3336:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3337:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getPredecessorAction_1_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3342:2: ( (lv_subterm_8_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3343:1: (lv_subterm_8_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3343:1: (lv_subterm_8_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3344:3: lv_subterm_8_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleCyclicEnumsBuiltInOperator7481);
                    lv_subterm_8_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCyclicEnumsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_8_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCyclicEnumsBuiltInOperator7493); 

                        	newLeafNode(otherlv_9, grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getRightParenthesisKeyword_1_4());
                        

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
    // $ANTLR end "ruleCyclicEnumsBuiltInOperator"


    // $ANTLR start "entryRuleFiniteIntRange"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3372:1: entryRuleFiniteIntRange returns [EObject current=null] : iv_ruleFiniteIntRange= ruleFiniteIntRange EOF ;
    public final EObject entryRuleFiniteIntRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiniteIntRange = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3373:2: (iv_ruleFiniteIntRange= ruleFiniteIntRange EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3374:2: iv_ruleFiniteIntRange= ruleFiniteIntRange EOF
            {
             newCompositeNode(grammarAccess.getFiniteIntRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFiniteIntRange_in_entryRuleFiniteIntRange7530);
            iv_ruleFiniteIntRange=ruleFiniteIntRange();

            state._fsp--;

             current =iv_ruleFiniteIntRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFiniteIntRange7540); 

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
    // $ANTLR end "entryRuleFiniteIntRange"


    // $ANTLR start "ruleFiniteIntRange"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3381:1: ruleFiniteIntRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_start_1_0= ruleINTEGER ) ) otherlv_2= '..' ( (lv_end_3_0= ruleINTEGER ) ) otherlv_4= ']' ) ;
    public final EObject ruleFiniteIntRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3384:28: ( (otherlv_0= '[' ( (lv_start_1_0= ruleINTEGER ) ) otherlv_2= '..' ( (lv_end_3_0= ruleINTEGER ) ) otherlv_4= ']' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3385:1: (otherlv_0= '[' ( (lv_start_1_0= ruleINTEGER ) ) otherlv_2= '..' ( (lv_end_3_0= ruleINTEGER ) ) otherlv_4= ']' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3385:1: (otherlv_0= '[' ( (lv_start_1_0= ruleINTEGER ) ) otherlv_2= '..' ( (lv_end_3_0= ruleINTEGER ) ) otherlv_4= ']' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3385:3: otherlv_0= '[' ( (lv_start_1_0= ruleINTEGER ) ) otherlv_2= '..' ( (lv_end_3_0= ruleINTEGER ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleFiniteIntRange7577); 

                	newLeafNode(otherlv_0, grammarAccess.getFiniteIntRangeAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3389:1: ( (lv_start_1_0= ruleINTEGER ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3390:1: (lv_start_1_0= ruleINTEGER )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3390:1: (lv_start_1_0= ruleINTEGER )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3391:3: lv_start_1_0= ruleINTEGER
            {
             
            	        newCompositeNode(grammarAccess.getFiniteIntRangeAccess().getStartINTEGERParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleFiniteIntRange7598);
            lv_start_1_0=ruleINTEGER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiniteIntRangeRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_1_0, 
                    		"INTEGER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleFiniteIntRange7610); 

                	newLeafNode(otherlv_2, grammarAccess.getFiniteIntRangeAccess().getFullStopFullStopKeyword_2());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3411:1: ( (lv_end_3_0= ruleINTEGER ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3412:1: (lv_end_3_0= ruleINTEGER )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3412:1: (lv_end_3_0= ruleINTEGER )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3413:3: lv_end_3_0= ruleINTEGER
            {
             
            	        newCompositeNode(grammarAccess.getFiniteIntRangeAccess().getEndINTEGERParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleFiniteIntRange7631);
            lv_end_3_0=ruleINTEGER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiniteIntRangeRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_3_0, 
                    		"INTEGER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleFiniteIntRange7643); 

                	newLeafNode(otherlv_4, grammarAccess.getFiniteIntRangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleFiniteIntRange"


    // $ANTLR start "entryRuleFiniteIntRangeConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3441:1: entryRuleFiniteIntRangeConstant returns [EObject current=null] : iv_ruleFiniteIntRangeConstant= ruleFiniteIntRangeConstant EOF ;
    public final EObject entryRuleFiniteIntRangeConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiniteIntRangeConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3442:2: (iv_ruleFiniteIntRangeConstant= ruleFiniteIntRangeConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3443:2: iv_ruleFiniteIntRangeConstant= ruleFiniteIntRangeConstant EOF
            {
             newCompositeNode(grammarAccess.getFiniteIntRangeConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFiniteIntRangeConstant_in_entryRuleFiniteIntRangeConstant7679);
            iv_ruleFiniteIntRangeConstant=ruleFiniteIntRangeConstant();

            state._fsp--;

             current =iv_ruleFiniteIntRangeConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFiniteIntRangeConstant7689); 

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
    // $ANTLR end "entryRuleFiniteIntRangeConstant"


    // $ANTLR start "ruleFiniteIntRangeConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3450:1: ruleFiniteIntRangeConstant returns [EObject current=null] : ( ( (lv_value_0_0= ruleINTEGER ) ) ( (lv_range_1_0= ruleFiniteIntRange ) ) ) ;
    public final EObject ruleFiniteIntRangeConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3453:28: ( ( ( (lv_value_0_0= ruleINTEGER ) ) ( (lv_range_1_0= ruleFiniteIntRange ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3454:1: ( ( (lv_value_0_0= ruleINTEGER ) ) ( (lv_range_1_0= ruleFiniteIntRange ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3454:1: ( ( (lv_value_0_0= ruleINTEGER ) ) ( (lv_range_1_0= ruleFiniteIntRange ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3454:2: ( (lv_value_0_0= ruleINTEGER ) ) ( (lv_range_1_0= ruleFiniteIntRange ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3454:2: ( (lv_value_0_0= ruleINTEGER ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3455:1: (lv_value_0_0= ruleINTEGER )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3455:1: (lv_value_0_0= ruleINTEGER )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3456:3: lv_value_0_0= ruleINTEGER
            {
             
            	        newCompositeNode(grammarAccess.getFiniteIntRangeConstantAccess().getValueINTEGERParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleFiniteIntRangeConstant7735);
            lv_value_0_0=ruleINTEGER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiniteIntRangeConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INTEGER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3472:2: ( (lv_range_1_0= ruleFiniteIntRange ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3473:1: (lv_range_1_0= ruleFiniteIntRange )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3473:1: (lv_range_1_0= ruleFiniteIntRange )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3474:3: lv_range_1_0= ruleFiniteIntRange
            {
             
            	        newCompositeNode(grammarAccess.getFiniteIntRangeConstantAccess().getRangeFiniteIntRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFiniteIntRange_in_ruleFiniteIntRangeConstant7756);
            lv_range_1_0=ruleFiniteIntRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiniteIntRangeConstantRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_1_0, 
                    		"FiniteIntRange");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFiniteIntRangeConstant"


    // $ANTLR start "entryRulePartition"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3498:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3499:2: (iv_rulePartition= rulePartition EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3500:2: iv_rulePartition= rulePartition EOF
            {
             newCompositeNode(grammarAccess.getPartitionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartition_in_entryRulePartition7792);
            iv_rulePartition=rulePartition();

            state._fsp--;

             current =iv_rulePartition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartition7802); 

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
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3507:1: rulePartition returns [EObject current=null] : (otherlv_0= 'partition' ( (lv_def_1_0= ruleSort ) ) otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_partitionElements_5_0= rulePartitionElement ) ) (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_def_1_0 = null;

        EObject lv_partitionElements_5_0 = null;

        EObject lv_partitionElements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3510:28: ( (otherlv_0= 'partition' ( (lv_def_1_0= ruleSort ) ) otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_partitionElements_5_0= rulePartitionElement ) ) (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )* otherlv_8= '}' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3511:1: (otherlv_0= 'partition' ( (lv_def_1_0= ruleSort ) ) otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_partitionElements_5_0= rulePartitionElement ) ) (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )* otherlv_8= '}' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3511:1: (otherlv_0= 'partition' ( (lv_def_1_0= ruleSort ) ) otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_partitionElements_5_0= rulePartitionElement ) ) (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )* otherlv_8= '}' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3511:3: otherlv_0= 'partition' ( (lv_def_1_0= ruleSort ) ) otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_partitionElements_5_0= rulePartitionElement ) ) (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePartition7839); 

                	newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPartitionKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3515:1: ( (lv_def_1_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3516:1: (lv_def_1_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3516:1: (lv_def_1_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3517:3: lv_def_1_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getPartitionAccess().getDefSortParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_rulePartition7860);
            lv_def_1_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartitionRule());
            	        }
                   		set(
                   			current, 
                   			"def",
                    		lv_def_1_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulePartition7872); 

                	newLeafNode(otherlv_2, grammarAccess.getPartitionAccess().getInKeyword_2());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3537:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3538:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3538:1: (lv_name_3_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3539:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePartition7889); 

            			newLeafNode(lv_name_3_0, grammarAccess.getPartitionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePartition7906); 

                	newLeafNode(otherlv_4, grammarAccess.getPartitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3559:1: ( (lv_partitionElements_5_0= rulePartitionElement ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3560:1: (lv_partitionElements_5_0= rulePartitionElement )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3560:1: (lv_partitionElements_5_0= rulePartitionElement )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3561:3: lv_partitionElements_5_0= rulePartitionElement
            {
             
            	        newCompositeNode(grammarAccess.getPartitionAccess().getPartitionElementsPartitionElementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePartitionElement_in_rulePartition7927);
            lv_partitionElements_5_0=rulePartitionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartitionRule());
            	        }
                   		add(
                   			current, 
                   			"partitionElements",
                    		lv_partitionElements_5_0, 
                    		"PartitionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3577:2: (otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==12) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3577:4: otherlv_6= ';' ( (lv_partitionElements_7_0= rulePartitionElement ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePartition7940); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPartitionAccess().getSemicolonKeyword_6_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3581:1: ( (lv_partitionElements_7_0= rulePartitionElement ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3582:1: (lv_partitionElements_7_0= rulePartitionElement )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3582:1: (lv_partitionElements_7_0= rulePartitionElement )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3583:3: lv_partitionElements_7_0= rulePartitionElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartitionAccess().getPartitionElementsPartitionElementParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePartitionElement_in_rulePartition7961);
            	    lv_partitionElements_7_0=rulePartitionElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPartitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"partitionElements",
            	            		lv_partitionElements_7_0, 
            	            		"PartitionElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,68,FollowSets000.FOLLOW_68_in_rulePartition7975); 

                	newLeafNode(otherlv_8, grammarAccess.getPartitionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRulePartitionElement"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3611:1: entryRulePartitionElement returns [EObject current=null] : iv_rulePartitionElement= rulePartitionElement EOF ;
    public final EObject entryRulePartitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartitionElement = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3612:2: (iv_rulePartitionElement= rulePartitionElement EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3613:2: iv_rulePartitionElement= rulePartitionElement EOF
            {
             newCompositeNode(grammarAccess.getPartitionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartitionElement_in_entryRulePartitionElement8011);
            iv_rulePartitionElement=rulePartitionElement();

            state._fsp--;

             current =iv_rulePartitionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartitionElement8021); 

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
    // $ANTLR end "entryRulePartitionElement"


    // $ANTLR start "rulePartitionElement"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3620:1: rulePartitionElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_partitionelementconstant_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )* ) ;
    public final EObject rulePartitionElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_partitionelementconstant_2_0 = null;

        EObject lv_partitionelementconstant_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3623:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_partitionelementconstant_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )* ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3624:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_partitionelementconstant_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )* )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3624:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_partitionelementconstant_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )* )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3624:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_partitionelementconstant_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )*
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3624:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3625:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3625:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3626:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePartitionElement8063); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPartitionElementAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartitionElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePartitionElement8080); 

                	newLeafNode(otherlv_1, grammarAccess.getPartitionElementAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3646:1: ( (lv_partitionelementconstant_2_0= ruleTerm ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3647:1: (lv_partitionelementconstant_2_0= ruleTerm )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3647:1: (lv_partitionelementconstant_2_0= ruleTerm )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3648:3: lv_partitionelementconstant_2_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getPartitionElementAccess().getPartitionelementconstantTermParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rulePartitionElement8101);
            lv_partitionelementconstant_2_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartitionElementRule());
            	        }
                   		add(
                   			current, 
                   			"partitionelementconstant",
                    		lv_partitionelementconstant_2_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3664:2: (otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==14) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3664:4: otherlv_3= ',' ( (lv_partitionelementconstant_4_0= ruleTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePartitionElement8114); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPartitionElementAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3668:1: ( (lv_partitionelementconstant_4_0= ruleTerm ) )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3669:1: (lv_partitionelementconstant_4_0= ruleTerm )
            	    {
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3669:1: (lv_partitionelementconstant_4_0= ruleTerm )
            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3670:3: lv_partitionelementconstant_4_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartitionElementAccess().getPartitionelementconstantTermParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rulePartitionElement8135);
            	    lv_partitionelementconstant_4_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPartitionElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"partitionelementconstant",
            	            		lv_partitionelementconstant_4_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "rulePartitionElement"


    // $ANTLR start "entryRulePartitionsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3694:1: entryRulePartitionsBuiltInOperator returns [EObject current=null] : iv_rulePartitionsBuiltInOperator= rulePartitionsBuiltInOperator EOF ;
    public final EObject entryRulePartitionsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartitionsBuiltInOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3695:2: (iv_rulePartitionsBuiltInOperator= rulePartitionsBuiltInOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3696:2: iv_rulePartitionsBuiltInOperator= rulePartitionsBuiltInOperator EOF
            {
             newCompositeNode(grammarAccess.getPartitionsBuiltInOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartitionsBuiltInOperator_in_entryRulePartitionsBuiltInOperator8173);
            iv_rulePartitionsBuiltInOperator=rulePartitionsBuiltInOperator();

            state._fsp--;

             current =iv_rulePartitionsBuiltInOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartitionsBuiltInOperator8183); 

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
    // $ANTLR end "entryRulePartitionsBuiltInOperator"


    // $ANTLR start "rulePartitionsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3703:1: rulePartitionsBuiltInOperator returns [EObject current=null] : (otherlv_0= 'partition' otherlv_1= ':' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) ;
    public final EObject rulePartitionsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_subterm_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3706:28: ( (otherlv_0= 'partition' otherlv_1= ':' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3707:1: (otherlv_0= 'partition' otherlv_1= ':' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3707:1: (otherlv_0= 'partition' otherlv_1= ':' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3707:3: otherlv_0= 'partition' otherlv_1= ':' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePartitionsBuiltInOperator8220); 

                	newLeafNode(otherlv_0, grammarAccess.getPartitionsBuiltInOperatorAccess().getPartitionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePartitionsBuiltInOperator8232); 

                	newLeafNode(otherlv_1, grammarAccess.getPartitionsBuiltInOperatorAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3715:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3716:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartitionsBuiltInOperatorAccess().getPartitionElementOfAction_2(),
                        current);
                

            }

            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3721:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3722:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3722:1: (lv_name_3_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3723:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePartitionsBuiltInOperator8258); 

            			newLeafNode(lv_name_3_0, grammarAccess.getPartitionsBuiltInOperatorAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartitionsBuiltInOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePartitionsBuiltInOperator8275); 

                	newLeafNode(otherlv_4, grammarAccess.getPartitionsBuiltInOperatorAccess().getLeftParenthesisKeyword_4());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3743:1: ( (lv_subterm_5_0= ruleTerm ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3744:1: (lv_subterm_5_0= ruleTerm )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3744:1: (lv_subterm_5_0= ruleTerm )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3745:3: lv_subterm_5_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getPartitionsBuiltInOperatorAccess().getSubtermTermParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rulePartitionsBuiltInOperator8296);
            lv_subterm_5_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartitionsBuiltInOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"subterm",
                    		lv_subterm_5_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePartitionsBuiltInOperator8308); 

                	newLeafNode(otherlv_6, grammarAccess.getPartitionsBuiltInOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "rulePartitionsBuiltInOperator"


    // $ANTLR start "entryRuleStringSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3773:1: entryRuleStringSort returns [EObject current=null] : iv_ruleStringSort= ruleStringSort EOF ;
    public final EObject entryRuleStringSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3774:2: (iv_ruleStringSort= ruleStringSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3775:2: iv_ruleStringSort= ruleStringSort EOF
            {
             newCompositeNode(grammarAccess.getStringSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringSort_in_entryRuleStringSort8344);
            iv_ruleStringSort=ruleStringSort();

            state._fsp--;

             current =iv_ruleStringSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringSort8354); 

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
    // $ANTLR end "entryRuleStringSort"


    // $ANTLR start "ruleStringSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3782:1: ruleStringSort returns [EObject current=null] : (otherlv_0= 'STRING' () ) ;
    public final EObject ruleStringSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3785:28: ( (otherlv_0= 'STRING' () ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3786:1: (otherlv_0= 'STRING' () )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3786:1: (otherlv_0= 'STRING' () )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3786:3: otherlv_0= 'STRING' ()
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleStringSort8391); 

                	newLeafNode(otherlv_0, grammarAccess.getStringSortAccess().getSTRINGKeyword_0());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3790:1: ()
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3791:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringSortAccess().getStringAction_1(),
                        current);
                

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
    // $ANTLR end "ruleStringSort"


    // $ANTLR start "entryRuleStringsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3804:1: entryRuleStringsBuiltInOperator returns [EObject current=null] : iv_ruleStringsBuiltInOperator= ruleStringsBuiltInOperator EOF ;
    public final EObject entryRuleStringsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringsBuiltInOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3805:2: (iv_ruleStringsBuiltInOperator= ruleStringsBuiltInOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3806:2: iv_ruleStringsBuiltInOperator= ruleStringsBuiltInOperator EOF
            {
             newCompositeNode(grammarAccess.getStringsBuiltInOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringsBuiltInOperator_in_entryRuleStringsBuiltInOperator8436);
            iv_ruleStringsBuiltInOperator=ruleStringsBuiltInOperator();

            state._fsp--;

             current =iv_ruleStringsBuiltInOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringsBuiltInOperator8446); 

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
    // $ANTLR end "entryRuleStringsBuiltInOperator"


    // $ANTLR start "ruleStringsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3813:1: ruleStringsBuiltInOperator returns [EObject current=null] : ( (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' ) | (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' ) ) ;
    public final EObject ruleStringsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_5_0 = null;

        EObject lv_subterm_10_0 = null;

        AntlrDatatypeRuleToken lv_start_15_0 = null;

        AntlrDatatypeRuleToken lv_length_17_0 = null;

        EObject lv_subterm_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3816:28: ( ( (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' ) | (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3817:1: ( (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' ) | (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3817:1: ( (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' ) | (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt40=1;
                }
                break;
            case 79:
                {
                alt40=2;
                }
                break;
            case 80:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3817:2: (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3817:2: (otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3817:4: otherlv_0= 'concatstring' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleStringsBuiltInOperator8484); 

                        	newLeafNode(otherlv_0, grammarAccess.getStringsBuiltInOperatorAccess().getConcatstringKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringsBuiltInOperator8496); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringsBuiltInOperatorAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3825:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3826:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringsBuiltInOperatorAccess().getConcatenationAction_0_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3831:2: ( (lv_subterm_3_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3832:1: (lv_subterm_3_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3832:1: (lv_subterm_3_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3833:3: lv_subterm_3_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermTermParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8526);
                    lv_subterm_3_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_3_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStringsBuiltInOperator8538); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringsBuiltInOperatorAccess().getCommaKeyword_0_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3853:1: ( (lv_subterm_5_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3854:1: (lv_subterm_5_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3854:1: (lv_subterm_5_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3855:3: lv_subterm_5_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermTermParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8559);
                    lv_subterm_5_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_5_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringsBuiltInOperator8571); 

                        	newLeafNode(otherlv_6, grammarAccess.getStringsBuiltInOperatorAccess().getRightParenthesisKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3876:6: (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3876:6: (otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3876:8: otherlv_7= 'stringlength' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleStringsBuiltInOperator8591); 

                        	newLeafNode(otherlv_7, grammarAccess.getStringsBuiltInOperatorAccess().getStringlengthKeyword_1_0());
                        
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringsBuiltInOperator8603); 

                        	newLeafNode(otherlv_8, grammarAccess.getStringsBuiltInOperatorAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3884:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3885:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringsBuiltInOperatorAccess().getLengthAction_1_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3890:2: ( (lv_subterm_10_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3891:1: (lv_subterm_10_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3891:1: (lv_subterm_10_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3892:3: lv_subterm_10_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8633);
                    lv_subterm_10_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_10_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringsBuiltInOperator8645); 

                        	newLeafNode(otherlv_11, grammarAccess.getStringsBuiltInOperatorAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3913:6: (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3913:6: (otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3913:8: otherlv_12= 'substring' () otherlv_14= ':' ( (lv_start_15_0= ruleNAT ) ) otherlv_16= ',' ( (lv_length_17_0= ruleNAT ) ) otherlv_18= '(' ( (lv_subterm_19_0= ruleTerm ) ) otherlv_20= ')'
                    {
                    otherlv_12=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleStringsBuiltInOperator8665); 

                        	newLeafNode(otherlv_12, grammarAccess.getStringsBuiltInOperatorAccess().getSubstringKeyword_2_0());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3917:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3918:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringsBuiltInOperatorAccess().getSubstringAction_2_1(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStringsBuiltInOperator8686); 

                        	newLeafNode(otherlv_14, grammarAccess.getStringsBuiltInOperatorAccess().getColonKeyword_2_2());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3927:1: ( (lv_start_15_0= ruleNAT ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3928:1: (lv_start_15_0= ruleNAT )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3928:1: (lv_start_15_0= ruleNAT )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3929:3: lv_start_15_0= ruleNAT
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getStartNATParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNAT_in_ruleStringsBuiltInOperator8707);
                    lv_start_15_0=ruleNAT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_15_0, 
                            		"NAT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStringsBuiltInOperator8719); 

                        	newLeafNode(otherlv_16, grammarAccess.getStringsBuiltInOperatorAccess().getCommaKeyword_2_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3949:1: ( (lv_length_17_0= ruleNAT ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3950:1: (lv_length_17_0= ruleNAT )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3950:1: (lv_length_17_0= ruleNAT )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3951:3: lv_length_17_0= ruleNAT
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getLengthNATParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNAT_in_ruleStringsBuiltInOperator8740);
                    lv_length_17_0=ruleNAT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_17_0, 
                            		"NAT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringsBuiltInOperator8752); 

                        	newLeafNode(otherlv_18, grammarAccess.getStringsBuiltInOperatorAccess().getLeftParenthesisKeyword_2_6());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3971:1: ( (lv_subterm_19_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3972:1: (lv_subterm_19_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3972:1: (lv_subterm_19_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:3973:3: lv_subterm_19_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermTermParserRuleCall_2_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8773);
                    lv_subterm_19_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_19_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringsBuiltInOperator8785); 

                        	newLeafNode(otherlv_20, grammarAccess.getStringsBuiltInOperatorAccess().getRightParenthesisKeyword_2_8());
                        

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
    // $ANTLR end "ruleStringsBuiltInOperator"


    // $ANTLR start "entryRuleStringConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4001:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4002:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4003:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
             newCompositeNode(grammarAccess.getStringConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringConstant_in_entryRuleStringConstant8822);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;

             current =iv_ruleStringConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringConstant8832); 

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
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4010:1: ruleStringConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4013:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4014:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4014:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4015:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4015:1: (lv_value_0_0= RULE_STRING )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4016:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringConstant8873); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleListSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4040:1: entryRuleListSort returns [EObject current=null] : iv_ruleListSort= ruleListSort EOF ;
    public final EObject entryRuleListSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListSort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4041:2: (iv_ruleListSort= ruleListSort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4042:2: iv_ruleListSort= ruleListSort EOF
            {
             newCompositeNode(grammarAccess.getListSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListSort_in_entryRuleListSort8913);
            iv_ruleListSort=ruleListSort();

            state._fsp--;

             current =iv_ruleListSort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListSort8923); 

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
    // $ANTLR end "entryRuleListSort"


    // $ANTLR start "ruleListSort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4049:1: ruleListSort returns [EObject current=null] : (otherlv_0= 'LIST' otherlv_1= ':' ( (lv_basis_2_0= ruleSort ) ) ) ;
    public final EObject ruleListSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_basis_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4052:28: ( (otherlv_0= 'LIST' otherlv_1= ':' ( (lv_basis_2_0= ruleSort ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4053:1: (otherlv_0= 'LIST' otherlv_1= ':' ( (lv_basis_2_0= ruleSort ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4053:1: (otherlv_0= 'LIST' otherlv_1= ':' ( (lv_basis_2_0= ruleSort ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4053:3: otherlv_0= 'LIST' otherlv_1= ':' ( (lv_basis_2_0= ruleSort ) )
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleListSort8960); 

                	newLeafNode(otherlv_0, grammarAccess.getListSortAccess().getLISTKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleListSort8972); 

                	newLeafNode(otherlv_1, grammarAccess.getListSortAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4061:1: ( (lv_basis_2_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4062:1: (lv_basis_2_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4062:1: (lv_basis_2_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4063:3: lv_basis_2_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getListSortAccess().getBasisSortParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleListSort8993);
            lv_basis_2_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListSortRule());
            	        }
                   		set(
                   			current, 
                   			"basis",
                    		lv_basis_2_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleListSort"


    // $ANTLR start "entryRuleListsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4087:1: entryRuleListsBuiltInOperator returns [EObject current=null] : iv_ruleListsBuiltInOperator= ruleListsBuiltInOperator EOF ;
    public final EObject entryRuleListsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListsBuiltInOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4088:2: (iv_ruleListsBuiltInOperator= ruleListsBuiltInOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4089:2: iv_ruleListsBuiltInOperator= ruleListsBuiltInOperator EOF
            {
             newCompositeNode(grammarAccess.getListsBuiltInOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListsBuiltInOperator_in_entryRuleListsBuiltInOperator9029);
            iv_ruleListsBuiltInOperator=ruleListsBuiltInOperator();

            state._fsp--;

             current =iv_ruleListsBuiltInOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListsBuiltInOperator9039); 

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
    // $ANTLR end "entryRuleListsBuiltInOperator"


    // $ANTLR start "ruleListsBuiltInOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4096:1: ruleListsBuiltInOperator returns [EObject current=null] : ( (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' ) | (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' ) | (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' ) | (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' ) | (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' ) ) ;
    public final EObject ruleListsBuiltInOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        EObject lv_subterm_3_0 = null;

        EObject lv_subterm_5_0 = null;

        EObject lv_subterm_10_0 = null;

        EObject lv_subterm_12_0 = null;

        EObject lv_subterm_17_0 = null;

        AntlrDatatypeRuleToken lv_start_22_0 = null;

        AntlrDatatypeRuleToken lv_length_24_0 = null;

        EObject lv_subterm_26_0 = null;

        AntlrDatatypeRuleToken lv_index_31_0 = null;

        EObject lv_subterm_33_0 = null;

        EObject lv_refsort_38_0 = null;

        EObject lv_subterm_40_0 = null;

        EObject lv_subterm_42_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4099:28: ( ( (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' ) | (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' ) | (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' ) | (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' ) | (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4100:1: ( (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' ) | (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' ) | (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' ) | (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' ) | (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4100:1: ( (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' ) | (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' ) | (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' ) | (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' ) | (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' ) | (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt43=1;
                }
                break;
            case 83:
                {
                alt43=2;
                }
                break;
            case 84:
                {
                alt43=3;
                }
                break;
            case 85:
                {
                alt43=4;
                }
                break;
            case 86:
                {
                alt43=5;
                }
                break;
            case 87:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4100:2: (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4100:2: (otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4100:4: otherlv_0= 'concatlists' otherlv_1= '(' () ( (lv_subterm_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_subterm_5_0= ruleTerm ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleListsBuiltInOperator9077); 

                        	newLeafNode(otherlv_0, grammarAccess.getListsBuiltInOperatorAccess().getConcatlistsKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9089); 

                        	newLeafNode(otherlv_1, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4108:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4109:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getConcatenationAction_0_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4114:2: ( (lv_subterm_3_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4115:1: (lv_subterm_3_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4115:1: (lv_subterm_3_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4116:3: lv_subterm_3_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9119);
                    lv_subterm_3_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_3_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleListsBuiltInOperator9131); 

                        	newLeafNode(otherlv_4, grammarAccess.getListsBuiltInOperatorAccess().getCommaKeyword_0_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4136:1: ( (lv_subterm_5_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4137:1: (lv_subterm_5_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4137:1: (lv_subterm_5_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4138:3: lv_subterm_5_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9152);
                    lv_subterm_5_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_5_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9164); 

                        	newLeafNode(otherlv_6, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4159:6: (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4159:6: (otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4159:8: otherlv_7= 'appendtolist' otherlv_8= '(' () ( (lv_subterm_10_0= ruleTerm ) ) otherlv_11= ',' ( (lv_subterm_12_0= ruleTerm ) ) otherlv_13= ')'
                    {
                    otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleListsBuiltInOperator9184); 

                        	newLeafNode(otherlv_7, grammarAccess.getListsBuiltInOperatorAccess().getAppendtolistKeyword_1_0());
                        
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9196); 

                        	newLeafNode(otherlv_8, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4167:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4168:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getAppendAction_1_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4173:2: ( (lv_subterm_10_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4174:1: (lv_subterm_10_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4174:1: (lv_subterm_10_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4175:3: lv_subterm_10_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9226);
                    lv_subterm_10_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_10_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleListsBuiltInOperator9238); 

                        	newLeafNode(otherlv_11, grammarAccess.getListsBuiltInOperatorAccess().getCommaKeyword_1_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4195:1: ( (lv_subterm_12_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4196:1: (lv_subterm_12_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4196:1: (lv_subterm_12_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4197:3: lv_subterm_12_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9259);
                    lv_subterm_12_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_12_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9271); 

                        	newLeafNode(otherlv_13, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_1_6());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4218:6: (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4218:6: (otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4218:8: otherlv_14= 'listlength' otherlv_15= '(' () ( (lv_subterm_17_0= ruleTerm ) ) otherlv_18= ')'
                    {
                    otherlv_14=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleListsBuiltInOperator9291); 

                        	newLeafNode(otherlv_14, grammarAccess.getListsBuiltInOperatorAccess().getListlengthKeyword_2_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9303); 

                        	newLeafNode(otherlv_15, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4226:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4227:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getLengthAction_2_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4232:2: ( (lv_subterm_17_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4233:1: (lv_subterm_17_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4233:1: (lv_subterm_17_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4234:3: lv_subterm_17_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9333);
                    lv_subterm_17_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_17_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9345); 

                        	newLeafNode(otherlv_18, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4255:6: (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4255:6: (otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4255:8: otherlv_19= 'sublist' otherlv_20= ':' () ( (lv_start_22_0= ruleNAT ) ) otherlv_23= ',' ( (lv_length_24_0= ruleNAT ) ) otherlv_25= '(' ( (lv_subterm_26_0= ruleTerm ) ) otherlv_27= ')'
                    {
                    otherlv_19=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleListsBuiltInOperator9365); 

                        	newLeafNode(otherlv_19, grammarAccess.getListsBuiltInOperatorAccess().getSublistKeyword_3_0());
                        
                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleListsBuiltInOperator9377); 

                        	newLeafNode(otherlv_20, grammarAccess.getListsBuiltInOperatorAccess().getColonKeyword_3_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4263:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4264:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getSublistAction_3_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4269:2: ( (lv_start_22_0= ruleNAT ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4270:1: (lv_start_22_0= ruleNAT )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4270:1: (lv_start_22_0= ruleNAT )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4271:3: lv_start_22_0= ruleNAT
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getStartNATParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9407);
                    lv_start_22_0=ruleNAT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_22_0, 
                            		"NAT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleListsBuiltInOperator9419); 

                        	newLeafNode(otherlv_23, grammarAccess.getListsBuiltInOperatorAccess().getCommaKeyword_3_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4291:1: ( (lv_length_24_0= ruleNAT ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4292:1: (lv_length_24_0= ruleNAT )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4292:1: (lv_length_24_0= ruleNAT )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4293:3: lv_length_24_0= ruleNAT
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getLengthNATParserRuleCall_3_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9440);
                    lv_length_24_0=ruleNAT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_24_0, 
                            		"NAT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_25=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9452); 

                        	newLeafNode(otherlv_25, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_3_6());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4313:1: ( (lv_subterm_26_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4314:1: (lv_subterm_26_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4314:1: (lv_subterm_26_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4315:3: lv_subterm_26_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_3_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9473);
                    lv_subterm_26_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_26_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9485); 

                        	newLeafNode(otherlv_27, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_3_8());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4336:6: (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4336:6: (otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4336:8: otherlv_28= 'memberat' otherlv_29= ':' () ( (lv_index_31_0= ruleNAT ) ) otherlv_32= '(' ( (lv_subterm_33_0= ruleTerm ) ) otherlv_34= ')'
                    {
                    otherlv_28=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleListsBuiltInOperator9505); 

                        	newLeafNode(otherlv_28, grammarAccess.getListsBuiltInOperatorAccess().getMemberatKeyword_4_0());
                        
                    otherlv_29=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleListsBuiltInOperator9517); 

                        	newLeafNode(otherlv_29, grammarAccess.getListsBuiltInOperatorAccess().getColonKeyword_4_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4344:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4345:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getMemberAtIndexAction_4_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4350:2: ( (lv_index_31_0= ruleNAT ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4351:1: (lv_index_31_0= ruleNAT )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4351:1: (lv_index_31_0= ruleNAT )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4352:3: lv_index_31_0= ruleNAT
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getIndexNATParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9547);
                    lv_index_31_0=ruleNAT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"index",
                            		lv_index_31_0, 
                            		"NAT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_32=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9559); 

                        	newLeafNode(otherlv_32, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_4_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4372:1: ( (lv_subterm_33_0= ruleTerm ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4373:1: (lv_subterm_33_0= ruleTerm )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4373:1: (lv_subterm_33_0= ruleTerm )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4374:3: lv_subterm_33_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_4_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9580);
                    lv_subterm_33_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"subterm",
                            		lv_subterm_33_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_34=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9592); 

                        	newLeafNode(otherlv_34, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_4_6());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4395:6: (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4395:6: (otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')' )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4395:8: otherlv_35= 'makelist' otherlv_36= ':' () ( (lv_refsort_38_0= ruleSort ) ) otherlv_39= '(' ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )? otherlv_43= ')'
                    {
                    otherlv_35=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleListsBuiltInOperator9612); 

                        	newLeafNode(otherlv_35, grammarAccess.getListsBuiltInOperatorAccess().getMakelistKeyword_5_0());
                        
                    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleListsBuiltInOperator9624); 

                        	newLeafNode(otherlv_36, grammarAccess.getListsBuiltInOperatorAccess().getColonKeyword_5_1());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4403:1: ()
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4404:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getListsBuiltInOperatorAccess().getMakeListAction_5_2(),
                                current);
                        

                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4409:2: ( (lv_refsort_38_0= ruleSort ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4410:1: (lv_refsort_38_0= ruleSort )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4410:1: (lv_refsort_38_0= ruleSort )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4411:3: lv_refsort_38_0= ruleSort
                    {
                     
                    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getRefsortSortParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleListsBuiltInOperator9654);
                    lv_refsort_38_0=ruleSort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"refsort",
                            		lv_refsort_38_0, 
                            		"Sort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_39=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleListsBuiltInOperator9666); 

                        	newLeafNode(otherlv_39, grammarAccess.getListsBuiltInOperatorAccess().getLeftParenthesisKeyword_5_4());
                        
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4431:1: ( ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==21||(LA42_0>=53 && LA42_0<=57)||LA42_0==59||(LA42_0>=61 && LA42_0<=62)||(LA42_0>=70 && LA42_0<=71)||LA42_0==75||(LA42_0>=78 && LA42_0<=80)||(LA42_0>=82 && LA42_0<=88)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4431:2: ( (lv_subterm_40_0= ruleTerm ) ) (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )*
                            {
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4431:2: ( (lv_subterm_40_0= ruleTerm ) )
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4432:1: (lv_subterm_40_0= ruleTerm )
                            {
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4432:1: (lv_subterm_40_0= ruleTerm )
                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4433:3: lv_subterm_40_0= ruleTerm
                            {
                             
                            	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_5_5_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9688);
                            lv_subterm_40_0=ruleTerm();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"subterm",
                                    		lv_subterm_40_0, 
                                    		"Term");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4449:2: (otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==14) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4449:4: otherlv_41= ',' ( (lv_subterm_42_0= ruleTerm ) )
                            	    {
                            	    otherlv_41=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleListsBuiltInOperator9701); 

                            	        	newLeafNode(otherlv_41, grammarAccess.getListsBuiltInOperatorAccess().getCommaKeyword_5_5_1_0());
                            	        
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4453:1: ( (lv_subterm_42_0= ruleTerm ) )
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4454:1: (lv_subterm_42_0= ruleTerm )
                            	    {
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4454:1: (lv_subterm_42_0= ruleTerm )
                            	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4455:3: lv_subterm_42_0= ruleTerm
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getListsBuiltInOperatorAccess().getSubtermTermParserRuleCall_5_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9722);
                            	    lv_subterm_42_0=ruleTerm();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getListsBuiltInOperatorRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"subterm",
                            	            		lv_subterm_42_0, 
                            	            		"Term");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_43=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleListsBuiltInOperator9738); 

                        	newLeafNode(otherlv_43, grammarAccess.getListsBuiltInOperatorAccess().getRightParenthesisKeyword_5_6());
                        

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
    // $ANTLR end "ruleListsBuiltInOperator"


    // $ANTLR start "entryRuleListConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4483:1: entryRuleListConstant returns [EObject current=null] : iv_ruleListConstant= ruleListConstant EOF ;
    public final EObject entryRuleListConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListConstant = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4484:2: (iv_ruleListConstant= ruleListConstant EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4485:2: iv_ruleListConstant= ruleListConstant EOF
            {
             newCompositeNode(grammarAccess.getListConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListConstant_in_entryRuleListConstant9775);
            iv_ruleListConstant=ruleListConstant();

            state._fsp--;

             current =iv_ruleListConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListConstant9785); 

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
    // $ANTLR end "entryRuleListConstant"


    // $ANTLR start "ruleListConstant"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4492:1: ruleListConstant returns [EObject current=null] : (otherlv_0= 'emptylist' otherlv_1= ':' ( (lv_refsort_2_0= ruleSort ) ) ) ;
    public final EObject ruleListConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_refsort_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4495:28: ( (otherlv_0= 'emptylist' otherlv_1= ':' ( (lv_refsort_2_0= ruleSort ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4496:1: (otherlv_0= 'emptylist' otherlv_1= ':' ( (lv_refsort_2_0= ruleSort ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4496:1: (otherlv_0= 'emptylist' otherlv_1= ':' ( (lv_refsort_2_0= ruleSort ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4496:3: otherlv_0= 'emptylist' otherlv_1= ':' ( (lv_refsort_2_0= ruleSort ) )
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleListConstant9822); 

                	newLeafNode(otherlv_0, grammarAccess.getListConstantAccess().getEmptylistKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleListConstant9834); 

                	newLeafNode(otherlv_1, grammarAccess.getListConstantAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4504:1: ( (lv_refsort_2_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4505:1: (lv_refsort_2_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4505:1: (lv_refsort_2_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4506:3: lv_refsort_2_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getListConstantAccess().getRefsortSortParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleListConstant9855);
            lv_refsort_2_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListConstantRule());
            	        }
                   		set(
                   			current, 
                   			"refsort",
                    		lv_refsort_2_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleListConstant"


    // $ANTLR start "entryRuleArbitrarySort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4530:1: entryRuleArbitrarySort returns [EObject current=null] : iv_ruleArbitrarySort= ruleArbitrarySort EOF ;
    public final EObject entryRuleArbitrarySort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitrarySort = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4531:2: (iv_ruleArbitrarySort= ruleArbitrarySort EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4532:2: iv_ruleArbitrarySort= ruleArbitrarySort EOF
            {
             newCompositeNode(grammarAccess.getArbitrarySortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArbitrarySort_in_entryRuleArbitrarySort9891);
            iv_ruleArbitrarySort=ruleArbitrarySort();

            state._fsp--;

             current =iv_ruleArbitrarySort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArbitrarySort9901); 

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
    // $ANTLR end "entryRuleArbitrarySort"


    // $ANTLR start "ruleArbitrarySort"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4539:1: ruleArbitrarySort returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleArbitrarySort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4542:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4543:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4543:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4544:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4544:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4545:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleArbitrarySort9942); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArbitrarySortAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArbitrarySortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleArbitrarySort"


    // $ANTLR start "entryRuleArbitraryOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4569:1: entryRuleArbitraryOperator returns [EObject current=null] : iv_ruleArbitraryOperator= ruleArbitraryOperator EOF ;
    public final EObject entryRuleArbitraryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitraryOperator = null;


        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4570:2: (iv_ruleArbitraryOperator= ruleArbitraryOperator EOF )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4571:2: iv_ruleArbitraryOperator= ruleArbitraryOperator EOF
            {
             newCompositeNode(grammarAccess.getArbitraryOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArbitraryOperator_in_entryRuleArbitraryOperator9982);
            iv_ruleArbitraryOperator=ruleArbitraryOperator();

            state._fsp--;

             current =iv_ruleArbitraryOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArbitraryOperator9992); 

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
    // $ANTLR end "entryRuleArbitraryOperator"


    // $ANTLR start "ruleArbitraryOperator"
    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4578:1: ruleArbitraryOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )? otherlv_5= '->' ( (lv_output_6_0= ruleSort ) ) ) ;
    public final EObject ruleArbitraryOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_input_2_0 = null;

        EObject lv_input_4_0 = null;

        EObject lv_output_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4581:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )? otherlv_5= '->' ( (lv_output_6_0= ruleSort ) ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4582:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )? otherlv_5= '->' ( (lv_output_6_0= ruleSort ) ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4582:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )? otherlv_5= '->' ( (lv_output_6_0= ruleSort ) ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4582:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )? otherlv_5= '->' ( (lv_output_6_0= ruleSort ) )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4582:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4583:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4583:1: (lv_name_0_0= RULE_ID )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4584:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleArbitraryOperator10034); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArbitraryOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArbitraryOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArbitraryOperator10051); 

                	newLeafNode(otherlv_1, grammarAccess.getArbitraryOperatorAccess().getColonKeyword_1());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4604:1: ( ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==21||LA45_0==23||LA45_0==58||LA45_0==60||(LA45_0>=63 && LA45_0<=66)||LA45_0==69||LA45_0==72||LA45_0==77||LA45_0==81) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4604:2: ( (lv_input_2_0= ruleSort ) ) (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )*
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4604:2: ( (lv_input_2_0= ruleSort ) )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4605:1: (lv_input_2_0= ruleSort )
                    {
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4605:1: (lv_input_2_0= ruleSort )
                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4606:3: lv_input_2_0= ruleSort
                    {
                     
                    	        newCompositeNode(grammarAccess.getArbitraryOperatorAccess().getInputSortParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleArbitraryOperator10073);
                    lv_input_2_0=ruleSort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArbitraryOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"input",
                            		lv_input_2_0, 
                            		"Sort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4622:2: (otherlv_3= ',' ( (lv_input_4_0= ruleSort ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4622:4: otherlv_3= ',' ( (lv_input_4_0= ruleSort ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArbitraryOperator10086); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArbitraryOperatorAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4626:1: ( (lv_input_4_0= ruleSort ) )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4627:1: (lv_input_4_0= ruleSort )
                    	    {
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4627:1: (lv_input_4_0= ruleSort )
                    	    // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4628:3: lv_input_4_0= ruleSort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArbitraryOperatorAccess().getInputSortParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleArbitraryOperator10107);
                    	    lv_input_4_0=ruleSort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArbitraryOperatorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"input",
                    	            		lv_input_4_0, 
                    	            		"Sort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleArbitraryOperator10123); 

                	newLeafNode(otherlv_5, grammarAccess.getArbitraryOperatorAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4648:1: ( (lv_output_6_0= ruleSort ) )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4649:1: (lv_output_6_0= ruleSort )
            {
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4649:1: (lv_output_6_0= ruleSort )
            // ../org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax/src-gen/org/pnml/tools/epnk/pntypes/hlpngs/datatypes/concretesyntax/parser/antlr/internal/InternalHLPNGInscriptionLanguage.g:4650:3: lv_output_6_0= ruleSort
            {
             
            	        newCompositeNode(grammarAccess.getArbitraryOperatorAccess().getOutputSortParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleArbitraryOperator10144);
            lv_output_6_0=ruleSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArbitraryOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"output",
                    		lv_output_6_0, 
                    		"Sort");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleArbitraryOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarations_in_ruleDocument132 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDocument144 = new BitSet(new long[]{0x6BE000000027B072L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleDocument173 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDocument185 = new BitSet(new long[]{0x6BE000000027B072L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleDeclarations_in_entryRuleDeclarations223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarations233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleDeclarations281 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleSortDecl_in_ruleDeclarations302 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleDeclarations315 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleSortDecl_in_ruleDeclarations336 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleDeclarations350 = new BitSet(new long[]{0x000000000007A002L});
        public static final BitSet FOLLOW_15_in_ruleDeclarations370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleDeclarations391 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleDeclarations404 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleDeclarations425 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleDeclarations439 = new BitSet(new long[]{0x000000000007A002L});
        public static final BitSet FOLLOW_16_in_ruleDeclarations459 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperatorDecl_in_ruleDeclarations480 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleDeclarations493 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperatorDecl_in_ruleDeclarations514 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleDeclarations528 = new BitSet(new long[]{0x000000000007A002L});
        public static final BitSet FOLLOW_17_in_ruleDeclarations548 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleArbitrarySort_in_ruleDeclarations569 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleDeclarations582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleArbitrarySort_in_ruleDeclarations603 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleDeclarations617 = new BitSet(new long[]{0x000000000007A002L});
        public static final BitSet FOLLOW_18_in_ruleDeclarations637 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleArbitraryOperator_in_ruleDeclarations658 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleDeclarations671 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleArbitraryOperator_in_ruleDeclarations692 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleDeclarations706 = new BitSet(new long[]{0x000000000007A002L});
        public static final BitSet FOLLOW_ruleSortDecl_in_entryRuleSortDecl747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSortDecl757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedSort_in_ruleSortDecl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartition_in_ruleSortDecl831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDecl918 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleVariableDecl935 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleVariableDecl956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedSort_in_entryRuleNamedSort992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedSort1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedSort1044 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleNamedSort1061 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleNamedSort1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperatorDecl_in_entryRuleOperatorDecl1118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDecl1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedOperator_in_ruleOperatorDecl1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedOperator_in_entryRuleNamedOperator1208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedOperator1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedOperator1260 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNamedOperator1277 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleNamedOperator1299 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleNamedOperator1312 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleNamedOperator1333 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleNamedOperator1349 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleNamedOperator1361 = new BitSet(new long[]{0x6BE000000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleNamedOperator1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_entryRuleSort1418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSort1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuiltInSort_in_ruleSort1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiSetSort_in_ruleSort1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductSort_in_ruleSort1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserSort_in_ruleSort1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiSetSort_in_entryRuleMultiSetSort1591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiSetSort1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMultiSetSort1638 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMultiSetSort1650 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleMultiSetSort1671 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMultiSetSort1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductSort_in_entryRuleProductSort1719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductSort1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleProductSort1766 = new BitSet(new long[]{0x9400000000E00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleProductSort1797 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleProductSort1810 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleProductSort1831 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleProductSort1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserSort_in_entryRuleUserSort1883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUserSort1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUserSort1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm1_in_ruleTerm2030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm1_in_entryRuleTerm12064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm12074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm2_in_ruleTerm12121 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_25_in_ruleTerm12143 = new BitSet(new long[]{0x6BE000000627B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm2_in_ruleTerm12164 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_26_in_ruleTerm12193 = new BitSet(new long[]{0x6BE000000627B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm2_in_ruleTerm12214 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_ruleTerm2_in_entryRuleTerm22253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm22263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm3_in_ruleTerm22310 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleTerm22331 = new BitSet(new long[]{0x6BE000000827B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm3_in_ruleTerm22352 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleTerm3_in_entryRuleTerm32390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm32400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32447 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_28_in_ruleTerm32469 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32490 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_29_in_ruleTerm32519 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32540 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_30_in_ruleTerm32569 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32590 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_31_in_ruleTerm32619 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32640 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_32_in_ruleTerm32669 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32690 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_33_in_ruleTerm32719 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32740 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_34_in_ruleTerm32769 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32790 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_35_in_ruleTerm32819 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32840 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_36_in_ruleTerm32869 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32890 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_37_in_ruleTerm32919 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32940 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_38_in_ruleTerm32969 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm32990 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_39_in_ruleTerm33019 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm33040 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_40_in_ruleTerm33069 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm33090 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_41_in_ruleTerm33119 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm33140 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_42_in_ruleTerm33169 = new BitSet(new long[]{0x6BE007FFF027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm4_in_ruleTerm33190 = new BitSet(new long[]{0x000007FFF0000002L});
        public static final BitSet FOLLOW_ruleTerm4_in_entryRuleTerm43229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm43239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm5_in_ruleTerm43286 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_43_in_ruleTerm43308 = new BitSet(new long[]{0x6BE018000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm5_in_ruleTerm43329 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_44_in_ruleTerm43358 = new BitSet(new long[]{0x6BE018000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm5_in_ruleTerm43379 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_ruleTerm5_in_entryRuleTerm53418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm53428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm6_in_ruleTerm53475 = new BitSet(new long[]{0x0000600000000002L});
        public static final BitSet FOLLOW_45_in_ruleTerm53497 = new BitSet(new long[]{0x6BE060000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm6_in_ruleTerm53518 = new BitSet(new long[]{0x0000600000000002L});
        public static final BitSet FOLLOW_46_in_ruleTerm53547 = new BitSet(new long[]{0x6BE060000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm6_in_ruleTerm53568 = new BitSet(new long[]{0x0000600000000002L});
        public static final BitSet FOLLOW_ruleTerm6_in_entryRuleTerm63607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm63617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm7_in_ruleTerm63664 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleTerm63685 = new BitSet(new long[]{0x6BE080000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm7_in_ruleTerm63706 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_ruleTerm7_in_entryRuleTerm73744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm73754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm8_in_ruleTerm73801 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTerm73823 = new BitSet(new long[]{0x6BE300000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm8_in_ruleTerm73844 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTerm73873 = new BitSet(new long[]{0x6BE300000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm8_in_ruleTerm73894 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_ruleTerm8_in_entryRuleTerm83933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm83943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm83990 = new BitSet(new long[]{0x001C000001000002L});
        public static final BitSet FOLLOW_24_in_ruleTerm84012 = new BitSet(new long[]{0x6BFC00000127B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm84033 = new BitSet(new long[]{0x001C000001000002L});
        public static final BitSet FOLLOW_50_in_ruleTerm84062 = new BitSet(new long[]{0x6BFC00000127B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm84083 = new BitSet(new long[]{0x001C000001000002L});
        public static final BitSet FOLLOW_51_in_ruleTerm84112 = new BitSet(new long[]{0x6BFC00000127B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm84133 = new BitSet(new long[]{0x001C000001000002L});
        public static final BitSet FOLLOW_52_in_ruleTerm84162 = new BitSet(new long[]{0x6BFC00000127B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm84183 = new BitSet(new long[]{0x001C000001000002L});
        public static final BitSet FOLLOW_ruleTerm9_in_entryRuleTerm94222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm94232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTerm94270 = new BitSet(new long[]{0x6BE000000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm9_in_ruleTerm94300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm10_in_ruleTerm94329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm10_in_entryRuleTerm104364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm104374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleTerm104421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserOperator_in_ruleTerm104448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOtherBuiltInOperator_in_ruleTerm104475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuiltInConst_in_ruleTerm104502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTerm104520 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleTerm104542 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleTerm104554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleTerm104573 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleTerm104603 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleTerm104616 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleTerm104637 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleTerm104651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable4700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserOperator_in_entryRuleUserOperator4781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUserOperator4791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUserOperator4833 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleUserOperator4850 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleUserOperator4872 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleUserOperator4885 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleUserOperator4906 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleUserOperator4922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOtherBuiltInOperator_in_entryRuleOtherBuiltInOperator4958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOtherBuiltInOperator4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOtherBuiltInOperator5006 = new BitSet(new long[]{0x6BE000000027B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm10_in_ruleOtherBuiltInOperator5036 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleOtherBuiltInOperator5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleOtherBuiltInOperator5068 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleOtherBuiltInOperator5098 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOtherBuiltInOperator5110 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleOtherBuiltInOperator5131 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleOtherBuiltInOperator5143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCyclicEnumsBuiltInOperator_in_ruleOtherBuiltInOperator5172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartitionsBuiltInOperator_in_ruleOtherBuiltInOperator5199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringsBuiltInOperator_in_ruleOtherBuiltInOperator5226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListsBuiltInOperator_in_ruleOtherBuiltInOperator5253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuiltInSort_in_entryRuleBuiltInSort5288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInSort5298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDot_in_ruleBuiltInSort5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleBuiltInSort5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleBuiltInSort5399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteEnumeration_in_ruleBuiltInSort5426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCyclicEnumeration_in_ruleBuiltInSort5453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteIntRange_in_ruleBuiltInSort5480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringSort_in_ruleBuiltInSort5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListSort_in_ruleBuiltInSort5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuiltInConst_in_entryRuleBuiltInConst5569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInConst5579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotConstant_in_ruleBuiltInConst5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanConstant_in_ruleBuiltInConst5653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultisetConstant_in_ruleBuiltInConst5680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberConstant_in_ruleBuiltInConst5707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteIntRangeConstant_in_ruleBuiltInConst5734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringConstant_in_ruleBuiltInConst5761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListConstant_in_ruleBuiltInConst5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultisetConstant_in_entryRuleMultisetConstant5823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultisetConstant5833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMultisetConstant5871 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultisetConstant5892 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleMultisetConstant5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMultisetConstant5933 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultisetConstant5954 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleMultisetConstant5975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDot_in_entryRuleDot6012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDot6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleDot6059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotConstant_in_entryRuleDotConstant6104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotConstant6114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleDotConstant6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean6196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean6206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleBoolean6243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanConstant_in_entryRuleBooleanConstant6288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanConstant6298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleBooleanConstant6351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleBooleanConstant6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6419 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber6429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleNumber6467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleNumber6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleNumber6525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberConstant_in_entryRuleNumberConstant6571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstant6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleNumberConstant6636 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNumberConstant6649 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleNumberConstant6670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER6709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTSTRING_in_ruleINTEGER6759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNAT_in_entryRuleNAT6804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNAT6815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTSTRING_in_ruleNAT6854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteEnumeration_in_entryRuleFiniteEnumeration6898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFiniteEnumeration6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleFiniteEnumeration6945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleFiniteEnumeration6957 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFEConstant_in_ruleFiniteEnumeration6978 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
        public static final BitSet FOLLOW_14_in_ruleFiniteEnumeration6991 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFEConstant_in_ruleFiniteEnumeration7012 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleFiniteEnumeration7026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFEConstant_in_entryRuleFEConstant7062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFEConstant7072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFEConstant7113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCyclicEnumeration_in_entryRuleCyclicEnumeration7153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCyclicEnumeration7163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleCyclicEnumeration7200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleCyclicEnumeration7212 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFEConstant_in_ruleCyclicEnumeration7233 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
        public static final BitSet FOLLOW_14_in_ruleCyclicEnumeration7246 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFEConstant_in_ruleCyclicEnumeration7267 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleCyclicEnumeration7281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCyclicEnumsBuiltInOperator_in_entryRuleCyclicEnumsBuiltInOperator7317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCyclicEnumsBuiltInOperator7327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCyclicEnumsBuiltInOperator7365 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCyclicEnumsBuiltInOperator7377 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleCyclicEnumsBuiltInOperator7407 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCyclicEnumsBuiltInOperator7419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleCyclicEnumsBuiltInOperator7439 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCyclicEnumsBuiltInOperator7451 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleCyclicEnumsBuiltInOperator7481 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCyclicEnumsBuiltInOperator7493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteIntRange_in_entryRuleFiniteIntRange7530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFiniteIntRange7540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleFiniteIntRange7577 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleFiniteIntRange7598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleFiniteIntRange7610 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleFiniteIntRange7631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruleFiniteIntRange7643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiniteIntRangeConstant_in_entryRuleFiniteIntRangeConstant7679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFiniteIntRangeConstant7689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleFiniteIntRangeConstant7735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleFiniteIntRange_in_ruleFiniteIntRangeConstant7756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartition_in_entryRulePartition7792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartition7802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulePartition7839 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_rulePartition7860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_rulePartition7872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePartition7889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePartition7906 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePartitionElement_in_rulePartition7927 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
        public static final BitSet FOLLOW_12_in_rulePartition7940 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePartitionElement_in_rulePartition7961 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_rulePartition7975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartitionElement_in_entryRulePartitionElement8011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartitionElement8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePartitionElement8063 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePartitionElement8080 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_rulePartitionElement8101 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_rulePartitionElement8114 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_rulePartitionElement8135 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rulePartitionsBuiltInOperator_in_entryRulePartitionsBuiltInOperator8173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartitionsBuiltInOperator8183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulePartitionsBuiltInOperator8220 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePartitionsBuiltInOperator8232 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePartitionsBuiltInOperator8258 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePartitionsBuiltInOperator8275 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_rulePartitionsBuiltInOperator8296 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePartitionsBuiltInOperator8308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringSort_in_entryRuleStringSort8344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringSort8354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleStringSort8391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringsBuiltInOperator_in_entryRuleStringsBuiltInOperator8436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringsBuiltInOperator8446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleStringsBuiltInOperator8484 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringsBuiltInOperator8496 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8526 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStringsBuiltInOperator8538 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8559 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringsBuiltInOperator8571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleStringsBuiltInOperator8591 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringsBuiltInOperator8603 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8633 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringsBuiltInOperator8645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleStringsBuiltInOperator8665 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleStringsBuiltInOperator8686 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleNAT_in_ruleStringsBuiltInOperator8707 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStringsBuiltInOperator8719 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleNAT_in_ruleStringsBuiltInOperator8740 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringsBuiltInOperator8752 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleStringsBuiltInOperator8773 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringsBuiltInOperator8785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant8822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant8873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListSort_in_entryRuleListSort8913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListSort8923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleListSort8960 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleListSort8972 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleListSort8993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListsBuiltInOperator_in_entryRuleListsBuiltInOperator9029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListsBuiltInOperator9039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleListsBuiltInOperator9077 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9089 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9119 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleListsBuiltInOperator9131 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9152 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleListsBuiltInOperator9184 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9196 = new BitSet(new long[]{0x6BE000000027F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9226 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleListsBuiltInOperator9238 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9259 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleListsBuiltInOperator9291 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9303 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9333 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleListsBuiltInOperator9365 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleListsBuiltInOperator9377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9407 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleListsBuiltInOperator9419 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9440 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9452 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9473 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleListsBuiltInOperator9505 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleListsBuiltInOperator9517 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleNAT_in_ruleListsBuiltInOperator9547 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9559 = new BitSet(new long[]{0x6BE000000067B070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9580 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleListsBuiltInOperator9612 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleListsBuiltInOperator9624 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleListsBuiltInOperator9654 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleListsBuiltInOperator9666 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9688 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleListsBuiltInOperator9701 = new BitSet(new long[]{0x6BE000000067F070L,0x0000000001FDC8C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleListsBuiltInOperator9722 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleListsBuiltInOperator9738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListConstant_in_entryRuleListConstant9775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListConstant9785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleListConstant9822 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleListConstant9834 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleListConstant9855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArbitrarySort_in_entryRuleArbitrarySort9891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArbitrarySort9901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleArbitrarySort9942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArbitraryOperator_in_entryRuleArbitraryOperator9982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryOperator9992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleArbitraryOperator10034 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleArbitraryOperator10051 = new BitSet(new long[]{0x9400000000A00010L,0x0000000002022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleArbitraryOperator10073 = new BitSet(new long[]{0x0000000000004000L,0x0000000002000000L});
        public static final BitSet FOLLOW_14_in_ruleArbitraryOperator10086 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleArbitraryOperator10107 = new BitSet(new long[]{0x0000000000004000L,0x0000000002000000L});
        public static final BitSet FOLLOW_89_in_ruleArbitraryOperator10123 = new BitSet(new long[]{0x9400000000A00010L,0x0000000000022127L});
        public static final BitSet FOLLOW_ruleSort_in_ruleArbitraryOperator10144 = new BitSet(new long[]{0x0000000000000002L});
    }


}