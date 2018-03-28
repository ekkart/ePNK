/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArcType;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.impl.ArcImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.impl.ArcImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.impl.ArcImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl implements Arc {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ArcType type;

	/**
	 * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBool()
	 * @generated
	 * @ordered
	 */
	protected org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean bool;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArctypesPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ArcType newType, NotificationChain msgs) {
		ArcType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArctypesPackage.ARC__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ArcType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArctypesPackage.ARC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArctypesPackage.ARC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArctypesPackage.ARC__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean getBool() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBool(org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean newBool, NotificationChain msgs) {
		org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean oldBool = bool;
		bool = newBool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArctypesPackage.ARC__BOOL, oldBool, newBool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean newBool) {
		if (newBool != bool) {
			NotificationChain msgs = null;
			if (bool != null)
				msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArctypesPackage.ARC__BOOL, null, msgs);
			if (newBool != null)
				msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArctypesPackage.ARC__BOOL, null, msgs);
			msgs = basicSetBool(newBool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArctypesPackage.ARC__BOOL, newBool, newBool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, ArctypesPackage.ARC__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArctypesPackage.ARC__TYPE:
				return basicSetType(null, msgs);
			case ArctypesPackage.ARC__BOOL:
				return basicSetBool(null, msgs);
			case ArctypesPackage.ARC__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
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
			case ArctypesPackage.ARC__TYPE:
				return getType();
			case ArctypesPackage.ARC__BOOL:
				return getBool();
			case ArctypesPackage.ARC__COMMENT:
				return getComment();
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
			case ArctypesPackage.ARC__TYPE:
				setType((ArcType)newValue);
				return;
			case ArctypesPackage.ARC__BOOL:
				setBool((org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean)newValue);
				return;
			case ArctypesPackage.ARC__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends Comment>)newValue);
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
			case ArctypesPackage.ARC__TYPE:
				setType((ArcType)null);
				return;
			case ArctypesPackage.ARC__BOOL:
				setBool((org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean)null);
				return;
			case ArctypesPackage.ARC__COMMENT:
				getComment().clear();
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
			case ArctypesPackage.ARC__TYPE:
				return type != null;
			case ArctypesPackage.ARC__BOOL:
				return bool != null;
			case ArctypesPackage.ARC__COMMENT:
				return comment != null && !comment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
