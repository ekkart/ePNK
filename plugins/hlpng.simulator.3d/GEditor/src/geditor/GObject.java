/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GObject</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geditor.GObject#getId <em>Id</em>}</li>
 *   <li>{@link geditor.GObject#getAppearancePath <em>Appearance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see geditor.GeditorPackage#getGObject()
 * @model
 * @generated
 */
public interface GObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see geditor.GeditorPackage#getGObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link geditor.GObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Path</em>' attribute.
	 * @see #setAppearancePath(String)
	 * @see geditor.GeditorPackage#getGObject_AppearancePath()
	 * @model
	 * @generated
	 */
	String getAppearancePath();

	/**
	 * Sets the value of the '{@link geditor.GObject#getAppearancePath <em>Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Path</em>' attribute.
	 * @see #getAppearancePath()
	 * @generated
	 */
	void setAppearancePath(String value);

} // GObject
