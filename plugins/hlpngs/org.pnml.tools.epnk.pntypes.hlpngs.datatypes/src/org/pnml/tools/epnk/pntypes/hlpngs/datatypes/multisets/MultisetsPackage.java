/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsFactory
 * @model kind="package"
 * @generated
 */
public interface MultisetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multisets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/multisets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multisets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultisetsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityOfImpl <em>Cardinality Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityOfImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getCardinalityOf()
	 * @generated
	 */
	int CARDINALITY_OF = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OF__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Cardinality Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OF_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ContainsImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AddImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AllImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__REFSORT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.NumberOfImpl <em>Number Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.NumberOfImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getNumberOf()
	 * @generated
	 */
	int NUMBER_OF = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Number Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.SubtractImpl <em>Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.SubtractImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ScalarProductImpl <em>Scalar Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ScalarProductImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getScalarProduct()
	 * @generated
	 */
	int SCALAR_PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PRODUCT__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Scalar Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PRODUCT_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.EmptyImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 8;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SUBTERM = TermsPackage.MULTI_SET_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__REFSORT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = TermsPackage.MULTI_SET_OPERATOR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.CardinalityOf <em>Cardinality Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Of</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.CardinalityOf
	 * @generated
	 */
	EClass getCardinalityOf();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All#getRefsort()
	 * @see #getAll()
	 * @generated
	 */
	EReference getAll_Refsort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf <em>Number Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf
	 * @generated
	 */
	EClass getNumberOf();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.ScalarProduct <em>Scalar Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Product</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.ScalarProduct
	 * @generated
	 */
	EClass getScalarProduct();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty#getRefsort()
	 * @see #getEmpty()
	 * @generated
	 */
	EReference getEmpty_Refsort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultisetsFactory getMultisetsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityOfImpl <em>Cardinality Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.CardinalityOfImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getCardinalityOf()
		 * @generated
		 */
		EClass CARDINALITY_OF = eINSTANCE.getCardinalityOf();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ContainsImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AddImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.AllImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL__REFSORT = eINSTANCE.getAll_Refsort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.NumberOfImpl <em>Number Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.NumberOfImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getNumberOf()
		 * @generated
		 */
		EClass NUMBER_OF = eINSTANCE.getNumberOf();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.SubtractImpl <em>Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.SubtractImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getSubtract()
		 * @generated
		 */
		EClass SUBTRACT = eINSTANCE.getSubtract();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ScalarProductImpl <em>Scalar Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.ScalarProductImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getScalarProduct()
		 * @generated
		 */
		EClass SCALAR_PRODUCT = eINSTANCE.getScalarProduct();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.EmptyImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY__REFSORT = eINSTANCE.getEmpty_Refsort();

	}

} //MultisetsPackage
