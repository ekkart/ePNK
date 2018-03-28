/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getNamedOperator()
 * @model
 * @generated
 */
public interface NamedOperator extends OperatorDecl {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getNamedOperator_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDecl> getParameters();

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(Term)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#getNamedOperator_Def()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getDef();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Term value);

} // NamedOperator
