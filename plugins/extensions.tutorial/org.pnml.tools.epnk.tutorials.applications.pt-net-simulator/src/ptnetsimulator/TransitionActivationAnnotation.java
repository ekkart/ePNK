/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Activation Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptnetsimulator.TransitionActivationAnnotation#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptnetsimulator.PtnetsimulatorPackage#getTransitionActivationAnnotation()
 * @model
 * @generated
 */
public interface TransitionActivationAnnotation extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetsimulator.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see ptnetsimulator.Mode
	 * @see #setMode(Mode)
	 * @see ptnetsimulator.PtnetsimulatorPackage#getTransitionActivationAnnotation_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link ptnetsimulator.TransitionActivationAnnotation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see ptnetsimulator.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // TransitionActivationAnnotation
