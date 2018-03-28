/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl#getStart <em>Start</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl#getEnd <em>End</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl#isStartsafe <em>Startsafe</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl#isEndsafe <em>Endsafe</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl#getCovered <em>Covered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BlockImpl extends EObjectImpl implements Block {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Place start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Place end;

	/**
	 * The default value of the '{@link #isStartsafe() <em>Startsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartsafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTSAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartsafe() <em>Startsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartsafe()
	 * @generated
	 * @ordered
	 */
	protected boolean startsafe = STARTSAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEndsafe() <em>Endsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndsafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENDSAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEndsafe() <em>Endsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndsafe()
	 * @generated
	 * @ordered
	 */
	protected boolean endsafe = ENDSAFE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected EList<org.pnml.tools.epnk.pnmlcoremodel.Object> covered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockstructurePackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Place)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockstructurePackage.BLOCK__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Place newStart) {
		Place oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockstructurePackage.BLOCK__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Place)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockstructurePackage.BLOCK__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Place newEnd) {
		Place oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockstructurePackage.BLOCK__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartsafe() {
		return startsafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartsafe(boolean newStartsafe) {
		boolean oldStartsafe = startsafe;
		startsafe = newStartsafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockstructurePackage.BLOCK__STARTSAFE, oldStartsafe, startsafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndsafe() {
		return endsafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndsafe(boolean newEndsafe) {
		boolean oldEndsafe = endsafe;
		endsafe = newEndsafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockstructurePackage.BLOCK__ENDSAFE, oldEndsafe, endsafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.pnml.tools.epnk.pnmlcoremodel.Object> getCovered() {
		if (covered == null) {
			covered = new EObjectResolvingEList<org.pnml.tools.epnk.pnmlcoremodel.Object>(org.pnml.tools.epnk.pnmlcoremodel.Object.class, this, BlockstructurePackage.BLOCK__COVERED);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockstructurePackage.BLOCK__START:
				if (resolve) return getStart();
				return basicGetStart();
			case BlockstructurePackage.BLOCK__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case BlockstructurePackage.BLOCK__STARTSAFE:
				return isStartsafe();
			case BlockstructurePackage.BLOCK__ENDSAFE:
				return isEndsafe();
			case BlockstructurePackage.BLOCK__COVERED:
				return getCovered();
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
			case BlockstructurePackage.BLOCK__START:
				setStart((Place)newValue);
				return;
			case BlockstructurePackage.BLOCK__END:
				setEnd((Place)newValue);
				return;
			case BlockstructurePackage.BLOCK__STARTSAFE:
				setStartsafe((Boolean)newValue);
				return;
			case BlockstructurePackage.BLOCK__ENDSAFE:
				setEndsafe((Boolean)newValue);
				return;
			case BlockstructurePackage.BLOCK__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends org.pnml.tools.epnk.pnmlcoremodel.Object>)newValue);
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
			case BlockstructurePackage.BLOCK__START:
				setStart((Place)null);
				return;
			case BlockstructurePackage.BLOCK__END:
				setEnd((Place)null);
				return;
			case BlockstructurePackage.BLOCK__STARTSAFE:
				setStartsafe(STARTSAFE_EDEFAULT);
				return;
			case BlockstructurePackage.BLOCK__ENDSAFE:
				setEndsafe(ENDSAFE_EDEFAULT);
				return;
			case BlockstructurePackage.BLOCK__COVERED:
				getCovered().clear();
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
			case BlockstructurePackage.BLOCK__START:
				return start != null;
			case BlockstructurePackage.BLOCK__END:
				return end != null;
			case BlockstructurePackage.BLOCK__STARTSAFE:
				return startsafe != STARTSAFE_EDEFAULT;
			case BlockstructurePackage.BLOCK__ENDSAFE:
				return endsafe != ENDSAFE_EDEFAULT;
			case BlockstructurePackage.BLOCK__COVERED:
				return covered != null && !covered.isEmpty();
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
		result.append(" (startsafe: ");
		result.append(startsafe);
		result.append(", endsafe: ");
		result.append(endsafe);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
