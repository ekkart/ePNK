/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Set Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getMultiSetSort()
 * @model
 * @generated
 */
public interface MultiSetSort extends Sort {
	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference.
	 * @see #setBasis(Sort)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getMultiSetSort_Basis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getBasis();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort#getBasis <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' containment reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(Sort value);

} // MultiSetSort
