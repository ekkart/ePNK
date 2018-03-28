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
 * A representation of the model object '<em><b>Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Op#getLower <em>Lower</em>}</li>
 *   <li>{@link parserrules.Op#getUpper <em>Upper</em>}</li>
 *   <li>{@link parserrules.Op#getPrio <em>Prio</em>}</li>
 *   <li>{@link parserrules.Op#getType <em>Type</em>}</li>
 *   <li>{@link parserrules.Op#getFeature <em>Feature</em>}</li>
 *   <li>{@link parserrules.Op#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link parserrules.Op#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getOp()
 * @model
 * @generated
 */
public interface Op extends Rule {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see parserrules.ParserrulesPackage#getOp_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link parserrules.Op#getLower <em>Lower</em>}' attribute.
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
	 * @see parserrules.ParserrulesPackage#getOp_Upper()
	 * @model
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link parserrules.Op#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

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
	 * @see parserrules.ParserrulesPackage#getOp_Prio()
	 * @model
	 * @generated
	 */
	int getPrio();

	/**
	 * Sets the value of the '{@link parserrules.Op#getPrio <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prio</em>' attribute.
	 * @see #getPrio()
	 * @generated
	 */
	void setPrio(int value);

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
	 * @see parserrules.ParserrulesPackage#getOp_Type()
	 * @model
	 * @generated
	 */
	ClassRef getType();

	/**
	 * Sets the value of the '{@link parserrules.Op#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassRef value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link parserrules.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see parserrules.ParserrulesPackage#getOp_Feature()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Assoc</b></em>' attribute.
	 * The literals are from the enumeration {@link parserrules.OpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc</em>' attribute.
	 * @see parserrules.OpType
	 * @see #setAssoc(OpType)
	 * @see parserrules.ParserrulesPackage#getOp_Assoc()
	 * @model
	 * @generated
	 */
	OpType getAssoc();

	/**
	 * Sets the value of the '{@link parserrules.Op#getAssoc <em>Assoc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assoc</em>' attribute.
	 * @see parserrules.OpType
	 * @see #getAssoc()
	 * @generated
	 */
	void setAssoc(OpType value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Token)
	 * @see parserrules.ParserrulesPackage#getOp_Symbol()
	 * @model
	 * @generated
	 */
	Token getSymbol();

	/**
	 * Sets the value of the '{@link parserrules.Op#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Token value);

} // Op
