/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Arc</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geditor.Arc#getStart <em>Start</em>}</li>
 *   <li>{@link geditor.Arc#getEnd <em>End</em>}</li>
 *   <li>{@link geditor.Arc#getControlPoints <em>Control Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see geditor.GeditorPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends GObject {
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
	 * @see geditor.GeditorPackage#getArc_Start()
	 * @model required="true"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link geditor.Arc#getStart <em>Start</em>}' reference.
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
	 * @see geditor.GeditorPackage#getArc_End()
	 * @model required="true"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link geditor.Arc#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

	/**
	 * Returns the value of the '<em><b>Control Points</b></em>' containment reference list.
	 * The list contents are of type {@link geditor.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points</em>' containment reference list.
	 * @see geditor.GeditorPackage#getArc_ControlPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getControlPoints();

} // Arc
