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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.Import;
import org.remus.cmdline.commandLine.Model;
import org.remus.cmdline.commandLine.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.ModelImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.ModelImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrograms()
   * @generated
   * @ordered
   */
  protected Program programs;

  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected org.remus.cmdline.commandLine.System system;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return CommandLinePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, CommandLinePackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getPrograms()
  {
    return programs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrograms(Program newPrograms, NotificationChain msgs)
  {
    Program oldPrograms = programs;
    programs = newPrograms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.MODEL__PROGRAMS, oldPrograms, newPrograms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrograms(Program newPrograms)
  {
    if (newPrograms != programs)
    {
      NotificationChain msgs = null;
      if (programs != null)
        msgs = ((InternalEObject)programs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.MODEL__PROGRAMS, null, msgs);
      if (newPrograms != null)
        msgs = ((InternalEObject)newPrograms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.MODEL__PROGRAMS, null, msgs);
      msgs = basicSetPrograms(newPrograms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.MODEL__PROGRAMS, newPrograms, newPrograms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.remus.cmdline.commandLine.System getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(org.remus.cmdline.commandLine.System newSystem, NotificationChain msgs)
  {
    org.remus.cmdline.commandLine.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.MODEL__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(org.remus.cmdline.commandLine.System newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.MODEL__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.MODEL__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.MODEL__SYSTEM, newSystem, newSystem));
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
      case CommandLinePackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CommandLinePackage.MODEL__PROGRAMS:
        return basicSetPrograms(null, msgs);
      case CommandLinePackage.MODEL__SYSTEM:
        return basicSetSystem(null, msgs);
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
      case CommandLinePackage.MODEL__IMPORTS:
        return getImports();
      case CommandLinePackage.MODEL__PROGRAMS:
        return getPrograms();
      case CommandLinePackage.MODEL__SYSTEM:
        return getSystem();
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
      case CommandLinePackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case CommandLinePackage.MODEL__PROGRAMS:
        setPrograms((Program)newValue);
        return;
      case CommandLinePackage.MODEL__SYSTEM:
        setSystem((org.remus.cmdline.commandLine.System)newValue);
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
      case CommandLinePackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case CommandLinePackage.MODEL__PROGRAMS:
        setPrograms((Program)null);
        return;
      case CommandLinePackage.MODEL__SYSTEM:
        setSystem((org.remus.cmdline.commandLine.System)null);
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
      case CommandLinePackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CommandLinePackage.MODEL__PROGRAMS:
        return programs != null;
      case CommandLinePackage.MODEL__SYSTEM:
        return system != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
