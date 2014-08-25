/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.remus.cmdline.commandLine.CommandLinePackage
 * @generated
 */
public interface CommandLineFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommandLineFactory eINSTANCE = org.remus.cmdline.commandLine.impl.CommandLineFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Input Data Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Data Definition</em>'.
   * @generated
   */
  InputDataDefinition createInputDataDefinition();

  /**
   * Returns a new object of class '<em>Output Data Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Data Definition</em>'.
   * @generated
   */
  OutputDataDefinition createOutputDataDefinition();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Literal</em>'.
   * @generated
   */
  DoubleLiteral createDoubleLiteral();

  /**
   * Returns a new object of class '<em>Concatenation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concatenation</em>'.
   * @generated
   */
  Concatenation createConcatenation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CommandLinePackage getCommandLinePackage();

} //CommandLineFactory
