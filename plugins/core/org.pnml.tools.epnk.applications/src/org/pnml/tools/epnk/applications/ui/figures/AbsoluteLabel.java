package org.pnml.tools.epnk.applications.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.widgets.Display;

public class AbsoluteLabel extends Label {

	public AbsoluteLabel(String s, Point p) {
		super();
		this.setText(s);
		this.setFont(Display.getDefault().getSystemFont());
		Dimension size = this.getPreferredSize();
		this.setBounds(new Rectangle(p,new Point(p.x + size.width, p.y + size.height)));
		this.setLabelAlignment(LEFT);
		this.setForegroundColor(ColorConstants.red);
	}
	
}
