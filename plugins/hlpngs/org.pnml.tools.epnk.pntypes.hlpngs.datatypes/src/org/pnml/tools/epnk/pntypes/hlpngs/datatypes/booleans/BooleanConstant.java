/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage#getBooleanConstant()
 * @model
 * @generated
 */
public interface BooleanConstant extends BuiltInConst {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage#getBooleanConstant_Value()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanConstant
