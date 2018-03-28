/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.BuiltInConstItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StringConstantItemProvider
	extends BuiltInConstItemProvider
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
	public StringConstantItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StringConstant_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StringConstant_value_feature", "_UI_StringConstant_type"),
				 StringsPackage.Literals.STRING_CONSTANT__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns StringConstant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StringConstant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StringConstant)object).getValue();
		return label == null || label.length() == 0 ?
			getString("_UI_StringConstant_type") :
			getString("_UI_StringConstant_type") + " " + label;
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

		switch (notification.getFeatureID(StringConstant.class)) {
			case StringsPackage.STRING_CONSTANT__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createSubstring()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createConcatenation()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createAppend()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLessThanOrEqual()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HLPNGStringsEditPlugin.INSTANCE;
	}

}
