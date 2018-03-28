/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SortImpl extends EObjectImpl implements Sort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(Sort sort) {
		// This is the standard implementation of equality for sorts
		// (it is referring to the same class). For some sorts this needs to 
		// be overwritten though
		return this.eClass().equals(sort.eClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSuperSortOf(Sort sort) {
		// This is the standard implementation of equality for being a super sort
		// (it is referring to the same class). For some sorts this needs to 
		// be overwritten though
		return this.equals(sort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sort leastCommonSuper(Sort sort) {
		// This is the standard implementation of equality for the least common
		// super sort (it is referring to the same class). For some sorts this needs
		// to be overwritten though
		if (! this.equals(sort)) {
			return null;
		} else {
			return this.clone();
		}
	}

	// @generated NOT
	@Override
	public Sort resolve(Set<SortDecl> declarations) {
		// This is the standard way of resolving a sort, a clone
		// of the sort itself (which works for all atomic sorts).
		// Sorts referring to subsorts, must overwrite this method.
		return this.clone();
	}

	@Override
	public Sort clone() {
		// This is the standard way of cloning a sort. More complex
		// sorts need to overwrite this method.

		EClass eClass = this.eClass();
		return (Sort) eClass.getEPackage().getEFactoryInstance().create(eClass);
		// return (Sort) this.eClass().getInstanceClass().newInstance();

	}
	
} //SortImpl
