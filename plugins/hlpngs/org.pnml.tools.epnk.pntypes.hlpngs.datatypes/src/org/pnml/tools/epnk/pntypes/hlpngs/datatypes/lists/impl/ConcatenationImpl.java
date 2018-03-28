/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concatenation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConcatenationImpl extends ListOperatorImpl implements Concatenation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatenationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.CONCATENATION;
	}
	
	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		java.util.List<Term> subterms = this.getSubterm();
		
		if (subterms == null ||
				subterms.size() != 2 ) {
			return null;
		}
		
		Sort sort1 = subterms.get(0).getSort(used);
		Sort sort2 = subterms.get(1).getSort(used);
		if (sort1 == null || sort2 == null ||
				!(sort1 instanceof List) ||
				!(sort2 instanceof List)) {
			return null;
		} 
		
	    Sort basis1 = ((List) sort1).getBasis();
	    Sort basis2 = ((List) sort2).getBasis();

	    Sort basis = basis1.leastCommonSuper(basis2);
	    
	    if (basis == null) {
	    	return null;
	    }
	    
	    List listSort = ListsFactory.eINSTANCE.createList();
    	listSort.setBasis(basis);	

        return listSort;
	}

} //ConcatenationImpl
