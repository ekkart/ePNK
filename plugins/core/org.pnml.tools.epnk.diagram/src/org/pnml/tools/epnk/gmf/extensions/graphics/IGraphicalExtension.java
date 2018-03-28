package org.pnml.tools.epnk.gmf.extensions.graphics;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * Interface for providing graphical extensions to the ePNK diagram
 * editor. 
 * 
 * @generated NOT (created manually)
 * @author eki
 *
 */
public interface IGraphicalExtension {
	
	/**
	 * Creates an IArcFigure for the given arc. The arc
	 * might not be of a type that is supported by this extension.
	 * In this case, null should be returned.
	 * 
	 * @param arc
	 * @return
	 */
	public IArcFigure createArcFigure(Arc arc);
	
	/**
	 * Creates a IUpdateableFigure for the given place. The place
	 * might not be of a type that is supported by this extension.
	 * In this case, null should be returned.
	 * 
	 * @param place
	 * @return
	 */
	public IUpdateableFigure createPlaceFigure(Place place);
	
	/**
	 * Creates a IUpdateableFigure for the given transition. The transition
	 * might not be of a type that is supported by this extension.
	 * In this case, null should be returned.
	 * 
	 * @param transition
	 * @return
	 */
	public IUpdateableFigure createTransitionFigure(Transition transition);

	
	/**
	 * Returns a list of all Petri net types for which this extension provides
	 * an extension. All the classes must inherit from the PetriNetType class from
	 * the PNML Core Model. 
	 * 
	 * @return list of supported classes
	 */
	public List<EClass> getExtendedNetTypes();
	

	/**
	 * Method returns true for a nettype if the graphical extensions should be applied
	 * also for subtypes of this nettype. Note that graphical extensions for subtypes
	 * will always be overruled by explicit definitions for a nettype -- even if they
	 * have lower priority.
	 *  
	 * @param nettype
	 * @return
	 */
	public boolean appliesToSubNettypes(EClass nettype);
	
	/**
	 * Returns a list of all EClasses for which this extension provides
	 * an extension. All the classes must inherit from the Arc class from
	 * the PNML Core Model.
	 * 
	 * @return list of supported classes
	 */
	public List<EClass> getExtendedNetObjects(EClass netType);
	
	/**
	 * Method returns true for a net element types if the graphical extensions should be applied
	 * also for sub types of this element type. Note that graphical extensions for subtypes
	 * will be overruled by explicit definitions for an element type -- even if they
	 * have lower priority.
	 *  
	 * @param nettype
	 * @param elementtype
	 * @return
	 */
	public boolean appliesToSubNetobjects(EClass nettype, EClass elementtype);

	/**
	 * Returns the priority of this element in a specific net type; if the
	 * netType is null, this is the priority of the element independently
	 * from the net type. Note that the priority of the same element type
	 * can be different in different net types.
	 * 
	 * @param netType
	 * @param elementType
	 * @return
	 */
	public int getExtensionPriority(EClass netType, EClass elementType);

}
