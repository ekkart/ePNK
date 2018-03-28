/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Selection Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptnetsimulator.PlaceSelectionAnnotation#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptnetsimulator.PtnetsimulatorPackage#getPlaceSelectionAnnotation()
 * @model
 * @generated
 */
public interface PlaceSelectionAnnotation extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see ptnetsimulator.PtnetsimulatorPackage#getPlaceSelectionAnnotation_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link ptnetsimulator.PlaceSelectionAnnotation#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // PlaceSelectionAnnotation
