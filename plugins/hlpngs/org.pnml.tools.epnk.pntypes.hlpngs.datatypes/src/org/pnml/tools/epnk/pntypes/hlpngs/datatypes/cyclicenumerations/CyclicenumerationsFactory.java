/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage
 * @generated
 */
public interface CyclicenumerationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CyclicenumerationsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cyclic Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyclic Enumeration</em>'.
	 * @generated
	 */
	CyclicEnumeration createCyclicEnumeration();

	/**
	 * Returns a new object of class '<em>Successor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Successor</em>'.
	 * @generated
	 */
	Successor createSuccessor();

	/**
	 * Returns a new object of class '<em>Predecessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predecessor</em>'.
	 * @generated
	 */
	Predecessor createPredecessor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CyclicenumerationsPackage getCyclicenumerationsPackage();

} //CyclicenumerationsFactory
