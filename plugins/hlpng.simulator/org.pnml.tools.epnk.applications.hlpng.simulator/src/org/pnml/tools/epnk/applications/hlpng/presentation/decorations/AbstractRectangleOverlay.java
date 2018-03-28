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
package org.pnml.tools.epnk.applications.hlpng.presentation.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.applications.hlpng.presentation.actions.IActionProvider;

public abstract class AbstractRectangleOverlay extends RectangleFigure implements IStateContext,
	IActionProvider
{
	final protected IFigure figure;
	protected IState currentState = null;

	public AbstractRectangleOverlay(final IFigure figure)
	{
		super();
		this.figure = figure;
	}
	
	@Override
	protected void fillShape(Graphics graphics)
	{
		graphics.pushState();
		graphics.setAlpha(150);
		graphics.setLineWidth(4);
		Rectangle bounds = getBounds();
		graphics.fillRectangle(bounds);
		graphics.popState();
	}

	@Override
	public Rectangle getBounds()
	{
		int shift = 3;
		Rectangle bounds = figure.getBounds();
		int x = bounds.x - shift;
		int y = bounds.y - shift;
		int width = bounds.width + 2 * shift;
		int height = bounds.height + 2 * shift;
		bounds = new Rectangle(x, y, width, height);
		return bounds;
	}

	@Override
    public void setState(IState state)
    {
	    this.currentState = state;
    }

	@Override
    public void request()
    {
		if(this.currentState != null)
		{
			this.currentState.handle();	
		}
    }

	@Override
    public IState getState()
    {
	    return currentState;
    }
}
