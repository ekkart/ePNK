/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getNet <em>Net</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getObjectAnnotations <em>Object Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotation()
 * @model
 * @generated
 */
public interface NetAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(PetriNet)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotation_Net()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getNet();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Object Annotations</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getNetAnnotations <em>Net Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Annotations</em>' reference list.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotation_ObjectAnnotations()
	 * @see org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getNetAnnotations
	 * @model opposite="netAnnotations" resolveProxies="false"
	 * @generated
	 */
	EList<ObjectAnnotation> getObjectAnnotations();

} // NetAnnotation
