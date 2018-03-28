/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage#getNumberConstant()
 * @model
 * @generated
 */
public interface NumberConstant extends BuiltInConst {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage#getNumberConstant_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number getType();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage#getNumberConstant_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NumberConstant
