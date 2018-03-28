/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.test.type.refnodeextensions.API;
import org.pnml.tools.epnk.test.type.refnodeextensions.Page;
import org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl#getPragmatics <em>Pragmatics</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl#getApi <em>Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl implements Page {
	/**
	 * The cached value of the '{@link #getPragmatics() <em>Pragmatics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmatics()
	 * @generated
	 * @ordered
	 */
	protected EList<Pragmatics> pragmatics;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected API api;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefnodeextensionsPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pragmatics> getPragmatics() {
		if (pragmatics == null) {
			pragmatics = new EObjectContainmentEList<Pragmatics>(Pragmatics.class, this, RefnodeextensionsPackage.PAGE__PRAGMATICS);
		}
		return pragmatics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		API oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefnodeextensionsPackage.PAGE__API, oldApi, newApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject)api).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RefnodeextensionsPackage.PAGE__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RefnodeextensionsPackage.PAGE__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefnodeextensionsPackage.PAGE__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefnodeextensionsPackage.PAGE__PRAGMATICS:
				return ((InternalEList<?>)getPragmatics()).basicRemove(otherEnd, msgs);
			case RefnodeextensionsPackage.PAGE__API:
				return basicSetApi(null, msgs);
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
			case RefnodeextensionsPackage.PAGE__PRAGMATICS:
				return getPragmatics();
			case RefnodeextensionsPackage.PAGE__API:
				return getApi();
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
			case RefnodeextensionsPackage.PAGE__PRAGMATICS:
				getPragmatics().clear();
				getPragmatics().addAll((Collection<? extends Pragmatics>)newValue);
				return;
			case RefnodeextensionsPackage.PAGE__API:
				setApi((API)newValue);
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
			case RefnodeextensionsPackage.PAGE__PRAGMATICS:
				getPragmatics().clear();
				return;
			case RefnodeextensionsPackage.PAGE__API:
				setApi((API)null);
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
			case RefnodeextensionsPackage.PAGE__PRAGMATICS:
				return pragmatics != null && !pragmatics.isEmpty();
			case RefnodeextensionsPackage.PAGE__API:
				return api != null;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
