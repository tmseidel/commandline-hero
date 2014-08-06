/**
 */
package org.remus.cmdline.commandLine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.Expression;
import org.remus.cmdline.commandLine.Param;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.impl.ExpressionImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected Param param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return CommandLinePackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (Param)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandLinePackage.EXPRESSION__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Param newParam)
  {
    Param oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.EXPRESSION__PARAM, oldParam, param));
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
      case CommandLinePackage.EXPRESSION__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CommandLinePackage.EXPRESSION__PARAM:
        setParam((Param)newValue);
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
      case CommandLinePackage.EXPRESSION__PARAM:
        setParam((Param)null);
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
      case CommandLinePackage.EXPRESSION__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
