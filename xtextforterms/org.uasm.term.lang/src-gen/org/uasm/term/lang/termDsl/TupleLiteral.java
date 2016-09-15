/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.TupleLiteral#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getTupleLiteral()
 * @model
 * @generated
 */
public interface TupleLiteral extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getTupleLiteral_Literals()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLiterals();

} // TupleLiteral
