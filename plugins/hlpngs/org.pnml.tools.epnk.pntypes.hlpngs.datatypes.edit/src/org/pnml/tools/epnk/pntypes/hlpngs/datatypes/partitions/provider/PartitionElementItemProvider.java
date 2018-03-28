/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.OperatorDeclItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionElementItemProvider
	extends OperatorDeclItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PartitionElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PartitionElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PartitionElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PartitionElement_type") :
			getString("_UI_PartitionElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PartitionElement.class)) {
			case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 PartitionsFactory.eINSTANCE.createPartitionElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 PartitionsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 PartitionsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 TermsFactory.eINSTANCE.createTuple()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 TermsFactory.eINSTANCE.createUserOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 DotsFactory.eINSTANCE.createDotConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createCardinalityOf()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createNumberOf()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createSubtract()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createScalarProduct()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 MultisetsFactory.eINSTANCE.createEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createInequality()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createImply()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 BooleansFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createLessThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createModulo()));

		newChildDescriptors.add
			(createChildParameter
				(PartitionsPackage.Literals.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT,
				 IntegersFactory.eINSTANCE.createNumberConstant()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HLPNGDataTypesEditPlugin.INSTANCE;
	}

}
