package action;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

import parserrules.Rules;
import serializer.Serializer;

public class SerialiseArcAnnotation implements IObjectActionDelegate {
	
	private Label selectedLabel;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			String kind = null;
			
			if (selectedLabel instanceof HLAnnotation || selectedLabel instanceof Condition || selectedLabel instanceof HLMarking) {
				kind = "Term";
			} else if (selectedLabel instanceof Declaration) {
				kind = "Declarations";
			} else if (selectedLabel instanceof Type) {
				kind = "Sort";
			}

			if (kind != null) {
				StructuredLabel label = ((StructuredLabel) selectedLabel);
				EObject structure = (EObject) label.eGet(label.getStructuralFeature());
				
				final ResourceSet resourceSet = new ResourceSetImpl();
				final URI uri = URI.createURI("platform:/plugin/org.pnml.tools.epnk.helpers.unparse/model/HLPNG-Rules.xmi");
				final Resource resource = resourceSet.getResource(uri, true);
				final EObject rulesObj = resource.getContents().get(0);
				
				if (rulesObj == null || !(rulesObj instanceof Rules)) {
					MessageDialog.openInformation(
							null,
							"ePNK: Test label serialisation",
							"Rules could not be loaded!"
					);	
					return;
				} 
				
				String result = (new Serializer(null,(Rules) rulesObj)).unparse(structure, kind);
				MessageDialog.openInformation(
						null,
						"ePNK: Test label serialisation",
						label.getText() + " = \r\n" +
						result
				);	
			} else {
				MessageDialog.openInformation(
						null,
						"ePNK: Test label serialisation",
						"Select an arc annotation please!"
				);
			}	
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedLabel = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Label) {
				selectedLabel = (Label) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedLabel != null;
	}



}
