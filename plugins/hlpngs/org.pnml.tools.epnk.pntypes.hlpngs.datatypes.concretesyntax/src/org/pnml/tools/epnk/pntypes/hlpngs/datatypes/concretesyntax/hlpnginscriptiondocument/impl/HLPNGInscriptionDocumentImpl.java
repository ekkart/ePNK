/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HlpnginscriptiondocumentPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLPNG Inscription Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLPNGInscriptionDocumentImpl extends EObjectImpl implements HLPNGInscriptionDocument {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declarations> declarations;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLPNGInscriptionDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpnginscriptiondocumentPackage.Literals.HLPNG_INSCRIPTION_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declarations> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<Declarations>(Declarations.class, this, HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<Term>(Term.class, this, HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
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
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS:
				return getDeclarations();
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM:
				return getTerm();
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
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declarations>)newValue);
				return;
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends Term>)newValue);
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
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS:
				getDeclarations().clear();
				return;
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM:
				getTerm().clear();
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
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT__TERM:
				return term != null && !term.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HLPNGInscriptionDocumentImpl
