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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.IProgressConstants;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;


public abstract class AbstractEPNKJob extends Job {
	
	private PetriNet petrinet;	
  
	public AbstractEPNKJob(PetriNet petrinet, String jobName) {
		super(jobName);
		this.petrinet = petrinet;
	}
	
	protected boolean prepare() {		
		return true;
	}
	
	protected String getInput() {
		return null;
	}
	
	abstract protected  void run();
	
	protected void showResult() {
		// does not do anything
		return;
	}
	
	// from here, there are only final methods that cannot be overridden
	// by concrete classes.
	
	@Override
	final public IStatus run(IProgressMonitor monitor) {

		try {
			run();
			// eki: the following is to fix a bug with job and the progress
			//      view (https://bugs.eclipse.org/bugs/show_bug.cgi?id=303574)
			//      in user jobs. For now, I do not use user jobs, though.
			// Thread.sleep(100);
		} catch (Exception e) {
			return Status.CANCEL_STATUS;
		}
		
		if (isModal()) {
        	Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    getShowResultAction().run();
                 }
              });

        } else {
            setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
            setProperty(IProgressConstants.ACTION_PROPERTY, 
                   getShowResultAction());
        }
		
		return Status.OK_STATUS;

	}
	
	final private Action getShowResultAction() {
		final AbstractEPNKJob job = this;
		return new Action("ePNK: Show job result action") {
			public void run() {
				job.showResult();
			}
		};
	}
	
	final protected PetriNet getPetriNet() {
		return petrinet;
	}

    final protected boolean isModal() {
        Boolean isModal = (Boolean) this.getProperty(
                               IProgressConstants.PROPERTY_IN_DIALOG);
        if(isModal == null) return false;
        return isModal.booleanValue();
     }
}
