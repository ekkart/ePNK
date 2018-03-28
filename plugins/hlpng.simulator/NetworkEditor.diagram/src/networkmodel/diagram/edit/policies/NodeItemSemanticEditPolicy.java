package networkmodel.diagram.edit.policies;

import java.util.Iterator;

import networkmodel.diagram.edit.commands.DirectedEdgeCreateCommand;
import networkmodel.diagram.edit.commands.DirectedEdgeReorientCommand;
import networkmodel.diagram.edit.commands.UndirectedEdgeCreateCommand;
import networkmodel.diagram.edit.commands.UndirectedEdgeReorientCommand;
import networkmodel.diagram.edit.parts.DirectedEdgeEditPart;
import networkmodel.diagram.edit.parts.UndirectedEdgeEditPart;
import networkmodel.diagram.part.NetworkVisualIDRegistry;
import networkmodel.diagram.providers.NetworkElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class NodeItemSemanticEditPolicy extends
        NetworkBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public NodeItemSemanticEditPolicy()
	{
		super(NetworkElementTypes.Node_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req)
	{
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
		        getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for(Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();)
		{
			Edge incomingLink = (Edge) it.next();
			if(NetworkVisualIDRegistry.getVisualID(incomingLink) == DirectedEdgeEditPart.VISUAL_ID)
			{
				DestroyElementRequest r = new DestroyElementRequest(
				        incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if(NetworkVisualIDRegistry.getVisualID(incomingLink) == UndirectedEdgeEditPart.VISUAL_ID)
			{
				DestroyElementRequest r = new DestroyElementRequest(
				        incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for(Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();)
		{
			Edge outgoingLink = (Edge) it.next();
			if(NetworkVisualIDRegistry.getVisualID(outgoingLink) == DirectedEdgeEditPart.VISUAL_ID)
			{
				DestroyElementRequest r = new DestroyElementRequest(
				        outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if(NetworkVisualIDRegistry.getVisualID(outgoingLink) == UndirectedEdgeEditPart.VISUAL_ID)
			{
				DestroyElementRequest r = new DestroyElementRequest(
				        outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if(annotation == null)
		{
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		}
		else
		{
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req)
	{
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
		        : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
		        .getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
	        CreateRelationshipRequest req)
	{
		if(NetworkElementTypes.DirectedEdge_4001 == req.getElementType())
		{
			return getGEFWrapper(new DirectedEdgeCreateCommand(req,
			        req.getSource(), req.getTarget()));
		}
		if(NetworkElementTypes.UndirectedEdge_4002 == req.getElementType())
		{
			return getGEFWrapper(new UndirectedEdgeCreateCommand(req,
			        req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
	        CreateRelationshipRequest req)
	{
		if(NetworkElementTypes.DirectedEdge_4001 == req.getElementType())
		{
			return getGEFWrapper(new DirectedEdgeCreateCommand(req,
			        req.getSource(), req.getTarget()));
		}
		if(NetworkElementTypes.UndirectedEdge_4002 == req.getElementType())
		{
			return getGEFWrapper(new UndirectedEdgeCreateCommand(req,
			        req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
	        ReorientRelationshipRequest req)
	{
		switch(getVisualID(req))
		{
			case DirectedEdgeEditPart.VISUAL_ID:
				return getGEFWrapper(new DirectedEdgeReorientCommand(req));
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getGEFWrapper(new UndirectedEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
