/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArcType#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.TYPE
	 * @see #setText(TYPE)
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArcType_Text()
	 * @model required="true"
	 * @generated
	 */
	TYPE getText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.TYPE
	 * @see #getText()
	 * @generated
	 */
	void setText(TYPE value);

} // ArcType
