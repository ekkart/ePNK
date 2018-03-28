/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 *  is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 *  in and a simple generic GMF editor, that can be used for graphically editing
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
package org.pnml.tools.epnk.pnmlcoremodel.provider;


import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.pntypes.extension.PetriNetTypeExtensions;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensionFactory;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensions;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetItemProvider
	extends ItemProviderAdapter
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
	public PetriNetItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ID_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ID_id_feature", "_UI_ID_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PnmlcoremodelPackage.Literals.ID__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PETRI_NET__TYPE);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PETRI_NET__NAME);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PETRI_NET__PAGE);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PETRI_NET__TOOLSPECIFIC);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PETRI_NET__UNKNOWN);
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
	 * This returns PetriNet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PetriNet")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (show type URI in net label)
	 * @author eki
	 */
	@Override
	public String getText(Object object) {
		String label = ((PetriNet)object).getId();
		String result = label == null || label.length() == 0 ?
			getString("_UI_PetriNet_type") : //$NON-NLS-1$
			getString("_UI_PetriNet_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
		PetriNetType type = ((PetriNet)object).getType();
		return type == null ? result : result + ": " + type; 
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

		switch (notification.getFeatureID(PetriNet.class)) {
			case PnmlcoremodelPackage.PETRI_NET__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
			case PnmlcoremodelPackage.PETRI_NET__NAME:
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
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
	protected void collectNewChildDescriptorsGen(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__TYPE,
				 PnmlcoremodelFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__NAME,
				 PnmlcoremodelFactory.eINSTANCE.createName()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__PAGE,
				 PnmlcoremodelFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__TOOLSPECIFIC,
				 PnmlcoremodelFactory.eINSTANCE.createToolInfoText()));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object. The children from the model are added by
	 * calling the automatically generated method {@link collectNewChildDescriptorsGen};
	 * here, we add the types that were plugged in.
	 * 
	 * @generated NOT
	 * @author kindler
	 */
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);
		
		List<PetriNetType> types = PetriNetTypeExtensions.getInstance().getPetriNetTypes();
		for (PetriNetType type: types) {
			newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__TYPE,
				 type.createPetriNetType()));
		}
		
		ToolspecificExtensionFactory[] factories = ToolspecificExtensions.getInstance().getToolspecificExtensionFactories();
		for (ToolspecificExtensionFactory factory: factories) {
			ToolInfo toolinfo = factory.createToolInfo();
			toolinfo.setTool(factory.getToolName());
			toolinfo.setVersion(factory.getToolVersion());
			newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PETRI_NET__TOOLSPECIFIC,
				 toolinfo));			
		}
	}
	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PNMLCoreModelEditPlugin.INSTANCE;
	}
	
	@Override
	// @generated NOT
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (collection.size() == 1) {
			Object o = collection.toArray()[0];
			
			// FIXME this needs to be done in a slightly nicer way.
			// This replaces pages with the type of page
			// fitting to the type of this Petri net.
			if (o instanceof Page) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					Page p = type.createPage();
					Vector<EObject> c = new Vector<EObject>();
					c.add(p);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} 
		}
		
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

}
