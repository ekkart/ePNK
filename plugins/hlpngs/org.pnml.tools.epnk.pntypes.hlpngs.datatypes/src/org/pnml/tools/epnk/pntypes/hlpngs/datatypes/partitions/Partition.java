/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getDef <em>Def</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getPartitionElements <em>Partition Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends SortDecl {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(Sort)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartition_Def()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getDef();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Sort value);

	/**
	 * Returns the value of the '<em><b>Partition Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Elements</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartition_PartitionElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PartitionElement> getPartitionElements();

} // Partition
