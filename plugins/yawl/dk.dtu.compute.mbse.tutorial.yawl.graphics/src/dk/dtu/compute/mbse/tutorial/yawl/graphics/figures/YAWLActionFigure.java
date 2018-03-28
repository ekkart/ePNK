package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.compute.mbse.yawl.functions.ControlFlowType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * The class implementing the graphical representation for YAWL actions. 
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class YAWLActionFigure extends TransitionFigure {

	private ControlFlowType joinType;
	private ControlFlowType splitType;	
	
	public YAWLActionFigure(Transition transition) {
		super(transition);
		joinType =  YAWLFunctions.getJoinType(transition); 
		splitType = YAWLFunctions.getSplitType(transition);
	}

	@Override
	public void update() {
		joinType =  YAWLFunctions.getJoinType(transition); 
		splitType = YAWLFunctions.getSplitType(transition);
		this.repaint();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		graphics.pushState();
		graphics.setLineWidth(1);
		Rectangle rectangle = this.getClientArea();
		if (!joinType.equals(ControlFlowType.SINGLE)) {
			int w = rectangle.width / 3;
			int d = rectangle.height / 2;
			graphics.drawLine(rectangle.x + w, rectangle.y, 
					rectangle.x + w, rectangle.y + rectangle.height-1);
			if (joinType.equals(ControlFlowType.AND)) {
				graphics.drawLine(rectangle.x, rectangle.y, 
						rectangle.x + w, rectangle.y + d);
				graphics.drawLine(rectangle.x + w, rectangle.y + d,
						rectangle.x, rectangle.y + rectangle.height-1);
			} else if (joinType.equals(ControlFlowType.XOR)) {
				graphics.drawLine(rectangle.x+w, rectangle.y, 
						rectangle.x, rectangle.y + d);
				graphics.drawLine(rectangle.x, rectangle.y + d,
						rectangle.x+w, rectangle.y + rectangle.height-1);
			} else if (joinType.equals(ControlFlowType.OR)) {
				int w2 = w / 2;
				graphics.drawLine(rectangle.x+w2, rectangle.y, 
						rectangle.x, rectangle.y + d);
				graphics.drawLine(rectangle.x, rectangle.y + d,
						rectangle.x+w2, rectangle.y + rectangle.height-1);
				graphics.drawLine(rectangle.x+w2, rectangle.y + rectangle.height-1, 
						rectangle.x + w, rectangle.y + d);
				graphics.drawLine(rectangle.x + w, rectangle.y + d,
						rectangle.x+w2, rectangle.y);
			} else if (joinType.equals(ControlFlowType.NULL)) {
				graphics.drawLine(rectangle.x + w, rectangle.y, 
						rectangle.x, rectangle.y + rectangle.height-1);
				graphics.drawLine(rectangle.x, rectangle.y,
						rectangle.x + w, rectangle.y + rectangle.height-1);
			}
		}
		
		if (!splitType.equals(ControlFlowType.SINGLE)) {
			int w = rectangle.width / 3;
			int d = rectangle.height / 2;
			graphics.drawLine(rectangle.x + 2*w,  rectangle.y, 
					rectangle.x + 2*w, rectangle.y + rectangle.height-1);
			if (splitType.equals(ControlFlowType.AND)) {
				graphics.drawLine(rectangle.x+ rectangle.width-1, rectangle.y, 
						rectangle.x + 2*w, rectangle.y + d);
				graphics.drawLine(rectangle.x + 2*w, rectangle.y + d,
						rectangle.x+rectangle.width-1, rectangle.y + rectangle.height-1);
			} else if (splitType.equals(ControlFlowType.XOR)) {
				graphics.drawLine(rectangle.x+2*w, rectangle.y, 
						rectangle.x+rectangle.width-1, rectangle.y + d);
				graphics.drawLine(rectangle.x+rectangle.width-1, rectangle.y + d,
						rectangle.x+2*w, rectangle.y + rectangle.height-1);
			} else if (splitType.equals(ControlFlowType.OR)) {
				int w2 = w / 2;
				graphics.drawLine(rectangle.x+rectangle.width-w2, rectangle.y, 
						rectangle.x+rectangle.width-1, rectangle.y + d);
				graphics.drawLine(rectangle.x+rectangle.width-1, rectangle.y + d,
						rectangle.x+rectangle.width-w2, rectangle.y + rectangle.height-1);
				graphics.drawLine(rectangle.x+rectangle.width-w2, rectangle.y + rectangle.height-1, 
						rectangle.x + 2*w, rectangle.y + d);
				graphics.drawLine(rectangle.x + 2*w, rectangle.y + d,
						rectangle.x+rectangle.width-w2, rectangle.y);
			} else if (splitType.equals(ControlFlowType.NULL)) {
				graphics.drawLine(rectangle.x + rectangle.width-1, rectangle.y, 
						rectangle.x + 2*w, rectangle.y + rectangle.height-1);
				graphics.drawLine(rectangle.x + 2*w, rectangle.y,
						rectangle.x  +rectangle.width-1, rectangle.y + rectangle.height-1);
			}
		}
		graphics.popState();
	}

}
