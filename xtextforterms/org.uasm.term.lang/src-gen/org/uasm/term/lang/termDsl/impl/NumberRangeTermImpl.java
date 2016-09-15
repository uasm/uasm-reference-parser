/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uasm.term.lang.termDsl.Expression;
import org.uasm.term.lang.termDsl.NumberRangeTerm;
import org.uasm.term.lang.termDsl.TermDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Range Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.NumberRangeTermImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.NumberRangeTermImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.impl.NumberRangeTermImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberRangeTermImpl extends ComprehensionTermImpl implements NumberRangeTerm
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected Expression start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected Expression end;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected Expression step;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberRangeTermImpl()
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
    return TermDslPackage.Literals.NUMBER_RANGE_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(Expression newStart, NotificationChain msgs)
  {
    Expression oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(Expression newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(Expression newEnd, NotificationChain msgs)
  {
    Expression oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(Expression newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__END, newEnd, newEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(Expression newStep, NotificationChain msgs)
  {
    Expression oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__STEP, oldStep, newStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(Expression newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermDslPackage.NUMBER_RANGE_TERM__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TermDslPackage.NUMBER_RANGE_TERM__STEP, newStep, newStep));
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
      case TermDslPackage.NUMBER_RANGE_TERM__START:
        return basicSetStart(null, msgs);
      case TermDslPackage.NUMBER_RANGE_TERM__END:
        return basicSetEnd(null, msgs);
      case TermDslPackage.NUMBER_RANGE_TERM__STEP:
        return basicSetStep(null, msgs);
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
      case TermDslPackage.NUMBER_RANGE_TERM__START:
        return getStart();
      case TermDslPackage.NUMBER_RANGE_TERM__END:
        return getEnd();
      case TermDslPackage.NUMBER_RANGE_TERM__STEP:
        return getStep();
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
      case TermDslPackage.NUMBER_RANGE_TERM__START:
        setStart((Expression)newValue);
        return;
      case TermDslPackage.NUMBER_RANGE_TERM__END:
        setEnd((Expression)newValue);
        return;
      case TermDslPackage.NUMBER_RANGE_TERM__STEP:
        setStep((Expression)newValue);
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
      case TermDslPackage.NUMBER_RANGE_TERM__START:
        setStart((Expression)null);
        return;
      case TermDslPackage.NUMBER_RANGE_TERM__END:
        setEnd((Expression)null);
        return;
      case TermDslPackage.NUMBER_RANGE_TERM__STEP:
        setStep((Expression)null);
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
      case TermDslPackage.NUMBER_RANGE_TERM__START:
        return start != null;
      case TermDslPackage.NUMBER_RANGE_TERM__END:
        return end != null;
      case TermDslPackage.NUMBER_RANGE_TERM__STEP:
        return step != null;
    }
    return super.eIsSet(featureID);
  }

} //NumberRangeTermImpl
