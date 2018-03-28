/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor.impl;

import geditor.GObject;
import geditor.GeditorPackage;
import geditor.Geometry;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geditor.impl.GeometryImpl#getGeometryObjects <em>Geometry Objects</em>}</li>
 *   <li>{@link geditor.impl.GeometryImpl#getGlobalAppearancePath <em>Global Appearance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryImpl extends EObjectImpl implements Geometry {
	/**
	 * The cached value of the '{@link #getGeometryObjects() <em>Geometry Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GObject> geometryObjects;
	/**
	 * The default value of the '{@link #getGlobalAppearancePath() <em>Global Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAppearancePath()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_APPEARANCE_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlobalAppearancePath() <em>Global Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAppearancePath()
	 * @generated
	 * @ordered
	 */
	protected String globalAppearancePath = GLOBAL_APPEARANCE_PATH_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeditorPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GObject> getGeometryObjects() {
		if (geometryObjects == null) {
			geometryObjects = new EObjectContainmentEList<GObject>(GObject.class, this, GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS);
		}
		return geometryObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalAppearancePath() {
		return globalAppearancePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalAppearancePath(String newGlobalAppearancePath) {
		String oldGlobalAppearancePath = globalAppearancePath;
		globalAppearancePath = newGlobalAppearancePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeditorPackage.GEOMETRY__GLOBAL_APPEARANCE_PATH, oldGlobalAppearancePath, globalAppearancePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS:
				return ((InternalEList<?>)getGeometryObjects()).basicRemove(otherEnd, msgs);
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
			case GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS:
				return getGeometryObjects();
			case GeditorPackage.GEOMETRY__GLOBAL_APPEARANCE_PATH:
				return getGlobalAppearancePath();
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
			case GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS:
				getGeometryObjects().clear();
				getGeometryObjects().addAll((Collection<? extends GObject>)newValue);
				return;
			case GeditorPackage.GEOMETRY__GLOBAL_APPEARANCE_PATH:
				setGlobalAppearancePath((String)newValue);
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
			case GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS:
				getGeometryObjects().clear();
				return;
			case GeditorPackage.GEOMETRY__GLOBAL_APPEARANCE_PATH:
				setGlobalAppearancePath(GLOBAL_APPEARANCE_PATH_EDEFAULT);
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
			case GeditorPackage.GEOMETRY__GEOMETRY_OBJECTS:
				return geometryObjects != null && !geometryObjects.isEmpty();
			case GeditorPackage.GEOMETRY__GLOBAL_APPEARANCE_PATH:
				return GLOBAL_APPEARANCE_PATH_EDEFAULT == null ? globalAppearancePath != null : !GLOBAL_APPEARANCE_PATH_EDEFAULT.equals(globalAppearancePath);
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
		result.append(" (globalAppearancePath: ");
		result.append(globalAppearancePath);
		result.append(')');
		return result.toString();
	}

} //GeometryImpl
