/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInOperatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PartitionOperatorImpl extends BuiltInOperatorImpl implements PartitionOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.PARTITION_OPERATOR;
	}

} //PartitionOperatorImpl
