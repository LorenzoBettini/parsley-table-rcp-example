package parsley.example.rcp;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);

		IFolderLayout folder = layout.createFolder("Table", IPageLayout.TOP, 0.25f, editorArea);
		folder.addView("parsley.example.logeventstable");
	}

}
