/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.LetTerm#getVarTerm <em>Var Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.LetTerm#getTerm <em>Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.LetTerm#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getLetTerm()
 * @model
 * @generated
 */
public interface LetTerm extends BasicTerm
{
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
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getLetTerm_VarTerm()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarTerm();

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
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getLetTerm_Term()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getTerm();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getLetTerm_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.LetTerm#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // LetTerm