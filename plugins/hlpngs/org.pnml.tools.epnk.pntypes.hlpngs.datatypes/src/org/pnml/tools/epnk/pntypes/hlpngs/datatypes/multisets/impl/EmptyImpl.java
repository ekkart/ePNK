/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.EmptyImpl#getRefsort <em>Refsort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmptyImpl extends MultiSetOperatorImpl implements Empty {
	/**
	 * The cached value of the '{@link #getRefsort() <em>Refsort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsort()
	 * @generated
	 * @ordered
	 */
	protected Sort refsort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetsPackage.Literals.EMPTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getRefsort() {
		return refsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsort(Sort newRefsort, NotificationChain msgs) {
		Sort oldRefsort = refsort;
		refsort = newRefsort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultisetsPackage.EMPTY__REFSORT, oldRefsort, newRefsort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefsort(Sort newRefsort) {
		if (newRefsort != refsort) {
			NotificationChain msgs = null;
			if (refsort != null)
				msgs = ((InternalEObject)refsort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultisetsPackage.EMPTY__REFSORT, null, msgs);
			if (newRefsort != null)
				msgs = ((InternalEObject)newRefsort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultisetsPackage.EMPTY__REFSORT, null, msgs);
			msgs = basicSetRefsort(newRefsort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisetsPackage.EMPTY__REFSORT, newRefsort, newRefsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultisetsPackage.EMPTY__REFSORT:
				return basicSetRefsort(null, msgs);
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
			case MultisetsPackage.EMPTY__REFSORT:
				return getRefsort();
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
			case MultisetsPackage.EMPTY__REFSORT:
				setRefsort((Sort)newValue);
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
			case MultisetsPackage.EMPTY__REFSORT:
				setRefsort((Sort)null);
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
			case MultisetsPackage.EMPTY__REFSORT:
				return refsort != null;
		}
		return super.eIsSet(featureID);
	}

	// @generated NOT
	@Override	
	public Sort getSort() { 
		return getSort(null);
	}

	// @generated NOT
	@Override	
	public Sort getSort(Set<NamedOperator> used) {
		Sort sort = this.getRefsort();
		
		if (sort == null || this.getSubterm().size() > 0) {
			return null;
		}
		
		Sort basis = sort.resolve(null);
		if (basis != null) {
			MultiSetSort ms = TermsFactory.eINSTANCE.createMultiSetSort();
			ms.setBasis(basis);
			return ms;
		} else {
			return null;
		}
	}
	
} //EmptyImpl
