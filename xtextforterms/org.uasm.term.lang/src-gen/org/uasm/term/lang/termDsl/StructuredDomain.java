/**
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.termDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uasm.term.lang.termDsl.StructuredDomain#getType <em>Type</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainSet <em>Domain Set</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainBag <em>Domain Bag</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainList <em>Domain List</em>}</li>
 *   <li>{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainMap <em>Domain Map</em>}</li>
 * </ul>
 *
 * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain()
 * @model
 * @generated
 */
public interface StructuredDomain extends Domain
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.StructuredDomain#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Domain Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Set</em>' containment reference.
   * @see #setDomainSet(Domain)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain_DomainSet()
   * @model containment="true"
   * @generated
   */
  Domain getDomainSet();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainSet <em>Domain Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Set</em>' containment reference.
   * @see #getDomainSet()
   * @generated
   */
  void setDomainSet(Domain value);

  /**
   * Returns the value of the '<em><b>Domain Bag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Bag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Bag</em>' containment reference.
   * @see #setDomainBag(Domain)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain_DomainBag()
   * @model containment="true"
   * @generated
   */
  Domain getDomainBag();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainBag <em>Domain Bag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Bag</em>' containment reference.
   * @see #getDomainBag()
   * @generated
   */
  void setDomainBag(Domain value);

  /**
   * Returns the value of the '<em><b>Domain List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain List</em>' containment reference.
   * @see #setDomainList(Domain)
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain_DomainList()
   * @model containment="true"
   * @generated
   */
  Domain getDomainList();

  /**
   * Sets the value of the '{@link org.uasm.term.lang.termDsl.StructuredDomain#getDomainList <em>Domain List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain List</em>' containment reference.
   * @see #getDomainList()
   * @generated
   */
  void setDomainList(Domain value);

  /**
   * Returns the value of the '<em><b>Domain Map</b></em>' containment reference list.
   * The list contents are of type {@link org.uasm.term.lang.termDsl.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Map</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Map</em>' containment reference list.
   * @see org.uasm.term.lang.termDsl.TermDslPackage#getStructuredDomain_DomainMap()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomainMap();

} // StructuredDomain