/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ListOperatorImpl extends BuiltInOperatorImpl implements ListOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.LIST_OPERATOR;
	}
	
	@Override
	// @generated NOT
	// @author eki
	public Sort getSort() {
		return getSort(null);
	}

} //ListOperatorImpl
