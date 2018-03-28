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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl#getObjectAnnotations <em>Object Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetAnnotationImpl extends AnnotationImpl implements NetAnnotation {
	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet net;

	/**
	 * The cached value of the '{@link #getObjectAnnotations() <em>Object Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectAnnotation> objectAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetannotationsPackage.Literals.NET_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (PetriNet)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetannotationsPackage.NET_ANNOTATION__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(PetriNet newNet) {
		PetriNet oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetannotationsPackage.NET_ANNOTATION__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectAnnotation> getObjectAnnotations() {
		if (objectAnnotations == null) {
			objectAnnotations = new EObjectWithInverseEList.ManyInverse<ObjectAnnotation>(ObjectAnnotation.class, this, NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS, NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS);
		}
		return objectAnnotations;
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
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectAnnotations()).basicAdd(otherEnd, msgs);
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
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
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
			case NetannotationsPackage.NET_ANNOTATION__NET:
				if (resolve) return getNet();
				return basicGetNet();
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
				return getObjectAnnotations();
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
			case NetannotationsPackage.NET_ANNOTATION__NET:
				setNet((PetriNet)newValue);
				return;
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
				getObjectAnnotations().clear();
				getObjectAnnotations().addAll((Collection<? extends ObjectAnnotation>)newValue);
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
			case NetannotationsPackage.NET_ANNOTATION__NET:
				setNet((PetriNet)null);
				return;
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
				getObjectAnnotations().clear();
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
			case NetannotationsPackage.NET_ANNOTATION__NET:
				return net != null;
			case NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS:
				return objectAnnotations != null && !objectAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetAnnotationImpl
