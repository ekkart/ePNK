/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory
 * @model kind="package"
 * @generated
 */
public interface IntegersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/integers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegersPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getIntegerOperator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.AdditionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.SubtractionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.MultiplicationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.DivisionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 8;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.ModuloImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 9;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__SUBTERM = INTEGER_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = INTEGER_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 10;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberConstantImpl <em>Number Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNumberConstant()
	 * @generated
	 */
	int NUMBER_CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__TYPE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NaturalImpl <em>Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NaturalImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 12;

	/**
	 * The number of structural features of the '<em>Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.PositiveImpl <em>Positive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.PositiveImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 13;

	/**
	 * The number of structural features of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 14;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator
	 * @generated
	 */
	EClass getIntegerOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant <em>Number Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant
	 * @generated
	 */
	EClass getNumberConstant();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getType()
	 * @see #getNumberConstant()
	 * @generated
	 */
	EReference getNumberConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant#getValue()
	 * @see #getNumberConstant()
	 * @generated
	 */
	EAttribute getNumberConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural
	 * @generated
	 */
	EClass getNatural();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive
	 * @generated
	 */
	EClass getPositive();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegersFactory getIntegersFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerOperatorImpl <em>Integer Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getIntegerOperator()
		 * @generated
		 */
		EClass INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.AdditionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.SubtractionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.MultiplicationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.DivisionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.GreaterThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.LessThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.ModuloImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberConstantImpl <em>Number Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NumberConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNumberConstant()
		 * @generated
		 */
		EClass NUMBER_CONSTANT = eINSTANCE.getNumberConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_CONSTANT__TYPE = eINSTANCE.getNumberConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTANT__VALUE = eINSTANCE.getNumberConstant_Value();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NaturalImpl <em>Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.NaturalImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getNatural()
		 * @generated
		 */
		EClass NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.PositiveImpl <em>Positive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.PositiveImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getPositive()
		 * @generated
		 */
		EClass POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegerImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

	}

} //IntegersPackage
