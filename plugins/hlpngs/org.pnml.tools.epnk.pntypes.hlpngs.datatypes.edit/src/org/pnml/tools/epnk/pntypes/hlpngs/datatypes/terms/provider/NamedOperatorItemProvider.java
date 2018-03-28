/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedOperatorItemProvider
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
	public NamedOperatorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TermsPackage.Literals.NAMED_OPERATOR__PARAMETERS);
			childrenFeatures.add(TermsPackage.Literals.NAMED_OPERATOR__DEF);
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
	 * This returns NamedOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NamedOperator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NamedOperator_type") :
			getString("_UI_NamedOperator_type") + " " + label;
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

		switch (notification.getFeatureID(NamedOperator.class)) {
			case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			case TermsPackage.NAMED_OPERATOR__DEF:
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
				(TermsPackage.Literals.NAMED_OPERATOR__PARAMETERS,
				 TermsFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 TermsFactory.eINSTANCE.createTuple()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 TermsFactory.eINSTANCE.createUserOperator()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 DotsFactory.eINSTANCE.createDotConstant()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createCardinalityOf()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createNumberOf()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createSubtract()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createScalarProduct()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 MultisetsFactory.eINSTANCE.createEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createInequality()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createImply()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 BooleansFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createLessThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createModulo()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.NAMED_OPERATOR__DEF,
				 IntegersFactory.eINSTANCE.createNumberConstant()));
	}

}
