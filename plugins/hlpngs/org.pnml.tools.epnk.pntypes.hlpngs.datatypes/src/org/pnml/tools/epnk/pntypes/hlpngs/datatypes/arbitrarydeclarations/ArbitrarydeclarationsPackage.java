/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsFactory
 * @model kind="package"
 * @generated
 */
public interface ArbitrarydeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arbitrarydeclarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/arbitrarydeclarations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arbitrarydeclarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArbitrarydeclarationsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarySortImpl <em>Arbitrary Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarySortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitrarySort()
	 * @generated
	 */
	int ARBITRARY_SORT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT__ID = TermsPackage.SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT__NAME = TermsPackage.SORT_DECL__NAME;

	/**
	 * The number of structural features of the '<em>Arbitrary Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_SORT_FEATURE_COUNT = TermsPackage.SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl <em>Arbitrary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitraryOperator()
	 * @generated
	 */
	int ARBITRARY_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__INPUT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR__OUTPUT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arbitrary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_OPERATOR_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.UnparsedImpl <em>Unparsed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.UnparsedImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getUnparsed()
	 * @generated
	 */
	int UNPARSED = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__ID = TermsPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__NAME = TermsPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED__CONTENTS = TermsPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unparsed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_FEATURE_COUNT = TermsPackage.DECLARATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarySort <em>Arbitrary Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarySort
	 * @generated
	 */
	EClass getArbitrarySort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator <em>Arbitrary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator
	 * @generated
	 */
	EClass getArbitraryOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator#getInput()
	 * @see #getArbitraryOperator()
	 * @generated
	 */
	EReference getArbitraryOperator_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator#getOutput()
	 * @see #getArbitraryOperator()
	 * @generated
	 */
	EReference getArbitraryOperator_Output();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed <em>Unparsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparsed</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed
	 * @generated
	 */
	EClass getUnparsed();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed#getContents()
	 * @see #getUnparsed()
	 * @generated
	 */
	EAttribute getUnparsed_Contents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArbitrarydeclarationsFactory getArbitrarydeclarationsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarySortImpl <em>Arbitrary Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarySortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitrarySort()
		 * @generated
		 */
		EClass ARBITRARY_SORT = eINSTANCE.getArbitrarySort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl <em>Arbitrary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getArbitraryOperator()
		 * @generated
		 */
		EClass ARBITRARY_OPERATOR = eINSTANCE.getArbitraryOperator();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_OPERATOR__INPUT = eINSTANCE.getArbitraryOperator_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_OPERATOR__OUTPUT = eINSTANCE.getArbitraryOperator_Output();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.UnparsedImpl <em>Unparsed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.UnparsedImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitrarydeclarationsPackageImpl#getUnparsed()
		 * @generated
		 */
		EClass UNPARSED = eINSTANCE.getUnparsed();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPARSED__CONTENTS = eINSTANCE.getUnparsed_Contents();

	}

} //ArbitrarydeclarationsPackage
