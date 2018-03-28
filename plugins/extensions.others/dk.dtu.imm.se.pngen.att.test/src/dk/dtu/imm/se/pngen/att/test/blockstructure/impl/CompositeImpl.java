/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure.impl;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Composite;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.CompositeImpl#getSubblocks <em>Subblocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompositeImpl extends BlockImpl implements Composite {
	/**
	 * The cached value of the '{@link #getSubblocks() <em>Subblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> subblocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockstructurePackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getSubblocks() {
		if (subblocks == null) {
			subblocks = new EObjectContainmentEList<Block>(Block.class, this, BlockstructurePackage.COMPOSITE__SUBBLOCKS);
		}
		return subblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockstructurePackage.COMPOSITE__SUBBLOCKS:
				return ((InternalEList<?>)getSubblocks()).basicRemove(otherEnd, msgs);
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
			case BlockstructurePackage.COMPOSITE__SUBBLOCKS:
				return getSubblocks();
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
			case BlockstructurePackage.COMPOSITE__SUBBLOCKS:
				getSubblocks().clear();
				getSubblocks().addAll((Collection<? extends Block>)newValue);
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
			case BlockstructurePackage.COMPOSITE__SUBBLOCKS:
				getSubblocks().clear();
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
			case BlockstructurePackage.COMPOSITE__SUBBLOCKS:
				return subblocks != null && !subblocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
