/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.StringLiteral#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStringLiteral_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.StringLiteral#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // StringLiteral
