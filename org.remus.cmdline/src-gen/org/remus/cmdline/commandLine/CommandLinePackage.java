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
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Programs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAMS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ProgramImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

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
  int PARAM = 2;

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
  int FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DESC = 1;

  /**
   * The feature id for the '<em><b>Docurl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DOCURL = 2;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__INPUT = 3;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OUTPUT = 4;

  /**
   * The feature id for the '<em><b>Option Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OPTION_BLOCKS = 5;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.DataDefinitionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDataDefinition()
   * @generated
   */
  int DATA_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__DOC = 2;

  /**
   * The number of structural features of the '<em>Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.OptionImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getOption()
   * @generated
   */
  int OPTION = 5;

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
  int EXPRESSION = 6;

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
  int STRING_LITERAL = 7;

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
  int INTEGER_LITERAL = 8;

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
  int DOUBLE_LITERAL = 9;

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
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ImportImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 10;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.remus.cmdline.commandLine.impl.ConcatenationImpl <em>Concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.impl.ConcatenationImpl
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getConcatenation()
   * @generated
   */
  int CONCATENATION = 11;

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
   * The meta object id for the '{@link org.remus.cmdline.commandLine.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.remus.cmdline.commandLine.DataType
   * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 12;


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
   * Returns the meta object for the containment reference list '{@link org.remus.cmdline.commandLine.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.remus.cmdline.commandLine.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

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
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.DataDefinition <em>Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition</em>'.
   * @see org.remus.cmdline.commandLine.DataDefinition
   * @generated
   */
  EClass getDataDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.DataDefinition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.remus.cmdline.commandLine.DataDefinition#getInput()
   * @see #getDataDefinition()
   * @generated
   */
  EReference getDataDefinition_Input();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.DataDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.remus.cmdline.commandLine.DataDefinition#getType()
   * @see #getDataDefinition()
   * @generated
   */
  EAttribute getDataDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.remus.cmdline.commandLine.DataDefinition#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see org.remus.cmdline.commandLine.DataDefinition#getDoc()
   * @see #getDataDefinition()
   * @generated
   */
  EReference getDataDefinition_Doc();

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
   * Returns the meta object for class '{@link org.remus.cmdline.commandLine.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.remus.cmdline.commandLine.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.remus.cmdline.commandLine.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.remus.cmdline.commandLine.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

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
   * Returns the meta object for enum '{@link org.remus.cmdline.commandLine.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see org.remus.cmdline.commandLine.DataType
   * @generated
   */
  EEnum getDataType();

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
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Programs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAMS = eINSTANCE.getModel_Programs();

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
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.DataDefinitionImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDataDefinition()
     * @generated
     */
    EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__INPUT = eINSTANCE.getDataDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_DEFINITION__TYPE = eINSTANCE.getDataDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__DOC = eINSTANCE.getDataDefinition_Doc();

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
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.impl.ImportImpl
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

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
     * The meta object literal for the '{@link org.remus.cmdline.commandLine.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.remus.cmdline.commandLine.DataType
     * @see org.remus.cmdline.commandLine.impl.CommandLinePackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //CommandLinePackage
