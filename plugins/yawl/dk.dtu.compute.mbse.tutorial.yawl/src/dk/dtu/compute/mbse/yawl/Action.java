/**
 */
package dk.dtu.compute.mbse.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.yawl.Action#getJointype <em>Jointype</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.yawl.Action#getSplitType <em>Split Type</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Transition {
	/**
	 * Returns the value of the '<em><b>Jointype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jointype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jointype</em>' containment reference.
	 * @see #setJointype(TransitionType)
	 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getAction_Jointype()
	 * @model containment="true"
	 * @generated
	 */
	TransitionType getJointype();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.yawl.Action#getJointype <em>Jointype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jointype</em>' containment reference.
	 * @see #getJointype()
	 * @generated
	 */
	void setJointype(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Split Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Type</em>' containment reference.
	 * @see #setSplitType(TransitionType)
	 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getAction_SplitType()
	 * @model containment="true"
	 * @generated
	 */
	TransitionType getSplitType();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.yawl.Action#getSplitType <em>Split Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Type</em>' containment reference.
	 * @see #getSplitType()
	 * @generated
	 */
	void setSplitType(TransitionType value);

} // Action
