package org.pnml.tools.epnk.diagram.decorators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;

/**
 * First experiments with ePNK decoration providers based on an example from
 * http://publib.boulder.ibm.com/infocenter/rsasehlp/v7r5m0/index.jsp?topic=/com.ibm.xtools.modeler.doc.isv/prog-guide/cust-shapes.html
 * 
 * @author eki
 *
 */
public class DecoratorProvider extends AbstractProvider implements
		IDecoratorProvider {
	
    public DecoratorProvider() {
		super();
	}

	public void createDecorators(IDecoratorTarget decoratorTarget) {
        IGraphicalEditPart editPart = (IGraphicalEditPart)decoratorTarget.getAdapter(IGraphicalEditPart.class);
        if (editPart instanceof IPrimaryEditPart) {
            EObject eObject = editPart.resolveSemanticElement();
            if (eObject instanceof org.pnml.tools.epnk.pnmlcoremodel.Object || eObject instanceof LabelProxy  || eObject instanceof PageLabelProxy) {
                decoratorTarget.installDecorator("ePNK-problem-decorator", new ProblemDecorator(decoratorTarget));
            }
            if (eObject instanceof Page) {
                decoratorTarget.installDecorator("ePNK-subpage-decorator", new SubPageDecorator(decoratorTarget));
            }
        }
    }

    public boolean provides(IOperation operation) {
        if (!(operation instanceof CreateDecoratorsOperation)) {
            return false;
        }
        IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
        IGraphicalEditPart editPart = (IGraphicalEditPart)decoratorTarget.getAdapter(IGraphicalEditPart.class);
        if (editPart instanceof IPrimaryEditPart) {
            EObject eObject = editPart.resolveSemanticElement();
            return eObject instanceof org.pnml.tools.epnk.pnmlcoremodel.Object || eObject instanceof LabelProxy  || eObject instanceof PageLabelProxy ;
        }
        return false;
    }


}
