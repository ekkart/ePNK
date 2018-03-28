/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl.ProxySortImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxySortImpl extends SortImpl implements ProxySort {
	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxySortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpnghelpersPackage.Literals.PROXY_SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		if (sort != null && sort.eIsProxy()) {
			InternalEObject oldSort = (InternalEObject)sort;
			sort = (Sort)eResolveProxy(oldSort);
			if (sort != oldSort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HlpnghelpersPackage.PROXY_SORT__SORT, oldSort, sort));
			}
		}
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort basicGetSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(Sort newSort) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpnghelpersPackage.PROXY_SORT__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HlpnghelpersPackage.PROXY_SORT__SORT:
				if (resolve) return getSort();
				return basicGetSort();
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
			case HlpnghelpersPackage.PROXY_SORT__SORT:
				setSort((Sort)newValue);
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
			case HlpnghelpersPackage.PROXY_SORT__SORT:
				setSort((Sort)null);
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
			case HlpnghelpersPackage.PROXY_SORT__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort clone() {
		ProxySort sort = new ProxySortImpl();
		sort.setSort(this.getSort());
		return sort;
	}

	@Override
	// @generated NOT
	// @author eki
	public boolean equals(Sort sort) {
		Sort refSort = this.getSort();
		if (refSort != null && sort != null) {
			if (sort instanceof ProxySort) {
				return refSort.equals(((ProxySort) sort).getSort());
			} else {
				return refSort.equals(sort.resolve(null));
			}
		}
		return false;
	}

	@Override
	// @generated NOT
	// @author eki
	public boolean isSuperSortOf(Sort sort) {
		Sort refSort = this.getSort();
		if (refSort != null && sort != null) {
			if (sort instanceof ProxySort) {
				return refSort.isSuperSortOf(((ProxySort) sort).getSort());
			} else {
				return refSort.isSuperSortOf(sort);
			}
		}
		return false;
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort leastCommonSuper(Sort sort) {
		Sort refSort = this.getSort();
		if (refSort != null && sort != null) {
			if (sort instanceof ProxySort) {
				return refSort.leastCommonSuper(((ProxySort) sort).getSort());
			} else {
				return refSort.leastCommonSuper(sort);
			}
		}
		return null;
	}

	@Override
	public Sort resolve(Set<SortDecl> declarations) {
		Sort refSort = this.getSort();
		if (refSort != null) {
			return refSort.resolve(declarations);
		}
		return null;
	}

} //ProxySortImpl
