/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.LocationTerm#getFunction <em>Function</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.LocationTerm#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getLocationTerm()
 * @model
 * @generated
 */
public interface LocationTerm extends BasicTerm
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(FunctionTerm)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getLocationTerm_Function()
   * @model containment="true"
   * @generated
   */
  FunctionTerm getFunction();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.LocationTerm#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(FunctionTerm value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(String)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getLocationTerm_Result()
   * @model
   * @generated
   */
  String getResult();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.LocationTerm#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(String value);

} // LocationTerm