/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefPlaceImpl#getPragmatics <em>Pragmatics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefPlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl implements RefPlace {
	/**
	 * The cached value of the '{@link #getPragmatics() <em>Pragmatics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmatics()
	 * @generated
	 * @ordered
	 */
	protected Pragmatics pragmatics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefnodeextensionsPackage.Literals.REF_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pragmatics getPragmatics() {
		return pragmatics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPragmatics(Pragmatics newPragmatics, NotificationChain msgs) {
		Pragmatics oldPragmatics = pragmatics;
		pragmatics = newPragmatics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefnodeextensionsPackage.REF_PLACE__PRAGMATICS, oldPragmatics, newPragmatics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPragmatics(Pragmatics newPragmatics) {
		if (newPragmatics != pragmatics) {
			NotificationChain msgs = null;
			if (pragmatics != null)
				msgs = ((InternalEObject)pragmatics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RefnodeextensionsPackage.REF_PLACE__PRAGMATICS, null, msgs);
			if (newPragmatics != null)
				msgs = ((InternalEObject)newPragmatics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RefnodeextensionsPackage.REF_PLACE__PRAGMATICS, null, msgs);
			msgs = basicSetPragmatics(newPragmatics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefnodeextensionsPackage.REF_PLACE__PRAGMATICS, newPragmatics, newPragmatics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefnodeextensionsPackage.REF_PLACE__PRAGMATICS:
				return basicSetPragmatics(null, msgs);
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
			case RefnodeextensionsPackage.REF_PLACE__PRAGMATICS:
				return getPragmatics();
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
			case RefnodeextensionsPackage.REF_PLACE__PRAGMATICS:
				setPragmatics((Pragmatics)newValue);
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
			case RefnodeextensionsPackage.REF_PLACE__PRAGMATICS:
				setPragmatics((Pragmatics)null);
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
			case RefnodeextensionsPackage.REF_PLACE__PRAGMATICS:
				return pragmatics != null;
		}
		return super.eIsSet(featureID);
	}

} //RefPlaceImpl
