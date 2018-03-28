package org.pnml.tools.epnk.gmf.extensions.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * Empty implementation of the interface for providing graphical extensions to the
 * ePNK diagram editor.
 *  
 * @generated NOT (created manually)
 * @author eki
 *
 */
public abstract class GraphicalExtension implements IGraphicalExtension {

	@Override
	public List<EClass> getExtendedNetTypes() {
		// TODO Auto-generated method stub
		return new ArrayList<EClass>();
	}

	@Override
	public boolean appliesToSubNettypes(EClass nettype) {
		return false;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		return new ArrayList<EClass>();
	}

	@Override
	public boolean appliesToSubNetobjects(EClass nettype, EClass elementtype) {
		return false;
	}

	@Override
	public int getExtensionPriority(EClass netType, EClass elementType) {
		return 0;
	}

	@Override
	public IArcFigure createArcFigure(Arc arc) {
		return null;
	}
	
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		return null;
	}
	
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		return null;
	}

}
