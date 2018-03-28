package dk.dtu.imm.se.pngen.att.test.blockstructure.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.compute.ComputeBlocks;
import dk.dtu.imm.se.pngen.att.test.blockstructure.view.BlockStructureView;


public class ComputeBlockActions implements IObjectActionDelegate {
	
	private PetriNet petrinet;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			Block block = ComputeBlocks.computeBlocks(petrinet);
			BlockStructureView.updateView(block);
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		petrinet = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PetriNet) {
				petrinet = (PetriNet) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return petrinet != null;
	}



}
