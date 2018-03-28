/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage#getList()
 * @model
 * @generated
 */
public interface List extends BuiltInSort {
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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage#getList_Basis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getBasis();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List#getBasis <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' containment reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(Sort value);

} // List
