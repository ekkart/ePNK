/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     @author Mindaugas Laganeckas - initial API and implementation
 *     @author Ekkart Kindler       - 2013 ad hoc fix of the problem that long
 *                                    labels were cropped at the bottom
 *                                  - 2016 changed, so that this label shows
 *                                    properly without wrapping it in an extra
 *                                    Layout wrapper (renamed class from TopRightLabel
 *                                    to LabelOverlay)
 ******************************************************************************/
package org.pnml.tools.epnk.applications.ui.figures;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

public class LabelOverlay extends Label {
	protected IFigure figure = null;
	
	// XXX ekki@dtu.dk: used to compensate for inaccurate computation of text height on windows systems
	static private boolean win32 = Platform.getOS().equals(Platform.OS_WIN32);
	
	static private Font defaultFont = Display.getDefault().getSystemFont();
	
	public LabelOverlay(Font font, String text, IFigure figure) {
		super(text);
		if (font != null) {
			this.setFont(font);
		} else {
			this.setFont(defaultFont);
		}
		
		this.figure = figure;
		
		this.setForegroundColor(ColorConstants.blue);
		this.setTextPlacement(CENTER);
	}
	
	public LabelOverlay(String text, IFigure figure) {
		this(null, text, figure);
	}

	@Override
	public Rectangle getBounds() {
		if(figure == null) {
			return super.getBounds();
		}

		int textWidth = this.getPreferredSize().width;
		int textHeight = 0;
		if (win32) {
			// XXX eki: compensate inaccurate height here; eventually there needs
			//          to be a better way to compensate for that
			textHeight = (int) (this.getPreferredSize().height*1.1333);
		} else {
			textHeight = this.getPreferredSize().height;	
		}
		Rectangle bounds = new Rectangle(
				figure.getBounds().x + figure.getBounds().width, 
				figure.getBounds().y - textHeight, 
				textWidth, textHeight);

		return bounds;
	}

}
