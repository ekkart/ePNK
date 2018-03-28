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
 * <em><b>Line</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geditor.Line#getStart <em>Start</em>}</li>
 *   <li>{@link geditor.Line#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see geditor.GeditorPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Point)
	 * @see geditor.GeditorPackage#getLine_Start()
	 * @model required="true"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link geditor.Line#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Point)
	 * @see geditor.GeditorPackage#getLine_End()
	 * @model required="true"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link geditor.Line#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

} // Line
