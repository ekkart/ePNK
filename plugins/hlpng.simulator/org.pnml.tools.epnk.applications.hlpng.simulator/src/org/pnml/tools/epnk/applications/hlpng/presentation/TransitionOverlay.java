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
package org.pnml.tools.epnk.applications.hlpng.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.pnml.tools.epnk.applications.hlpng.presentation.actions.IAction;
import org.pnml.tools.epnk.applications.hlpng.presentation.decorations.AbstractRectangleOverlay;
import org.pnml.tools.epnk.applications.hlpng.simulator.ISimulator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public abstract class TransitionOverlay extends AbstractRectangleOverlay
{
	final protected List<FiringMode> firingModes;
	final protected ISimulator simulator;
	final protected boolean manualInput;
	final protected Transition transition;

	public TransitionOverlay(final ISimulator simulator, 
			final IFigure figure, final List<FiringMode> firingModes, 
			final boolean manualInput, final Transition transition)
	{
		super(figure);
		
		this.manualInput = manualInput;
		this.firingModes = firingModes;
		this.simulator = simulator;
		this.transition = transition;
	}

	@Override
    public List<IAction> getActions()
    {
		List<IAction> actions = new ArrayList<IAction>();
		
		for(FiringMode mode : firingModes)
		{
			FiringModePopupMenuItem item = 
					new FiringModePopupMenuItem(mode.toString(), mode);
			actions.add(item);
		}
		
		if(manualInput)
		{
			FiringModePopupMenuItem item = 
					new FiringModePopupMenuItem("Manual input", null);
			actions.add(item);
		}
		return actions;
    }

	@Override
    public void executeAction(IAction action)
    {
		if(action instanceof FiringModePopupMenuItem)
		{
			FiringModePopupMenuItem item = (FiringModePopupMenuItem) action;
			if(item.getMode() != null)
			{
				simulator.fire(item.getMode(), true);
			}	
			else
			{
				simulator.updateTransitionBinding(transition, false);
			}
		}
    }
	
	@Override
    public void executeAction(){}
}
