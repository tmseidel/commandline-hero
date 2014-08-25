/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getPrintOutMode <em>Print Out Mode</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getDocurl <em>Docurl</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getOutput <em>Output</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getOptionBlocks <em>Option Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Print Out Mode</b></em>' attribute.
   * The literals are from the enumeration {@link org.remus.cmdline.commandLine.PrintMode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Out Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Out Mode</em>' attribute.
   * @see org.remus.cmdline.commandLine.PrintMode
   * @see #setPrintOutMode(PrintMode)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_PrintOutMode()
   * @model
   * @generated
   */
  PrintMode getPrintOutMode();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Function#getPrintOutMode <em>Print Out Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print Out Mode</em>' attribute.
   * @see org.remus.cmdline.commandLine.PrintMode
   * @see #getPrintOutMode()
   * @generated
   */
  void setPrintOutMode(PrintMode value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' containment reference.
   * @see #setDesc(StringLiteral)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Desc()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDesc();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Function#getDesc <em>Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' containment reference.
   * @see #getDesc()
   * @generated
   */
  void setDesc(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Docurl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Docurl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Docurl</em>' containment reference.
   * @see #setDocurl(StringLiteral)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Docurl()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDocurl();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Function#getDocurl <em>Docurl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Docurl</em>' containment reference.
   * @see #getDocurl()
   * @generated
   */
  void setDocurl(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.InputDataDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Input()
   * @model containment="true"
   * @generated
   */
  EList<InputDataDefinition> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.OutputDataDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Output()
   * @model containment="true"
   * @generated
   */
  EList<OutputDataDefinition> getOutput();

  /**
   * Returns the value of the '<em><b>Option Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option Blocks</em>' containment reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_OptionBlocks()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptionBlocks();

} // Function
