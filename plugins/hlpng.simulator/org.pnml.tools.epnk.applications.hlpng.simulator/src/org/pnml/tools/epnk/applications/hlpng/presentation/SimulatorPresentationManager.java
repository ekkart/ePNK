/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 *     Ekkart Kindler - 2016 added implementation of getApplication() which is now
 *                           needed due to a change in the interface of IPresentationManager
 *
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.presentation;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Font;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.hlpng.presentation.decorations.AbstractRectangleOverlay;
import org.pnml.tools.epnk.applications.hlpng.presentation.decorations.LabelLayer;
import org.pnml.tools.epnk.applications.hlpng.presentation.decorations.TopRightLabel;
import org.pnml.tools.epnk.applications.hlpng.presentation.marking.PlaceMarking;
import org.pnml.tools.epnk.applications.hlpng.presentation.marking.TransitionMarking;
import org.pnml.tools.epnk.applications.hlpng.presentation.popup.SelectionHandler;
import org.pnml.tools.epnk.applications.hlpng.simulator.ISimulator;
import org.pnml.tools.epnk.applications.presentation.IPresentationManager;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class SimulatorPresentationManager implements IPresentationManager
{
	protected SelectionHandler selectionHandler = null;
	protected ISimulator simulator = null;
	protected Font font = null;
	
	public SimulatorPresentationManager(ISimulator simulator, Font font)
	{
		this.simulator = simulator;
		this.selectionHandler = new SelectionHandler(simulator);
		this.font = font;
	}

	@Override
	public IFigure handle(ObjectAnnotation objectAnnotation, 
			AbstractGraphicalEditPart graphicalEditPart)
	{
		final IFigure figure = graphicalEditPart.getFigure();
		
		if(objectAnnotation instanceof TransitionMarking)
		{
			final TransitionMarking marking = (TransitionMarking) objectAnnotation;

			AbstractRectangleOverlay coloredMarking = null;
			
			if(!marking.isSuccess())
			{
				coloredMarking = new TransitionUnknownState(simulator, figure, 
						(Transition)marking.getObject());
			}
			else
			{
				if(!marking.isFired())
				{
					coloredMarking = new TransitionReadyState(simulator, 
							figure, marking.getModes(), marking.isManualInput(),
							(Transition)marking.getObject());	
				}
				else
				{
					coloredMarking = new TransitionSelectedState(simulator, 
							figure, marking.getModes(), marking.isManualInput(),
							(Transition)marking.getObject());
				}
			}
			
			coloredMarking.addMouseListener(selectionHandler);
			return coloredMarking;
		}
		else if(objectAnnotation instanceof PlaceMarking)
		{
			PlaceMarking marking = (PlaceMarking) objectAnnotation;
			org.pnml.tools.epnk.pnmlcoremodel.Object place = marking.getObject();
			
			StringBuffer names = new StringBuffer();
			if(place.getName() != null)
			{
				names.append(place.getName().getText() + "\n");
			}
			
			Label label = new TopRightLabel(font, marking.getMsValue().toString(), figure);
			
			return new LabelLayer(figure, label);
		}
		return null;
	}
	
	@Override
    public void notifyOwner()
    {
	    simulator.activate();
    }

}




