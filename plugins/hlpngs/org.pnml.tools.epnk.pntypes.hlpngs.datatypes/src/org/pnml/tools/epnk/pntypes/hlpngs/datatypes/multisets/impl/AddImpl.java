/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AddImpl extends MultiSetOperatorImpl implements Add {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetsPackage.Literals.ADD;
	}

	// @generated NOT
	@Override	
	public Sort getSort() { 
		return getSort(null);
	}

	// @generated NOT
	@Override	
	public Sort getSort(Set<NamedOperator> used) {
		EList<Term> subterms = this.getSubterm();
		
		if (subterms.size() < 2) {
			return null;
		}
		
		Term term = subterms.get(0);
		Sort sort = term.getSort(used);
		if (sort == null ||
				!(sort instanceof MultiSetSort) ) {
				return null;
		}
		
		for (int i = 1; i < subterms.size(); i++) {
			Term term2 = subterms.get(i);
			Sort sort2 = term2.getSort(used);
			sort = sort.leastCommonSuper(sort2);
			if (sort == null) {
				return null;
			}
		}

        return sort;

	}

} //AddImpl
