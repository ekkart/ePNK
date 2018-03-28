/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLPNG Inscription Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HlpnginscriptiondocumentPackage#getHLPNGInscriptionDocument()
 * @model
 * @generated
 */
public interface HLPNGInscriptionDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HlpnginscriptiondocumentPackage#getHLPNGInscriptionDocument_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declarations> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HlpnginscriptiondocumentPackage#getHLPNGInscriptionDocument_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerm();

} // HLPNGInscriptionDocument
