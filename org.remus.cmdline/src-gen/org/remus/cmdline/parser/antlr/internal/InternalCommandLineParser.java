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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program '", "'->'", "'{'", "'}'", "'def'", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'AS'", "'doc -> '", "'+'", "'.'", "'import'", "'STRING'", "'URL'", "'DATA'", "'PATH'", "'FOLDERPATH'"
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
    public static final int RULE_STRING=5;
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

                if ( (LA1_0==25) ) {
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:264:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_desc_4_0 = null;

        EObject lv_docurl_6_0 = null;

        EObject lv_input_8_0 = null;

        EObject lv_output_10_0 = null;

        EObject lv_optionBlocks_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:267:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}'
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFunction543); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:1: (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:3: otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFunction556); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getDescKeyword_3_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:298:1: ( (lv_desc_4_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:299:1: (lv_desc_4_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:299:1: (lv_desc_4_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:300:3: lv_desc_4_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction577);
                    lv_desc_4_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"desc",
                            		lv_desc_4_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:316:4: (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:316:6: otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleFunction592); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getDocurlKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:320:1: ( (lv_docurl_6_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:321:1: (lv_docurl_6_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:321:1: (lv_docurl_6_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:322:3: lv_docurl_6_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction613);
                    lv_docurl_6_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"docurl",
                            		lv_docurl_6_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:338:4: (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:338:6: otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleFunction628); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getInputKeyword_5_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:342:1: ( (lv_input_8_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:343:1: (lv_input_8_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:343:1: (lv_input_8_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:344:3: lv_input_8_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction649);
            	    lv_input_8_0=ruleDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input",
            	            		lv_input_8_0, 
            	            		"DataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:360:4: (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:360:6: otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleFunction664); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getOutputKeyword_6_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:364:1: ( (lv_output_10_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:365:1: (lv_output_10_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:365:1: (lv_output_10_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:366:3: lv_output_10_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction685);
            	    lv_output_10_0=ruleDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output",
            	            		lv_output_10_0, 
            	            		"DataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:382:4: (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:382:6: otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) )
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleFunction700); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_7_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:386:1: ( (lv_optionBlocks_12_0= ruleOption ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:387:1: (lv_optionBlocks_12_0= ruleOption )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:387:1: (lv_optionBlocks_12_0= ruleOption )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:388:3: lv_optionBlocks_12_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleFunction721);
            	    lv_optionBlocks_12_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optionBlocks",
            	            		lv_optionBlocks_12_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleFunction735); 

                	newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:416:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:417:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:418:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition771);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition781); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:425:1: ruleDataDefinition returns [EObject current=null] : ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_input_1_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_doc_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:428:28: ( ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:2: () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:2: ()
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:430:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0(),
                        current);
                

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:435:2: ( (lv_input_1_0= ruleParam ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:436:1: (lv_input_1_0= ruleParam )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:436:1: (lv_input_1_0= ruleParam )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:437:3: lv_input_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleDataDefinition836);
            lv_input_1_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_1_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDataDefinition848); 

                	newLeafNode(otherlv_2, grammarAccess.getDataDefinitionAccess().getASKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:457:1: ( (lv_type_3_0= ruleDataType ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:458:1: (lv_type_3_0= ruleDataType )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:458:1: (lv_type_3_0= ruleDataType )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:459:3: lv_type_3_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleDataDefinition869);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:475:2: (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:475:4: otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleDataDefinition882); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataDefinitionAccess().getDocKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:479:1: ( (lv_doc_5_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:480:1: (lv_doc_5_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:480:1: (lv_doc_5_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:481:3: lv_doc_5_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleDataDefinition903);
                    lv_doc_5_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_5_0, 
                            		"StringLiteral");
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
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleOption"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:505:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:506:2: (iv_ruleOption= ruleOption EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:507:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption941);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption951); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:514:1: ruleOption returns [EObject current=null] : ( (lv_param_0_0= ruleConcatExpression ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:517:28: ( ( (lv_param_0_0= ruleConcatExpression ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:518:1: ( (lv_param_0_0= ruleConcatExpression ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:518:1: ( (lv_param_0_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:519:1: (lv_param_0_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:519:1: (lv_param_0_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:520:3: lv_param_0_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleOption996);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:544:1: entryRuleConcatExpression returns [EObject current=null] : iv_ruleConcatExpression= ruleConcatExpression EOF ;
    public final EObject entryRuleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatExpression = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:545:2: (iv_ruleConcatExpression= ruleConcatExpression EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:546:2: iv_ruleConcatExpression= ruleConcatExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1031);
            iv_ruleConcatExpression=ruleConcatExpression();

            state._fsp--;

             current =iv_ruleConcatExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression1041); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:553:1: ruleConcatExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleConcatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:556:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:557:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:557:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:558:5: this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1088);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:2: ()
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:567:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleConcatExpression1109); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:576:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:577:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:577:1: (lv_right_3_0= rulePrimary )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:578:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1130);
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
            	    break loop9;
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:602:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:603:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:604:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1168);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1178); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:611:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:614:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:615:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:615:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:616:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:616:1: (lv_value_0_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:617:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1219); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:641:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:642:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:643:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1259);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral1269); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:650:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:653:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:654:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:654:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:655:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:655:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:656:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral1310); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:680:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:681:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:682:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1350);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral1360); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:689:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:692:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:693:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:693:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:693:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:693:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:694:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:694:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:695:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1402); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDoubleLiteral1419); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1());
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1430); 
             
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:727:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:728:2: (iv_ruleImport= ruleImport EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:729:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1465);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1475); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:736:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:739:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:740:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:740:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:740:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleImport1512); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:744:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:745:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:745:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:746:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1529); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:772:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:773:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:774:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1573);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1584); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:781:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:784:28: (this_ID_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:785:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1623); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:800:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:801:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:802:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1667);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1677); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:809:1: rulePrimary returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:812:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:813:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:813:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==24) ) {
                    alt10=3;
                }
                else if ( (LA10_2==EOF||(LA10_2>=13 && LA10_2<=14)||LA10_2==20||LA10_2==23) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:814:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimary1724);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:824:5: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rulePrimary1751);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:834:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rulePrimary1778);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:843:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:843:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:844:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:844:1: (otherlv_3= RULE_ID )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:845:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary1803); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:864:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:866:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:867:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:867:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 30:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:867:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:867:2: (enumLiteral_0= 'STRING' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:867:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleDataType1853); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:873:6: (enumLiteral_1= 'URL' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:873:6: (enumLiteral_1= 'URL' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:873:8: enumLiteral_1= 'URL'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleDataType1870); 

                            current = grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:879:6: (enumLiteral_2= 'DATA' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:879:6: (enumLiteral_2= 'DATA' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:879:8: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleDataType1887); 

                            current = grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:885:6: (enumLiteral_3= 'PATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:885:6: (enumLiteral_3= 'PATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:885:8: enumLiteral_3= 'PATH'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_29_in_ruleDataType1904); 

                            current = grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:891:6: (enumLiteral_4= 'FOLDERPATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:891:6: (enumLiteral_4= 'FOLDERPATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:891:8: enumLiteral_4= 'FOLDERPATH'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_30_in_ruleDataType1921); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000002000800L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunction543 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_16_in_ruleFunction556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction577 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleFunction592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction613 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunction628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction649 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleFunction664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction685 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_20_in_ruleFunction700 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOption_in_ruleFunction721 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleFunction735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_ruleDataDefinition836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataDefinition848 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataDefinition869 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDataDefinition882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleDataDefinition903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleOption996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1088 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleConcatExpression1109 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1130 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1402 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDoubleLiteral1419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleImport1512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimary1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rulePrimary1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rulePrimary1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataType1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataType1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataType1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataType1921 = new BitSet(new long[]{0x0000000000000002L});

}