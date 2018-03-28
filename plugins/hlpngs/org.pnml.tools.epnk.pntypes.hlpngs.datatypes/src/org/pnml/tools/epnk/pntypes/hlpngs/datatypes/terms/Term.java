/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getTerm()
 * @model abstract="true"
 * @generated
 */
public interface Term extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Sort getSort();
	
	/**
	 * Returns the sort of the Term, but collects the used definitions on the
	 * way so as to make sure that we do not run into an infinite loop, when
	 * resolving cyclic definitions. This methods is just in the implemented
	 * code -- not in the model.
	 * 
	 * @param used
	 * @return
	 */
	// @generated NOT
	// @author eki
	Sort getSort(Set<NamedOperator> used);

} // Term
