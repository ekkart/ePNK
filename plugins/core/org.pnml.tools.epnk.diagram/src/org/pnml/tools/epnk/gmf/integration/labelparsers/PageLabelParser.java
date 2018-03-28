package org.pnml.tools.epnk.gmf.integration.labelparsers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;


// @generated NOT
// @author eki
public class PageLabelParser implements ISemanticParser {

	
	
	// just for debugging purposes
	public PageLabelParser() {
		super();
	}

	private PageLabelProxy getPageLabelProxy(IAdaptable adaptable) {
		return (PageLabelProxy) adaptable.getAdapter(EObject.class);
	}
	
	@Override
	public String getEditString(IAdaptable element, int flags) {
		PageLabelProxy proxy = getPageLabelProxy(element);
		String label = proxy.getText();
		if (label == null && proxy.getLabel() != null) {
			label = "";
		}
		return label;
	}

	@Override
	public IParserEditStatus isValidEditString(IAdaptable element,
			String editString) {
		return ParserEditStatus.EDITABLE_STATUS;
	}

	@Override
	public ICommand getParseCommand(IAdaptable element, String newString,
			int flags) {
		
		// TODO this could be a bit more defensive
		PageLabelProxy proxy = getPageLabelProxy(element);
		Label label = proxy.getLabel();				
		if (label != null) {
			if (label instanceof StructuredLabel) {
				StructuredLabel structuredLabel = (StructuredLabel) label;
				EObject structure = structuredLabel.parse(newString);
				
				// TODO we need to do some error reporting here in
				//      case, there was a parse error; for now, we
				//      just ignore the error and set the structure
				//      to null.
				return new SetPageLabelProxyTextAndContents(proxy, newString, structure);
			} else {
				return new SetPageLabelProxyTextAndContents(proxy, newString, null);
			} 
		}
		
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		String printString = getEditString(element, flags);
		PageLabelProxy proxy = getPageLabelProxy(element);
		if (proxy != null) {
			Label label = proxy.getLabel();
			if (label == null) {
				// eki: this should actually never happen
				printString = "<not connected page label>";
			}
			// eki: removed textual markers of non-parsable label texts
			//      since we have problem markers now
			/*
			else if (label instanceof StructuredLabel) {
				StructuredLabel structLabel = (StructuredLabel) label;
				if (structLabel.eGet(structLabel.getStructuralFeature()) == null) {
					printString = "<! " + printString + " !>";
				}
			}
			*/		
		}
		return printString == null ? "<...>" : printString;
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		if (event instanceof Notification) {
			Notification emfNotification = (Notification) event;
			return !emfNotification.isTouch() &&
	           emfNotification.getNotifier() instanceof PageLabelProxy;
		}
		return false;
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	@Override
	public List<EObject> getSemanticElementsBeingParsed(EObject element) {
		List<EObject> result = new ArrayList<EObject>();
		if (element instanceof PageLabelProxy) {
			result.add(element);
		}
		return result;
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		if (notification instanceof Notification) {
			Notification emfNotification = (Notification) notification;
			return !emfNotification.isTouch()
					&& (emfNotification.getFeature() == PnmlcoremodelPackage.eINSTANCE.getPageLabelProxy() ); 
			        // || emfNotification.getFeature() == PnmlcoremodelPackage.eINSTANCE.getStructuredLabel());
		}
		return false;
	}

}
