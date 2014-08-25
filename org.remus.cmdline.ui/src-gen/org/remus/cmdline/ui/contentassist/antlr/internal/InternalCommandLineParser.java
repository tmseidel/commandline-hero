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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STDOUT'", "'STDERR'", "'BOTH'", "'STRING'", "'PATH'", "'FOLDERPATH'", "'system '", "'{'", "'}'", "'port ->'", "'version ->'", "'registerProgram -> '", "'program '", "'->'", "'def'", "'with '", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'as'", "'doc -> '", "'+'", "'.'"
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
    public static final int T__35=35;
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


    // $ANTLR start "entryRuleInputDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:200:1: entryRuleInputDataDefinition : ruleInputDataDefinition EOF ;
    public final void entryRuleInputDataDefinition() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:201:1: ( ruleInputDataDefinition EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:202:1: ruleInputDataDefinition EOF
            {
             before(grammarAccess.getInputDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleInputDataDefinition_in_entryRuleInputDataDefinition361);
            ruleInputDataDefinition();

            state._fsp--;

             after(grammarAccess.getInputDataDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDataDefinition368); 

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
    // $ANTLR end "entryRuleInputDataDefinition"


    // $ANTLR start "ruleInputDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:209:1: ruleInputDataDefinition : ( ( rule__InputDataDefinition__Group__0 ) ) ;
    public final void ruleInputDataDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:213:2: ( ( ( rule__InputDataDefinition__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__InputDataDefinition__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__InputDataDefinition__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:215:1: ( rule__InputDataDefinition__Group__0 )
            {
             before(grammarAccess.getInputDataDefinitionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:1: ( rule__InputDataDefinition__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:2: rule__InputDataDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__0_in_ruleInputDataDefinition394);
            rule__InputDataDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputDataDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleInputDataDefinition"


    // $ANTLR start "entryRuleOutputDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:228:1: entryRuleOutputDataDefinition : ruleOutputDataDefinition EOF ;
    public final void entryRuleOutputDataDefinition() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:229:1: ( ruleOutputDataDefinition EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:230:1: ruleOutputDataDefinition EOF
            {
             before(grammarAccess.getOutputDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleOutputDataDefinition_in_entryRuleOutputDataDefinition421);
            ruleOutputDataDefinition();

            state._fsp--;

             after(grammarAccess.getOutputDataDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDataDefinition428); 

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
    // $ANTLR end "entryRuleOutputDataDefinition"


    // $ANTLR start "ruleOutputDataDefinition"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:237:1: ruleOutputDataDefinition : ( ( rule__OutputDataDefinition__Group__0 ) ) ;
    public final void ruleOutputDataDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:241:2: ( ( ( rule__OutputDataDefinition__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__OutputDataDefinition__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__OutputDataDefinition__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:243:1: ( rule__OutputDataDefinition__Group__0 )
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:1: ( rule__OutputDataDefinition__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:2: rule__OutputDataDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__0_in_ruleOutputDataDefinition454);
            rule__OutputDataDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleOutputDataDefinition"


    // $ANTLR start "entryRuleOption"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:256:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:257:1: ( ruleOption EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:258:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption481);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption488); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:265:1: ruleOption : ( ( rule__Option__ParamAssignment ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:269:2: ( ( ( rule__Option__ParamAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__Option__ParamAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__Option__ParamAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:271:1: ( rule__Option__ParamAssignment )
            {
             before(grammarAccess.getOptionAccess().getParamAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:1: ( rule__Option__ParamAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:2: rule__Option__ParamAssignment
            {
            pushFollow(FOLLOW_rule__Option__ParamAssignment_in_ruleOption514);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:284:1: entryRuleConcatExpression : ruleConcatExpression EOF ;
    public final void entryRuleConcatExpression() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:285:1: ( ruleConcatExpression EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:286:1: ruleConcatExpression EOF
            {
             before(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression541);
            ruleConcatExpression();

            state._fsp--;

             after(grammarAccess.getConcatExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression548); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:293:1: ruleConcatExpression : ( ( rule__ConcatExpression__Group__0 ) ) ;
    public final void ruleConcatExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:297:2: ( ( ( rule__ConcatExpression__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__ConcatExpression__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__ConcatExpression__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:299:1: ( rule__ConcatExpression__Group__0 )
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:1: ( rule__ConcatExpression__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:2: rule__ConcatExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression574);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:312:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:313:1: ( ruleStringLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:314:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral601);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral608); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:321:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:325:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:327:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral634);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:340:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:341:1: ( ruleIntegerLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:342:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral661);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral668); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:349:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:353:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:355:1: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral694);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:368:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:369:1: ( ruleDoubleLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:370:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral721);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral728); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:377:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:381:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:382:1: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:382:1: ( ( rule__DoubleLiteral__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:383:1: ( rule__DoubleLiteral__Group__0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:1: ( rule__DoubleLiteral__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:2: rule__DoubleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral754);
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


    // $ANTLR start "rulePrintMode"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:481:1: rulePrintMode : ( ( rule__PrintMode__Alternatives ) ) ;
    public final void rulePrintMode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:485:1: ( ( ( rule__PrintMode__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:1: ( ( rule__PrintMode__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:1: ( ( rule__PrintMode__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:487:1: ( rule__PrintMode__Alternatives )
            {
             before(grammarAccess.getPrintModeAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:488:1: ( rule__PrintMode__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:488:2: rule__PrintMode__Alternatives
            {
            pushFollow(FOLLOW_rule__PrintMode__Alternatives_in_rulePrintMode970);
            rule__PrintMode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrintModeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrintMode"


    // $ANTLR start "ruleInputDataType"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:500:1: ruleInputDataType : ( ( rule__InputDataType__Alternatives ) ) ;
    public final void ruleInputDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:504:1: ( ( ( rule__InputDataType__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:505:1: ( ( rule__InputDataType__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:505:1: ( ( rule__InputDataType__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:506:1: ( rule__InputDataType__Alternatives )
            {
             before(grammarAccess.getInputDataTypeAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:507:1: ( rule__InputDataType__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:507:2: rule__InputDataType__Alternatives
            {
            pushFollow(FOLLOW_rule__InputDataType__Alternatives_in_ruleInputDataType1006);
            rule__InputDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInputDataType"


    // $ANTLR start "ruleOutputDataType"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:519:1: ruleOutputDataType : ( ( rule__OutputDataType__Alternatives ) ) ;
    public final void ruleOutputDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:523:1: ( ( ( rule__OutputDataType__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:524:1: ( ( rule__OutputDataType__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:524:1: ( ( rule__OutputDataType__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:525:1: ( rule__OutputDataType__Alternatives )
            {
             before(grammarAccess.getOutputDataTypeAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:526:1: ( rule__OutputDataType__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:526:2: rule__OutputDataType__Alternatives
            {
            pushFollow(FOLLOW_rule__OutputDataType__Alternatives_in_ruleOutputDataType1042);
            rule__OutputDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOutputDataType"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:537:1: rule__Primary__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:541:1: ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) )
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

                if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)||LA1_2==31||LA1_2==34) ) {
                    alt1=2;
                }
                else if ( (LA1_2==35) ) {
                    alt1=3;
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
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:542:1: ( ruleStringLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:542:1: ( ruleStringLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:543:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives1077);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:548:6: ( ruleIntegerLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:548:6: ( ruleIntegerLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:549:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives1094);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:554:6: ( ruleDoubleLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:554:6: ( ruleDoubleLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:555:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives1111);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:560:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:560:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:561:1: ( rule__Primary__ParamAssignment_3 )
                    {
                     before(grammarAccess.getPrimaryAccess().getParamAssignment_3()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:562:1: ( rule__Primary__ParamAssignment_3 )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:562:2: rule__Primary__ParamAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives1128);
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


    // $ANTLR start "rule__PrintMode__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:571:1: rule__PrintMode__Alternatives : ( ( ( 'STDOUT' ) ) | ( ( 'STDERR' ) ) | ( ( 'BOTH' ) ) );
    public final void rule__PrintMode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:575:1: ( ( ( 'STDOUT' ) ) | ( ( 'STDERR' ) ) | ( ( 'BOTH' ) ) )
            int alt2=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:576:1: ( ( 'STDOUT' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:576:1: ( ( 'STDOUT' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:577:1: ( 'STDOUT' )
                    {
                     before(grammarAccess.getPrintModeAccess().getSTDOUTEnumLiteralDeclaration_0()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:578:1: ( 'STDOUT' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:578:3: 'STDOUT'
                    {
                    match(input,11,FOLLOW_11_in_rule__PrintMode__Alternatives1162); 

                    }

                     after(grammarAccess.getPrintModeAccess().getSTDOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:583:6: ( ( 'STDERR' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:583:6: ( ( 'STDERR' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:584:1: ( 'STDERR' )
                    {
                     before(grammarAccess.getPrintModeAccess().getSTDERREnumLiteralDeclaration_1()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:585:1: ( 'STDERR' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:585:3: 'STDERR'
                    {
                    match(input,12,FOLLOW_12_in_rule__PrintMode__Alternatives1183); 

                    }

                     after(grammarAccess.getPrintModeAccess().getSTDERREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:590:6: ( ( 'BOTH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:590:6: ( ( 'BOTH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:591:1: ( 'BOTH' )
                    {
                     before(grammarAccess.getPrintModeAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:592:1: ( 'BOTH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:592:3: 'BOTH'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrintMode__Alternatives1204); 

                    }

                     after(grammarAccess.getPrintModeAccess().getBOTHEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PrintMode__Alternatives"


    // $ANTLR start "rule__InputDataType__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:602:1: rule__InputDataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'PATH' ) ) );
    public final void rule__InputDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:606:1: ( ( ( 'STRING' ) ) | ( ( 'PATH' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:607:1: ( ( 'STRING' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:607:1: ( ( 'STRING' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:608:1: ( 'STRING' )
                    {
                     before(grammarAccess.getInputDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:609:1: ( 'STRING' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:609:3: 'STRING'
                    {
                    match(input,14,FOLLOW_14_in_rule__InputDataType__Alternatives1240); 

                    }

                     after(grammarAccess.getInputDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:614:6: ( ( 'PATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:614:6: ( ( 'PATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:615:1: ( 'PATH' )
                    {
                     before(grammarAccess.getInputDataTypeAccess().getPATHEnumLiteralDeclaration_1()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:616:1: ( 'PATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:616:3: 'PATH'
                    {
                    match(input,15,FOLLOW_15_in_rule__InputDataType__Alternatives1261); 

                    }

                     after(grammarAccess.getInputDataTypeAccess().getPATHEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__InputDataType__Alternatives"


    // $ANTLR start "rule__OutputDataType__Alternatives"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:626:1: rule__OutputDataType__Alternatives : ( ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) );
    public final void rule__OutputDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:630:1: ( ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:631:1: ( ( 'PATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:631:1: ( ( 'PATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:632:1: ( 'PATH' )
                    {
                     before(grammarAccess.getOutputDataTypeAccess().getPATHEnumLiteralDeclaration_0()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:633:1: ( 'PATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:633:3: 'PATH'
                    {
                    match(input,15,FOLLOW_15_in_rule__OutputDataType__Alternatives1297); 

                    }

                     after(grammarAccess.getOutputDataTypeAccess().getPATHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:638:6: ( ( 'FOLDERPATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:638:6: ( ( 'FOLDERPATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:639:1: ( 'FOLDERPATH' )
                    {
                     before(grammarAccess.getOutputDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_1()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:640:1: ( 'FOLDERPATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:640:3: 'FOLDERPATH'
                    {
                    match(input,16,FOLLOW_16_in_rule__OutputDataType__Alternatives1318); 

                    }

                     after(grammarAccess.getOutputDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OutputDataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:652:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:656:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:657:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01351);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01354);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:664:1: rule__Model__Group__0__Impl : ( ( rule__Model__ProgramsAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:668:1: ( ( ( rule__Model__ProgramsAssignment_0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:669:1: ( ( rule__Model__ProgramsAssignment_0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:669:1: ( ( rule__Model__ProgramsAssignment_0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:670:1: ( rule__Model__ProgramsAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getProgramsAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:671:1: ( rule__Model__ProgramsAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:671:2: rule__Model__ProgramsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ProgramsAssignment_0_in_rule__Model__Group__0__Impl1381);
                    rule__Model__ProgramsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getProgramsAssignment_0()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:681:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:685:1: ( rule__Model__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:686:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11412);
            rule__Model__Group__1__Impl();

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:692:1: rule__Model__Group__1__Impl : ( ( rule__Model__SystemAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:696:1: ( ( ( rule__Model__SystemAssignment_1 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:697:1: ( ( rule__Model__SystemAssignment_1 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:697:1: ( ( rule__Model__SystemAssignment_1 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:698:1: ( rule__Model__SystemAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getSystemAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:699:1: ( rule__Model__SystemAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:699:2: rule__Model__SystemAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__SystemAssignment_1_in_rule__Model__Group__1__Impl1439);
                    rule__Model__SystemAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getSystemAssignment_1()); 

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


    // $ANTLR start "rule__System__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:713:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:717:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:718:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01474);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__01477);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:725:1: rule__System__Group__0__Impl : ( 'system ' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:729:1: ( ( 'system ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:730:1: ( 'system ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:730:1: ( 'system ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:731:1: 'system '
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__System__Group__0__Impl1505); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:744:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:748:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:749:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11536);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__11539);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:756:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:760:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:761:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:761:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:762:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:763:1: ( rule__System__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:763:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1566);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:773:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:777:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:778:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21596);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__21599);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:785:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:789:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:790:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:790:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:791:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__System__Group__2__Impl1627); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:804:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:808:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:809:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31658);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__31661);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:816:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:820:1: ( ( ( rule__System__Group_3__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:821:1: ( ( rule__System__Group_3__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:821:1: ( ( rule__System__Group_3__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:822:1: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:823:1: ( rule__System__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:823:2: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1688);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:833:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:837:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:838:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41719);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__41722);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:845:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )? ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:849:1: ( ( ( rule__System__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:850:1: ( ( rule__System__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:850:1: ( ( rule__System__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:851:1: ( rule__System__Group_4__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:852:1: ( rule__System__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:852:2: rule__System__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1749);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:862:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:866:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:867:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51780);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__6_in_rule__System__Group__51783);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:874:1: rule__System__Group__5__Impl : ( ( rule__System__Group_5__0 )* ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:878:1: ( ( ( rule__System__Group_5__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:879:1: ( ( rule__System__Group_5__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:879:1: ( ( rule__System__Group_5__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:880:1: ( rule__System__Group_5__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:881:1: ( rule__System__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:881:2: rule__System__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl1810);
            	    rule__System__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:891:1: rule__System__Group__6 : rule__System__Group__6__Impl ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:895:1: ( rule__System__Group__6__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:896:2: rule__System__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61841);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:902:1: rule__System__Group__6__Impl : ( '}' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:906:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:907:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:907:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:908:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__System__Group__6__Impl1869); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:935:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:939:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:940:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01914);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01917);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:947:1: rule__System__Group_3__0__Impl : ( 'port ->' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:951:1: ( ( 'port ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:952:1: ( 'port ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:952:1: ( 'port ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:953:1: 'port ->'
            {
             before(grammarAccess.getSystemAccess().getPortKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__System__Group_3__0__Impl1945); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:966:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:970:1: ( rule__System__Group_3__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:971:2: rule__System__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11976);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:977:1: rule__System__Group_3__1__Impl : ( ( rule__System__PortAssignment_3_1 ) ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:981:1: ( ( ( rule__System__PortAssignment_3_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:982:1: ( ( rule__System__PortAssignment_3_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:982:1: ( ( rule__System__PortAssignment_3_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:983:1: ( rule__System__PortAssignment_3_1 )
            {
             before(grammarAccess.getSystemAccess().getPortAssignment_3_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:984:1: ( rule__System__PortAssignment_3_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:984:2: rule__System__PortAssignment_3_1
            {
            pushFollow(FOLLOW_rule__System__PortAssignment_3_1_in_rule__System__Group_3__1__Impl2003);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:998:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1002:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1003:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__02037);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__02040);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1010:1: rule__System__Group_4__0__Impl : ( 'version ->' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1014:1: ( ( 'version ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1015:1: ( 'version ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1015:1: ( 'version ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1016:1: 'version ->'
            {
             before(grammarAccess.getSystemAccess().getVersionKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__System__Group_4__0__Impl2068); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1029:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1033:1: ( rule__System__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1034:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__12099);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1040:1: rule__System__Group_4__1__Impl : ( ( rule__System__VersionAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1044:1: ( ( ( rule__System__VersionAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1045:1: ( ( rule__System__VersionAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1045:1: ( ( rule__System__VersionAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1046:1: ( rule__System__VersionAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getVersionAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1047:1: ( rule__System__VersionAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1047:2: rule__System__VersionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__System__VersionAssignment_4_1_in_rule__System__Group_4__1__Impl2126);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1061:1: rule__System__Group_5__0 : rule__System__Group_5__0__Impl rule__System__Group_5__1 ;
    public final void rule__System__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1065:1: ( rule__System__Group_5__0__Impl rule__System__Group_5__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1066:2: rule__System__Group_5__0__Impl rule__System__Group_5__1
            {
            pushFollow(FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__02160);
            rule__System__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__02163);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1073:1: rule__System__Group_5__0__Impl : ( 'registerProgram -> ' ) ;
    public final void rule__System__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1077:1: ( ( 'registerProgram -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1078:1: ( 'registerProgram -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1078:1: ( 'registerProgram -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1079:1: 'registerProgram -> '
            {
             before(grammarAccess.getSystemAccess().getRegisterProgramKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__System__Group_5__0__Impl2191); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1092:1: rule__System__Group_5__1 : rule__System__Group_5__1__Impl ;
    public final void rule__System__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1096:1: ( rule__System__Group_5__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1097:2: rule__System__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__12222);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1103:1: rule__System__Group_5__1__Impl : ( ( rule__System__ProgramAssignment_5_1 ) ) ;
    public final void rule__System__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1107:1: ( ( ( rule__System__ProgramAssignment_5_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1108:1: ( ( rule__System__ProgramAssignment_5_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1108:1: ( ( rule__System__ProgramAssignment_5_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1109:1: ( rule__System__ProgramAssignment_5_1 )
            {
             before(grammarAccess.getSystemAccess().getProgramAssignment_5_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1110:1: ( rule__System__ProgramAssignment_5_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1110:2: rule__System__ProgramAssignment_5_1
            {
            pushFollow(FOLLOW_rule__System__ProgramAssignment_5_1_in_rule__System__Group_5__1__Impl2249);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1124:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1128:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1129:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02283);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02286);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1136:1: rule__Program__Group__0__Impl : ( 'program ' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1140:1: ( ( 'program ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1141:1: ( 'program ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1141:1: ( 'program ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1142:1: 'program '
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group__0__Impl2314); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1155:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1159:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1160:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12345);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12348);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1167:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1171:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1172:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1172:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1173:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1174:1: ( rule__Program__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1174:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2375);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1184:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1188:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1189:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22405);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22408);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1196:1: rule__Program__Group__2__Impl : ( '->' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1200:1: ( ( '->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1201:1: ( '->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1201:1: ( '->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1202:1: '->'
            {
             before(grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group__2__Impl2436); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1215:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1219:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1220:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32467);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__32470);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1227:1: rule__Program__Group__3__Impl : ( ( rule__Program__PathAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1231:1: ( ( ( rule__Program__PathAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1232:1: ( ( rule__Program__PathAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1232:1: ( ( rule__Program__PathAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1233:1: ( rule__Program__PathAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPathAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1234:1: ( rule__Program__PathAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1234:2: rule__Program__PathAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl2497);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1244:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1248:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1249:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42527);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42530);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1256:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1260:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1261:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1261:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1262:1: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__4__Impl2558); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1275:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1279:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1280:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52589);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52592);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1287:1: rule__Program__Group__5__Impl : ( ( rule__Program__FunctionsAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1291:1: ( ( ( rule__Program__FunctionsAssignment_5 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1292:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1292:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1293:1: ( rule__Program__FunctionsAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1294:1: ( rule__Program__FunctionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1294:2: rule__Program__FunctionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl2619);
            	    rule__Program__FunctionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1304:1: rule__Program__Group__6 : rule__Program__Group__6__Impl ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1308:1: ( rule__Program__Group__6__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1309:2: rule__Program__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62650);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1315:1: rule__Program__Group__6__Impl : ( '}' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1319:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1320:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1320:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1321:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__6__Impl2678); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1348:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1352:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1353:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02723);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02726);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1360:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1364:1: ( ( 'def' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1365:1: ( 'def' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1365:1: ( 'def' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1366:1: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Function__Group__0__Impl2754); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1379:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1383:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1384:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12785);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12788);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1391:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1395:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1396:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1396:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1397:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1398:1: ( rule__Function__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1398:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2815);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1408:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1412:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1413:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22845);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22848);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1420:1: rule__Function__Group__2__Impl : ( ( rule__Function__Group_2__0 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1424:1: ( ( ( rule__Function__Group_2__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1425:1: ( ( rule__Function__Group_2__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1425:1: ( ( rule__Function__Group_2__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1426:1: ( rule__Function__Group_2__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_2()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1427:1: ( rule__Function__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1427:2: rule__Function__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl2875);
                    rule__Function__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_2()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1437:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1441:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1442:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32906);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32909);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1449:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1453:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1454:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1454:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1455:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Function__Group__3__Impl2937); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1468:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1472:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1473:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42968);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42971);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1480:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1484:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1485:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1485:1: ( ( rule__Function__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1486:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1487:1: ( rule__Function__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1487:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl2998);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1497:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1501:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1502:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__53029);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__53032);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1509:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )? ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1513:1: ( ( ( rule__Function__Group_5__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1514:1: ( ( rule__Function__Group_5__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1514:1: ( ( rule__Function__Group_5__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1515:1: ( rule__Function__Group_5__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1516:1: ( rule__Function__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1516:2: rule__Function__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl3059);
                    rule__Function__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1526:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1530:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1531:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63090);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63093);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1538:1: rule__Function__Group__6__Impl : ( ( rule__Function__Group_6__0 )* ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1542:1: ( ( ( rule__Function__Group_6__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1543:1: ( ( rule__Function__Group_6__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1543:1: ( ( rule__Function__Group_6__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1544:1: ( rule__Function__Group_6__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1545:1: ( rule__Function__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1545:2: rule__Function__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3120);
            	    rule__Function__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_6()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1555:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1559:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1560:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73151);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73154);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1567:1: rule__Function__Group__7__Impl : ( ( rule__Function__Group_7__0 )* ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1571:1: ( ( ( rule__Function__Group_7__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1572:1: ( ( rule__Function__Group_7__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1572:1: ( ( rule__Function__Group_7__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1573:1: ( rule__Function__Group_7__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_7()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1574:1: ( rule__Function__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1574:2: rule__Function__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3181);
            	    rule__Function__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1584:1: rule__Function__Group__8 : rule__Function__Group__8__Impl rule__Function__Group__9 ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1588:1: ( rule__Function__Group__8__Impl rule__Function__Group__9 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1589:2: rule__Function__Group__8__Impl rule__Function__Group__9
            {
            pushFollow(FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83212);
            rule__Function__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__9_in_rule__Function__Group__83215);
            rule__Function__Group__9();

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1596:1: rule__Function__Group__8__Impl : ( ( rule__Function__Group_8__0 )* ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1600:1: ( ( ( rule__Function__Group_8__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1601:1: ( ( rule__Function__Group_8__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1601:1: ( ( rule__Function__Group_8__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1602:1: ( rule__Function__Group_8__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_8()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1603:1: ( rule__Function__Group_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1603:2: rule__Function__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_8__0_in_rule__Function__Group__8__Impl3242);
            	    rule__Function__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_8()); 

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


    // $ANTLR start "rule__Function__Group__9"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1613:1: rule__Function__Group__9 : rule__Function__Group__9__Impl ;
    public final void rule__Function__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1617:1: ( rule__Function__Group__9__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1618:2: rule__Function__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__9__Impl_in_rule__Function__Group__93273);
            rule__Function__Group__9__Impl();

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
    // $ANTLR end "rule__Function__Group__9"


    // $ANTLR start "rule__Function__Group__9__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1624:1: rule__Function__Group__9__Impl : ( '}' ) ;
    public final void rule__Function__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1628:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1629:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1629:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1630:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_19_in_rule__Function__Group__9__Impl3301); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Function__Group__9__Impl"


    // $ANTLR start "rule__Function__Group_2__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1663:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1667:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1668:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__03352);
            rule__Function__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__03355);
            rule__Function__Group_2__1();

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
    // $ANTLR end "rule__Function__Group_2__0"


    // $ANTLR start "rule__Function__Group_2__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1675:1: rule__Function__Group_2__0__Impl : ( 'with ' ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1679:1: ( ( 'with ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1680:1: ( 'with ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1680:1: ( 'with ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1681:1: 'with '
            {
             before(grammarAccess.getFunctionAccess().getWithKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Function__Group_2__0__Impl3383); 
             after(grammarAccess.getFunctionAccess().getWithKeyword_2_0()); 

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
    // $ANTLR end "rule__Function__Group_2__0__Impl"


    // $ANTLR start "rule__Function__Group_2__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1694:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1698:1: ( rule__Function__Group_2__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1699:2: rule__Function__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__13414);
            rule__Function__Group_2__1__Impl();

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
    // $ANTLR end "rule__Function__Group_2__1"


    // $ANTLR start "rule__Function__Group_2__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1705:1: rule__Function__Group_2__1__Impl : ( ( rule__Function__PrintOutModeAssignment_2_1 ) ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1709:1: ( ( ( rule__Function__PrintOutModeAssignment_2_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1710:1: ( ( rule__Function__PrintOutModeAssignment_2_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1710:1: ( ( rule__Function__PrintOutModeAssignment_2_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1711:1: ( rule__Function__PrintOutModeAssignment_2_1 )
            {
             before(grammarAccess.getFunctionAccess().getPrintOutModeAssignment_2_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1712:1: ( rule__Function__PrintOutModeAssignment_2_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1712:2: rule__Function__PrintOutModeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Function__PrintOutModeAssignment_2_1_in_rule__Function__Group_2__1__Impl3441);
            rule__Function__PrintOutModeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getPrintOutModeAssignment_2_1()); 

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
    // $ANTLR end "rule__Function__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1726:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1730:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1731:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__03475);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__03478);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1738:1: rule__Function__Group_4__0__Impl : ( 'desc ->' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1742:1: ( ( 'desc ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1743:1: ( 'desc ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1743:1: ( 'desc ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1744:1: 'desc ->'
            {
             before(grammarAccess.getFunctionAccess().getDescKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Function__Group_4__0__Impl3506); 
             after(grammarAccess.getFunctionAccess().getDescKeyword_4_0()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1757:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1761:1: ( rule__Function__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1762:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__13537);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1768:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__DescAssignment_4_1 ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1772:1: ( ( ( rule__Function__DescAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1773:1: ( ( rule__Function__DescAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1773:1: ( ( rule__Function__DescAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1774:1: ( rule__Function__DescAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getDescAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1775:1: ( rule__Function__DescAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1775:2: rule__Function__DescAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Function__DescAssignment_4_1_in_rule__Function__Group_4__1__Impl3564);
            rule__Function__DescAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDescAssignment_4_1()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1789:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1793:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1794:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__03598);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__03601);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1801:1: rule__Function__Group_5__0__Impl : ( 'docurl ->' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1805:1: ( ( 'docurl ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1806:1: ( 'docurl ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1806:1: ( 'docurl ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1807:1: 'docurl ->'
            {
             before(grammarAccess.getFunctionAccess().getDocurlKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__Function__Group_5__0__Impl3629); 
             after(grammarAccess.getFunctionAccess().getDocurlKeyword_5_0()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1820:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1824:1: ( rule__Function__Group_5__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1825:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__13660);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1831:1: rule__Function__Group_5__1__Impl : ( ( rule__Function__DocurlAssignment_5_1 ) ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1835:1: ( ( ( rule__Function__DocurlAssignment_5_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1836:1: ( ( rule__Function__DocurlAssignment_5_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1836:1: ( ( rule__Function__DocurlAssignment_5_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1837:1: ( rule__Function__DocurlAssignment_5_1 )
            {
             before(grammarAccess.getFunctionAccess().getDocurlAssignment_5_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1838:1: ( rule__Function__DocurlAssignment_5_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1838:2: rule__Function__DocurlAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Function__DocurlAssignment_5_1_in_rule__Function__Group_5__1__Impl3687);
            rule__Function__DocurlAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDocurlAssignment_5_1()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1852:1: rule__Function__Group_6__0 : rule__Function__Group_6__0__Impl rule__Function__Group_6__1 ;
    public final void rule__Function__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1856:1: ( rule__Function__Group_6__0__Impl rule__Function__Group_6__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1857:2: rule__Function__Group_6__0__Impl rule__Function__Group_6__1
            {
            pushFollow(FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__03721);
            rule__Function__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__03724);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1864:1: rule__Function__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__Function__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1868:1: ( ( 'input' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1869:1: ( 'input' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1869:1: ( 'input' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1870:1: 'input'
            {
             before(grammarAccess.getFunctionAccess().getInputKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__Function__Group_6__0__Impl3752); 
             after(grammarAccess.getFunctionAccess().getInputKeyword_6_0()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1883:1: rule__Function__Group_6__1 : rule__Function__Group_6__1__Impl ;
    public final void rule__Function__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1887:1: ( rule__Function__Group_6__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1888:2: rule__Function__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__13783);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1894:1: rule__Function__Group_6__1__Impl : ( ( rule__Function__InputAssignment_6_1 ) ) ;
    public final void rule__Function__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1898:1: ( ( ( rule__Function__InputAssignment_6_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1899:1: ( ( rule__Function__InputAssignment_6_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1899:1: ( ( rule__Function__InputAssignment_6_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1900:1: ( rule__Function__InputAssignment_6_1 )
            {
             before(grammarAccess.getFunctionAccess().getInputAssignment_6_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1901:1: ( rule__Function__InputAssignment_6_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1901:2: rule__Function__InputAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Function__InputAssignment_6_1_in_rule__Function__Group_6__1__Impl3810);
            rule__Function__InputAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getInputAssignment_6_1()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1915:1: rule__Function__Group_7__0 : rule__Function__Group_7__0__Impl rule__Function__Group_7__1 ;
    public final void rule__Function__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1919:1: ( rule__Function__Group_7__0__Impl rule__Function__Group_7__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1920:2: rule__Function__Group_7__0__Impl rule__Function__Group_7__1
            {
            pushFollow(FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__03844);
            rule__Function__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__03847);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1927:1: rule__Function__Group_7__0__Impl : ( 'output ' ) ;
    public final void rule__Function__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1931:1: ( ( 'output ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1932:1: ( 'output ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1932:1: ( 'output ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1933:1: 'output '
            {
             before(grammarAccess.getFunctionAccess().getOutputKeyword_7_0()); 
            match(input,30,FOLLOW_30_in_rule__Function__Group_7__0__Impl3875); 
             after(grammarAccess.getFunctionAccess().getOutputKeyword_7_0()); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1946:1: rule__Function__Group_7__1 : rule__Function__Group_7__1__Impl ;
    public final void rule__Function__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1950:1: ( rule__Function__Group_7__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1951:2: rule__Function__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__13906);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1957:1: rule__Function__Group_7__1__Impl : ( ( rule__Function__OutputAssignment_7_1 ) ) ;
    public final void rule__Function__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1961:1: ( ( ( rule__Function__OutputAssignment_7_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1962:1: ( ( rule__Function__OutputAssignment_7_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1962:1: ( ( rule__Function__OutputAssignment_7_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1963:1: ( rule__Function__OutputAssignment_7_1 )
            {
             before(grammarAccess.getFunctionAccess().getOutputAssignment_7_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1964:1: ( rule__Function__OutputAssignment_7_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1964:2: rule__Function__OutputAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Function__OutputAssignment_7_1_in_rule__Function__Group_7__1__Impl3933);
            rule__Function__OutputAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOutputAssignment_7_1()); 

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


    // $ANTLR start "rule__Function__Group_8__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1978:1: rule__Function__Group_8__0 : rule__Function__Group_8__0__Impl rule__Function__Group_8__1 ;
    public final void rule__Function__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1982:1: ( rule__Function__Group_8__0__Impl rule__Function__Group_8__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1983:2: rule__Function__Group_8__0__Impl rule__Function__Group_8__1
            {
            pushFollow(FOLLOW_rule__Function__Group_8__0__Impl_in_rule__Function__Group_8__03967);
            rule__Function__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_8__1_in_rule__Function__Group_8__03970);
            rule__Function__Group_8__1();

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
    // $ANTLR end "rule__Function__Group_8__0"


    // $ANTLR start "rule__Function__Group_8__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1990:1: rule__Function__Group_8__0__Impl : ( '* ' ) ;
    public final void rule__Function__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1994:1: ( ( '* ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1995:1: ( '* ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1995:1: ( '* ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1996:1: '* '
            {
             before(grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_8_0()); 
            match(input,31,FOLLOW_31_in_rule__Function__Group_8__0__Impl3998); 
             after(grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_8_0()); 

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
    // $ANTLR end "rule__Function__Group_8__0__Impl"


    // $ANTLR start "rule__Function__Group_8__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2009:1: rule__Function__Group_8__1 : rule__Function__Group_8__1__Impl ;
    public final void rule__Function__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2013:1: ( rule__Function__Group_8__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2014:2: rule__Function__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_8__1__Impl_in_rule__Function__Group_8__14029);
            rule__Function__Group_8__1__Impl();

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
    // $ANTLR end "rule__Function__Group_8__1"


    // $ANTLR start "rule__Function__Group_8__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2020:1: rule__Function__Group_8__1__Impl : ( ( rule__Function__OptionBlocksAssignment_8_1 ) ) ;
    public final void rule__Function__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2024:1: ( ( ( rule__Function__OptionBlocksAssignment_8_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2025:1: ( ( rule__Function__OptionBlocksAssignment_8_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2025:1: ( ( rule__Function__OptionBlocksAssignment_8_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2026:1: ( rule__Function__OptionBlocksAssignment_8_1 )
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksAssignment_8_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2027:1: ( rule__Function__OptionBlocksAssignment_8_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2027:2: rule__Function__OptionBlocksAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Function__OptionBlocksAssignment_8_1_in_rule__Function__Group_8__1__Impl4056);
            rule__Function__OptionBlocksAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOptionBlocksAssignment_8_1()); 

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
    // $ANTLR end "rule__Function__Group_8__1__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2041:1: rule__InputDataDefinition__Group__0 : rule__InputDataDefinition__Group__0__Impl rule__InputDataDefinition__Group__1 ;
    public final void rule__InputDataDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2045:1: ( rule__InputDataDefinition__Group__0__Impl rule__InputDataDefinition__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2046:2: rule__InputDataDefinition__Group__0__Impl rule__InputDataDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__0__Impl_in_rule__InputDataDefinition__Group__04090);
            rule__InputDataDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDataDefinition__Group__1_in_rule__InputDataDefinition__Group__04093);
            rule__InputDataDefinition__Group__1();

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
    // $ANTLR end "rule__InputDataDefinition__Group__0"


    // $ANTLR start "rule__InputDataDefinition__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2053:1: rule__InputDataDefinition__Group__0__Impl : ( () ) ;
    public final void rule__InputDataDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2057:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2058:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2058:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2059:1: ()
            {
             before(grammarAccess.getInputDataDefinitionAccess().getInputDataDefinitionAction_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2060:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2062:1: 
            {
            }

             after(grammarAccess.getInputDataDefinitionAccess().getInputDataDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDataDefinition__Group__0__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2072:1: rule__InputDataDefinition__Group__1 : rule__InputDataDefinition__Group__1__Impl rule__InputDataDefinition__Group__2 ;
    public final void rule__InputDataDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2076:1: ( rule__InputDataDefinition__Group__1__Impl rule__InputDataDefinition__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2077:2: rule__InputDataDefinition__Group__1__Impl rule__InputDataDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__1__Impl_in_rule__InputDataDefinition__Group__14151);
            rule__InputDataDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDataDefinition__Group__2_in_rule__InputDataDefinition__Group__14154);
            rule__InputDataDefinition__Group__2();

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
    // $ANTLR end "rule__InputDataDefinition__Group__1"


    // $ANTLR start "rule__InputDataDefinition__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2084:1: rule__InputDataDefinition__Group__1__Impl : ( ( rule__InputDataDefinition__InputAssignment_1 ) ) ;
    public final void rule__InputDataDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2088:1: ( ( ( rule__InputDataDefinition__InputAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2089:1: ( ( rule__InputDataDefinition__InputAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2089:1: ( ( rule__InputDataDefinition__InputAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2090:1: ( rule__InputDataDefinition__InputAssignment_1 )
            {
             before(grammarAccess.getInputDataDefinitionAccess().getInputAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2091:1: ( rule__InputDataDefinition__InputAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2091:2: rule__InputDataDefinition__InputAssignment_1
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__InputAssignment_1_in_rule__InputDataDefinition__Group__1__Impl4181);
            rule__InputDataDefinition__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputDataDefinitionAccess().getInputAssignment_1()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group__1__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2101:1: rule__InputDataDefinition__Group__2 : rule__InputDataDefinition__Group__2__Impl rule__InputDataDefinition__Group__3 ;
    public final void rule__InputDataDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2105:1: ( rule__InputDataDefinition__Group__2__Impl rule__InputDataDefinition__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2106:2: rule__InputDataDefinition__Group__2__Impl rule__InputDataDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__2__Impl_in_rule__InputDataDefinition__Group__24211);
            rule__InputDataDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDataDefinition__Group__3_in_rule__InputDataDefinition__Group__24214);
            rule__InputDataDefinition__Group__3();

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
    // $ANTLR end "rule__InputDataDefinition__Group__2"


    // $ANTLR start "rule__InputDataDefinition__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2113:1: rule__InputDataDefinition__Group__2__Impl : ( 'as' ) ;
    public final void rule__InputDataDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2117:1: ( ( 'as' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2118:1: ( 'as' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2118:1: ( 'as' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2119:1: 'as'
            {
             before(grammarAccess.getInputDataDefinitionAccess().getAsKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__InputDataDefinition__Group__2__Impl4242); 
             after(grammarAccess.getInputDataDefinitionAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group__2__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2132:1: rule__InputDataDefinition__Group__3 : rule__InputDataDefinition__Group__3__Impl rule__InputDataDefinition__Group__4 ;
    public final void rule__InputDataDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2136:1: ( rule__InputDataDefinition__Group__3__Impl rule__InputDataDefinition__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2137:2: rule__InputDataDefinition__Group__3__Impl rule__InputDataDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__3__Impl_in_rule__InputDataDefinition__Group__34273);
            rule__InputDataDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDataDefinition__Group__4_in_rule__InputDataDefinition__Group__34276);
            rule__InputDataDefinition__Group__4();

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
    // $ANTLR end "rule__InputDataDefinition__Group__3"


    // $ANTLR start "rule__InputDataDefinition__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2144:1: rule__InputDataDefinition__Group__3__Impl : ( ( rule__InputDataDefinition__TypeAssignment_3 ) ) ;
    public final void rule__InputDataDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2148:1: ( ( ( rule__InputDataDefinition__TypeAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2149:1: ( ( rule__InputDataDefinition__TypeAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2149:1: ( ( rule__InputDataDefinition__TypeAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2150:1: ( rule__InputDataDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getInputDataDefinitionAccess().getTypeAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2151:1: ( rule__InputDataDefinition__TypeAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2151:2: rule__InputDataDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__TypeAssignment_3_in_rule__InputDataDefinition__Group__3__Impl4303);
            rule__InputDataDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputDataDefinitionAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group__3__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2161:1: rule__InputDataDefinition__Group__4 : rule__InputDataDefinition__Group__4__Impl ;
    public final void rule__InputDataDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2165:1: ( rule__InputDataDefinition__Group__4__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2166:2: rule__InputDataDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group__4__Impl_in_rule__InputDataDefinition__Group__44333);
            rule__InputDataDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__InputDataDefinition__Group__4"


    // $ANTLR start "rule__InputDataDefinition__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2172:1: rule__InputDataDefinition__Group__4__Impl : ( ( rule__InputDataDefinition__Group_4__0 )? ) ;
    public final void rule__InputDataDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2176:1: ( ( ( rule__InputDataDefinition__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2177:1: ( ( rule__InputDataDefinition__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2177:1: ( ( rule__InputDataDefinition__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2178:1: ( rule__InputDataDefinition__Group_4__0 )?
            {
             before(grammarAccess.getInputDataDefinitionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2179:1: ( rule__InputDataDefinition__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2179:2: rule__InputDataDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__InputDataDefinition__Group_4__0_in_rule__InputDataDefinition__Group__4__Impl4360);
                    rule__InputDataDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputDataDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group__4__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2199:1: rule__InputDataDefinition__Group_4__0 : rule__InputDataDefinition__Group_4__0__Impl rule__InputDataDefinition__Group_4__1 ;
    public final void rule__InputDataDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2203:1: ( rule__InputDataDefinition__Group_4__0__Impl rule__InputDataDefinition__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2204:2: rule__InputDataDefinition__Group_4__0__Impl rule__InputDataDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group_4__0__Impl_in_rule__InputDataDefinition__Group_4__04401);
            rule__InputDataDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDataDefinition__Group_4__1_in_rule__InputDataDefinition__Group_4__04404);
            rule__InputDataDefinition__Group_4__1();

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
    // $ANTLR end "rule__InputDataDefinition__Group_4__0"


    // $ANTLR start "rule__InputDataDefinition__Group_4__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2211:1: rule__InputDataDefinition__Group_4__0__Impl : ( 'doc -> ' ) ;
    public final void rule__InputDataDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2215:1: ( ( 'doc -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2216:1: ( 'doc -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2216:1: ( 'doc -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2217:1: 'doc -> '
            {
             before(grammarAccess.getInputDataDefinitionAccess().getDocKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__InputDataDefinition__Group_4__0__Impl4432); 
             after(grammarAccess.getInputDataDefinitionAccess().getDocKeyword_4_0()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__InputDataDefinition__Group_4__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2230:1: rule__InputDataDefinition__Group_4__1 : rule__InputDataDefinition__Group_4__1__Impl ;
    public final void rule__InputDataDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2234:1: ( rule__InputDataDefinition__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2235:2: rule__InputDataDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__Group_4__1__Impl_in_rule__InputDataDefinition__Group_4__14463);
            rule__InputDataDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__InputDataDefinition__Group_4__1"


    // $ANTLR start "rule__InputDataDefinition__Group_4__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2241:1: rule__InputDataDefinition__Group_4__1__Impl : ( ( rule__InputDataDefinition__DocAssignment_4_1 ) ) ;
    public final void rule__InputDataDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2245:1: ( ( ( rule__InputDataDefinition__DocAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2246:1: ( ( rule__InputDataDefinition__DocAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2246:1: ( ( rule__InputDataDefinition__DocAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2247:1: ( rule__InputDataDefinition__DocAssignment_4_1 )
            {
             before(grammarAccess.getInputDataDefinitionAccess().getDocAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2248:1: ( rule__InputDataDefinition__DocAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2248:2: rule__InputDataDefinition__DocAssignment_4_1
            {
            pushFollow(FOLLOW_rule__InputDataDefinition__DocAssignment_4_1_in_rule__InputDataDefinition__Group_4__1__Impl4490);
            rule__InputDataDefinition__DocAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputDataDefinitionAccess().getDocAssignment_4_1()); 

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
    // $ANTLR end "rule__InputDataDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2262:1: rule__OutputDataDefinition__Group__0 : rule__OutputDataDefinition__Group__0__Impl rule__OutputDataDefinition__Group__1 ;
    public final void rule__OutputDataDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2266:1: ( rule__OutputDataDefinition__Group__0__Impl rule__OutputDataDefinition__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2267:2: rule__OutputDataDefinition__Group__0__Impl rule__OutputDataDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__0__Impl_in_rule__OutputDataDefinition__Group__04524);
            rule__OutputDataDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__1_in_rule__OutputDataDefinition__Group__04527);
            rule__OutputDataDefinition__Group__1();

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
    // $ANTLR end "rule__OutputDataDefinition__Group__0"


    // $ANTLR start "rule__OutputDataDefinition__Group__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2274:1: rule__OutputDataDefinition__Group__0__Impl : ( () ) ;
    public final void rule__OutputDataDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2278:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2279:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2279:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2280:1: ()
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getOutputDataDefinitionAction_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2281:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2283:1: 
            {
            }

             after(grammarAccess.getOutputDataDefinitionAccess().getOutputDataDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDataDefinition__Group__0__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2293:1: rule__OutputDataDefinition__Group__1 : rule__OutputDataDefinition__Group__1__Impl rule__OutputDataDefinition__Group__2 ;
    public final void rule__OutputDataDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2297:1: ( rule__OutputDataDefinition__Group__1__Impl rule__OutputDataDefinition__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2298:2: rule__OutputDataDefinition__Group__1__Impl rule__OutputDataDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__1__Impl_in_rule__OutputDataDefinition__Group__14585);
            rule__OutputDataDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__2_in_rule__OutputDataDefinition__Group__14588);
            rule__OutputDataDefinition__Group__2();

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
    // $ANTLR end "rule__OutputDataDefinition__Group__1"


    // $ANTLR start "rule__OutputDataDefinition__Group__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2305:1: rule__OutputDataDefinition__Group__1__Impl : ( ( rule__OutputDataDefinition__InputAssignment_1 ) ) ;
    public final void rule__OutputDataDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2309:1: ( ( ( rule__OutputDataDefinition__InputAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2310:1: ( ( rule__OutputDataDefinition__InputAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2310:1: ( ( rule__OutputDataDefinition__InputAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2311:1: ( rule__OutputDataDefinition__InputAssignment_1 )
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getInputAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2312:1: ( rule__OutputDataDefinition__InputAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2312:2: rule__OutputDataDefinition__InputAssignment_1
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__InputAssignment_1_in_rule__OutputDataDefinition__Group__1__Impl4615);
            rule__OutputDataDefinition__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataDefinitionAccess().getInputAssignment_1()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group__1__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group__2"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2322:1: rule__OutputDataDefinition__Group__2 : rule__OutputDataDefinition__Group__2__Impl rule__OutputDataDefinition__Group__3 ;
    public final void rule__OutputDataDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2326:1: ( rule__OutputDataDefinition__Group__2__Impl rule__OutputDataDefinition__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2327:2: rule__OutputDataDefinition__Group__2__Impl rule__OutputDataDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__2__Impl_in_rule__OutputDataDefinition__Group__24645);
            rule__OutputDataDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__3_in_rule__OutputDataDefinition__Group__24648);
            rule__OutputDataDefinition__Group__3();

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
    // $ANTLR end "rule__OutputDataDefinition__Group__2"


    // $ANTLR start "rule__OutputDataDefinition__Group__2__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2334:1: rule__OutputDataDefinition__Group__2__Impl : ( 'as' ) ;
    public final void rule__OutputDataDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2338:1: ( ( 'as' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2339:1: ( 'as' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2339:1: ( 'as' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2340:1: 'as'
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getAsKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__OutputDataDefinition__Group__2__Impl4676); 
             after(grammarAccess.getOutputDataDefinitionAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group__2__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group__3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2353:1: rule__OutputDataDefinition__Group__3 : rule__OutputDataDefinition__Group__3__Impl rule__OutputDataDefinition__Group__4 ;
    public final void rule__OutputDataDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2357:1: ( rule__OutputDataDefinition__Group__3__Impl rule__OutputDataDefinition__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2358:2: rule__OutputDataDefinition__Group__3__Impl rule__OutputDataDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__3__Impl_in_rule__OutputDataDefinition__Group__34707);
            rule__OutputDataDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__4_in_rule__OutputDataDefinition__Group__34710);
            rule__OutputDataDefinition__Group__4();

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
    // $ANTLR end "rule__OutputDataDefinition__Group__3"


    // $ANTLR start "rule__OutputDataDefinition__Group__3__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2365:1: rule__OutputDataDefinition__Group__3__Impl : ( ( rule__OutputDataDefinition__TypeAssignment_3 ) ) ;
    public final void rule__OutputDataDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2369:1: ( ( ( rule__OutputDataDefinition__TypeAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2370:1: ( ( rule__OutputDataDefinition__TypeAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2370:1: ( ( rule__OutputDataDefinition__TypeAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2371:1: ( rule__OutputDataDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getTypeAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2372:1: ( rule__OutputDataDefinition__TypeAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2372:2: rule__OutputDataDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__TypeAssignment_3_in_rule__OutputDataDefinition__Group__3__Impl4737);
            rule__OutputDataDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataDefinitionAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group__3__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group__4"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2382:1: rule__OutputDataDefinition__Group__4 : rule__OutputDataDefinition__Group__4__Impl ;
    public final void rule__OutputDataDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2386:1: ( rule__OutputDataDefinition__Group__4__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2387:2: rule__OutputDataDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group__4__Impl_in_rule__OutputDataDefinition__Group__44767);
            rule__OutputDataDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__OutputDataDefinition__Group__4"


    // $ANTLR start "rule__OutputDataDefinition__Group__4__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2393:1: rule__OutputDataDefinition__Group__4__Impl : ( ( rule__OutputDataDefinition__Group_4__0 )? ) ;
    public final void rule__OutputDataDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2397:1: ( ( ( rule__OutputDataDefinition__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2398:1: ( ( rule__OutputDataDefinition__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2398:1: ( ( rule__OutputDataDefinition__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2399:1: ( rule__OutputDataDefinition__Group_4__0 )?
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2400:1: ( rule__OutputDataDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2400:2: rule__OutputDataDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__OutputDataDefinition__Group_4__0_in_rule__OutputDataDefinition__Group__4__Impl4794);
                    rule__OutputDataDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputDataDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group__4__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group_4__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2420:1: rule__OutputDataDefinition__Group_4__0 : rule__OutputDataDefinition__Group_4__0__Impl rule__OutputDataDefinition__Group_4__1 ;
    public final void rule__OutputDataDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2424:1: ( rule__OutputDataDefinition__Group_4__0__Impl rule__OutputDataDefinition__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2425:2: rule__OutputDataDefinition__Group_4__0__Impl rule__OutputDataDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group_4__0__Impl_in_rule__OutputDataDefinition__Group_4__04835);
            rule__OutputDataDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDataDefinition__Group_4__1_in_rule__OutputDataDefinition__Group_4__04838);
            rule__OutputDataDefinition__Group_4__1();

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
    // $ANTLR end "rule__OutputDataDefinition__Group_4__0"


    // $ANTLR start "rule__OutputDataDefinition__Group_4__0__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2432:1: rule__OutputDataDefinition__Group_4__0__Impl : ( 'doc -> ' ) ;
    public final void rule__OutputDataDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2436:1: ( ( 'doc -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2437:1: ( 'doc -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2437:1: ( 'doc -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2438:1: 'doc -> '
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getDocKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__OutputDataDefinition__Group_4__0__Impl4866); 
             after(grammarAccess.getOutputDataDefinitionAccess().getDocKeyword_4_0()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__OutputDataDefinition__Group_4__1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2451:1: rule__OutputDataDefinition__Group_4__1 : rule__OutputDataDefinition__Group_4__1__Impl ;
    public final void rule__OutputDataDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2455:1: ( rule__OutputDataDefinition__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2456:2: rule__OutputDataDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__Group_4__1__Impl_in_rule__OutputDataDefinition__Group_4__14897);
            rule__OutputDataDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__OutputDataDefinition__Group_4__1"


    // $ANTLR start "rule__OutputDataDefinition__Group_4__1__Impl"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2462:1: rule__OutputDataDefinition__Group_4__1__Impl : ( ( rule__OutputDataDefinition__DocAssignment_4_1 ) ) ;
    public final void rule__OutputDataDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2466:1: ( ( ( rule__OutputDataDefinition__DocAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2467:1: ( ( rule__OutputDataDefinition__DocAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2467:1: ( ( rule__OutputDataDefinition__DocAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2468:1: ( rule__OutputDataDefinition__DocAssignment_4_1 )
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getDocAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2469:1: ( rule__OutputDataDefinition__DocAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2469:2: rule__OutputDataDefinition__DocAssignment_4_1
            {
            pushFollow(FOLLOW_rule__OutputDataDefinition__DocAssignment_4_1_in_rule__OutputDataDefinition__Group_4__1__Impl4924);
            rule__OutputDataDefinition__DocAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataDefinitionAccess().getDocAssignment_4_1()); 

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
    // $ANTLR end "rule__OutputDataDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ConcatExpression__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2483:1: rule__ConcatExpression__Group__0 : rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 ;
    public final void rule__ConcatExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2487:1: ( rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2488:2: rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__04958);
            rule__ConcatExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__04961);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2495:1: rule__ConcatExpression__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ConcatExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2499:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2500:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2500:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2501:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl4988);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2512:1: rule__ConcatExpression__Group__1 : rule__ConcatExpression__Group__1__Impl ;
    public final void rule__ConcatExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2516:1: ( rule__ConcatExpression__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2517:2: rule__ConcatExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__15017);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2523:1: rule__ConcatExpression__Group__1__Impl : ( ( rule__ConcatExpression__Group_1__0 )* ) ;
    public final void rule__ConcatExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2527:1: ( ( ( rule__ConcatExpression__Group_1__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2528:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2528:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2529:1: ( rule__ConcatExpression__Group_1__0 )*
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2530:1: ( rule__ConcatExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2530:2: rule__ConcatExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl5044);
            	    rule__ConcatExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2544:1: rule__ConcatExpression__Group_1__0 : rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 ;
    public final void rule__ConcatExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2548:1: ( rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2549:2: rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__05079);
            rule__ConcatExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__05082);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2556:1: rule__ConcatExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2560:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2561:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2561:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2562:1: ()
            {
             before(grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2563:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2565:1: 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2575:1: rule__ConcatExpression__Group_1__1 : rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 ;
    public final void rule__ConcatExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2579:1: ( rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2580:2: rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__15140);
            rule__ConcatExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__15143);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2587:1: rule__ConcatExpression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ConcatExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2591:1: ( ( '+' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2592:1: ( '+' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2592:1: ( '+' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2593:1: '+'
            {
             before(grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__ConcatExpression__Group_1__1__Impl5171); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2606:1: rule__ConcatExpression__Group_1__2 : rule__ConcatExpression__Group_1__2__Impl ;
    public final void rule__ConcatExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2610:1: ( rule__ConcatExpression__Group_1__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2611:2: rule__ConcatExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__25202);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2617:1: rule__ConcatExpression__Group_1__2__Impl : ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2621:1: ( ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2622:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2622:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2623:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatExpressionAccess().getRightAssignment_1_2()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2624:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2624:2: rule__ConcatExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl5229);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2640:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2644:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2645:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__05265);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__05268);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2652:1: rule__DoubleLiteral__Group__0__Impl : ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2656:1: ( ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2657:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2657:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2658:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2659:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2659:2: rule__DoubleLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl5295);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2669:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2673:1: ( rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2674:2: rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__15325);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__15328);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2681:1: rule__DoubleLiteral__Group__1__Impl : ( '.' ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2685:1: ( ( '.' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2686:1: ( '.' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2686:1: ( '.' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2687:1: '.'
            {
             before(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__DoubleLiteral__Group__1__Impl5356); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2700:1: rule__DoubleLiteral__Group__2 : rule__DoubleLiteral__Group__2__Impl ;
    public final void rule__DoubleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2704:1: ( rule__DoubleLiteral__Group__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2705:2: rule__DoubleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__25387);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2711:1: rule__DoubleLiteral__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2715:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2716:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2716:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2717:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl5414); 
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2734:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2738:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2739:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05449);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05452);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2746:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2750:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2751:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2751:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2752:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl5479);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2763:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2767:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2768:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15508);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2774:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2778:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2779:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2779:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2780:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2781:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2781:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5535);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2795:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2799:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2800:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05570);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05573);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2807:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2811:1: ( ( '.' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2812:1: ( '.' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2812:1: ( '.' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2813:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl5601); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2826:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2830:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2831:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15632);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2837:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2841:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2842:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2842:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2843:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl5659);
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


    // $ANTLR start "rule__Model__ProgramsAssignment_0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2859:1: rule__Model__ProgramsAssignment_0 : ( ruleProgram ) ;
    public final void rule__Model__ProgramsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2863:1: ( ( ruleProgram ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2864:1: ( ruleProgram )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2864:1: ( ruleProgram )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2865:1: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_05697);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ProgramsAssignment_0"


    // $ANTLR start "rule__Model__SystemAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2874:1: rule__Model__SystemAssignment_1 : ( ruleSystem ) ;
    public final void rule__Model__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2878:1: ( ( ruleSystem ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2879:1: ( ruleSystem )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2879:1: ( ruleSystem )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2880:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemAssignment_15728);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemSystemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__SystemAssignment_1"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2889:1: rule__System__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2893:1: ( ( ruleQualifiedName ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2894:1: ( ruleQualifiedName )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2894:1: ( ruleQualifiedName )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2895:1: ruleQualifiedName
            {
             before(grammarAccess.getSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__System__NameAssignment_15759);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2904:1: rule__System__PortAssignment_3_1 : ( ruleIntegerLiteral ) ;
    public final void rule__System__PortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2908:1: ( ( ruleIntegerLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2909:1: ( ruleIntegerLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2909:1: ( ruleIntegerLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2910:1: ruleIntegerLiteral
            {
             before(grammarAccess.getSystemAccess().getPortIntegerLiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__System__PortAssignment_3_15790);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2919:1: rule__System__VersionAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__System__VersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2923:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2924:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2924:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2925:1: ruleStringLiteral
            {
             before(grammarAccess.getSystemAccess().getVersionStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__System__VersionAssignment_4_15821);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2934:1: rule__System__ProgramAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__System__ProgramAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2938:1: ( ( ( RULE_ID ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2939:1: ( ( RULE_ID ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2939:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2940:1: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getProgramProgramCrossReference_5_1_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2941:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2942:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getProgramProgramIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__ProgramAssignment_5_15856); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2953:1: rule__Program__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2957:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2958:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2958:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2959:1: ruleValidID
            {
             before(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Program__NameAssignment_15891);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2968:1: rule__Program__PathAssignment_3 : ( ruleConcatExpression ) ;
    public final void rule__Program__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2972:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2973:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2973:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2974:1: ruleConcatExpression
            {
             before(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_35922);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2983:1: rule__Program__FunctionsAssignment_5 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2987:1: ( ( ruleFunction ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2988:1: ( ruleFunction )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2988:1: ( ruleFunction )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2989:1: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_55953);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2998:1: rule__Param__NameAssignment : ( ruleValidID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3002:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3003:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3003:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3004:1: ruleValidID
            {
             before(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Param__NameAssignment5984);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3013:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3017:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3018:1: ( RULE_ID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3018:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3019:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16015); 
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


    // $ANTLR start "rule__Function__PrintOutModeAssignment_2_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3028:1: rule__Function__PrintOutModeAssignment_2_1 : ( rulePrintMode ) ;
    public final void rule__Function__PrintOutModeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3032:1: ( ( rulePrintMode ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3033:1: ( rulePrintMode )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3033:1: ( rulePrintMode )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3034:1: rulePrintMode
            {
             before(grammarAccess.getFunctionAccess().getPrintOutModePrintModeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePrintMode_in_rule__Function__PrintOutModeAssignment_2_16046);
            rulePrintMode();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getPrintOutModePrintModeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Function__PrintOutModeAssignment_2_1"


    // $ANTLR start "rule__Function__DescAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3043:1: rule__Function__DescAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DescAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3047:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3048:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3048:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3049:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_4_16077);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Function__DescAssignment_4_1"


    // $ANTLR start "rule__Function__DocurlAssignment_5_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3058:1: rule__Function__DocurlAssignment_5_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DocurlAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3062:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3063:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3063:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3064:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_5_16108);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Function__DocurlAssignment_5_1"


    // $ANTLR start "rule__Function__InputAssignment_6_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3073:1: rule__Function__InputAssignment_6_1 : ( ruleInputDataDefinition ) ;
    public final void rule__Function__InputAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3077:1: ( ( ruleInputDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3078:1: ( ruleInputDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3078:1: ( ruleInputDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3079:1: ruleInputDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getInputInputDataDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleInputDataDefinition_in_rule__Function__InputAssignment_6_16139);
            ruleInputDataDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputInputDataDefinitionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Function__InputAssignment_6_1"


    // $ANTLR start "rule__Function__OutputAssignment_7_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3088:1: rule__Function__OutputAssignment_7_1 : ( ruleOutputDataDefinition ) ;
    public final void rule__Function__OutputAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3092:1: ( ( ruleOutputDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3093:1: ( ruleOutputDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3093:1: ( ruleOutputDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3094:1: ruleOutputDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getOutputOutputDataDefinitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleOutputDataDefinition_in_rule__Function__OutputAssignment_7_16170);
            ruleOutputDataDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutputOutputDataDefinitionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Function__OutputAssignment_7_1"


    // $ANTLR start "rule__Function__OptionBlocksAssignment_8_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3103:1: rule__Function__OptionBlocksAssignment_8_1 : ( ruleOption ) ;
    public final void rule__Function__OptionBlocksAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3107:1: ( ( ruleOption ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3108:1: ( ruleOption )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3108:1: ( ruleOption )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3109:1: ruleOption
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_8_16201);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Function__OptionBlocksAssignment_8_1"


    // $ANTLR start "rule__InputDataDefinition__InputAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3118:1: rule__InputDataDefinition__InputAssignment_1 : ( ruleParam ) ;
    public final void rule__InputDataDefinition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3122:1: ( ( ruleParam ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3123:1: ( ruleParam )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3123:1: ( ruleParam )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3124:1: ruleParam
            {
             before(grammarAccess.getInputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__InputDataDefinition__InputAssignment_16232);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getInputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InputDataDefinition__InputAssignment_1"


    // $ANTLR start "rule__InputDataDefinition__TypeAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3133:1: rule__InputDataDefinition__TypeAssignment_3 : ( ruleInputDataType ) ;
    public final void rule__InputDataDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3137:1: ( ( ruleInputDataType ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3138:1: ( ruleInputDataType )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3138:1: ( ruleInputDataType )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3139:1: ruleInputDataType
            {
             before(grammarAccess.getInputDataDefinitionAccess().getTypeInputDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInputDataType_in_rule__InputDataDefinition__TypeAssignment_36263);
            ruleInputDataType();

            state._fsp--;

             after(grammarAccess.getInputDataDefinitionAccess().getTypeInputDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__InputDataDefinition__TypeAssignment_3"


    // $ANTLR start "rule__InputDataDefinition__DocAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3148:1: rule__InputDataDefinition__DocAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__InputDataDefinition__DocAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3152:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3153:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3153:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3154:1: ruleStringLiteral
            {
             before(grammarAccess.getInputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__InputDataDefinition__DocAssignment_4_16294);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getInputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__InputDataDefinition__DocAssignment_4_1"


    // $ANTLR start "rule__OutputDataDefinition__InputAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3163:1: rule__OutputDataDefinition__InputAssignment_1 : ( ruleParam ) ;
    public final void rule__OutputDataDefinition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3167:1: ( ( ruleParam ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3168:1: ( ruleParam )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3168:1: ( ruleParam )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3169:1: ruleParam
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__OutputDataDefinition__InputAssignment_16325);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getOutputDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OutputDataDefinition__InputAssignment_1"


    // $ANTLR start "rule__OutputDataDefinition__TypeAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3178:1: rule__OutputDataDefinition__TypeAssignment_3 : ( ruleOutputDataType ) ;
    public final void rule__OutputDataDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3182:1: ( ( ruleOutputDataType ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3183:1: ( ruleOutputDataType )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3183:1: ( ruleOutputDataType )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3184:1: ruleOutputDataType
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getTypeOutputDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOutputDataType_in_rule__OutputDataDefinition__TypeAssignment_36356);
            ruleOutputDataType();

            state._fsp--;

             after(grammarAccess.getOutputDataDefinitionAccess().getTypeOutputDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__OutputDataDefinition__TypeAssignment_3"


    // $ANTLR start "rule__OutputDataDefinition__DocAssignment_4_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3193:1: rule__OutputDataDefinition__DocAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__OutputDataDefinition__DocAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3197:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3198:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3198:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3199:1: ruleStringLiteral
            {
             before(grammarAccess.getOutputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__OutputDataDefinition__DocAssignment_4_16387);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getOutputDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__OutputDataDefinition__DocAssignment_4_1"


    // $ANTLR start "rule__Option__ParamAssignment"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3208:1: rule__Option__ParamAssignment : ( ruleConcatExpression ) ;
    public final void rule__Option__ParamAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3212:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3213:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3213:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3214:1: ruleConcatExpression
            {
             before(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment6418);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3223:1: rule__ConcatExpression__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ConcatExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3227:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3228:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3228:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3229:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_26449);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3238:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3242:1: ( ( RULE_STRING ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3243:1: ( RULE_STRING )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3243:1: ( RULE_STRING )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3244:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6480); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3253:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3257:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3258:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3258:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3259:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment6511); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3268:1: rule__DoubleLiteral__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3272:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3273:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3273:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3274:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_06542); 
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


    // $ANTLR start "rule__Primary__ParamAssignment_3"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3283:1: rule__Primary__ParamAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3287:1: ( ( ( RULE_ID ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3288:1: ( ( RULE_ID ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3288:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3289:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getParamParamCrossReference_3_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3290:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:3291:1: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getParamParamIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_36577); 
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
    public static final BitSet FOLLOW_ruleInputDataDefinition_in_entryRuleInputDataDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDataDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__0_in_ruleInputDataDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDataDefinition_in_entryRuleOutputDataDefinition421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDataDefinition428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__0_in_ruleOutputDataDefinition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ParamAssignment_in_ruleOption514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrintMode__Alternatives_in_rulePrintMode970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataType__Alternatives_in_ruleInputDataType1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataType__Alternatives_in_ruleOutputDataType1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PrintMode__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrintMode__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrintMode__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InputDataType__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InputDataType__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OutputDataType__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OutputDataType__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProgramsAssignment_0_in_rule__Model__Group__0__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SystemAssignment_1_in_rule__Model__Group__1__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__System__Group__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21596 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__21599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__System__Group__2__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31658 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__31661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41719 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__41722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51780 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__System__Group__6_in_rule__System__Group__51783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl1810 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__System__Group__6__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__System__Group_3__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__PortAssignment_3_1_in_rule__System__Group_3__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__02037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__02040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__System__Group_4__0__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__12099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__VersionAssignment_4_1_in_rule__System__Group_4__1__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__02160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__02163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__System__Group_5__0__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ProgramAssignment_5_1_in_rule__System__Group_5__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group__0__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12345 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22405 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group__2__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32467 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__32470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42527 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__4__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52589 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl2619 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__6__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Function__Group__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12785 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22845 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32906 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group__3__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42968 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__53029 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__53032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63090 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl3120 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73151 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3181 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83212 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_rule__Function__Group__9_in_rule__Function__Group__83215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_8__0_in_rule__Function__Group__8__Impl3242 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Function__Group__9__Impl_in_rule__Function__Group__93273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__9__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__03352 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Function__Group_2__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__PrintOutModeAssignment_2_1_in_rule__Function__Group_2__1__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__03475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__03478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Function__Group_4__0__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__13537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DescAssignment_4_1_in_rule__Function__Group_4__1__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__03598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Function__Group_5__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DocurlAssignment_5_1_in_rule__Function__Group_5__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__03721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__03724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Function__Group_6__0__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__InputAssignment_6_1_in_rule__Function__Group_6__1__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__03844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__03847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Function__Group_7__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OutputAssignment_7_1_in_rule__Function__Group_7__1__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_8__0__Impl_in_rule__Function__Group_8__03967 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Function__Group_8__1_in_rule__Function__Group_8__03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Function__Group_8__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_8__1__Impl_in_rule__Function__Group_8__14029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OptionBlocksAssignment_8_1_in_rule__Function__Group_8__1__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__0__Impl_in_rule__InputDataDefinition__Group__04090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__1_in_rule__InputDataDefinition__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__1__Impl_in_rule__InputDataDefinition__Group__14151 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__2_in_rule__InputDataDefinition__Group__14154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__InputAssignment_1_in_rule__InputDataDefinition__Group__1__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__2__Impl_in_rule__InputDataDefinition__Group__24211 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__3_in_rule__InputDataDefinition__Group__24214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InputDataDefinition__Group__2__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__3__Impl_in_rule__InputDataDefinition__Group__34273 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__4_in_rule__InputDataDefinition__Group__34276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__TypeAssignment_3_in_rule__InputDataDefinition__Group__3__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group__4__Impl_in_rule__InputDataDefinition__Group__44333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group_4__0_in_rule__InputDataDefinition__Group__4__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group_4__0__Impl_in_rule__InputDataDefinition__Group_4__04401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group_4__1_in_rule__InputDataDefinition__Group_4__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InputDataDefinition__Group_4__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__Group_4__1__Impl_in_rule__InputDataDefinition__Group_4__14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDataDefinition__DocAssignment_4_1_in_rule__InputDataDefinition__Group_4__1__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__0__Impl_in_rule__OutputDataDefinition__Group__04524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__1_in_rule__OutputDataDefinition__Group__04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__1__Impl_in_rule__OutputDataDefinition__Group__14585 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__2_in_rule__OutputDataDefinition__Group__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__InputAssignment_1_in_rule__OutputDataDefinition__Group__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__2__Impl_in_rule__OutputDataDefinition__Group__24645 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__3_in_rule__OutputDataDefinition__Group__24648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OutputDataDefinition__Group__2__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__3__Impl_in_rule__OutputDataDefinition__Group__34707 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__4_in_rule__OutputDataDefinition__Group__34710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__TypeAssignment_3_in_rule__OutputDataDefinition__Group__3__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group__4__Impl_in_rule__OutputDataDefinition__Group__44767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group_4__0_in_rule__OutputDataDefinition__Group__4__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group_4__0__Impl_in_rule__OutputDataDefinition__Group_4__04835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group_4__1_in_rule__OutputDataDefinition__Group_4__04838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OutputDataDefinition__Group_4__0__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__Group_4__1__Impl_in_rule__OutputDataDefinition__Group_4__14897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDataDefinition__DocAssignment_4_1_in_rule__OutputDataDefinition__Group_4__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__04958 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__04961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__15017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl5044 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__05079 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__05082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__15140 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConcatExpression__Group_1__1__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__25202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__05265 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__05268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__15325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DoubleLiteral__Group__1__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__25387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05449 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5535 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemAssignment_15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__System__NameAssignment_15759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__System__PortAssignment_3_15790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__System__VersionAssignment_4_15821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__ProgramAssignment_5_15856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Program__NameAssignment_15891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_35922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_55953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Param__NameAssignment5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_16015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintMode_in_rule__Function__PrintOutModeAssignment_2_16046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_4_16077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_5_16108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDataDefinition_in_rule__Function__InputAssignment_6_16139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDataDefinition_in_rule__Function__OutputAssignment_7_16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_8_16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__InputDataDefinition__InputAssignment_16232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDataType_in_rule__InputDataDefinition__TypeAssignment_36263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__InputDataDefinition__DocAssignment_4_16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__OutputDataDefinition__InputAssignment_16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDataType_in_rule__OutputDataDefinition__TypeAssignment_36356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__OutputDataDefinition__DocAssignment_4_16387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_26449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_06542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_36577 = new BitSet(new long[]{0x0000000000000002L});

}