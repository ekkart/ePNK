/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage;

import dk.dtu.compute.mbse.yawl.Action;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnabledTransitionImpl extends ObjectAnnotationImpl implements EnabledTransition {
	/**
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectArc> inArcs;

	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectArc> outArcs;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected EnabledTransition resolved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlannotationsPackage.Literals.ENABLED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectArc> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectWithInverseResolvingEList<SelectArc>(SelectArc.class, this, YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS, YawlannotationsPackage.SELECT_ARC__TARGET_TRANSITION);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectArc> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectWithInverseResolvingEList<SelectArc>(SelectArc.class, this, YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS, YawlannotationsPackage.SELECT_ARC__SOURCE_TRANSITION);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition getResolved() {
		if (resolved != null && resolved.eIsProxy()) {
			InternalEObject oldResolved = (InternalEObject)resolved;
			resolved = (EnabledTransition)eResolveProxy(oldResolved);
			if (resolved != oldResolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED, oldResolved, resolved));
			}
		}
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition basicGetResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(EnabledTransition newResolved) {
		EnabledTransition oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		Object object = getObject();
		if (object instanceof dk.dtu.compute.mbse.yawl.Action) {
			return (dk.dtu.compute.mbse.yawl.Action) object;
		}
		return null;
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArcs()).basicAdd(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArcs()).basicAdd(otherEnd, msgs);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				return ((InternalEList<?>)getInArcs()).basicRemove(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				return ((InternalEList<?>)getOutArcs()).basicRemove(otherEnd, msgs);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				return getInArcs();
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				return getOutArcs();
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED:
				if (resolve) return getResolved();
				return basicGetResolved();
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				getInArcs().clear();
				getInArcs().addAll((Collection<? extends SelectArc>)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				getOutArcs().clear();
				getOutArcs().addAll((Collection<? extends SelectArc>)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED:
				setResolved((EnabledTransition)newValue);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				getInArcs().clear();
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				getOutArcs().clear();
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED:
				setResolved((EnabledTransition)null);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN_ARCS:
				return inArcs != null && !inArcs.isEmpty();
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT_ARCS:
				return outArcs != null && !outArcs.isEmpty();
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVED:
				return resolved != null;
		}
		return super.eIsSet(featureID);
	}

} //EnabledTransitionImpl
