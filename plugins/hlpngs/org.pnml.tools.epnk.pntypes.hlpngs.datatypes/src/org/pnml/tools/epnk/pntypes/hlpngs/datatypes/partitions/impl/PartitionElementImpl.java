/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementImpl#getPartitionelementconstant <em>Partitionelementconstant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionElementImpl extends OperatorDeclImpl implements PartitionElement {
	/**
	 * The cached value of the '{@link #getPartitionelementconstant() <em>Partitionelementconstant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionelementconstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> partitionelementconstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.PARTITION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getPartitionelementconstant() {
		if (partitionelementconstant == null) {
			partitionelementconstant = new EObjectContainmentEList<Term>(Term.class, this, PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT);
		}
		return partitionelementconstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				return ((InternalEList<?>)getPartitionelementconstant()).basicRemove(otherEnd, msgs);
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
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				return getPartitionelementconstant();
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
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				getPartitionelementconstant().clear();
				getPartitionelementconstant().addAll((Collection<? extends Term>)newValue);
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
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				getPartitionelementconstant().clear();
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
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				return partitionelementconstant != null && !partitionelementconstant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	// @generated NOT
	// @author eki
	public EList<Sort> getInputSorts() {
		return new BasicEList<Sort>();
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getOutPutSort() {
		return getOutPutSort(null);
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getOutPutSort(Set<NamedOperator> used) {
		EObject parent = this.eContainer;
		if (parent != null && parent instanceof Partition) {
			Partition partition = (Partition) parent;
		  	UserSort userSort = TermsFactory.eINSTANCE.createUserSort();
		  	userSort.setDeclaration(partition);
		}
		return null;
	}

} //PartitionElementImpl
