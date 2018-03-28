/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Open#isTabulate <em>Tabulate</em>}</li>
 *   <li>{@link parserrules.Open#isAbsolute <em>Absolute</em>}</li>
 *   <li>{@link parserrules.Open#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends Parenthesis {
	/**
	 * Returns the value of the '<em><b>Tabulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabulate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabulate</em>' attribute.
	 * @see #setTabulate(boolean)
	 * @see parserrules.ParserrulesPackage#getOpen_Tabulate()
	 * @model required="true"
	 * @generated
	 */
	boolean isTabulate();

	/**
	 * Sets the value of the '{@link parserrules.Open#isTabulate <em>Tabulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabulate</em>' attribute.
	 * @see #isTabulate()
	 * @generated
	 */
	void setTabulate(boolean value);

	/**
	 * Returns the value of the '<em><b>Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute</em>' attribute.
	 * @see #setAbsolute(boolean)
	 * @see parserrules.ParserrulesPackage#getOpen_Absolute()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbsolute();

	/**
	 * Sets the value of the '{@link parserrules.Open#isAbsolute <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute</em>' attribute.
	 * @see #isAbsolute()
	 * @generated
	 */
	void setAbsolute(boolean value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see parserrules.ParserrulesPackage#getOpen_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link parserrules.Open#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

} // Open
