package org.pnml.tools.epnk.diagram.decorators;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

public class SubPageDecorator extends AbstractDecorator {

    private final Image OPEN_SUBPAGES_IMAGE = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);

    private TransactionalEditingDomain domain;
    private Page page;

    public SubPageDecorator(IDecoratorTarget decoratorTarget) {
        super(decoratorTarget);
    	IGraphicalEditPart editPart = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
    	EObject element = editPart.resolveSemanticElement();
        if (element != null && element instanceof Page) {
        	page = (Page) element;
        	domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(element);
        }
    }
   
    public void activate() {
    	refresh();
    }

    public void refresh() {
    	removeDecoration();
    	if (page != null) {
    		MultipleEditorsInfo multipleEditorInfo = 
    			MultipleEditorsRegistry.getInstance().getInfo(domain);
    		if (multipleEditorInfo != null && 
    				multipleEditorInfo.isSecondaryEditorOpenOn(
    						NetFunctions.getAllSubPages(page))) {
    			setDecoration(getDecoratorTarget().addShapeDecoration(OPEN_SUBPAGES_IMAGE, IDecoratorTarget.Direction.SOUTH_WEST, -5, true));
    			Label tooltip = new Label("There are editors open on sub-pages");
    			getDecoration().setToolTip(tooltip);
    		}
    	}
    }

}

