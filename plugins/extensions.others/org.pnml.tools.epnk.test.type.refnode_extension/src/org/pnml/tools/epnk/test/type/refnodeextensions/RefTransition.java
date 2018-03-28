/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition#getApi <em>Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getRefTransition()
 * @model
 * @generated
 */
public interface RefTransition extends org.pnml.tools.epnk.pnmlcoremodel.RefTransition {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(API)
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getRefTransition_Api()
	 * @model containment="true"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

} // RefTransition
