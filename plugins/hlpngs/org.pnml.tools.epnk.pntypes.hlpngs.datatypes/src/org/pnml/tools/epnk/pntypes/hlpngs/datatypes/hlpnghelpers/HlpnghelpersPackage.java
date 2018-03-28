/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersFactory
 * @model kind="package"
 * @generated
 */
public interface HlpnghelpersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlpnghelpers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/helpers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlpnghelpers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpnghelpersPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.HlpnghelpersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.ProxySortImpl <em>Proxy Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.ProxySortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.HlpnghelpersPackageImpl#getProxySort()
	 * @generated
	 */
	int PROXY_SORT = 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SORT__SORT = TermsPackage.SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_SORT_FEATURE_COUNT = TermsPackage.SORT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort <em>Proxy Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort
	 * @generated
	 */
	EClass getProxySort();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort#getSort()
	 * @see #getProxySort()
	 * @generated
	 */
	EReference getProxySort_Sort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HlpnghelpersFactory getHlpnghelpersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.ProxySortImpl <em>Proxy Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.ProxySortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.HlpnghelpersPackageImpl#getProxySort()
		 * @generated
		 */
		EClass PROXY_SORT = eINSTANCE.getProxySort();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_SORT__SORT = eINSTANCE.getProxySort_Sort();

	}

} //HlpnghelpersPackage
