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
package org.pnml.tools.epnk.applications.hlpng.simulator;

import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeState;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.ISimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.applications.presentation.IApplicationWithPresentation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public interface ISimulator extends IApplicationWithPresentation
{
	public void auto();
	public void stop();
	public void next();
	public void init();
	public void reset();
	public void previous();
	public void show(IRuntimeState state);
	public void fire(FiringMode mode, boolean updateAnnotations);
	public void updateTransitionBinding(IRuntimeState state);
	public void updateTransitionBinding(IRuntimeState state, Transition transition, boolean clear);
	public void updateTransitionBinding();
	public void updateTransitionBinding(Transition transition, boolean clear);
	public void setSimulationPause(long simulationPause);
	public void setSimulationViewController(ISimulationViewController simulationViewController);
}
