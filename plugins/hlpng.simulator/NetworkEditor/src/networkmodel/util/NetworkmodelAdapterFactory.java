/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel.util;

import networkmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see networkmodel.NetworkmodelPackage
 * @generated
 */
public class NetworkmodelAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NetworkmodelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkmodelAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = NetworkmodelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object)
    {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NetworkmodelSwitch<Adapter> modelSwitch =
        new NetworkmodelSwitch<Adapter>()
        {
            @Override
            public Adapter caseNetwork(Network object)
            {
                return createNetworkAdapter();
            }
            @Override
            public Adapter caseNode(Node object)
            {
                return createNodeAdapter();
            }
            @Override
            public Adapter caseNetworkObject(NetworkObject object)
            {
                return createNetworkObjectAdapter();
            }
            @Override
            public Adapter caseDirectedEdge(DirectedEdge object)
            {
                return createDirectedEdgeAdapter();
            }
            @Override
            public Adapter caseCategory(Category object)
            {
                return createCategoryAdapter();
            }
            @Override
            public Adapter caseUndirectedEdge(UndirectedEdge object)
            {
                return createUndirectedEdgeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object)
            {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target)
    {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link networkmodel.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.Network
     * @generated
     */
    public Adapter createNetworkAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link networkmodel.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.Node
     * @generated
     */
    public Adapter createNodeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link networkmodel.NetworkObject <em>Network Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.NetworkObject
     * @generated
     */
    public Adapter createNetworkObjectAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link networkmodel.DirectedEdge <em>Directed Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.DirectedEdge
     * @generated
     */
    public Adapter createDirectedEdgeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link networkmodel.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.Category
     * @generated
     */
    public Adapter createCategoryAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link networkmodel.UndirectedEdge <em>Undirected Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see networkmodel.UndirectedEdge
     * @generated
     */
    public Adapter createUndirectedEdgeAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter()
    {
        return null;
    }

} //NetworkmodelAdapterFactory
