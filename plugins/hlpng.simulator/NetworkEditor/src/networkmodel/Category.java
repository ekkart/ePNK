/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link networkmodel.Category#getName <em>Name</em>}</li>
 *   <li>{@link networkmodel.Category#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see networkmodel.NetworkmodelPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject
{
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see networkmodel.NetworkmodelPackage#getCategory_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link networkmodel.Category#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' reference list.
     * The list contents are of type {@link networkmodel.Node}.
     * It is bidirectional and its opposite is '{@link networkmodel.Node#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' reference list.
     * @see networkmodel.NetworkmodelPackage#getCategory_Node()
     * @see networkmodel.Node#getCategory
     * @model opposite="category"
     * @generated
     */
    EList<Node> getNode();

} // Category
