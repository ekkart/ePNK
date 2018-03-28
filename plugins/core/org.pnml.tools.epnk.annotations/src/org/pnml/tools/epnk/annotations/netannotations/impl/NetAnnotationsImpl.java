/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getNetAnnotations <em>Net Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getObjectAnnotations <em>Object Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetAnnotationsImpl extends EObjectImpl implements NetAnnotations {
	/**
	 * The cached value of the '{@link #getNetAnnotations() <em>Net Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<NetAnnotation> netAnnotations;

	/**
	 * The cached value of the '{@link #getObjectAnnotations() <em>Object Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectAnnotation> objectAnnotations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected NetAnnotation current;

	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppVersion()
	 * @generated
	 * @ordered
	 */
	protected String appVersion = APP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetannotationsPackage.Literals.NET_ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetAnnotation> getNetAnnotations() {
		if (netAnnotations == null) {
			netAnnotations = new EObjectContainmentEList<NetAnnotation>(NetAnnotation.class, this, NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS);
		}
		return netAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectAnnotation> getObjectAnnotations() {
		if (objectAnnotations == null) {
			objectAnnotations = new EObjectContainmentEList<ObjectAnnotation>(ObjectAnnotation.class, this, NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS);
		}
		return objectAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetAnnotation getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = (InternalEObject)current;
			current = (NetAnnotation)eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetannotationsPackage.NET_ANNOTATIONS__CURRENT, oldCurrent, current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetAnnotation basicGetCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(NetAnnotation newCurrent) {
		NetAnnotation oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppVersion(String newAppVersion) {
		String oldAppVersion = appVersion;
		appVersion = newAppVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__APP_VERSION, oldAppVersion, appVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATIONS__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS:
				return ((InternalEList<?>)getNetAnnotations()).basicRemove(otherEnd, msgs);
			case NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS:
				return ((InternalEList<?>)getObjectAnnotations()).basicRemove(otherEnd, msgs);
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
			case NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS:
				return getNetAnnotations();
			case NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS:
				return getObjectAnnotations();
			case NetannotationsPackage.NET_ANNOTATIONS__NAME:
				return getName();
			case NetannotationsPackage.NET_ANNOTATIONS__DESCRIPTION:
				return getDescription();
			case NetannotationsPackage.NET_ANNOTATIONS__CURRENT:
				if (resolve) return getCurrent();
				return basicGetCurrent();
			case NetannotationsPackage.NET_ANNOTATIONS__APP_ID:
				return getAppId();
			case NetannotationsPackage.NET_ANNOTATIONS__APP_VERSION:
				return getAppVersion();
			case NetannotationsPackage.NET_ANNOTATIONS__DATE:
				return getDate();
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
			case NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				getNetAnnotations().addAll((Collection<? extends NetAnnotation>)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS:
				getObjectAnnotations().clear();
				getObjectAnnotations().addAll((Collection<? extends ObjectAnnotation>)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__NAME:
				setName((String)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__CURRENT:
				setCurrent((NetAnnotation)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__APP_ID:
				setAppId((String)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__APP_VERSION:
				setAppVersion((String)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__DATE:
				setDate((String)newValue);
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
			case NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS:
				getObjectAnnotations().clear();
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__CURRENT:
				setCurrent((NetAnnotation)null);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__APP_ID:
				setAppId(APP_ID_EDEFAULT);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__APP_VERSION:
				setAppVersion(APP_VERSION_EDEFAULT);
				return;
			case NetannotationsPackage.NET_ANNOTATIONS__DATE:
				setDate(DATE_EDEFAULT);
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
			case NetannotationsPackage.NET_ANNOTATIONS__NET_ANNOTATIONS:
				return netAnnotations != null && !netAnnotations.isEmpty();
			case NetannotationsPackage.NET_ANNOTATIONS__OBJECT_ANNOTATIONS:
				return objectAnnotations != null && !objectAnnotations.isEmpty();
			case NetannotationsPackage.NET_ANNOTATIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetannotationsPackage.NET_ANNOTATIONS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NetannotationsPackage.NET_ANNOTATIONS__CURRENT:
				return current != null;
			case NetannotationsPackage.NET_ANNOTATIONS__APP_ID:
				return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
			case NetannotationsPackage.NET_ANNOTATIONS__APP_VERSION:
				return APP_VERSION_EDEFAULT == null ? appVersion != null : !APP_VERSION_EDEFAULT.equals(appVersion);
			case NetannotationsPackage.NET_ANNOTATIONS__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", appId: ");
		result.append(appId);
		result.append(", appVersion: ");
		result.append(appVersion);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //NetAnnotationsImpl
