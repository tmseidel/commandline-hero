package org.remus.cmdline.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.Concatenation;
import org.remus.cmdline.commandLine.DataDefinition;
import org.remus.cmdline.commandLine.DoubleLiteral;
import org.remus.cmdline.commandLine.Expression;
import org.remus.cmdline.commandLine.Function;
import org.remus.cmdline.commandLine.Import;
import org.remus.cmdline.commandLine.IntegerLiteral;
import org.remus.cmdline.commandLine.Model;
import org.remus.cmdline.commandLine.Option;
import org.remus.cmdline.commandLine.Param;
import org.remus.cmdline.commandLine.Program;
import org.remus.cmdline.commandLine.StringLiteral;
import org.remus.cmdline.services.CommandLineGrammarAccess;

@SuppressWarnings("all")
public class CommandLineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CommandLineGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommandLinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommandLinePackage.CONCATENATION:
				if(context == grammarAccess.getConcatExpressionRule() ||
				   context == grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0()) {
					sequence_ConcatExpression(context, (Concatenation) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.DATA_DEFINITION:
				if(context == grammarAccess.getDataDefinitionRule()) {
					sequence_DataDefinition(context, (DataDefinition) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.DOUBLE_LITERAL:
				if(context == grammarAccess.getConcatExpressionRule() ||
				   context == grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getDoubleLiteralRule() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.EXPRESSION:
				if(context == grammarAccess.getConcatExpressionRule() ||
				   context == grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.INTEGER_LITERAL:
				if(context == grammarAccess.getConcatExpressionRule() ||
				   context == grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getIntegerLiteralRule() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.STRING_LITERAL:
				if(context == grammarAccess.getConcatExpressionRule() ||
				   context == grammarAccess.getConcatExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case CommandLinePackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (org.remus.cmdline.commandLine.System) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=ConcatExpression_Concatenation_1_0 right=Primary)
	 */
	protected void sequence_ConcatExpression(EObject context, Concatenation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (input=Param type=DataType doc=StringLiteral?)
	 */
	protected void sequence_DataDefinition(EObject context, DataDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_DoubleLiteral(EObject context, DoubleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         desc=StringLiteral? 
	 *         docurl=StringLiteral? 
	 *         input+=DataDefinition* 
	 *         output+=DataDefinition+ 
	 *         optionBlocks+=Option*
	 *     )
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandLinePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandLinePackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerLiteral(EObject context, IntegerLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* programs=Program? system=System?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     param=ConcatExpression
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandLinePackage.Literals.OPTION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandLinePackage.Literals.OPTION__PARAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionAccess().getParamConcatExpressionParserRuleCall_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandLinePackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandLinePackage.Literals.PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameValidIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     param=[Param|ID]
	 */
	protected void sequence_Primary(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandLinePackage.Literals.EXPRESSION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandLinePackage.Literals.EXPRESSION__PARAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getParamParamIDTerminalRuleCall_3_0_1(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID path=ConcatExpression functions+=Function*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName port=IntegerLiteral? version=StringLiteral? program+=[Program|ID]*)
	 */
	protected void sequence_System(EObject context, org.remus.cmdline.commandLine.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
