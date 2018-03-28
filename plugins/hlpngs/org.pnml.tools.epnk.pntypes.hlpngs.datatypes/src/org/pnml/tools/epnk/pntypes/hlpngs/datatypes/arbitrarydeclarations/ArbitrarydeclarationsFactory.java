/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage
 * @generated
 */
public interface ArbitrarydeclarationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArbitrarydeclarationsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arbitrary Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Sort</em>'.
	 * @generated
	 */
	ArbitrarySort createArbitrarySort();

	/**
	 * Returns a new object of class '<em>Arbitrary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Operator</em>'.
	 * @generated
	 */
	ArbitraryOperator createArbitraryOperator();

	/**
	 * Returns a new object of class '<em>Unparsed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unparsed</em>'.
	 * @generated
	 */
	Unparsed createUnparsed();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArbitrarydeclarationsPackage getArbitrarydeclarationsPackage();

} //ArbitrarydeclarationsFactory
