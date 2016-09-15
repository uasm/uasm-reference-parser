/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.CaseTerm#getCaseTerm <em>Case Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.CaseTerm#getTerm <em>Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.CaseTerm#getTermAction <em>Term Action</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.CaseTerm#getOtherwiseTerm <em>Otherwise Term</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getCaseTerm()
 * @model
 * @generated
 */
public interface CaseTerm extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Case Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Term</em>' containment reference.
   * @see #setCaseTerm(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getCaseTerm_CaseTerm()
   * @model containment="true"
   * @generated
   */
  Expression getCaseTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.CaseTerm#getCaseTerm <em>Case Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Term</em>' containment reference.
   * @see #getCaseTerm()
   * @generated
   */
  void setCaseTerm(Expression value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getCaseTerm_Term()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getTerm();

  /**
   * Returns the value of the '<em><b>Term Action</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Action</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getCaseTerm_TermAction()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getTermAction();

  /**
   * Returns the value of the '<em><b>Otherwise Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Otherwise Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Otherwise Term</em>' containment reference.
   * @see #setOtherwiseTerm(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getCaseTerm_OtherwiseTerm()
   * @model containment="true"
   * @generated
   */
  Expression getOtherwiseTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.CaseTerm#getOtherwiseTerm <em>Otherwise Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Otherwise Term</em>' containment reference.
   * @see #getOtherwiseTerm()
   * @generated
   */
  void setOtherwiseTerm(Expression value);

} // CaseTerm
