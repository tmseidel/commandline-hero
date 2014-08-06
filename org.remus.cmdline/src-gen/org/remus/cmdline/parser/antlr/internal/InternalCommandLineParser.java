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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system '", "'{'", "'port ->'", "'version ->'", "'registerProgram -> '", "'}'", "'program '", "'->'", "'def'", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'AS'", "'doc -> '", "'+'", "'.'", "'import'", "'STRING'", "'URL'", "'DATA'", "'PATH'", "'FOLDERPATH'"
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )? ( (lv_system_2_0= ruleSystem ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_programs_1_0 = null;

        EObject lv_system_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )? ( (lv_system_2_0= ruleSystem ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )? ( (lv_system_2_0= ruleSystem ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )? ( (lv_system_2_0= ruleSystem ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_programs_1_0= ruleProgram ) )? ( (lv_system_2_0= ruleSystem ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:99:3: ( (lv_programs_1_0= ruleProgram ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
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
                    break;

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:117:3: ( (lv_system_2_0= ruleSystem ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:118:1: (lv_system_2_0= ruleSystem )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:118:1: (lv_system_2_0= ruleSystem )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:119:3: lv_system_2_0= ruleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSystem_in_ruleModel175);
                    lv_system_2_0=ruleSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"system",
                            		lv_system_2_0, 
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:143:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:144:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:145:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem212);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem222); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:152:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ) ;
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
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:155:28: ( (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:156:1: (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:156:1: (otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:156:3: otherlv_0= 'system ' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )? (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem259); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:160:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:161:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:161:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:162:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSystem280);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem292); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:182:1: (otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:182:3: otherlv_3= 'port ->' ( (lv_port_4_0= ruleIntegerLiteral ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem305); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getPortKeyword_3_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:186:1: ( (lv_port_4_0= ruleIntegerLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:187:1: (lv_port_4_0= ruleIntegerLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:187:1: (lv_port_4_0= ruleIntegerLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:188:3: lv_port_4_0= ruleIntegerLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getPortIntegerLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleSystem326);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:204:4: (otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:204:6: otherlv_5= 'version ->' ( (lv_version_6_0= ruleStringLiteral ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem341); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getVersionKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:208:1: ( (lv_version_6_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:209:1: (lv_version_6_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:209:1: (lv_version_6_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:210:3: lv_version_6_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getVersionStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleSystem362);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:226:4: (otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:226:6: otherlv_7= 'registerProgram -> ' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSystem377); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRegisterProgramKeyword_5_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:230:1: ( (otherlv_8= RULE_ID ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:231:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:231:1: (otherlv_8= RULE_ID )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:232:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSystemRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem397); 

            	    		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getProgramProgramCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem411); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:255:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:256:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:257:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram447);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram457); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:264:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) ;
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
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:267:28: ( (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:1: (otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:268:3: otherlv_0= 'program ' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '->' ( (lv_path_3_0= ruleConcatExpression ) ) otherlv_4= '{' ( (lv_functions_5_0= ruleFunction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleProgram494); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:272:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:273:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:273:1: (lv_name_1_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:274:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleProgram515);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleProgram527); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:294:1: ( (lv_path_3_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:295:1: (lv_path_3_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:295:1: (lv_path_3_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:296:3: lv_path_3_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleProgram548);
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleProgram560); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:316:1: ( (lv_functions_5_0= ruleFunction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:317:1: (lv_functions_5_0= ruleFunction )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:317:1: (lv_functions_5_0= ruleFunction )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:318:3: lv_functions_5_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleProgram581);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleProgram594); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:346:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:347:2: (iv_ruleParam= ruleParam EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:348:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam630);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam640); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:355:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:358:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:359:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:359:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:360:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:360:1: (lv_name_0_0= ruleValidID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:361:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleParam685);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:385:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:386:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:387:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction720);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction730); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:394:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' ) ;
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
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:397:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:398:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:398:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}' )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:398:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )? (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )? (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )* (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+ (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFunction767); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:402:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:403:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:403:1: (lv_name_1_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:404:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction784); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFunction801); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:424:1: (otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:424:3: otherlv_3= 'desc ->' ( (lv_desc_4_0= ruleStringLiteral ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleFunction814); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getDescKeyword_3_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:428:1: ( (lv_desc_4_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:1: (lv_desc_4_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:429:1: (lv_desc_4_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:430:3: lv_desc_4_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction835);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:446:4: (otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:446:6: otherlv_5= 'docurl ->' ( (lv_docurl_6_0= ruleStringLiteral ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFunction850); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getDocurlKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:450:1: ( (lv_docurl_6_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:451:1: (lv_docurl_6_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:451:1: (lv_docurl_6_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:452:3: lv_docurl_6_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleFunction871);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:468:4: (otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:468:6: otherlv_7= 'input' ( (lv_input_8_0= ruleDataDefinition ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFunction886); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getInputKeyword_5_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:472:1: ( (lv_input_8_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:473:1: (lv_input_8_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:473:1: (lv_input_8_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:474:3: lv_input_8_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction907);
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
            	    break loop10;
                }
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:490:4: (otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:490:6: otherlv_9= 'output ' ( (lv_output_10_0= ruleDataDefinition ) )
            	    {
            	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleFunction922); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getOutputKeyword_6_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:494:1: ( (lv_output_10_0= ruleDataDefinition ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:495:1: (lv_output_10_0= ruleDataDefinition )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:495:1: (lv_output_10_0= ruleDataDefinition )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:496:3: lv_output_10_0= ruleDataDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataDefinition_in_ruleFunction943);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:512:4: (otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:512:6: otherlv_11= '* ' ( (lv_optionBlocks_12_0= ruleOption ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleFunction958); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_7_0());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:516:1: ( (lv_optionBlocks_12_0= ruleOption ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:517:1: (lv_optionBlocks_12_0= ruleOption )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:517:1: (lv_optionBlocks_12_0= ruleOption )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:518:3: lv_optionBlocks_12_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleFunction979);
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
            	    break loop12;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleFunction993); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:546:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:547:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:548:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition1029);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition1039); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:555:1: ruleDataDefinition returns [EObject current=null] : ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_input_1_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_doc_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:558:28: ( ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:559:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:559:1: ( () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )? )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:559:2: () ( (lv_input_1_0= ruleParam ) ) otherlv_2= 'AS' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:559:2: ()
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0(),
                        current);
                

            }

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:565:2: ( (lv_input_1_0= ruleParam ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:1: (lv_input_1_0= ruleParam )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:566:1: (lv_input_1_0= ruleParam )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:567:3: lv_input_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleDataDefinition1094);
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDataDefinition1106); 

                	newLeafNode(otherlv_2, grammarAccess.getDataDefinitionAccess().getASKeyword_2());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:587:1: ( (lv_type_3_0= ruleDataType ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:588:1: (lv_type_3_0= ruleDataType )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:588:1: (lv_type_3_0= ruleDataType )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:589:3: lv_type_3_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleDataDefinition1127);
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

            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:605:2: (otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:605:4: otherlv_4= 'doc -> ' ( (lv_doc_5_0= ruleStringLiteral ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDataDefinition1140); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataDefinitionAccess().getDocKeyword_4_0());
                        
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:609:1: ( (lv_doc_5_0= ruleStringLiteral ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:610:1: (lv_doc_5_0= ruleStringLiteral )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:610:1: (lv_doc_5_0= ruleStringLiteral )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:611:3: lv_doc_5_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleDataDefinition1161);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:635:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:636:2: (iv_ruleOption= ruleOption EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:637:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1199);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1209); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:644:1: ruleOption returns [EObject current=null] : ( (lv_param_0_0= ruleConcatExpression ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:647:28: ( ( (lv_param_0_0= ruleConcatExpression ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:648:1: ( (lv_param_0_0= ruleConcatExpression ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:648:1: ( (lv_param_0_0= ruleConcatExpression ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:649:1: (lv_param_0_0= ruleConcatExpression )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:649:1: (lv_param_0_0= ruleConcatExpression )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:650:3: lv_param_0_0= ruleConcatExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatExpression_in_ruleOption1254);
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:674:1: entryRuleConcatExpression returns [EObject current=null] : iv_ruleConcatExpression= ruleConcatExpression EOF ;
    public final EObject entryRuleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatExpression = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:675:2: (iv_ruleConcatExpression= ruleConcatExpression EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:676:2: iv_ruleConcatExpression= ruleConcatExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1289);
            iv_ruleConcatExpression=ruleConcatExpression();

            state._fsp--;

             current =iv_ruleConcatExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression1299); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:683:1: ruleConcatExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleConcatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:686:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:687:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:687:1: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:688:5: this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1346);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:696:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:696:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:696:2: ()
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:697:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleConcatExpression1367); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:706:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:707:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:707:1: (lv_right_3_0= rulePrimary )
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:708:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleConcatExpression1388);
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
    // $ANTLR end "ruleConcatExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:732:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:733:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:734:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1426);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1436); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:741:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:744:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:745:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:745:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:746:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:746:1: (lv_value_0_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:747:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1477); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:771:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:772:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:773:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1517);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral1527); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:780:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:783:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:784:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:784:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:785:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:785:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:786:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral1568); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:810:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:811:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:812:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1608);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral1618); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:819:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:822:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:823:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:823:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:823:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:823:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:824:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:824:1: (lv_value_0_0= RULE_INT )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:825:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1660); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDoubleLiteral1677); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1());
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleLiteral1688); 
             
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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:857:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:858:2: (iv_ruleImport= ruleImport EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:859:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1723);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1733); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:866:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:869:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:870:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:870:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:870:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImport1770); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:874:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:875:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:875:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:876:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1787); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:900:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:901:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:902:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1829);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1840); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:909:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:912:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:913:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:913:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:914:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1887);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:924:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:925:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName1906); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1928);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:949:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:950:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:951:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1976);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1987); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:958:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:961:28: (this_ID_0= RULE_ID )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:962:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2026); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:977:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:978:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:979:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2070);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2080); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:986:1: rulePrimary returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:989:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:990:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:990:1: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | ( (otherlv_3= RULE_ID ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||LA16_2==12||LA16_2==16||LA16_2==24||LA16_2==27) ) {
                    alt16=2;
                }
                else if ( (LA16_2==28) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:991:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimary2127);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1001:5: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rulePrimary2154);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1011:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rulePrimary2181);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1020:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1020:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1021:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1021:1: (otherlv_3= RULE_ID )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1022:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary2206); 

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
    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1041:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1043:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) ) )
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1044:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            {
            // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1044:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'URL' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'PATH' ) | (enumLiteral_4= 'FOLDERPATH' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            case 34:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1044:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1044:2: (enumLiteral_0= 'STRING' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1044:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleDataType2256); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1050:6: (enumLiteral_1= 'URL' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1050:6: (enumLiteral_1= 'URL' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1050:8: enumLiteral_1= 'URL'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleDataType2273); 

                            current = grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1056:6: (enumLiteral_2= 'DATA' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1056:6: (enumLiteral_2= 'DATA' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1056:8: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_ruleDataType2290); 

                            current = grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1062:6: (enumLiteral_3= 'PATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1062:6: (enumLiteral_3= 'PATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1062:8: enumLiteral_3= 'PATH'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_33_in_ruleDataType2307); 

                            current = grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1068:6: (enumLiteral_4= 'FOLDERPATH' )
                    {
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1068:6: (enumLiteral_4= 'FOLDERPATH' )
                    // ../org.remus.cmdline/src-gen/org/remus/cmdline/parser/antlr/internal/InternalCommandLine.g:1068:8: enumLiteral_4= 'FOLDERPATH'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_34_in_ruleDataType2324); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000020020802L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel153 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSystem280 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem292 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleSystem305 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleSystem326 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleSystem341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleSystem362 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSystem377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem397 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleSystem411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProgram494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProgram515 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProgram527 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleProgram548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram560 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram581 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleProgram594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParam685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunction767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction784 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction801 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_20_in_ruleFunction814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction835 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_21_in_ruleFunction850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleFunction871 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunction886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction907 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleFunction922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleFunction943 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_24_in_ruleFunction958 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOption_in_ruleFunction979 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16_in_ruleFunction993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_ruleDataDefinition1094 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataDefinition1106 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataDefinition1127 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleDataDefinition1140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleDataDefinition1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_ruleOption1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1346 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleConcatExpression1367 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleConcatExpression1388 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDoubleLiteral1677 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleLiteral1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImport1770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1887 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName1906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1928 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimary2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rulePrimary2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rulePrimary2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataType2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataType2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataType2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataType2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType2324 = new BitSet(new long[]{0x0000000000000002L});

}