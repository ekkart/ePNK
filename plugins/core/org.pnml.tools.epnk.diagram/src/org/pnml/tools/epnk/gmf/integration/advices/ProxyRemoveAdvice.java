package org.pnml.tools.epnk.gmf.integration.advices;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;



/**
 * This advice guarantees that the labels behind a proxy are deleted
 * together with the label proxy (this advice works for both label
 * proxies as well as page label proxies).
 * 
 * @generated NOT
 * @author eki
 *
 */
public class ProxyRemoveAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			DestroyElementRequest request) {
		
		EObject target = request.getElementToDestroy();
		if (target != null) {
			if (target instanceof LabelProxy) {
				LabelProxy proxy = (LabelProxy) target;
				Label label = proxy.getLabel();
				if (label != null) {
					EObject container = label.eContainer();
					if (container instanceof Object) {
						Object object = (Object) label.eContainer();
						if (object != null && object.eResource() != null) {
							return new RemoveLabel(object, label);
						}
					}
				}
			} else if (target instanceof PageLabelProxy) {
				PageLabelProxy proxy = (PageLabelProxy) target;
				Label label = proxy.getLabel();
				if (label != null) {
					EObject container = label.eContainer();
					if (container instanceof Object) {
						Object object = (Object) label.eContainer();
						if (object != null && object.eResource() != null) {
							return new RemoveLabel(object, label);
						}
					}
				}				
			}
		}

		return super.getBeforeDestroyElementCommand(request);
	}



    

}
