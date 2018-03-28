/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Rules#getRule <em>Rule</em>}</li>
 *   <li>{@link parserrules.Rules#getType <em>Type</em>}</li>
 *   <li>{@link parserrules.Rules#getFeature <em>Feature</em>}</li>
 *   <li>{@link parserrules.Rules#getMaxprio <em>Maxprio</em>}</li>
 *   <li>{@link parserrules.Rules#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link parserrules.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see parserrules.ParserrulesPackage#getRules_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link parserrules.ClassRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see parserrules.ParserrulesPackage#getRules_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassRef> getType();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link parserrules.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see parserrules.ParserrulesPackage#getRules_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Maxprio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxprio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxprio</em>' attribute.
	 * @see #setMaxprio(int)
	 * @see parserrules.ParserrulesPackage#getRules_Maxprio()
	 * @model
	 * @generated
	 */
	int getMaxprio();

	/**
	 * Sets the value of the '{@link parserrules.Rules#getMaxprio <em>Maxprio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxprio</em>' attribute.
	 * @see #getMaxprio()
	 * @generated
	 */
	void setMaxprio(int value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference list.
	 * The list contents are of type {@link parserrules.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference list.
	 * @see parserrules.ParserrulesPackage#getRules_Token()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getToken();

} // Rules
