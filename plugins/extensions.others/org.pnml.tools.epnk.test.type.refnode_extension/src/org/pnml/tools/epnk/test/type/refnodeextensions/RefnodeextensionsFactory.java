/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage
 * @generated
 */
public interface RefnodeextensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefnodeextensionsFactory eINSTANCE = org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ref Node Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Node Extension</em>'.
	 * @generated
	 */
	RefNodeExtension createRefNodeExtension();

	/**
	 * Returns a new object of class '<em>Ref Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Place</em>'.
	 * @generated
	 */
	RefPlace createRefPlace();

	/**
	 * Returns a new object of class '<em>Ref Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Transition</em>'.
	 * @generated
	 */
	RefTransition createRefTransition();

	/**
	 * Returns a new object of class '<em>Pragmatics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragmatics</em>'.
	 * @generated
	 */
	Pragmatics createPragmatics();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefnodeextensionsPackage getRefnodeextensionsPackage();

} //RefnodeextensionsFactory
