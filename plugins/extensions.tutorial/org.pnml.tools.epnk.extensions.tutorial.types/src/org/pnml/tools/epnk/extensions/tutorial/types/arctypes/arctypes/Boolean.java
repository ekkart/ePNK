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
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean#isText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getBoolean()
 * @model
 * @generated
 */
public interface Boolean extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(boolean)
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getBoolean_Text()
	 * @model required="true"
	 * @generated
	 */
	boolean isText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean#isText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isText()
	 * @generated
	 */
	void setText(boolean value);

} // Boolean
