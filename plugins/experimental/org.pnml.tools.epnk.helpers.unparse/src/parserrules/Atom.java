/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Atom#getPrio <em>Prio</em>}</li>
 *   <li>{@link parserrules.Atom#getDef <em>Def</em>}</li>
 *   <li>{@link parserrules.Atom#getFirst <em>First</em>}</li>
 *   <li>{@link parserrules.Atom#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Rule {
	/**
	 * Returns the value of the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prio</em>' attribute.
	 * @see #setPrio(int)
	 * @see parserrules.ParserrulesPackage#getAtom_Prio()
	 * @model
	 * @generated
	 */
	int getPrio();

	/**
	 * Sets the value of the '{@link parserrules.Atom#getPrio <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prio</em>' attribute.
	 * @see #getPrio()
	 * @generated
	 */
	void setPrio(int value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' reference.
	 * @see #setDef(Rule)
	 * @see parserrules.ParserrulesPackage#getAtom_Def()
	 * @model required="true"
	 * @generated
	 */
	Rule getDef();

	/**
	 * Sets the value of the '{@link parserrules.Atom#getDef <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Rule value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Token)
	 * @see parserrules.ParserrulesPackage#getAtom_First()
	 * @model
	 * @generated
	 */
	Token getFirst();

	/**
	 * Sets the value of the '{@link parserrules.Atom#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Token value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(Token)
	 * @see parserrules.ParserrulesPackage#getAtom_Last()
	 * @model
	 * @generated
	 */
	Token getLast();

	/**
	 * Sets the value of the '{@link parserrules.Atom#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(Token value);

} // Atom
