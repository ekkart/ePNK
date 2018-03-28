/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getOperatorDecl()
 * @model abstract="true"
 * @generated
 */
public interface OperatorDecl extends Declaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Sort> getInputSorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Sort getOutPutSort();
	
	/**
	 * Resolves recursive declarations and makes sure that we do not
	 * run into cycles. Note that this is not in the model, but added
	 * manually.
	 * 
	 * @generated NOT
	 * @author eki
	 */
	Sort getOutPutSort(Set<NamedOperator> used);

} // OperatorDecl
