/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesFactory;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sublist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl.SublistImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SublistImpl extends ListOperatorImpl implements Sublist {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final NonNegativeInteger START_EDEFAULT = (NonNegativeInteger)PnmldatatypesFactory.eINSTANCE.createFromString(PnmldatatypesPackage.eINSTANCE.getNonNegativeInteger(), "0");

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final NonNegativeInteger LENGTH_EDEFAULT = (NonNegativeInteger)PnmldatatypesFactory.eINSTANCE.createFromString(PnmldatatypesPackage.eINSTANCE.getNonNegativeInteger(), "0");

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SublistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.SUBLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(NonNegativeInteger newStart) {
		NonNegativeInteger oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListsPackage.SUBLIST__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(NonNegativeInteger newLength) {
		NonNegativeInteger oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListsPackage.SUBLIST__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListsPackage.SUBLIST__START:
				return getStart();
			case ListsPackage.SUBLIST__LENGTH:
				return getLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ListsPackage.SUBLIST__START:
				setStart((NonNegativeInteger)newValue);
				return;
			case ListsPackage.SUBLIST__LENGTH:
				setLength((NonNegativeInteger)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ListsPackage.SUBLIST__START:
				setStart(START_EDEFAULT);
				return;
			case ListsPackage.SUBLIST__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ListsPackage.SUBLIST__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ListsPackage.SUBLIST__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (start: ");
		result.append(start);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}
	
	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		java.util.List<Term> subterms = this.getSubterm();
		
		if (subterms == null ||
				subterms.size() != 1 ) {
			return null;
		}
		
		Sort sort = subterms.get(0).getSort(used);
		if (sort == null || !(sort instanceof List)) {
			return null;
		} 
		
	    Sort basis = ((List) sort).getBasis();    
	    if (basis == null) {
	    	return null;
	    }
	    
	    basis = basis.resolve(null);
	    
	    if (basis ==null) {
	    	return null;
	    }
	    List listSort = ListsFactory.eINSTANCE.createList();
    	listSort.setBasis(basis);	

        return listSort;
	}	

} //SublistImpl
