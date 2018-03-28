/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel.impl;

import networkmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkmodelFactoryImpl extends EFactoryImpl implements NetworkmodelFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NetworkmodelFactory init()
    {
        try
        {
            NetworkmodelFactory theNetworkmodelFactory = (NetworkmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/network"); 
            if (theNetworkmodelFactory != null)
            {
                return theNetworkmodelFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NetworkmodelFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkmodelFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
            case NetworkmodelPackage.NETWORK: return createNetwork();
            case NetworkmodelPackage.NODE: return createNode();
            case NetworkmodelPackage.DIRECTED_EDGE: return createDirectedEdge();
            case NetworkmodelPackage.CATEGORY: return createCategory();
            case NetworkmodelPackage.UNDIRECTED_EDGE: return createUndirectedEdge();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Network createNetwork()
    {
        NetworkImpl network = new NetworkImpl();
        return network;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode()
    {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectedEdge createDirectedEdge()
    {
        DirectedEdgeImpl directedEdge = new DirectedEdgeImpl();
        return directedEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category createCategory()
    {
        CategoryImpl category = new CategoryImpl();
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UndirectedEdge createUndirectedEdge()
    {
        UndirectedEdgeImpl undirectedEdge = new UndirectedEdgeImpl();
        return undirectedEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkmodelPackage getNetworkmodelPackage()
    {
        return (NetworkmodelPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NetworkmodelPackage getPackage()
    {
        return NetworkmodelPackage.eINSTANCE;
    }

} //NetworkmodelFactoryImpl
