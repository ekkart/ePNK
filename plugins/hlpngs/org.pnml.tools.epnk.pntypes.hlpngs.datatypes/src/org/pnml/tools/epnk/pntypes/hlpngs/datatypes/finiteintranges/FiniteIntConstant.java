/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Int Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getValue <em>Value</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage#getFiniteIntConstant()
 * @model
 * @generated
 */
public interface FiniteIntConstant extends BuiltInConst {
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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage#getFiniteIntConstant_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(FiniteIntRange)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage#getFiniteIntConstant_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FiniteIntRange getRange();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(FiniteIntRange value);

} // FiniteIntConstant
