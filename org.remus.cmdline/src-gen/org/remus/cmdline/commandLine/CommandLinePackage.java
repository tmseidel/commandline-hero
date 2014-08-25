/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.remus.cmdline.commandLine.CommandLineFactory
 * @model kind="package"
 * @generated
 */
public interface CommandLinePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "commandLine";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.remus-software.org/cmdline/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "commandLine";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommandLinePackage eINSTANCE = org.remus.cmdline.commandLine.impl.CommandLinePackageImpl.init();

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ModelImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Programs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAMS = 0;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEM = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.SystemImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__PORT = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__VERSION = 2;

  /**
   * The feature id for the '<em><b>Program</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__PROGRAM = 3;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ProgramImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PATH = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTIONS = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ParamImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getParam()
   * @generated
   */
  int PARAM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.FunctionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Print Out Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PRINT_OUT_MODE = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DESC = 2;

  /**
   * The feature id for the '<em><b>Docurl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DOCURL = 3;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__INPUT = 4;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OUTPUT = 5;

  /**
   * The feature id for the '<em><b>Option Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OPTION_BLOCKS = 6;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.InputDataDefinitionImpl <em>Input Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.InputDataDefinitionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getInputDataDefinition()
   * @generated
   */
  int INPUT_DATA_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DATA_DEFINITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DATA_DEFINITION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DATA_DEFINITION__DOC = 2;

  /**
   * The number of structural features of the '<em>Input Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DATA_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.OutputDataDefinitionImpl <em>Output Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.OutputDataDefinitionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOutputDataDefinition()
   * @generated
   */
  int OUTPUT_DATA_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DATA_DEFINITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DATA_DEFINITION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DATA_DEFINITION__DOC = 2;

  /**
   * The number of structural features of the '<em>Output Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DATA_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.OptionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOption()
   * @generated
   */
  int OPTION = 7;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__PARAM = 0;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ExpressionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PARAM = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.StringLiteralImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__PARAM = EXPRESSION__PARAM;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.IntegerLiteralImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__PARAM = EXPRESSION__PARAM;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.DoubleLiteralImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__PARAM = EXPRESSION__PARAM;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ConcatenationImpl <em>Concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ConcatenationImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getConcatenation()
   * @generated
   */
  int CONCATENATION = 12;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__PARAM = EXPRESSION__PARAM;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concatenation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.PrintMode <em>Print Mode</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.PrintMode
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getPrintMode()
   * @generated
   */
  int PRINT_MODE = 13;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.InputDataType <em>Input Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.InputDataType
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getInputDataType()
   * @generated
   */
  int INPUT_DATA_TYPE = 14;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.OutputDataType <em>Output Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.OutputDataType
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOutputDataType()
   * @generated
   */
  int OUTPUT_DATA_TYPE = 15;


  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.remus.cmdline.commandLine.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Model#getPrograms <em>Programs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Programs</em>'.
   * @see org.remus.cmdline.commandLine.Model#getPrograms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Programs();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Model#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.remus.cmdline.commandLine.Model#getSystem()
   * @see #getModel()
   * @generated
   */
  EReference getModel_System();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.remus.cmdline.commandLine.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.remus.cmdline.commandLine.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.System#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see org.remus.cmdline.commandLine.System#getPort()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Port();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.System#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see org.remus.cmdline.commandLine.System#getVersion()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Version();

  /**
   * Returns the meta object for the reference list '{@link org.remus.cmdline.commandLine.System#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Program</em>'.
   * @see org.remus.cmdline.commandLine.System#getProgram()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Program();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.remus.cmdline.commandLine.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.remus.cmdline.commandLine.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Program#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.remus.cmdline.commandLine.Program#getPath()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Path();

  /**
   * Returns the meta object for the containment reference list '{@link org.remus.cmdline.commandLine.Program#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.remus.cmdline.commandLine.Program#getFunctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Functions();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.remus.cmdline.commandLine.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.remus.cmdline.commandLine.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.remus.cmdline.commandLine.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.remus.cmdline.commandLine.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.Function#getPrintOutMode <em>Print Out Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Print Out Mode</em>'.
   * @see org.remus.cmdline.commandLine.Function#getPrintOutMode()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_PrintOutMode();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Function#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desc</em>'.
   * @see org.remus.cmdline.commandLine.Function#getDesc()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Desc();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Function#getDocurl <em>Docurl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Docurl</em>'.
   * @see org.remus.cmdline.commandLine.Function#getDocurl()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Docurl();

  /**
   * Returns the meta object for the containment reference list '{@link org.remus.cmdline.commandLine.Function#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see org.remus.cmdline.commandLine.Function#getInput()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Input();

  /**
   * Returns the meta object for the containment reference list '{@link org.remus.cmdline.commandLine.Function#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output</em>'.
   * @see org.remus.cmdline.commandLine.Function#getOutput()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Output();

  /**
   * Returns the meta object for the containment reference list '{@link org.remus.cmdline.commandLine.Function#getOptionBlocks <em>Option Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Option Blocks</em>'.
   * @see org.remus.cmdline.commandLine.Function#getOptionBlocks()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_OptionBlocks();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.InputDataDefinition <em>Input Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Data Definition</em>'.
   * @see org.remus.cmdline.commandLine.InputDataDefinition
   * @generated
   */
  EClass getInputDataDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.InputDataDefinition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.remus.cmdline.commandLine.InputDataDefinition#getInput()
   * @see #getInputDataDefinition()
   * @generated
   */
  EReference getInputDataDefinition_Input();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.InputDataDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.remus.cmdline.commandLine.InputDataDefinition#getType()
   * @see #getInputDataDefinition()
   * @generated
   */
  EAttribute getInputDataDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.InputDataDefinition#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see org.remus.cmdline.commandLine.InputDataDefinition#getDoc()
   * @see #getInputDataDefinition()
   * @generated
   */
  EReference getInputDataDefinition_Doc();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.OutputDataDefinition <em>Output Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Data Definition</em>'.
   * @see org.remus.cmdline.commandLine.OutputDataDefinition
   * @generated
   */
  EClass getOutputDataDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.remus.cmdline.commandLine.OutputDataDefinition#getInput()
   * @see #getOutputDataDefinition()
   * @generated
   */
  EReference getOutputDataDefinition_Input();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.remus.cmdline.commandLine.OutputDataDefinition#getType()
   * @see #getOutputDataDefinition()
   * @generated
   */
  EAttribute getOutputDataDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see org.remus.cmdline.commandLine.OutputDataDefinition#getDoc()
   * @see #getOutputDataDefinition()
   * @generated
   */
  EReference getOutputDataDefinition_Doc();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see org.remus.cmdline.commandLine.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Option#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see org.remus.cmdline.commandLine.Option#getParam()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Param();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.remus.cmdline.commandLine.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the reference '{@link org.remus.cmdline.commandLine.Expression#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see org.remus.cmdline.commandLine.Expression#getParam()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Param();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.remus.cmdline.commandLine.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.remus.cmdline.commandLine.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.remus.cmdline.commandLine.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.remus.cmdline.commandLine.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see org.remus.cmdline.commandLine.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.DoubleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.remus.cmdline.commandLine.DoubleLiteral#getValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Concatenation <em>Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concatenation</em>'.
   * @see org.remus.cmdline.commandLine.Concatenation
   * @generated
   */
  EClass getConcatenation();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Concatenation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.remus.cmdline.commandLine.Concatenation#getLeft()
   * @see #getConcatenation()
   * @generated
   */
  EReference getConcatenation_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.Concatenation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.remus.cmdline.commandLine.Concatenation#getRight()
   * @see #getConcatenation()
   * @generated
   */
  EReference getConcatenation_Right();

  /**
   * Returns the meta object for enum '{@link org.remus.cmdline.commandLine.PrintMode <em>Print Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Print Mode</em>'.
   * @see org.remus.cmdline.commandLine.PrintMode
   * @generated
   */
  EEnum getPrintMode();

  /**
   * Returns the meta object for enum '{@link org.remus.cmdline.commandLine.InputDataType <em>Input Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Input Data Type</em>'.
   * @see org.remus.cmdline.commandLine.InputDataType
   * @generated
   */
  EEnum getInputDataType();

  /**
   * Returns the meta object for enum '{@link org.remus.cmdline.commandLine.OutputDataType <em>Output Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Output Data Type</em>'.
   * @see org.remus.cmdline.commandLine.OutputDataType
   * @generated
   */
  EEnum getOutputDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommandLineFactory getCommandLineFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ModelImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Programs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAMS = eINSTANCE.getModel_Programs();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEM = eINSTANCE.getModel_System();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.SystemImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__PORT = eINSTANCE.getSystem_Port();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__VERSION = eINSTANCE.getSystem_Version();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__PROGRAM = eINSTANCE.getSystem_Program();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ProgramImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PATH = eINSTANCE.getProgram_Path();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ParamImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.FunctionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Print Out Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__PRINT_OUT_MODE = eINSTANCE.getFunction_PrintOutMode();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DESC = eINSTANCE.getFunction_Desc();

    /**
     * The meta object literal for the '<em><b>Docurl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DOCURL = eINSTANCE.getFunction_Docurl();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__INPUT = eINSTANCE.getFunction_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__OUTPUT = eINSTANCE.getFunction_Output();

    /**
     * The meta object literal for the '<em><b>Option Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__OPTION_BLOCKS = eINSTANCE.getFunction_OptionBlocks();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.InputDataDefinitionImpl <em>Input Data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.InputDataDefinitionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getInputDataDefinition()
     * @generated
     */
    EClass INPUT_DATA_DEFINITION = eINSTANCE.getInputDataDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DATA_DEFINITION__INPUT = eINSTANCE.getInputDataDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DATA_DEFINITION__TYPE = eINSTANCE.getInputDataDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DATA_DEFINITION__DOC = eINSTANCE.getInputDataDefinition_Doc();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.OutputDataDefinitionImpl <em>Output Data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.OutputDataDefinitionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOutputDataDefinition()
     * @generated
     */
    EClass OUTPUT_DATA_DEFINITION = eINSTANCE.getOutputDataDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DATA_DEFINITION__INPUT = eINSTANCE.getOutputDataDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_DATA_DEFINITION__TYPE = eINSTANCE.getOutputDataDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DATA_DEFINITION__DOC = eINSTANCE.getOutputDataDefinition_Doc();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.OptionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__PARAM = eINSTANCE.getOption_Param();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ExpressionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PARAM = eINSTANCE.getExpression_Param();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.StringLiteralImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.IntegerLiteralImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.DoubleLiteralImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ConcatenationImpl <em>Concatenation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ConcatenationImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getConcatenation()
     * @generated
     */
    EClass CONCATENATION = eINSTANCE.getConcatenation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__LEFT = eINSTANCE.getConcatenation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__RIGHT = eINSTANCE.getConcatenation_Right();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.PrintMode <em>Print Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.PrintMode
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getPrintMode()
     * @generated
     */
    EEnum PRINT_MODE = eINSTANCE.getPrintMode();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.InputDataType <em>Input Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.InputDataType
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getInputDataType()
     * @generated
     */
    EEnum INPUT_DATA_TYPE = eINSTANCE.getInputDataType();

    /**
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.OutputDataType <em>Output Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.OutputDataType
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOutputDataType()
     * @generated
     */
    EEnum OUTPUT_DATA_TYPE = eINSTANCE.getOutputDataType();

  }

} //CommandLinePackage
