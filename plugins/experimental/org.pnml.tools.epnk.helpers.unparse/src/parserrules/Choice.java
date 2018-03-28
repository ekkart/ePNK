/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Choice#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link parserrules.Choice#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends Rule {
	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link parserrules.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see parserrules.ParserrulesPackage#getChoice_Alternative()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getAlternative();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ClassRef)
	 * @see parserrules.ParserrulesPackage#getChoice_Type()
	 * @model
	 * @generated
	 */
	ClassRef getType();

	/**
	 * Sets the value of the '{@link parserrules.Choice#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassRef value);

} // Choice
