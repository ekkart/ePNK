package org.pnml.tools.epnk.gmf.integration.advices;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

// @generated NOT
// @author eki
public class DetachLabelProxies extends AbstractTransactionalCommand {

	private Object object;
	
	public DetachLabelProxies(Object object) { 
		super(TransactionUtil.getEditingDomain(object),
				"Detach objects label proxies",
				Collections.singletonList(WorkspaceSynchronizer.getFile(object.eResource())));
		this.object = object;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (object == null) {
			return CommandResult.newErrorCommandResult("Invalid input");
		}
		 
		/*
        EList<LabelProxy> list =  object.getLabelproxy();
        while (list.size() > 0) {
        	LabelProxy proxy = list.get(0);
        	proxy.setLabel(null);
        	list.remove(0);
        }
        */
       
	    boolean needsLinking = detachLabels(object);
        // TODO: eventually, we should also detach the labels of
	    //       the attached arcs; but this would require a change
	    //       of the model (which will be needed anyway eventually):
	    //       out and in features from nodes to their arcs (transient).
	    
	    if (needsLinking) {
	    	// In the GMF editor also do the linking when a label is removed
	    	PetriNet net = NetFunctions.getPetriNet(object);
	    	NetFunctions.linkNetSymbols(net);
	    }

		return CommandResult.newOKCommandResult();
	}
	
	private boolean detachLabels(Object object) {
		boolean needsLinking = false;
		EObject container = object.eContainer();
		if (container != null && container instanceof Page) {
			Page page = (Page) container;
			for (LabelProxy proxy: page.getLabelproxy()) {
				Label label = proxy.getLabel();
				if (label != null && label.eContainer() == object) {
					proxy.setLabel(null);
					if (label instanceof StructuredLabel) {
						needsLinking = true;
					}
				}
			}
			if (object instanceof Node) {
				Node node = (Node) object;
				// if the object is a node, also detach the labels
				// of the attached arcs.
				for (Arc arc: node.getIn()) {
					needsLinking = detachLabels(arc) || needsLinking;
				}
				for (Arc arc: node.getOut()) {
					needsLinking = detachLabels(arc) || needsLinking;
				}
			}
		}
		return needsLinking;
	}

}
