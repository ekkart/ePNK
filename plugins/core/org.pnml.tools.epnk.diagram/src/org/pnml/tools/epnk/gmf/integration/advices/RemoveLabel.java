package org.pnml.tools.epnk.gmf.integration.advices;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

// @generated NOT
// @author eki
public class RemoveLabel extends AbstractTransactionalCommand {

	private Object object;
	private Label label;
	
	public RemoveLabel(Object object, Label label) { 
		super(TransactionUtil.getEditingDomain(object),
				"Remove label with its proxy",
				Collections.singletonList(WorkspaceSynchronizer.getFile(object.eResource())));
		this.object = object;
		this.label = label;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (object == null || label == null) {
			return CommandResult.newErrorCommandResult("Invalid input");
		}
		
		
		
		EStructuralFeature feature = label.eContainmentFeature();
		if (feature.isMany()) {
			((EList) object.eGet(feature)).remove(label);
		} else {
			object.eSet(feature, null);
		}
		
		if (label instanceof StructuredLabel) {
			// In the GMF editor also do the linking when a label is removed
			// Note that, for this to work, we need to temporarily save the
			// structure somewhere in the source.
			PetriNet net = NetFunctions.getPetriNet(object);
			NetFunctions.linkNetSymbols(net);
		}
		
		return CommandResult.newOKCommandResult();
	}

}
