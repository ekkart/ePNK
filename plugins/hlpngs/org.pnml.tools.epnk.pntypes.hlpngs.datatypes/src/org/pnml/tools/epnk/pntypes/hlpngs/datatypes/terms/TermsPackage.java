/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
public interface TermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/terms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationsImpl <em>Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationsImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getDeclarations()
	 * @generated
	 */
	int DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS__DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = StructuredpntypemodelPackage.SYMBOL_DEF__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = StructuredpntypemodelPackage.SYMBOL_DEF__NAME;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = StructuredpntypemodelPackage.SYMBOL_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortDeclImpl <em>Sort Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortDeclImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getSortDecl()
	 * @generated
	 */
	int SORT_DECL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Sort Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableDeclImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__SORT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 5;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REFVARIABLE = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 6;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SUBTERM = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedSortImpl <em>Named Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedSortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getNamedSort()
	 * @generated
	 */
	int NAMED_SORT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__ID = SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__NAME = SORT_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT__DEF = SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SORT_FEATURE_COUNT = SORT_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl <em>Built In Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInSort()
	 * @generated
	 */
	int BUILT_IN_SORT = 9;

	/**
	 * The number of structural features of the '<em>Built In Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetSortImpl <em>Multi Set Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetSortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getMultiSetSort()
	 * @generated
	 */
	int MULTI_SET_SORT = 10;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SET_SORT__BASIS = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Set Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SET_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.ProductSortImpl <em>Product Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.ProductSortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getProductSort()
	 * @generated
	 */
	int PRODUCT_SORT = 11;

	/**
	 * The feature id for the '<em><b>Element Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT__ELEMENT_SORT = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserSortImpl <em>User Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserSortImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getUserSort()
	 * @generated
	 */
	int USER_SORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__NAME = SORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT__DECLARATION = SORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl <em>Built In Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInOperator()
	 * @generated
	 */
	int BUILT_IN_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Built In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInConstImpl <em>Built In Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInConstImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInConst()
	 * @generated
	 */
	int BUILT_IN_CONST = 14;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONST__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Built In Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_CONST_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl <em>Multi Set Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getMultiSetOperator()
	 * @generated
	 */
	int MULTI_SET_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SET_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Multi Set Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SET_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TupleImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 16;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl <em>User Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getUserOperator()
	 * @generated
	 */
	int USER_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__SUBTERM = OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__NAME = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR__DECLARATION = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl <em>Operator Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getOperatorDecl()
	 * @generated
	 */
	int OPERATOR_DECL = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL__NAME = DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Operator Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl <em>Named Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getNamedOperator()
	 * @generated
	 */
	int NAMED_OPERATOR = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__ID = OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__NAME = OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__PARAMETERS = OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR__DEF = OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATOR_FEATURE_COUNT = OPERATOR_DECL_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarations</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations
	 * @generated
	 */
	EClass getDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations#getDeclaration()
	 * @see #getDeclarations()
	 * @generated
	 */
	EReference getDeclarations_Declaration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl <em>Sort Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Decl</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl
	 * @generated
	 */
	EClass getSortDecl();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl#getSort()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Sort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable#getRefvariable <em>Refvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refvariable</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable#getRefvariable()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Refvariable();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator#getSubterm <em>Subterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subterm</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator#getSubterm()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Subterm();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort <em>Named Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort
	 * @generated
	 */
	EClass getNamedSort();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort#getDef()
	 * @see #getNamedSort()
	 * @generated
	 */
	EReference getNamedSort_Def();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort <em>Built In Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort
	 * @generated
	 */
	EClass getBuiltInSort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort <em>Multi Set Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Set Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort
	 * @generated
	 */
	EClass getMultiSetSort();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort#getBasis()
	 * @see #getMultiSetSort()
	 * @generated
	 */
	EReference getMultiSetSort_Basis();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort <em>Product Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort
	 * @generated
	 */
	EClass getProductSort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort#getElementSort()
	 * @see #getProductSort()
	 * @generated
	 */
	EReference getProductSort_ElementSort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort <em>User Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Sort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort
	 * @generated
	 */
	EClass getUserSort();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort#getDeclaration()
	 * @see #getUserSort()
	 * @generated
	 */
	EReference getUserSort_Declaration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator
	 * @generated
	 */
	EClass getBuiltInOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst <em>Built In Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Const</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst
	 * @generated
	 */
	EClass getBuiltInConst();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator <em>Multi Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Set Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator
	 * @generated
	 */
	EClass getMultiSetOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator <em>User Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator
	 * @generated
	 */
	EClass getUserOperator();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator#getDeclaration()
	 * @see #getUserOperator()
	 * @generated
	 */
	EReference getUserOperator_Declaration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl <em>Operator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Decl</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl
	 * @generated
	 */
	EClass getOperatorDecl();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator <em>Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator
	 * @generated
	 */
	EClass getNamedOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getParameters()
	 * @see #getNamedOperator()
	 * @generated
	 */
	EReference getNamedOperator_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getDef()
	 * @see #getNamedOperator()
	 * @generated
	 */
	EReference getNamedOperator_Def();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationsImpl <em>Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationsImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getDeclarations()
		 * @generated
		 */
		EClass DECLARATIONS = eINSTANCE.getDeclarations();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIONS__DECLARATION = eINSTANCE.getDeclarations_Declaration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.DeclarationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortDeclImpl <em>Sort Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortDeclImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getSortDecl()
		 * @generated
		 */
		EClass SORT_DECL = eINSTANCE.getSortDecl();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableDeclImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__SORT = eINSTANCE.getVariableDecl_Sort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Refvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__REFVARIABLE = eINSTANCE.getVariable_Refvariable();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Subterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__SUBTERM = eINSTANCE.getOperator_Subterm();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedSortImpl <em>Named Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedSortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getNamedSort()
		 * @generated
		 */
		EClass NAMED_SORT = eINSTANCE.getNamedSort();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_SORT__DEF = eINSTANCE.getNamedSort_Def();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl <em>Built In Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInSort()
		 * @generated
		 */
		EClass BUILT_IN_SORT = eINSTANCE.getBuiltInSort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetSortImpl <em>Multi Set Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetSortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getMultiSetSort()
		 * @generated
		 */
		EClass MULTI_SET_SORT = eINSTANCE.getMultiSetSort();

		/**
		 * The meta object literal for the '<em><b>Basis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_SET_SORT__BASIS = eINSTANCE.getMultiSetSort_Basis();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.ProductSortImpl <em>Product Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.ProductSortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getProductSort()
		 * @generated
		 */
		EClass PRODUCT_SORT = eINSTANCE.getProductSort();

		/**
		 * The meta object literal for the '<em><b>Element Sort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SORT__ELEMENT_SORT = eINSTANCE.getProductSort_ElementSort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserSortImpl <em>User Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserSortImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getUserSort()
		 * @generated
		 */
		EClass USER_SORT = eINSTANCE.getUserSort();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SORT__DECLARATION = eINSTANCE.getUserSort_Declaration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl <em>Built In Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInOperator()
		 * @generated
		 */
		EClass BUILT_IN_OPERATOR = eINSTANCE.getBuiltInOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInConstImpl <em>Built In Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInConstImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getBuiltInConst()
		 * @generated
		 */
		EClass BUILT_IN_CONST = eINSTANCE.getBuiltInConst();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl <em>Multi Set Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getMultiSetOperator()
		 * @generated
		 */
		EClass MULTI_SET_OPERATOR = eINSTANCE.getMultiSetOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TupleImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl <em>User Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getUserOperator()
		 * @generated
		 */
		EClass USER_OPERATOR = eINSTANCE.getUserOperator();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_OPERATOR__DECLARATION = eINSTANCE.getUserOperator_Declaration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl <em>Operator Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getOperatorDecl()
		 * @generated
		 */
		EClass OPERATOR_DECL = eINSTANCE.getOperatorDecl();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl <em>Named Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl#getNamedOperator()
		 * @generated
		 */
		EClass NAMED_OPERATOR = eINSTANCE.getNamedOperator();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_OPERATOR__PARAMETERS = eINSTANCE.getNamedOperator_Parameters();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_OPERATOR__DEF = eINSTANCE.getNamedOperator_Def();

	}

} //TermsPackage
