/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LengthImpl extends ListOperatorImpl implements Length {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.LENGTH;
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		java.util.List<Term> subterms = this.getSubterm();
		
		if (subterms == null ||
				subterms.size() != 1 ) {
			return null;
		}
		
		Sort sort = subterms.get(0).getSort(used);
		if (sort == null || !(sort instanceof List)) {
			return null;
		} 
		
	    Sort basis = ((List) sort).getBasis();

	    if (basis == null) {
	    	return null;
	    }
	    
	    basis = basis.resolve(null);
	    if (basis == null) {
	    	return null;
	    }
	    
        return IntegersFactory.eINSTANCE.createNatural();
	}
} //LengthImpl
