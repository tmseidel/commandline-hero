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
import org.remus.cmdline.commandLine.DataDefinition;
import org.remus.cmdline.commandLine.Function;
import org.remus.cmdline.commandLine.Option;
import org.remus.cmdline.commandLine.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getDocurl <em>Docurl</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.remus.cmdline.commandLine.impl.FunctionImpl#getOptionBlocks <em>Option Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
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
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected StringLiteral desc;

  /**
   * The cached value of the '{@link #getDocurl() <em>Docurl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocurl()
   * @generated
   * @ordered
   */
  protected StringLiteral docurl;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected EList<DataDefinition> input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected EList<DataDefinition> output;

  /**
   * The cached value of the '{@link #getOptionBlocks() <em>Option Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionBlocks()
   * @generated
   * @ordered
   */
  protected EList<Option> optionBlocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return CommandLinePackage.Literals.FUNCTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesc(StringLiteral newDesc, NotificationChain msgs)
  {
    StringLiteral oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.FUNCTION__DESC, oldDesc, newDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(StringLiteral newDesc)
  {
    if (newDesc != desc)
    {
      NotificationChain msgs = null;
      if (desc != null)
        msgs = ((InternalEObject)desc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.FUNCTION__DESC, null, msgs);
      if (newDesc != null)
        msgs = ((InternalEObject)newDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.FUNCTION__DESC, null, msgs);
      msgs = basicSetDesc(newDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.FUNCTION__DESC, newDesc, newDesc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral getDocurl()
  {
    return docurl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDocurl(StringLiteral newDocurl, NotificationChain msgs)
  {
    StringLiteral oldDocurl = docurl;
    docurl = newDocurl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandLinePackage.FUNCTION__DOCURL, oldDocurl, newDocurl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocurl(StringLiteral newDocurl)
  {
    if (newDocurl != docurl)
    {
      NotificationChain msgs = null;
      if (docurl != null)
        msgs = ((InternalEObject)docurl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.FUNCTION__DOCURL, null, msgs);
      if (newDocurl != null)
        msgs = ((InternalEObject)newDocurl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandLinePackage.FUNCTION__DOCURL, null, msgs);
      msgs = basicSetDocurl(newDocurl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandLinePackage.FUNCTION__DOCURL, newDocurl, newDocurl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataDefinition> getInput()
  {
    if (input == null)
    {
      input = new EObjectContainmentEList<DataDefinition>(DataDefinition.class, this, CommandLinePackage.FUNCTION__INPUT);
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataDefinition> getOutput()
  {
    if (output == null)
    {
      output = new EObjectContainmentEList<DataDefinition>(DataDefinition.class, this, CommandLinePackage.FUNCTION__OUTPUT);
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptionBlocks()
  {
    if (optionBlocks == null)
    {
      optionBlocks = new EObjectContainmentEList<Option>(Option.class, this, CommandLinePackage.FUNCTION__OPTION_BLOCKS);
    }
    return optionBlocks;
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
      case CommandLinePackage.FUNCTION__DESC:
        return basicSetDesc(null, msgs);
      case CommandLinePackage.FUNCTION__DOCURL:
        return basicSetDocurl(null, msgs);
      case CommandLinePackage.FUNCTION__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case CommandLinePackage.FUNCTION__OUTPUT:
        return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
      case CommandLinePackage.FUNCTION__OPTION_BLOCKS:
        return ((InternalEList<?>)getOptionBlocks()).basicRemove(otherEnd, msgs);
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
      case CommandLinePackage.FUNCTION__NAME:
        return getName();
      case CommandLinePackage.FUNCTION__DESC:
        return getDesc();
      case CommandLinePackage.FUNCTION__DOCURL:
        return getDocurl();
      case CommandLinePackage.FUNCTION__INPUT:
        return getInput();
      case CommandLinePackage.FUNCTION__OUTPUT:
        return getOutput();
      case CommandLinePackage.FUNCTION__OPTION_BLOCKS:
        return getOptionBlocks();
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
      case CommandLinePackage.FUNCTION__NAME:
        setName((String)newValue);
        return;
      case CommandLinePackage.FUNCTION__DESC:
        setDesc((StringLiteral)newValue);
        return;
      case CommandLinePackage.FUNCTION__DOCURL:
        setDocurl((StringLiteral)newValue);
        return;
      case CommandLinePackage.FUNCTION__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends DataDefinition>)newValue);
        return;
      case CommandLinePackage.FUNCTION__OUTPUT:
        getOutput().clear();
        getOutput().addAll((Collection<? extends DataDefinition>)newValue);
        return;
      case CommandLinePackage.FUNCTION__OPTION_BLOCKS:
        getOptionBlocks().clear();
        getOptionBlocks().addAll((Collection<? extends Option>)newValue);
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
      case CommandLinePackage.FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CommandLinePackage.FUNCTION__DESC:
        setDesc((StringLiteral)null);
        return;
      case CommandLinePackage.FUNCTION__DOCURL:
        setDocurl((StringLiteral)null);
        return;
      case CommandLinePackage.FUNCTION__INPUT:
        getInput().clear();
        return;
      case CommandLinePackage.FUNCTION__OUTPUT:
        getOutput().clear();
        return;
      case CommandLinePackage.FUNCTION__OPTION_BLOCKS:
        getOptionBlocks().clear();
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
      case CommandLinePackage.FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CommandLinePackage.FUNCTION__DESC:
        return desc != null;
      case CommandLinePackage.FUNCTION__DOCURL:
        return docurl != null;
      case CommandLinePackage.FUNCTION__INPUT:
        return input != null && !input.isEmpty();
      case CommandLinePackage.FUNCTION__OUTPUT:
        return output != null && !output.isEmpty();
      case CommandLinePackage.FUNCTION__OPTION_BLOCKS:
        return optionBlocks != null && !optionBlocks.isEmpty();
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

} //FunctionImpl
