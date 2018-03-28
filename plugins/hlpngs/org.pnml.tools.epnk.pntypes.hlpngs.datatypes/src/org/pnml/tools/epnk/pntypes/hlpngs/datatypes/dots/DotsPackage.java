/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory
 * @model kind="package"
 * @generated
 */
public interface DotsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dots";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/dots";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dots";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DotsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotImpl <em>Dot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl#getDot()
	 * @generated
	 */
	int DOT = 0;

	/**
	 * The number of structural features of the '<em>Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotConstantImpl <em>Dot Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl#getDotConstant()
	 * @generated
	 */
	int DOT_CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The number of structural features of the '<em>Dot Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.Dot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.Dot
	 * @generated
	 */
	EClass getDot();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotConstant <em>Dot Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotConstant
	 * @generated
	 */
	EClass getDotConstant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DotsFactory getDotsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotImpl <em>Dot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl#getDot()
		 * @generated
		 */
		EClass DOT = eINSTANCE.getDot();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotConstantImpl <em>Dot Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl#getDotConstant()
		 * @generated
		 */
		EClass DOT_CONSTANT = eINSTANCE.getDotConstant();

	}

} //DotsPackage
