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
import org.eclipse.gmf.runtime.common.core.command.ICommand;
// import org.eclipse.gmf.runtime.diagram.ui.menus.PopupMenu;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
import org.pnml.tools.epnk.helpers.LabelProviders;
import org.pnml.tools.epnk.helpers.ReflectiveLabelHandler;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

import tmp.gmf.fix.PopupMenu;

/**
 * @generated
 */
public class PageLabelProxyCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public PageLabelProxyCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 * @author eki
	 */
	@SuppressWarnings("unchecked")
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		PageLabelProxy newElement = PnmlcoremodelFactory.eINSTANCE
				.createPageLabelProxy();

		Page owner = (Page) getElementToEdit();

		Map<Label, EReference> possibleObjectMap = LabelProviders
				.createInstancesForPageLabelProxy(owner);

		ArrayList<Label> labels = new ArrayList<Label>();
		Iterator<Label> iter = possibleObjectMap.keySet().iterator();
		while (iter.hasNext()) {
			labels.add(iter.next());
		}

		AdapterFactory adapterFactory = PNMLCoreModelDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory();
		PopupMenu menu = new PopupMenu(labels, new AdapterFactoryLabelProvider(
				adapterFactory));
		menu.show(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		java.lang.Object result = menu.getResult();

		if (result != null && result instanceof Label) {
			Label label = (Label) result;
			EReference reference = possibleObjectMap.get(result);
			if (reference != null) {
				if (reference.isMany()) {
					EList<Label> list = ((EList<Label>) owner.eGet(reference));
					list.add(label);
				} else {
					owner.eSet(reference, label);
				}
				newElement.setLabel(label);

				if (label instanceof StructuredLabel) {
					StructuredLabel sLabel = (StructuredLabel) label;
					newElement.setText(sLabel.getText());
				} else {
					newElement.setText(ReflectiveLabelHandler
							.getValueAsString(label));
				}
			}
		} else {
			return CommandResult.newCancelledCommandResult();
		}

		owner.getPageLabelProxy().add(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(PageLabelProxy newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
