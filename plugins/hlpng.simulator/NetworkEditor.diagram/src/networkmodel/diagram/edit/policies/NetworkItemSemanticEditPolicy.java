package networkmodel.diagram.edit.policies;

import networkmodel.diagram.edit.commands.CategoryCreateCommand;
import networkmodel.diagram.edit.commands.NodeCreateCommand;
import networkmodel.diagram.providers.NetworkElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class NetworkItemSemanticEditPolicy extends
        NetworkBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public NetworkItemSemanticEditPolicy()
	{
		super(NetworkElementTypes.Network_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req)
	{
		if(NetworkElementTypes.Category_2001 == req.getElementType())
		{
			return getGEFWrapper(new CategoryCreateCommand(req));
		}
		if(NetworkElementTypes.Node_2002 == req.getElementType())
		{
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req)
	{
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
		        .getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
	        DuplicateEObjectsCommand
	{

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
		        TransactionalEditingDomain editingDomain,
		        DuplicateElementsRequest req)
		{
			super(editingDomain, req.getLabel(), req
			        .getElementsToBeDuplicated(), req
			        .getAllDuplicatedElementsMap());
		}

	}

}
