/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2011 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package parserrules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import parserrules.Conditional;
import parserrules.ParserrulesPackage;
import parserrules.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link parserrules.impl.ConditionalImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link parserrules.impl.ConditionalImpl#getThenCase <em>Then Case</em>}</li>
 *   <li>{@link parserrules.impl.ConditionalImpl#getElseCase <em>Else Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends RuleImpl implements Conditional {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThenCase() <em>Then Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenCase()
	 * @generated
	 * @ordered
	 */
	protected Rule thenCase;

	/**
	 * The cached value of the '{@link #getElseCase() <em>Else Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseCase()
	 * @generated
	 * @ordered
	 */
	protected Rule elseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserrulesPackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.CONDITIONAL__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getThenCase() {
		if (thenCase != null && thenCase.eIsProxy()) {
			InternalEObject oldThenCase = (InternalEObject)thenCase;
			thenCase = (Rule)eResolveProxy(oldThenCase);
			if (thenCase != oldThenCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.CONDITIONAL__THEN_CASE, oldThenCase, thenCase));
			}
		}
		return thenCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetThenCase() {
		return thenCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenCase(Rule newThenCase) {
		Rule oldThenCase = thenCase;
		thenCase = newThenCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.CONDITIONAL__THEN_CASE, oldThenCase, thenCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getElseCase() {
		if (elseCase != null && elseCase.eIsProxy()) {
			InternalEObject oldElseCase = (InternalEObject)elseCase;
			elseCase = (Rule)eResolveProxy(oldElseCase);
			if (elseCase != oldElseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserrulesPackage.CONDITIONAL__ELSE_CASE, oldElseCase, elseCase));
			}
		}
		return elseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetElseCase() {
		return elseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseCase(Rule newElseCase) {
		Rule oldElseCase = elseCase;
		elseCase = newElseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserrulesPackage.CONDITIONAL__ELSE_CASE, oldElseCase, elseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserrulesPackage.CONDITIONAL__CLASS:
				return getClass_();
			case ParserrulesPackage.CONDITIONAL__THEN_CASE:
				if (resolve) return getThenCase();
				return basicGetThenCase();
			case ParserrulesPackage.CONDITIONAL__ELSE_CASE:
				if (resolve) return getElseCase();
				return basicGetElseCase();
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
			case ParserrulesPackage.CONDITIONAL__CLASS:
				setClass((String)newValue);
				return;
			case ParserrulesPackage.CONDITIONAL__THEN_CASE:
				setThenCase((Rule)newValue);
				return;
			case ParserrulesPackage.CONDITIONAL__ELSE_CASE:
				setElseCase((Rule)newValue);
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
			case ParserrulesPackage.CONDITIONAL__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case ParserrulesPackage.CONDITIONAL__THEN_CASE:
				setThenCase((Rule)null);
				return;
			case ParserrulesPackage.CONDITIONAL__ELSE_CASE:
				setElseCase((Rule)null);
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
			case ParserrulesPackage.CONDITIONAL__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case ParserrulesPackage.CONDITIONAL__THEN_CASE:
				return thenCase != null;
			case ParserrulesPackage.CONDITIONAL__ELSE_CASE:
				return elseCase != null;
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
		result.append(" (class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //ConditionalImpl
