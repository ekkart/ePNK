/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Less Than Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LessThanOrEqualImpl extends IntegerOperatorImpl implements LessThanOrEqual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanOrEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.LESS_THAN_OR_EQUAL;
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
			!(sort1 instanceof Number) ||
			!(sort2 instanceof Number) ) {
			return null;
		}
				
		return BooleansFactory.eINSTANCE.createBool();
	}
} //LessThanOrEqualImpl
