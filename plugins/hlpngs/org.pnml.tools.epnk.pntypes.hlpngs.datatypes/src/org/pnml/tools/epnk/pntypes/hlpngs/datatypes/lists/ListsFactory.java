/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage
 * @generated
 */
public interface ListsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.ListsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Empty List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty List</em>'.
	 * @generated
	 */
	EmptyList createEmptyList();

	/**
	 * Returns a new object of class '<em>Make List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make List</em>'.
	 * @generated
	 */
	MakeList createMakeList();

	/**
	 * Returns a new object of class '<em>Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concatenation</em>'.
	 * @generated
	 */
	Concatenation createConcatenation();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Member At Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member At Index</em>'.
	 * @generated
	 */
	MemberAtIndex createMemberAtIndex();

	/**
	 * Returns a new object of class '<em>Append</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Append</em>'.
	 * @generated
	 */
	Append createAppend();

	/**
	 * Returns a new object of class '<em>Sublist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sublist</em>'.
	 * @generated
	 */
	Sublist createSublist();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ListsPackage getListsPackage();

} //ListsFactory
