/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory
 * @model kind="package"
 * @generated
 */
public interface ListsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lists";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/lists";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lists";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 0;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BASIS = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = TermsPackage.BUILT_IN_SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.EmptyListImpl <em>Empty List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.EmptyListImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getEmptyList()
	 * @generated
	 */
	int EMPTY_LIST = 1;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__SUBTERM = TermsPackage.BUILT_IN_CONST__SUBTERM;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST__REFSORT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LIST_FEATURE_COUNT = TermsPackage.BUILT_IN_CONST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListOperatorImpl <em>List Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getListOperator()
	 * @generated
	 */
	int LIST_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MakeListImpl <em>Make List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MakeListImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getMakeList()
	 * @generated
	 */
	int MAKE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Refsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST__REFSORT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Make List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_LIST_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ConcatenationImpl <em>Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ConcatenationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getConcatenation()
	 * @generated
	 */
	int CONCATENATION = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.LengthImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MemberAtIndexImpl <em>Member At Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MemberAtIndexImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getMemberAtIndex()
	 * @generated
	 */
	int MEMBER_AT_INDEX = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX__INDEX = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member At Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_AT_INDEX_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.AppendImpl <em>Append</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.AppendImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getAppend()
	 * @generated
	 */
	int APPEND = 6;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Append</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl <em>Sublist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getSublist()
	 * @generated
	 */
	int SUBLIST = 7;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__SUBTERM = LIST_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__START = LIST_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST__LENGTH = LIST_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sublist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBLIST_FEATURE_COUNT = LIST_OPERATOR_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List#getBasis()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Basis();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.EmptyList <em>Empty List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty List</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.EmptyList
	 * @generated
	 */
	EClass getEmptyList();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.EmptyList#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.EmptyList#getRefsort()
	 * @see #getEmptyList()
	 * @generated
	 */
	EReference getEmptyList_Refsort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList <em>Make List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make List</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList
	 * @generated
	 */
	EClass getMakeList();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsort</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList#getRefsort()
	 * @see #getMakeList()
	 * @generated
	 */
	EReference getMakeList_Refsort();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Concatenation <em>Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenation</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Concatenation
	 * @generated
	 */
	EClass getConcatenation();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex <em>Member At Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member At Index</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex
	 * @generated
	 */
	EClass getMemberAtIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex#getIndex()
	 * @see #getMemberAtIndex()
	 * @generated
	 */
	EAttribute getMemberAtIndex_Index();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Append <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Append
	 * @generated
	 */
	EClass getAppend();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist <em>Sublist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sublist</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist
	 * @generated
	 */
	EClass getSublist();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist#getStart()
	 * @see #getSublist()
	 * @generated
	 */
	EAttribute getSublist_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist#getLength()
	 * @see #getSublist()
	 * @generated
	 */
	EAttribute getSublist_Length();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListOperator <em>List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListOperator
	 * @generated
	 */
	EClass getListOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListsFactory getListsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Basis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__BASIS = eINSTANCE.getList_Basis();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.EmptyListImpl <em>Empty List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.EmptyListImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getEmptyList()
		 * @generated
		 */
		EClass EMPTY_LIST = eINSTANCE.getEmptyList();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY_LIST__REFSORT = eINSTANCE.getEmptyList_Refsort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MakeListImpl <em>Make List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MakeListImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getMakeList()
		 * @generated
		 */
		EClass MAKE_LIST = eINSTANCE.getMakeList();

		/**
		 * The meta object literal for the '<em><b>Refsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_LIST__REFSORT = eINSTANCE.getMakeList_Refsort();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ConcatenationImpl <em>Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ConcatenationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getConcatenation()
		 * @generated
		 */
		EClass CONCATENATION = eINSTANCE.getConcatenation();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.LengthImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MemberAtIndexImpl <em>Member At Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MemberAtIndexImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getMemberAtIndex()
		 * @generated
		 */
		EClass MEMBER_AT_INDEX = eINSTANCE.getMemberAtIndex();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_AT_INDEX__INDEX = eINSTANCE.getMemberAtIndex_Index();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.AppendImpl <em>Append</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.AppendImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getAppend()
		 * @generated
		 */
		EClass APPEND = eINSTANCE.getAppend();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl <em>Sublist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getSublist()
		 * @generated
		 */
		EClass SUBLIST = eINSTANCE.getSublist();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBLIST__START = eINSTANCE.getSublist_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBLIST__LENGTH = eINSTANCE.getSublist_Length();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListOperatorImpl <em>List Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsPackageImpl#getListOperator()
		 * @generated
		 */
		EClass LIST_OPERATOR = eINSTANCE.getListOperator();

	}

} //ListsPackage
