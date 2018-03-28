/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsFactory
 * @model kind="package"
 * @generated
 */
public interface CyclicenumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cyclicenumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/cyclicenumerations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cyclicenumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CyclicenumerationsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumerationImpl <em>Cyclic Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumerationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getCyclicEnumeration()
	 * @generated
	 */
	int CYCLIC_ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION__ELEMENTS = FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Cyclic Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUMERATION_FEATURE_COUNT = FiniteenumerationsPackage.FINITE_ENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumOperatorImpl <em>Cyclic Enum Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getCyclicEnumOperator()
	 * @generated
	 */
	int CYCLIC_ENUM_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Cyclic Enum Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_ENUM_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.SuccessorImpl <em>Successor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.SuccessorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getSuccessor()
	 * @generated
	 */
	int SUCCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__SUBTERM = CYCLIC_ENUM_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Successor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_FEATURE_COUNT = CYCLIC_ENUM_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.PredecessorImpl <em>Predecessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.PredecessorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getPredecessor()
	 * @generated
	 */
	int PREDECESSOR = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__SUBTERM = CYCLIC_ENUM_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_FEATURE_COUNT = CYCLIC_ENUM_OPERATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumeration <em>Cyclic Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Enumeration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumeration
	 * @generated
	 */
	EClass getCyclicEnumeration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumOperator <em>Cyclic Enum Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Enum Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumOperator
	 * @generated
	 */
	EClass getCyclicEnumOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Successor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Successor</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Successor
	 * @generated
	 */
	EClass getSuccessor();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Predecessor
	 * @generated
	 */
	EClass getPredecessor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CyclicenumerationsFactory getCyclicenumerationsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumerationImpl <em>Cyclic Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumerationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getCyclicEnumeration()
		 * @generated
		 */
		EClass CYCLIC_ENUMERATION = eINSTANCE.getCyclicEnumeration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumOperatorImpl <em>Cyclic Enum Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicEnumOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getCyclicEnumOperator()
		 * @generated
		 */
		EClass CYCLIC_ENUM_OPERATOR = eINSTANCE.getCyclicEnumOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.SuccessorImpl <em>Successor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.SuccessorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getSuccessor()
		 * @generated
		 */
		EClass SUCCESSOR = eINSTANCE.getSuccessor();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.PredecessorImpl <em>Predecessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.PredecessorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl.CyclicenumerationsPackageImpl#getPredecessor()
		 * @generated
		 */
		EClass PREDECESSOR = eINSTANCE.getPredecessor();

	}

} //CyclicenumerationsPackage
