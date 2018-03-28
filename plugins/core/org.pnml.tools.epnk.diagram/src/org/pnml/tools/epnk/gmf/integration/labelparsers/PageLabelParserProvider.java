package org.pnml.tools.epnk.gmf.integration.labelparsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;

// @generated NOT
// @author eki
public class PageLabelParserProvider extends AbstractProvider implements
		IParserProvider {

	private IParser parser;
	
	
	// just for debugging purposes
	public PageLabelParserProvider() {
		super();
	}

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (hint == null) {
				return false;
			}
			
			/*
			String visualID = (String) hint.getAdapter(String.class); 

			return LabelProxyEditPart.VISUAL_ID == PNMLCoreModelVisualIDRegistry.getVisualID(visualID) &&
			                  hint.getAdapter(EObject.class) instanceof LabelProxy;
			*/

			// FIXME eki: this is a bit brute force (and problematic once there are other editors. But for
			//       now this is working. The reason for this change is that for some reason (that I
			//       did not track down yet, the visualID is null!
			return hint.getAdapter(EObject.class) instanceof PageLabelProxy; 
		}
		return false;
	}

	@Override
	public IParser getParser(IAdaptable hint) {
		if (parser == null) {
			parser = new PageLabelParser(); 
		}
		return parser;
	}

}
