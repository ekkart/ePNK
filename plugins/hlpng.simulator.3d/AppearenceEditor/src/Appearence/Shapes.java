/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Appearence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shapes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Appearence.Shapes#getAppearence <em>Appearence</em>}</li>
 * </ul>
 * </p>
 *
 * @see Appearence.AppearencePackage#getShapes()
 * @model
 * @generated
 */
public interface Shapes extends EObject {
	/**
	 * Returns the value of the '<em><b>Appearence</b></em>' containment reference list.
	 * The list contents are of type {@link Appearence.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearence</em>' containment reference list.
	 * @see Appearence.AppearencePackage#getShapes_Appearence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shape> getAppearence();

} // Shapes
