package org.remus.cmdline.parser.antlr.internal; 

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
import org.remus.cmdline.services.CommandLineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommandLineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program '", "'->'", "'{'", "'}'", "'def'", "'('", "','", "')'", "'doc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'AS'", "'+'", "'.'", "'import'", "'STRING'", "'URL'", "'DATA'", "'PATH'", "'FOLDERPATH'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCommandLineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommandLineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommandLineParser.tokenNames; }
    public String getGrammarFileName() { return "../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g"; }



     	private CommandLineGrammarAccess grammarAccess;
     	
        public InternalCommandLineParser(TokenStream input, CommandLineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CommandLineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_programs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:99:3: ( (lv_programs_1_0= ruleProgram ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:100:1: (lv_programs_1_0= ruleProgram )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:100:1: (lv_programs_1_0= ruleProgram )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:101:3: lv_programs_1_0= ruleProgram
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProgram_in_ruleModel153);
            lv_programs_1_0=ruleProgram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"programs",
                    		lv_programs_1_0, 
                    		"Program");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:125:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:126:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:127:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram189);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram199); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:134:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_path_3_0 = null;

        EObject lv_functions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:137:28: ( (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:3: otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram236); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:142:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:143:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:143:1: (lv_name_1_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:144:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProgram257);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProgram269); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:164:1: ( (lv_path_3_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:165:1: (lv_path_3_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:165:1: (lv_path_3_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:166:3: lv_path_3_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleProgram290);
            lv_path_3_0=ruleConcatExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_3_0, 
                    		"ConcatExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProgram302); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:186:1: ( (lv_functions_5_0= ruleFunction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:187:1: (lv_functions_5_0= ruleFunction )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:187:1: (lv_functions_5_0= ruleFunction )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:188:3: lv_functions_5_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleProgram323);
            	    lv_functions_5_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_5_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleProgram336); 

                	newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleParam"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:216:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:217:2: (iv_ruleParam= ruleParam EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:218:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam372);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam382); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:225:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:228:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:229:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:229:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:230:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:230:1: (lv_name_0_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:231:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleParam427);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ValidID");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFunction"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:255:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:256:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:257:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction462);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction472); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:264:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= '{' (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )? (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )? (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )* (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )* (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )* otherlv_18= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_doc_9_0 = null;

        EObject lv_docurl_11_0 = null;

        EObject lv_input_13_0 = null;

        EObject lv_output_15_0 = null;

        EObject lv_optionBlocks_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:267:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= '{' (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )? (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )? (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )* (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )* (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )* otherlv_18= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= '{' (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )? (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )? (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )* (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )* (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )* otherlv_18= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= '{' (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )? (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )? (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )* (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )* (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )* otherlv_18= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= '{' (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )? (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )? (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )* (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )* (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFunction509); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:272:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:273:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:273:1: (lv_name_1_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:274:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction526); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFunction543); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:1: ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:2: ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:2: ( (lv_params_3_0= ruleParam ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:295:1: (lv_params_3_0= ruleParam )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:295:1: (lv_params_3_0= ruleParam )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:296:3: lv_params_3_0= ruleParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsParamParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParam_in_ruleFunction565);
                    lv_params_3_0=ruleParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:312:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:312:4: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFunction578); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:316:1: ( (lv_params_5_0= ruleParam ) )
                    	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:317:1: (lv_params_5_0= ruleParam )
                    	    {
                    	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:317:1: (lv_params_5_0= ruleParam )
                    	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:318:3: lv_params_5_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsParamParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleFunction599);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFunction615); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleFunction627); 

                	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:342:1: (otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:342:3: otherlv_8= 'doc ->' ( (lv_doc_9_0= ruleStringLiteral ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleFunction640); 

                        	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getDocKeyword_6_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:346:1: ( (lv_doc_9_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:347:1: (lv_doc_9_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:347:1: (lv_doc_9_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:348:3: lv_doc_9_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDocStringLiteralParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction661);
                    lv_doc_9_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_9_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:364:4: (otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:364:6: otherlv_10= 'docurl ->' ( (lv_docurl_11_0= ruleStringLiteral ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleFunction676); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getDocurlKeyword_7_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:368:1: ( (lv_docurl_11_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:369:1: (lv_docurl_11_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:369:1: (lv_docurl_11_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:370:3: lv_docurl_11_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction697);
                    lv_docurl_11_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"docurl",
                            		lv_docurl_11_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:386:4: (otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:386:6: otherlv_12= 'input' ( (lv_input_13_0= ruleDataDefinition ) )
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleFunction712); 

            	        	newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getInputKeyword_8_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:390:1: ( (lv_input_13_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:391:1: (lv_input_13_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:391:1: (lv_input_13_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:392:3: lv_input_13_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction733);
            	    lv_input_13_0=ruleDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input",
            	            		lv_input_13_0, 
            	            		"DataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:408:4: (otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:408:6: otherlv_14= 'output ' ( (lv_output_15_0= ruleDataDefinition ) )
            	    {
            	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleFunction748); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFunctionAccess().getOutputKeyword_9_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:412:1: ( (lv_output_15_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:413:1: (lv_output_15_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:413:1: (lv_output_15_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:414:3: lv_output_15_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction769);
            	    lv_output_15_0=ruleDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output",
            	            		lv_output_15_0, 
            	            		"DataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:430:4: (otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:430:6: otherlv_16= '* ' ( (lv_optionBlocks_17_0= ruleOption ) )
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleFunction784); 

            	        	newLeafNode(otherlv_16, grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_10_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:434:1: ( (lv_optionBlocks_17_0= ruleOption ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:435:1: (lv_optionBlocks_17_0= ruleOption )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:435:1: (lv_optionBlocks_17_0= ruleOption )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:436:3: lv_optionBlocks_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleFunction805);
            	    lv_optionBlocks_17_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optionBlocks",
            	            		lv_optionBlocks_17_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleFunction819); 

                	newLeafNode(otherlv_18, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:464:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:465:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:466:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition855);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition865); 

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
    // $ANTLR end "entryRuleDataDefinition"


    // $ANTLR start "ruleDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:473:1: ruleDataDefinition returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:476:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:2: ()
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:478:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0(),
                        current);
                

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:483:2: ( (otherlv_1= RULE_ID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:484:1: (otherlv_1= RULE_ID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:484:1: (otherlv_1= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:485:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataDefinitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataDefinition919); 

            		newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getInputParamCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDataDefinition931); 

                	newLeafNode(otherlv_2, grammarAccess.getDataDefinitionAccess().getASKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:500:1: ( (lv_type_3_0= ruleDataType ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:501:1: (lv_type_3_0= ruleDataType )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:501:1: (lv_type_3_0= ruleDataType )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:502:3: lv_type_3_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleDataDefinition952);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"DataType");
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
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleOption"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:526:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:527:2: (iv_ruleOption= ruleOption EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:528:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption988);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption998); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:535:1: ruleOption returns [EObject current=null] : ( (lv_param_0_0= ruleConcatExpression ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:538:28: ( ( (lv_param_0_0= ruleConcatExpression ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:539:1: ( (lv_param_0_0= ruleConcatExpression ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:539:1: ( (lv_param_0_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:540:1: (lv_param_0_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:540:1: (lv_param_0_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:541:3: lv_param_0_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleOption1043);
            lv_param_0_0=ruleConcatExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	        }
                   		set(
                   			current, 
                   			"param",
                    		lv_param_0_0, 
                    		"ConcatExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleConcatExpression"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:565:1: entryRuleConcatExpression returns [EObject current=null] : iv_ruleConcatExpression= ruleConcatExpression EOF ;
    public final EObject entryRuleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatExpression = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:2: (iv_ruleConcatExpression= ruleConcatExpression EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:567:2: iv_ruleConcatExpression= ruleConcatExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1078);
            iv_ruleConcatExpression=ruleConcatExpression();

            state._fsp--;

             current =iv_ruleConcatExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression1088); 

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
    // $ANTLR end "entryRuleConcatExpression"


    // $ANTLR start "ruleConcatExpression"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:574:1: ruleConcatExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleConcatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:577:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:578:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:578:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:579:5: this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1135);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:587:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:587:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:587:2: ()
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:588:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleConcatExpression1156); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:597:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:598:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:598:1: (lv_right_3_0= rulePrimary )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:599:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1177);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConcatExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleConcatExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:623:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:624:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:625:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1215);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1225); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:632:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:635:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:636:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:636:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:637:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:637:1: (lv_value_0_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:638:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1266); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:662:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:663:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:664:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1306);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral1316); 

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:671:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:674:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:675:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:675:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:676:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:676:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:677:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral1357); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:701:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:702:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:703:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1397);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral1407); 

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:710:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:713:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:714:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:714:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:714:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:714:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:715:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:715:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:716:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1449); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDoubleLiteralAccess().getValueINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleDoubleLiteral1466); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1());
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1477); 
             
                newLeafNode(this_INT_2, grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleImport"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:748:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:749:2: (iv_ruleImport= ruleImport EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:750:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1512);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1522); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:757:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:760:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:761:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:761:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:761:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleImport1559); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:765:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:766:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:766:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:767:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1576); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:793:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:794:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:795:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1620);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1631); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:802:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:805:28: (this_ID_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:806:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1670); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePrimary"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:821:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:822:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:823:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1714);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1724); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:830:1: rulePrimary returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:833:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:834:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:834:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||(LA11_2>=13 && LA11_2<=14)||LA11_2==23||LA11_2==25) ) {
                    alt11=2;
                }
                else if ( (LA11_2==26) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
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
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:835:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimary1771);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:845:5: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rulePrimary1798);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:855:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rulePrimary1825);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:864:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:864:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:865:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:865:1: (otherlv_3= RULE_ID )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:866:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary1850); 

                    		newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getParamParamCrossReference_3_0()); 
                    	

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "ruleDataType"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:885:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:887:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:888:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:888:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            int alt12=5;
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
            case 32:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:888:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:888:2: (enumLiteral_0= 'STRING' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:888:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleDataType1900); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:894:6: (enumLiteral_1= 'URL' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:894:6: (enumLiteral_1= 'URL' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:894:8: enumLiteral_1= 'URL'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleDataType1917); 

                            current = grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:900:6: (enumLiteral_2= 'DATA' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:900:6: (enumLiteral_2= 'DATA' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:900:8: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleDataType1934); 

                            current = grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:906:6: (enumLiteral_3= 'PATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:906:6: (enumLiteral_3= 'PATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:906:8: enumLiteral_3= 'PATH'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleDataType1951); 

                            current = grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:912:6: (enumLiteral_4= 'FOLDERPATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:912:6: (enumLiteral_4= 'FOLDERPATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:912:8: enumLiteral_4= 'FOLDERPATH'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleDataType1968); 

                            current = grammarAccess.getDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProgram257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram269 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleProgram290 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram302 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram323 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleProgram336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParam427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunction509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunction543 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleFunction565 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunction578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleFunction599 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleFunction615 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunction627 = new BitSet(new long[]{0x0000000000F84000L});
    public static final BitSet FOLLOW_19_in_ruleFunction640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction661 = new BitSet(new long[]{0x0000000000F04000L});
    public static final BitSet FOLLOW_20_in_ruleFunction676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction697 = new BitSet(new long[]{0x0000000000E04000L});
    public static final BitSet FOLLOW_21_in_ruleFunction712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction733 = new BitSet(new long[]{0x0000000000E04000L});
    public static final BitSet FOLLOW_22_in_ruleFunction748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction769 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_23_in_ruleFunction784 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOption_in_ruleFunction805 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleFunction819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataDefinition919 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataDefinition931 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataDefinition952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleOption1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1135 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleConcatExpression1156 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1177 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1449 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDoubleLiteral1466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImport1559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimary1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rulePrimary1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rulePrimary1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataType1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataType1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataType1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataType1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataType1968 = new BitSet(new long[]{0x0000000000000002L});

}