/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visualsimulationconfig.impl;

import Appearence.Shapes;

import geditor.Geometry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import visualsimulationconfig.VisualSimulatorConfig;
import visualsimulationconfig.VisualsimulationconfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Simulator Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualsimulationconfig.impl.VisualSimulatorConfigImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link visualsimulationconfig.impl.VisualSimulatorConfigImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualSimulatorConfigImpl extends EObjectImpl implements VisualSimulatorConfig
{
    /**
     * The cached value of the '{@link #getShapes() <em>Shapes</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShapes()
     * @generated
     * @ordered
     */
    protected Shapes shapes;

    /**
     * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeometry()
     * @generated
     * @ordered
     */
    protected Geometry geometry;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VisualSimulatorConfigImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return VisualsimulationconfigPackage.Literals.VISUAL_SIMULATOR_CONFIG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shapes getShapes()
    {
        if (shapes != null && shapes.eIsProxy())
        {
            InternalEObject oldShapes = (InternalEObject)shapes;
            shapes = (Shapes)eResolveProxy(oldShapes);
            if (shapes != oldShapes)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES, oldShapes, shapes));
            }
        }
        return shapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shapes basicGetShapes()
    {
        return shapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShapes(Shapes newShapes)
    {
        Shapes oldShapes = shapes;
        shapes = newShapes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES, oldShapes, shapes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Geometry getGeometry()
    {
        if (geometry != null && geometry.eIsProxy())
        {
            InternalEObject oldGeometry = (InternalEObject)geometry;
            geometry = (Geometry)eResolveProxy(oldGeometry);
            if (geometry != oldGeometry)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY, oldGeometry, geometry));
            }
        }
        return geometry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Geometry basicGetGeometry()
    {
        return geometry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeometry(Geometry newGeometry)
    {
        Geometry oldGeometry = geometry;
        geometry = newGeometry;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY, oldGeometry, geometry));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES:
                if (resolve) return getShapes();
                return basicGetShapes();
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY:
                if (resolve) return getGeometry();
                return basicGetGeometry();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES:
                setShapes((Shapes)newValue);
                return;
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY:
                setGeometry((Geometry)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES:
                setShapes((Shapes)null);
                return;
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY:
                setGeometry((Geometry)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__SHAPES:
                return shapes != null;
            case VisualsimulationconfigPackage.VISUAL_SIMULATOR_CONFIG__GEOMETRY:
                return geometry != null;
        }
        return super.eIsSet(featureID);
    }

} //VisualSimulatorConfigImpl
