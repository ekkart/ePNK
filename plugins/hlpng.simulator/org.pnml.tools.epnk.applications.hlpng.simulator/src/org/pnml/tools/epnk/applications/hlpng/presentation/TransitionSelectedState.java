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
import org.pnml.tools.epnk.applications.hlpng.simulator.ISimulator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class TransitionSelectedState extends TransitionOverlay
{
	public TransitionSelectedState(final ISimulator simulator, 
			final IFigure figure, final List<FiringMode> firingModes, 
			final boolean manualInput, final Transition transition)
	{
		super(simulator, figure, firingModes, manualInput, transition);
		this.setForegroundColor(ColorConstants.blue);
		this.setBackgroundColor(ColorConstants.blue);
	}
}

