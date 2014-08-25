/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.InputDataDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.InputDataDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.InputDataDefinition#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getInputDataDefinition()
 * @model
 * @generated
 */
public interface InputDataDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Param)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getInputDataDefinition_Input()
   * @model containment="true"
   * @generated
   */
  Param getInput();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.InputDataDefinition#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Param value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.remus.cmdline.commandLine.InputDataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.InputDataType
   * @see #setType(InputDataType)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getInputDataDefinition_Type()
   * @model
   * @generated
   */
  InputDataType getType();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.InputDataDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.InputDataType
   * @see #getType()
   * @generated
   */
  void setType(InputDataType value);

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
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getInputDataDefinition_Doc()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDoc();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.InputDataDefinition#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(StringLiteral value);

} // InputDataDefinition
