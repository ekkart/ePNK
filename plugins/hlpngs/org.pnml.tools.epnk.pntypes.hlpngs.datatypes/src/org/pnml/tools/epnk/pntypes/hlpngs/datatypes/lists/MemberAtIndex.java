/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member At Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage#getMemberAtIndex()
 * @model
 * @generated
 */
public interface MemberAtIndex extends ListOperator {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(NonNegativeInteger)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage#getMemberAtIndex_Index()
	 * @model default="0" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger" required="true"
	 * @generated
	 */
	NonNegativeInteger getIndex();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(NonNegativeInteger value);

} // MemberAtIndex
