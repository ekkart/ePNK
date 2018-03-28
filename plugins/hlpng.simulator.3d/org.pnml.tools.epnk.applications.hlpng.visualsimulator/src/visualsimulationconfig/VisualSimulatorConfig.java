/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visualsimulationconfig;

import Appearence.Shapes;

import geditor.Geometry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Simulator Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualsimulationconfig.VisualSimulatorConfig#getShapes <em>Shapes</em>}</li>
 *   <li>{@link visualsimulationconfig.VisualSimulatorConfig#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualsimulationconfig.VisualsimulationconfigPackage#getVisualSimulatorConfig()
 * @model
 * @generated
 */
public interface VisualSimulatorConfig extends EObject
{
    /**
     * Returns the value of the '<em><b>Shapes</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shapes</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shapes</em>' reference.
     * @see #setShapes(Shapes)
     * @see visualsimulationconfig.VisualsimulationconfigPackage#getVisualSimulatorConfig_Shapes()
     * @model
     * @generated
     */
    Shapes getShapes();

    /**
     * Sets the value of the '{@link visualsimulationconfig.VisualSimulatorConfig#getShapes <em>Shapes</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shapes</em>' reference.
     * @see #getShapes()
     * @generated
     */
    void setShapes(Shapes value);

    /**
     * Returns the value of the '<em><b>Geometry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geometry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geometry</em>' reference.
     * @see #setGeometry(Geometry)
     * @see visualsimulationconfig.VisualsimulationconfigPackage#getVisualSimulatorConfig_Geometry()
     * @model
     * @generated
     */
    Geometry getGeometry();

    /**
     * Sets the value of the '{@link visualsimulationconfig.VisualSimulatorConfig#getGeometry <em>Geometry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geometry</em>' reference.
     * @see #getGeometry()
     * @generated
     */
    void setGeometry(Geometry value);

} // VisualSimulatorConfig
