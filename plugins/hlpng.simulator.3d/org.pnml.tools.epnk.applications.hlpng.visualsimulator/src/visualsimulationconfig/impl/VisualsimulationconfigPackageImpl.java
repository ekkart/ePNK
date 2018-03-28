/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visualsimulationconfig.impl;

import Appearence.AppearencePackage;

import geditor.GeditorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import visualsimulationconfig.VisualSimulatorConfig;
import visualsimulationconfig.VisualsimulationconfigFactory;
import visualsimulationconfig.VisualsimulationconfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualsimulationconfigPackageImpl extends EPackageImpl implements VisualsimulationconfigPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass visualSimulatorConfigEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see visualsimulationconfig.VisualsimulationconfigPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VisualsimulationconfigPackageImpl()
    {
        super(eNS_URI, VisualsimulationconfigFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link VisualsimulationconfigPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VisualsimulationconfigPackage init()
    {
        if (isInited) return (VisualsimulationconfigPackage)EPackage.Registry.INSTANCE.getEPackage(VisualsimulationconfigPackage.eNS_URI);

        // Obtain or create and register package
        VisualsimulationconfigPackageImpl theVisualsimulationconfigPackage = (VisualsimulationconfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualsimulationconfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualsimulationconfigPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AppearencePackage.eINSTANCE.eClass();
        GeditorPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theVisualsimulationconfigPackage.createPackageContents();

        // Initialize created meta-data
        theVisualsimulationconfigPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theVisualsimulationconfigPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VisualsimulationconfigPackage.eNS_URI, theVisualsimulationconfigPackage);
        return theVisualsimulationconfigPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVisualSimulatorConfig()
    {
        return visualSimulatorConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVisualSimulatorConfig_Shapes()
    {
        return (EReference)visualSimulatorConfigEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVisualSimulatorConfig_Geometry()
    {
        return (EReference)visualSimulatorConfigEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisualsimulationconfigFactory getVisualsimulationconfigFactory()
    {
        return (VisualsimulationconfigFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        visualSimulatorConfigEClass = createEClass(VISUAL_SIMULATOR_CONFIG);
        createEReference(visualSimulatorConfigEClass, VISUAL_SIMULATOR_CONFIG__SHAPES);
        createEReference(visualSimulatorConfigEClass, VISUAL_SIMULATOR_CONFIG__GEOMETRY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents()
    {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        AppearencePackage theAppearencePackage = (AppearencePackage)EPackage.Registry.INSTANCE.getEPackage(AppearencePackage.eNS_URI);
        GeditorPackage theGeditorPackage = (GeditorPackage)EPackage.Registry.INSTANCE.getEPackage(GeditorPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(visualSimulatorConfigEClass, VisualSimulatorConfig.class, "VisualSimulatorConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVisualSimulatorConfig_Shapes(), theAppearencePackage.getShapes(), null, "shapes", null, 0, 1, VisualSimulatorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVisualSimulatorConfig_Geometry(), theGeditorPackage.getGeometry(), null, "geometry", null, 0, 1, VisualSimulatorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //VisualsimulationconfigPackageImpl
