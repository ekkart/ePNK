/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage
 * @generated
 */
public interface TermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declarations</em>'.
	 * @generated
	 */
	Declarations createDeclarations();

	/**
	 * Returns a new object of class '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Decl</em>'.
	 * @generated
	 */
	VariableDecl createVariableDecl();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Named Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Sort</em>'.
	 * @generated
	 */
	NamedSort createNamedSort();

	/**
	 * Returns a new object of class '<em>Multi Set Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Set Sort</em>'.
	 * @generated
	 */
	MultiSetSort createMultiSetSort();

	/**
	 * Returns a new object of class '<em>Product Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Sort</em>'.
	 * @generated
	 */
	ProductSort createProductSort();

	/**
	 * Returns a new object of class '<em>User Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Sort</em>'.
	 * @generated
	 */
	UserSort createUserSort();

	/**
	 * Returns a new object of class '<em>Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple</em>'.
	 * @generated
	 */
	Tuple createTuple();

	/**
	 * Returns a new object of class '<em>User Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Operator</em>'.
	 * @generated
	 */
	UserOperator createUserOperator();

	/**
	 * Returns a new object of class '<em>Named Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Operator</em>'.
	 * @generated
	 */
	NamedOperator createNamedOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TermsPackage getTermsPackage();

} //TermsFactory
