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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl#getNetAnnotations <em>Net Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAnnotationImpl extends AnnotationImpl implements ObjectAnnotation {
	/**
	 * The cached value of the '{@link #getNetAnnotations() <em>Net Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<NetAnnotation> netAnnotations;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected org.pnml.tools.epnk.pnmlcoremodel.Object object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetannotationsPackage.Literals.OBJECT_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetAnnotation> getNetAnnotations() {
		if (netAnnotations == null) {
			netAnnotations = new EObjectWithInverseEList.ManyInverse<NetAnnotation>(NetAnnotation.class, this, NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS, NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS);
		}
		return netAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pnmlcoremodel.Object getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (org.pnml.tools.epnk.pnmlcoremodel.Object)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetannotationsPackage.OBJECT_ANNOTATION__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pnmlcoremodel.Object basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(org.pnml.tools.epnk.pnmlcoremodel.Object newObject) {
		org.pnml.tools.epnk.pnmlcoremodel.Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.OBJECT_ANNOTATION__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetAnnotations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				return ((InternalEList<?>)getNetAnnotations()).basicRemove(otherEnd, msgs);
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
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				return getNetAnnotations();
			case NetannotationsPackage.OBJECT_ANNOTATION__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
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
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				getNetAnnotations().addAll((Collection<? extends NetAnnotation>)newValue);
				return;
			case NetannotationsPackage.OBJECT_ANNOTATION__OBJECT:
				setObject((org.pnml.tools.epnk.pnmlcoremodel.Object)newValue);
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
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				return;
			case NetannotationsPackage.OBJECT_ANNOTATION__OBJECT:
				setObject((org.pnml.tools.epnk.pnmlcoremodel.Object)null);
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
			case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS:
				return netAnnotations != null && !netAnnotations.isEmpty();
			case NetannotationsPackage.OBJECT_ANNOTATION__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
     * Generic default implementation of this method for TransitionActiovationAnnotations, in case ObjectAnnotations are
     * combined with TransitionActiovationAnnotations.
     * .
     * 
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	public EAttribute getAnnotationAttribute() {
		EClass eClass = this.eClass();
		EStructuralFeature feature = eClass.getEStructuralFeature("text");
		if (feature instanceof EAttribute) {
			return (EAttribute) feature;
		}
		feature = eClass.getEStructuralFeature("value");
		if (feature instanceof EAttribute) {
			return (EAttribute) feature;
		}
		
		for (EAttribute attribute: eClass.getEAllAttributes()) {
			return attribute;
		}
		return null;
	}

} //ObjectAnnotationImpl
