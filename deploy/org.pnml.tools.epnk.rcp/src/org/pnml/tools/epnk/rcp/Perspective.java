package org.pnml.tools.epnk.rcp;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "org.pnml.tools.epnk.rcp.perspective";

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		// layout.setEditorAreaVisible(false);
		
		// layout.addStandaloneView(NavigationView.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);
	    // eki: String test = ProjectExplorer.VIEW_ID;
		// eki: layout.addStandaloneView(IPageLayout.ID_PROJECT_EXPLORER, true, IPageLayout.LEFT, 0.25f, editorArea);
		layout.addView("org.pnml.tools.epnk.rcp.commonnavigatorview", IPageLayout.LEFT, 0.25f, editorArea);
		layout.getViewLayout("org.pnml.tools.epnk.rcp.commonnavigatorview").setCloseable(false);
		
		layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, 0.66f, "org.pnml.tools.epnk.rcp.commonnavigatorview");
		layout.getViewLayout(IPageLayout.ID_OUTLINE).setCloseable(true);
		
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.66f, editorArea);

		// IFolderLayout folder = layout.createFolder("messages", IPageLayout.TOP, 0.5f, editorArea);
		// folder.addPlaceholder(View.ID + ":*");
		// folder.addView(View.ID);
		
		// eki: layout.addStandaloneView(PropertySheet.HELP_CONTEXT_PROPERTY_SHEET_VIEW, true, IPageLayout.BOTTOM, 1.0f, editorArea);
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setCloseable(false);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		layout.getViewLayout(IPageLayout.ID_PROBLEM_VIEW).setCloseable(false);
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
		layout.getViewLayout(IPageLayout.ID_PROGRESS_VIEW).setCloseable(true);
	}
}
