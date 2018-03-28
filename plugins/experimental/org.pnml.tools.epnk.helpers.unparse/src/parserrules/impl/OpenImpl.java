/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import parserrules.Open;
import parserrules.ParserrulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.OpenImpl#isTabulate <em>Tabulate</em>}</li>
 *   <li>{@link parserrules.impl.OpenImpl#isAbsolute <em>Absolute</em>}</li>
 *   <li>{@link parserrules.impl.OpenImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenImpl extends ParenthesisImpl implements Open {
	/**
	 * The default value of the '{@link #isTabulate() <em>Tabulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTabulate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABULATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTabulate() <em>Tabulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTabulate()
	 * @generated
	 * @ordered
	 */
	protected boolean tabulate = TABULATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected boolean absolute = ABSOLUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.OPEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTabulate() {
		return tabulate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabulate(boolean newTabulate) {
		boolean oldTabulate = tabulate;
		tabulate = newTabulate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OPEN__TABULATE, oldTabulate, tabulate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsolute() {
		return absolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsolute(boolean newAbsolute) {
		boolean oldAbsolute = absolute;
		absolute = newAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OPEN__ABSOLUTE, oldAbsolute, absolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.OPEN__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserrulesPackage.OPEN__TABULATE:
				return isTabulate();
			case ParserrulesPackage.OPEN__ABSOLUTE:
				return isAbsolute();
			case ParserrulesPackage.OPEN__OFFSET:
				return getOffset();
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
			case ParserrulesPackage.OPEN__TABULATE:
				setTabulate((Boolean)newValue);
				return;
			case ParserrulesPackage.OPEN__ABSOLUTE:
				setAbsolute((Boolean)newValue);
				return;
			case ParserrulesPackage.OPEN__OFFSET:
				setOffset((Integer)newValue);
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
			case ParserrulesPackage.OPEN__TABULATE:
				setTabulate(TABULATE_EDEFAULT);
				return;
			case ParserrulesPackage.OPEN__ABSOLUTE:
				setAbsolute(ABSOLUTE_EDEFAULT);
				return;
			case ParserrulesPackage.OPEN__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case ParserrulesPackage.OPEN__TABULATE:
				return tabulate != TABULATE_EDEFAULT;
			case ParserrulesPackage.OPEN__ABSOLUTE:
				return absolute != ABSOLUTE_EDEFAULT;
			case ParserrulesPackage.OPEN__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (tabulate: ");
		result.append(tabulate);
		result.append(", absolute: ");
		result.append(absolute);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //OpenImpl
