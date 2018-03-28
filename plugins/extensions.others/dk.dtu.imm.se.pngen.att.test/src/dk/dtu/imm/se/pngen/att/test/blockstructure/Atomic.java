/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure;

import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getAtomic()
 * @model
 * @generated
 */
public interface Atomic extends Block {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getAtomic_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // Atomic
