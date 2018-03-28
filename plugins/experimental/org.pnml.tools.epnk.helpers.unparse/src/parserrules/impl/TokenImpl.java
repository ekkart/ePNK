/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import parserrules.LinebreakCategory;
import parserrules.Parenthesis;
import parserrules.ParserrulesPackage;
import parserrules.Separator;
import parserrules.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.TokenImpl#getText <em>Text</em>}</li>
 *   <li>{@link parserrules.impl.TokenImpl#isSeparator <em>Separator</em>}</li>
 *   <li>{@link parserrules.impl.TokenImpl#getParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link parserrules.impl.TokenImpl#getBreakafter <em>Breakafter</em>}</li>
 *   <li>{@link parserrules.impl.TokenImpl#getBreakbefore <em>Breakbefore</em>}</li>
 *   <li>{@link parserrules.impl.TokenImpl#getSeperatorblanks <em>Seperatorblanks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends EObjectImpl implements Token {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEPARATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparator()
	 * @generated
	 * @ordered
	 */
	protected boolean separator = SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParenthesis() <em>Parenthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParenthesis()
	 * @generated
	 * @ordered
	 */
	protected Parenthesis parenthesis;

	/**
	 * The default value of the '{@link #getBreakafter() <em>Breakafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakafter()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakCategory BREAKAFTER_EDEFAULT = LinebreakCategory.OVER;

	/**
	 * The cached value of the '{@link #getBreakafter() <em>Breakafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakafter()
	 * @generated
	 * @ordered
	 */
	protected LinebreakCategory breakafter = BREAKAFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreakbefore() <em>Breakbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakbefore()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakCategory BREAKBEFORE_EDEFAULT = LinebreakCategory.OVER;

	/**
	 * The cached value of the '{@link #getBreakbefore() <em>Breakbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakbefore()
	 * @generated
	 * @ordered
	 */
	protected LinebreakCategory breakbefore = BREAKBEFORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeperatorblanks() <em>Seperatorblanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperatorblanks()
	 * @generated
	 * @ordered
	 */
	protected Separator seperatorblanks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(boolean newSeparator) {
		boolean oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__SEPARATOR, oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parenthesis getParenthesis() {
		return parenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParenthesis(Parenthesis newParenthesis, NotificationChain msgs) {
		Parenthesis oldParenthesis = parenthesis;
		parenthesis = newParenthesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__PARENTHESIS, oldParenthesis, newParenthesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParenthesis(Parenthesis newParenthesis) {
		if (newParenthesis != parenthesis) {
			NotificationChain msgs = null;
			if (parenthesis != null)
				msgs = ((InternalEObject)parenthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserrulesPackage.TOKEN__PARENTHESIS, null, msgs);
			if (newParenthesis != null)
				msgs = ((InternalEObject)newParenthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserrulesPackage.TOKEN__PARENTHESIS, null, msgs);
			msgs = basicSetParenthesis(newParenthesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__PARENTHESIS, newParenthesis, newParenthesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakCategory getBreakafter() {
		return breakafter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakafter(LinebreakCategory newBreakafter) {
		LinebreakCategory oldBreakafter = breakafter;
		breakafter = newBreakafter == null ? BREAKAFTER_EDEFAULT : newBreakafter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__BREAKAFTER, oldBreakafter, breakafter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakCategory getBreakbefore() {
		return breakbefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakbefore(LinebreakCategory newBreakbefore) {
		LinebreakCategory oldBreakbefore = breakbefore;
		breakbefore = newBreakbefore == null ? BREAKBEFORE_EDEFAULT : newBreakbefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__BREAKBEFORE, oldBreakbefore, breakbefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separator getSeperatorblanks() {
		return seperatorblanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeperatorblanks(Separator newSeperatorblanks, NotificationChain msgs) {
		Separator oldSeperatorblanks = seperatorblanks;
		seperatorblanks = newSeperatorblanks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__SEPERATORBLANKS, oldSeperatorblanks, newSeperatorblanks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeperatorblanks(Separator newSeperatorblanks) {
		if (newSeperatorblanks != seperatorblanks) {
			NotificationChain msgs = null;
			if (seperatorblanks != null)
				msgs = ((InternalEObject)seperatorblanks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserrulesPackage.TOKEN__SEPERATORBLANKS, null, msgs);
			if (newSeperatorblanks != null)
				msgs = ((InternalEObject)newSeperatorblanks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserrulesPackage.TOKEN__SEPERATORBLANKS, null, msgs);
			msgs = basicSetSeperatorblanks(newSeperatorblanks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.TOKEN__SEPERATORBLANKS, newSeperatorblanks, newSeperatorblanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParserrulesPackage.TOKEN__PARENTHESIS:
				return basicSetParenthesis(null, msgs);
			case ParserrulesPackage.TOKEN__SEPERATORBLANKS:
				return basicSetSeperatorblanks(null, msgs);
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
			case ParserrulesPackage.TOKEN__TEXT:
				return getText();
			case ParserrulesPackage.TOKEN__SEPARATOR:
				return isSeparator();
			case ParserrulesPackage.TOKEN__PARENTHESIS:
				return getParenthesis();
			case ParserrulesPackage.TOKEN__BREAKAFTER:
				return getBreakafter();
			case ParserrulesPackage.TOKEN__BREAKBEFORE:
				return getBreakbefore();
			case ParserrulesPackage.TOKEN__SEPERATORBLANKS:
				return getSeperatorblanks();
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
			case ParserrulesPackage.TOKEN__TEXT:
				setText((String)newValue);
				return;
			case ParserrulesPackage.TOKEN__SEPARATOR:
				setSeparator((Boolean)newValue);
				return;
			case ParserrulesPackage.TOKEN__PARENTHESIS:
				setParenthesis((Parenthesis)newValue);
				return;
			case ParserrulesPackage.TOKEN__BREAKAFTER:
				setBreakafter((LinebreakCategory)newValue);
				return;
			case ParserrulesPackage.TOKEN__BREAKBEFORE:
				setBreakbefore((LinebreakCategory)newValue);
				return;
			case ParserrulesPackage.TOKEN__SEPERATORBLANKS:
				setSeperatorblanks((Separator)newValue);
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
			case ParserrulesPackage.TOKEN__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ParserrulesPackage.TOKEN__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case ParserrulesPackage.TOKEN__PARENTHESIS:
				setParenthesis((Parenthesis)null);
				return;
			case ParserrulesPackage.TOKEN__BREAKAFTER:
				setBreakafter(BREAKAFTER_EDEFAULT);
				return;
			case ParserrulesPackage.TOKEN__BREAKBEFORE:
				setBreakbefore(BREAKBEFORE_EDEFAULT);
				return;
			case ParserrulesPackage.TOKEN__SEPERATORBLANKS:
				setSeperatorblanks((Separator)null);
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
			case ParserrulesPackage.TOKEN__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ParserrulesPackage.TOKEN__SEPARATOR:
				return separator != SEPARATOR_EDEFAULT;
			case ParserrulesPackage.TOKEN__PARENTHESIS:
				return parenthesis != null;
			case ParserrulesPackage.TOKEN__BREAKAFTER:
				return breakafter != BREAKAFTER_EDEFAULT;
			case ParserrulesPackage.TOKEN__BREAKBEFORE:
				return breakbefore != BREAKBEFORE_EDEFAULT;
			case ParserrulesPackage.TOKEN__SEPERATORBLANKS:
				return seperatorblanks != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", separator: ");
		result.append(separator);
		result.append(", breakafter: ");
		result.append(breakafter);
		result.append(", breakbefore: ");
		result.append(breakbefore);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
