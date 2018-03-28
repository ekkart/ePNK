/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link networkmodel.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link networkmodel.Node#getOut <em>Out</em>}</li>
 *   <li>{@link networkmodel.Node#getIn <em>In</em>}</li>
 *   <li>{@link networkmodel.Node#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see networkmodel.NetworkmodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NetworkObject
{
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see networkmodel.NetworkmodelPackage#getNode_Label()
     * @model id="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link networkmodel.Node#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Out</b></em>' reference list.
     * The list contents are of type {@link networkmodel.UndirectedEdge}.
     * It is bidirectional and its opposite is '{@link networkmodel.UndirectedEdge#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out</em>' reference list.
     * @see networkmodel.NetworkmodelPackage#getNode_Out()
     * @see networkmodel.UndirectedEdge#getSource
     * @model opposite="source"
     * @generated
     */
    EList<UndirectedEdge> getOut();

    /**
     * Returns the value of the '<em><b>In</b></em>' reference list.
     * The list contents are of type {@link networkmodel.UndirectedEdge}.
     * It is bidirectional and its opposite is '{@link networkmodel.UndirectedEdge#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In</em>' reference list.
     * @see networkmodel.NetworkmodelPackage#getNode_In()
     * @see networkmodel.UndirectedEdge#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<UndirectedEdge> getIn();

    /**
     * Returns the value of the '<em><b>Category</b></em>' reference list.
     * The list contents are of type {@link networkmodel.Category}.
     * It is bidirectional and its opposite is '{@link networkmodel.Category#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' reference list.
     * @see networkmodel.NetworkmodelPackage#getNode_Category()
     * @see networkmodel.Category#getNode
     * @model opposite="node" required="true"
     * @generated
     */
    EList<Category> getCategory();

} // Node
