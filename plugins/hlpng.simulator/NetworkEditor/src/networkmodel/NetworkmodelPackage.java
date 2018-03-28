/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see networkmodel.NetworkmodelFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkmodelPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "networkmodel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.pnml.tools/network";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "networkmodel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NetworkmodelPackage eINSTANCE = networkmodel.impl.NetworkmodelPackageImpl.init();

    /**
     * The meta object id for the '{@link networkmodel.impl.NetworkImpl <em>Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.NetworkImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getNetwork()
     * @generated
     */
    int NETWORK = 0;

    /**
     * The feature id for the '<em><b>Network</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK__NETWORK = 0;

    /**
     * The feature id for the '<em><b>Categories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK__CATEGORIES = 1;

    /**
     * The number of structural features of the '<em>Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link networkmodel.impl.NetworkObjectImpl <em>Network Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.NetworkObjectImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getNetworkObject()
     * @generated
     */
    int NETWORK_OBJECT = 2;

    /**
     * The number of structural features of the '<em>Network Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_OBJECT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link networkmodel.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.NodeImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getNode()
     * @generated
     */
    int NODE = 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__LABEL = NETWORK_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Out</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__OUT = NETWORK_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>In</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__IN = NETWORK_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__CATEGORY = NETWORK_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_FEATURE_COUNT = NETWORK_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link networkmodel.impl.UndirectedEdgeImpl <em>Undirected Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.UndirectedEdgeImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getUndirectedEdge()
     * @generated
     */
    int UNDIRECTED_EDGE = 5;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNDIRECTED_EDGE__SOURCE = NETWORK_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNDIRECTED_EDGE__TARGET = NETWORK_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Undirected Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNDIRECTED_EDGE_FEATURE_COUNT = NETWORK_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link networkmodel.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.DirectedEdgeImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getDirectedEdge()
     * @generated
     */
    int DIRECTED_EDGE = 3;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTED_EDGE__SOURCE = UNDIRECTED_EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTED_EDGE__TARGET = UNDIRECTED_EDGE__TARGET;

    /**
     * The number of structural features of the '<em>Directed Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTED_EDGE_FEATURE_COUNT = UNDIRECTED_EDGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link networkmodel.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see networkmodel.impl.CategoryImpl
     * @see networkmodel.impl.NetworkmodelPackageImpl#getCategory()
     * @generated
     */
    int CATEGORY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__NAME = 0;

    /**
     * The feature id for the '<em><b>Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__NODE = 1;

    /**
     * The number of structural features of the '<em>Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link networkmodel.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network</em>'.
     * @see networkmodel.Network
     * @generated
     */
    EClass getNetwork();

    /**
     * Returns the meta object for the containment reference list '{@link networkmodel.Network#getNetwork <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Network</em>'.
     * @see networkmodel.Network#getNetwork()
     * @see #getNetwork()
     * @generated
     */
    EReference getNetwork_Network();

    /**
     * Returns the meta object for the containment reference list '{@link networkmodel.Network#getCategories <em>Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Categories</em>'.
     * @see networkmodel.Network#getCategories()
     * @see #getNetwork()
     * @generated
     */
    EReference getNetwork_Categories();

    /**
     * Returns the meta object for class '{@link networkmodel.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see networkmodel.Node
     * @generated
     */
    EClass getNode();

    /**
     * Returns the meta object for the attribute '{@link networkmodel.Node#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see networkmodel.Node#getLabel()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Label();

    /**
     * Returns the meta object for the reference list '{@link networkmodel.Node#getOut <em>Out</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Out</em>'.
     * @see networkmodel.Node#getOut()
     * @see #getNode()
     * @generated
     */
    EReference getNode_Out();

    /**
     * Returns the meta object for the reference list '{@link networkmodel.Node#getIn <em>In</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>In</em>'.
     * @see networkmodel.Node#getIn()
     * @see #getNode()
     * @generated
     */
    EReference getNode_In();

    /**
     * Returns the meta object for the reference list '{@link networkmodel.Node#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category</em>'.
     * @see networkmodel.Node#getCategory()
     * @see #getNode()
     * @generated
     */
    EReference getNode_Category();

    /**
     * Returns the meta object for class '{@link networkmodel.NetworkObject <em>Network Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network Object</em>'.
     * @see networkmodel.NetworkObject
     * @generated
     */
    EClass getNetworkObject();

    /**
     * Returns the meta object for class '{@link networkmodel.DirectedEdge <em>Directed Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Directed Edge</em>'.
     * @see networkmodel.DirectedEdge
     * @generated
     */
    EClass getDirectedEdge();

    /**
     * Returns the meta object for class '{@link networkmodel.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category</em>'.
     * @see networkmodel.Category
     * @generated
     */
    EClass getCategory();

    /**
     * Returns the meta object for the attribute '{@link networkmodel.Category#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see networkmodel.Category#getName()
     * @see #getCategory()
     * @generated
     */
    EAttribute getCategory_Name();

    /**
     * Returns the meta object for the reference list '{@link networkmodel.Category#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Node</em>'.
     * @see networkmodel.Category#getNode()
     * @see #getCategory()
     * @generated
     */
    EReference getCategory_Node();

    /**
     * Returns the meta object for class '{@link networkmodel.UndirectedEdge <em>Undirected Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Undirected Edge</em>'.
     * @see networkmodel.UndirectedEdge
     * @generated
     */
    EClass getUndirectedEdge();

    /**
     * Returns the meta object for the reference '{@link networkmodel.UndirectedEdge#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see networkmodel.UndirectedEdge#getSource()
     * @see #getUndirectedEdge()
     * @generated
     */
    EReference getUndirectedEdge_Source();

    /**
     * Returns the meta object for the reference '{@link networkmodel.UndirectedEdge#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see networkmodel.UndirectedEdge#getTarget()
     * @see #getUndirectedEdge()
     * @generated
     */
    EReference getUndirectedEdge_Target();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NetworkmodelFactory getNetworkmodelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link networkmodel.impl.NetworkImpl <em>Network</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.NetworkImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getNetwork()
         * @generated
         */
        EClass NETWORK = eINSTANCE.getNetwork();

        /**
         * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NETWORK__NETWORK = eINSTANCE.getNetwork_Network();

        /**
         * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NETWORK__CATEGORIES = eINSTANCE.getNetwork_Categories();

        /**
         * The meta object literal for the '{@link networkmodel.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.NodeImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getNode()
         * @generated
         */
        EClass NODE = eINSTANCE.getNode();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

        /**
         * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE__OUT = eINSTANCE.getNode_Out();

        /**
         * The meta object literal for the '<em><b>In</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE__IN = eINSTANCE.getNode_In();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE__CATEGORY = eINSTANCE.getNode_Category();

        /**
         * The meta object literal for the '{@link networkmodel.impl.NetworkObjectImpl <em>Network Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.NetworkObjectImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getNetworkObject()
         * @generated
         */
        EClass NETWORK_OBJECT = eINSTANCE.getNetworkObject();

        /**
         * The meta object literal for the '{@link networkmodel.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.DirectedEdgeImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getDirectedEdge()
         * @generated
         */
        EClass DIRECTED_EDGE = eINSTANCE.getDirectedEdge();

        /**
         * The meta object literal for the '{@link networkmodel.impl.CategoryImpl <em>Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.CategoryImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getCategory()
         * @generated
         */
        EClass CATEGORY = eINSTANCE.getCategory();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATEGORY__NODE = eINSTANCE.getCategory_Node();

        /**
         * The meta object literal for the '{@link networkmodel.impl.UndirectedEdgeImpl <em>Undirected Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see networkmodel.impl.UndirectedEdgeImpl
         * @see networkmodel.impl.NetworkmodelPackageImpl#getUndirectedEdge()
         * @generated
         */
        EClass UNDIRECTED_EDGE = eINSTANCE.getUndirectedEdge();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNDIRECTED_EDGE__SOURCE = eINSTANCE.getUndirectedEdge_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNDIRECTED_EDGE__TARGET = eINSTANCE.getUndirectedEdge_Target();

    }

} //NetworkmodelPackage
