package experiment.globalhandlers;

import org.eclipse.gmf.runtime.diagram.ui.properties.views.PropertiesBrowserPage;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class PropertiesBrowserPageNoPrune extends PropertiesBrowserPage {

	public PropertiesBrowserPageNoPrune(
			ITabbedPropertySheetPageContributor contributor) {
		super(contributor);
	}
	
	@Override
	public void setActionBars(IActionBars actionBars) {
		ITabbedPropertySheetPageContributor contributor = this.getContributor();

		if (contributor != null && contributor instanceof IWorkbenchPart) {
			actionBars.setGlobalActionHandler(
					ActionFactory.UNDO.getId(),
					new GlobalUndoActionNoPrune((IWorkbenchPart) contributor));
			
			actionBars.setGlobalActionHandler(
					ActionFactory.REDO.getId(),
					new GlobalRedoActionNoPrune((IWorkbenchPart) contributor));
		}
	}

}
