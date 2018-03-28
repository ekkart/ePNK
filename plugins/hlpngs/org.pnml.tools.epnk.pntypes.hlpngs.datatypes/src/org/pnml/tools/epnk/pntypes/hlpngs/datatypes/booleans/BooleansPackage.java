/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory
 * @model kind="package"
 * @generated
 */
public interface BooleansPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "booleans";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/booleans";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "booleans";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleansPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.EqualityImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 0;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.InequalityImpl <em>Inequality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.InequalityImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getInequality()
	 * @generated
	 */
	int INEQUALITY = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BoolImpl <em>Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BoolImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 2;

	/**
	 * The number of structural features of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.OrImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getOr()
	 * @generated
	 */
	int OR = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.AndImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.ImplyImpl <em>Imply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.ImplyImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getImply()
	 * @generated
	 */
	int IMPLY = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Imply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.NotImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__SUBTERM = BOOLEAN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Inequality
	 * @generated
	 */
	EClass getInequality();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Bool
	 * @generated
	 */
	EClass getBool();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanOperator
	 * @generated
	 */
	EClass getBooleanOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Imply <em>Imply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imply</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Imply
	 * @generated
	 */
	EClass getImply();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BooleansFactory getBooleansFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.EqualityImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.InequalityImpl <em>Inequality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.InequalityImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getInequality()
		 * @generated
		 */
		EClass INEQUALITY = eINSTANCE.getInequality();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BoolImpl <em>Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BoolImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBool();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.OrImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.AndImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.ImplyImpl <em>Imply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.ImplyImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getImply()
		 * @generated
		 */
		EClass IMPLY = eINSTANCE.getImply();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.NotImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleanConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

	}

} //BooleansPackage
