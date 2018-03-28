/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersPackage
 * @generated
 */
public interface HlpnghelpersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpnghelpersFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.HlpnghelpersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proxy Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Sort</em>'.
	 * @generated
	 */
	ProxySort createProxySort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HlpnghelpersPackage getHlpnghelpersPackage();

} //HlpnghelpersFactory
