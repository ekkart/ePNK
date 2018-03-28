/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.provider;


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

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.OperatorDeclItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArbitraryOperatorItemProvider
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
	public ArbitraryOperatorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT);
			childrenFeatures.add(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT);
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
	 * This returns ArbitraryOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArbitraryOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArbitraryOperator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArbitraryOperator_type") :
			getString("_UI_ArbitraryOperator_type") + " " + label;
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

		switch (notification.getFeatureID(ArbitraryOperator.class)) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
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
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 TermsFactory.eINSTANCE.createMultiSetSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 TermsFactory.eINSTANCE.createProductSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 TermsFactory.eINSTANCE.createUserSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 DotsFactory.eINSTANCE.createDot()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 BooleansFactory.eINSTANCE.createBool()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 IntegersFactory.eINSTANCE.createNatural()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 IntegersFactory.eINSTANCE.createPositive()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT,
				 IntegersFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 TermsFactory.eINSTANCE.createMultiSetSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 TermsFactory.eINSTANCE.createProductSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 TermsFactory.eINSTANCE.createUserSort()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 DotsFactory.eINSTANCE.createDot()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 BooleansFactory.eINSTANCE.createBool()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 IntegersFactory.eINSTANCE.createNatural()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 IntegersFactory.eINSTANCE.createPositive()));

		newChildDescriptors.add
			(createChildParameter
				(ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT,
				 IntegersFactory.eINSTANCE.createInteger()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__INPUT ||
			childFeature == ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR__OUTPUT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HLPNGArbitraryDeclarationsEditPlugin.INSTANCE;
	}

}
