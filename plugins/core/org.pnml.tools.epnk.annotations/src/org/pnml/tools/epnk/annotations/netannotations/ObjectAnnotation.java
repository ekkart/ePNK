/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getNetAnnotations <em>Net Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getObjectAnnotation()
 * @model
 * @generated
 */
public interface ObjectAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Net Annotations</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getObjectAnnotations <em>Object Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Annotations</em>' reference list.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getObjectAnnotation_NetAnnotations()
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getObjectAnnotations
	 * @model opposite="objectAnnotations" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<NetAnnotation> getNetAnnotations();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(org.pnml.tools.epnk.pnmlcoremodel.Object)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getObjectAnnotation_Object()
	 * @model required="true"
	 * @generated
	 */
	org.pnml.tools.epnk.pnmlcoremodel.Object getObject();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(org.pnml.tools.epnk.pnmlcoremodel.Object value);

} // ObjectAnnotation
