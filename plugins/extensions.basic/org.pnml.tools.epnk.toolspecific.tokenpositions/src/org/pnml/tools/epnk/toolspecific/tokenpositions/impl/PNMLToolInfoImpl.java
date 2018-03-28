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
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.toolspecific.tokenpositions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo;
import org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics;
import org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PNML Tool Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl#getTokengraphics <em>Tokengraphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PNMLToolInfoImpl extends EObjectImpl implements PNMLToolInfo {
	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokengraphics() <em>Tokengraphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokengraphics()
	 * @generated
	 * @ordered
	 */
	protected Tokengraphics tokengraphics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNMLToolInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenpositionsPackage.Literals.PNML_TOOL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenpositionsPackage.PNML_TOOL_INFO__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenpositionsPackage.PNML_TOOL_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tokengraphics getTokengraphics() {
		return tokengraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokengraphics(Tokengraphics newTokengraphics, NotificationChain msgs) {
		Tokengraphics oldTokengraphics = tokengraphics;
		tokengraphics = newTokengraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS, oldTokengraphics, newTokengraphics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokengraphics(Tokengraphics newTokengraphics) {
		if (newTokengraphics != tokengraphics) {
			NotificationChain msgs = null;
			if (tokengraphics != null)
				msgs = ((InternalEObject)tokengraphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS, null, msgs);
			if (newTokengraphics != null)
				msgs = ((InternalEObject)newTokengraphics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS, null, msgs);
			msgs = basicSetTokengraphics(newTokengraphics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS, newTokengraphics, newTokengraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS:
				return basicSetTokengraphics(null, msgs);
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
			case TokenpositionsPackage.PNML_TOOL_INFO__TOOL:
				return getTool();
			case TokenpositionsPackage.PNML_TOOL_INFO__VERSION:
				return getVersion();
			case TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS:
				return getTokengraphics();
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
			case TokenpositionsPackage.PNML_TOOL_INFO__TOOL:
				setTool((String)newValue);
				return;
			case TokenpositionsPackage.PNML_TOOL_INFO__VERSION:
				setVersion((String)newValue);
				return;
			case TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS:
				setTokengraphics((Tokengraphics)newValue);
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
			case TokenpositionsPackage.PNML_TOOL_INFO__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case TokenpositionsPackage.PNML_TOOL_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS:
				setTokengraphics((Tokengraphics)null);
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
			case TokenpositionsPackage.PNML_TOOL_INFO__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case TokenpositionsPackage.PNML_TOOL_INFO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TokenpositionsPackage.PNML_TOOL_INFO__TOKENGRAPHICS:
				return tokengraphics != null;
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
		result.append(" (tool: "); //$NON-NLS-1$
		result.append(tool);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PNMLToolInfoImpl
