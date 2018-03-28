/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getDeclarations()
 * @model
 * @generated
 */
public interface Declarations extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getDeclarations_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

} // Declarations
