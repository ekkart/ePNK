/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Append;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Append</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AppendImpl extends ListOperatorImpl implements Append {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.APPEND;
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
				!(sort1 instanceof List) ) {
			return null;
		} 
		
	    Sort basis = ((List) sort1).getBasis();
	    if (basis != null) {
	    	basis = basis.resolve(null);
	    }
	    
	    if (basis == null) {
	    	return null;
	    }
	    
	    basis = basis.leastCommonSuper(sort2);
	    if (basis != null) {
	    	List listSort = ListsFactory.eINSTANCE.createList();
	    	listSort.setBasis(basis);
	    	return listSort;
	    } 
	    
	    return null;

	}

} //AppendImpl
