/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getUserSort()
 * @model
 * @generated
 */
public interface UserSort extends Sort, SymbolUse {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(SortDecl)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getUserSort_Declaration()
	 * @model required="true"
	 * @generated
	 */
	SortDecl getDeclaration();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(SortDecl value);

} // UserSort
