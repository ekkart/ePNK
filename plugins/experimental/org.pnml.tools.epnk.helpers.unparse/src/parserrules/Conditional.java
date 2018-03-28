/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2011 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package parserrules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parserrules.Conditional#getClass_ <em>Class</em>}</li>
 *   <li>{@link parserrules.Conditional#getThenCase <em>Then Case</em>}</li>
 *   <li>{@link parserrules.Conditional#getElseCase <em>Else Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see parserrules.ParserrulesPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Rule {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see parserrules.ParserrulesPackage#getConditional_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link parserrules.Conditional#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Then Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Case</em>' reference.
	 * @see #setThenCase(Rule)
	 * @see parserrules.ParserrulesPackage#getConditional_ThenCase()
	 * @model
	 * @generated
	 */
	Rule getThenCase();

	/**
	 * Sets the value of the '{@link parserrules.Conditional#getThenCase <em>Then Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Case</em>' reference.
	 * @see #getThenCase()
	 * @generated
	 */
	void setThenCase(Rule value);

	/**
	 * Returns the value of the '<em><b>Else Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Case</em>' reference.
	 * @see #setElseCase(Rule)
	 * @see parserrules.ParserrulesPackage#getConditional_ElseCase()
	 * @model
	 * @generated
	 */
	Rule getElseCase();

	/**
	 * Sets the value of the '{@link parserrules.Conditional#getElseCase <em>Else Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Case</em>' reference.
	 * @see #getElseCase()
	 * @generated
	 */
	void setElseCase(Rule value);

} // Conditional
