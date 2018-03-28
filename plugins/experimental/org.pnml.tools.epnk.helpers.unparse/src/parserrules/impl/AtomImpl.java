/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import parserrules.Atom;
import parserrules.ParserrulesPackage;
import parserrules.Rule;
import parserrules.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.AtomImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link parserrules.impl.AtomImpl#getDef <em>Def</em>}</li>
 *   <li>{@link parserrules.impl.AtomImpl#getFirst <em>First</em>}</li>
 *   <li>{@link parserrules.impl.AtomImpl#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomImpl extends RuleImpl implements Atom {
	/**
	 * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected int prio = PRIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Rule def;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Token first;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected Token last;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrio() {
		return prio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrio(int newPrio) {
		int oldPrio = prio;
		prio = newPrio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.ATOM__PRIO, oldPrio, prio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getDef() {
		if (def != null && def.eIsProxy()) {
			InternalEObject oldDef = (InternalEObject)def;
			def = (Rule)eResolveProxy(oldDef);
			if (def != oldDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.ATOM__DEF, oldDef, def));
			}
		}
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(Rule newDef) {
		Rule oldDef = def;
		def = newDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.ATOM__DEF, oldDef, def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Token)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.ATOM__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(Token newFirst) {
		Token oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.ATOM__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getLast() {
		if (last != null && last.eIsProxy()) {
			InternalEObject oldLast = (InternalEObject)last;
			last = (Token)eResolveProxy(oldLast);
			if (last != oldLast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.ATOM__LAST, oldLast, last));
			}
		}
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(Token newLast) {
		Token oldLast = last;
		last = newLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.ATOM__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserrulesPackage.ATOM__PRIO:
				return getPrio();
			case ParserrulesPackage.ATOM__DEF:
				if (resolve) return getDef();
				return basicGetDef();
			case ParserrulesPackage.ATOM__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case ParserrulesPackage.ATOM__LAST:
				if (resolve) return getLast();
				return basicGetLast();
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
			case ParserrulesPackage.ATOM__PRIO:
				setPrio((Integer)newValue);
				return;
			case ParserrulesPackage.ATOM__DEF:
				setDef((Rule)newValue);
				return;
			case ParserrulesPackage.ATOM__FIRST:
				setFirst((Token)newValue);
				return;
			case ParserrulesPackage.ATOM__LAST:
				setLast((Token)newValue);
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
			case ParserrulesPackage.ATOM__PRIO:
				setPrio(PRIO_EDEFAULT);
				return;
			case ParserrulesPackage.ATOM__DEF:
				setDef((Rule)null);
				return;
			case ParserrulesPackage.ATOM__FIRST:
				setFirst((Token)null);
				return;
			case ParserrulesPackage.ATOM__LAST:
				setLast((Token)null);
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
			case ParserrulesPackage.ATOM__PRIO:
				return prio != PRIO_EDEFAULT;
			case ParserrulesPackage.ATOM__DEF:
				return def != null;
			case ParserrulesPackage.ATOM__FIRST:
				return first != null;
			case ParserrulesPackage.ATOM__LAST:
				return last != null;
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
		result.append(" (prio: ");
		result.append(prio);
		result.append(')');
		return result.toString();
	}

} //AtomImpl
