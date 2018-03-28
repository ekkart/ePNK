/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.ProductSortImpl#getElementSort <em>Element Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductSortImpl extends SortImpl implements ProductSort {
	/**
	 * The cached value of the '{@link #getElementSort() <em>Element Sort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSort()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> elementSort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PRODUCT_SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sort> getElementSort() {
		if (elementSort == null) {
			elementSort = new EObjectContainmentEList<Sort>(Sort.class, this, TermsPackage.PRODUCT_SORT__ELEMENT_SORT);
		}
		return elementSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
				return ((InternalEList<?>)getElementSort()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
				return getElementSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
				getElementSort().clear();
				getElementSort().addAll((Collection<? extends Sort>)newValue);
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
			case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
				getElementSort().clear();
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
			case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
				return elementSort != null && !elementSort.isEmpty();
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
		if (sort != null && sort instanceof ProductSort) {
			ProductSort productSort = (ProductSort) sort;
			List<Sort> elementSorts1 = this.getElementSort();
			List<Sort> elementSorts2 = productSort.getElementSort();

			if (elementSorts1.size() == elementSorts2.size()) {

				int n = elementSorts1.size();
				for (int i =0; i<n; i++) {
					Sort es1 = elementSorts1.get(i);
					Sort es2 = elementSorts2.get(i);
					if (! es1.equals(es2)) {
						return false;
					}
				}
				
				return true;
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
		if (sort != null && sort instanceof ProductSort) {
			ProductSort productSort = (ProductSort) sort;
			

			
			List<Sort> elementSorts1 = this.getElementSort();
			List<Sort> elementSorts2 = productSort.getElementSort();

			if (elementSorts1.size() == elementSorts2.size()) {
				
				ProductSort result = TermsFactory.eINSTANCE.createProductSort();
				List<Sort> rElementSorts = result.getElementSort();
				
				int n = elementSorts1.size();
				for (int i =0; i<n; i++) {
					Sort es1 = elementSorts1.get(i);
					Sort es2 = elementSorts2.get(i);
					
					Sort s = es1.leastCommonSuper(es2);
					if (s != null) {
						rElementSorts.add(s);
					} else {
						return null;
					}
				}
				
				return result;
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
		if (sort != null && sort instanceof ProductSort) {
			ProductSort productSort = (ProductSort) sort;
			List<Sort> elementSorts1 = this.getElementSort();
			List<Sort> elementSorts2 = productSort.getElementSort();

			if (elementSorts1.size() == elementSorts2.size()) {

				int n = elementSorts1.size();
				for (int i =0; i<n; i++) {
					Sort es1 = elementSorts1.get(i);
					Sort es2 = elementSorts2.get(i);
					if (! es1.isSuperSortOf(es2)) {
						return false;
					}
				}
				
				return true;
			}
			
		}
		return false;
	}

	@Override
	public Sort resolve(Set<SortDecl> declarations) {
		ProductSort ps = new ProductSortImpl();
		List<Sort> elementSorts  = ps.getElementSort();
		for (Sort es: this.getElementSort()) {
			Sort sort = es.resolve(declarations);
			if (sort == null) {
				return null;
			}
			elementSorts.add(sort);
		}
		return ps;
	}

	@Override
	public Sort clone() {
		ProductSort ps = new ProductSortImpl();
		List<Sort> elementSorts  = ps.getElementSort();
		for (Sort es: this.getElementSort()) {
			elementSorts.add(es.clone());
		}
		return ps;
	}

	
	
} //ProductSortImpl
