/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings;

import java.lang.String;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory
 * @model kind="package"
 * @generated
 */
public interface StringsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "strings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/strings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "strings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getString()
	 * @generated
	 */
	int STRING = 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringOperatorImpl <em>String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringConstantImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.SubstringImpl <em>Substring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.SubstringImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getSubstring()
	 * @generated
	 */
	int SUBSTRING = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__START = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__LENGTH = STRING_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.ConcatenationImpl <em>Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.ConcatenationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getConcatenation()
	 * @generated
	 */
	int CONCATENATION = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.AppendImpl <em>Append</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.AppendImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getAppend()
	 * @generated
	 */
	int APPEND = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Append</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LengthImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 8;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 9;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanOrEqualImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 10;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__SUBTERM = STRING_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = STRING_OPERATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringOperator
	 * @generated
	 */
	EClass getStringOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring <em>Substring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substring</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring
	 * @generated
	 */
	EClass getSubstring();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getStart()
	 * @see #getSubstring()
	 * @generated
	 */
	EAttribute getSubstring_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring#getLength()
	 * @see #getSubstring()
	 * @generated
	 */
	EAttribute getSubstring_Length();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation <em>Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenation</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation
	 * @generated
	 */
	EClass getConcatenation();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Append <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Append
	 * @generated
	 */
	EClass getAppend();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StringsFactory getStringsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringOperatorImpl <em>String Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getStringOperator()
		 * @generated
		 */
		EClass STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringConstantImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.SubstringImpl <em>Substring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.SubstringImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getSubstring()
		 * @generated
		 */
		EClass SUBSTRING = eINSTANCE.getSubstring();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTRING__START = eINSTANCE.getSubstring_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTRING__LENGTH = eINSTANCE.getSubstring_Length();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.ConcatenationImpl <em>Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.ConcatenationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getConcatenation()
		 * @generated
		 */
		EClass CONCATENATION = eINSTANCE.getConcatenation();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.AppendImpl <em>Append</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.AppendImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getAppend()
		 * @generated
		 */
		EClass APPEND = eINSTANCE.getAppend();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LengthImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.GreaterThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.LessThanOrEqualImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl.StringsPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

	}

} //StringsPackage
