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
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Sequence#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Rule {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference list.
	 * The list contents are of type {@link parserrules.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference list.
	 * @see parserrules.ParserrulesPackage#getSequence_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rule> getSequence();

} // Sequence
