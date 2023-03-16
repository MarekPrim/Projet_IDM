package fr.n7.simplePDL.ide.contentassist.antlr.internal;

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
import fr.n7.simplePDL.services.TextSimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextSimplePDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'for'", "','", "'need'", "'of'", "'create'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTextSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextSimplePDL.g"; }


    	private TextSimplePDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TextSimplePDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalTextSimplePDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:54:1: ( ruleProcess EOF )
            // InternalTextSimplePDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalTextSimplePDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalTextSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalTextSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalTextSimplePDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalTextSimplePDL.g:69:3: ( rule__Process__Group__0 )
            // InternalTextSimplePDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalTextSimplePDL.g:78:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:79:1: ( ruleWorkDefinition EOF )
            // InternalTextSimplePDL.g:80:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalTextSimplePDL.g:87:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:91:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalTextSimplePDL.g:92:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalTextSimplePDL.g:92:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalTextSimplePDL.g:93:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalTextSimplePDL.g:94:3: ( rule__WorkDefinition__Group__0 )
            // InternalTextSimplePDL.g:94:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalTextSimplePDL.g:103:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:104:1: ( ruleWorkSequence EOF )
            // InternalTextSimplePDL.g:105:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalTextSimplePDL.g:112:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:116:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalTextSimplePDL.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalTextSimplePDL.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalTextSimplePDL.g:118:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalTextSimplePDL.g:119:3: ( rule__WorkSequence__Group__0 )
            // InternalTextSimplePDL.g:119:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleProcessElement"
    // InternalTextSimplePDL.g:128:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:129:1: ( ruleProcessElement EOF )
            // InternalTextSimplePDL.g:130:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalTextSimplePDL.g:137:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:141:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalTextSimplePDL.g:142:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalTextSimplePDL.g:142:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalTextSimplePDL.g:143:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalTextSimplePDL.g:144:3: ( rule__ProcessElement__Alternatives )
            // InternalTextSimplePDL.g:144:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleGuidance"
    // InternalTextSimplePDL.g:153:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:154:1: ( ruleGuidance EOF )
            // InternalTextSimplePDL.g:155:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalTextSimplePDL.g:162:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:166:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalTextSimplePDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalTextSimplePDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            // InternalTextSimplePDL.g:168:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalTextSimplePDL.g:169:3: ( rule__Guidance__Group__0 )
            // InternalTextSimplePDL.g:169:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleNeed"
    // InternalTextSimplePDL.g:178:1: entryRuleNeed : ruleNeed EOF ;
    public final void entryRuleNeed() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:179:1: ( ruleNeed EOF )
            // InternalTextSimplePDL.g:180:1: ruleNeed EOF
            {
             before(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getNeedRule()); 
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
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalTextSimplePDL.g:187:1: ruleNeed : ( ( rule__Need__Group__0 ) ) ;
    public final void ruleNeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:191:2: ( ( ( rule__Need__Group__0 ) ) )
            // InternalTextSimplePDL.g:192:2: ( ( rule__Need__Group__0 ) )
            {
            // InternalTextSimplePDL.g:192:2: ( ( rule__Need__Group__0 ) )
            // InternalTextSimplePDL.g:193:3: ( rule__Need__Group__0 )
            {
             before(grammarAccess.getNeedAccess().getGroup()); 
            // InternalTextSimplePDL.g:194:3: ( rule__Need__Group__0 )
            // InternalTextSimplePDL.g:194:4: rule__Need__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getGroup()); 

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
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleResource"
    // InternalTextSimplePDL.g:203:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalTextSimplePDL.g:204:1: ( ruleResource EOF )
            // InternalTextSimplePDL.g:205:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalTextSimplePDL.g:212:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:216:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalTextSimplePDL.g:217:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalTextSimplePDL.g:217:2: ( ( rule__Resource__Group__0 ) )
            // InternalTextSimplePDL.g:218:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalTextSimplePDL.g:219:3: ( rule__Resource__Group__0 )
            // InternalTextSimplePDL.g:219:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalTextSimplePDL.g:227:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:231:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTextSimplePDL.g:232:2: ( ruleWorkDefinition )
                    {
                    // InternalTextSimplePDL.g:232:2: ( ruleWorkDefinition )
                    // InternalTextSimplePDL.g:233:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:238:2: ( ruleWorkSequence )
                    {
                    // InternalTextSimplePDL.g:238:2: ( ruleWorkSequence )
                    // InternalTextSimplePDL.g:239:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextSimplePDL.g:244:2: ( ruleGuidance )
                    {
                    // InternalTextSimplePDL.g:244:2: ( ruleGuidance )
                    // InternalTextSimplePDL.g:245:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextSimplePDL.g:250:2: ( ruleResource )
                    {
                    // InternalTextSimplePDL.g:250:2: ( ruleResource )
                    // InternalTextSimplePDL.g:251:3: ruleResource
                    {
                     before(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalTextSimplePDL.g:260:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:264:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalTextSimplePDL.g:265:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalTextSimplePDL.g:272:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:276:1: ( ( 'process' ) )
            // InternalTextSimplePDL.g:277:1: ( 'process' )
            {
            // InternalTextSimplePDL.g:277:1: ( 'process' )
            // InternalTextSimplePDL.g:278:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalTextSimplePDL.g:287:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:291:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalTextSimplePDL.g:292:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalTextSimplePDL.g:299:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:303:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalTextSimplePDL.g:304:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalTextSimplePDL.g:304:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalTextSimplePDL.g:305:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalTextSimplePDL.g:306:2: ( rule__Process__NameAssignment_1 )
            // InternalTextSimplePDL.g:306:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalTextSimplePDL.g:314:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:318:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalTextSimplePDL.g:319:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalTextSimplePDL.g:326:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:330:1: ( ( '{' ) )
            // InternalTextSimplePDL.g:331:1: ( '{' )
            {
            // InternalTextSimplePDL.g:331:1: ( '{' )
            // InternalTextSimplePDL.g:332:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalTextSimplePDL.g:341:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:345:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalTextSimplePDL.g:346:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalTextSimplePDL.g:353:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:357:1: ( ( ( rule__Process__ProcessElementAssignment_3 )* ) )
            // InternalTextSimplePDL.g:358:1: ( ( rule__Process__ProcessElementAssignment_3 )* )
            {
            // InternalTextSimplePDL.g:358:1: ( ( rule__Process__ProcessElementAssignment_3 )* )
            // InternalTextSimplePDL.g:359:2: ( rule__Process__ProcessElementAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementAssignment_3()); 
            // InternalTextSimplePDL.g:360:2: ( rule__Process__ProcessElementAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)||LA2_0==18||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTextSimplePDL.g:360:3: rule__Process__ProcessElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementAssignment_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalTextSimplePDL.g:368:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:372:1: ( rule__Process__Group__4__Impl )
            // InternalTextSimplePDL.g:373:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalTextSimplePDL.g:379:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:383:1: ( ( '}' ) )
            // InternalTextSimplePDL.g:384:1: ( '}' )
            {
            // InternalTextSimplePDL.g:384:1: ( '}' )
            // InternalTextSimplePDL.g:385:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalTextSimplePDL.g:395:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:399:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalTextSimplePDL.g:400:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalTextSimplePDL.g:407:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:411:1: ( ( 'wd' ) )
            // InternalTextSimplePDL.g:412:1: ( 'wd' )
            {
            // InternalTextSimplePDL.g:412:1: ( 'wd' )
            // InternalTextSimplePDL.g:413:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalTextSimplePDL.g:422:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:426:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalTextSimplePDL.g:427:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalTextSimplePDL.g:434:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:438:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalTextSimplePDL.g:439:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalTextSimplePDL.g:439:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalTextSimplePDL.g:440:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalTextSimplePDL.g:441:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalTextSimplePDL.g:441:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalTextSimplePDL.g:449:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:453:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalTextSimplePDL.g:454:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalTextSimplePDL.g:461:1: rule__WorkDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:465:1: ( ( '{' ) )
            // InternalTextSimplePDL.g:466:1: ( '{' )
            {
            // InternalTextSimplePDL.g:466:1: ( '{' )
            // InternalTextSimplePDL.g:467:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalTextSimplePDL.g:476:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:480:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalTextSimplePDL.g:481:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalTextSimplePDL.g:488:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__NeedsAssignment_3 )? ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:492:1: ( ( ( rule__WorkDefinition__NeedsAssignment_3 )? ) )
            // InternalTextSimplePDL.g:493:1: ( ( rule__WorkDefinition__NeedsAssignment_3 )? )
            {
            // InternalTextSimplePDL.g:493:1: ( ( rule__WorkDefinition__NeedsAssignment_3 )? )
            // InternalTextSimplePDL.g:494:2: ( rule__WorkDefinition__NeedsAssignment_3 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_3()); 
            // InternalTextSimplePDL.g:495:2: ( rule__WorkDefinition__NeedsAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTextSimplePDL.g:495:3: rule__WorkDefinition__NeedsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__NeedsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalTextSimplePDL.g:503:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:507:1: ( rule__WorkDefinition__Group__4__Impl )
            // InternalTextSimplePDL.g:508:2: rule__WorkDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalTextSimplePDL.g:514:1: rule__WorkDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:518:1: ( ( '}' ) )
            // InternalTextSimplePDL.g:519:1: ( '}' )
            {
            // InternalTextSimplePDL.g:519:1: ( '}' )
            // InternalTextSimplePDL.g:520:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalTextSimplePDL.g:530:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:534:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalTextSimplePDL.g:535:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalTextSimplePDL.g:542:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:546:1: ( ( 'ws' ) )
            // InternalTextSimplePDL.g:547:1: ( 'ws' )
            {
            // InternalTextSimplePDL.g:547:1: ( 'ws' )
            // InternalTextSimplePDL.g:548:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalTextSimplePDL.g:557:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:561:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalTextSimplePDL.g:562:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalTextSimplePDL.g:569:1: rule__WorkSequence__Group__1__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:573:1: ( ( 'from' ) )
            // InternalTextSimplePDL.g:574:1: ( 'from' )
            {
            // InternalTextSimplePDL.g:574:1: ( 'from' )
            // InternalTextSimplePDL.g:575:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalTextSimplePDL.g:584:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:588:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalTextSimplePDL.g:589:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalTextSimplePDL.g:596:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__PredecessorAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:600:1: ( ( ( rule__WorkSequence__PredecessorAssignment_2 ) ) )
            // InternalTextSimplePDL.g:601:1: ( ( rule__WorkSequence__PredecessorAssignment_2 ) )
            {
            // InternalTextSimplePDL.g:601:1: ( ( rule__WorkSequence__PredecessorAssignment_2 ) )
            // InternalTextSimplePDL.g:602:2: ( rule__WorkSequence__PredecessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_2()); 
            // InternalTextSimplePDL.g:603:2: ( rule__WorkSequence__PredecessorAssignment_2 )
            // InternalTextSimplePDL.g:603:3: rule__WorkSequence__PredecessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalTextSimplePDL.g:611:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:615:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalTextSimplePDL.g:616:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalTextSimplePDL.g:623:1: rule__WorkSequence__Group__3__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:627:1: ( ( 'to' ) )
            // InternalTextSimplePDL.g:628:1: ( 'to' )
            {
            // InternalTextSimplePDL.g:628:1: ( 'to' )
            // InternalTextSimplePDL.g:629:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalTextSimplePDL.g:638:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:642:1: ( rule__WorkSequence__Group__4__Impl )
            // InternalTextSimplePDL.g:643:2: rule__WorkSequence__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalTextSimplePDL.g:649:1: rule__WorkSequence__Group__4__Impl : ( ( rule__WorkSequence__SuccessorAssignment_4 ) ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:653:1: ( ( ( rule__WorkSequence__SuccessorAssignment_4 ) ) )
            // InternalTextSimplePDL.g:654:1: ( ( rule__WorkSequence__SuccessorAssignment_4 ) )
            {
            // InternalTextSimplePDL.g:654:1: ( ( rule__WorkSequence__SuccessorAssignment_4 ) )
            // InternalTextSimplePDL.g:655:2: ( rule__WorkSequence__SuccessorAssignment_4 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_4()); 
            // InternalTextSimplePDL.g:656:2: ( rule__WorkSequence__SuccessorAssignment_4 )
            // InternalTextSimplePDL.g:656:3: rule__WorkSequence__SuccessorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalTextSimplePDL.g:665:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:669:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalTextSimplePDL.g:670:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalTextSimplePDL.g:677:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:681:1: ( ( 'note' ) )
            // InternalTextSimplePDL.g:682:1: ( 'note' )
            {
            // InternalTextSimplePDL.g:682:1: ( 'note' )
            // InternalTextSimplePDL.g:683:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

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
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalTextSimplePDL.g:692:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:696:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalTextSimplePDL.g:697:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalTextSimplePDL.g:704:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TextAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:708:1: ( ( ( rule__Guidance__TextAssignment_1 ) ) )
            // InternalTextSimplePDL.g:709:1: ( ( rule__Guidance__TextAssignment_1 ) )
            {
            // InternalTextSimplePDL.g:709:1: ( ( rule__Guidance__TextAssignment_1 ) )
            // InternalTextSimplePDL.g:710:2: ( rule__Guidance__TextAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 
            // InternalTextSimplePDL.g:711:2: ( rule__Guidance__TextAssignment_1 )
            // InternalTextSimplePDL.g:711:3: rule__Guidance__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalTextSimplePDL.g:719:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:723:1: ( rule__Guidance__Group__2__Impl )
            // InternalTextSimplePDL.g:724:2: rule__Guidance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2__Impl();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalTextSimplePDL.g:730:1: rule__Guidance__Group__2__Impl : ( ( rule__Guidance__Group_2__0 )? ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:734:1: ( ( ( rule__Guidance__Group_2__0 )? ) )
            // InternalTextSimplePDL.g:735:1: ( ( rule__Guidance__Group_2__0 )? )
            {
            // InternalTextSimplePDL.g:735:1: ( ( rule__Guidance__Group_2__0 )? )
            // InternalTextSimplePDL.g:736:2: ( rule__Guidance__Group_2__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_2()); 
            // InternalTextSimplePDL.g:737:2: ( rule__Guidance__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTextSimplePDL.g:737:3: rule__Guidance__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group_2__0"
    // InternalTextSimplePDL.g:746:1: rule__Guidance__Group_2__0 : rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1 ;
    public final void rule__Guidance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:750:1: ( rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1 )
            // InternalTextSimplePDL.g:751:2: rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__1();

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
    // $ANTLR end "rule__Guidance__Group_2__0"


    // $ANTLR start "rule__Guidance__Group_2__0__Impl"
    // InternalTextSimplePDL.g:758:1: rule__Guidance__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Guidance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:762:1: ( ( 'for' ) )
            // InternalTextSimplePDL.g:763:1: ( 'for' )
            {
            // InternalTextSimplePDL.g:763:1: ( 'for' )
            // InternalTextSimplePDL.g:764:2: 'for'
            {
             before(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); 

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
    // $ANTLR end "rule__Guidance__Group_2__0__Impl"


    // $ANTLR start "rule__Guidance__Group_2__1"
    // InternalTextSimplePDL.g:773:1: rule__Guidance__Group_2__1 : rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2 ;
    public final void rule__Guidance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:777:1: ( rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2 )
            // InternalTextSimplePDL.g:778:2: rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Guidance__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__2();

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
    // $ANTLR end "rule__Guidance__Group_2__1"


    // $ANTLR start "rule__Guidance__Group_2__1__Impl"
    // InternalTextSimplePDL.g:785:1: rule__Guidance__Group_2__1__Impl : ( ( rule__Guidance__ElementsAssignment_2_1 ) ) ;
    public final void rule__Guidance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:789:1: ( ( ( rule__Guidance__ElementsAssignment_2_1 ) ) )
            // InternalTextSimplePDL.g:790:1: ( ( rule__Guidance__ElementsAssignment_2_1 ) )
            {
            // InternalTextSimplePDL.g:790:1: ( ( rule__Guidance__ElementsAssignment_2_1 ) )
            // InternalTextSimplePDL.g:791:2: ( rule__Guidance__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); 
            // InternalTextSimplePDL.g:792:2: ( rule__Guidance__ElementsAssignment_2_1 )
            // InternalTextSimplePDL.g:792:3: rule__Guidance__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); 

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
    // $ANTLR end "rule__Guidance__Group_2__1__Impl"


    // $ANTLR start "rule__Guidance__Group_2__2"
    // InternalTextSimplePDL.g:800:1: rule__Guidance__Group_2__2 : rule__Guidance__Group_2__2__Impl ;
    public final void rule__Guidance__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:804:1: ( rule__Guidance__Group_2__2__Impl )
            // InternalTextSimplePDL.g:805:2: rule__Guidance__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__2__Impl();

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
    // $ANTLR end "rule__Guidance__Group_2__2"


    // $ANTLR start "rule__Guidance__Group_2__2__Impl"
    // InternalTextSimplePDL.g:811:1: rule__Guidance__Group_2__2__Impl : ( ( rule__Guidance__Group_2_2__0 )* ) ;
    public final void rule__Guidance__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:815:1: ( ( ( rule__Guidance__Group_2_2__0 )* ) )
            // InternalTextSimplePDL.g:816:1: ( ( rule__Guidance__Group_2_2__0 )* )
            {
            // InternalTextSimplePDL.g:816:1: ( ( rule__Guidance__Group_2_2__0 )* )
            // InternalTextSimplePDL.g:817:2: ( rule__Guidance__Group_2_2__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_2_2()); 
            // InternalTextSimplePDL.g:818:2: ( rule__Guidance__Group_2_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTextSimplePDL.g:818:3: rule__Guidance__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Guidance__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Guidance__Group_2__2__Impl"


    // $ANTLR start "rule__Guidance__Group_2_2__0"
    // InternalTextSimplePDL.g:827:1: rule__Guidance__Group_2_2__0 : rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1 ;
    public final void rule__Guidance__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:831:1: ( rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1 )
            // InternalTextSimplePDL.g:832:2: rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2_2__1();

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
    // $ANTLR end "rule__Guidance__Group_2_2__0"


    // $ANTLR start "rule__Guidance__Group_2_2__0__Impl"
    // InternalTextSimplePDL.g:839:1: rule__Guidance__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:843:1: ( ( ',' ) )
            // InternalTextSimplePDL.g:844:1: ( ',' )
            {
            // InternalTextSimplePDL.g:844:1: ( ',' )
            // InternalTextSimplePDL.g:845:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Guidance__Group_2_2__0__Impl"


    // $ANTLR start "rule__Guidance__Group_2_2__1"
    // InternalTextSimplePDL.g:854:1: rule__Guidance__Group_2_2__1 : rule__Guidance__Group_2_2__1__Impl ;
    public final void rule__Guidance__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:858:1: ( rule__Guidance__Group_2_2__1__Impl )
            // InternalTextSimplePDL.g:859:2: rule__Guidance__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Guidance__Group_2_2__1"


    // $ANTLR start "rule__Guidance__Group_2_2__1__Impl"
    // InternalTextSimplePDL.g:865:1: rule__Guidance__Group_2_2__1__Impl : ( ( rule__Guidance__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__Guidance__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:869:1: ( ( ( rule__Guidance__ElementsAssignment_2_2_1 ) ) )
            // InternalTextSimplePDL.g:870:1: ( ( rule__Guidance__ElementsAssignment_2_2_1 ) )
            {
            // InternalTextSimplePDL.g:870:1: ( ( rule__Guidance__ElementsAssignment_2_2_1 ) )
            // InternalTextSimplePDL.g:871:2: ( rule__Guidance__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); 
            // InternalTextSimplePDL.g:872:2: ( rule__Guidance__ElementsAssignment_2_2_1 )
            // InternalTextSimplePDL.g:872:3: rule__Guidance__ElementsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Guidance__Group_2_2__1__Impl"


    // $ANTLR start "rule__Need__Group__0"
    // InternalTextSimplePDL.g:881:1: rule__Need__Group__0 : rule__Need__Group__0__Impl rule__Need__Group__1 ;
    public final void rule__Need__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:885:1: ( rule__Need__Group__0__Impl rule__Need__Group__1 )
            // InternalTextSimplePDL.g:886:2: rule__Need__Group__0__Impl rule__Need__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Need__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__1();

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
    // $ANTLR end "rule__Need__Group__0"


    // $ANTLR start "rule__Need__Group__0__Impl"
    // InternalTextSimplePDL.g:893:1: rule__Need__Group__0__Impl : ( 'need' ) ;
    public final void rule__Need__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:897:1: ( ( 'need' ) )
            // InternalTextSimplePDL.g:898:1: ( 'need' )
            {
            // InternalTextSimplePDL.g:898:1: ( 'need' )
            // InternalTextSimplePDL.g:899:2: 'need'
            {
             before(grammarAccess.getNeedAccess().getNeedKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNeedKeyword_0()); 

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
    // $ANTLR end "rule__Need__Group__0__Impl"


    // $ANTLR start "rule__Need__Group__1"
    // InternalTextSimplePDL.g:908:1: rule__Need__Group__1 : rule__Need__Group__1__Impl rule__Need__Group__2 ;
    public final void rule__Need__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:912:1: ( rule__Need__Group__1__Impl rule__Need__Group__2 )
            // InternalTextSimplePDL.g:913:2: rule__Need__Group__1__Impl rule__Need__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Need__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__2();

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
    // $ANTLR end "rule__Need__Group__1"


    // $ANTLR start "rule__Need__Group__1__Impl"
    // InternalTextSimplePDL.g:920:1: rule__Need__Group__1__Impl : ( ( rule__Need__NbResourcesAssignment_1 ) ) ;
    public final void rule__Need__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:924:1: ( ( ( rule__Need__NbResourcesAssignment_1 ) ) )
            // InternalTextSimplePDL.g:925:1: ( ( rule__Need__NbResourcesAssignment_1 ) )
            {
            // InternalTextSimplePDL.g:925:1: ( ( rule__Need__NbResourcesAssignment_1 ) )
            // InternalTextSimplePDL.g:926:2: ( rule__Need__NbResourcesAssignment_1 )
            {
             before(grammarAccess.getNeedAccess().getNbResourcesAssignment_1()); 
            // InternalTextSimplePDL.g:927:2: ( rule__Need__NbResourcesAssignment_1 )
            // InternalTextSimplePDL.g:927:3: rule__Need__NbResourcesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Need__NbResourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getNbResourcesAssignment_1()); 

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
    // $ANTLR end "rule__Need__Group__1__Impl"


    // $ANTLR start "rule__Need__Group__2"
    // InternalTextSimplePDL.g:935:1: rule__Need__Group__2 : rule__Need__Group__2__Impl rule__Need__Group__3 ;
    public final void rule__Need__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:939:1: ( rule__Need__Group__2__Impl rule__Need__Group__3 )
            // InternalTextSimplePDL.g:940:2: rule__Need__Group__2__Impl rule__Need__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Need__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__3();

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
    // $ANTLR end "rule__Need__Group__2"


    // $ANTLR start "rule__Need__Group__2__Impl"
    // InternalTextSimplePDL.g:947:1: rule__Need__Group__2__Impl : ( 'of' ) ;
    public final void rule__Need__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:951:1: ( ( 'of' ) )
            // InternalTextSimplePDL.g:952:1: ( 'of' )
            {
            // InternalTextSimplePDL.g:952:1: ( 'of' )
            // InternalTextSimplePDL.g:953:2: 'of'
            {
             before(grammarAccess.getNeedAccess().getOfKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getOfKeyword_2()); 

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
    // $ANTLR end "rule__Need__Group__2__Impl"


    // $ANTLR start "rule__Need__Group__3"
    // InternalTextSimplePDL.g:962:1: rule__Need__Group__3 : rule__Need__Group__3__Impl ;
    public final void rule__Need__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:966:1: ( rule__Need__Group__3__Impl )
            // InternalTextSimplePDL.g:967:2: rule__Need__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__3__Impl();

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
    // $ANTLR end "rule__Need__Group__3"


    // $ANTLR start "rule__Need__Group__3__Impl"
    // InternalTextSimplePDL.g:973:1: rule__Need__Group__3__Impl : ( ( rule__Need__ResourceAssignment_3 ) ) ;
    public final void rule__Need__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:977:1: ( ( ( rule__Need__ResourceAssignment_3 ) ) )
            // InternalTextSimplePDL.g:978:1: ( ( rule__Need__ResourceAssignment_3 ) )
            {
            // InternalTextSimplePDL.g:978:1: ( ( rule__Need__ResourceAssignment_3 ) )
            // InternalTextSimplePDL.g:979:2: ( rule__Need__ResourceAssignment_3 )
            {
             before(grammarAccess.getNeedAccess().getResourceAssignment_3()); 
            // InternalTextSimplePDL.g:980:2: ( rule__Need__ResourceAssignment_3 )
            // InternalTextSimplePDL.g:980:3: rule__Need__ResourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Need__ResourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getResourceAssignment_3()); 

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
    // $ANTLR end "rule__Need__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalTextSimplePDL.g:989:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:993:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalTextSimplePDL.g:994:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalTextSimplePDL.g:1001:1: rule__Resource__Group__0__Impl : ( 'create' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1005:1: ( ( 'create' ) )
            // InternalTextSimplePDL.g:1006:1: ( 'create' )
            {
            // InternalTextSimplePDL.g:1006:1: ( 'create' )
            // InternalTextSimplePDL.g:1007:2: 'create'
            {
             before(grammarAccess.getResourceAccess().getCreateKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCreateKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalTextSimplePDL.g:1016:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1020:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalTextSimplePDL.g:1021:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalTextSimplePDL.g:1028:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1032:1: ( ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) ) )
            // InternalTextSimplePDL.g:1033:1: ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) )
            {
            // InternalTextSimplePDL.g:1033:1: ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) )
            // InternalTextSimplePDL.g:1034:2: ( rule__Resource__NbAvailableResourcesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNbAvailableResourcesAssignment_1()); 
            // InternalTextSimplePDL.g:1035:2: ( rule__Resource__NbAvailableResourcesAssignment_1 )
            // InternalTextSimplePDL.g:1035:3: rule__Resource__NbAvailableResourcesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NbAvailableResourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNbAvailableResourcesAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalTextSimplePDL.g:1043:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1047:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalTextSimplePDL.g:1048:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalTextSimplePDL.g:1055:1: rule__Resource__Group__2__Impl : ( 'of' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1059:1: ( ( 'of' ) )
            // InternalTextSimplePDL.g:1060:1: ( 'of' )
            {
            // InternalTextSimplePDL.g:1060:1: ( 'of' )
            // InternalTextSimplePDL.g:1061:2: 'of'
            {
             before(grammarAccess.getResourceAccess().getOfKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getOfKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalTextSimplePDL.g:1070:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1074:1: ( rule__Resource__Group__3__Impl )
            // InternalTextSimplePDL.g:1075:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__3__Impl();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalTextSimplePDL.g:1081:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__NameAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1085:1: ( ( ( rule__Resource__NameAssignment_3 ) ) )
            // InternalTextSimplePDL.g:1086:1: ( ( rule__Resource__NameAssignment_3 ) )
            {
            // InternalTextSimplePDL.g:1086:1: ( ( rule__Resource__NameAssignment_3 ) )
            // InternalTextSimplePDL.g:1087:2: ( rule__Resource__NameAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_3()); 
            // InternalTextSimplePDL.g:1088:2: ( rule__Resource__NameAssignment_3 )
            // InternalTextSimplePDL.g:1088:3: rule__Resource__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalTextSimplePDL.g:1097:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1101:1: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1102:2: ( RULE_ID )
            {
            // InternalTextSimplePDL.g:1102:2: ( RULE_ID )
            // InternalTextSimplePDL.g:1103:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementAssignment_3"
    // InternalTextSimplePDL.g:1112:1: rule__Process__ProcessElementAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1116:1: ( ( ruleProcessElement ) )
            // InternalTextSimplePDL.g:1117:2: ( ruleProcessElement )
            {
            // InternalTextSimplePDL.g:1117:2: ( ruleProcessElement )
            // InternalTextSimplePDL.g:1118:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalTextSimplePDL.g:1127:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1131:1: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1132:2: ( RULE_ID )
            {
            // InternalTextSimplePDL.g:1132:2: ( RULE_ID )
            // InternalTextSimplePDL.g:1133:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__NeedsAssignment_3"
    // InternalTextSimplePDL.g:1142:1: rule__WorkDefinition__NeedsAssignment_3 : ( ruleNeed ) ;
    public final void rule__WorkDefinition__NeedsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1146:1: ( ( ruleNeed ) )
            // InternalTextSimplePDL.g:1147:2: ( ruleNeed )
            {
            // InternalTextSimplePDL.g:1147:2: ( ruleNeed )
            // InternalTextSimplePDL.g:1148:3: ruleNeed
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedsNeedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNeedsNeedParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NeedsAssignment_3"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_2"
    // InternalTextSimplePDL.g:1157:1: rule__WorkSequence__PredecessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1161:1: ( ( ( RULE_ID ) ) )
            // InternalTextSimplePDL.g:1162:2: ( ( RULE_ID ) )
            {
            // InternalTextSimplePDL.g:1162:2: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1163:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_2_0()); 
            // InternalTextSimplePDL.g:1164:3: ( RULE_ID )
            // InternalTextSimplePDL.g:1165:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_2"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_4"
    // InternalTextSimplePDL.g:1176:1: rule__WorkSequence__SuccessorAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1180:1: ( ( ( RULE_ID ) ) )
            // InternalTextSimplePDL.g:1181:2: ( ( RULE_ID ) )
            {
            // InternalTextSimplePDL.g:1181:2: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1182:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_4_0()); 
            // InternalTextSimplePDL.g:1183:3: ( RULE_ID )
            // InternalTextSimplePDL.g:1184:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_4_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_4"


    // $ANTLR start "rule__Guidance__TextAssignment_1"
    // InternalTextSimplePDL.g:1195:1: rule__Guidance__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1199:1: ( ( RULE_STRING ) )
            // InternalTextSimplePDL.g:1200:2: ( RULE_STRING )
            {
            // InternalTextSimplePDL.g:1200:2: ( RULE_STRING )
            // InternalTextSimplePDL.g:1201:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_2_1"
    // InternalTextSimplePDL.g:1210:1: rule__Guidance__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1214:1: ( ( ( RULE_ID ) ) )
            // InternalTextSimplePDL.g:1215:2: ( ( RULE_ID ) )
            {
            // InternalTextSimplePDL.g:1215:2: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1216:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); 
            // InternalTextSimplePDL.g:1217:3: ( RULE_ID )
            // InternalTextSimplePDL.g:1218:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_2_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_2_2_1"
    // InternalTextSimplePDL.g:1229:1: rule__Guidance__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1233:1: ( ( ( RULE_ID ) ) )
            // InternalTextSimplePDL.g:1234:2: ( ( RULE_ID ) )
            {
            // InternalTextSimplePDL.g:1234:2: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1235:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); 
            // InternalTextSimplePDL.g:1236:3: ( RULE_ID )
            // InternalTextSimplePDL.g:1237:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_2_2_1"


    // $ANTLR start "rule__Need__NbResourcesAssignment_1"
    // InternalTextSimplePDL.g:1248:1: rule__Need__NbResourcesAssignment_1 : ( RULE_INT ) ;
    public final void rule__Need__NbResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1252:1: ( ( RULE_INT ) )
            // InternalTextSimplePDL.g:1253:2: ( RULE_INT )
            {
            // InternalTextSimplePDL.g:1253:2: ( RULE_INT )
            // InternalTextSimplePDL.g:1254:3: RULE_INT
            {
             before(grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Need__NbResourcesAssignment_1"


    // $ANTLR start "rule__Need__ResourceAssignment_3"
    // InternalTextSimplePDL.g:1263:1: rule__Need__ResourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Need__ResourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1267:1: ( ( ( RULE_ID ) ) )
            // InternalTextSimplePDL.g:1268:2: ( ( RULE_ID ) )
            {
            // InternalTextSimplePDL.g:1268:2: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1269:3: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0()); 
            // InternalTextSimplePDL.g:1270:3: ( RULE_ID )
            // InternalTextSimplePDL.g:1271:4: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getResourceResourceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getResourceResourceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0()); 

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
    // $ANTLR end "rule__Need__ResourceAssignment_3"


    // $ANTLR start "rule__Resource__NbAvailableResourcesAssignment_1"
    // InternalTextSimplePDL.g:1282:1: rule__Resource__NbAvailableResourcesAssignment_1 : ( RULE_INT ) ;
    public final void rule__Resource__NbAvailableResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1286:1: ( ( RULE_INT ) )
            // InternalTextSimplePDL.g:1287:2: ( RULE_INT )
            {
            // InternalTextSimplePDL.g:1287:2: ( RULE_INT )
            // InternalTextSimplePDL.g:1288:3: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NbAvailableResourcesAssignment_1"


    // $ANTLR start "rule__Resource__NameAssignment_3"
    // InternalTextSimplePDL.g:1297:1: rule__Resource__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextSimplePDL.g:1301:1: ( ( RULE_ID ) )
            // InternalTextSimplePDL.g:1302:2: ( RULE_ID )
            {
            // InternalTextSimplePDL.g:1302:2: ( RULE_ID )
            // InternalTextSimplePDL.g:1303:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000084E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000084C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}