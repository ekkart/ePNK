/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getSort()
 * @model abstract="true"
 * @generated
 */
public interface Sort extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean equals(Sort object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSuperSortOf(Sort sort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Sort leastCommonSuper(Sort sort);
	
	// @generated NOT
	Sort resolve(Set<SortDecl> declarations);
	
	// @generated NOT
	Sort clone();
	
	

} // Sort
