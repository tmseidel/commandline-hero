/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.Program#getName <em>Name</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Program#getPath <em>Path</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.Program#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Expression)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getProgram_Path()
   * @model containment="true"
   * @generated
   */
  Expression getPath();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.Program#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Expression value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getProgram_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Program
