/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SortDeclImpl extends DeclarationImpl implements SortDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.SORT_DECL;
	}

	// @generated NOT
	@Override
	public Sort resolve(Set<SortDecl> declarations) {
		// if the subclass of a sort declaration do not specify
		// their resolution, two sorts will be equal, if they
		// refer to the same declaration. This is achieved by
		// returning a UserSort with a reference to that declaration
		// and the equality of UserSorts.
		UserSort us = new UserSortImpl();
		us.setDeclaration(this);
		us.setName(this.getName());
		return us;
	}
	
	

} //SortDeclImpl
