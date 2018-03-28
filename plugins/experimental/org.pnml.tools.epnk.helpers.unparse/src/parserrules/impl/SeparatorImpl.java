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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import parserrules.ParserrulesPackage;
import parserrules.Separator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.SeparatorImpl#isBlankbefore <em>Blankbefore</em>}</li>
 *   <li>{@link parserrules.impl.SeparatorImpl#isBlankafter <em>Blankafter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeparatorImpl extends EObjectImpl implements Separator {
	/**
	 * The default value of the '{@link #isBlankbefore() <em>Blankbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankbefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLANKBEFORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlankbefore() <em>Blankbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankbefore()
	 * @generated
	 * @ordered
	 */
	protected boolean blankbefore = BLANKBEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBlankafter() <em>Blankafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankafter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLANKAFTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlankafter() <em>Blankafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankafter()
	 * @generated
	 * @ordered
	 */
	protected boolean blankafter = BLANKAFTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeparatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlankbefore() {
		return blankbefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlankbefore(boolean newBlankbefore) {
		boolean oldBlankbefore = blankbefore;
		blankbefore = newBlankbefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.SEPARATOR__BLANKBEFORE, oldBlankbefore, blankbefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlankafter() {
		return blankafter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlankafter(boolean newBlankafter) {
		boolean oldBlankafter = blankafter;
		blankafter = newBlankafter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.SEPARATOR__BLANKAFTER, oldBlankafter, blankafter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserrulesPackage.SEPARATOR__BLANKBEFORE:
				return isBlankbefore();
			case ParserrulesPackage.SEPARATOR__BLANKAFTER:
				return isBlankafter();
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
			case ParserrulesPackage.SEPARATOR__BLANKBEFORE:
				setBlankbefore((Boolean)newValue);
				return;
			case ParserrulesPackage.SEPARATOR__BLANKAFTER:
				setBlankafter((Boolean)newValue);
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
			case ParserrulesPackage.SEPARATOR__BLANKBEFORE:
				setBlankbefore(BLANKBEFORE_EDEFAULT);
				return;
			case ParserrulesPackage.SEPARATOR__BLANKAFTER:
				setBlankafter(BLANKAFTER_EDEFAULT);
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
			case ParserrulesPackage.SEPARATOR__BLANKBEFORE:
				return blankbefore != BLANKBEFORE_EDEFAULT;
			case ParserrulesPackage.SEPARATOR__BLANKAFTER:
				return blankafter != BLANKAFTER_EDEFAULT;
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
		result.append(" (blankbefore: ");
		result.append(blankbefore);
		result.append(", blankafter: ");
		result.append(blankafter);
		result.append(')');
		return result.toString();
	}

} //SeparatorImpl
