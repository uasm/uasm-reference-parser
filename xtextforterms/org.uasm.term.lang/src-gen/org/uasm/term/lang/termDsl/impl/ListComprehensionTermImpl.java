/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uasm.term.lang.termDsl.EnumerableTerm;
import org.uasm.term.lang.termDsl.Expression;
import org.uasm.term.lang.termDsl.ListComprehensionTerm;
import org.uasm.term.lang.termDsl.TermDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Comprehension Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.ListComprehensionTermImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.ListComprehensionTermImpl#getVarTerm <em>Var Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.ListComprehensionTermImpl#getEnumTerm <em>Enum Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.ListComprehensionTermImpl#getTermWith <em>Term With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListComprehensionTermImpl extends ComprehensionTermImpl implements ListComprehensionTerm
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Expression term;

  /**
   * The cached value of the '{@link #getVarTerm() <em>Var Term</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarTerm()
   * @generated
   * @ordered
   */
  protected EList<String> varTerm;

  /**
   * The cached value of the '{@link #getEnumTerm() <em>Enum Term</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumTerm()
   * @generated
   * @ordered
   */
  protected EList<EnumerableTerm> enumTerm;

  /**
   * The cached value of the '{@link #getTermWith() <em>Term With</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermWith()
   * @generated
   * @ordered
   */
  protected Expression termWith;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListComprehensionTermImpl()
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
    return TermDslPackage.Literals.LIST_COMPREHENSION_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Expression newTerm, NotificationChain msgs)
  {
    Expression oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermDslPackage.LIST_COMPREHENSION_TERM__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Expression newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.LIST_COMPREHENSION_TERM__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.LIST_COMPREHENSION_TERM__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.LIST_COMPREHENSION_TERM__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVarTerm()
  {
    if (varTerm == null)
    {
      varTerm = new EDataTypeEList<String>(String.class, this, TermDslPackage.LIST_COMPREHENSION_TERM__VAR_TERM);
    }
    return varTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumerableTerm> getEnumTerm()
  {
    if (enumTerm == null)
    {
      enumTerm = new EObjectContainmentEList<EnumerableTerm>(EnumerableTerm.class, this, TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM);
    }
    return enumTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTermWith()
  {
    return termWith;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermWith(Expression newTermWith, NotificationChain msgs)
  {
    Expression oldTermWith = termWith;
    termWith = newTermWith;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH, oldTermWith, newTermWith);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermWith(Expression newTermWith)
  {
    if (newTermWith != termWith)
    {
      NotificationChain msgs = null;
      if (termWith != null)
        msgs = ((InternalEObject)termWith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH, null, msgs);
      if (newTermWith != null)
        msgs = ((InternalEObject)newTermWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH, null, msgs);
      msgs = basicSetTermWith(newTermWith, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH, newTermWith, newTermWith));
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
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM:
        return basicSetTerm(null, msgs);
      case TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM:
        return ((InternalEList<?>)getEnumTerm()).basicRemove(otherEnd, msgs);
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH:
        return basicSetTermWith(null, msgs);
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
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM:
        return getTerm();
      case TermDslPackage.LIST_COMPREHENSION_TERM__VAR_TERM:
        return getVarTerm();
      case TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM:
        return getEnumTerm();
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH:
        return getTermWith();
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
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM:
        setTerm((Expression)newValue);
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__VAR_TERM:
        getVarTerm().clear();
        getVarTerm().addAll((Collection<? extends String>)newValue);
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM:
        getEnumTerm().clear();
        getEnumTerm().addAll((Collection<? extends EnumerableTerm>)newValue);
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH:
        setTermWith((Expression)newValue);
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
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM:
        setTerm((Expression)null);
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__VAR_TERM:
        getVarTerm().clear();
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM:
        getEnumTerm().clear();
        return;
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH:
        setTermWith((Expression)null);
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
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM:
        return term != null;
      case TermDslPackage.LIST_COMPREHENSION_TERM__VAR_TERM:
        return varTerm != null && !varTerm.isEmpty();
      case TermDslPackage.LIST_COMPREHENSION_TERM__ENUM_TERM:
        return enumTerm != null && !enumTerm.isEmpty();
      case TermDslPackage.LIST_COMPREHENSION_TERM__TERM_WITH:
        return termWith != null;
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
    result.append(" (varTerm: ");
    result.append(varTerm);
    result.append(')');
    return result.toString();
  }

} //ListComprehensionTermImpl
