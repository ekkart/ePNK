package org.pnml.tools.epnk.diagram.extensions.handlers;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.pnml.tools.epnk.diagram.extensions.commands.AddAndAdjustLabelsCommand;
import org.pnml.tools.epnk.helpers.LabelProviders;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Object;

public class AddDefaultLabelsHandler extends AbstractHandler implements IHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	    ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
	            .getActivePage().getSelection();
	        if (selection != null & selection instanceof IStructuredSelection) {
	          IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				if (structuredSelection.size() == 1) {
					java.lang.Object selected = structuredSelection.getFirstElement();
					if (selected instanceof EditPart) {
						EditPart part = (EditPart) selected;
						java.lang.Object model = part.getModel();
						if (model != null && model instanceof View) {
							EObject object = ((View) model).getElement();
							if (object != null && object instanceof Object) {
								Object pObject = (Object) object;

								// The ePNK LabelProvider class is used to calculate the labels that can be created for this
								// object. This means, that labels with multiplicity many will be created again
								// even if such a label exists already. In a realistic implementation, this should be computed in a
								// different way (but similar to the way it is done in createInstancesForLabelProxy())
								Map<Label,EReference> labels = LabelProviders.createInstancesForLabelProxy(pObject);
								EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(pObject);
								if (domain instanceof TransactionalEditingDomain) {
									if (labels != null) {
										domain.getCommandStack().execute(new AddAndAdjustLabelsCommand((TransactionalEditingDomain) domain, pObject, labels));  
									}

								}
							}
						}
					}
				}
	        }
	        return null;
	}
	
}
