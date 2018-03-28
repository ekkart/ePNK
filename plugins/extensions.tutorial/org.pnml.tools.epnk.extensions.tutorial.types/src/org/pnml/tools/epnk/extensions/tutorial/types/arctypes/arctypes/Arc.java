/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc#getBool <em>Bool</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArcType)
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArc_Type()
	 * @model containment="true"
	 * @generated
	 */
	ArcType getType();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArcType value);

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference.
	 * @see #setBool(org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean)
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArc_Bool()
	 * @model containment="true"
	 * @generated
	 */
	org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean getBool();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc#getBool <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' containment reference.
	 * @see #getBool()
	 * @generated
	 */
	void setBool(org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage#getArc_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComment();

} // Arc
