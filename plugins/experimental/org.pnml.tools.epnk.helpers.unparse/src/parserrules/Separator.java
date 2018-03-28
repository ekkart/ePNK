/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Separator#isBlankbefore <em>Blankbefore</em>}</li>
 *   <li>{@link parserrules.Separator#isBlankafter <em>Blankafter</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getSeparator()
 * @model
 * @generated
 */
public interface Separator extends EObject {
	/**
	 * Returns the value of the '<em><b>Blankbefore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blankbefore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blankbefore</em>' attribute.
	 * @see #setBlankbefore(boolean)
	 * @see parserrules.ParserrulesPackage#getSeparator_Blankbefore()
	 * @model required="true"
	 * @generated
	 */
	boolean isBlankbefore();

	/**
	 * Sets the value of the '{@link parserrules.Separator#isBlankbefore <em>Blankbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blankbefore</em>' attribute.
	 * @see #isBlankbefore()
	 * @generated
	 */
	void setBlankbefore(boolean value);

	/**
	 * Returns the value of the '<em><b>Blankafter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blankafter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blankafter</em>' attribute.
	 * @see #setBlankafter(boolean)
	 * @see parserrules.ParserrulesPackage#getSeparator_Blankafter()
	 * @model required="true"
	 * @generated
	 */
	boolean isBlankafter();

	/**
	 * Sets the value of the '{@link parserrules.Separator#isBlankafter <em>Blankafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blankafter</em>' attribute.
	 * @see #isBlankafter()
	 * @generated
	 */
	void setBlankafter(boolean value);

} // Separator
