/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel.util;

import networkmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see networkmodel.NetworkmodelPackage
 * @generated
 */
public class NetworkmodelSwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NetworkmodelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkmodelSwitch()
    {
        if (modelPackage == null)
        {
            modelPackage = NetworkmodelPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage)
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject)
    {
        switch (classifierID)
        {
            case NetworkmodelPackage.NETWORK:
            {
                Network network = (Network)theEObject;
                T result = caseNetwork(network);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NetworkmodelPackage.NODE:
            {
                Node node = (Node)theEObject;
                T result = caseNode(node);
                if (result == null) result = caseNetworkObject(node);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NetworkmodelPackage.NETWORK_OBJECT:
            {
                NetworkObject networkObject = (NetworkObject)theEObject;
                T result = caseNetworkObject(networkObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NetworkmodelPackage.DIRECTED_EDGE:
            {
                DirectedEdge directedEdge = (DirectedEdge)theEObject;
                T result = caseDirectedEdge(directedEdge);
                if (result == null) result = caseUndirectedEdge(directedEdge);
                if (result == null) result = caseNetworkObject(directedEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NetworkmodelPackage.CATEGORY:
            {
                Category category = (Category)theEObject;
                T result = caseCategory(category);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NetworkmodelPackage.UNDIRECTED_EDGE:
            {
                UndirectedEdge undirectedEdge = (UndirectedEdge)theEObject;
                T result = caseUndirectedEdge(undirectedEdge);
                if (result == null) result = caseNetworkObject(undirectedEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetwork(Network object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNode(Node object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkObject(NetworkObject object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Directed Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Directed Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDirectedEdge(DirectedEdge object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategory(Category object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Undirected Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Undirected Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUndirectedEdge(UndirectedEdge object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object)
    {
        return null;
    }

} //NetworkmodelSwitch
