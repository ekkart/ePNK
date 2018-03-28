/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getSortDecl()
 * @model abstract="true"
 * @generated
 */
public interface SortDecl extends Declaration {
	
	public Sort resolve(Set<SortDecl> declarations);
	
} // SortDecl
