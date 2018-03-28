/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.presentation.animation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;

public class PeriodicalWorkerJob extends UIJob
{
	private IWorker worker = null;
	
	public PeriodicalWorkerJob(Display jobDisplay, String name, IWorker worker)
    {
	    super(jobDisplay, name);
	    
	    this.worker = worker;
    }

	@Override
    public IStatus runInUIThread(IProgressMonitor monitor)
    {
	    if(!worker.isCompleted())
	    {
	    	worker.work();
	    	schedule(worker.getSimulationPause());	
	    }
	    
	    return Status.OK_STATUS;
    }
}
