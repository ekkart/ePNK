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

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.pnml.tools.epnk.applications.hlpng.presentation.actions.IAction;
import org.pnml.tools.epnk.applications.hlpng.presentation.decorations.AbstractRectangleOverlay;
import org.pnml.tools.epnk.applications.hlpng.simulator.ISimulator;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class TransitionUnknownState extends AbstractRectangleOverlay
{
	private final Transition transition;
	private final ISimulator simulator;
	
	public TransitionUnknownState(final ISimulator simulator, 
			final IFigure figure, final Transition transition)
	{
		super(figure);
		
		this.transition = transition;
		this.simulator = simulator;
		
		this.setForegroundColor(ColorConstants.gray);
		this.setBackgroundColor(ColorConstants.gray);
	}

	@Override
    public List<IAction> getActions()
    {
	    return null;
    }

	@Override
    public void executeAction(IAction action){}
	
	@Override
    public void executeAction()
    {
		simulator.updateTransitionBinding(transition, false);
    }
}
