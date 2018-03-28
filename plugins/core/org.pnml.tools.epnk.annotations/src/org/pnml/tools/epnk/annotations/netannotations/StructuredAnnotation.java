/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#getText <em>Text</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#isValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getStructuredAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface StructuredAnnotation extends TextualAnnotation {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getStructuredAnnotation_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getStructuredAnnotation_Valid()
	 * @model required="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

} // StructuredAnnotation
