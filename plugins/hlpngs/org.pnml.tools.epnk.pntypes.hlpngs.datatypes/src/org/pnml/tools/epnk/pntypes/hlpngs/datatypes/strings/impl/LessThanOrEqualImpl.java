/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
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
public class LessThanOrEqualImpl extends StringOperatorImpl implements LessThanOrEqual {
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
		return StringsPackage.Literals.LESS_THAN_OR_EQUAL;
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		List<Term> subterms = this.getSubterm();
		
		if (subterms == null ||
				subterms.size() != 2 ) {
			return null;
		}
		
		Sort sort1 = subterms.get(0).getSort(used);
		Sort sort2 = subterms.get(1).getSort(used);
		if (sort1 == null || sort2 == null ||
				!(sort1 instanceof String) ||
				!(sort2 instanceof String) ) {
			return null;
		}
		return BooleansFactory.eINSTANCE.createBool();
	}
	
} //LessThanOrEqualImpl
