/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesFactory
 * @model kind="package"
 * @generated
 */
public interface FiniteintrangesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finiteintranges";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/finiteintranges";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finiteintranges";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiniteintrangesPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeImpl <em>Finite Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntRange()
	 * @generated
	 */
	int FINITE_INT_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__START = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE__END = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Finite Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeOperatorImpl <em>Finite Int Range Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntRangeOperator()
	 * @generated
	 */
	int FINITE_INT_RANGE_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Finite Int Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SUBTERM = FINITE_INT_RANGE_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = FINITE_INT_RANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntConstantImpl <em>Finite Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntConstant()
	 * @generated
	 */
	int FINITE_INT_CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_CONSTANT__RANGE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Finite Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_INT_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange <em>Finite Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Range</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange
	 * @generated
	 */
	EClass getFiniteIntRange();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange#getStart()
	 * @see #getFiniteIntRange()
	 * @generated
	 */
	EAttribute getFiniteIntRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange#getEnd()
	 * @see #getFiniteIntRange()
	 * @generated
	 */
	EAttribute getFiniteIntRange_End();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRangeOperator <em>Finite Int Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Range Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRangeOperator
	 * @generated
	 */
	EClass getFiniteIntRangeOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant <em>Finite Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Int Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant
	 * @generated
	 */
	EClass getFiniteIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getValue()
	 * @see #getFiniteIntConstant()
	 * @generated
	 */
	EAttribute getFiniteIntConstant_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant#getRange()
	 * @see #getFiniteIntConstant()
	 * @generated
	 */
	EReference getFiniteIntConstant_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiniteintrangesFactory getFiniteintrangesFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeImpl <em>Finite Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntRange()
		 * @generated
		 */
		EClass FINITE_INT_RANGE = eINSTANCE.getFiniteIntRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_RANGE__START = eINSTANCE.getFiniteIntRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_RANGE__END = eINSTANCE.getFiniteIntRange_End();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeOperatorImpl <em>Finite Int Range Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntRangeOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntRangeOperator()
		 * @generated
		 */
		EClass FINITE_INT_RANGE_OPERATOR = eINSTANCE.getFiniteIntRangeOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.LessThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.GreaterThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntConstantImpl <em>Finite Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteIntConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl.FiniteintrangesPackageImpl#getFiniteIntConstant()
		 * @generated
		 */
		EClass FINITE_INT_CONSTANT = eINSTANCE.getFiniteIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_INT_CONSTANT__VALUE = eINSTANCE.getFiniteIntConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_INT_CONSTANT__RANGE = eINSTANCE.getFiniteIntConstant_Range();

	}

} //FiniteintrangesPackage
