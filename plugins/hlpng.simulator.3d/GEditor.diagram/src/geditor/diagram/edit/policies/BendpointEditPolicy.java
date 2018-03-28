package geditor.diagram.edit.policies;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionBendpointEditPolicy;
import org.eclipse.gmf.runtime.notation.Edge;

public class BendpointEditPolicy extends ConnectionBendpointEditPolicy {

	@Override
	protected Command getBendpointsChangedCommand(Connection connection,
			Edge edge) {
		if(connection.getPoints().size() < 4) {
			return super.getBendpointsChangedCommand(connection, edge);
		} else {
			return null;
		}
		
	}
	
	

}
