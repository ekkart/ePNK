/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page#getPragmatics <em>Pragmatics</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page#getApi <em>Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends org.pnml.tools.epnk.pnmlcoremodel.Page {
	/**
	 * Returns the value of the '<em><b>Pragmatics</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pragmatics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pragmatics</em>' containment reference list.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getPage_Pragmatics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pragmatics> getPragmatics();

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
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#getPage_Api()
	 * @model containment="true"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

} // Page
