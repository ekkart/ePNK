/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage
 * @generated
 */
public interface PartitionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartitionsFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	Partition createPartition();

	/**
	 * Returns a new object of class '<em>Partition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Element</em>'.
	 * @generated
	 */
	PartitionElement createPartitionElement();

	/**
	 * Returns a new object of class '<em>Partition Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Element Of</em>'.
	 * @generated
	 */
	PartitionElementOf createPartitionElementOf();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PartitionsPackage getPartitionsPackage();

} //PartitionsFactory
