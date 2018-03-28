/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor.impl;

import geditor.GObject;
import geditor.GeditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geditor.impl.GObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link geditor.impl.GObjectImpl#getAppearancePath <em>Appearance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GObjectImpl extends EObjectImpl implements GObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppearancePath() <em>Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearancePath()
	 * @generated
	 * @ordered
	 */
	protected static final String APPEARANCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppearancePath() <em>Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearancePath()
	 * @generated
	 * @ordered
	 */
	protected String appearancePath = APPEARANCE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeditorPackage.Literals.GOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeditorPackage.GOBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppearancePath() {
		return appearancePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearancePath(String newAppearancePath) {
		String oldAppearancePath = appearancePath;
		appearancePath = newAppearancePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeditorPackage.GOBJECT__APPEARANCE_PATH, oldAppearancePath, appearancePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeditorPackage.GOBJECT__ID:
				return getId();
			case GeditorPackage.GOBJECT__APPEARANCE_PATH:
				return getAppearancePath();
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
			case GeditorPackage.GOBJECT__ID:
				setId((String)newValue);
				return;
			case GeditorPackage.GOBJECT__APPEARANCE_PATH:
				setAppearancePath((String)newValue);
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
			case GeditorPackage.GOBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case GeditorPackage.GOBJECT__APPEARANCE_PATH:
				setAppearancePath(APPEARANCE_PATH_EDEFAULT);
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
			case GeditorPackage.GOBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GeditorPackage.GOBJECT__APPEARANCE_PATH:
				return APPEARANCE_PATH_EDEFAULT == null ? appearancePath != null : !APPEARANCE_PATH_EDEFAULT.equals(appearancePath);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", appearancePath: ");
		result.append(appearancePath);
		result.append(')');
		return result.toString();
	}

} //GObjectImpl
