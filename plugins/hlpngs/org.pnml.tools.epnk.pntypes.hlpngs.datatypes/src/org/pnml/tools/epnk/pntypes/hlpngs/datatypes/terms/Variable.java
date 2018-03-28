/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable#getRefvariable <em>Refvariable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Term, SymbolUse {
	/**
	 * Returns the value of the '<em><b>Refvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refvariable</em>' reference.
	 * @see #setRefvariable(VariableDecl)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getVariable_Refvariable()
	 * @model required="true"
	 * @generated
	 */
	VariableDecl getRefvariable();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable#getRefvariable <em>Refvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refvariable</em>' reference.
	 * @see #getRefvariable()
	 * @generated
	 */
	void setRefvariable(VariableDecl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Sort getSort();

} // Variable
