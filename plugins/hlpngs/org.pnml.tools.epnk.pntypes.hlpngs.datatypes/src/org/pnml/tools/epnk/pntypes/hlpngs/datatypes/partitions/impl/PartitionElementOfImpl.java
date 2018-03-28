/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Element Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl#getRefpartition <em>Refpartition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionElementOfImpl extends PartitionOperatorImpl implements PartitionElementOf {
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
	 * The cached value of the '{@link #getRefpartition() <em>Refpartition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefpartition()
	 * @generated
	 * @ordered
	 */
	protected Partition refpartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionElementOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.PARTITION_ELEMENT_OF;
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
			SymbolDef def = this.getRefpartition();
			if (def != null) {
				return def.getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartitionsPackage.PARTITION_ELEMENT_OF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getRefpartition() {
		if (refpartition != null && refpartition.eIsProxy()) {
			InternalEObject oldRefpartition = (InternalEObject)refpartition;
			refpartition = (Partition)eResolveProxy(oldRefpartition);
			if (refpartition != oldRefpartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION, oldRefpartition, refpartition));
			}
		}
		return refpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition basicGetRefpartition() {
		return refpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefpartition(Partition newRefpartition) {
		Partition oldRefpartition = refpartition;
		refpartition = newRefpartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION, oldRefpartition, refpartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public EReference getRefFeature() {
		return PartitionsPackage.eINSTANCE.getPartitionElementOf_Refpartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartitionsPackage.PARTITION_ELEMENT_OF__NAME:
				return getName();
			case PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION:
				if (resolve) return getRefpartition();
				return basicGetRefpartition();
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
			case PartitionsPackage.PARTITION_ELEMENT_OF__NAME:
				setName((String)newValue);
				return;
			case PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION:
				setRefpartition((Partition)newValue);
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
			case PartitionsPackage.PARTITION_ELEMENT_OF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION:
				setRefpartition((Partition)null);
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
			case PartitionsPackage.PARTITION_ELEMENT_OF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PartitionsPackage.PARTITION_ELEMENT_OF__REFPARTITION:
				return refpartition != null;
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
				case PartitionsPackage.PARTITION_ELEMENT_OF__NAME: return StructuredpntypemodelPackage.SYMBOL_USE__NAME;
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
				case StructuredpntypemodelPackage.SYMBOL_USE__NAME: return PartitionsPackage.PARTITION_ELEMENT_OF__NAME;
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
	// @generated NOT
	// @author eki
	public Sort getSort() {
		return getSort(null);
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		List<Term> terms = this.getSubterm();
		Partition partition = this.getRefpartition();
        if (terms.size() == 1 && partition != null) {
        	Term term = terms.get(0);
        	Sort sort = term.getSort();
        	if (sort != null && sort.equals(partition.getDef()) ) {
        		UserSort userSort = TermsFactory.eINSTANCE.createUserSort();
        		userSort.setDeclaration(partition);
        		return userSort;
        	}
        }
		return null;
	}

} //PartitionElementOfImpl
