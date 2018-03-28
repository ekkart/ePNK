/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement#getPartitionelementconstant <em>Partitionelementconstant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartitionElement()
 * @model
 * @generated
 */
public interface PartitionElement extends OperatorDecl {
	/**
	 * Returns the value of the '<em><b>Partitionelementconstant</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitionelementconstant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitionelementconstant</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#getPartitionElement_Partitionelementconstant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Term> getPartitionelementconstant();

} // PartitionElement
