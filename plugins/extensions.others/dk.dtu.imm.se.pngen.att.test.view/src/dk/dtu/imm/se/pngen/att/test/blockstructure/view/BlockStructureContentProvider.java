package dk.dtu.imm.se.pngen.att.test.blockstructure.view;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Composite;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Loop;

public class BlockStructureContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		viewer.refresh();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Block) {
			return getChildren(inputElement);
		}
		return new Object [] {};
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Composite) {
			return ((Composite) parentElement).getSubblocks().toArray();
		} else if (parentElement instanceof Loop){
			return new Object [] { ((Loop) parentElement).getBody() };
		} else {
			return new Object [] {};
		}
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof Block) {
			return ((Block) element).eContainer();
		} else {
			return null;
		}
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Composite) {
			return ((Composite) element).getSubblocks().size() > 0;
		} else if (element instanceof Loop){
			return true;
		} else {
			return false;
		}
	}

}
