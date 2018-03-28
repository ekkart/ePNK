/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsFactory
 * @model kind="package"
 * @generated
 */
public interface FiniteenumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finiteenumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/finiteenumerations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finiteenumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteenumerationsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteEnumerationImpl <em>Finite Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteEnumerationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsPackageImpl#getFiniteEnumeration()
	 * @generated
	 */
	int FINITE_ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION__ELEMENTS = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finite Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ENUMERATION_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FEConstantImpl <em>FE Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FEConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsPackageImpl#getFEConstant()
	 * @generated
	 */
	int FE_CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The number of structural features of the '<em>FE Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FE_CONSTANT_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration <em>Finite Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Enumeration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration
	 * @generated
	 */
	EClass getFiniteEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration#getElements()
	 * @see #getFiniteEnumeration()
	 * @generated
	 */
	EReference getFiniteEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FEConstant <em>FE Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FE Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FEConstant
	 * @generated
	 */
	EClass getFEConstant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiniteenumerationsFactory getFiniteenumerationsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteEnumerationImpl <em>Finite Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteEnumerationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsPackageImpl#getFiniteEnumeration()
		 * @generated
		 */
		EClass FINITE_ENUMERATION = eINSTANCE.getFiniteEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_ENUMERATION__ELEMENTS = eINSTANCE.getFiniteEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FEConstantImpl <em>FE Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FEConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteenumerationsPackageImpl#getFEConstant()
		 * @generated
		 */
		EClass FE_CONSTANT = eINSTANCE.getFEConstant();

	}

} //FiniteenumerationsPackage
