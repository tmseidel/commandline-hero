/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.Option#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(Expression)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getOption_Param()
   * @model containment="true"
   * @generated
   */
  Expression getParam();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Option#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Expression value);

} // Option
