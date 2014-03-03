/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.DataDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.DataDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getDataDefinition()
 * @model
 * @generated
 */
public interface DataDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(Param)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getDataDefinition_Input()
   * @model
   * @generated
   */
  Param getInput();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.DataDefinition#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Param value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.remus.cmdline.commandLine.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.DataType
   * @see #setType(DataType)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getDataDefinition_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.DataDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.remus.cmdline.commandLine.DataType
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

} // DataDefinition
