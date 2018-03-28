/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Make List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.MakeListImpl#getRefsort <em>Refsort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MakeListImpl extends ListOperatorImpl implements MakeList {
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
	protected MakeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.MAKE_LIST;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListsPackage.MAKE_LIST__REFSORT, oldRefsort, newRefsort);
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
				msgs = ((InternalEObject)refsort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListsPackage.MAKE_LIST__REFSORT, null, msgs);
			if (newRefsort != null)
				msgs = ((InternalEObject)newRefsort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListsPackage.MAKE_LIST__REFSORT, null, msgs);
			msgs = basicSetRefsort(newRefsort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListsPackage.MAKE_LIST__REFSORT, newRefsort, newRefsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListsPackage.MAKE_LIST__REFSORT:
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
			case ListsPackage.MAKE_LIST__REFSORT:
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
			case ListsPackage.MAKE_LIST__REFSORT:
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
			case ListsPackage.MAKE_LIST__REFSORT:
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
			case ListsPackage.MAKE_LIST__REFSORT:
				return refsort != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		Sort basis = this.getRefsort();
		
		if (basis == null) {
			return null;
		}
		
		basis = basis.resolve(null);
		
		if (basis == null) {
			return null;
		}
		
		for (Term term : this.getSubterm()) {
			Sort sort = term.getSort();
			if (!basis.isSuperSortOf(sort)) {
				return null;
			}
		}
		
	    List listSort = ListsFactory.eINSTANCE.createList();
    	listSort.setBasis(basis);	

        return listSort;
	}

} //MakeListImpl
