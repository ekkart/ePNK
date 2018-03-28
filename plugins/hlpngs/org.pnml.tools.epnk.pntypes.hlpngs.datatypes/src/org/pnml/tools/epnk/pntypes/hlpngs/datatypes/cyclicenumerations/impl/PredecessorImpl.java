/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumeration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Predecessor;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predecessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PredecessorImpl extends CyclicEnumOperatorImpl implements Predecessor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredecessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyclicenumerationsPackage.Literals.PREDECESSOR;
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
		if (terms.size() == 1) {
			Term term = terms.get(0);
			Sort sort = term.getSort();
			if (sort != null) {
				if (sort instanceof CyclicEnumeration) {
					return sort;
				} else if (sort instanceof ProxySort) {
					ProxySort proxy = (ProxySort) sort;
					Sort sort2 = proxy.getSort();
					if (sort2 != null && sort2 instanceof CyclicEnumeration) {
						return sort;
					}
				}
			}
		}
		return null;
	}

} //PredecessorImpl
