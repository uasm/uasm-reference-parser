/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uasm.term.lang.termDsl.NumberLiteral;
import org.uasm.term.lang.termDsl.TermDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.NumberLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.NumberLiteralImpl#getValueDec <em>Value Dec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberLiteralImpl extends LiteralImpl implements NumberLiteral
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getValueDec() <em>Value Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDec()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VALUE_DEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueDec() <em>Value Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDec()
   * @generated
   * @ordered
   */
  protected BigDecimal valueDec = VALUE_DEC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberLiteralImpl()
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
    return TermDslPackage.Literals.NUMBER_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_LITERAL__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getValueDec()
  {
    return valueDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDec(BigDecimal newValueDec)
  {
    BigDecimal oldValueDec = valueDec;
    valueDec = newValueDec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_LITERAL__VALUE_DEC, oldValueDec, valueDec));
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
      case TermDslPackage.NUMBER_LITERAL__VALUE:
        return getValue();
      case TermDslPackage.NUMBER_LITERAL__VALUE_DEC:
        return getValueDec();
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
      case TermDslPackage.NUMBER_LITERAL__VALUE:
        setValue((Integer)newValue);
        return;
      case TermDslPackage.NUMBER_LITERAL__VALUE_DEC:
        setValueDec((BigDecimal)newValue);
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
      case TermDslPackage.NUMBER_LITERAL__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case TermDslPackage.NUMBER_LITERAL__VALUE_DEC:
        setValueDec(VALUE_DEC_EDEFAULT);
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
      case TermDslPackage.NUMBER_LITERAL__VALUE:
        return value != VALUE_EDEFAULT;
      case TermDslPackage.NUMBER_LITERAL__VALUE_DEC:
        return VALUE_DEC_EDEFAULT == null ? valueDec != null : !VALUE_DEC_EDEFAULT.equals(valueDec);
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
    result.append(" (value: ");
    result.append(value);
    result.append(", valueDec: ");
    result.append(valueDec);
    result.append(')');
    return result.toString();
  }

} //NumberLiteralImpl
