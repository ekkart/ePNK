/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBack <em>Back</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Block {
	/**
	 * Returns the value of the '<em><b>Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back</em>' reference.
	 * @see #setBack(Atomic)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getLoop_Back()
	 * @model required="true"
	 * @generated
	 */
	Atomic getBack();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBack <em>Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back</em>' reference.
	 * @see #getBack()
	 * @generated
	 */
	void setBack(Atomic value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getLoop_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // Loop
