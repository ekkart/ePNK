/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Composite#getSubblocks <em>Subblocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getComposite()
 * @model abstract="true"
 * @generated
 */
public interface Composite extends Block {
	/**
	 * Returns the value of the '<em><b>Subblocks</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subblocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subblocks</em>' containment reference list.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getComposite_Subblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getSubblocks();

} // Composite
