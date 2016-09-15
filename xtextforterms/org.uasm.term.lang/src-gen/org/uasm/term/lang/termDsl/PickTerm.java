/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.PickTerm#getVarTerm <em>Var Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.PickTerm#getEnumTerm <em>Enum Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.PickTerm#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getPickTerm()
 * @model
 * @generated
 */
public interface PickTerm extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Var Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Term</em>' attribute.
   * @see #setVarTerm(String)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getPickTerm_VarTerm()
   * @model
   * @generated
   */
  String getVarTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.PickTerm#getVarTerm <em>Var Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Term</em>' attribute.
   * @see #getVarTerm()
   * @generated
   */
  void setVarTerm(String value);

  /**
   * Returns the value of the '<em><b>Enum Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Term</em>' containment reference.
   * @see #setEnumTerm(EnumerableTerm)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getPickTerm_EnumTerm()
   * @model containment="true"
   * @generated
   */
  EnumerableTerm getEnumTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.PickTerm#getEnumTerm <em>Enum Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Term</em>' containment reference.
   * @see #getEnumTerm()
   * @generated
   */
  void setEnumTerm(EnumerableTerm value);

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
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getPickTerm_Term()
   * @model containment="true"
   * @generated
   */
  Expression getTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.PickTerm#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Expression value);

} // PickTerm
