package org.pnml.tools.epnk.gmf.integration.labelparsers;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.helpers.ReflectiveLabelHandler;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

// @generated NOT
// @author eki
public class SetLabelProxyTextAndContents extends AbstractTransactionalCommand {

	private LabelProxy proxy;
	private String text;
	private EObject structure;
	
	public SetLabelProxyTextAndContents(LabelProxy proxy, String text, EObject structure) { 
		super(TransactionUtil.getEditingDomain(proxy),
				"Set structured text content",
				Collections.singletonList(WorkspaceSynchronizer.getFile(proxy.eResource())));
		this.proxy = proxy;
		this.text = text;
		this.structure = structure;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (proxy == null || text == null) {
			return CommandResult.newErrorCommandResult("Invalid input");
		}

		Label label = proxy.getLabel();
		if (label != null) {
			proxy.setText(text); 
			if (label instanceof StructuredLabel) {
				StructuredLabel structuredLabel = (StructuredLabel) label;
				structuredLabel.setText(text);
				structuredLabel.eSet(structuredLabel.getStructuralFeature(), structure);
				
				// eki: In the GMF editor also do the linking:
				PetriNet net = NetFunctions.getPetriNet(label);
				NetFunctions.linkNetSymbols(net);
			} else {
				EAttribute attribute = ReflectiveLabelHandler.getTextAttribute(label);
				if (attribute != null && attribute.getEType() instanceof EDataType) {
					EDataType type = (EDataType) attribute.getEType();
					EFactory factory = type.getEPackage().getEFactoryInstance();
					label.eSet(attribute, factory.createFromString(type, text));
				} 
			}
		}

		return CommandResult.newOKCommandResult();
	}

}
