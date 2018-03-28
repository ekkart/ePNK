package dk.dtu.imm.se.pngen.att.test.blockstructure.view;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Node;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Choice;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Loop;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Sequence;

public class BlockStructureLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	private String getName(Node node) {
		if (node != null) {
			Name name = node.getName();
			if (name != null) {
				return name.getText();
			} else {
				return "" + node.getId();
			}
		} else {
			return "";
		}
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof Atomic) {
			Atomic atomic = (Atomic) element;
			return "Atomic: " + getName(atomic.getStart()) + " - " + 
					            getName(atomic.getTransition()) + " - " +
			                    getName(atomic.getEnd());
		} else if (element instanceof Choice) {
			Choice choice = (Choice) element;
			return "Choice: " + getName(choice.getStart()) + " - - " + 
                                getName(choice.getEnd());
		} else if (element instanceof Sequence) {
			Sequence sequence = (Sequence) element;
			return "Sequence: " + getName(sequence.getStart()) + " - - " + 
                                getName(sequence.getEnd());
		} else if (element instanceof Loop) {
			Loop loop = (Loop) element;
			return "Loop: " + getName(loop.getStart()) + " - - " + 
                                getName(loop.getEnd());
		}
		// TODO Auto-generated method stub
		return "don't know";
	}

}
