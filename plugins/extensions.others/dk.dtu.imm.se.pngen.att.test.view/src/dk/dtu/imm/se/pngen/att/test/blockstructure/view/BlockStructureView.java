package dk.dtu.imm.se.pngen.att.test.blockstructure.view;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructureFactory;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Sequence;
import dk.dtu.imm.se.pngen.att.test.blockstructure.compute.ComputeBlocks;


public class BlockStructureView extends ViewPart implements ISelectionListener {
	
	private static BlockStructureView instance;
	
	/**
	 * The viewer that shows the overview.
	 */
	private TreeViewer viewer;
	
	/**
	 * This is a callback method that is used to create the viewer and 
	 * initialize it.
	 */
	public void createPartControl(Composite parent) {
		instance = this;
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		// viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
        // viewer.setContentProvider(new ArrayContentProvider());
		// viewer.setLabelProvider(new LabelProvider());
        // viewer.setContentProvider(new BlockStructureContentProvider());
		viewer.setLabelProvider(new BlockStructureLabelProvider());
		viewer.setInput(BlockstructureFactory.eINSTANCE.createAtomic());
		
		getSite().getPage().addSelectionListener(this);
		selectionChanged(null, getSite().getPage().getSelection());
	}

	@Override
	public void dispose() {
		super.dispose();
		instance = null;
		getSite().getPage().removeSelectionListener(this);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
   public static void updateView(Block block) {
	   if (instance != null) {
		   if (block != null) {
		   Sequence container = BlockstructureFactory.eINSTANCE.createSequence();
		   container.setStart(block.getStart());
		   container.setEnd(block.getEnd());
		   container.getSubblocks().add(block);
		   instance.viewer.setInput(container);
		   // instance.viewer.refresh();
		   } else {
			   instance.viewer.setInput(null);
		   }
	   } 
   }

   @Override
   public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	    PetriNet petrinet = null;
	    if (selection instanceof IStructuredSelection) {
	    	IStructuredSelection structured = (IStructuredSelection) selection;

	    	if (structured.size() == 1) {

	    		Object object = structured.getFirstElement();
	    		if (object instanceof PetriNet) {
	    			petrinet = (PetriNet) object;
	    		} else if (object instanceof EditPart ) {
	    			EditPart editPart = (EditPart) object;
	    			Object model = editPart.getModel();
	    			if (model != null && model instanceof View) {
	    				EObject element = ((View) model).getElement();
	    				if (element != null && element instanceof Page) {
	    					petrinet = NetFunctions.getPetriNet((Page) element);
	    				}
	    			}
	    		}
	    	}
	    }
		
		if (petrinet != null) {
			Block block = ComputeBlocks.computeBlocks(petrinet);
			updateView(block);
			viewer.expandAll();
		} else  {
			updateView(null);
		}
   }

}