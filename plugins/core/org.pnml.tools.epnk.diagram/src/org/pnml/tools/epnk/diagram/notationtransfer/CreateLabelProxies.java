package org.pnml.tools.epnk.diagram.notationtransfer;

import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.helpers.ReflectiveLabelHandler;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

// @generated NOT
public class CreateLabelProxies {
	
	public static void createLabelProxies(EditingDomain domain, Page page) {
		for (Object object: page.getObject()) {
			createLabelProxies(domain, object);
		}
		
		createPageLabelProxies(domain, page);
		
	}
	
	@SuppressWarnings("unchecked")
	public static void createPageLabelProxies(EditingDomain domain, Page page) {
		EList<PageLabelProxy> proxies = page.getPageLabelProxy();
		
		EClass eClass = page.eClass();
		EList<EReference> features = eClass.getEAllContainments();
		
		for (EReference reference: features) {
			if (page.showLabelOnPage(reference) /* reference != PnmlcoremodelPackage.eINSTANCE.getObject_Name() */) {
				// all other label features than the name will go to the PageLabelProxies
				// except for the attribute features
				if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(reference.getEReferenceType()) &&
					!PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(reference.getEReferenceType())	) {
					if (reference.isMany()) {
						List<Label> list = (List<Label>) page.eGet(reference); 
						for (Label label: list) {
							boolean found =  false;
							for (PageLabelProxy proxy: proxies) {
								if (proxy.getLabel() == label) {
									found = true;
									break;
								}
							}
							if (!found) {
								PageLabelProxy proxy = PnmlcoremodelFactory.eINSTANCE.createPageLabelProxy();
								connectPageLabelProxyWithLabel(proxy,label);

								BasicCommandStack stack = 
									(BasicCommandStack) domain.getCommandStack();
								// TODO: this should be done in a single CompoundCommand for all added labels!
								stack.execute((Command) new AddCommand(domain, proxies, proxy)); 	
							}
						}
					} else {
						Label label = (Label) page.eGet(reference); 
						if (label != null) {
							boolean found =  false;
							for (PageLabelProxy proxy: proxies) {
								if (proxy.getLabel() == label) {
									found = true;
									break;
								}
							}
							if (!found) {
								PageLabelProxy proxy = PnmlcoremodelFactory.eINSTANCE.createPageLabelProxy();
								connectPageLabelProxyWithLabel(proxy,label);

								BasicCommandStack stack = 
									(BasicCommandStack) domain.getCommandStack();
								// this should be done in a single CompoundCommand for all added labels!
								stack.execute((Command) new AddCommand(domain, proxies, proxy)); 	
							}
						}
					}
				}
			}
		}
	}

    public static void connectPageLabelProxyWithLabel(PageLabelProxy proxy, Label label) {
		proxy.setLabel(label);
		String text = null;
		if (label instanceof StructuredLabel) {
			text = ((StructuredLabel) label).getText();
		} else {
			text = ReflectiveLabelHandler.getValueAsString(label);
		}
		proxy.setText(text);
    }
	
	@SuppressWarnings("unchecked")
	public static void createLabelProxies(EditingDomain domain, Object object) {
		// TODO this could be done for all objects on the page together, which
		//      would be more efficient (the reason for doing it for objects
		//      individually is that in the earlier version labelProxies were
		//      attached directly to Objects and not to the page they were 
		//      contained in).
		EObject container = object.eContainer();

		if (container != null && container instanceof Page) {
			Page page = (Page) container;
			
			EList<LabelProxy> proxies = page.getLabelproxy();

			EClass eClass = object.eClass();
			EList<EReference> features = eClass.getEAllContainments();

			for (EReference reference: features) {
				if (!(object instanceof Page) || !((Page) object).showLabelOnPage(reference) /*reference == PnmlcoremodelPackage.eINSTANCE.getObject_Name() */) {
					if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(reference.getEReferenceType()) &&
						!PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(reference.getEReferenceType())) {
						if (reference.isMany()) {
							// TODO this case is not yet implemented
							List<Label> list = (List<Label>) object.eGet(reference); 
							for (Label label: list) {
								boolean found =  false;
								for (LabelProxy proxy: proxies) {
									if (proxy.getLabel() == label) {
										found = true;
										break;
									}
								}
								if (!found) {
									LabelProxy proxy = PnmlcoremodelFactory.eINSTANCE.createLabelProxy();
									connectLabelProxyWithLabel(proxy,label);

									BasicCommandStack stack = 
										(BasicCommandStack) domain.getCommandStack();
									// this should be done in a single CompoundCommand for all added labels!
									stack.execute((Command) new AddCommand(domain, proxies, proxy)); 	
								}
							}
						} else {
							Label label = (Label) object.eGet(reference); 
							if (label != null) {
								boolean found =  false;
								for (LabelProxy proxy: proxies) {
									if (proxy.getLabel() == label) {
										found = true;
										break;
									}
								}
								if (! found) {
									LabelProxy proxy = PnmlcoremodelFactory.eINSTANCE.createLabelProxy();
									connectLabelProxyWithLabel(proxy,label);

									BasicCommandStack stack = 
										(BasicCommandStack) domain.getCommandStack();
									// this should be done in a single CompoundCommand for all added labels!
									stack.execute((Command) new AddCommand(domain, proxies, proxy)); 	
								}
							}
						}
					}
				}
			}
		}
	}
	
    public static void connectLabelProxyWithLabel(LabelProxy proxy, Label label) {
		proxy.setLabel(label);
		String text = null;
		if (label instanceof StructuredLabel) {
			text = ((StructuredLabel) label).getText();
		} else {
			text = ReflectiveLabelHandler.getValueAsString(label);
		}
		proxy.setText(text);
    }

}
