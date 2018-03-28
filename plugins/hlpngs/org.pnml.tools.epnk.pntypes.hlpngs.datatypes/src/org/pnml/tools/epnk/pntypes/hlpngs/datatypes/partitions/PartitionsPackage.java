/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsFactory
 * @model kind="package"
 * @generated
 */
public interface PartitionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partitions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/partitions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partitions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartitionsPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = TermsPackage.SORT_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = TermsPackage.SORT_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DEF = TermsPackage.SORT_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_ELEMENTS = TermsPackage.SORT_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = TermsPackage.SORT_DECL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementImpl <em>Partition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionElement()
	 * @generated
	 */
	int PARTITION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__ID = TermsPackage.OPERATOR_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__NAME = TermsPackage.OPERATOR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Partitionelementconstant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_FEATURE_COUNT = TermsPackage.OPERATOR_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionOperatorImpl <em>Partition Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionOperatorImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionOperator()
	 * @generated
	 */
	int PARTITION_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR__SUBTERM = TermsPackage.BUILT_IN_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Partition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATOR_FEATURE_COUNT = TermsPackage.BUILT_IN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl <em>Partition Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionElementOf()
	 * @generated
	 */
	int PARTITION_ELEMENT_OF = 3;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__NAME = PARTITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refpartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF__REFPARTITION = PARTITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ELEMENT_OF_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.LessThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 4;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.GreaterThanImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 5;

	/**
	 * The feature id for the '<em><b>Subterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__SUBTERM = PARTITION_OPERATOR__SUBTERM;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = PARTITION_OPERATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getDef()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getPartitionElements <em>Partition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partition Elements</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition#getPartitionElements()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartitionElements();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Element</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement
	 * @generated
	 */
	EClass getPartitionElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement#getPartitionelementconstant <em>Partitionelementconstant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitionelementconstant</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement#getPartitionelementconstant()
	 * @see #getPartitionElement()
	 * @generated
	 */
	EReference getPartitionElement_Partitionelementconstant();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionOperator <em>Partition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Operator</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionOperator
	 * @generated
	 */
	EClass getPartitionOperator();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf <em>Partition Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Element Of</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf
	 * @generated
	 */
	EClass getPartitionElementOf();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf#getRefpartition <em>Refpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refpartition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf#getRefpartition()
	 * @see #getPartitionElementOf()
	 * @generated
	 */
	EReference getPartitionElementOf_Refpartition();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartitionsFactory getPartitionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__DEF = eINSTANCE.getPartition_Def();

		/**
		 * The meta object literal for the '<em><b>Partition Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITION_ELEMENTS = eINSTANCE.getPartition_PartitionElements();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementImpl <em>Partition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionElement()
		 * @generated
		 */
		EClass PARTITION_ELEMENT = eINSTANCE.getPartitionElement();

		/**
		 * The meta object literal for the '<em><b>Partitionelementconstant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT = eINSTANCE.getPartitionElement_Partitionelementconstant();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionOperatorImpl <em>Partition Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionOperatorImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionOperator()
		 * @generated
		 */
		EClass PARTITION_OPERATOR = eINSTANCE.getPartitionOperator();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl <em>Partition Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionElementOfImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getPartitionElementOf()
		 * @generated
		 */
		EClass PARTITION_ELEMENT_OF = eINSTANCE.getPartitionElementOf();

		/**
		 * The meta object literal for the '<em><b>Refpartition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ELEMENT_OF__REFPARTITION = eINSTANCE.getPartitionElementOf_Refpartition();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.LessThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.GreaterThanImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl.PartitionsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

	}

} //PartitionsPackage
