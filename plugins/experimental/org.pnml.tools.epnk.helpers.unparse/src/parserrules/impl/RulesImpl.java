/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

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

import parserrules.ClassRef;
import parserrules.Feature;
import parserrules.ParserrulesPackage;
import parserrules.Rule;
import parserrules.Rules;
import parserrules.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.RulesImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link parserrules.impl.RulesImpl#getType <em>Type</em>}</li>
 *   <li>{@link parserrules.impl.RulesImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link parserrules.impl.RulesImpl#getMaxprio <em>Maxprio</em>}</li>
 *   <li>{@link parserrules.impl.RulesImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesImpl extends EObjectImpl implements Rules {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassRef> type;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The default value of the '{@link #getMaxprio() <em>Maxprio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxprio()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXPRIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxprio() <em>Maxprio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxprio()
	 * @generated
	 * @ordered
	 */
	protected int maxprio = MAXPRIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this, ParserrulesPackage.RULES__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassRef> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<ClassRef>(ClassRef.class, this, ParserrulesPackage.RULES__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, ParserrulesPackage.RULES__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxprio() {
		return maxprio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxprio(int newMaxprio) {
		int oldMaxprio = maxprio;
		maxprio = newMaxprio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.RULES__MAXPRIO, oldMaxprio, maxprio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectContainmentEList<Token>(Token.class, this, ParserrulesPackage.RULES__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParserrulesPackage.RULES__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case ParserrulesPackage.RULES__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case ParserrulesPackage.RULES__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case ParserrulesPackage.RULES__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
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
			case ParserrulesPackage.RULES__RULE:
				return getRule();
			case ParserrulesPackage.RULES__TYPE:
				return getType();
			case ParserrulesPackage.RULES__FEATURE:
				return getFeature();
			case ParserrulesPackage.RULES__MAXPRIO:
				return getMaxprio();
			case ParserrulesPackage.RULES__TOKEN:
				return getToken();
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
			case ParserrulesPackage.RULES__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case ParserrulesPackage.RULES__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ClassRef>)newValue);
				return;
			case ParserrulesPackage.RULES__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ParserrulesPackage.RULES__MAXPRIO:
				setMaxprio((Integer)newValue);
				return;
			case ParserrulesPackage.RULES__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
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
			case ParserrulesPackage.RULES__RULE:
				getRule().clear();
				return;
			case ParserrulesPackage.RULES__TYPE:
				getType().clear();
				return;
			case ParserrulesPackage.RULES__FEATURE:
				getFeature().clear();
				return;
			case ParserrulesPackage.RULES__MAXPRIO:
				setMaxprio(MAXPRIO_EDEFAULT);
				return;
			case ParserrulesPackage.RULES__TOKEN:
				getToken().clear();
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
			case ParserrulesPackage.RULES__RULE:
				return rule != null && !rule.isEmpty();
			case ParserrulesPackage.RULES__TYPE:
				return type != null && !type.isEmpty();
			case ParserrulesPackage.RULES__FEATURE:
				return feature != null && !feature.isEmpty();
			case ParserrulesPackage.RULES__MAXPRIO:
				return maxprio != MAXPRIO_EDEFAULT;
			case ParserrulesPackage.RULES__TOKEN:
				return token != null && !token.isEmpty();
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
		result.append(" (maxprio: ");
		result.append(maxprio);
		result.append(')');
		return result.toString();
	}

} //RulesImpl
