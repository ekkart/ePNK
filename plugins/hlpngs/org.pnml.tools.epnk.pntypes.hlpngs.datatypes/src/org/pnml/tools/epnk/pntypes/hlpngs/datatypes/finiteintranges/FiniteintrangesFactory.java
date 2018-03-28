/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage
 * @generated
 */
public interface FiniteintrangesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteintrangesFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Finite Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Int Range</em>'.
	 * @generated
	 */
	FiniteIntRange createFiniteIntRange();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Or Equal</em>'.
	 * @generated
	 */
	LessThanOrEqual createLessThanOrEqual();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Or Equal</em>'.
	 * @generated
	 */
	GreaterThanOrEqual createGreaterThanOrEqual();

	/**
	 * Returns a new object of class '<em>Finite Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Int Constant</em>'.
	 * @generated
	 */
	FiniteIntConstant createFiniteIntConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiniteintrangesPackage getFiniteintrangesPackage();

} //FiniteintrangesFactory
