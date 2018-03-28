/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visualsimulationconfig;

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
 * @see visualsimulationconfig.VisualsimulationconfigFactory
 * @model kind="package"
 * @generated
 */
public interface VisualsimulationconfigPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "visualsimulationconfig";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://visualsimulationconfig/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "visualsimulationconfig";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VisualsimulationconfigPackage eINSTANCE = visualsimulationconfig.impl.VisualsimulationconfigPackageImpl.init();

    /**
     * The meta object id for the '{@link visualsimulationconfig.impl.VisualSimulatorConfigImpl <em>Visual Simulator Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see visualsimulationconfig.impl.VisualSimulatorConfigImpl
     * @see visualsimulationconfig.impl.VisualsimulationconfigPackageImpl#getVisualSimulatorConfig()
     * @generated
     */
    int VISUAL_SIMULATOR_CONFIG = 0;

    /**
     * The feature id for the '<em><b>Shapes</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_SIMULATOR_CONFIG__SHAPES = 0;

    /**
     * The feature id for the '<em><b>Geometry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_SIMULATOR_CONFIG__GEOMETRY = 1;

    /**
     * The number of structural features of the '<em>Visual Simulator Config</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_SIMULATOR_CONFIG_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link visualsimulationconfig.VisualSimulatorConfig <em>Visual Simulator Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Visual Simulator Config</em>'.
     * @see visualsimulationconfig.VisualSimulatorConfig
     * @generated
     */
    EClass getVisualSimulatorConfig();

    /**
     * Returns the meta object for the reference '{@link visualsimulationconfig.VisualSimulatorConfig#getShapes <em>Shapes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Shapes</em>'.
     * @see visualsimulationconfig.VisualSimulatorConfig#getShapes()
     * @see #getVisualSimulatorConfig()
     * @generated
     */
    EReference getVisualSimulatorConfig_Shapes();

    /**
     * Returns the meta object for the reference '{@link visualsimulationconfig.VisualSimulatorConfig#getGeometry <em>Geometry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Geometry</em>'.
     * @see visualsimulationconfig.VisualSimulatorConfig#getGeometry()
     * @see #getVisualSimulatorConfig()
     * @generated
     */
    EReference getVisualSimulatorConfig_Geometry();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VisualsimulationconfigFactory getVisualsimulationconfigFactory();

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
         * The meta object literal for the '{@link visualsimulationconfig.impl.VisualSimulatorConfigImpl <em>Visual Simulator Config</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see visualsimulationconfig.impl.VisualSimulatorConfigImpl
         * @see visualsimulationconfig.impl.VisualsimulationconfigPackageImpl#getVisualSimulatorConfig()
         * @generated
         */
        EClass VISUAL_SIMULATOR_CONFIG = eINSTANCE.getVisualSimulatorConfig();

        /**
         * The meta object literal for the '<em><b>Shapes</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VISUAL_SIMULATOR_CONFIG__SHAPES = eINSTANCE.getVisualSimulatorConfig_Shapes();

        /**
         * The meta object literal for the '<em><b>Geometry</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VISUAL_SIMULATOR_CONFIG__GEOMETRY = eINSTANCE.getVisualSimulatorConfig_Geometry();

    }

} //VisualsimulationconfigPackage
