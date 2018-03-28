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
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Token#getText <em>Text</em>}</li>
 *   <li>{@link parserrules.Token#isSeparator <em>Separator</em>}</li>
 *   <li>{@link parserrules.Token#getParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link parserrules.Token#getBreakafter <em>Breakafter</em>}</li>
 *   <li>{@link parserrules.Token#getBreakbefore <em>Breakbefore</em>}</li>
 *   <li>{@link parserrules.Token#getSeperatorblanks <em>Seperatorblanks</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
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
	 * @see parserrules.ParserrulesPackage#getToken_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link parserrules.Token#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(boolean)
	 * @see parserrules.ParserrulesPackage#getToken_Separator()
	 * @model required="true"
	 * @generated
	 */
	boolean isSeparator();

	/**
	 * Sets the value of the '{@link parserrules.Token#isSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #isSeparator()
	 * @generated
	 */
	void setSeparator(boolean value);

	/**
	 * Returns the value of the '<em><b>Parenthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parenthesis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parenthesis</em>' containment reference.
	 * @see #setParenthesis(Parenthesis)
	 * @see parserrules.ParserrulesPackage#getToken_Parenthesis()
	 * @model containment="true"
	 * @generated
	 */
	Parenthesis getParenthesis();

	/**
	 * Sets the value of the '{@link parserrules.Token#getParenthesis <em>Parenthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parenthesis</em>' containment reference.
	 * @see #getParenthesis()
	 * @generated
	 */
	void setParenthesis(Parenthesis value);

	/**
	 * Returns the value of the '<em><b>Breakafter</b></em>' attribute.
	 * The literals are from the enumeration {@link parserrules.LinebreakCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakafter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakafter</em>' attribute.
	 * @see parserrules.LinebreakCategory
	 * @see #setBreakafter(LinebreakCategory)
	 * @see parserrules.ParserrulesPackage#getToken_Breakafter()
	 * @model required="true"
	 * @generated
	 */
	LinebreakCategory getBreakafter();

	/**
	 * Sets the value of the '{@link parserrules.Token#getBreakafter <em>Breakafter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakafter</em>' attribute.
	 * @see parserrules.LinebreakCategory
	 * @see #getBreakafter()
	 * @generated
	 */
	void setBreakafter(LinebreakCategory value);

	/**
	 * Returns the value of the '<em><b>Breakbefore</b></em>' attribute.
	 * The literals are from the enumeration {@link parserrules.LinebreakCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakbefore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakbefore</em>' attribute.
	 * @see parserrules.LinebreakCategory
	 * @see #setBreakbefore(LinebreakCategory)
	 * @see parserrules.ParserrulesPackage#getToken_Breakbefore()
	 * @model required="true"
	 * @generated
	 */
	LinebreakCategory getBreakbefore();

	/**
	 * Sets the value of the '{@link parserrules.Token#getBreakbefore <em>Breakbefore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakbefore</em>' attribute.
	 * @see parserrules.LinebreakCategory
	 * @see #getBreakbefore()
	 * @generated
	 */
	void setBreakbefore(LinebreakCategory value);

	/**
	 * Returns the value of the '<em><b>Seperatorblanks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seperatorblanks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperatorblanks</em>' containment reference.
	 * @see #setSeperatorblanks(Separator)
	 * @see parserrules.ParserrulesPackage#getToken_Seperatorblanks()
	 * @model containment="true"
	 * @generated
	 */
	Separator getSeperatorblanks();

	/**
	 * Sets the value of the '{@link parserrules.Token#getSeperatorblanks <em>Seperatorblanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperatorblanks</em>' containment reference.
	 * @see #getSeperatorblanks()
	 * @generated
	 */
	void setSeperatorblanks(Separator value);

} // Token
