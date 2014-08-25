/**
 */
package org.remus.cmdline.commandLine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.System#getName <em>Name</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.System#getPort <em>Port</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.System#getVersion <em>Version</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.System#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
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
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(IntegerLiteral)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getSystem_Port()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getPort();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.System#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(StringLiteral)
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getSystem_Version()
   * @model containment="true"
   * @generated
   */
  StringLiteral getVersion();

  /**
   * Sets the value of the '{@link org.remus.cmdline.commandLine.System#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Program</b></em>' reference list.
   * The list contents are of type {@link org.remus.cmdline.commandLine.Program}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' reference list.
   * @see org.remus.cmdline.commandLine.CommandLinePackage#getSystem_Program()
   * @model
   * @generated
   */
  EList<Program> getProgram();

} // System
