/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl#getRefvariable <em>Refvariable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends TermImpl implements Variable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefvariable() <em>Refvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefvariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDecl refvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public String getName() {
		if (name != null) {
			return name;
		} else {
			VariableDecl decl = this.getRefvariable();
			if (decl != null) {
				return decl.getName();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl getRefvariable() {
		if (refvariable != null && refvariable.eIsProxy()) {
			InternalEObject oldRefvariable = (InternalEObject)refvariable;
			refvariable = (VariableDecl)eResolveProxy(oldRefvariable);
			if (refvariable != oldRefvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.VARIABLE__REFVARIABLE, oldRefvariable, refvariable));
			}
		}
		return refvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl basicGetRefvariable() {
		return refvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefvariable(VariableDecl newRefvariable) {
		VariableDecl oldRefvariable = refvariable;
		refvariable = newRefvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE__REFVARIABLE, oldRefvariable, refvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EReference getRefFeature() {
		return TermsPackage.eINSTANCE.getVariable_Refvariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermsPackage.VARIABLE__NAME:
				return getName();
			case TermsPackage.VARIABLE__REFVARIABLE:
				if (resolve) return getRefvariable();
				return basicGetRefvariable();
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
			case TermsPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case TermsPackage.VARIABLE__REFVARIABLE:
				setRefvariable((VariableDecl)newValue);
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
			case TermsPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TermsPackage.VARIABLE__REFVARIABLE:
				setRefvariable((VariableDecl)null);
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
			case TermsPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TermsPackage.VARIABLE__REFVARIABLE:
				return refvariable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SymbolUse.class) {
			switch (derivedFeatureID) {
				case TermsPackage.VARIABLE__NAME: return StructuredpntypemodelPackage.SYMBOL_USE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SymbolUse.class) {
			switch (baseFeatureID) {
				case StructuredpntypemodelPackage.SYMBOL_USE__NAME: return TermsPackage.VARIABLE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public Sort getSort() {
		return getSort(null);
	}
	
	@Override
	public Sort getSort(Set<NamedOperator> used) {
		VariableDecl varDecl = this.getRefvariable();
		if (varDecl == null) {
			return null;
		}
		
		Sort sort = varDecl.getSort();
		if (sort == null) {
			return null;		
		}
		
		return sort.resolve(null);
	}

} //VariableImpl
