/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.ReturnTerm#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getReturnTerm()
 * @model
 * @generated
 */
public interface ReturnTerm extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getReturnTerm_Term()
   * @model containment="true"
   * @generated
   */
  Expression getTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.ReturnTerm#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Expression value);

} // ReturnTerm
