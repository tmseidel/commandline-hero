/**
 */
package org.remus.cmdline.commandLine.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.remus.cmdline.commandLine.CommandLineFactory;
import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.Concatenation;
import org.remus.cmdline.commandLine.DoubleLiteral;
import org.remus.cmdline.commandLine.Expression;
import org.remus.cmdline.commandLine.Function;
import org.remus.cmdline.commandLine.InputDataDefinition;
import org.remus.cmdline.commandLine.InputDataType;
import org.remus.cmdline.commandLine.IntegerLiteral;
import org.remus.cmdline.commandLine.Model;
import org.remus.cmdline.commandLine.Option;
import org.remus.cmdline.commandLine.OutputDataDefinition;
import org.remus.cmdline.commandLine.OutputDataType;
import org.remus.cmdline.commandLine.Param;
import org.remus.cmdline.commandLine.PrintMode;
import org.remus.cmdline.commandLine.Program;
import org.remus.cmdline.commandLine.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandLineFactoryImpl extends EFactoryImpl implements CommandLineFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommandLineFactory init()
  {
    try
    {
      CommandLineFactory theCommandLineFactory = (CommandLineFactory)EPackage.Registry.INSTANCE.getEFactory(CommandLinePackage.eNS_URI);
      if (theCommandLineFactory != null)
      {
        return theCommandLineFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CommandLineFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandLineFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CommandLinePackage.MODEL: return createModel();
      case CommandLinePackage.SYSTEM: return createSystem();
      case CommandLinePackage.PROGRAM: return createProgram();
      case CommandLinePackage.PARAM: return createParam();
      case CommandLinePackage.FUNCTION: return createFunction();
      case CommandLinePackage.INPUT_DATA_DEFINITION: return createInputDataDefinition();
      case CommandLinePackage.OUTPUT_DATA_DEFINITION: return createOutputDataDefinition();
      case CommandLinePackage.OPTION: return createOption();
      case CommandLinePackage.EXPRESSION: return createExpression();
      case CommandLinePackage.STRING_LITERAL: return createStringLiteral();
      case CommandLinePackage.INTEGER_LITERAL: return createIntegerLiteral();
      case CommandLinePackage.DOUBLE_LITERAL: return createDoubleLiteral();
      case CommandLinePackage.CONCATENATION: return createConcatenation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CommandLinePackage.PRINT_MODE:
        return createPrintModeFromString(eDataType, initialValue);
      case CommandLinePackage.INPUT_DATA_TYPE:
        return createInputDataTypeFromString(eDataType, initialValue);
      case CommandLinePackage.OUTPUT_DATA_TYPE:
        return createOutputDataTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CommandLinePackage.PRINT_MODE:
        return convertPrintModeToString(eDataType, instanceValue);
      case CommandLinePackage.INPUT_DATA_TYPE:
        return convertInputDataTypeToString(eDataType, instanceValue);
      case CommandLinePackage.OUTPUT_DATA_TYPE:
        return convertOutputDataTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.remus.cmdline.commandLine.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDataDefinition createInputDataDefinition()
  {
    InputDataDefinitionImpl inputDataDefinition = new InputDataDefinitionImpl();
    return inputDataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDataDefinition createOutputDataDefinition()
  {
    OutputDataDefinitionImpl outputDataDefinition = new OutputDataDefinitionImpl();
    return outputDataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concatenation createConcatenation()
  {
    ConcatenationImpl concatenation = new ConcatenationImpl();
    return concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintMode createPrintModeFromString(EDataType eDataType, String initialValue)
  {
    PrintMode result = PrintMode.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrintModeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDataType createInputDataTypeFromString(EDataType eDataType, String initialValue)
  {
    InputDataType result = InputDataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInputDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDataType createOutputDataTypeFromString(EDataType eDataType, String initialValue)
  {
    OutputDataType result = OutputDataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOutputDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandLinePackage getCommandLinePackage()
  {
    return (CommandLinePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CommandLinePackage getPackage()
  {
    return CommandLinePackage.eINSTANCE;
  }

} //CommandLineFactoryImpl
