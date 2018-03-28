/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getNetAnnotations <em>Net Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getObjectAnnotations <em>Object Annotations</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations()
 * @model
 * @generated
 */
public interface NetAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Net Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Annotations</em>' containment reference list.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_NetAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetAnnotation> getNetAnnotations();

	/**
	 * Returns the value of the '<em><b>Object Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Annotations</em>' containment reference list.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_ObjectAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectAnnotation> getObjectAnnotations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(NetAnnotation)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_Current()
	 * @model
	 * @generated
	 */
	NetAnnotation getCurrent();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(NetAnnotation value);

	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Version</em>' attribute.
	 * @see #setAppVersion(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_AppVersion()
	 * @model
	 * @generated
	 */
	String getAppVersion();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppVersion <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Version</em>' attribute.
	 * @see #getAppVersion()
	 * @generated
	 */
	void setAppVersion(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getNetAnnotations_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

} // NetAnnotations
