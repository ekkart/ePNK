/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions;

import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Element Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf#getRefpartition <em>Refpartition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartitionElementOf()
 * @model
 * @generated
 */
public interface PartitionElementOf extends PartitionOperator, SymbolUse {
	/**
	 * Returns the value of the '<em><b>Refpartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refpartition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refpartition</em>' reference.
	 * @see #setRefpartition(Partition)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartitionElementOf_Refpartition()
	 * @model required="true"
	 * @generated
	 */
	Partition getRefpartition();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf#getRefpartition <em>Refpartition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refpartition</em>' reference.
	 * @see #getRefpartition()
	 * @generated
	 */
	void setRefpartition(Partition value);

} // PartitionElementOf
