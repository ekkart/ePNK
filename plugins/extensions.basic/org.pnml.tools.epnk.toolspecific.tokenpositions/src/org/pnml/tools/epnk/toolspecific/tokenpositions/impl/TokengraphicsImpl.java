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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;

import org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics;
import org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tokengraphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokengraphicsImpl#getTokenposition <em>Tokenposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokengraphicsImpl extends EObjectImpl implements Tokengraphics {
	/**
	 * The cached value of the '{@link #getTokenposition() <em>Tokenposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinate> tokenposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokengraphicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenpositionsPackage.Literals.TOKENGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coordinate> getTokenposition() {
		if (tokenposition == null) {
			tokenposition = new EObjectContainmentEList<Coordinate>(Coordinate.class, this, TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION);
		}
		return tokenposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION:
				return ((InternalEList<?>)getTokenposition()).basicRemove(otherEnd, msgs);
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
			case TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION:
				return getTokenposition();
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
			case TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION:
				getTokenposition().clear();
				getTokenposition().addAll((Collection<? extends Coordinate>)newValue);
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
			case TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION:
				getTokenposition().clear();
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
			case TokenpositionsPackage.TOKENGRAPHICS__TOKENPOSITION:
				return tokenposition != null && !tokenposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TokengraphicsImpl
