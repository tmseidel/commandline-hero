package org.remus.cmdline.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.remus.cmdline.services.CommandLineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommandLineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'URL'", "'DATA'", "'PATH'", "'FOLDERPATH'", "'system '", "'{'", "'}'", "'port ->'", "'version ->'", "'registerProgram -> '", "'program '", "'->'", "'def'", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'AS'", "'doc -> '", "'+'", "'.'", "'import'"
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
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g"; }


     
     	private CommandLineGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CommandLineGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:61:1: ( ruleModel EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:76:1: ( rule__Model__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystem"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:88:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:89:1: ( ruleSystem EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:90:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem121);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem128); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:97:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:101:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:102:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:102:1: ( ( rule__System__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:103:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:104:1: ( rule__System__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:104:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem154);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleProgram"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:116:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:117:1: ( ruleProgram EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:118:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram181);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram188); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:125:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:129:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:130:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:130:1: ( ( rule__Program__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:131:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:132:1: ( rule__Program__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:132:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram214);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleParam"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:144:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:145:1: ( ruleParam EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:146:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam241);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam248); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:153:1: ruleParam : ( ( rule__Param__NameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:157:2: ( ( ( rule__Param__NameAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:158:1: ( ( rule__Param__NameAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:158:1: ( ( rule__Param__NameAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:159:1: ( rule__Param__NameAssignment )
            {
             before(grammarAccess.getParamAccess().getNameAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:160:1: ( rule__Param__NameAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:160:2: rule__Param__NameAssignment
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_in_ruleParam274);
            rule__Param__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFunction"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:172:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:173:1: ( ruleFunction EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:174:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction301);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction308); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:181:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:185:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:186:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:186:1: ( ( rule__Function__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:187:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:188:1: ( rule__Function__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:188:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction334);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:200:1: entryRuleDataDefinition : ruleDataDefinition EOF ;
    public final void entryRuleDataDefinition() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:201:1: ( ruleDataDefinition EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:202:1: ruleDataDefinition EOF
            {
             before(grammarAccess.getDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition361);
            ruleDataDefinition();

            state._fsp--;

             after(grammarAccess.getDataDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition368); 

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
    // $ANTLR end "entryRuleDataDefinition"


    // $ANTLR start "ruleDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:209:1: ruleDataDefinition : ( ( rule__DataDefinition__Group__0 ) ) ;
    public final void ruleDataDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:213:2: ( ( ( rule__DataDefinition__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__DataDefinition__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__DataDefinition__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:215:1: ( rule__DataDefinition__Group__0 )
            {
             before(grammarAccess.getDataDefinitionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:1: ( rule__DataDefinition__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:2: rule__DataDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__0_in_ruleDataDefinition394);
            rule__DataDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleOption"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:228:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:229:1: ( ruleOption EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:230:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption421);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption428); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:237:1: ruleOption : ( ( rule__Option__ParamAssignment ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:241:2: ( ( ( rule__Option__ParamAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__Option__ParamAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__Option__ParamAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:243:1: ( rule__Option__ParamAssignment )
            {
             before(grammarAccess.getOptionAccess().getParamAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:1: ( rule__Option__ParamAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:2: rule__Option__ParamAssignment
            {
            pushFollow(FOLLOW_rule__Option__ParamAssignment_in_ruleOption454);
            rule__Option__ParamAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getParamAssignment()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleConcatExpression"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:256:1: entryRuleConcatExpression : ruleConcatExpression EOF ;
    public final void entryRuleConcatExpression() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:257:1: ( ruleConcatExpression EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:258:1: ruleConcatExpression EOF
            {
             before(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression481);
            ruleConcatExpression();

            state._fsp--;

             after(grammarAccess.getConcatExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression488); 

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
    // $ANTLR end "entryRuleConcatExpression"


    // $ANTLR start "ruleConcatExpression"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:265:1: ruleConcatExpression : ( ( rule__ConcatExpression__Group__0 ) ) ;
    public final void ruleConcatExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:269:2: ( ( ( rule__ConcatExpression__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__ConcatExpression__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__ConcatExpression__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:271:1: ( rule__ConcatExpression__Group__0 )
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:1: ( rule__ConcatExpression__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:2: rule__ConcatExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression514);
            rule__ConcatExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleConcatExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:284:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:285:1: ( ruleStringLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:286:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral541);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral548); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:293:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:297:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:299:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral574);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:312:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:313:1: ( ruleIntegerLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:314:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral601);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral608); 

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:321:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:325:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:327:1: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral634);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:340:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:341:1: ( ruleDoubleLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:342:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral661);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral668); 

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:349:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:353:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__DoubleLiteral__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:355:1: ( rule__DoubleLiteral__Group__0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:1: ( rule__DoubleLiteral__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:2: rule__DoubleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral694);
            rule__DoubleLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleImport"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:368:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:369:1: ( ruleImport EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:370:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport721);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport728); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:377:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:381:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:382:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:382:1: ( ( rule__Import__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:383:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:1: ( rule__Import__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport754);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:396:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:397:1: ( ruleQualifiedName EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:398:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName781);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName788); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:405:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:409:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:410:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:410:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:411:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:412:1: ( rule__QualifiedName__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:412:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName814);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:424:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:425:1: ( ruleValidID EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:426:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID841);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID848); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:433:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:437:2: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:438:1: ( RULE_ID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:438:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:439:1: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID874); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePrimary"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:452:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:453:1: ( rulePrimary EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:454:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary900);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary907); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:461:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:465:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:466:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:466:1: ( ( rule__Primary__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:467:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:468:1: ( rule__Primary__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:468:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary933);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "ruleDataType"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:481:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:485:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:1: ( ( rule__DataType__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:487:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:488:1: ( rule__DataType__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:488:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType970);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:499:1: rule__Primary__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:503:1: ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==33) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||(LA1_2>=17 && LA1_2<=18)||LA1_2==29||LA1_2==32) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
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
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:504:1: ( ruleStringLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:504:1: ( ruleStringLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:505:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives1005);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:510:6: ( ruleIntegerLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:510:6: ( ruleIntegerLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:511:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives1022);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:516:6: ( ruleDoubleLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:516:6: ( ruleDoubleLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:517:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives1039);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:522:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:522:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:523:1: ( rule__Primary__ParamAssignment_3 )
                    {
                     before(grammarAccess.getPrimaryAccess().getParamAssignment_3()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:524:1: ( rule__Primary__ParamAssignment_3 )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:524:2: rule__Primary__ParamAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives1056);
                    rule__Primary__ParamAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getParamAssignment_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:533:1: rule__DataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'URL' ) ) | ( ( 'DATA' ) ) | ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:537:1: ( ( ( 'STRING' ) ) | ( ( 'URL' ) ) | ( ( 'DATA' ) ) | ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:538:1: ( ( 'STRING' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:538:1: ( ( 'STRING' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:539:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:540:1: ( 'STRING' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:540:3: 'STRING'
                    {
                    match(input,11,FOLLOW_11_in_rule__DataType__Alternatives1090); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:545:6: ( ( 'URL' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:545:6: ( ( 'URL' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:546:1: ( 'URL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:547:1: ( 'URL' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:547:3: 'URL'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataType__Alternatives1111); 

                    }

                     after(grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:552:6: ( ( 'DATA' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:552:6: ( ( 'DATA' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:553:1: ( 'DATA' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:554:1: ( 'DATA' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:554:3: 'DATA'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives1132); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:559:6: ( ( 'PATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:559:6: ( ( 'PATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:560:1: ( 'PATH' )
                    {
                     before(grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:561:1: ( 'PATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:561:3: 'PATH'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives1153); 

                    }

                     after(grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:566:6: ( ( 'FOLDERPATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:566:6: ( ( 'FOLDERPATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:567:1: ( 'FOLDERPATH' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_4()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:568:1: ( 'FOLDERPATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:568:3: 'FOLDERPATH'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives1174); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:580:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:584:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:585:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01207);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01210);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:592:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:596:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:597:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:597:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:598:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:599:1: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:599:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl1237);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:609:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:613:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:614:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11268);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11271);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:621:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramsAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:625:1: ( ( ( rule__Model__ProgramsAssignment_1 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:626:1: ( ( rule__Model__ProgramsAssignment_1 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:626:1: ( ( rule__Model__ProgramsAssignment_1 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:627:1: ( rule__Model__ProgramsAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getProgramsAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:628:1: ( rule__Model__ProgramsAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:628:2: rule__Model__ProgramsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__ProgramsAssignment_1_in_rule__Model__Group__1__Impl1298);
                    rule__Model__ProgramsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getProgramsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:638:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:642:1: ( rule__Model__Group__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:643:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21329);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:649:1: rule__Model__Group__2__Impl : ( ( rule__Model__SystemAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:653:1: ( ( ( rule__Model__SystemAssignment_2 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:654:1: ( ( rule__Model__SystemAssignment_2 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:654:1: ( ( rule__Model__SystemAssignment_2 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:655:1: ( rule__Model__SystemAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getSystemAssignment_2()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:656:1: ( rule__Model__SystemAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:656:2: rule__Model__SystemAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__SystemAssignment_2_in_rule__Model__Group__2__Impl1356);
                    rule__Model__SystemAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getSystemAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:672:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:676:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:677:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01393);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__01396);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:684:1: rule__System__Group__0__Impl : ( 'system ' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:688:1: ( ( 'system ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:689:1: ( 'system ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:689:1: ( 'system ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:690:1: 'system '
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__System__Group__0__Impl1424); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:703:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:707:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:708:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11455);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__11458);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:715:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:719:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:720:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:720:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:721:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:722:1: ( rule__System__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:722:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1485);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:732:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:736:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:737:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21515);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__21518);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:744:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:748:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:749:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:749:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:750:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__System__Group__2__Impl1546); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:763:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:767:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:768:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31577);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__31580);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:775:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:779:1: ( ( ( rule__System__Group_3__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:780:1: ( ( rule__System__Group_3__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:780:1: ( ( rule__System__Group_3__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:781:1: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:782:1: ( rule__System__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:782:2: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1607);
                    rule__System__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:792:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:796:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:797:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41638);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__41641);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:804:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )? ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:808:1: ( ( ( rule__System__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:809:1: ( ( rule__System__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:809:1: ( ( rule__System__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:810:1: ( rule__System__Group_4__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:811:1: ( rule__System__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:811:2: rule__System__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1668);
                    rule__System__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:821:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:825:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:826:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51699);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__6_in_rule__System__Group__51702);
            rule__System__Group__6();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:833:1: rule__System__Group__5__Impl : ( ( rule__System__Group_5__0 )* ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:837:1: ( ( ( rule__System__Group_5__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:838:1: ( ( rule__System__Group_5__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:838:1: ( ( rule__System__Group_5__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:839:1: ( rule__System__Group_5__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:840:1: ( rule__System__Group_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:840:2: rule__System__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl1729);
            	    rule__System__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_5()); 

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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:850:1: rule__System__Group__6 : rule__System__Group__6__Impl ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:854:1: ( rule__System__Group__6__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:855:2: rule__System__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61760);
            rule__System__Group__6__Impl();

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
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:861:1: rule__System__Group__6__Impl : ( '}' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:865:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:866:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:866:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:867:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__System__Group__6__Impl1788); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group_3__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:894:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:898:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:899:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01833);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01836);
            rule__System__Group_3__1();

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
    // $ANTLR end "rule__System__Group_3__0"


    // $ANTLR start "rule__System__Group_3__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:906:1: rule__System__Group_3__0__Impl : ( 'port ->' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:910:1: ( ( 'port ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:911:1: ( 'port ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:911:1: ( 'port ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:912:1: 'port ->'
            {
             before(grammarAccess.getSystemAccess().getPortKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__System__Group_3__0__Impl1864); 
             after(grammarAccess.getSystemAccess().getPortKeyword_3_0()); 

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
    // $ANTLR end "rule__System__Group_3__0__Impl"


    // $ANTLR start "rule__System__Group_3__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:925:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:929:1: ( rule__System__Group_3__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:930:2: rule__System__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11895);
            rule__System__Group_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_3__1"


    // $ANTLR start "rule__System__Group_3__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:936:1: rule__System__Group_3__1__Impl : ( ( rule__System__PortAssignment_3_1 ) ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:940:1: ( ( ( rule__System__PortAssignment_3_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:941:1: ( ( rule__System__PortAssignment_3_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:941:1: ( ( rule__System__PortAssignment_3_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:942:1: ( rule__System__PortAssignment_3_1 )
            {
             before(grammarAccess.getSystemAccess().getPortAssignment_3_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:943:1: ( rule__System__PortAssignment_3_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:943:2: rule__System__PortAssignment_3_1
            {
            pushFollow(FOLLOW_rule__System__PortAssignment_3_1_in_rule__System__Group_3__1__Impl1922);
            rule__System__PortAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getPortAssignment_3_1()); 

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
    // $ANTLR end "rule__System__Group_3__1__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:957:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:961:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:962:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__01956);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__01959);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:969:1: rule__System__Group_4__0__Impl : ( 'version ->' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:973:1: ( ( 'version ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:974:1: ( 'version ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:974:1: ( 'version ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:975:1: 'version ->'
            {
             before(grammarAccess.getSystemAccess().getVersionKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__System__Group_4__0__Impl1987); 
             after(grammarAccess.getSystemAccess().getVersionKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:988:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:992:1: ( rule__System__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:993:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__12018);
            rule__System__Group_4__1__Impl();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:999:1: rule__System__Group_4__1__Impl : ( ( rule__System__VersionAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1003:1: ( ( ( rule__System__VersionAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1004:1: ( ( rule__System__VersionAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1004:1: ( ( rule__System__VersionAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1005:1: ( rule__System__VersionAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getVersionAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1006:1: ( rule__System__VersionAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1006:2: rule__System__VersionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__System__VersionAssignment_4_1_in_rule__System__Group_4__1__Impl2045);
            rule__System__VersionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getVersionAssignment_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__System__Group_5__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1020:1: rule__System__Group_5__0 : rule__System__Group_5__0__Impl rule__System__Group_5__1 ;
    public final void rule__System__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1024:1: ( rule__System__Group_5__0__Impl rule__System__Group_5__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1025:2: rule__System__Group_5__0__Impl rule__System__Group_5__1
            {
            pushFollow(FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__02079);
            rule__System__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__02082);
            rule__System__Group_5__1();

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
    // $ANTLR end "rule__System__Group_5__0"


    // $ANTLR start "rule__System__Group_5__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1032:1: rule__System__Group_5__0__Impl : ( 'registerProgram -> ' ) ;
    public final void rule__System__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1036:1: ( ( 'registerProgram -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1037:1: ( 'registerProgram -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1037:1: ( 'registerProgram -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1038:1: 'registerProgram -> '
            {
             before(grammarAccess.getSystemAccess().getRegisterProgramKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__System__Group_5__0__Impl2110); 
             after(grammarAccess.getSystemAccess().getRegisterProgramKeyword_5_0()); 

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
    // $ANTLR end "rule__System__Group_5__0__Impl"


    // $ANTLR start "rule__System__Group_5__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1051:1: rule__System__Group_5__1 : rule__System__Group_5__1__Impl ;
    public final void rule__System__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1055:1: ( rule__System__Group_5__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1056:2: rule__System__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__12141);
            rule__System__Group_5__1__Impl();

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
    // $ANTLR end "rule__System__Group_5__1"


    // $ANTLR start "rule__System__Group_5__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1062:1: rule__System__Group_5__1__Impl : ( ( rule__System__ProgramAssignment_5_1 ) ) ;
    public final void rule__System__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1066:1: ( ( ( rule__System__ProgramAssignment_5_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1067:1: ( ( rule__System__ProgramAssignment_5_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1067:1: ( ( rule__System__ProgramAssignment_5_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1068:1: ( rule__System__ProgramAssignment_5_1 )
            {
             before(grammarAccess.getSystemAccess().getProgramAssignment_5_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1069:1: ( rule__System__ProgramAssignment_5_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1069:2: rule__System__ProgramAssignment_5_1
            {
            pushFollow(FOLLOW_rule__System__ProgramAssignment_5_1_in_rule__System__Group_5__1__Impl2168);
            rule__System__ProgramAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProgramAssignment_5_1()); 

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
    // $ANTLR end "rule__System__Group_5__1__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1083:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1087:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1088:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02202);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02205);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1095:1: rule__Program__Group__0__Impl : ( 'program ' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1099:1: ( ( 'program ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1100:1: ( 'program ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1100:1: ( 'program ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1101:1: 'program '
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group__0__Impl2233); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1114:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1118:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1119:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12264);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12267);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1126:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1130:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1131:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1131:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1132:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1133:1: ( rule__Program__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1133:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2294);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1143:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1147:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1148:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22324);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22327);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1155:1: rule__Program__Group__2__Impl : ( '->' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1159:1: ( ( '->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1160:1: ( '->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1160:1: ( '->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1161:1: '->'
            {
             before(grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group__2__Impl2355); 
             after(grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1174:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1178:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1179:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32386);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__32389);
            rule__Program__Group__4();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1186:1: rule__Program__Group__3__Impl : ( ( rule__Program__PathAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1190:1: ( ( ( rule__Program__PathAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1191:1: ( ( rule__Program__PathAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1191:1: ( ( rule__Program__PathAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1192:1: ( rule__Program__PathAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPathAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1193:1: ( rule__Program__PathAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1193:2: rule__Program__PathAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl2416);
            rule__Program__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1203:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1207:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1208:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42446);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42449);
            rule__Program__Group__5();

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
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1215:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1219:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1220:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1220:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1221:1: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__4__Impl2477); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1234:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1238:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1239:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52508);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52511);
            rule__Program__Group__6();

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
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1246:1: rule__Program__Group__5__Impl : ( ( rule__Program__FunctionsAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1250:1: ( ( ( rule__Program__FunctionsAssignment_5 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1251:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1251:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1252:1: ( rule__Program__FunctionsAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1253:1: ( rule__Program__FunctionsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1253:2: rule__Program__FunctionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl2538);
            	    rule__Program__FunctionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_5()); 

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
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1263:1: rule__Program__Group__6 : rule__Program__Group__6__Impl ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1267:1: ( rule__Program__Group__6__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1268:2: rule__Program__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62569);
            rule__Program__Group__6__Impl();

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
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1274:1: rule__Program__Group__6__Impl : ( '}' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1278:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1279:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1279:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1280:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__6__Impl2597); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1307:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1311:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1312:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02642);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02645);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1319:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1323:1: ( ( 'def' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1324:1: ( 'def' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1324:1: ( 'def' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1325:1: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Function__Group__0__Impl2673); 
             after(grammarAccess.getFunctionAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1338:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1342:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1343:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12704);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12707);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1350:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1354:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1355:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1355:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1356:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1357:1: ( rule__Function__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1357:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2734);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1367:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1371:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1372:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22764);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22767);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1379:1: rule__Function__Group__2__Impl : ( '{' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1383:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1384:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1384:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1385:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Function__Group__2__Impl2795); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1398:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1402:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1403:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32826);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32829);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1410:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1414:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1415:1: ( ( rule__Function__Group_3__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1415:1: ( ( rule__Function__Group_3__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1416:1: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1417:1: ( rule__Function__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1417:2: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl2856);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1427:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1431:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1432:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42887);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42890);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1439:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1443:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1444:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1444:1: ( ( rule__Function__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1445:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1446:1: ( rule__Function__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1446:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl2917);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1456:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1460:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1461:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52948);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__52951);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1468:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1472:1: ( ( ( rule__Function__Group_5__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1473:1: ( ( rule__Function__Group_5__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1473:1: ( ( rule__Function__Group_5__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1474:1: ( rule__Function__Group_5__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1475:1: ( rule__Function__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1475:2: rule__Function__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl2978);
            	    rule__Function__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1485:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1489:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1490:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63009);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63012);
            rule__Function__Group__7();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1497:1: rule__Function__Group__6__Impl : ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1501:1: ( ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1502:1: ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1502:1: ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1503:1: ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1503:1: ( ( rule__Function__Group_6__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1504:1: ( rule__Function__Group_6__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1505:1: ( rule__Function__Group_6__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1505:2: rule__Function__Group_6__0
            {
            pushFollow(FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3041);
            rule__Function__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup_6()); 

            }

            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1508:1: ( ( rule__Function__Group_6__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1509:1: ( rule__Function__Group_6__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1510:1: ( rule__Function__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1510:2: rule__Function__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3053);
            	    rule__Function__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1521:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1525:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1526:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73086);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73089);
            rule__Function__Group__8();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1533:1: rule__Function__Group__7__Impl : ( ( rule__Function__Group_7__0 )* ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1537:1: ( ( ( rule__Function__Group_7__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1538:1: ( ( rule__Function__Group_7__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1538:1: ( ( rule__Function__Group_7__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1539:1: ( rule__Function__Group_7__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_7()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1540:1: ( rule__Function__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1540:2: rule__Function__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3116);
            	    rule__Function__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group__8"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1550:1: rule__Function__Group__8 : rule__Function__Group__8__Impl ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1554:1: ( rule__Function__Group__8__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1555:2: rule__Function__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83147);
            rule__Function__Group__8__Impl();

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
    // $ANTLR end "rule__Function__Group__8"


    // $ANTLR start "rule__Function__Group__8__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1561:1: rule__Function__Group__8__Impl : ( '}' ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1565:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1566:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1566:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1567:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Function__Group__8__Impl3175); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Function__Group__8__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1598:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1602:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1603:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__03224);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__03227);
            rule__Function__Group_3__1();

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
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1610:1: rule__Function__Group_3__0__Impl : ( 'desc ->' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1614:1: ( ( 'desc ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1615:1: ( 'desc ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1615:1: ( 'desc ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1616:1: 'desc ->'
            {
             before(grammarAccess.getFunctionAccess().getDescKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Function__Group_3__0__Impl3255); 
             after(grammarAccess.getFunctionAccess().getDescKeyword_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1629:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1633:1: ( rule__Function__Group_3__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1634:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__13286);
            rule__Function__Group_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1640:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__DescAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1644:1: ( ( ( rule__Function__DescAssignment_3_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1645:1: ( ( rule__Function__DescAssignment_3_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1645:1: ( ( rule__Function__DescAssignment_3_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1646:1: ( rule__Function__DescAssignment_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getDescAssignment_3_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1647:1: ( rule__Function__DescAssignment_3_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1647:2: rule__Function__DescAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Function__DescAssignment_3_1_in_rule__Function__Group_3__1__Impl3313);
            rule__Function__DescAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDescAssignment_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1661:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1665:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1666:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__03347);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__03350);
            rule__Function__Group_4__1();

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
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1673:1: rule__Function__Group_4__0__Impl : ( 'docurl ->' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1677:1: ( ( 'docurl ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1678:1: ( 'docurl ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1678:1: ( 'docurl ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1679:1: 'docurl ->'
            {
             before(grammarAccess.getFunctionAccess().getDocurlKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Function__Group_4__0__Impl3378); 
             after(grammarAccess.getFunctionAccess().getDocurlKeyword_4_0()); 

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
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1692:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1696:1: ( rule__Function__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1697:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__13409);
            rule__Function__Group_4__1__Impl();

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
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1703:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__DocurlAssignment_4_1 ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1707:1: ( ( ( rule__Function__DocurlAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1708:1: ( ( rule__Function__DocurlAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1708:1: ( ( rule__Function__DocurlAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1709:1: ( rule__Function__DocurlAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getDocurlAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1710:1: ( rule__Function__DocurlAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1710:2: rule__Function__DocurlAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Function__DocurlAssignment_4_1_in_rule__Function__Group_4__1__Impl3436);
            rule__Function__DocurlAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDocurlAssignment_4_1()); 

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
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Function__Group_5__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1724:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1728:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1729:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__03470);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__03473);
            rule__Function__Group_5__1();

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
    // $ANTLR end "rule__Function__Group_5__0"


    // $ANTLR start "rule__Function__Group_5__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1736:1: rule__Function__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1740:1: ( ( 'input' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1741:1: ( 'input' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1741:1: ( 'input' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1742:1: 'input'
            {
             before(grammarAccess.getFunctionAccess().getInputKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Function__Group_5__0__Impl3501); 
             after(grammarAccess.getFunctionAccess().getInputKeyword_5_0()); 

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
    // $ANTLR end "rule__Function__Group_5__0__Impl"


    // $ANTLR start "rule__Function__Group_5__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1755:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1759:1: ( rule__Function__Group_5__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1760:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__13532);
            rule__Function__Group_5__1__Impl();

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
    // $ANTLR end "rule__Function__Group_5__1"


    // $ANTLR start "rule__Function__Group_5__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1766:1: rule__Function__Group_5__1__Impl : ( ( rule__Function__InputAssignment_5_1 ) ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1770:1: ( ( ( rule__Function__InputAssignment_5_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1771:1: ( ( rule__Function__InputAssignment_5_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1771:1: ( ( rule__Function__InputAssignment_5_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1772:1: ( rule__Function__InputAssignment_5_1 )
            {
             before(grammarAccess.getFunctionAccess().getInputAssignment_5_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1773:1: ( rule__Function__InputAssignment_5_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1773:2: rule__Function__InputAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Function__InputAssignment_5_1_in_rule__Function__Group_5__1__Impl3559);
            rule__Function__InputAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputAssignment_5_1()); 

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
    // $ANTLR end "rule__Function__Group_5__1__Impl"


    // $ANTLR start "rule__Function__Group_6__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1787:1: rule__Function__Group_6__0 : rule__Function__Group_6__0__Impl rule__Function__Group_6__1 ;
    public final void rule__Function__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1791:1: ( rule__Function__Group_6__0__Impl rule__Function__Group_6__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1792:2: rule__Function__Group_6__0__Impl rule__Function__Group_6__1
            {
            pushFollow(FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__03593);
            rule__Function__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__03596);
            rule__Function__Group_6__1();

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
    // $ANTLR end "rule__Function__Group_6__0"


    // $ANTLR start "rule__Function__Group_6__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1799:1: rule__Function__Group_6__0__Impl : ( 'output ' ) ;
    public final void rule__Function__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1803:1: ( ( 'output ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1804:1: ( 'output ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1804:1: ( 'output ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1805:1: 'output '
            {
             before(grammarAccess.getFunctionAccess().getOutputKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__Function__Group_6__0__Impl3624); 
             after(grammarAccess.getFunctionAccess().getOutputKeyword_6_0()); 

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
    // $ANTLR end "rule__Function__Group_6__0__Impl"


    // $ANTLR start "rule__Function__Group_6__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1818:1: rule__Function__Group_6__1 : rule__Function__Group_6__1__Impl ;
    public final void rule__Function__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1822:1: ( rule__Function__Group_6__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1823:2: rule__Function__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__13655);
            rule__Function__Group_6__1__Impl();

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
    // $ANTLR end "rule__Function__Group_6__1"


    // $ANTLR start "rule__Function__Group_6__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1829:1: rule__Function__Group_6__1__Impl : ( ( rule__Function__OutputAssignment_6_1 ) ) ;
    public final void rule__Function__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1833:1: ( ( ( rule__Function__OutputAssignment_6_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1834:1: ( ( rule__Function__OutputAssignment_6_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1834:1: ( ( rule__Function__OutputAssignment_6_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1835:1: ( rule__Function__OutputAssignment_6_1 )
            {
             before(grammarAccess.getFunctionAccess().getOutputAssignment_6_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1836:1: ( rule__Function__OutputAssignment_6_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1836:2: rule__Function__OutputAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Function__OutputAssignment_6_1_in_rule__Function__Group_6__1__Impl3682);
            rule__Function__OutputAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOutputAssignment_6_1()); 

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
    // $ANTLR end "rule__Function__Group_6__1__Impl"


    // $ANTLR start "rule__Function__Group_7__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1850:1: rule__Function__Group_7__0 : rule__Function__Group_7__0__Impl rule__Function__Group_7__1 ;
    public final void rule__Function__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1854:1: ( rule__Function__Group_7__0__Impl rule__Function__Group_7__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1855:2: rule__Function__Group_7__0__Impl rule__Function__Group_7__1
            {
            pushFollow(FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__03716);
            rule__Function__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__03719);
            rule__Function__Group_7__1();

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
    // $ANTLR end "rule__Function__Group_7__0"


    // $ANTLR start "rule__Function__Group_7__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1862:1: rule__Function__Group_7__0__Impl : ( '* ' ) ;
    public final void rule__Function__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1866:1: ( ( '* ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1867:1: ( '* ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1867:1: ( '* ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1868:1: '* '
            {
             before(grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__Function__Group_7__0__Impl3747); 
             after(grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_7_0()); 

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
    // $ANTLR end "rule__Function__Group_7__0__Impl"


    // $ANTLR start "rule__Function__Group_7__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1881:1: rule__Function__Group_7__1 : rule__Function__Group_7__1__Impl ;
    public final void rule__Function__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1885:1: ( rule__Function__Group_7__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1886:2: rule__Function__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__13778);
            rule__Function__Group_7__1__Impl();

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
    // $ANTLR end "rule__Function__Group_7__1"


    // $ANTLR start "rule__Function__Group_7__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1892:1: rule__Function__Group_7__1__Impl : ( ( rule__Function__OptionBlocksAssignment_7_1 ) ) ;
    public final void rule__Function__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1896:1: ( ( ( rule__Function__OptionBlocksAssignment_7_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1897:1: ( ( rule__Function__OptionBlocksAssignment_7_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1897:1: ( ( rule__Function__OptionBlocksAssignment_7_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1898:1: ( rule__Function__OptionBlocksAssignment_7_1 )
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksAssignment_7_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1899:1: ( rule__Function__OptionBlocksAssignment_7_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1899:2: rule__Function__OptionBlocksAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Function__OptionBlocksAssignment_7_1_in_rule__Function__Group_7__1__Impl3805);
            rule__Function__OptionBlocksAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOptionBlocksAssignment_7_1()); 

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
    // $ANTLR end "rule__Function__Group_7__1__Impl"


    // $ANTLR start "rule__DataDefinition__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1913:1: rule__DataDefinition__Group__0 : rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1 ;
    public final void rule__DataDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1917:1: ( rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1918:2: rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__0__Impl_in_rule__DataDefinition__Group__03839);
            rule__DataDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__1_in_rule__DataDefinition__Group__03842);
            rule__DataDefinition__Group__1();

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
    // $ANTLR end "rule__DataDefinition__Group__0"


    // $ANTLR start "rule__DataDefinition__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1925:1: rule__DataDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DataDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1929:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1930:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1930:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1931:1: ()
            {
             before(grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1932:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1934:1: 
            {
            }

             after(grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDefinition__Group__0__Impl"


    // $ANTLR start "rule__DataDefinition__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1944:1: rule__DataDefinition__Group__1 : rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2 ;
    public final void rule__DataDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1948:1: ( rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1949:2: rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__1__Impl_in_rule__DataDefinition__Group__13900);
            rule__DataDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__2_in_rule__DataDefinition__Group__13903);
            rule__DataDefinition__Group__2();

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
    // $ANTLR end "rule__DataDefinition__Group__1"


    // $ANTLR start "rule__DataDefinition__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1956:1: rule__DataDefinition__Group__1__Impl : ( ( rule__DataDefinition__InputAssignment_1 ) ) ;
    public final void rule__DataDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1960:1: ( ( ( rule__DataDefinition__InputAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1961:1: ( ( rule__DataDefinition__InputAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1961:1: ( ( rule__DataDefinition__InputAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1962:1: ( rule__DataDefinition__InputAssignment_1 )
            {
             before(grammarAccess.getDataDefinitionAccess().getInputAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1963:1: ( rule__DataDefinition__InputAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1963:2: rule__DataDefinition__InputAssignment_1
            {
            pushFollow(FOLLOW_rule__DataDefinition__InputAssignment_1_in_rule__DataDefinition__Group__1__Impl3930);
            rule__DataDefinition__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDefinitionAccess().getInputAssignment_1()); 

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
    // $ANTLR end "rule__DataDefinition__Group__1__Impl"


    // $ANTLR start "rule__DataDefinition__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1973:1: rule__DataDefinition__Group__2 : rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3 ;
    public final void rule__DataDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1977:1: ( rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1978:2: rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__2__Impl_in_rule__DataDefinition__Group__23960);
            rule__DataDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__3_in_rule__DataDefinition__Group__23963);
            rule__DataDefinition__Group__3();

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
    // $ANTLR end "rule__DataDefinition__Group__2"


    // $ANTLR start "rule__DataDefinition__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1985:1: rule__DataDefinition__Group__2__Impl : ( 'AS' ) ;
    public final void rule__DataDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1989:1: ( ( 'AS' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1990:1: ( 'AS' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1990:1: ( 'AS' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1991:1: 'AS'
            {
             before(grammarAccess.getDataDefinitionAccess().getASKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__DataDefinition__Group__2__Impl3991); 
             after(grammarAccess.getDataDefinitionAccess().getASKeyword_2()); 

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
    // $ANTLR end "rule__DataDefinition__Group__2__Impl"


    // $ANTLR start "rule__DataDefinition__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2004:1: rule__DataDefinition__Group__3 : rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4 ;
    public final void rule__DataDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2008:1: ( rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2009:2: rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__3__Impl_in_rule__DataDefinition__Group__34022);
            rule__DataDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__4_in_rule__DataDefinition__Group__34025);
            rule__DataDefinition__Group__4();

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
    // $ANTLR end "rule__DataDefinition__Group__3"


    // $ANTLR start "rule__DataDefinition__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2016:1: rule__DataDefinition__Group__3__Impl : ( ( rule__DataDefinition__TypeAssignment_3 ) ) ;
    public final void rule__DataDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2020:1: ( ( ( rule__DataDefinition__TypeAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2021:1: ( ( rule__DataDefinition__TypeAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2021:1: ( ( rule__DataDefinition__TypeAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2022:1: ( rule__DataDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getDataDefinitionAccess().getTypeAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2023:1: ( rule__DataDefinition__TypeAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2023:2: rule__DataDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__DataDefinition__TypeAssignment_3_in_rule__DataDefinition__Group__3__Impl4052);
            rule__DataDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDefinitionAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__DataDefinition__Group__3__Impl"


    // $ANTLR start "rule__DataDefinition__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2033:1: rule__DataDefinition__Group__4 : rule__DataDefinition__Group__4__Impl ;
    public final void rule__DataDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2037:1: ( rule__DataDefinition__Group__4__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2038:2: rule__DataDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__4__Impl_in_rule__DataDefinition__Group__44082);
            rule__DataDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__DataDefinition__Group__4"


    // $ANTLR start "rule__DataDefinition__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2044:1: rule__DataDefinition__Group__4__Impl : ( ( rule__DataDefinition__Group_4__0 )? ) ;
    public final void rule__DataDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2048:1: ( ( ( rule__DataDefinition__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2049:1: ( ( rule__DataDefinition__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2049:1: ( ( rule__DataDefinition__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2050:1: ( rule__DataDefinition__Group_4__0 )?
            {
             before(grammarAccess.getDataDefinitionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2051:1: ( rule__DataDefinition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2051:2: rule__DataDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DataDefinition__Group_4__0_in_rule__DataDefinition__Group__4__Impl4109);
                    rule__DataDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DataDefinition__Group__4__Impl"


    // $ANTLR start "rule__DataDefinition__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2071:1: rule__DataDefinition__Group_4__0 : rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1 ;
    public final void rule__DataDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2075:1: ( rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2076:2: rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group_4__0__Impl_in_rule__DataDefinition__Group_4__04150);
            rule__DataDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group_4__1_in_rule__DataDefinition__Group_4__04153);
            rule__DataDefinition__Group_4__1();

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
    // $ANTLR end "rule__DataDefinition__Group_4__0"


    // $ANTLR start "rule__DataDefinition__Group_4__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2083:1: rule__DataDefinition__Group_4__0__Impl : ( 'doc -> ' ) ;
    public final void rule__DataDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2087:1: ( ( 'doc -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2088:1: ( 'doc -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2088:1: ( 'doc -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2089:1: 'doc -> '
            {
             before(grammarAccess.getDataDefinitionAccess().getDocKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__DataDefinition__Group_4__0__Impl4181); 
             after(grammarAccess.getDataDefinitionAccess().getDocKeyword_4_0()); 

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
    // $ANTLR end "rule__DataDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__DataDefinition__Group_4__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2102:1: rule__DataDefinition__Group_4__1 : rule__DataDefinition__Group_4__1__Impl ;
    public final void rule__DataDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2106:1: ( rule__DataDefinition__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2107:2: rule__DataDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group_4__1__Impl_in_rule__DataDefinition__Group_4__14212);
            rule__DataDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataDefinition__Group_4__1"


    // $ANTLR start "rule__DataDefinition__Group_4__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2113:1: rule__DataDefinition__Group_4__1__Impl : ( ( rule__DataDefinition__DocAssignment_4_1 ) ) ;
    public final void rule__DataDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2117:1: ( ( ( rule__DataDefinition__DocAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2118:1: ( ( rule__DataDefinition__DocAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2118:1: ( ( rule__DataDefinition__DocAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2119:1: ( rule__DataDefinition__DocAssignment_4_1 )
            {
             before(grammarAccess.getDataDefinitionAccess().getDocAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2120:1: ( rule__DataDefinition__DocAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2120:2: rule__DataDefinition__DocAssignment_4_1
            {
            pushFollow(FOLLOW_rule__DataDefinition__DocAssignment_4_1_in_rule__DataDefinition__Group_4__1__Impl4239);
            rule__DataDefinition__DocAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDefinitionAccess().getDocAssignment_4_1()); 

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
    // $ANTLR end "rule__DataDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ConcatExpression__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2134:1: rule__ConcatExpression__Group__0 : rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 ;
    public final void rule__ConcatExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2138:1: ( rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2139:2: rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__04273);
            rule__ConcatExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__04276);
            rule__ConcatExpression__Group__1();

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
    // $ANTLR end "rule__ConcatExpression__Group__0"


    // $ANTLR start "rule__ConcatExpression__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2146:1: rule__ConcatExpression__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ConcatExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2150:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2151:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2151:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2152:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl4303);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConcatExpression__Group__0__Impl"


    // $ANTLR start "rule__ConcatExpression__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2163:1: rule__ConcatExpression__Group__1 : rule__ConcatExpression__Group__1__Impl ;
    public final void rule__ConcatExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2167:1: ( rule__ConcatExpression__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2168:2: rule__ConcatExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__14332);
            rule__ConcatExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ConcatExpression__Group__1"


    // $ANTLR start "rule__ConcatExpression__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2174:1: rule__ConcatExpression__Group__1__Impl : ( ( rule__ConcatExpression__Group_1__0 )* ) ;
    public final void rule__ConcatExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2178:1: ( ( ( rule__ConcatExpression__Group_1__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2179:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2179:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2180:1: ( rule__ConcatExpression__Group_1__0 )*
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2181:1: ( rule__ConcatExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2181:2: rule__ConcatExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl4359);
            	    rule__ConcatExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConcatExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConcatExpression__Group__1__Impl"


    // $ANTLR start "rule__ConcatExpression__Group_1__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2195:1: rule__ConcatExpression__Group_1__0 : rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 ;
    public final void rule__ConcatExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2199:1: ( rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2200:2: rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__04394);
            rule__ConcatExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__04397);
            rule__ConcatExpression__Group_1__1();

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
    // $ANTLR end "rule__ConcatExpression__Group_1__0"


    // $ANTLR start "rule__ConcatExpression__Group_1__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2207:1: rule__ConcatExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2211:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2212:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2212:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2213:1: ()
            {
             before(grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2214:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2216:1: 
            {
            }

             after(grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConcatExpression__Group_1__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2226:1: rule__ConcatExpression__Group_1__1 : rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 ;
    public final void rule__ConcatExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2230:1: ( rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2231:2: rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__14455);
            rule__ConcatExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__14458);
            rule__ConcatExpression__Group_1__2();

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
    // $ANTLR end "rule__ConcatExpression__Group_1__1"


    // $ANTLR start "rule__ConcatExpression__Group_1__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2238:1: rule__ConcatExpression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ConcatExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2242:1: ( ( '+' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2243:1: ( '+' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2243:1: ( '+' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2244:1: '+'
            {
             before(grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__ConcatExpression__Group_1__1__Impl4486); 
             after(grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__ConcatExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConcatExpression__Group_1__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2257:1: rule__ConcatExpression__Group_1__2 : rule__ConcatExpression__Group_1__2__Impl ;
    public final void rule__ConcatExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2261:1: ( rule__ConcatExpression__Group_1__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2262:2: rule__ConcatExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__24517);
            rule__ConcatExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConcatExpression__Group_1__2"


    // $ANTLR start "rule__ConcatExpression__Group_1__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2268:1: rule__ConcatExpression__Group_1__2__Impl : ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2272:1: ( ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2273:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2273:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2274:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatExpressionAccess().getRightAssignment_1_2()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2275:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2275:2: rule__ConcatExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl4544);
            rule__ConcatExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConcatExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2291:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2295:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2296:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__04580);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__04583);
            rule__DoubleLiteral__Group__1();

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
    // $ANTLR end "rule__DoubleLiteral__Group__0"


    // $ANTLR start "rule__DoubleLiteral__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2303:1: rule__DoubleLiteral__Group__0__Impl : ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2307:1: ( ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2308:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2308:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2309:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2310:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2310:2: rule__DoubleLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl4610);
            rule__DoubleLiteral__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__DoubleLiteral__Group__0__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2320:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2324:1: ( rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2325:2: rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__14640);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__14643);
            rule__DoubleLiteral__Group__2();

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
    // $ANTLR end "rule__DoubleLiteral__Group__1"


    // $ANTLR start "rule__DoubleLiteral__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2332:1: rule__DoubleLiteral__Group__1__Impl : ( '.' ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2336:1: ( ( '.' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2337:1: ( '.' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2337:1: ( '.' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2338:1: '.'
            {
             before(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__DoubleLiteral__Group__1__Impl4671); 
             after(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DoubleLiteral__Group__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2351:1: rule__DoubleLiteral__Group__2 : rule__DoubleLiteral__Group__2__Impl ;
    public final void rule__DoubleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2355:1: ( rule__DoubleLiteral__Group__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2356:2: rule__DoubleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__24702);
            rule__DoubleLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__DoubleLiteral__Group__2"


    // $ANTLR start "rule__DoubleLiteral__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2362:1: rule__DoubleLiteral__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2366:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2367:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2367:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2368:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl4729); 
             after(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DoubleLiteral__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2385:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2389:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2390:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04764);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04767);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2397:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2401:1: ( ( 'import' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2402:1: ( 'import' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2402:1: ( 'import' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2403:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Import__Group__0__Impl4795); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2416:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2420:1: ( rule__Import__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2421:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14826);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2427:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2431:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2432:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2432:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2433:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2434:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2434:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl4853);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2448:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2452:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2453:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04887);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04890);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2460:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2464:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2465:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2465:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2466:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4917);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2477:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2481:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2482:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14946);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2488:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2492:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2493:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2493:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2494:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2495:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2495:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4973);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2509:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2513:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2514:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05008);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05011);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2521:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2525:1: ( ( '.' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2526:1: ( '.' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2526:1: ( '.' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2527:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl5039); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2540:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2544:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2545:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15070);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2551:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2555:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2556:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2556:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2557:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl5097);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2573:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2577:1: ( ( ruleImport ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2578:1: ( ruleImport )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2578:1: ( ruleImport )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2579:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_05135);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ProgramsAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2588:1: rule__Model__ProgramsAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2592:1: ( ( ruleProgram ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2593:1: ( ruleProgram )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2593:1: ( ruleProgram )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2594:1: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_15166);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ProgramsAssignment_1"


    // $ANTLR start "rule__Model__SystemAssignment_2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2603:1: rule__Model__SystemAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__SystemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2607:1: ( ( ruleSystem ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2608:1: ( ruleSystem )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2608:1: ( ruleSystem )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2609:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemAssignment_25197);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__SystemAssignment_2"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2618:1: rule__System__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2622:1: ( ( ruleQualifiedName ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2623:1: ( ruleQualifiedName )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2623:1: ( ruleQualifiedName )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2624:1: ruleQualifiedName
            {
             before(grammarAccess.getSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__System__NameAssignment_15228);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__PortAssignment_3_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2633:1: rule__System__PortAssignment_3_1 : ( ruleIntegerLiteral ) ;
    public final void rule__System__PortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2637:1: ( ( ruleIntegerLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2638:1: ( ruleIntegerLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2638:1: ( ruleIntegerLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2639:1: ruleIntegerLiteral
            {
             before(grammarAccess.getSystemAccess().getPortIntegerLiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__System__PortAssignment_3_15259);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getPortIntegerLiteralParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__System__PortAssignment_3_1"


    // $ANTLR start "rule__System__VersionAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2648:1: rule__System__VersionAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__System__VersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2652:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2653:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2653:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2654:1: ruleStringLiteral
            {
             before(grammarAccess.getSystemAccess().getVersionStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__System__VersionAssignment_4_15290);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getVersionStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__System__VersionAssignment_4_1"


    // $ANTLR start "rule__System__ProgramAssignment_5_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2663:1: rule__System__ProgramAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__System__ProgramAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2667:1: ( ( ( RULE_ID ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2668:1: ( ( RULE_ID ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2668:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2669:1: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getProgramProgramCrossReference_5_1_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2670:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2671:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getProgramProgramIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__ProgramAssignment_5_15325); 
             after(grammarAccess.getSystemAccess().getProgramProgramIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProgramProgramCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__System__ProgramAssignment_5_1"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2682:1: rule__Program__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2686:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2687:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2687:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2688:1: ruleValidID
            {
             before(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Program__NameAssignment_15360);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__PathAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2697:1: rule__Program__PathAssignment_3 : ( ruleConcatExpression ) ;
    public final void rule__Program__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2701:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2702:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2702:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2703:1: ruleConcatExpression
            {
             before(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_35391);
            ruleConcatExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Program__PathAssignment_3"


    // $ANTLR start "rule__Program__FunctionsAssignment_5"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2712:1: rule__Program__FunctionsAssignment_5 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2716:1: ( ( ruleFunction ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2717:1: ( ruleFunction )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2717:1: ( ruleFunction )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2718:1: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_55422);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Program__FunctionsAssignment_5"


    // $ANTLR start "rule__Param__NameAssignment"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2727:1: rule__Param__NameAssignment : ( ruleValidID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2731:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2732:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2732:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2733:1: ruleValidID
            {
             before(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Param__NameAssignment5453);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2742:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2746:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2747:1: ( RULE_ID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2747:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2748:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15484); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__DescAssignment_3_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2757:1: rule__Function__DescAssignment_3_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DescAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2761:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2762:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2762:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2763:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_3_15515);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Function__DescAssignment_3_1"


    // $ANTLR start "rule__Function__DocurlAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2772:1: rule__Function__DocurlAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DocurlAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2776:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2777:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2777:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2778:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_4_15546);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Function__DocurlAssignment_4_1"


    // $ANTLR start "rule__Function__InputAssignment_5_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2787:1: rule__Function__InputAssignment_5_1 : ( ruleDataDefinition ) ;
    public final void rule__Function__InputAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2791:1: ( ( ruleDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2792:1: ( ruleDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2792:1: ( ruleDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2793:1: ruleDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_rule__Function__InputAssignment_5_15577);
            ruleDataDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Function__InputAssignment_5_1"


    // $ANTLR start "rule__Function__OutputAssignment_6_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2802:1: rule__Function__OutputAssignment_6_1 : ( ruleDataDefinition ) ;
    public final void rule__Function__OutputAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2806:1: ( ( ruleDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2807:1: ( ruleDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2807:1: ( ruleDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2808:1: ruleDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_rule__Function__OutputAssignment_6_15608);
            ruleDataDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Function__OutputAssignment_6_1"


    // $ANTLR start "rule__Function__OptionBlocksAssignment_7_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2817:1: rule__Function__OptionBlocksAssignment_7_1 : ( ruleOption ) ;
    public final void rule__Function__OptionBlocksAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2821:1: ( ( ruleOption ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2822:1: ( ruleOption )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2822:1: ( ruleOption )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2823:1: ruleOption
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_7_15639);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Function__OptionBlocksAssignment_7_1"


    // $ANTLR start "rule__DataDefinition__InputAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2832:1: rule__DataDefinition__InputAssignment_1 : ( ruleParam ) ;
    public final void rule__DataDefinition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2836:1: ( ( ruleParam ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2837:1: ( ruleParam )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2837:1: ( ruleParam )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2838:1: ruleParam
            {
             before(grammarAccess.getDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__DataDefinition__InputAssignment_15670);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataDefinition__InputAssignment_1"


    // $ANTLR start "rule__DataDefinition__TypeAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2847:1: rule__DataDefinition__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__DataDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2851:1: ( ( ruleDataType ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2852:1: ( ruleDataType )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2852:1: ( ruleDataType )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2853:1: ruleDataType
            {
             before(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__DataDefinition__TypeAssignment_35701);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataDefinition__TypeAssignment_3"


    // $ANTLR start "rule__DataDefinition__DocAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2862:1: rule__DataDefinition__DocAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__DataDefinition__DocAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2866:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2867:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2867:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2868:1: ruleStringLiteral
            {
             before(grammarAccess.getDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__DataDefinition__DocAssignment_4_15732);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__DataDefinition__DocAssignment_4_1"


    // $ANTLR start "rule__Option__ParamAssignment"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2877:1: rule__Option__ParamAssignment : ( ruleConcatExpression ) ;
    public final void rule__Option__ParamAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2881:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2882:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2882:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2883:1: ruleConcatExpression
            {
             before(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment5763);
            ruleConcatExpression();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Option__ParamAssignment"


    // $ANTLR start "rule__ConcatExpression__RightAssignment_1_2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2892:1: rule__ConcatExpression__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ConcatExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2896:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2897:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2897:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2898:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_25794);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConcatExpression__RightAssignment_1_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2907:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2911:1: ( ( RULE_STRING ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2912:1: ( RULE_STRING )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2912:1: ( RULE_STRING )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2913:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment5825); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2922:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2926:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2927:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2927:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2928:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment5856); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__DoubleLiteral__ValueAssignment_0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2937:1: rule__DoubleLiteral__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2941:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2942:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2942:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2943:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_05887); 
             after(grammarAccess.getDoubleLiteralAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DoubleLiteral__ValueAssignment_0"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2952:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2956:1: ( ( RULE_STRING ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2957:1: ( RULE_STRING )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2957:1: ( RULE_STRING )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2958:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15918); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Primary__ParamAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2967:1: rule__Primary__ParamAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2971:1: ( ( ( RULE_ID ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2972:1: ( ( RULE_ID ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2972:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2973:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getParamParamCrossReference_3_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2974:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2975:1: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getParamParamIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_35953); 
             after(grammarAccess.getPrimaryAccess().getParamParamIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getParamParamCrossReference_3_0()); 

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
    // $ANTLR end "rule__Primary__ParamAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_in_ruleParam274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__0_in_ruleDataDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ParamAssignment_in_ruleOption454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataType__Alternatives1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01207 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl1237 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11268 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProgramsAssignment_1_in_rule__Model__Group__1__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SystemAssignment_2_in_rule__Model__Group__2__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__01396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__System__Group__0__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21515 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__21518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__System__Group__2__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31577 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__31580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41638 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__41641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51699 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__System__Group__6_in_rule__System__Group__51702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl1729 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__System__Group__6__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__System__Group_3__0__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__PortAssignment_3_1_in_rule__System__Group_3__1__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__01956 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__01959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__System__Group_4__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__VersionAssignment_4_1_in_rule__System__Group_4__1__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__02079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__System__Group_5__0__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ProgramAssignment_5_1_in_rule__System__Group_5__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group__0__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12264 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22324 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group__2__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32386 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__32389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42446 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__4__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52508 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl2538 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__6__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Function__Group__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22764 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Function__Group__2__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32826 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42887 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52948 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__52951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl2978 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63009 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3041 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3053 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73086 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3116 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group__8__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__03224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Function__Group_3__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__13286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DescAssignment_3_1_in_rule__Function__Group_3__1__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__03347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Function__Group_4__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__13409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DocurlAssignment_4_1_in_rule__Function__Group_4__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__03470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Function__Group_5__0__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__InputAssignment_5_1_in_rule__Function__Group_5__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__03593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__03596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Function__Group_6__0__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OutputAssignment_6_1_in_rule__Function__Group_6__1__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__03716 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Function__Group_7__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OptionBlocksAssignment_7_1_in_rule__Function__Group_7__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__0__Impl_in_rule__DataDefinition__Group__03839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__1_in_rule__DataDefinition__Group__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__1__Impl_in_rule__DataDefinition__Group__13900 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__2_in_rule__DataDefinition__Group__13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__InputAssignment_1_in_rule__DataDefinition__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__2__Impl_in_rule__DataDefinition__Group__23960 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__3_in_rule__DataDefinition__Group__23963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataDefinition__Group__2__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__3__Impl_in_rule__DataDefinition__Group__34022 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__4_in_rule__DataDefinition__Group__34025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__TypeAssignment_3_in_rule__DataDefinition__Group__3__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__4__Impl_in_rule__DataDefinition__Group__44082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__0_in_rule__DataDefinition__Group__4__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__0__Impl_in_rule__DataDefinition__Group_4__04150 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__1_in_rule__DataDefinition__Group_4__04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataDefinition__Group_4__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__1__Impl_in_rule__DataDefinition__Group_4__14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__DocAssignment_4_1_in_rule__DataDefinition__Group_4__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__04273 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__04276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__14332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl4359 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__04394 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__04397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__14455 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__14458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ConcatExpression__Group_1__1__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__24517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__04580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__04583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__14640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DoubleLiteral__Group__1__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__24702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Import__Group__0__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04887 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4973 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_05135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_15166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemAssignment_25197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__System__NameAssignment_15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__System__PortAssignment_3_15259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__System__VersionAssignment_4_15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__ProgramAssignment_5_15325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Program__NameAssignment_15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_35391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_55422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Param__NameAssignment5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_3_15515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_4_15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rule__Function__InputAssignment_5_15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rule__Function__OutputAssignment_6_15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_7_15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__DataDefinition__InputAssignment_15670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__DataDefinition__TypeAssignment_35701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__DataDefinition__DocAssignment_4_15732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_25794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_05887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_35953 = new BitSet(new long[]{0x0000000000000002L});

}