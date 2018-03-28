/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getStart <em>Start</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getEnd <em>End</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isStartsafe <em>Startsafe</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isEndsafe <em>Endsafe</em>}</li>
 *   <li>{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getCovered <em>Covered</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Place)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock_Start()
	 * @model required="true"
	 * @generated
	 */
	Place getStart();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Place value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Place)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock_End()
	 * @model required="true"
	 * @generated
	 */
	Place getEnd();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Place value);

	/**
	 * Returns the value of the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startsafe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startsafe</em>' attribute.
	 * @see #setStartsafe(boolean)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock_Startsafe()
	 * @model
	 * @generated
	 */
	boolean isStartsafe();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isStartsafe <em>Startsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startsafe</em>' attribute.
	 * @see #isStartsafe()
	 * @generated
	 */
	void setStartsafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endsafe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endsafe</em>' attribute.
	 * @see #setEndsafe(boolean)
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock_Endsafe()
	 * @model
	 * @generated
	 */
	boolean isEndsafe();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isEndsafe <em>Endsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endsafe</em>' attribute.
	 * @see #isEndsafe()
	 * @generated
	 */
	void setEndsafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructurePackage#getBlock_Covered()
	 * @model
	 * @generated
	 */
	EList<org.pnml.tools.epnk.pnmlcoremodel.Object> getCovered();

} // Block
