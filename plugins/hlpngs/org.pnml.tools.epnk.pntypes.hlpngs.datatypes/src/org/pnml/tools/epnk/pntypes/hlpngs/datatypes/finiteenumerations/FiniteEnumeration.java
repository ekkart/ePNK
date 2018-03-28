/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage#getFiniteEnumeration()
 * @model
 * @generated
 */
public interface FiniteEnumeration extends BuiltInSort {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FEConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage#getFiniteEnumeration_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FEConstant> getElements();

} // FiniteEnumeration
