/**
 * 
 */
package org.pnml.tools.epnk.pnmlcoremodel.attribute.providerhelpers;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.pnml.tools.epnk.graphics.datatypes.URI;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * An ItemPropertyImageAttributeDescriptor shows the properties of the
 * image attribute of a node as a property of the Petri net Node.
 * 
 * @generated NOT (complete class written manually)
 * @author eki
 */
public class ItemPropertyImageAttributeDescriptor implements
		IItemPropertyDescriptor {

	/*
	private EReference feature;
	private EClass     attributeClass;
	private EAttribute textAttribute; 
	*/
	
	public ItemPropertyImageAttributeDescriptor() {
		super();
	}
	
	/*
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
	*/

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#canSetProperty(java.lang.Object)
	 */
	@Override
	public boolean canSetProperty(Object arg0) {
		if (arg0 instanceof Node) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getCategory(java.lang.Object)
	 */
	@Override
	public String getCategory(Object arg0) {
		return "ePNK: Graphical information";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object arg0) {
		/*
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
		*/
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDescription(java.lang.Object)
	 */
	@Override
	public String getDescription(Object arg0) {
		return "Image for this node";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getDisplayName(java.lang.Object)
	 */
	@Override
	public String getDisplayName(Object arg0) {
		return "Image";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getFeature(java.lang.Object)
	 */
	@Override
	public Object getFeature(Object arg0) {
		return PnmlcoremodelPackage.eINSTANCE.getFill_Image();
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
			delegator.getClass().getName() + "/ePNKgraphics/image";
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
		if (arg0 instanceof Node) {	
			Node node =  (Node) arg0;	
			Graphics graphics = node.getGraphics();
			if (graphics instanceof NodeGraphics) {
				Fill fill =((NodeGraphics) graphics).getFill();
				if (fill != null) {
					return fill.getImage();
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
		return false;
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
		return this.getPropertyValue(arg0) != null;
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
		if (arg0 instanceof Node) {	
			Node node =  (Node) arg0;	
			Graphics graphics = node.getGraphics();
			if (graphics instanceof NodeGraphics) {
				Fill fill =((NodeGraphics) graphics).getFill();
				if (fill != null) {
					EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(node);
					if (domain != null) {
						domain.getCommandStack().execute(
								new SetCommand(domain, fill, PnmlcoremodelPackage.eINSTANCE.getFill_Image(), null));
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object arg0, Object arg1) {
		if (arg0 instanceof Node && arg1 instanceof URI) {	
			Node node =  (Node) arg0;
			URI  uri = (URI) arg1;

			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(node);
			if (domain != null) {
				Graphics graphics = node.getGraphics();
				if (graphics instanceof NodeGraphics) {
					Fill fill = ((NodeGraphics) graphics).getFill();
					if (fill != null) {
						SetCommand command = new SetCommand(domain, fill, PnmlcoremodelPackage.eINSTANCE.getFill_Image(), arg1);
						domain.getCommandStack().execute(command);
					} else {
						fill = PnmlcoremodelFactory.eINSTANCE.createFill();
						fill.setImage(uri);
						CreateChildCommand command = new CreateChildCommand(domain, graphics, PnmlcoremodelPackage.eINSTANCE.getNodeGraphics_Fill(), fill, null);
						domain.getCommandStack().execute(command);
					}
				} else {
					NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
					Fill fill = PnmlcoremodelFactory.eINSTANCE.createFill();
					fill.setImage(uri);
					nodeGraphics.setFill(fill);
					CreateChildCommand command = new CreateChildCommand(domain, node, PnmlcoremodelPackage.eINSTANCE.getObject_Graphics(), nodeGraphics, null);
					domain.getCommandStack().execute(command);
				}
			}
		}
	}
		
}
