package org.pnml.tools.epnk.rcp;

// import org.eclipse.swt.graphics.Point;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.ide.WorkbenchActionBuilder;

@SuppressWarnings("restriction")
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        // eki: as a quick and dirty solution, use the standard action builder of eclipse
    	return new WorkbenchActionBuilder(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        // configurer.setInitialSize(new Point(800, 600));
        // configurer.setShowCoolBar(true);
        configurer.setShowStatusLine(true);
        configurer.setShowProgressIndicator(true);
    }

	@Override
	public void postWindowOpen() {
		// eki: This is a quick and dirty hack to remove the "Project" menu from
		//      the menu bar, which is not needed but part of the standard menus
		//      installed with the IDE (i.e. WorkbenchActionBuilder).
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        IMenuManager menuManager = configurer.getActionBarConfigurer().getMenuManager();
        IContributionItem contribution = menuManager.remove(IWorkbenchActionConstants.M_PROJECT);
        if (contribution != null) {
        	contribution.dispose();
        }
	}
    
}
