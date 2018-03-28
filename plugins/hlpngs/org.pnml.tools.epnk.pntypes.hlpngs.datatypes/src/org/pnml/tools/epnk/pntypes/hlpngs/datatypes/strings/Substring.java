/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getStart <em>Start</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage#getSubstring()
 * @model
 * @generated
 */
public interface Substring extends StringOperator {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(NonNegativeInteger)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage#getSubstring_Start()
	 * @model default="0" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger" required="true"
	 * @generated
	 */
	NonNegativeInteger getStart();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(NonNegativeInteger value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(NonNegativeInteger)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage#getSubstring_Length()
	 * @model default="0" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger" required="true"
	 * @generated
	 */
	NonNegativeInteger getLength();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(NonNegativeInteger value);

} // Substring
