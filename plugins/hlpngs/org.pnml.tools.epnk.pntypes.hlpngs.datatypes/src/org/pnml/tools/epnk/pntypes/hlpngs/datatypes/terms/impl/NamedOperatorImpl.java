/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.NamedOperatorImpl#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedOperatorImpl extends OperatorDeclImpl implements NamedOperator {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDecl> parameters;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Term def;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.NAMED_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDecl> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<VariableDecl>(VariableDecl.class, this, TermsPackage.NAMED_OPERATOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(Term newDef, NotificationChain msgs) {
		Term oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.NAMED_OPERATOR__DEF, oldDef, newDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(Term newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.NAMED_OPERATOR__DEF, null, msgs);
			if (newDef != null)
				msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.NAMED_OPERATOR__DEF, null, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.NAMED_OPERATOR__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TermsPackage.NAMED_OPERATOR__DEF:
				return basicSetDef(null, msgs);
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
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
				return getParameters();
			case TermsPackage.NAMED_OPERATOR__DEF:
				return getDef();
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
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends VariableDecl>)newValue);
				return;
			case TermsPackage.NAMED_OPERATOR__DEF:
				setDef((Term)newValue);
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
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
				getParameters().clear();
				return;
			case TermsPackage.NAMED_OPERATOR__DEF:
				setDef((Term)null);
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
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TermsPackage.NAMED_OPERATOR__DEF:
				return def != null;
		}
		return super.eIsSet(featureID);
	}

	// @generated NOT
	@Override
	public EList<Sort> getInputSorts() {
		EList<Sort> result = new BasicEList<Sort>();
		
		EList<VariableDecl> varDecls = this.getParameters();
		
		for (VariableDecl varDecl: varDecls) {
			Sort sort = varDecl.getSort();
			if (sort != null) {
				Sort rSort = sort.resolve(null);
				if (rSort != null) {
					result.add(rSort);
				} else {
					return null;
				} 
			} else {
				return null;
			}
		}
		
		return result;
	}

	// @generated NOT
	@Override
	public Sort getOutPutSort() {
		return getOutPutSort(null);
	}
	
	// @generated NOT
	@Override
	public Sort getOutPutSort(Set<NamedOperator> used) {
		if (used != null) {
			if (used.contains(this)) {
				// this is a cyclic definition
				return null;
			}
		} else {
			used = new HashSet<NamedOperator>();
		}
		
		Set<NamedOperator> newUsed = new HashSet<NamedOperator>(used);
		newUsed.add(this);
		
		Term term = this.getDef();
		if (term != null) {
			return term.getSort(newUsed);
		}
		
		return null;
	}

} //NamedOperatorImpl
