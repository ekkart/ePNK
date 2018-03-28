package org.pnml.tools.epnk.diagram.edit.helpers;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.pnml.tools.epnk.gmf.integration.advices.DeletePageAdvice;

/**
 * @generated
 */
public class PageEditHelper extends PNMLCoreModelBaseEditHelper {

	/**
	 * Add the Edit helper advice that makes sure that we do not delete
	 * pages with an open graphical editor.
	 * 
	 * @generated NOT
	 * @author eki
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
		// added this method to add the DeletePageAdvice
		IEditHelperAdvice[] advice = super.getEditHelperAdvice(req);

		if (req instanceof DestroyElementRequest) {
			IEditHelperAdvice[] tmp = advice;
			advice = new IEditHelperAdvice[tmp.length + 1];
			for (int i = 0; i < tmp.length; i++) {
				advice[i] = tmp[i];
			}
			advice[tmp.length] = new DeletePageAdvice();
		}

		return advice;
	}

}
