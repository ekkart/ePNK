/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
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
package org.pnml.tools.epnk.actions.framework.jobs;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public abstract class AbstractEPNKAction implements IObjectActionDelegate {
	
	private PetriNet petrinet;
	
	private String defaultInput;

	public boolean isEnabled(PetriNet petrinet) {
		return true;
	}
	
	abstract protected AbstractEPNKJob createJob(PetriNet petrinet, String defaultInput);
	
	// eki: from here only final methods that cannot be overridden
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	final public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// eki: do nothing just for interface
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	final public void run(IAction action) {
		AbstractEPNKJob job = createJob(petrinet,defaultInput);
		
		if (job.prepare()) {
			defaultInput = job.getInput();
			// eki: Since there are porblems with user jobs, I do not
			// start the job as a user job right now.
			// job.setUser(true);
			job.setPriority(Job.SHORT);
			job.schedule(); 
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	final public void selectionChanged(IAction action, ISelection selection) {
		petrinet = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PetriNet) {
				petrinet = (PetriNet) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled(petrinet));
	}

}
