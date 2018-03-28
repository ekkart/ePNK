/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage
 * @generated
 */
public interface DotsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DotsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot</em>'.
	 * @generated
	 */
	Dot createDot();

	/**
	 * Returns a new object of class '<em>Dot Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Constant</em>'.
	 * @generated
	 */
	DotConstant createDotConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DotsPackage getDotsPackage();

} //DotsFactory
