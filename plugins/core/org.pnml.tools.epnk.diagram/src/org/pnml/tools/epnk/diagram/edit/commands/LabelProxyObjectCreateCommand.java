package org.pnml.tools.epnk.diagram.edit.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
// import org.eclipse.gmf.runtime.diagram.ui.menus.PopupMenu;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.diagram.edit.policies.PNMLCoreModelBaseItemSemanticEditPolicy;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
import org.pnml.tools.epnk.helpers.LabelProviders;
import org.pnml.tools.epnk.helpers.ReflectiveLabelHandler;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

import tmp.gmf.fix.PopupMenu;

/**
 * @generated
 */
public class LabelProxyObjectCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public LabelProxyObjectCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecuteGen() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof LabelProxy) {
			return false;
		}
		if (target != null && false == target instanceof Object) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return PNMLCoreModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateLabelProxyObject_4004(getSource(), getTarget());
	}

	/**
	 * @generated NOT
	 * @author eki
	 */
	public boolean canExecute() {
		// make sure that only labels that are not connected yet can be
		// connected.
		if (source != null && source instanceof LabelProxy) {
			LabelProxy proxy = (LabelProxy) source;
			if (proxy.getLabel() != null) {
				return false;
			}
		}
		return canExecuteGen();
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResultGen(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().setObject(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (canExecute()) {
			org.pnml.tools.epnk.pnmlcoremodel.Object object = getTarget();
			LabelProxy labelProxy = getSource();

			Map<Label, EReference> possibleObjectMap = LabelProviders
					.createInstancesForLabelProxy(object);

			ArrayList<Label> labels = new ArrayList<Label>();
			Iterator<Label> iter = possibleObjectMap.keySet().iterator();
			while (iter.hasNext()) {
				labels.add(iter.next());
			}

			AdapterFactory adapterFactory = PNMLCoreModelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory();
			PopupMenu menu = new PopupMenu(labels,
					new AdapterFactoryLabelProvider(adapterFactory));

			menu.show(PlatformUI.getWorkbench().getDisplay().getActiveShell());

			java.lang.Object result = menu.getResult();

			if (result != null && result instanceof Label) {
				Label label = (Label) result;
				EReference reference = possibleObjectMap.get(result);
				if (reference != null) {

					if (reference.isMany()) {
						EList<Label> list = ((EList<Label>) object
								.eGet(reference));
						list.add(label);
					} else {
						object.eSet(reference, label);
					}
					labelProxy.setLabel(label);
					if (label instanceof StructuredLabel) {
						StructuredLabel sLabel = (StructuredLabel) label;
						labelProxy.setText(sLabel.getText());
					} else {
						labelProxy.setText(ReflectiveLabelHandler
								.getValueAsString(label));
					}
					return CommandResult.newOKCommandResult();
				}
			}
			return CommandResult.newCancelledCommandResult();
		}

		return doExecuteWithResultGen(monitor, info);
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected LabelProxy getSource() {
		return (LabelProxy) source;
	}

	/**
	 * @generated
	 */
	protected Object getTarget() {
		return (Object) target;
	}
}
