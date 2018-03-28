/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Appearence.impl;

import Appearence.AppearencePackage;
import Appearence.Shape;
import Appearence.Shapes;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shapes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Appearence.impl.ShapesImpl#getAppearence <em>Appearence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapesImpl extends EObjectImpl implements Shapes {
	/**
	 * The cached value of the '{@link #getAppearence() <em>Appearence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearence()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> appearence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearencePackage.Literals.SHAPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getAppearence() {
		if (appearence == null) {
			appearence = new EObjectContainmentEList<Shape>(Shape.class, this, AppearencePackage.SHAPES__APPEARENCE);
		}
		return appearence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearencePackage.SHAPES__APPEARENCE:
				return ((InternalEList<?>)getAppearence()).basicRemove(otherEnd, msgs);
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
			case AppearencePackage.SHAPES__APPEARENCE:
				return getAppearence();
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
			case AppearencePackage.SHAPES__APPEARENCE:
				getAppearence().clear();
				getAppearence().addAll((Collection<? extends Shape>)newValue);
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
			case AppearencePackage.SHAPES__APPEARENCE:
				getAppearence().clear();
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
			case AppearencePackage.SHAPES__APPEARENCE:
				return appearence != null && !appearence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShapesImpl
