/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Comprehension Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getTerm <em>Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getVarTerm <em>Var Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getEnumTerm <em>Enum Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getTermWith <em>Term With</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getBagComprehensionTerm()
 * @model
 * @generated
 */
public interface BagComprehensionTerm extends ComprehensionTerm
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
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getBagComprehensionTerm_Term()
   * @model containment="true"
   * @generated
   */
  Expression getTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Expression value);

  /**
   * Returns the value of the '<em><b>Var Term</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Term</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Term</em>' attribute list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getBagComprehensionTerm_VarTerm()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarTerm();

  /**
   * Returns the value of the '<em><b>Enum Term</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.EnumerableTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Term</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Term</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getBagComprehensionTerm_EnumTerm()
   * @model containment="true"
   * @generated
   */
  EList<EnumerableTerm> getEnumTerm();

  /**
   * Returns the value of the '<em><b>Term With</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term With</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term With</em>' containment reference.
   * @see #setTermWith(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getBagComprehensionTerm_TermWith()
   * @model containment="true"
   * @generated
   */
  Expression getTermWith();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.BagComprehensionTerm#getTermWith <em>Term With</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term With</em>' containment reference.
   * @see #getTermWith()
   * @generated
   */
  void setTermWith(Expression value);

} // BagComprehensionTerm