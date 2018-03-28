package networkmodel.diagram.edit.policies;

import networkmodel.diagram.providers.NetworkElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class UndirectedEdgeItemSemanticEditPolicy extends
        NetworkBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public UndirectedEdgeItemSemanticEditPolicy()
	{
		super(NetworkElementTypes.UndirectedEdge_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req)
	{
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
