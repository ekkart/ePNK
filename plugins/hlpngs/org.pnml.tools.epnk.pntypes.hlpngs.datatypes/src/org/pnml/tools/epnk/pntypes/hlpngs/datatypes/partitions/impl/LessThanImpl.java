/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LessThanImpl extends PartitionOperatorImpl implements LessThan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.LESS_THAN;
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
		if (terms.size() == 2) {
			Term op1 = terms.get(0);
			Sort sort1 = op1.getSort();
			Term op2 = terms.get(1);
			Sort sort2 = op2.getSort();
			if (sort1 != null && sort1 instanceof UserSort && sort1.equals(sort2)) {
				return BooleansFactory.eINSTANCE.createBool();
			}
		}
		return null;
	}
} //LessThanImpl
