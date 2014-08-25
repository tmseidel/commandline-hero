/**
 */
package org.remus.cmdline.commandLine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.IntegerLiteral;
import org.remus.cmdline.commandLine.Program;
import org.remus.cmdline.commandLine.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.SystemImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.SystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.SystemImpl#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.remus.cmdline.commandLine.System
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected IntegerLiteral port;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected StringLiteral version;

  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected EList<Program> program;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CommandLinePackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(IntegerLiteral newPort, NotificationChain msgs)
  {
    IntegerLiteral oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.SYSTEM__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(IntegerLiteral newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.SYSTEM__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.SYSTEM__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.SYSTEM__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(StringLiteral newVersion, NotificationChain msgs)
  {
    StringLiteral oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.SYSTEM__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(StringLiteral newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.SYSTEM__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.SYSTEM__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.SYSTEM__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Program> getProgram()
  {
    if (program == null)
    {
      program = new EObjectResolvingEList<Program>(Program.class, this, CommandLinePackage.SYSTEM__PROGRAM);
    }
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CommandLinePackage.SYSTEM__PORT:
        return basicSetPort(null, msgs);
      case CommandLinePackage.SYSTEM__VERSION:
        return basicSetVersion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CommandLinePackage.SYSTEM__NAME:
        return getName();
      case CommandLinePackage.SYSTEM__PORT:
        return getPort();
      case CommandLinePackage.SYSTEM__VERSION:
        return getVersion();
      case CommandLinePackage.SYSTEM__PROGRAM:
        return getProgram();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CommandLinePackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case CommandLinePackage.SYSTEM__PORT:
        setPort((IntegerLiteral)newValue);
        return;
      case CommandLinePackage.SYSTEM__VERSION:
        setVersion((StringLiteral)newValue);
        return;
      case CommandLinePackage.SYSTEM__PROGRAM:
        getProgram().clear();
        getProgram().addAll((Collection<? extends Program>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CommandLinePackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CommandLinePackage.SYSTEM__PORT:
        setPort((IntegerLiteral)null);
        return;
      case CommandLinePackage.SYSTEM__VERSION:
        setVersion((StringLiteral)null);
        return;
      case CommandLinePackage.SYSTEM__PROGRAM:
        getProgram().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CommandLinePackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CommandLinePackage.SYSTEM__PORT:
        return port != null;
      case CommandLinePackage.SYSTEM__VERSION:
        return version != null;
      case CommandLinePackage.SYSTEM__PROGRAM:
        return program != null && !program.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
