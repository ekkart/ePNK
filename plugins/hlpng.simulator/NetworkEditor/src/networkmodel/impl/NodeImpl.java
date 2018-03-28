/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package networkmodel.impl;

import java.util.Collection;

import networkmodel.Category;
import networkmodel.NetworkmodelPackage;
import networkmodel.Node;

import networkmodel.UndirectedEdge;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link networkmodel.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link networkmodel.impl.NodeImpl#getOut <em>Out</em>}</li>
 *   <li>{@link networkmodel.impl.NodeImpl#getIn <em>In</em>}</li>
 *   <li>{@link networkmodel.impl.NodeImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends NetworkObjectImpl implements Node
{
    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOut()
     * @generated
     * @ordered
     */
    protected EList<UndirectedEdge> out;

    /**
     * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIn()
     * @generated
     * @ordered
     */
    protected EList<UndirectedEdge> in;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected EList<Category> category;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl()
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
        return NetworkmodelPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel)
    {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkmodelPackage.NODE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UndirectedEdge> getOut()
    {
        if (out == null)
        {
            out = new EObjectWithInverseResolvingEList<UndirectedEdge>(UndirectedEdge.class, this, NetworkmodelPackage.NODE__OUT, NetworkmodelPackage.UNDIRECTED_EDGE__SOURCE);
        }
        return out;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UndirectedEdge> getIn()
    {
        if (in == null)
        {
            in = new EObjectWithInverseResolvingEList<UndirectedEdge>(UndirectedEdge.class, this, NetworkmodelPackage.NODE__IN, NetworkmodelPackage.UNDIRECTED_EDGE__TARGET);
        }
        return in;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Category> getCategory()
    {
        if (category == null)
        {
            category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, NetworkmodelPackage.NODE__CATEGORY, NetworkmodelPackage.CATEGORY__NODE);
        }
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case NetworkmodelPackage.NODE__OUT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
            case NetworkmodelPackage.NODE__IN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
            case NetworkmodelPackage.NODE__CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case NetworkmodelPackage.NODE__OUT:
                return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
            case NetworkmodelPackage.NODE__IN:
                return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
            case NetworkmodelPackage.NODE__CATEGORY:
                return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case NetworkmodelPackage.NODE__LABEL:
                return getLabel();
            case NetworkmodelPackage.NODE__OUT:
                return getOut();
            case NetworkmodelPackage.NODE__IN:
                return getIn();
            case NetworkmodelPackage.NODE__CATEGORY:
                return getCategory();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case NetworkmodelPackage.NODE__LABEL:
                setLabel((String)newValue);
                return;
            case NetworkmodelPackage.NODE__OUT:
                getOut().clear();
                getOut().addAll((Collection<? extends UndirectedEdge>)newValue);
                return;
            case NetworkmodelPackage.NODE__IN:
                getIn().clear();
                getIn().addAll((Collection<? extends UndirectedEdge>)newValue);
                return;
            case NetworkmodelPackage.NODE__CATEGORY:
                getCategory().clear();
                getCategory().addAll((Collection<? extends Category>)newValue);
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
            case NetworkmodelPackage.NODE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case NetworkmodelPackage.NODE__OUT:
                getOut().clear();
                return;
            case NetworkmodelPackage.NODE__IN:
                getIn().clear();
                return;
            case NetworkmodelPackage.NODE__CATEGORY:
                getCategory().clear();
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
            case NetworkmodelPackage.NODE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case NetworkmodelPackage.NODE__OUT:
                return out != null && !out.isEmpty();
            case NetworkmodelPackage.NODE__IN:
                return in != null && !in.isEmpty();
            case NetworkmodelPackage.NODE__CATEGORY:
                return category != null && !category.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //NodeImpl
