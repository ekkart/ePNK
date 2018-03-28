/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.provider;


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

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import org.pnml.tools.epnk.structuredpntypemodel.provider.StructuredLabelItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HLMarkingItemProvider
	extends StructuredLabelItemProvider
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
	public HLMarkingItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE);
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
	 * This returns HLMarking.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HLMarking")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((HLMarking)object).getText());
		return label == null || label.length() == 0 ?
			getString("_UI_HLMarking_type") : //$NON-NLS-1$
			getString("_UI_HLMarking_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(HLMarking.class)) {
			case HlpngdefinitionPackage.HL_MARKING__STRUCTURE:
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
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 TermsFactory.eINSTANCE.createTuple()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 TermsFactory.eINSTANCE.createUserOperator()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 DotsFactory.eINSTANCE.createDotConstant()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createCardinalityOf()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createNumberOf()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createSubtract()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createScalarProduct()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 MultisetsFactory.eINSTANCE.createEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createInequality()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createImply()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 BooleansFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createLessThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
				 IntegersFactory.eINSTANCE.createModulo()));

		newChildDescriptors.add
			(createChildParameter
				(HlpngdefinitionPackage.Literals.HL_MARKING__STRUCTURE,
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
		return HLPNGDefinitionEditPlugin.INSTANCE;
	}

}
