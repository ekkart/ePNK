/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unparsed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage#getUnparsed()
 * @model
 * @generated
 */
public interface Unparsed extends Declaration {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(String)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage#getUnparsed_Contents()
	 * @model required="true"
	 * @generated
	 */
	String getContents();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(String value);

} // Unparsed
