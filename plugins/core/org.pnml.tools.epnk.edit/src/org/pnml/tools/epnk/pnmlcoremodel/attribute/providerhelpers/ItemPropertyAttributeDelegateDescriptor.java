/**
 * 
 */
package org.pnml.tools.epnk.pnmlcoremodel.attribute.providerhelpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.pnml.tools.epnk.pnmlcoremodel.Attribute;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * An ItemPropertyDescriptor that shows the properties of an Attribute
 * as a property of the Petri net Object that contains the Attribute.
 * 
 * @generated NOT (complete class written manually)
 * @author eki
 */
public class ItemPropertyAttributeDelegateDescriptor implements
		IItemPropertyDescriptor {

	private EReference feature;
	private EClass     attributeClass;
	private EAttribute textAttribute; 
	
	public ItemPropertyAttributeDelegateDescriptor(EReference feature) {
		super();
		Assert.isNotNull(feature,
				"Illegal use of ItemPropertyAttributeDelegateDescriptor without feature.");
		this.feature = feature;
		
		EClassifier classifier = feature.getEType();
		Assert.isTrue(classifier instanceof EClass && 
				PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf((EClass) classifier), 
				"Illegal use of ItemPropertyAttributeDelegateDescriptor: feature must refer to " +
				"a subclass of Attribute of the PNML Core Model.");
		this.attributeClass = (EClass) classifier; 
		
		EStructuralFeature textFeature =  attributeClass.getEStructuralFeature("text");
		Assert.isTrue(textFeature != null && textFeature instanceof EAttribute,
				"Error in a Petri Net Type Definition: Attribute labels must have a text attribute.");
		this.textAttribute = (EAttribute) textFeature;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#canSetProperty(java.lang.Object)
	 */
	@Override
	public boolean canSetProperty(Object arg0) {
		if (arg0 instanceof org.pnml.tools.epnk.pnmlcoremodel.Object) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getCategory(java.lang.Object)
	 */
	@Override
	public String getCategory(Object arg0) {
		return "ePNK: Object attributes";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object arg0) {
		if (PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(attributeClass)) {
			if (!this.feature.isMany()) {
				EClassifier type = textAttribute.getEType();
				if (type instanceof EEnum) {
					List<EEnumLiteral> literalList = ((EEnum) type).getELiterals();
					List<Object> result = new ArrayList<Object>();
					for (EEnumLiteral literal:literalList) {
						result.add(literal.getInstance());
					}
					return result;
				} 
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDescription(java.lang.Object)
	 */
	@Override
	public String getDescription(Object arg0) {
		return "Content of the attribute " + feature.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDisplayName(java.lang.Object)
	 */
	@Override
	public String getDisplayName(Object arg0) {
		return feature.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getFeature(java.lang.Object)
	 */
	@Override
	public Object getFeature(Object arg0) {
		return textAttribute;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getFilterFlags(java.lang.Object)
	 */
	@Override
	public String[] getFilterFlags(Object arg0) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getHelpContextIds(java.lang.Object)
	 */
	@Override
	public Object getHelpContextIds(Object arg0) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getId(java.lang.Object)
	 */
	@Override
	public String getId(Object arg0) {
		if (arg0 instanceof EObject) {
			EObject delegator = (EObject) arg0;
			String result  = delegator.eClass().getEPackage().getNsURI() + "/" + 
			delegator.getClass().getName() + "/" + this.feature.getFeatureID();
			return result;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getLabelProvider(java.lang.Object)
	 */
	@Override
	public IItemLabelProvider getLabelProvider(Object arg0) {
		return new IItemLabelProvider() {

			@Override
			public Object getImage(Object arg0) {
				return null;
			}

			@Override
			public String getText(Object arg0) {
				return arg0.toString();
			}
		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object arg0) {
		if (arg0 instanceof EObject) {
			EObject delegator = (EObject) arg0;

			Object content = delegator.eGet(this.feature);
			if (content != null) {
				if (this.feature.isMany()) {
					if (content instanceof List<?>) {
						List<Object> list = new ArrayList<Object>();
						List<?> attributeList = (List<?>) content;
						for (Object object: attributeList) {
							if (object instanceof Attribute) {
								Attribute attribute = (Attribute) object;
								list.add(attribute.eGet(textAttribute));
							}
						}
						return list;
					}
				} else {
					if (content instanceof Attribute)
						return ((Attribute) content).eGet(textAttribute);
				}
			}
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isCompatibleWith(java.lang.Object, java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	@Override
	public boolean isCompatibleWith(Object arg0, Object arg1,
			IItemPropertyDescriptor arg2) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isMany(java.lang.Object)
	 */
	@Override
	public boolean isMany(Object arg0) {
		return feature.isMany();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isMultiLine(java.lang.Object)
	 */
	@Override
	public boolean isMultiLine(Object arg0) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isPropertySet(java.lang.Object)
	 */
	@Override
	public boolean isPropertySet(Object arg0) {
		if (isMany(arg0)) {
			Object value = getPropertyValue(arg0);
			if (value instanceof Collection<?>) {
				return !((Collection<?>) value).isEmpty();
			}
			return false;
		} else {
			return getPropertyValue(arg0) != null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#isSortChoices(java.lang.Object)
	 */
	@Override
	public boolean isSortChoices(Object arg0) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#resetPropertyValue(java.lang.Object)
	 */
	@Override
	public void resetPropertyValue(Object arg0) {
		if (arg0 instanceof EObject) {
			EObject delegator = (EObject) arg0;
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(delegator);	
			if (feature.isMany()) {
				Object attributes = delegator.eGet(feature);
				if (attributes instanceof Collection<?>) {
					if (!((Collection<?>) attributes).isEmpty()) {
						if (domain != null) {
							domain.getCommandStack().execute(new RemoveCommand(domain, delegator, feature, (Collection<?>) attributes));
						} else {
							delegator.eUnset(feature);
						}
					}
				}
			} else {
				Attribute attribute = (Attribute) delegator.eGet(feature);
				if (attribute != null) {
					if (domain != null) {
						domain.getCommandStack().execute(new SetCommand(domain, delegator, feature, null));
					} else {
						delegator.eUnset(feature);
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void setPropertyValue(Object arg0, Object arg1) {
		if (arg0 instanceof EObject) {
			EObject delegator = (EObject) arg0;

			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(delegator);

			if (this.feature.isMany()) {
				if (arg1 instanceof Collection<?>) {
					if (domain != null) {
						domain.getCommandStack().execute(new SetAttributeList(domain, delegator, attributeClass, this.feature, (Collection<?>) arg1));
					} else {
						Object content= delegator.eGet(this.feature);
						if (content != null && content instanceof EList<?>) {
							EList<Attribute> list = (EList<Attribute>) content;

							delegator.eUnset(this.feature);

							for (Object obj: (Collection<?>) arg1) {
								Attribute attribute = (Attribute) attributeClass.getEPackage().getEFactoryInstance().create(attributeClass);
								if (attribute != null) {
									attribute.eSet(textAttribute, obj);
									list.add(attribute);
								}
							}
						}
					}
				}
			} else {
				if (arg1 != null) {
					Attribute attribute = (Attribute) delegator.eGet(this.feature);
					if (attribute != null) {
						if (domain != null) {
							domain.getCommandStack().execute(new SetCommand(domain, attribute, textAttribute, arg1));
						} else {
							attribute.eSet(textAttribute, arg1);
						}
					} else {
						attribute = (Attribute) attributeClass.getEPackage().getEFactoryInstance().create(attributeClass);
						if (attribute != null && textAttribute != null) {
							attribute.eSet(textAttribute, arg1);
							if (domain != null) {
								domain.getCommandStack().execute(new SetCommand(domain, delegator, this.feature, attribute));
							} else {
								delegator.eSet(this.feature, attribute);
							}
						}
					}
				}
				else {
					resetPropertyValue(arg0);
				}
			}
		}
	}
		

}
