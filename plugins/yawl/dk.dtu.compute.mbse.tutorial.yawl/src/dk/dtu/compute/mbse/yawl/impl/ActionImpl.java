/**
 */
package dk.dtu.compute.mbse.yawl.impl;

import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.TransitionType;
import dk.dtu.compute.mbse.yawl.YawlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.yawl.impl.ActionImpl#getJointype <em>Jointype</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.yawl.impl.ActionImpl#getSplitType <em>Split Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends TransitionImpl implements Action {
	/**
	 * The cached value of the '{@link #getJointype() <em>Jointype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointype()
	 * @generated
	 * @ordered
	 */
	protected TransitionType jointype;

	/**
	 * The cached value of the '{@link #getSplitType() <em>Split Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitType()
	 * @generated
	 * @ordered
	 */
	protected TransitionType splitType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getJointype() {
		return jointype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointype(TransitionType newJointype, NotificationChain msgs) {
		TransitionType oldJointype = jointype;
		jointype = newJointype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.ACTION__JOINTYPE, oldJointype, newJointype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointype(TransitionType newJointype) {
		if (newJointype != jointype) {
			NotificationChain msgs = null;
			if (jointype != null)
				msgs = ((InternalEObject)jointype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.ACTION__JOINTYPE, null, msgs);
			if (newJointype != null)
				msgs = ((InternalEObject)newJointype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.ACTION__JOINTYPE, null, msgs);
			msgs = basicSetJointype(newJointype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.ACTION__JOINTYPE, newJointype, newJointype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getSplitType() {
		return splitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplitType(TransitionType newSplitType, NotificationChain msgs) {
		TransitionType oldSplitType = splitType;
		splitType = newSplitType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.ACTION__SPLIT_TYPE, oldSplitType, newSplitType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitType(TransitionType newSplitType) {
		if (newSplitType != splitType) {
			NotificationChain msgs = null;
			if (splitType != null)
				msgs = ((InternalEObject)splitType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.ACTION__SPLIT_TYPE, null, msgs);
			if (newSplitType != null)
				msgs = ((InternalEObject)newSplitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.ACTION__SPLIT_TYPE, null, msgs);
			msgs = basicSetSplitType(newSplitType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.ACTION__SPLIT_TYPE, newSplitType, newSplitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlPackage.ACTION__JOINTYPE:
				return basicSetJointype(null, msgs);
			case YawlPackage.ACTION__SPLIT_TYPE:
				return basicSetSplitType(null, msgs);
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
			case YawlPackage.ACTION__JOINTYPE:
				return getJointype();
			case YawlPackage.ACTION__SPLIT_TYPE:
				return getSplitType();
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
			case YawlPackage.ACTION__JOINTYPE:
				setJointype((TransitionType)newValue);
				return;
			case YawlPackage.ACTION__SPLIT_TYPE:
				setSplitType((TransitionType)newValue);
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
			case YawlPackage.ACTION__JOINTYPE:
				setJointype((TransitionType)null);
				return;
			case YawlPackage.ACTION__SPLIT_TYPE:
				setSplitType((TransitionType)null);
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
			case YawlPackage.ACTION__JOINTYPE:
				return jointype != null;
			case YawlPackage.ACTION__SPLIT_TYPE:
				return splitType != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
