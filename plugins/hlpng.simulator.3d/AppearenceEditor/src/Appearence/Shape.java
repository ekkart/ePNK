/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Appearence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Appearence.Shape#getObjectStringPath <em>Object String Path</em>}</li>
 *   <li>{@link Appearence.Shape#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see Appearence.AppearencePackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends EObject {
	/**
	 * Returns the value of the '<em><b>Object String Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object String Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object String Path</em>' attribute.
	 * @see #setObjectStringPath(String)
	 * @see Appearence.AppearencePackage#getShape_ObjectStringPath()
	 * @model
	 * @generated
	 */
	String getObjectStringPath();

	/**
	 * Sets the value of the '{@link Appearence.Shape#getObjectStringPath <em>Object String Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object String Path</em>' attribute.
	 * @see #getObjectStringPath()
	 * @generated
	 */
	void setObjectStringPath(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Appearence.AppearencePackage#getShape_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Appearence.Shape#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Shape
