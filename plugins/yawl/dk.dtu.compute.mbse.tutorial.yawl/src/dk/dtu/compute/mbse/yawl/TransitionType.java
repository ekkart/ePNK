/**
 */
package dk.dtu.compute.mbse.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.yawl.TransitionType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getTransitionType()
 * @model
 * @generated
 */
public interface TransitionType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.dtu.compute.mbse.yawl.TType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see dk.dtu.compute.mbse.yawl.TType
	 * @see #setText(TType)
	 * @see dk.dtu.compute.mbse.yawl.YawlPackage#getTransitionType_Text()
	 * @model required="true"
	 * @generated
	 */
	TType getText();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.yawl.TransitionType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see dk.dtu.compute.mbse.yawl.TType
	 * @see #getText()
	 * @generated
	 */
	void setText(TType value);

} // TransitionType
