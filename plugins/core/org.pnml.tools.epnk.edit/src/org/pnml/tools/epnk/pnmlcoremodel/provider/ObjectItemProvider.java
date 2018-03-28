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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.pnmlcoremodel.attribute.providerhelpers.ItemPropertyAttributeDelegateDescriptor;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensionFactory;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensions;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pnmlcoremodel.Object} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectItemProvider
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
	public ObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private List<IItemPropertyDescriptor> getPropertyDescriptorsGen(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * The non-generated part adds a property descriptor for attributes of the 
	 * Petri net element.
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			getPropertyDescriptorsGen(object);

			// eki: Added the attributes of this object
			if (object instanceof org.pnml.tools.epnk.pnmlcoremodel.Object) {
				org.pnml.tools.epnk.pnmlcoremodel.Object pnObject = 
						(org.pnml.tools.epnk.pnmlcoremodel.Object) object;
				List<EStructuralFeature> features = pnObject.eClass().getEAllStructuralFeatures();
				EClass attributeClass = PnmlcoremodelPackage.eINSTANCE.getAttribute();
				for (EStructuralFeature feature: features) {
					if (feature instanceof EReference) {
						EReference reference = (EReference) feature;
						EClassifier classifier = reference.getEType();
						if (classifier instanceof EClass) {
							EClass eClass = (EClass) classifier;
							if (attributeClass.isSuperTypeOf(eClass) ) {
								itemPropertyDescriptors.add( new ItemPropertyAttributeDelegateDescriptor(reference));
							}
						}
					}		
				}
			}
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
			childrenFeatures.add(PnmlcoremodelPackage.Literals.OBJECT__NAME);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.OBJECT__TOOLSPECIFIC);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.OBJECT__GRAPHICS);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.OBJECT__UNKNOWN);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.pnml.tools.epnk.pnmlcoremodel.Object)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Object_type") : //$NON-NLS-1$
			getString("_UI_Object_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(org.pnml.tools.epnk.pnmlcoremodel.Object.class)) {
			case PnmlcoremodelPackage.OBJECT__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PnmlcoremodelPackage.OBJECT__NAME:
			case PnmlcoremodelPackage.OBJECT__TOOLSPECIFIC:
			case PnmlcoremodelPackage.OBJECT__GRAPHICS:
			case PnmlcoremodelPackage.OBJECT__UNKNOWN:
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
				(PnmlcoremodelPackage.Literals.OBJECT__NAME,
				 PnmlcoremodelFactory.eINSTANCE.createName()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.OBJECT__TOOLSPECIFIC,
				 PnmlcoremodelFactory.eINSTANCE.createToolInfoText()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.OBJECT__GRAPHICS,
				 PnmlcoremodelFactory.eINSTANCE.createArcGraphics()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.OBJECT__GRAPHICS,
				 PnmlcoremodelFactory.eINSTANCE.createNodeGraphics()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.OBJECT__GRAPHICS,
				 PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics()));
	}
	
	// @generated NOT
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);
		
		ToolspecificExtensionFactory[] factories = ToolspecificExtensions.getInstance().getToolspecificExtensionFactories();
		for (ToolspecificExtensionFactory factory: factories) {
			ToolInfo toolinfo = factory.createToolInfo();
			toolinfo.setTool(factory.getToolName());
			toolinfo.setVersion(factory.getToolVersion());
			newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.OBJECT__TOOLSPECIFIC,
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

}
