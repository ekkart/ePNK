/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visualsimulationconfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visualsimulationconfig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualsimulationconfigFactoryImpl extends EFactoryImpl implements VisualsimulationconfigFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VisualsimulationconfigFactory init()
    {
        try
        {
            VisualsimulationconfigFactory theVisualsimulationconfigFactory = (VisualsimulationconfigFactory)EPackage.Registry.INSTANCE.getEFactory("http://visualsimulationconfig/1.0"); 
            if (theVisualsimulationconfigFactory != null)
            {
                return theVisualsimulationconfigFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VisualsimulationconfigFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisualsimulationconfigFactoryImpl()
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
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG: return createVisualSimulatorConfig();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisualSimulatorConfig createVisualSimulatorConfig()
    {
        VisualSimulatorConfigImpl visualSimulatorConfig = new VisualSimulatorConfigImpl();
        return visualSimulatorConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisualsimulationconfigPackage getVisualsimulationconfigPackage()
    {
        return (VisualsimulationconfigPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VisualsimulationconfigPackage getPackage()
    {
        return VisualsimulationconfigPackage.eINSTANCE;
    }

} //VisualsimulationconfigFactoryImpl
