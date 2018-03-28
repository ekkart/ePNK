/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage
 * @generated
 */
public interface FiniteenumerationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteenumerationsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Finite Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Enumeration</em>'.
	 * @generated
	 */
	FiniteEnumeration createFiniteEnumeration();

	/**
	 * Returns a new object of class '<em>FE Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FE Constant</em>'.
	 * @generated
	 */
	FEConstant createFEConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiniteenumerationsPackage getFiniteenumerationsPackage();

} //FiniteenumerationsFactory
