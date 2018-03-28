package org.pnml.tools.epnk.gmf.integration.helpers;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.MEditingDomainElement;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Page;

/**
 * EditorInput that comes directly as a page in some resource from
 * a EMF editor.
 * @generated NOT EMF/GMF integration
 * @author eki
 */
public class PNMLPageEditorInput implements IEditorInput, MEditingDomainElement {
	
	private Page page;
	private String name;
	private String tooltip;
	
	public PNMLPageEditorInput(Page page) {
		super();
		this.page = page;
	}
	
	public Page getInputPage() {
		return page;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Here we could add an Image Descriptor  
		return null;
	}

	@Override
	public String getName() {
		if (name == null) {

			Name nameLabel = page.getName();
			if (nameLabel != null) {
				name = nameLabel.getText();
			} 

			if (name != null) {
				name = "Page: " + name;
			} else {
				String id = page.getId();
				if (id != null) {
					name = "Page (id): " + page.getId();			
				} else {
					Resource resource = page.eResource();
					if (resource != null) { 
						name = "Page (path): " + resource.getURIFragment(page).toString();
					} else {
						name = "Page (anonymous)";
					}
				}
			}
		}
		return name;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		if (tooltip == null) {
			Resource resource = page.eResource();
			if (resource != null) {
				String resourcename = resource.getURI().path();
				String fragmentname = resource.getURIFragment(page).toString();
				if (resourcename != null && fragmentname != null) {
					tooltip = resourcename + "/#" + fragmentname;
				}
			}
			
			if (tooltip == null) {
				tooltip = this.getName();
			}			
		}
		return tooltip;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		if (page != null) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(page);
			if (domain instanceof TransactionalEditingDomain) {
				return (TransactionalEditingDomain) domain;
			}
		}
		return null;
	}

    /**
     * Two inputs are equal, if they refer to the same page! This way, we will
     * not open two graphical editors for the same page.
     */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PNMLPageEditorInput) {
			return page == ((PNMLPageEditorInput) obj).page; 
		}
		return false;
	}
	

	/*
	public void doSave(IProgressMonitor progressMonitor) {
		// Forwards the doSave from the GMF-Editor to the EMF-Editor
        // TODO: This needs eventually to be refactored, so that it also works together
		//       with the XMI PNMLEditor.
		
		Resource resource = getInputPage().eResource();
		PnmlcoremodelEditorPNML editor = PnmlcoremodelEditorPNML.getPNMLEMFEditor(resource);
		editor.doSave(progressMonitor);

	}
	*/

}
