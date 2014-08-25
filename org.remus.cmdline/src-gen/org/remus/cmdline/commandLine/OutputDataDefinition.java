/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.OutputDataDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.OutputDataDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.OutputDataDefinition#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getOutputDataDefinition()
 * @model
 * @generated
 */
public interface OutputDataDefinition extends EObject
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
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getOutputDataDefinition_Input()
   * @model containment="true"
   * @generated
   */
  Param getInput();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Param value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.remus.cmdline.commandLine.OutputDataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.OutputDataType
   * @see #setType(OutputDataType)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getOutputDataDefinition_Type()
   * @model
   * @generated
   */
  OutputDataType getType();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.OutputDataType
   * @see #getType()
   * @generated
   */
  void setType(OutputDataType value);

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
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getOutputDataDefinition_Doc()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDoc();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.OutputDataDefinition#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(StringLiteral value);

} // OutputDataDefinition
