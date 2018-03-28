/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace#getPragmatics <em>Pragmatics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getRefPlace()
 * @model
 * @generated
 */
public interface RefPlace extends org.pnml.tools.epnk.pnmlcoremodel.RefPlace {
	/**
	 * Returns the value of the '<em><b>Pragmatics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pragmatics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pragmatics</em>' containment reference.
	 * @see #setPragmatics(Pragmatics)
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getRefPlace_Pragmatics()
	 * @model containment="true"
	 * @generated
	 */
	Pragmatics getPragmatics();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace#getPragmatics <em>Pragmatics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pragmatics</em>' containment reference.
	 * @see #getPragmatics()
	 * @generated
	 */
	void setPragmatics(Pragmatics value);

} // RefPlace
