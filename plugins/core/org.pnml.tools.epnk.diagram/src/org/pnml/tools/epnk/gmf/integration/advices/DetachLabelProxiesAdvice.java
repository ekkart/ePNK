package org.pnml.tools.epnk.gmf.integration.advices;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.pnml.tools.epnk.pnmlcoremodel.Object;



/**
 * This advice guarantees that the label proxies are detached from the
 * object before the object is deleted.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class DetachLabelProxiesAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			DestroyElementRequest request) {
		
		EObject target = request.getElementToDestroy();
		if (target != null) {
			if (target instanceof Object && target.eResource() != null) {
				return new DetachLabelProxies((Object) target);
			}
		}

		return super.getBeforeDestroyElementCommand(request);
	}

}
