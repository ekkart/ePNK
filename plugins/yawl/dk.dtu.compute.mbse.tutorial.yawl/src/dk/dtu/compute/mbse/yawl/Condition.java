/**
 */
package dk.dtu.compute.mbse.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.yawl.Condition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Place {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConditionType)
	 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getCondition_Type()
	 * @model containment="true"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.yawl.Condition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

} // Condition
