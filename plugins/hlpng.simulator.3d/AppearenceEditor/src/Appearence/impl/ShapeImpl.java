/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Appearence.impl;

import Appearence.AppearencePackage;
import Appearence.Shape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Appearence.impl.ShapeImpl#getObjectStringPath <em>Object String Path</em>}</li>
 *   <li>{@link Appearence.impl.ShapeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends EObjectImpl implements Shape {
	/**
	 * The default value of the '{@link #getObjectStringPath() <em>Object String Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectStringPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_STRING_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectStringPath() <em>Object String Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectStringPath()
	 * @generated
	 * @ordered
	 */
	protected String objectStringPath = OBJECT_STRING_PATH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearencePackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectStringPath() {
		return objectStringPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectStringPath(String newObjectStringPath) {
		String oldObjectStringPath = objectStringPath;
		objectStringPath = newObjectStringPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearencePackage.SHAPE__OBJECT_STRING_PATH, oldObjectStringPath, objectStringPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppearencePackage.SHAPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppearencePackage.SHAPE__OBJECT_STRING_PATH:
				return getObjectStringPath();
			case AppearencePackage.SHAPE__ID:
				return getId();
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
			case AppearencePackage.SHAPE__OBJECT_STRING_PATH:
				setObjectStringPath((String)newValue);
				return;
			case AppearencePackage.SHAPE__ID:
				setId((String)newValue);
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
			case AppearencePackage.SHAPE__OBJECT_STRING_PATH:
				setObjectStringPath(OBJECT_STRING_PATH_EDEFAULT);
				return;
			case AppearencePackage.SHAPE__ID:
				setId(ID_EDEFAULT);
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
			case AppearencePackage.SHAPE__OBJECT_STRING_PATH:
				return OBJECT_STRING_PATH_EDEFAULT == null ? objectStringPath != null : !OBJECT_STRING_PATH_EDEFAULT.equals(objectStringPath);
			case AppearencePackage.SHAPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (ObjectStringPath: ");
		result.append(objectStringPath);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
