/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Geometry</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geditor.Geometry#getGeometryObjects <em>Geometry Objects</em>}</li>
 *   <li>{@link geditor.Geometry#getGlobalAppearancePath <em>Global Appearance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see geditor.GeditorPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry Objects</b></em>' containment reference list.
	 * The list contents are of type {@link geditor.GObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Objects</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Objects</em>' containment reference list.
	 * @see geditor.GeditorPackage#getGeometry_GeometryObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<GObject> getGeometryObjects();

	/**
	 * Returns the value of the '<em><b>Global Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Appearance Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Appearance Path</em>' attribute.
	 * @see #setGlobalAppearancePath(String)
	 * @see geditor.GeditorPackage#getGeometry_GlobalAppearancePath()
	 * @model
	 * @generated
	 */
	String getGlobalAppearancePath();

	/**
	 * Sets the value of the '{@link geditor.Geometry#getGlobalAppearancePath <em>Global Appearance Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Appearance Path</em>' attribute.
	 * @see #getGlobalAppearancePath()
	 * @generated
	 */
	void setGlobalAppearancePath(String value);

} // Geometry
