package dk.dtu.compute.mbse.yawl.functions;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.ArcType;
import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.Condition;
import dk.dtu.compute.mbse.yawl.ConditionType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.TransitionType;

/**
 * A helper class with some useful functions for YAWL nets.
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class YAWLFunctions {
	
	public static CType getType(Place place) {
		if (place instanceof Condition) {
			Condition condition = (Condition) place;
			ConditionType type = condition.getType();
			if (type != null) {
				return type.getText();
			} else {
				return CType.NORMAL;
			}
		} else {
			return CType.NORMAL;
		}
	}
	
	public static AType getType(Arc arc) {
		if (arc.getSource() instanceof TransitionNode) {
			 return AType.NORMAL;
		}
		
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc) {
			dk.dtu.compute.mbse.yawl.Arc a = (dk.dtu.compute.mbse.yawl.Arc) arc;
			ArcType type = a.getType();
			if (type != null) {
				return type.getText();
			}
		}
		
		return AType.NORMAL;
	}
	
	public static boolean isResetArc(Arc arc) {
		return getType(arc).equals(AType.RESET);
	}
	
	public static ControlFlowType getJoinType(Transition transition) {
		FlatAccess flatAccess = FlatAccess.getFlatAccess(NetFunctions.getPetriNet(transition));
		if (transition instanceof Action && flatAccess != null) {
			Action action = (Action) transition;
			int count = 0;
			for (Arc a: flatAccess.getIn(action)) {
				if (a instanceof dk.dtu.compute.mbse.yawl.Arc) {
					dk.dtu.compute.mbse.yawl.Arc arc = (dk.dtu.compute.mbse.yawl.Arc) a;
					if (arc.getType() == null || arc.getType().getText().equals (AType.NORMAL)) {
						count++;
					}
				}
			}
			if (count > 1) {
				TransitionType joinType = action.getJointype();
				if (joinType != null) {
					if (joinType.getText().equals(TType.XOR)) {
						return ControlFlowType.XOR;
					} else if (joinType.getText().equals(TType.OR)) {
						return ControlFlowType.OR;
					}
				}
				return ControlFlowType.AND;
			} else if (count == 1) {
				return ControlFlowType.SINGLE;
			} 
		}
		return ControlFlowType.NULL;
	}
	
	public static ControlFlowType getSplitType(Transition transition) {
		FlatAccess flatAccess = FlatAccess.getFlatAccess(NetFunctions.getPetriNet(transition));
		if (transition instanceof Action && flatAccess != null) {
			Action action = (Action) transition;
			int count = 0;
			for (Arc a: flatAccess.getOut(action)) {
				if (a instanceof dk.dtu.compute.mbse.yawl.Arc) {
					dk.dtu.compute.mbse.yawl.Arc arc = (dk.dtu.compute.mbse.yawl.Arc) a;
					if (arc.getType() == null || arc.getType().getText().equals (AType.NORMAL)) {
						count++;
					}
				}
			}
			if (count > 1) {
				TransitionType splitType = action.getSplitType();
				if (splitType != null) {
					if (splitType.getText().equals(TType.XOR)) {
						return ControlFlowType.XOR;
					} else if (splitType.getText().equals(TType.OR)) {
						return ControlFlowType.OR;
					}
				}
				return ControlFlowType.AND;
			} else if (count == 1) {
				return ControlFlowType.SINGLE;
			}
		}
		return ControlFlowType.NULL;
	}

}
