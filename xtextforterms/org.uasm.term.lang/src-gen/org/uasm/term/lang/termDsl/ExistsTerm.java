/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.ExistsTerm#getUnique <em>Unique</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.ExistsTerm#getVarTerm <em>Var Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.ExistsTerm#getInTerm <em>In Term</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.ExistsTerm#getWithTerm <em>With Term</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getExistsTerm()
 * @model
 * @generated
 */
public interface ExistsTerm extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(String)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getExistsTerm_Unique()
   * @model
   * @generated
   */
  String getUnique();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.ExistsTerm#getUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #getUnique()
   * @generated
   */
  void setUnique(String value);

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
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getExistsTerm_VarTerm()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarTerm();

  /**
   * Returns the value of the '<em><b>In Term</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Term</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Term</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getExistsTerm_InTerm()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getInTerm();

  /**
   * Returns the value of the '<em><b>With Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Term</em>' containment reference.
   * @see #setWithTerm(Expression)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getExistsTerm_WithTerm()
   * @model containment="true"
   * @generated
   */
  Expression getWithTerm();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.ExistsTerm#getWithTerm <em>With Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Term</em>' containment reference.
   * @see #getWithTerm()
   * @generated
   */
  void setWithTerm(Expression value);

} // ExistsTerm
