/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import parserrules.ClassRef;
import parserrules.Feature;
import parserrules.Op;
import parserrules.OpType;
import parserrules.ParserrulesPackage;
import parserrules.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.OpImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getType <em>Type</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link parserrules.impl.OpImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpImpl extends RuleImpl implements Op {
	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassRef type;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The default value of the '{@link #getAssoc() <em>Assoc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoc()
	 * @generated
	 * @ordered
	 */
	protected static final OpType ASSOC_EDEFAULT = OpType.NONE;

	/**
	 * The cached value of the '{@link #getAssoc() <em>Assoc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoc()
	 * @generated
	 * @ordered
	 */
	protected OpType assoc = ASSOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected Token symbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__UPPER, oldUpper, upper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__PRIO, oldPrio, prio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ClassRef)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.OP__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassRef newType) {
		ClassRef oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<Feature>(Feature.class, this, ParserrulesPackage.OP__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpType getAssoc() {
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssoc(OpType newAssoc) {
		OpType oldAssoc = assoc;
		assoc = newAssoc == null ? ASSOC_EDEFAULT : newAssoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__ASSOC, oldAssoc, assoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject)symbol;
			symbol = (Token)eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.OP__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(Token newSymbol) {
		Token oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OP__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserrulesPackage.OP__LOWER:
				return getLower();
			case ParserrulesPackage.OP__UPPER:
				return getUpper();
			case ParserrulesPackage.OP__PRIO:
				return getPrio();
			case ParserrulesPackage.OP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ParserrulesPackage.OP__FEATURE:
				return getFeature();
			case ParserrulesPackage.OP__ASSOC:
				return getAssoc();
			case ParserrulesPackage.OP__SYMBOL:
				if (resolve) return getSymbol();
				return basicGetSymbol();
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
			case ParserrulesPackage.OP__LOWER:
				setLower((Integer)newValue);
				return;
			case ParserrulesPackage.OP__UPPER:
				setUpper((Integer)newValue);
				return;
			case ParserrulesPackage.OP__PRIO:
				setPrio((Integer)newValue);
				return;
			case ParserrulesPackage.OP__TYPE:
				setType((ClassRef)newValue);
				return;
			case ParserrulesPackage.OP__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ParserrulesPackage.OP__ASSOC:
				setAssoc((OpType)newValue);
				return;
			case ParserrulesPackage.OP__SYMBOL:
				setSymbol((Token)newValue);
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
			case ParserrulesPackage.OP__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case ParserrulesPackage.OP__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ParserrulesPackage.OP__PRIO:
				setPrio(PRIO_EDEFAULT);
				return;
			case ParserrulesPackage.OP__TYPE:
				setType((ClassRef)null);
				return;
			case ParserrulesPackage.OP__FEATURE:
				getFeature().clear();
				return;
			case ParserrulesPackage.OP__ASSOC:
				setAssoc(ASSOC_EDEFAULT);
				return;
			case ParserrulesPackage.OP__SYMBOL:
				setSymbol((Token)null);
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
			case ParserrulesPackage.OP__LOWER:
				return lower != LOWER_EDEFAULT;
			case ParserrulesPackage.OP__UPPER:
				return upper != UPPER_EDEFAULT;
			case ParserrulesPackage.OP__PRIO:
				return prio != PRIO_EDEFAULT;
			case ParserrulesPackage.OP__TYPE:
				return type != null;
			case ParserrulesPackage.OP__FEATURE:
				return feature != null && !feature.isEmpty();
			case ParserrulesPackage.OP__ASSOC:
				return assoc != ASSOC_EDEFAULT;
			case ParserrulesPackage.OP__SYMBOL:
				return symbol != null;
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
		result.append(" (lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", prio: ");
		result.append(prio);
		result.append(", assoc: ");
		result.append(assoc);
		result.append(')');
		return result.toString();
	}

} //OpImpl
