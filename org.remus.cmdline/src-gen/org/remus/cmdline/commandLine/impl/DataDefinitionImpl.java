/**
 */
package org.remus.cmdline.commandLine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.remus.cmdline.commandLine.CommandLinePackage;
import org.remus.cmdline.commandLine.DataDefinition;
import org.remus.cmdline.commandLine.DataType;
import org.remus.cmdline.commandLine.Param;
import org.remus.cmdline.commandLine.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.impl.DataDefinitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.DataDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.DataDefinitionImpl#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataDefinitionImpl extends MinimalEObjectImpl.Container implements DataDefinition
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Param input;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DataType TYPE_EDEFAULT = DataType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected StringLiteral doc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataDefinitionImpl()
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
    return CommandLinePackage.Literals.DATA_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Param newInput, NotificationChain msgs)
  {
    Param oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.DATA_DEFINITION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Param newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.DATA_DEFINITION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.DATA_DEFINITION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.DATA_DEFINITION__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.DATA_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoc(StringLiteral newDoc, NotificationChain msgs)
  {
    StringLiteral oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.DATA_DEFINITION__DOC, oldDoc, newDoc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(StringLiteral newDoc)
  {
    if (newDoc != doc)
    {
      NotificationChain msgs = null;
      if (doc != null)
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.DATA_DEFINITION__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.DATA_DEFINITION__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.DATA_DEFINITION__DOC, newDoc, newDoc));
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
      case CommandLinePackage.DATA_DEFINITION__INPUT:
        return basicSetInput(null, msgs);
      case CommandLinePackage.DATA_DEFINITION__DOC:
        return basicSetDoc(null, msgs);
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
      case CommandLinePackage.DATA_DEFINITION__INPUT:
        return getInput();
      case CommandLinePackage.DATA_DEFINITION__TYPE:
        return getType();
      case CommandLinePackage.DATA_DEFINITION__DOC:
        return getDoc();
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
      case CommandLinePackage.DATA_DEFINITION__INPUT:
        setInput((Param)newValue);
        return;
      case CommandLinePackage.DATA_DEFINITION__TYPE:
        setType((DataType)newValue);
        return;
      case CommandLinePackage.DATA_DEFINITION__DOC:
        setDoc((StringLiteral)newValue);
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
      case CommandLinePackage.DATA_DEFINITION__INPUT:
        setInput((Param)null);
        return;
      case CommandLinePackage.DATA_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CommandLinePackage.DATA_DEFINITION__DOC:
        setDoc((StringLiteral)null);
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
      case CommandLinePackage.DATA_DEFINITION__INPUT:
        return input != null;
      case CommandLinePackage.DATA_DEFINITION__TYPE:
        return type != TYPE_EDEFAULT;
      case CommandLinePackage.DATA_DEFINITION__DOC:
        return doc != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DataDefinitionImpl
