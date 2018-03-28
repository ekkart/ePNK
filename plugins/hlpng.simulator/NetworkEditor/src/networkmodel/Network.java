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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link networkmodel.Network#getNetwork <em>Network</em>}</li>
 *   <li>{@link networkmodel.Network#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see networkmodel.NetworkmodelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject
{
    /**
     * Returns the value of the '<em><b>Network</b></em>' containment reference list.
     * The list contents are of type {@link networkmodel.NetworkObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Network</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Network</em>' containment reference list.
     * @see networkmodel.NetworkmodelPackage#getNetwork_Network()
     * @model containment="true"
     * @generated
     */
    EList<NetworkObject> getNetwork();

    /**
     * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
     * The list contents are of type {@link networkmodel.Category}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Categories</em>' containment reference list.
     * @see networkmodel.NetworkmodelPackage#getNetwork_Categories()
     * @model containment="true"
     * @generated
     */
    EList<Category> getCategories();

} // Network
