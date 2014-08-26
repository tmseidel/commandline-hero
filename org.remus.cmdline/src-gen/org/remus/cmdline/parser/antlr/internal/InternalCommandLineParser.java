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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system '", "'{'", "'port ->'", "'version ->'", "'registerProgram -> '", "'}'", "'program '", "'->'", "'def'", "'with '", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'as'", "'doc -> '", "'+'", "'.'", "'STDOUT'", "'STDERR'", "'BOTH'", "'STRING'", "'PATH'", "'FOLDERPATH'"
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
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_programs_0_0= ruleProgram ) )? ( (lv_system_1_0= ruleSystem ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_programs_0_0 = null;

        EObject lv_system_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:80:28: ( ( ( (lv_programs_0_0= ruleProgram ) )? ( (lv_system_1_0= ruleSystem ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_programs_0_0= ruleProgram ) )? ( (lv_system_1_0= ruleSystem ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_programs_0_0= ruleProgram ) )? ( (lv_system_1_0= ruleSystem ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_programs_0_0= ruleProgram ) )? ( (lv_system_1_0= ruleSystem ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_programs_0_0= ruleProgram ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:82:1: (lv_programs_0_0= ruleProgram )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:82:1: (lv_programs_0_0= ruleProgram )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:83:3: lv_programs_0_0= ruleProgram
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProgram_in_ruleModel131);
                    lv_programs_0_0=ruleProgram();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"programs",
                            		lv_programs_0_0, 
                            		"Program");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:99:3: ( (lv_system_1_0= ruleSystem ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:100:1: (lv_system_1_0= ruleSystem )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:100:1: (lv_system_1_0= ruleSystem )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:101:3: lv_system_1_0= ruleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSystem_in_ruleModel153);
                    lv_system_1_0=ruleSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"system",
                            		lv_system_1_0, 
                            		"System");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystem"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:125:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:126:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:127:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem190);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem200); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:134:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_port_4_0 = null;

        EObject lv_version_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:137:28: ( (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:1: (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:1: (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:138:3: otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem237); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:142:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:143:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:143:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:144:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSystem258);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem270); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:164:1: (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:164:3: otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem283); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getPortKeyword_3_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:168:1: ( (lv_port_4_0= ruleIntegerLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:169:1: (lv_port_4_0= ruleIntegerLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:169:1: (lv_port_4_0= ruleIntegerLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:170:3: lv_port_4_0= ruleIntegerLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getPortIntegerLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleSystem304);
                    lv_port_4_0=ruleIntegerLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"port",
                            		lv_port_4_0, 
                            		"IntegerLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:186:4: (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:186:6: otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem319); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getVersionKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:190:1: ( (lv_version_6_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:191:1: (lv_version_6_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:191:1: (lv_version_6_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:192:3: lv_version_6_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getVersionStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleSystem340);
                    lv_version_6_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_6_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:208:4: (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:208:6: otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSystem355); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRegisterProgramKeyword_5_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:212:1: ( (otherlv_8= RULE_ID ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:213:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:213:1: (otherlv_8= RULE_ID )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:214:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSystemRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem375); 

            	    		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getProgramProgramCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem389); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleProgram"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:237:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:238:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:239:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram425);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram435); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:246:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) ;
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
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:249:28: ( (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:250:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:250:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:250:3: otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleProgram472); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:254:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:255:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:255:1: (lv_name_1_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:256:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProgram493);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleProgram505); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:276:1: ( (lv_path_3_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:277:1: (lv_path_3_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:277:1: (lv_path_3_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:278:3: lv_path_3_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleProgram526);
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleProgram538); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:298:1: ( (lv_functions_5_0= ruleFunction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:299:1: (lv_functions_5_0= ruleFunction )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:299:1: (lv_functions_5_0= ruleFunction )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:300:3: lv_functions_5_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleProgram559);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleProgram572); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:328:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:329:2: (iv_ruleParam= ruleParam EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:330:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam608);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam618); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:337:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:340:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:341:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:341:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:342:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:342:1: (lv_name_0_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:343:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleParam663);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:367:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:368:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:369:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction698);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction708); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:376:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )? otherlv_4= '{' (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )? (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )* (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )* (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )* otherlv_15= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_printOutMode_3_0 = null;

        EObject lv_desc_6_0 = null;

        EObject lv_docurl_8_0 = null;

        EObject lv_input_10_0 = null;

        EObject lv_output_12_0 = null;

        EObject lv_optionBlocks_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:379:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )? otherlv_4= '{' (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )? (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )* (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )* (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )* otherlv_15= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:380:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )? otherlv_4= '{' (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )? (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )* (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )* (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )* otherlv_15= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:380:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )? otherlv_4= '{' (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )? (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )* (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )* (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )* otherlv_15= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:380:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )? otherlv_4= '{' (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )? (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )* (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )* (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFunction745); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:385:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:385:1: (lv_name_1_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction762); 

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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:402:2: (otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:402:4: otherlv_2= 'with ' ( (lv_printOutMode_3_0= rulePrintMode ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleFunction780); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getWithKeyword_2_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:406:1: ( (lv_printOutMode_3_0= rulePrintMode ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:407:1: (lv_printOutMode_3_0= rulePrintMode )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:407:1: (lv_printOutMode_3_0= rulePrintMode )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:408:3: lv_printOutMode_3_0= rulePrintMode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getPrintOutModePrintModeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrintMode_in_ruleFunction801);
                    lv_printOutMode_3_0=rulePrintMode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"printOutMode",
                            		lv_printOutMode_3_0, 
                            		"PrintMode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFunction815); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:428:1: (otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:428:3: otherlv_5= 'desc ->' ( (lv_desc_6_0= ruleStringLiteral ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFunction828); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getDescKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:432:1: ( (lv_desc_6_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:433:1: (lv_desc_6_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:433:1: (lv_desc_6_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:434:3: lv_desc_6_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction849);
                    lv_desc_6_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"desc",
                            		lv_desc_6_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:450:4: (otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:450:6: otherlv_7= 'docurl ->' ( (lv_docurl_8_0= ruleStringLiteral ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFunction864); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getDocurlKeyword_5_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:454:1: ( (lv_docurl_8_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:455:1: (lv_docurl_8_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:455:1: (lv_docurl_8_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:456:3: lv_docurl_8_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction885);
                    lv_docurl_8_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"docurl",
                            		lv_docurl_8_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:472:4: (otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:472:6: otherlv_9= 'input' ( (lv_input_10_0= ruleInputDataDefinition ) )
            	    {
            	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleFunction900); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getInputKeyword_6_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:476:1: ( (lv_input_10_0= ruleInputDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:1: (lv_input_10_0= ruleInputDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:477:1: (lv_input_10_0= ruleInputDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:478:3: lv_input_10_0= ruleInputDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getInputInputDataDefinitionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputDataDefinition_in_ruleFunction921);
            	    lv_input_10_0=ruleInputDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input",
            	            		lv_input_10_0, 
            	            		"InputDataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:494:4: (otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:494:6: otherlv_11= 'output ' ( (lv_output_12_0= ruleOutputDataDefinition ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleFunction936); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getOutputKeyword_7_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:498:1: ( (lv_output_12_0= ruleOutputDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:499:1: (lv_output_12_0= ruleOutputDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:499:1: (lv_output_12_0= ruleOutputDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:500:3: lv_output_12_0= ruleOutputDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOutputOutputDataDefinitionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutputDataDefinition_in_ruleFunction957);
            	    lv_output_12_0=ruleOutputDataDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output",
            	            		lv_output_12_0, 
            	            		"OutputDataDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:516:4: (otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:516:6: otherlv_13= '* ' ( (lv_optionBlocks_14_0= ruleOption ) )
            	    {
            	    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleFunction972); 

            	        	newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_8_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:520:1: ( (lv_optionBlocks_14_0= ruleOption ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:521:1: (lv_optionBlocks_14_0= ruleOption )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:521:1: (lv_optionBlocks_14_0= ruleOption )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:522:3: lv_optionBlocks_14_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleFunction993);
            	    lv_optionBlocks_14_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optionBlocks",
            	            		lv_optionBlocks_14_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleFunction1007); 

                	newLeafNode(otherlv_15, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleInputDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:550:1: entryRuleInputDataDefinition returns [EObject current=null] : iv_ruleInputDataDefinition= ruleInputDataDefinition EOF ;
    public final EObject entryRuleInputDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataDefinition = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:551:2: (iv_ruleInputDataDefinition= ruleInputDataDefinition EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:552:2: iv_ruleInputDataDefinition= ruleInputDataDefinition EOF
            {
             newCompositeNode(grammarAccess.getInputDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleInputDataDefinition_in_entryRuleInputDataDefinition1043);
            iv_ruleInputDataDefinition=ruleInputDataDefinition();

            state._fsp--;

             current =iv_ruleInputDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDataDefinition1053); 

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
    // $ANTLR end "entryRuleInputDataDefinition"


    // $ANTLR start "ruleInputDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:559:1: ruleInputDataDefinition returns [EObject current=null] : ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleInputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) ;
    public final EObject ruleInputDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_input_1_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_doc_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:562:28: ( ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleInputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:563:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleInputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:563:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleInputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:563:2: () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleInputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:563:2: ()
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:564:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputDataDefinitionAccess().getInputDataDefinitionAction_0(),
                        current);
                

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:569:2: ( (lv_input_1_0= ruleParam ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:570:1: (lv_input_1_0= ruleParam )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:570:1: (lv_input_1_0= ruleParam )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:571:3: lv_input_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getInputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleInputDataDefinition1108);
            lv_input_1_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_1_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleInputDataDefinition1120); 

                	newLeafNode(otherlv_2, grammarAccess.getInputDataDefinitionAccess().getAsKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:591:1: ( (lv_type_3_0= ruleInputDataType ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:592:1: (lv_type_3_0= ruleInputDataType )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:592:1: (lv_type_3_0= ruleInputDataType )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:593:3: lv_type_3_0= ruleInputDataType
            {
             
            	        newCompositeNode(grammarAccess.getInputDataDefinitionAccess().getTypeInputDataTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInputDataType_in_ruleInputDataDefinition1141);
            lv_type_3_0=ruleInputDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"InputDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:609:2: (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:609:4: otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleInputDataDefinition1154); 

                        	newLeafNode(otherlv_4, grammarAccess.getInputDataDefinitionAccess().getDocKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:613:1: ( (lv_doc_5_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:614:1: (lv_doc_5_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:614:1: (lv_doc_5_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:615:3: lv_doc_5_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleInputDataDefinition1175);
                    lv_doc_5_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputDataDefinitionRule());
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
    // $ANTLR end "ruleInputDataDefinition"


    // $ANTLR start "entryRuleOutputDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:639:1: entryRuleOutputDataDefinition returns [EObject current=null] : iv_ruleOutputDataDefinition= ruleOutputDataDefinition EOF ;
    public final EObject entryRuleOutputDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataDefinition = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:640:2: (iv_ruleOutputDataDefinition= ruleOutputDataDefinition EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:641:2: iv_ruleOutputDataDefinition= ruleOutputDataDefinition EOF
            {
             newCompositeNode(grammarAccess.getOutputDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleOutputDataDefinition_in_entryRuleOutputDataDefinition1213);
            iv_ruleOutputDataDefinition=ruleOutputDataDefinition();

            state._fsp--;

             current =iv_ruleOutputDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDataDefinition1223); 

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
    // $ANTLR end "entryRuleOutputDataDefinition"


    // $ANTLR start "ruleOutputDataDefinition"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:648:1: ruleOutputDataDefinition returns [EObject current=null] : ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleOutputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) ;
    public final EObject ruleOutputDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_input_1_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_doc_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:651:28: ( ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleOutputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:652:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleOutputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:652:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleOutputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:652:2: () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleOutputDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:652:2: ()
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:653:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutputDataDefinitionAccess().getOutputDataDefinitionAction_0(),
                        current);
                

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:658:2: ( (lv_input_1_0= ruleParam ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:659:1: (lv_input_1_0= ruleParam )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:659:1: (lv_input_1_0= ruleParam )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:660:3: lv_input_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getOutputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleOutputDataDefinition1278);
            lv_input_1_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_1_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleOutputDataDefinition1290); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputDataDefinitionAccess().getAsKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:680:1: ( (lv_type_3_0= ruleOutputDataType ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:681:1: (lv_type_3_0= ruleOutputDataType )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:681:1: (lv_type_3_0= ruleOutputDataType )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:682:3: lv_type_3_0= ruleOutputDataType
            {
             
            	        newCompositeNode(grammarAccess.getOutputDataDefinitionAccess().getTypeOutputDataTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOutputDataType_in_ruleOutputDataDefinition1311);
            lv_type_3_0=ruleOutputDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputDataDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"OutputDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:698:2: (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:698:4: otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleOutputDataDefinition1324); 

                        	newLeafNode(otherlv_4, grammarAccess.getOutputDataDefinitionAccess().getDocKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:702:1: ( (lv_doc_5_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:703:1: (lv_doc_5_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:703:1: (lv_doc_5_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:704:3: lv_doc_5_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleOutputDataDefinition1345);
                    lv_doc_5_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputDataDefinitionRule());
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
    // $ANTLR end "ruleOutputDataDefinition"


    // $ANTLR start "entryRuleOption"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:728:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:729:2: (iv_ruleOption= ruleOption EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:730:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1383);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1393); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:737:1: ruleOption returns [EObject current=null] : ( (lv_param_0_0= ruleConcatExpression ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:740:28: ( ( (lv_param_0_0= ruleConcatExpression ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:741:1: ( (lv_param_0_0= ruleConcatExpression ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:741:1: ( (lv_param_0_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:742:1: (lv_param_0_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:742:1: (lv_param_0_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:743:3: lv_param_0_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleOption1438);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:767:1: entryRuleConcatExpression returns [EObject current=null] : iv_ruleConcatExpression= ruleConcatExpression EOF ;
    public final EObject entryRuleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatExpression = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:768:2: (iv_ruleConcatExpression= ruleConcatExpression EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:769:2: iv_ruleConcatExpression= ruleConcatExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1473);
            iv_ruleConcatExpression=ruleConcatExpression();

            state._fsp--;

             current =iv_ruleConcatExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression1483); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:776:1: ruleConcatExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleConcatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:779:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:780:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:780:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:781:5: this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1530);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:789:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:789:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:789:2: ()
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:790:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleConcatExpression1551); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:799:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:800:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:800:1: (lv_right_3_0= rulePrimary )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:801:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1572);
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
    // $ANTLR end "ruleConcatExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:825:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:826:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:827:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1610);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1620); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:834:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:837:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:838:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:838:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:839:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:839:1: (lv_value_0_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:840:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1661); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:864:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:865:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:866:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1701);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral1711); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:873:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:876:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:877:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:877:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:878:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:878:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:879:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral1752); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:903:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:904:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:905:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1792);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral1802); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:912:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:915:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:916:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:916:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:916:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:916:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:917:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:917:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:918:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1844); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDoubleLiteral1861); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1());
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1872); 
             
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:950:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:951:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:952:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1908);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1919); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:959:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:962:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:963:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:963:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:964:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1966);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:974:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:975:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName1985); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2007);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:999:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1000:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1001:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID2055);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID2066); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1008:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1011:28: (this_ID_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1012:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2105); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1027:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1028:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1029:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2149);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2159); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1036:1: rulePrimary returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1039:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1040:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1040:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==EOF||LA17_2==12||LA17_2==16||LA17_2==25||LA17_2==28) ) {
                    alt17=2;
                }
                else if ( (LA17_2==29) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1041:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimary2206);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1051:5: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rulePrimary2233);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1061:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rulePrimary2260);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1070:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1070:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1071:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1071:1: (otherlv_3= RULE_ID )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1072:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary2285); 

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


    // $ANTLR start "rulePrintMode"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1091:1: rulePrintMode returns [Enumerator current=null] : ( (enumLiteral_0= 'STDOUT' ) | (enumLiteral_1= 'STDERR' ) | (enumLiteral_2= 'BOTH' ) ) ;
    public final Enumerator rulePrintMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1093:28: ( ( (enumLiteral_0= 'STDOUT' ) | (enumLiteral_1= 'STDERR' ) | (enumLiteral_2= 'BOTH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1094:1: ( (enumLiteral_0= 'STDOUT' ) | (enumLiteral_1= 'STDERR' ) | (enumLiteral_2= 'BOTH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1094:1: ( (enumLiteral_0= 'STDOUT' ) | (enumLiteral_1= 'STDERR' ) | (enumLiteral_2= 'BOTH' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1094:2: (enumLiteral_0= 'STDOUT' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1094:2: (enumLiteral_0= 'STDOUT' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1094:4: enumLiteral_0= 'STDOUT'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_rulePrintMode2335); 

                            current = grammarAccess.getPrintModeAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrintModeAccess().getSTDOUTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1100:6: (enumLiteral_1= 'STDERR' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1100:6: (enumLiteral_1= 'STDERR' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1100:8: enumLiteral_1= 'STDERR'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_rulePrintMode2352); 

                            current = grammarAccess.getPrintModeAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrintModeAccess().getSTDERREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1106:6: (enumLiteral_2= 'BOTH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1106:6: (enumLiteral_2= 'BOTH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1106:8: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_rulePrintMode2369); 

                            current = grammarAccess.getPrintModeAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrintModeAccess().getBOTHEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "rulePrintMode"


    // $ANTLR start "ruleInputDataType"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1116:1: ruleInputDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'PATH' ) ) ;
    public final Enumerator ruleInputDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1118:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'PATH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1119:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'PATH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1119:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'PATH' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1119:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1119:2: (enumLiteral_0= 'STRING' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1119:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleInputDataType2414); 

                            current = grammarAccess.getInputDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInputDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1125:6: (enumLiteral_1= 'PATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1125:6: (enumLiteral_1= 'PATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1125:8: enumLiteral_1= 'PATH'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleInputDataType2431); 

                            current = grammarAccess.getInputDataTypeAccess().getPATHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInputDataTypeAccess().getPATHEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleInputDataType"


    // $ANTLR start "ruleOutputDataType"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1135:1: ruleOutputDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'PATH' ) | (enumLiteral_1= 'FOLDERPATH' ) ) ;
    public final Enumerator ruleOutputDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1137:28: ( ( (enumLiteral_0= 'PATH' ) | (enumLiteral_1= 'FOLDERPATH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1138:1: ( (enumLiteral_0= 'PATH' ) | (enumLiteral_1= 'FOLDERPATH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1138:1: ( (enumLiteral_0= 'PATH' ) | (enumLiteral_1= 'FOLDERPATH' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            else if ( (LA20_0==35) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1138:2: (enumLiteral_0= 'PATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1138:2: (enumLiteral_0= 'PATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1138:4: enumLiteral_0= 'PATH'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleOutputDataType2476); 

                            current = grammarAccess.getOutputDataTypeAccess().getPATHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOutputDataTypeAccess().getPATHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1144:6: (enumLiteral_1= 'FOLDERPATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1144:6: (enumLiteral_1= 'FOLDERPATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1144:8: enumLiteral_1= 'FOLDERPATH'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleOutputDataType2493); 

                            current = grammarAccess.getOutputDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOutputDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleOutputDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel131 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSystem258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem270 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleSystem283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleSystem304 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleSystem319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleSystem340 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSystem355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem375 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleSystem389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProgram472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProgram493 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProgram505 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleProgram526 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram538 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram559 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleProgram572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParam663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunction745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction762 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleFunction780 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_rulePrintMode_in_ruleFunction801 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction815 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_21_in_ruleFunction828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction849 = new BitSet(new long[]{0x0000000003C10000L});
    public static final BitSet FOLLOW_22_in_ruleFunction864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction885 = new BitSet(new long[]{0x0000000003810000L});
    public static final BitSet FOLLOW_23_in_ruleFunction900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputDataDefinition_in_ruleFunction921 = new BitSet(new long[]{0x0000000003810000L});
    public static final BitSet FOLLOW_24_in_ruleFunction936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputDataDefinition_in_ruleFunction957 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_25_in_ruleFunction972 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOption_in_ruleFunction993 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleFunction1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDataDefinition_in_entryRuleInputDataDefinition1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDataDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_ruleInputDataDefinition1108 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleInputDataDefinition1120 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleInputDataType_in_ruleInputDataDefinition1141 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleInputDataDefinition1154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleInputDataDefinition1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDataDefinition_in_entryRuleOutputDataDefinition1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDataDefinition1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_ruleOutputDataDefinition1278 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOutputDataDefinition1290 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleOutputDataType_in_ruleOutputDataDefinition1311 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleOutputDataDefinition1324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleOutputDataDefinition1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleOption1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1530 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleConcatExpression1551 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1572 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1844 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDoubleLiteral1861 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1966 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName1985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2007 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimary2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rulePrimary2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rulePrimary2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrintMode2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrintMode2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrintMode2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInputDataType2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInputDataType2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOutputDataType2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOutputDataType2493 = new BitSet(new long[]{0x0000000000000002L});

}