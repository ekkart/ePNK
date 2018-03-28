/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListsFactoryImpl extends EFactoryImpl implements ListsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListsFactory init() {
		try {
			ListsFactory theListsFactory = (ListsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/lists"); 
			if (theListsFactory != null) {
				return theListsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ListsPackage.LIST: return createList();
			case ListsPackage.EMPTY_LIST: return createEmptyList();
			case ListsPackage.MAKE_LIST: return createMakeList();
			case ListsPackage.CONCATENATION: return createConcatenation();
			case ListsPackage.LENGTH: return createLength();
			case ListsPackage.MEMBER_AT_INDEX: return createMemberAtIndex();
			case ListsPackage.APPEND: return createAppend();
			case ListsPackage.SUBLIST: return createSublist();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyList createEmptyList() {
		EmptyListImpl emptyList = new EmptyListImpl();
		return emptyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeList createMakeList() {
		MakeListImpl makeList = new MakeListImpl();
		return makeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concatenation createConcatenation() {
		ConcatenationImpl concatenation = new ConcatenationImpl();
		return concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberAtIndex createMemberAtIndex() {
		MemberAtIndexImpl memberAtIndex = new MemberAtIndexImpl();
		return memberAtIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Append createAppend() {
		AppendImpl append = new AppendImpl();
		return append;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sublist createSublist() {
		SublistImpl sublist = new SublistImpl();
		return sublist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListsPackage getListsPackage() {
		return (ListsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListsPackage getPackage() {
		return ListsPackage.eINSTANCE;
	}

} //ListsFactoryImpl
