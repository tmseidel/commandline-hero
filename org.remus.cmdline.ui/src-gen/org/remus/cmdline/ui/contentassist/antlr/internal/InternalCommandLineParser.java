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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'URL'", "'DATA'", "'PATH'", "'FOLDERPATH'", "'program '", "'->'", "'{'", "'}'", "'def'", "'desc ->'", "'docurl ->'", "'input'", "'output '", "'* '", "'AS'", "'doc -> '", "'+'", "'.'", "'import'"
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
    public static final int RULE_STRING=6;
    public static final int T__16=16;
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


    // $ANTLR start "entryRuleProgram"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:88:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:89:1: ( ruleProgram EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:90:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram121);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram128); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:97:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:104:1: ( rule__Program__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram154);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:116:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:117:1: ( ruleParam EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:118:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam181);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam188); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:125:1: ruleParam : ( ( rule__Param__NameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:129:2: ( ( ( rule__Param__NameAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:130:1: ( ( rule__Param__NameAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:130:1: ( ( rule__Param__NameAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:131:1: ( rule__Param__NameAssignment )
            {
             before(grammarAccess.getParamAccess().getNameAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:132:1: ( rule__Param__NameAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:132:2: rule__Param__NameAssignment
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_in_ruleParam214);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:144:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:145:1: ( ruleFunction EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:146:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction241);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction248); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:153:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:157:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:158:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:158:1: ( ( rule__Function__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:159:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:160:1: ( rule__Function__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:160:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction274);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:172:1: entryRuleDataDefinition : ruleDataDefinition EOF ;
    public final void entryRuleDataDefinition() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:173:1: ( ruleDataDefinition EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:174:1: ruleDataDefinition EOF
            {
             before(grammarAccess.getDataDefinitionRule()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition301);
            ruleDataDefinition();

            state._fsp--;

             after(grammarAccess.getDataDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition308); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:181:1: ruleDataDefinition : ( ( rule__DataDefinition__Group__0 ) ) ;
    public final void ruleDataDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:185:2: ( ( ( rule__DataDefinition__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:186:1: ( ( rule__DataDefinition__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:186:1: ( ( rule__DataDefinition__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:187:1: ( rule__DataDefinition__Group__0 )
            {
             before(grammarAccess.getDataDefinitionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:188:1: ( rule__DataDefinition__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:188:2: rule__DataDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__0_in_ruleDataDefinition334);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:200:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:201:1: ( ruleOption EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:202:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption361);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption368); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:209:1: ruleOption : ( ( rule__Option__ParamAssignment ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:213:2: ( ( ( rule__Option__ParamAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__Option__ParamAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:214:1: ( ( rule__Option__ParamAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:215:1: ( rule__Option__ParamAssignment )
            {
             before(grammarAccess.getOptionAccess().getParamAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:1: ( rule__Option__ParamAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:216:2: rule__Option__ParamAssignment
            {
            pushFollow(FOLLOW_rule__Option__ParamAssignment_in_ruleOption394);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:228:1: entryRuleConcatExpression : ruleConcatExpression EOF ;
    public final void entryRuleConcatExpression() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:229:1: ( ruleConcatExpression EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:230:1: ruleConcatExpression EOF
            {
             before(grammarAccess.getConcatExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression421);
            ruleConcatExpression();

            state._fsp--;

             after(grammarAccess.getConcatExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatExpression428); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:237:1: ruleConcatExpression : ( ( rule__ConcatExpression__Group__0 ) ) ;
    public final void ruleConcatExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:241:2: ( ( ( rule__ConcatExpression__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__ConcatExpression__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:242:1: ( ( rule__ConcatExpression__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:243:1: ( rule__ConcatExpression__Group__0 )
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:1: ( rule__ConcatExpression__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:244:2: rule__ConcatExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression454);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:256:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:257:1: ( ruleStringLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:258:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral481);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral488); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:265:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:269:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:270:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:271:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:272:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral514);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:284:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:285:1: ( ruleIntegerLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:286:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral541);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral548); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:293:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:297:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:298:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:299:1: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:300:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral574);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:312:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:313:1: ( ruleDoubleLiteral EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:314:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral601);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral608); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:321:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:325:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:326:1: ( ( rule__DoubleLiteral__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:327:1: ( rule__DoubleLiteral__Group__0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:1: ( rule__DoubleLiteral__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:328:2: rule__DoubleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral634);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:340:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:341:1: ( ruleImport EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:342:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport661);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport668); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:349:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:353:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:354:1: ( ( rule__Import__Group__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:355:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:1: ( rule__Import__Group__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:356:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport694);
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


    // $ANTLR start "entryRuleValidID"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:370:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:371:1: ( ruleValidID EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:372:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID723);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID730); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:379:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:383:2: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:1: ( RULE_ID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:384:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:385:1: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID756); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:398:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:399:1: ( rulePrimary EOF )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:400:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary782);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary789); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:407:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:411:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:412:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:412:1: ( ( rule__Primary__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:413:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:414:1: ( rule__Primary__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:414:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary815);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:427:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:431:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:432:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:432:1: ( ( rule__DataType__Alternatives ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:433:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:434:1: ( rule__DataType__Alternatives )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:434:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType852);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:445:1: rule__Primary__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:449:1: ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ( rule__Primary__ParamAssignment_3 ) ) )
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

                if ( (LA1_2==29) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)||LA1_2==25||LA1_2==28) ) {
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
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:450:1: ( ruleStringLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:450:1: ( ruleStringLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:451:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives887);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:456:6: ( ruleIntegerLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:456:6: ( ruleIntegerLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:457:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives904);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:462:6: ( ruleDoubleLiteral )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:462:6: ( ruleDoubleLiteral )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:463:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives921);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDoubleLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:468:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:468:6: ( ( rule__Primary__ParamAssignment_3 ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:469:1: ( rule__Primary__ParamAssignment_3 )
                    {
                     before(grammarAccess.getPrimaryAccess().getParamAssignment_3()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:470:1: ( rule__Primary__ParamAssignment_3 )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:470:2: rule__Primary__ParamAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives938);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:479:1: rule__DataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'URL' ) ) | ( ( 'DATA' ) ) | ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:483:1: ( ( ( 'STRING' ) ) | ( ( 'URL' ) ) | ( ( 'DATA' ) ) | ( ( 'PATH' ) ) | ( ( 'FOLDERPATH' ) ) )
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
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:484:1: ( ( 'STRING' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:484:1: ( ( 'STRING' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:485:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:1: ( 'STRING' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:486:3: 'STRING'
                    {
                    match(input,11,FOLLOW_11_in_rule__DataType__Alternatives972); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:491:6: ( ( 'URL' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:491:6: ( ( 'URL' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:492:1: ( 'URL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:493:1: ( 'URL' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:493:3: 'URL'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataType__Alternatives993); 

                    }

                     after(grammarAccess.getDataTypeAccess().getURLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:498:6: ( ( 'DATA' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:498:6: ( ( 'DATA' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:499:1: ( 'DATA' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:500:1: ( 'DATA' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:500:3: 'DATA'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives1014); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:505:6: ( ( 'PATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:505:6: ( ( 'PATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:506:1: ( 'PATH' )
                    {
                     before(grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:507:1: ( 'PATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:507:3: 'PATH'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives1035); 

                    }

                     after(grammarAccess.getDataTypeAccess().getPATHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:512:6: ( ( 'FOLDERPATH' ) )
                    {
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:512:6: ( ( 'FOLDERPATH' ) )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:513:1: ( 'FOLDERPATH' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFOLDERPATHEnumLiteralDeclaration_4()); 
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:514:1: ( 'FOLDERPATH' )
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:514:3: 'FOLDERPATH'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives1056); 

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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:526:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:530:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:531:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01089);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01092);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:538:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:542:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:543:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:543:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:544:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:545:1: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:545:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl1119);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:555:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:559:1: ( rule__Model__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:560:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11150);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:566:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:570:1: ( ( ( rule__Model__ProgramsAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:571:1: ( ( rule__Model__ProgramsAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:571:1: ( ( rule__Model__ProgramsAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:572:1: ( rule__Model__ProgramsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getProgramsAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:573:1: ( rule__Model__ProgramsAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:573:2: rule__Model__ProgramsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ProgramsAssignment_1_in_rule__Model__Group__1__Impl1177);
            rule__Model__ProgramsAssignment_1();

            state._fsp--;


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


    // $ANTLR start "rule__Program__Group__0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:587:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:591:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:592:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01211);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01214);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:599:1: rule__Program__Group__0__Impl : ( 'program ' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:603:1: ( ( 'program ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:604:1: ( 'program ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:604:1: ( 'program ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:605:1: 'program '
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Program__Group__0__Impl1242); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:618:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:622:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:623:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11273);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11276);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:630:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:634:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:635:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:635:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:636:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:637:1: ( rule__Program__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:637:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1303);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:647:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:651:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:652:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21333);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21336);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:659:1: rule__Program__Group__2__Impl : ( '->' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:663:1: ( ( '->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:664:1: ( '->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:664:1: ( '->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:665:1: '->'
            {
             before(grammarAccess.getProgramAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__2__Impl1364); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:678:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:682:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:683:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31395);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31398);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:690:1: rule__Program__Group__3__Impl : ( ( rule__Program__PathAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:694:1: ( ( ( rule__Program__PathAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:695:1: ( ( rule__Program__PathAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:695:1: ( ( rule__Program__PathAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:696:1: ( rule__Program__PathAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPathAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:697:1: ( rule__Program__PathAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:697:2: rule__Program__PathAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl1425);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:707:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:711:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:712:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41455);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41458);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:719:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:723:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:724:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:724:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:725:1: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__4__Impl1486); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:738:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:742:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:743:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__51517);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__51520);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:750:1: rule__Program__Group__5__Impl : ( ( rule__Program__FunctionsAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:754:1: ( ( ( rule__Program__FunctionsAssignment_5 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:755:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:755:1: ( ( rule__Program__FunctionsAssignment_5 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:756:1: ( rule__Program__FunctionsAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:757:1: ( rule__Program__FunctionsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:757:2: rule__Program__FunctionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl1547);
            	    rule__Program__FunctionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:767:1: rule__Program__Group__6 : rule__Program__Group__6__Impl ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:771:1: ( rule__Program__Group__6__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:772:2: rule__Program__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__61578);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:778:1: rule__Program__Group__6__Impl : ( '}' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:782:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:783:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:783:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:784:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__6__Impl1606); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:811:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:815:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:816:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01651);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01654);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:823:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:827:1: ( ( 'def' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:828:1: ( 'def' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:828:1: ( 'def' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:829:1: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Function__Group__0__Impl1682); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:842:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:846:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:847:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11713);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11716);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:854:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:858:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:859:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:859:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:860:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:861:1: ( rule__Function__NameAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:861:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl1743);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:871:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:875:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:876:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21773);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21776);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:883:1: rule__Function__Group__2__Impl : ( '{' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:887:1: ( ( '{' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:888:1: ( '{' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:888:1: ( '{' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:889:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Function__Group__2__Impl1804); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:902:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:906:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:907:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31835);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31838);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:914:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:918:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:919:1: ( ( rule__Function__Group_3__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:919:1: ( ( rule__Function__Group_3__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:920:1: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:921:1: ( rule__Function__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:921:2: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl1865);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:931:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:935:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:936:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41896);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41899);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:943:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:947:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:948:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:948:1: ( ( rule__Function__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:949:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:950:1: ( rule__Function__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:950:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1926);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:960:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:964:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:965:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51957);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__51960);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:972:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:976:1: ( ( ( rule__Function__Group_5__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:977:1: ( ( rule__Function__Group_5__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:977:1: ( ( rule__Function__Group_5__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:978:1: ( rule__Function__Group_5__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:979:1: ( rule__Function__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:979:2: rule__Function__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl1987);
            	    rule__Function__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:989:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:993:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:994:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__62018);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__7_in_rule__Function__Group__62021);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1001:1: rule__Function__Group__6__Impl : ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1005:1: ( ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1006:1: ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1006:1: ( ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1007:1: ( ( rule__Function__Group_6__0 ) ) ( ( rule__Function__Group_6__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1007:1: ( ( rule__Function__Group_6__0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1008:1: ( rule__Function__Group_6__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1009:1: ( rule__Function__Group_6__0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1009:2: rule__Function__Group_6__0
            {
            pushFollow(FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl2050);
            rule__Function__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup_6()); 

            }

            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1012:1: ( ( rule__Function__Group_6__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1013:1: ( rule__Function__Group_6__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_6()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1014:1: ( rule__Function__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1014:2: rule__Function__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl2062);
            	    rule__Function__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1025:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1029:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1030:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__72095);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__8_in_rule__Function__Group__72098);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1037:1: rule__Function__Group__7__Impl : ( ( rule__Function__Group_7__0 )* ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1041:1: ( ( ( rule__Function__Group_7__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1042:1: ( ( rule__Function__Group_7__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1042:1: ( ( rule__Function__Group_7__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1043:1: ( rule__Function__Group_7__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_7()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1044:1: ( rule__Function__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1044:2: rule__Function__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl2125);
            	    rule__Function__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1054:1: rule__Function__Group__8 : rule__Function__Group__8__Impl ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1058:1: ( rule__Function__Group__8__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1059:2: rule__Function__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__82156);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1065:1: rule__Function__Group__8__Impl : ( '}' ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1069:1: ( ( '}' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1070:1: ( '}' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1070:1: ( '}' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1071:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Function__Group__8__Impl2184); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1102:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1106:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1107:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__02233);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__02236);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1114:1: rule__Function__Group_3__0__Impl : ( 'desc ->' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1118:1: ( ( 'desc ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1119:1: ( 'desc ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1119:1: ( 'desc ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1120:1: 'desc ->'
            {
             before(grammarAccess.getFunctionAccess().getDescKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Function__Group_3__0__Impl2264); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1133:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1137:1: ( rule__Function__Group_3__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1138:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__12295);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1144:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__DescAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1148:1: ( ( ( rule__Function__DescAssignment_3_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1149:1: ( ( rule__Function__DescAssignment_3_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1149:1: ( ( rule__Function__DescAssignment_3_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1150:1: ( rule__Function__DescAssignment_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getDescAssignment_3_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1151:1: ( rule__Function__DescAssignment_3_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1151:2: rule__Function__DescAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Function__DescAssignment_3_1_in_rule__Function__Group_3__1__Impl2322);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1165:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1169:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1170:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__02356);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__02359);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1177:1: rule__Function__Group_4__0__Impl : ( 'docurl ->' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1181:1: ( ( 'docurl ->' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1182:1: ( 'docurl ->' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1182:1: ( 'docurl ->' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1183:1: 'docurl ->'
            {
             before(grammarAccess.getFunctionAccess().getDocurlKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Function__Group_4__0__Impl2387); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1196:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1200:1: ( rule__Function__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1201:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__12418);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1207:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__DocurlAssignment_4_1 ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1211:1: ( ( ( rule__Function__DocurlAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1212:1: ( ( rule__Function__DocurlAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1212:1: ( ( rule__Function__DocurlAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1213:1: ( rule__Function__DocurlAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getDocurlAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1214:1: ( rule__Function__DocurlAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1214:2: rule__Function__DocurlAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Function__DocurlAssignment_4_1_in_rule__Function__Group_4__1__Impl2445);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1228:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1232:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1233:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__02479);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__02482);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1240:1: rule__Function__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1244:1: ( ( 'input' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1245:1: ( 'input' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1245:1: ( 'input' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1246:1: 'input'
            {
             before(grammarAccess.getFunctionAccess().getInputKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Function__Group_5__0__Impl2510); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1259:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1263:1: ( rule__Function__Group_5__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1264:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__12541);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1270:1: rule__Function__Group_5__1__Impl : ( ( rule__Function__InputAssignment_5_1 ) ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1274:1: ( ( ( rule__Function__InputAssignment_5_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1275:1: ( ( rule__Function__InputAssignment_5_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1275:1: ( ( rule__Function__InputAssignment_5_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1276:1: ( rule__Function__InputAssignment_5_1 )
            {
             before(grammarAccess.getFunctionAccess().getInputAssignment_5_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1277:1: ( rule__Function__InputAssignment_5_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1277:2: rule__Function__InputAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Function__InputAssignment_5_1_in_rule__Function__Group_5__1__Impl2568);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1291:1: rule__Function__Group_6__0 : rule__Function__Group_6__0__Impl rule__Function__Group_6__1 ;
    public final void rule__Function__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1295:1: ( rule__Function__Group_6__0__Impl rule__Function__Group_6__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1296:2: rule__Function__Group_6__0__Impl rule__Function__Group_6__1
            {
            pushFollow(FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__02602);
            rule__Function__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__02605);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1303:1: rule__Function__Group_6__0__Impl : ( 'output ' ) ;
    public final void rule__Function__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1307:1: ( ( 'output ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1308:1: ( 'output ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1308:1: ( 'output ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1309:1: 'output '
            {
             before(grammarAccess.getFunctionAccess().getOutputKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Function__Group_6__0__Impl2633); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1322:1: rule__Function__Group_6__1 : rule__Function__Group_6__1__Impl ;
    public final void rule__Function__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1326:1: ( rule__Function__Group_6__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1327:2: rule__Function__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__12664);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1333:1: rule__Function__Group_6__1__Impl : ( ( rule__Function__OutputAssignment_6_1 ) ) ;
    public final void rule__Function__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1337:1: ( ( ( rule__Function__OutputAssignment_6_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1338:1: ( ( rule__Function__OutputAssignment_6_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1338:1: ( ( rule__Function__OutputAssignment_6_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1339:1: ( rule__Function__OutputAssignment_6_1 )
            {
             before(grammarAccess.getFunctionAccess().getOutputAssignment_6_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1340:1: ( rule__Function__OutputAssignment_6_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1340:2: rule__Function__OutputAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Function__OutputAssignment_6_1_in_rule__Function__Group_6__1__Impl2691);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1354:1: rule__Function__Group_7__0 : rule__Function__Group_7__0__Impl rule__Function__Group_7__1 ;
    public final void rule__Function__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1358:1: ( rule__Function__Group_7__0__Impl rule__Function__Group_7__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1359:2: rule__Function__Group_7__0__Impl rule__Function__Group_7__1
            {
            pushFollow(FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__02725);
            rule__Function__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__02728);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1366:1: rule__Function__Group_7__0__Impl : ( '* ' ) ;
    public final void rule__Function__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1370:1: ( ( '* ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1371:1: ( '* ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1371:1: ( '* ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1372:1: '* '
            {
             before(grammarAccess.getFunctionAccess().getAsteriskSpaceKeyword_7_0()); 
            match(input,25,FOLLOW_25_in_rule__Function__Group_7__0__Impl2756); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1385:1: rule__Function__Group_7__1 : rule__Function__Group_7__1__Impl ;
    public final void rule__Function__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1389:1: ( rule__Function__Group_7__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1390:2: rule__Function__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__12787);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1396:1: rule__Function__Group_7__1__Impl : ( ( rule__Function__OptionBlocksAssignment_7_1 ) ) ;
    public final void rule__Function__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1400:1: ( ( ( rule__Function__OptionBlocksAssignment_7_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1401:1: ( ( rule__Function__OptionBlocksAssignment_7_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1401:1: ( ( rule__Function__OptionBlocksAssignment_7_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1402:1: ( rule__Function__OptionBlocksAssignment_7_1 )
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksAssignment_7_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1403:1: ( rule__Function__OptionBlocksAssignment_7_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1403:2: rule__Function__OptionBlocksAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Function__OptionBlocksAssignment_7_1_in_rule__Function__Group_7__1__Impl2814);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1417:1: rule__DataDefinition__Group__0 : rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1 ;
    public final void rule__DataDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1421:1: ( rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1422:2: rule__DataDefinition__Group__0__Impl rule__DataDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__0__Impl_in_rule__DataDefinition__Group__02848);
            rule__DataDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__1_in_rule__DataDefinition__Group__02851);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1429:1: rule__DataDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DataDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1433:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1434:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1434:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1435:1: ()
            {
             before(grammarAccess.getDataDefinitionAccess().getDataDefinitionAction_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1436:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1438:1: 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1448:1: rule__DataDefinition__Group__1 : rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2 ;
    public final void rule__DataDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1452:1: ( rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1453:2: rule__DataDefinition__Group__1__Impl rule__DataDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__1__Impl_in_rule__DataDefinition__Group__12909);
            rule__DataDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__2_in_rule__DataDefinition__Group__12912);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1460:1: rule__DataDefinition__Group__1__Impl : ( ( rule__DataDefinition__InputAssignment_1 ) ) ;
    public final void rule__DataDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1464:1: ( ( ( rule__DataDefinition__InputAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1465:1: ( ( rule__DataDefinition__InputAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1465:1: ( ( rule__DataDefinition__InputAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1466:1: ( rule__DataDefinition__InputAssignment_1 )
            {
             before(grammarAccess.getDataDefinitionAccess().getInputAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1467:1: ( rule__DataDefinition__InputAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1467:2: rule__DataDefinition__InputAssignment_1
            {
            pushFollow(FOLLOW_rule__DataDefinition__InputAssignment_1_in_rule__DataDefinition__Group__1__Impl2939);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1477:1: rule__DataDefinition__Group__2 : rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3 ;
    public final void rule__DataDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1481:1: ( rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1482:2: rule__DataDefinition__Group__2__Impl rule__DataDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__2__Impl_in_rule__DataDefinition__Group__22969);
            rule__DataDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__3_in_rule__DataDefinition__Group__22972);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1489:1: rule__DataDefinition__Group__2__Impl : ( 'AS' ) ;
    public final void rule__DataDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1493:1: ( ( 'AS' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1494:1: ( 'AS' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1494:1: ( 'AS' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1495:1: 'AS'
            {
             before(grammarAccess.getDataDefinitionAccess().getASKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DataDefinition__Group__2__Impl3000); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1508:1: rule__DataDefinition__Group__3 : rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4 ;
    public final void rule__DataDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1512:1: ( rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1513:2: rule__DataDefinition__Group__3__Impl rule__DataDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__3__Impl_in_rule__DataDefinition__Group__33031);
            rule__DataDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group__4_in_rule__DataDefinition__Group__33034);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1520:1: rule__DataDefinition__Group__3__Impl : ( ( rule__DataDefinition__TypeAssignment_3 ) ) ;
    public final void rule__DataDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1524:1: ( ( ( rule__DataDefinition__TypeAssignment_3 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1525:1: ( ( rule__DataDefinition__TypeAssignment_3 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1525:1: ( ( rule__DataDefinition__TypeAssignment_3 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1526:1: ( rule__DataDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getDataDefinitionAccess().getTypeAssignment_3()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1527:1: ( rule__DataDefinition__TypeAssignment_3 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1527:2: rule__DataDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__DataDefinition__TypeAssignment_3_in_rule__DataDefinition__Group__3__Impl3061);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1537:1: rule__DataDefinition__Group__4 : rule__DataDefinition__Group__4__Impl ;
    public final void rule__DataDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1541:1: ( rule__DataDefinition__Group__4__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1542:2: rule__DataDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group__4__Impl_in_rule__DataDefinition__Group__43091);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1548:1: rule__DataDefinition__Group__4__Impl : ( ( rule__DataDefinition__Group_4__0 )? ) ;
    public final void rule__DataDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1552:1: ( ( ( rule__DataDefinition__Group_4__0 )? ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1553:1: ( ( rule__DataDefinition__Group_4__0 )? )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1553:1: ( ( rule__DataDefinition__Group_4__0 )? )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1554:1: ( rule__DataDefinition__Group_4__0 )?
            {
             before(grammarAccess.getDataDefinitionAccess().getGroup_4()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1555:1: ( rule__DataDefinition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1555:2: rule__DataDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DataDefinition__Group_4__0_in_rule__DataDefinition__Group__4__Impl3118);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1575:1: rule__DataDefinition__Group_4__0 : rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1 ;
    public final void rule__DataDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1579:1: ( rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1580:2: rule__DataDefinition__Group_4__0__Impl rule__DataDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group_4__0__Impl_in_rule__DataDefinition__Group_4__03159);
            rule__DataDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataDefinition__Group_4__1_in_rule__DataDefinition__Group_4__03162);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1587:1: rule__DataDefinition__Group_4__0__Impl : ( 'doc -> ' ) ;
    public final void rule__DataDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1591:1: ( ( 'doc -> ' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1592:1: ( 'doc -> ' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1592:1: ( 'doc -> ' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1593:1: 'doc -> '
            {
             before(grammarAccess.getDataDefinitionAccess().getDocKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__DataDefinition__Group_4__0__Impl3190); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1606:1: rule__DataDefinition__Group_4__1 : rule__DataDefinition__Group_4__1__Impl ;
    public final void rule__DataDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1610:1: ( rule__DataDefinition__Group_4__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1611:2: rule__DataDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DataDefinition__Group_4__1__Impl_in_rule__DataDefinition__Group_4__13221);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1617:1: rule__DataDefinition__Group_4__1__Impl : ( ( rule__DataDefinition__DocAssignment_4_1 ) ) ;
    public final void rule__DataDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1621:1: ( ( ( rule__DataDefinition__DocAssignment_4_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1622:1: ( ( rule__DataDefinition__DocAssignment_4_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1622:1: ( ( rule__DataDefinition__DocAssignment_4_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1623:1: ( rule__DataDefinition__DocAssignment_4_1 )
            {
             before(grammarAccess.getDataDefinitionAccess().getDocAssignment_4_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1624:1: ( rule__DataDefinition__DocAssignment_4_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1624:2: rule__DataDefinition__DocAssignment_4_1
            {
            pushFollow(FOLLOW_rule__DataDefinition__DocAssignment_4_1_in_rule__DataDefinition__Group_4__1__Impl3248);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1638:1: rule__ConcatExpression__Group__0 : rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 ;
    public final void rule__ConcatExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1642:1: ( rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1643:2: rule__ConcatExpression__Group__0__Impl rule__ConcatExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__03282);
            rule__ConcatExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__03285);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1650:1: rule__ConcatExpression__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ConcatExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1654:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1655:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1655:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1656:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl3312);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1667:1: rule__ConcatExpression__Group__1 : rule__ConcatExpression__Group__1__Impl ;
    public final void rule__ConcatExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1671:1: ( rule__ConcatExpression__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1672:2: rule__ConcatExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__13341);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1678:1: rule__ConcatExpression__Group__1__Impl : ( ( rule__ConcatExpression__Group_1__0 )* ) ;
    public final void rule__ConcatExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1682:1: ( ( ( rule__ConcatExpression__Group_1__0 )* ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1683:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1683:1: ( ( rule__ConcatExpression__Group_1__0 )* )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1684:1: ( rule__ConcatExpression__Group_1__0 )*
            {
             before(grammarAccess.getConcatExpressionAccess().getGroup_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1685:1: ( rule__ConcatExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1685:2: rule__ConcatExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl3368);
            	    rule__ConcatExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1699:1: rule__ConcatExpression__Group_1__0 : rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 ;
    public final void rule__ConcatExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1703:1: ( rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1704:2: rule__ConcatExpression__Group_1__0__Impl rule__ConcatExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__03403);
            rule__ConcatExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__03406);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1711:1: rule__ConcatExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1715:1: ( ( () ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1716:1: ( () )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1716:1: ( () )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1717:1: ()
            {
             before(grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1718:1: ()
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1720:1: 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1730:1: rule__ConcatExpression__Group_1__1 : rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 ;
    public final void rule__ConcatExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1734:1: ( rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1735:2: rule__ConcatExpression__Group_1__1__Impl rule__ConcatExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__13464);
            rule__ConcatExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__13467);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1742:1: rule__ConcatExpression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ConcatExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1746:1: ( ( '+' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1747:1: ( '+' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1747:1: ( '+' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1748:1: '+'
            {
             before(grammarAccess.getConcatExpressionAccess().getPlusSignKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__ConcatExpression__Group_1__1__Impl3495); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1761:1: rule__ConcatExpression__Group_1__2 : rule__ConcatExpression__Group_1__2__Impl ;
    public final void rule__ConcatExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1765:1: ( rule__ConcatExpression__Group_1__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1766:2: rule__ConcatExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__23526);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1772:1: rule__ConcatExpression__Group_1__2__Impl : ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1776:1: ( ( ( rule__ConcatExpression__RightAssignment_1_2 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1777:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1777:1: ( ( rule__ConcatExpression__RightAssignment_1_2 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1778:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatExpressionAccess().getRightAssignment_1_2()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1779:1: ( rule__ConcatExpression__RightAssignment_1_2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1779:2: rule__ConcatExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl3553);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1795:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1799:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1800:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__03589);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__03592);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1807:1: rule__DoubleLiteral__Group__0__Impl : ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1811:1: ( ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1812:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1812:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1813:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1814:1: ( rule__DoubleLiteral__ValueAssignment_0 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1814:2: rule__DoubleLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl3619);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1824:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1828:1: ( rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1829:2: rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__13649);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__13652);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1836:1: rule__DoubleLiteral__Group__1__Impl : ( '.' ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1840:1: ( ( '.' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1841:1: ( '.' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1841:1: ( '.' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1842:1: '.'
            {
             before(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__DoubleLiteral__Group__1__Impl3680); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1855:1: rule__DoubleLiteral__Group__2 : rule__DoubleLiteral__Group__2__Impl ;
    public final void rule__DoubleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1859:1: ( rule__DoubleLiteral__Group__2__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1860:2: rule__DoubleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__23711);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1866:1: rule__DoubleLiteral__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1870:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1871:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1871:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1872:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl3738); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1889:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1893:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1894:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03773);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03776);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1901:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1905:1: ( ( 'import' ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1906:1: ( 'import' )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1906:1: ( 'import' )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1907:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Import__Group__0__Impl3804); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1920:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1924:1: ( rule__Import__Group__1__Impl )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1925:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13835);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1931:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1935:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1936:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1936:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1937:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1938:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1938:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3862);
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1955:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1959:1: ( ( ruleImport ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1960:1: ( ruleImport )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1960:1: ( ruleImport )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1961:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_03903);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1970:1: rule__Model__ProgramsAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1974:1: ( ( ruleProgram ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1975:1: ( ruleProgram )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1975:1: ( ruleProgram )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1976:1: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_13934);
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


    // $ANTLR start "rule__Program__NameAssignment_1"
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1985:1: rule__Program__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1989:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1990:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1990:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:1991:1: ruleValidID
            {
             before(grammarAccess.getProgramAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Program__NameAssignment_13965);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2000:1: rule__Program__PathAssignment_3 : ( ruleConcatExpression ) ;
    public final void rule__Program__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2004:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2005:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2005:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2006:1: ruleConcatExpression
            {
             before(grammarAccess.getProgramAccess().getPathConcatExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_33996);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2015:1: rule__Program__FunctionsAssignment_5 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2019:1: ( ( ruleFunction ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2020:1: ( ruleFunction )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2020:1: ( ruleFunction )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2021:1: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_54027);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2030:1: rule__Param__NameAssignment : ( ruleValidID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2034:1: ( ( ruleValidID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2035:1: ( ruleValidID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2035:1: ( ruleValidID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2036:1: ruleValidID
            {
             before(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Param__NameAssignment4058);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2045:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2049:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2050:1: ( RULE_ID )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2050:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2051:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_14089); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2060:1: rule__Function__DescAssignment_3_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DescAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2064:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2065:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2065:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2066:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDescStringLiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_3_14120);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2075:1: rule__Function__DocurlAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__Function__DocurlAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2079:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2080:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2080:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2081:1: ruleStringLiteral
            {
             before(grammarAccess.getFunctionAccess().getDocurlStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_4_14151);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2090:1: rule__Function__InputAssignment_5_1 : ( ruleDataDefinition ) ;
    public final void rule__Function__InputAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2094:1: ( ( ruleDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2095:1: ( ruleDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2095:1: ( ruleDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2096:1: ruleDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getInputDataDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_rule__Function__InputAssignment_5_14182);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2105:1: rule__Function__OutputAssignment_6_1 : ( ruleDataDefinition ) ;
    public final void rule__Function__OutputAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2109:1: ( ( ruleDataDefinition ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2110:1: ( ruleDataDefinition )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2110:1: ( ruleDataDefinition )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2111:1: ruleDataDefinition
            {
             before(grammarAccess.getFunctionAccess().getOutputDataDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDataDefinition_in_rule__Function__OutputAssignment_6_14213);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2120:1: rule__Function__OptionBlocksAssignment_7_1 : ( ruleOption ) ;
    public final void rule__Function__OptionBlocksAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2124:1: ( ( ruleOption ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2125:1: ( ruleOption )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2125:1: ( ruleOption )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2126:1: ruleOption
            {
             before(grammarAccess.getFunctionAccess().getOptionBlocksOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_7_14244);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2135:1: rule__DataDefinition__InputAssignment_1 : ( ruleParam ) ;
    public final void rule__DataDefinition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2139:1: ( ( ruleParam ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2140:1: ( ruleParam )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2140:1: ( ruleParam )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2141:1: ruleParam
            {
             before(grammarAccess.getDataDefinitionAccess().getInputParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__DataDefinition__InputAssignment_14275);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2150:1: rule__DataDefinition__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__DataDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2154:1: ( ( ruleDataType ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2155:1: ( ruleDataType )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2155:1: ( ruleDataType )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2156:1: ruleDataType
            {
             before(grammarAccess.getDataDefinitionAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__DataDefinition__TypeAssignment_34306);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2165:1: rule__DataDefinition__DocAssignment_4_1 : ( ruleStringLiteral ) ;
    public final void rule__DataDefinition__DocAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2169:1: ( ( ruleStringLiteral ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2170:1: ( ruleStringLiteral )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2170:1: ( ruleStringLiteral )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2171:1: ruleStringLiteral
            {
             before(grammarAccess.getDataDefinitionAccess().getDocStringLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__DataDefinition__DocAssignment_4_14337);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2180:1: rule__Option__ParamAssignment : ( ruleConcatExpression ) ;
    public final void rule__Option__ParamAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2184:1: ( ( ruleConcatExpression ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2185:1: ( ruleConcatExpression )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2185:1: ( ruleConcatExpression )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2186:1: ruleConcatExpression
            {
             before(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment4368);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2195:1: rule__ConcatExpression__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ConcatExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2199:1: ( ( rulePrimary ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2200:1: ( rulePrimary )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2200:1: ( rulePrimary )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2201:1: rulePrimary
            {
             before(grammarAccess.getConcatExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_24399);
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2210:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2214:1: ( ( RULE_STRING ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2215:1: ( RULE_STRING )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2215:1: ( RULE_STRING )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2216:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment4430); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2225:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2229:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2230:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2230:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2231:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment4461); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2240:1: rule__DoubleLiteral__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2244:1: ( ( RULE_INT ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2245:1: ( RULE_INT )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2245:1: ( RULE_INT )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2246:1: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_04492); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2255:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2259:1: ( ( RULE_STRING ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2260:1: ( RULE_STRING )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2260:1: ( RULE_STRING )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2261:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14523); 
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
    // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2270:1: rule__Primary__ParamAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2274:1: ( ( ( RULE_ID ) ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2275:1: ( ( RULE_ID ) )
            {
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2275:1: ( ( RULE_ID ) )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2276:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getParamParamCrossReference_3_0()); 
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2277:1: ( RULE_ID )
            // ../org.remus.cmdline.ui/src-gen/org/remus/cmdline/ui/contentassist/antlr/internal/InternalCommandLine.g:2278:1: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getParamParamIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_34558); 
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
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_in_ruleParam214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__0_in_ruleDataDefinition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ParamAssignment_in_ruleOption394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_entryRuleConcatExpression421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatExpression428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0_in_ruleConcatExpression454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primary__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Primary__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_rule__Primary__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ParamAssignment_3_in_rule__Primary__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataType__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01089 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl1119 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProgramsAssignment_1_in_rule__Model__Group__1__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11273 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21333 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__2__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PathAssignment_3_in_rule__Program__Group__3__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41455 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__4__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__51517 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__51520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FunctionsAssignment_5_in_rule__Program__Group__5__Impl1547 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__61578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__6__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11713 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21773 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group__2__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31835 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41896 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51957 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__51960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0_in_rule__Function__Group__5__Impl1987 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__62018 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__Function__Group__7_in_rule__Function__Group__62021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl2050 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0_in_rule__Function__Group__6__Impl2062 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__72095 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rule__Function__Group__8_in_rule__Function__Group__72098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl2125 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__82156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__8__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__02233 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__02236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Function__Group_3__0__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__12295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DescAssignment_3_1_in_rule__Function__Group_3__1__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__02356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__02359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Function__Group_4__0__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DocurlAssignment_4_1_in_rule__Function__Group_4__1__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__0__Impl_in_rule__Function__Group_5__02479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1_in_rule__Function__Group_5__02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Function__Group_5__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_5__1__Impl_in_rule__Function__Group_5__12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__InputAssignment_5_1_in_rule__Function__Group_5__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__0__Impl_in_rule__Function__Group_6__02602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1_in_rule__Function__Group_6__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Function__Group_6__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_6__1__Impl_in_rule__Function__Group_6__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OutputAssignment_6_1_in_rule__Function__Group_6__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__02725 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Function__Group_7__0__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OptionBlocksAssignment_7_1_in_rule__Function__Group_7__1__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__0__Impl_in_rule__DataDefinition__Group__02848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__1_in_rule__DataDefinition__Group__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__1__Impl_in_rule__DataDefinition__Group__12909 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__2_in_rule__DataDefinition__Group__12912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__InputAssignment_1_in_rule__DataDefinition__Group__1__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__2__Impl_in_rule__DataDefinition__Group__22969 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__3_in_rule__DataDefinition__Group__22972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataDefinition__Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__3__Impl_in_rule__DataDefinition__Group__33031 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__4_in_rule__DataDefinition__Group__33034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__TypeAssignment_3_in_rule__DataDefinition__Group__3__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group__4__Impl_in_rule__DataDefinition__Group__43091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__0_in_rule__DataDefinition__Group__4__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__0__Impl_in_rule__DataDefinition__Group_4__03159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__1_in_rule__DataDefinition__Group_4__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataDefinition__Group_4__0__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__Group_4__1__Impl_in_rule__DataDefinition__Group_4__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataDefinition__DocAssignment_4_1_in_rule__DataDefinition__Group_4__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__0__Impl_in_rule__ConcatExpression__Group__03282 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1_in_rule__ConcatExpression__Group__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group__1__Impl_in_rule__ConcatExpression__Group__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0_in_rule__ConcatExpression__Group__1__Impl3368 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__0__Impl_in_rule__ConcatExpression__Group_1__03403 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1_in_rule__ConcatExpression__Group_1__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__1__Impl_in_rule__ConcatExpression__Group_1__13464 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2_in_rule__ConcatExpression__Group_1__13467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ConcatExpression__Group_1__1__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__Group_1__2__Impl_in_rule__ConcatExpression__Group_1__23526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatExpression__RightAssignment_1_2_in_rule__ConcatExpression__Group_1__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__03589 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__ValueAssignment_0_in_rule__DoubleLiteral__Group__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__13649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2_in_rule__DoubleLiteral__Group__13652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DoubleLiteral__Group__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleLiteral__Group__2__Impl_in_rule__DoubleLiteral__Group__23711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__Group__2__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Import__Group__0__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_03903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Model__ProgramsAssignment_13934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Program__NameAssignment_13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Program__PathAssignment_33996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FunctionsAssignment_54027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Param__NameAssignment4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DescAssignment_3_14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Function__DocurlAssignment_4_14151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rule__Function__InputAssignment_5_14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rule__Function__OutputAssignment_6_14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Function__OptionBlocksAssignment_7_14244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__DataDefinition__InputAssignment_14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__DataDefinition__TypeAssignment_34306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__DataDefinition__DocAssignment_4_14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatExpression_in_rule__Option__ParamAssignment4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ConcatExpression__RightAssignment_1_24399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DoubleLiteral__ValueAssignment_04492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primary__ParamAssignment_34558 = new BitSet(new long[]{0x0000000000000002L});

}