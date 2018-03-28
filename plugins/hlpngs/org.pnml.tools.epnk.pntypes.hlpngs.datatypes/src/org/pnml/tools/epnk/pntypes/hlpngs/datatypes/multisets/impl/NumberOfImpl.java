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
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.MultiSetOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberOfImpl extends MultiSetOperatorImpl implements NumberOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetsPackage.Literals.NUMBER_OF;
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
		
		if (subterms.size() != 2) {
			return null;
		}
		
		Term term1 = subterms.get(0);
		Term term2 = subterms.get(1);
		Sort sort1 = term1.getSort(used);
		Sort sort2 = term2.getSort(used);
		
		if (sort1 == null || sort2 == null ||
			!(sort1 instanceof Natural || sort1 instanceof Positive) ) {
			return null;
		}
				
		MultiSetSort msSort = TermsFactory.eINSTANCE.createMultiSetSort();
		msSort.setBasis(sort2);
		
		return msSort;
	}

} //NumberOfImpl
