/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Set Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetSortImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiSetSortImpl extends SortImpl implements MultiSetSort {
	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected Sort basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiSetSortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.MULTI_SET_SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(Sort newBasis, NotificationChain msgs) {
		Sort oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.MULTI_SET_SORT__BASIS, oldBasis, newBasis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasis(Sort newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject)basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.MULTI_SET_SORT__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject)newBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.MULTI_SET_SORT__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.MULTI_SET_SORT__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.MULTI_SET_SORT__BASIS:
				return basicSetBasis(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermsPackage.MULTI_SET_SORT__BASIS:
				return getBasis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermsPackage.MULTI_SET_SORT__BASIS:
				setBasis((Sort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermsPackage.MULTI_SET_SORT__BASIS:
				setBasis((Sort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermsPackage.MULTI_SET_SORT__BASIS:
				return basis != null;
		}
		return super.eIsSet(featureID);
	}

	
	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#equals(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public boolean equals(Sort sort) {
		if (sort != null && sort instanceof MultiSetSort) {
		    MultiSetSort msSort = (MultiSetSort) sort;
			Sort basisSort1 = this.getBasis();
			Sort basisSort2 = msSort.getBasis();

			if (basisSort1 != null && basisSort2 != null) {
				return basisSort1.equals(basisSort2);
			}
			
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#leastCommonSuper(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public Sort leastCommonSuper(Sort sort) {
		if (sort != null && sort instanceof MultiSetSort) {
		    MultiSetSort msSort = (MultiSetSort) sort;
			Sort basisSort1 = this.getBasis();
			Sort basisSort2 = msSort.getBasis();
		

			if (basisSort1 != null && basisSort2 != null) {
				Sort leastCommonSuperSort = basisSort1.leastCommonSuper(basisSort2);
				if (leastCommonSuperSort != null) {
					MultiSetSort result = TermsFactory.eINSTANCE.createMultiSetSort();
					result.setBasis(leastCommonSuperSort);
					return result;
				}
			}
			
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#subsortOf(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public boolean isSuperSortOf(Sort sort) {
		if (sort != null && sort instanceof MultiSetSort) {
		    MultiSetSort msSort = (MultiSetSort) sort;
			Sort basisSort1 = this.getBasis();
			Sort basisSort2 = msSort.getBasis();

			if (basisSort1 != null && basisSort2 != null) {
				return basisSort1.isSuperSortOf(basisSort2);
			}
			
		}
		return false;
	}

	// @generated NOT
	@Override
	public Sort resolve(Set<SortDecl> declarations) {
		MultiSetSort ms = new MultiSetSortImpl();
		Sort basis = this.getBasis().resolve(declarations);
		if (basis == null) {
			return null;
		}
		ms.setBasis(basis);
		return ms;
	}

	// @generated NOT
	@Override
	public Sort clone() {
		MultiSetSort ms = new MultiSetSortImpl();
		ms.setBasis(this.getBasis().clone());
		return ms;
	}
	
	
	
} //MultiSetSortImpl
