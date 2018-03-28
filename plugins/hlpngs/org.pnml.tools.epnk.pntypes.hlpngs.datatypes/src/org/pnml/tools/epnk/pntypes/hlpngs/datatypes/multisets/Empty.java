/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty#getRefsort <em>Refsort</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage#getEmpty()
 * @model
 * @generated
 */
public interface Empty extends MultiSetOperator {
	/**
	 * Returns the value of the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsort</em>' containment reference.
	 * @see #setRefsort(Sort)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage#getEmpty_Refsort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getRefsort();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty#getRefsort <em>Refsort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsort</em>' containment reference.
	 * @see #getRefsort()
	 * @generated
	 */
	void setRefsort(Sort value);

} // Empty
