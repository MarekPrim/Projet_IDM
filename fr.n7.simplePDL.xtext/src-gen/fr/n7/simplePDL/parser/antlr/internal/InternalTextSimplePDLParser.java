package fr.n7.simplePDL.parser.antlr.internal;

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
import fr.n7.simplePDL.services.TextSimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextSimplePDLParser extends AbstractInternalAntlrParser {
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

        public InternalTextSimplePDLParser(TokenStream input, TextSimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected TextSimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalTextSimplePDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalTextSimplePDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalTextSimplePDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalTextSimplePDL.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElement_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElement_3_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElement_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalTextSimplePDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElement_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalTextSimplePDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElement_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalTextSimplePDL.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElement_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalTextSimplePDL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTextSimplePDL.g:106:3: ( (lv_processElement_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTextSimplePDL.g:107:4: (lv_processElement_3_0= ruleProcessElement )
            	    {
            	    // InternalTextSimplePDL.g:107:4: (lv_processElement_3_0= ruleProcessElement )
            	    // InternalTextSimplePDL.g:108:5: lv_processElement_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElement_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElement",
            	    						lv_processElement_3_0,
            	    						"fr.n7.simplePDL.TextSimplePDL.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalTextSimplePDL.g:133:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalTextSimplePDL.g:133:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalTextSimplePDL.g:134:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalTextSimplePDL.g:140:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_needs_3_0= ruleNeed ) )? otherlv_4= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_needs_3_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:146:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_needs_3_0= ruleNeed ) )? otherlv_4= '}' ) )
            // InternalTextSimplePDL.g:147:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_needs_3_0= ruleNeed ) )? otherlv_4= '}' )
            {
            // InternalTextSimplePDL.g:147:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_needs_3_0= ruleNeed ) )? otherlv_4= '}' )
            // InternalTextSimplePDL.g:148:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_needs_3_0= ruleNeed ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalTextSimplePDL.g:152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:153:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTextSimplePDL.g:174:3: ( (lv_needs_3_0= ruleNeed ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTextSimplePDL.g:175:4: (lv_needs_3_0= ruleNeed )
                    {
                    // InternalTextSimplePDL.g:175:4: (lv_needs_3_0= ruleNeed )
                    // InternalTextSimplePDL.g:176:5: lv_needs_3_0= ruleNeed
                    {

                    					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNeedsNeedParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_needs_3_0=ruleNeed();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    					}
                    					add(
                    						current,
                    						"needs",
                    						lv_needs_3_0,
                    						"fr.n7.simplePDL.TextSimplePDL.Need");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalTextSimplePDL.g:201:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalTextSimplePDL.g:201:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalTextSimplePDL.g:202:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalTextSimplePDL.g:208:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:214:2: ( (otherlv_0= 'ws' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalTextSimplePDL.g:215:2: (otherlv_0= 'ws' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalTextSimplePDL.g:215:2: (otherlv_0= 'ws' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            // InternalTextSimplePDL.g:216:3: otherlv_0= 'ws' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getFromKeyword_1());
            		
            // InternalTextSimplePDL.g:224:3: ( (otherlv_2= RULE_ID ) )
            // InternalTextSimplePDL.g:225:4: (otherlv_2= RULE_ID )
            {
            // InternalTextSimplePDL.g:225:4: (otherlv_2= RULE_ID )
            // InternalTextSimplePDL.g:226:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getToKeyword_3());
            		
            // InternalTextSimplePDL.g:241:3: ( (otherlv_4= RULE_ID ) )
            // InternalTextSimplePDL.g:242:4: (otherlv_4= RULE_ID )
            {
            // InternalTextSimplePDL.g:242:4: (otherlv_4= RULE_ID )
            // InternalTextSimplePDL.g:243:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_4_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleProcessElement"
    // InternalTextSimplePDL.g:258:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalTextSimplePDL.g:258:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalTextSimplePDL.g:259:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalTextSimplePDL.g:265:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Resource_3 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:271:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource ) )
            // InternalTextSimplePDL.g:272:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource )
            {
            // InternalTextSimplePDL.g:272:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTextSimplePDL.g:273:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:282:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTextSimplePDL.g:291:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTextSimplePDL.g:300:3: this_Resource_3= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_3=ruleResource();

                    state._fsp--;


                    			current = this_Resource_3;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleGuidance"
    // InternalTextSimplePDL.g:312:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalTextSimplePDL.g:312:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalTextSimplePDL.g:313:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalTextSimplePDL.g:319:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:325:2: ( (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // InternalTextSimplePDL.g:326:2: (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // InternalTextSimplePDL.g:326:2: (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            // InternalTextSimplePDL.g:327:3: otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalTextSimplePDL.g:331:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTextSimplePDL.g:332:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTextSimplePDL.g:332:4: (lv_text_1_0= RULE_STRING )
            // InternalTextSimplePDL.g:333:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_1_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTextSimplePDL.g:349:3: (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTextSimplePDL.g:350:4: otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getForKeyword_2_0());
                    			
                    // InternalTextSimplePDL.g:354:4: ( (otherlv_3= RULE_ID ) )
                    // InternalTextSimplePDL.g:355:5: (otherlv_3= RULE_ID )
                    {
                    // InternalTextSimplePDL.g:355:5: (otherlv_3= RULE_ID )
                    // InternalTextSimplePDL.g:356:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuidanceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalTextSimplePDL.g:367:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTextSimplePDL.g:368:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTextSimplePDL.g:372:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalTextSimplePDL.g:373:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalTextSimplePDL.g:373:6: (otherlv_5= RULE_ID )
                    	    // InternalTextSimplePDL.g:374:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGuidanceRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleNeed"
    // InternalTextSimplePDL.g:391:1: entryRuleNeed returns [EObject current=null] : iv_ruleNeed= ruleNeed EOF ;
    public final EObject entryRuleNeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeed = null;


        try {
            // InternalTextSimplePDL.g:391:45: (iv_ruleNeed= ruleNeed EOF )
            // InternalTextSimplePDL.g:392:2: iv_ruleNeed= ruleNeed EOF
            {
             newCompositeNode(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeed=ruleNeed();

            state._fsp--;

             current =iv_ruleNeed; 
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
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalTextSimplePDL.g:398:1: ruleNeed returns [EObject current=null] : (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbResources_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:404:2: ( (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTextSimplePDL.g:405:2: (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTextSimplePDL.g:405:2: (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalTextSimplePDL.g:406:3: otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNeedAccess().getNeedKeyword_0());
            		
            // InternalTextSimplePDL.g:410:3: ( (lv_nbResources_1_0= RULE_INT ) )
            // InternalTextSimplePDL.g:411:4: (lv_nbResources_1_0= RULE_INT )
            {
            // InternalTextSimplePDL.g:411:4: (lv_nbResources_1_0= RULE_INT )
            // InternalTextSimplePDL.g:412:5: lv_nbResources_1_0= RULE_INT
            {
            lv_nbResources_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_nbResources_1_0, grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbResources",
            						lv_nbResources_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNeedAccess().getOfKeyword_2());
            		
            // InternalTextSimplePDL.g:432:3: ( (otherlv_3= RULE_ID ) )
            // InternalTextSimplePDL.g:433:4: (otherlv_3= RULE_ID )
            {
            // InternalTextSimplePDL.g:433:4: (otherlv_3= RULE_ID )
            // InternalTextSimplePDL.g:434:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0());
            				

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
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleResource"
    // InternalTextSimplePDL.g:449:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalTextSimplePDL.g:449:49: (iv_ruleResource= ruleResource EOF )
            // InternalTextSimplePDL.g:450:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalTextSimplePDL.g:456:1: ruleResource returns [EObject current=null] : (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbAvailableResources_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:462:2: ( (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalTextSimplePDL.g:463:2: (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalTextSimplePDL.g:463:2: (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalTextSimplePDL.g:464:3: otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getCreateKeyword_0());
            		
            // InternalTextSimplePDL.g:468:3: ( (lv_nbAvailableResources_1_0= RULE_INT ) )
            // InternalTextSimplePDL.g:469:4: (lv_nbAvailableResources_1_0= RULE_INT )
            {
            // InternalTextSimplePDL.g:469:4: (lv_nbAvailableResources_1_0= RULE_INT )
            // InternalTextSimplePDL.g:470:5: lv_nbAvailableResources_1_0= RULE_INT
            {
            lv_nbAvailableResources_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_nbAvailableResources_1_0, grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbAvailableResources",
            						lv_nbAvailableResources_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getOfKeyword_2());
            		
            // InternalTextSimplePDL.g:490:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalTextSimplePDL.g:491:4: (lv_name_3_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:491:4: (lv_name_3_0= RULE_ID )
            // InternalTextSimplePDL.g:492:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000084E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}