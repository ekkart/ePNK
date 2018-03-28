/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortDeclImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl#getPartitionElements <em>Partition Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionImpl extends SortDeclImpl implements Partition {
	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Sort def;

	/**
	 * The cached value of the '{@link #getPartitionElements() <em>Partition Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PartitionElement> partitionElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(Sort newDef, NotificationChain msgs) {
		Sort oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitionsPackage.PARTITION__DEF, oldDef, newDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(Sort newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitionsPackage.PARTITION__DEF, null, msgs);
			if (newDef != null)
				msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitionsPackage.PARTITION__DEF, null, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitionsPackage.PARTITION__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartitionElement> getPartitionElements() {
		if (partitionElements == null) {
			partitionElements = new EObjectContainmentEList<PartitionElement>(PartitionElement.class, this, PartitionsPackage.PARTITION__PARTITION_ELEMENTS);
		}
		return partitionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartitionsPackage.PARTITION__DEF:
				return basicSetDef(null, msgs);
			case PartitionsPackage.PARTITION__PARTITION_ELEMENTS:
				return ((InternalEList<?>)getPartitionElements()).basicRemove(otherEnd, msgs);
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
			case PartitionsPackage.PARTITION__DEF:
				return getDef();
			case PartitionsPackage.PARTITION__PARTITION_ELEMENTS:
				return getPartitionElements();
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
			case PartitionsPackage.PARTITION__DEF:
				setDef((Sort)newValue);
				return;
			case PartitionsPackage.PARTITION__PARTITION_ELEMENTS:
				getPartitionElements().clear();
				getPartitionElements().addAll((Collection<? extends PartitionElement>)newValue);
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
			case PartitionsPackage.PARTITION__DEF:
				setDef((Sort)null);
				return;
			case PartitionsPackage.PARTITION__PARTITION_ELEMENTS:
				getPartitionElements().clear();
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
			case PartitionsPackage.PARTITION__DEF:
				return def != null;
			case PartitionsPackage.PARTITION__PARTITION_ELEMENTS:
				return partitionElements != null && !partitionElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}


	@Override
	// @generated NOT
	// @author eki
	public Sort resolve(Set<SortDecl> declarations) {
		Sort sort = this.getDef();
		if (sort.resolve(declarations) != null) {
			// only if this sort resolves, it will be returned this
			// Partition as a userSort
			UserSort userSort = TermsFactory.eINSTANCE.createUserSort();
			userSort.setDeclaration(this);
			return userSort;
		}
		return null;
	}
} //PartitionImpl
