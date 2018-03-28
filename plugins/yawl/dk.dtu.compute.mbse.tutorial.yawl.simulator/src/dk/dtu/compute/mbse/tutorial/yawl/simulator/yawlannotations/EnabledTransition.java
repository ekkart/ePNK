/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations;

import dk.dtu.compute.mbse.yawl.Action;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_InArcs()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc#getTargetTransition
	 * @model opposite="targetTransition"
	 * @generated
	 */
	EList<SelectArc> getInArcs();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_OutArcs()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc#getSourceTransition
	 * @model opposite="sourceTransition"
	 * @generated
	 */
	EList<SelectArc> getOutArcs();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' reference.
	 * @see #setResolved(EnabledTransition)
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_Resolved()
	 * @model
	 * @generated
	 */
	EnabledTransition getResolved();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolved <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' reference.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(EnabledTransition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object object = getObject();\r\nif (object instanceof dk.dtu.compute.mbse.yawl.Action) {\r\n\treturn (dk.dtu.compute.mbse.yawl.Action) object;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Action getAction();

} // EnabledTransition
