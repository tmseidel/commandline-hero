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
 *   <li>{@link org.remus.cmdline.commandLine.Function#getParams <em>Params</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Function#getDoc <em>Doc</em>}</li>
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
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' containment reference.
   * @see #setDoc(StringLiteral)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getFunction_Doc()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDoc();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Function#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(StringLiteral value);

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
   * The list contents are of type {@link org.remus.cmdline.commandLine.DataDefinition}.
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
  EList<DataDefinition> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.DataDefinition}.
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
  EList<DataDefinition> getOutput();

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
