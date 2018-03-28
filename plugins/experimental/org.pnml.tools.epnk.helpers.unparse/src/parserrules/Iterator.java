/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Iterator#getLower <em>Lower</em>}</li>
 *   <li>{@link parserrules.Iterator#getUpper <em>Upper</em>}</li>
 *   <li>{@link parserrules.Iterator#getType <em>Type</em>}</li>
 *   <li>{@link parserrules.Iterator#getRule <em>Rule</em>}</li>
 *   <li>{@link parserrules.Iterator#getFirst <em>First</em>}</li>
 *   <li>{@link parserrules.Iterator#getSep <em>Sep</em>}</li>
 *   <li>{@link parserrules.Iterator#getLast <em>Last</em>}</li>
 *   <li>{@link parserrules.Iterator#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends Rule {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see parserrules.ParserrulesPackage#getIterator_Lower()
	 * @model default="0"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see parserrules.ParserrulesPackage#getIterator_Upper()
	 * @model
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

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
	 * @see parserrules.ParserrulesPackage#getIterator_Type()
	 * @model
	 * @generated
	 */
	ClassRef getType();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassRef value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Rule)
	 * @see parserrules.ParserrulesPackage#getIterator_Rule()
	 * @model required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Token)
	 * @see parserrules.ParserrulesPackage#getIterator_First()
	 * @model
	 * @generated
	 */
	Token getFirst();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Token value);

	/**
	 * Returns the value of the '<em><b>Sep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sep</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sep</em>' reference.
	 * @see #setSep(Token)
	 * @see parserrules.ParserrulesPackage#getIterator_Sep()
	 * @model
	 * @generated
	 */
	Token getSep();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getSep <em>Sep</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sep</em>' reference.
	 * @see #getSep()
	 * @generated
	 */
	void setSep(Token value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(Token)
	 * @see parserrules.ParserrulesPackage#getIterator_Last()
	 * @model
	 * @generated
	 */
	Token getLast();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(Token value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see parserrules.ParserrulesPackage#getIterator_Feature()
	 * @model
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link parserrules.Iterator#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Iterator
