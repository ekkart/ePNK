/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FEConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl.FiniteEnumerationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FiniteEnumerationImpl extends BuiltInSortImpl implements FiniteEnumeration {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FEConstant> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiniteenumerationsPackage.Literals.FINITE_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FEConstant> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FEConstant>(FEConstant.class, this, FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS:
				return getElements();
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
			case FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FEConstant>)newValue);
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
			case FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS:
				getElements().clear();
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
			case FiniteenumerationsPackage.FINITE_ENUMERATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort clone() {
		ProxySort proxy = HlpnghelpersFactory.eINSTANCE.createProxySort();
		proxy.setSort(this);
		return proxy;
	}

	@Override
	// @generated NOT
	// @author eki
	public boolean equals(Sort sort) {
		if (sort != null) {
			if (sort instanceof FiniteEnumeration) {
				return this == sort;
			} else if (sort instanceof ProxySort) {
				return this.equals(((ProxySort)sort).getSort()); 
			}
		}
		return false;
	}

} //FiniteEnumerationImpl
