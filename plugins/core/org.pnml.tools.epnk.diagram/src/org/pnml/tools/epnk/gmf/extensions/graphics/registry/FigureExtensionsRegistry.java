package org.pnml.tools.epnk.gmf.extensions.graphics.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IGraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pntypes.extension.PetriNetTypeExtensions;

/**
 * This class is singleton, which makes all plugged in graphical extensions
 * accessible to the ePNK diagram editor.
 * 
 * @generated NOT
 * @author eki
 */
public class FigureExtensionsRegistry {
	
	private static FigureExtensionsRegistry instance;
	
	// private IGraphicalExtension[] graphicalExtensions;
	
	private Map<EClass, Map<EClass, List<ComparableExtensionReference>>> nettypeMapping = 
		new HashMap<EClass, Map<EClass, List<ComparableExtensionReference>>>();
	private Map<EClass, Map<EClass, List<ComparableExtensionReference>>> netsubtypeMapping = 
		new HashMap<EClass, Map<EClass, List<ComparableExtensionReference>>>();;


	private FigureExtensionsRegistry() {
		Map<EClass, List<EClass>> nettypesWithSubtypes = getNetTypesWithSubtypes();
		Map<EClass, List<EClass>> netobjectsWithSubobjects = getNetObjectsWithSubobjects(nettypesWithSubtypes.keySet());
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extPoint = reg.
		getExtensionPoint("org.pnml.tools.epnk.diagram.graphics");

		IExtension[] extensions = extPoint.getExtensions();

		// names = new String[extensions.length];	
		// graphicalExtensions = new IGraphicalExtension[extensions.length];

		for (int i = 0; i < extensions.length; i++) {
			IExtension extension = extensions[i];
			IConfigurationElement confs[] = extension.getConfigurationElements();
			IConfigurationElement elem = confs[0];
			IGraphicalExtension graphicalExtension = null;
			try {
				graphicalExtension = (IGraphicalExtension) elem.createExecutableExtension("class");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (graphicalExtension != null) {
				List<EClass> nettypes = graphicalExtension.getExtendedNetTypes();
				if (nettypes != null && !nettypes.isEmpty()) {
					for (EClass nettype: nettypes) {
						if (nettypesWithSubtypes.containsKey(nettype)) {
							Map<EClass, List<ComparableExtensionReference>> eMapping = nettypeMapping.get(nettype);
							if (eMapping == null) {
								eMapping = new HashMap<EClass, List<ComparableExtensionReference>>();
								nettypeMapping.put(nettype,eMapping);
							}
							
							List<EClass> netObjects = graphicalExtension.getExtendedNetObjects(nettype);
							if (netObjects != null && !netObjects.isEmpty()) {

								for (EClass object: netObjects) {
									if (netobjectsWithSubobjects.containsKey(object)) {
										List<ComparableExtensionReference> list = eMapping.get(object);
										if (list == null) {
											list = new ArrayList<ComparableExtensionReference>();
											eMapping.put(object, list);
										}
										list.add(new ComparableExtensionReference(
												graphicalExtension,
												graphicalExtension.getExtensionPriority(nettype, object)));
										Collections.sort(list);

									}
								}
							}
							
							if (graphicalExtension.appliesToSubNettypes(nettype)) {
								for (EClass subnettype: nettypesWithSubtypes.get(nettype)) {
									eMapping = netsubtypeMapping.get(subnettype);
									if (eMapping == null) {
										eMapping = new HashMap<EClass, List<ComparableExtensionReference>>();
										netsubtypeMapping.put(subnettype, eMapping);
									}
									
									netObjects = graphicalExtension.getExtendedNetObjects(subnettype);
									if (netObjects != null && !netObjects.isEmpty()) {
										for (EClass object: netObjects) {
											if (netobjectsWithSubobjects.containsKey(object)) {
												if (netobjectsWithSubobjects.containsKey(object)) {
													List<ComparableExtensionReference> list = eMapping.get(object);
													if (list == null) {
														list = new ArrayList<ComparableExtensionReference>();
														eMapping.put(object, list);
													}
													list.add(new ComparableExtensionReference(
															graphicalExtension,
															graphicalExtension.getExtensionPriority(nettype, object)));
													Collections.sort(list);


												}
												if (graphicalExtension.appliesToSubNetobjects(subnettype, object)) {
													for (EClass object2: netobjectsWithSubobjects.get(object)) {
														List<ComparableExtensionReference> list = eMapping.get(object2);
														if (list == null) {
															list = new ArrayList<ComparableExtensionReference>();
															eMapping.put(object2, list);
														}
														list.add(new ComparableExtensionReference(
																graphicalExtension,
																graphicalExtension.getExtensionPriority(nettype, object)));
														Collections.sort(list);

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Get the single instance of this class.
	 * 
	 * @return the instance
	 */
	public static synchronized FigureExtensionsRegistry getInstance() {
		if (instance == null) {
			instance = new FigureExtensionsRegistry();
		}
		return instance;
	}
	
	/**
	 * Returns the ArcFigure for a given arc. If there is no extension for this
	 * arc, the default implementation is used.
	 * 
	 * @param arc the arc for which the figure should be created
	 * @return the appropriate Arc figure
	 */
	public IArcFigure createArc(Arc arc) {
		/*
		// TODO eki: this is very inefficient for now (the first experiment).
		//           This can be done much more efficiently with using hash tables.
		for (int i=0; i<graphicalExtensions.length; i++) {
			IArcFigure figure = graphicalExtensions[i].createArcFigure(arc);
			if (figure != null) {
				return figure;
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new ArcFigure();
		*/
		PetriNetType type = NetFunctions.getPetriNetType(arc);
		if (type != null) {
			Map<EClass, List<ComparableExtensionReference>> mapping = nettypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(arc.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IArcFigure figure = extension.getExtension().createArcFigure(arc);
						if (figure != null) {
							return figure;
						}
					}	
				}
			}
			mapping = netsubtypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(arc.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IArcFigure figure = extension.getExtension().createArcFigure(arc);
						if (figure != null) {
							return figure;
						}
					}
				}
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new ArcFigure(arc);
	}
	
	/**
	 * Returns the IUpdateableFigure for a given place. If there is no extension for this
	 * place, the default implementation is used.
	 * 
	 * @param place the place for which the figure should be created
	 * @return the appropriate figure
	 */
	public IUpdateableFigure createPlace(Place place) {
		/*
		// TODO eki: this is very inefficient for now (the first experiment).
		//           This can be done much more efficiently with using hash tables.
		for (int i=0; i<graphicalExtensions.length; i++) {
			IUpdateableFigure figure = graphicalExtensions[i].createPlaceFigure(place);
			if (figure != null) {
				return figure;
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new PlaceFigure();
		*/
		PetriNetType type = NetFunctions.getPetriNetType(place);
		if (type != null) {
			Map<EClass, List<ComparableExtensionReference>> mapping = nettypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(place.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IUpdateableFigure figure = extension.getExtension().createPlaceFigure(place);
						if (figure != null) {
							return figure;
						}
					}	
				}
			}
			mapping = netsubtypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(place.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IUpdateableFigure figure = extension.getExtension().createPlaceFigure(place);
						if (figure != null) {
							return figure;
						}
					}
				}
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new PlaceFigure(place);
	}
	
	/**
	 * Returns the IUpdateableFigure for a given transition. If there is no extension for this
	 * transition, the default implementation is used.
	 * 
	 * @param transition the transition for which the figure should be created
	 * @return the appropriate figure
	 */
	public IUpdateableFigure createTransition(Transition transition) {
		/*
		// TODO eki: this is very inefficient for now (the first experiment).
		//           This can be done much more efficiently with using hash tables.
		for (int i=0; i<graphicalExtensions.length; i++) {
			IUpdateableFigure figure = graphicalExtensions[i].createTransitionFigure(transition);
			if (figure != null) {
				return figure;
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new TransitionFigure();
		*/
		PetriNetType type = NetFunctions.getPetriNetType(transition);
		if (type != null) {
			Map<EClass, List<ComparableExtensionReference>> mapping = nettypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(transition.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IUpdateableFigure figure = extension.getExtension().createTransitionFigure(transition);
						if (figure != null) {
							return figure;
						}
					}	
				}
			}
			mapping = netsubtypeMapping.get(type.eClass());
			if (mapping != null) {
				List<ComparableExtensionReference> extensionslist = mapping.get(transition.eClass());
				if (extensionslist != null) {
					for (ComparableExtensionReference extension: extensionslist) {
						IUpdateableFigure figure = extension.getExtension().createTransitionFigure(transition);
						if (figure != null) {
							return figure;
						}
					}
				}
			}
		}
		// if no figure is found by a graphical extension,
		// return the default figure.
		return new TransitionFigure(transition);
	}
	
	static private Map<EClass, List<EClass>> getNetTypesWithSubtypes() {
		List<PetriNetType> typeExtensions = PetriNetTypeExtensions.getInstance().getPetriNetTypes();

		Map<EClass, List<EClass>> result = new HashMap<EClass, List<EClass>>();

		for (PetriNetType type1: typeExtensions) {
			List<EClass> list = new ArrayList<EClass>();
			for (PetriNetType type2: typeExtensions) {
				if (type1 != type2 && type1.eClass().isSuperTypeOf(type2.eClass())) {
					list.add(type2.eClass());
				}
			}
			result.put(type1.eClass(), list);
		}

		return result;
	}
	
	static private Map<EClass, List<EClass>> getNetObjectsWithSubobjects(Set<EClass> nettypes) {
		Set<EClass> elements = new HashSet<EClass>();

		for (EClass nettype: nettypes) {
			EObject object = nettype.getEPackage().getEFactoryInstance().create(nettype);
			if (object instanceof PetriNetType ) {
				PetriNetType type = (PetriNetType) object;
				Place place = type.createPlace();
				if (place != null) {
					elements.add(place.eClass());
				}
				Transition transition = type.createTransition();
				if (transition != null) {
					elements.add(transition.eClass());
				}
				Arc arc = type.createArc();
				if (transition != null) {
					elements.add(arc.eClass());
				}
			}
		}

		Map<EClass, List<EClass>> result = new HashMap<EClass, List<EClass>>();

		for (EClass clazz: elements) {
			List<EClass> list = new ArrayList<EClass>();
			for (EClass clazz2: elements) {
				if (clazz != clazz2 && clazz.isSuperTypeOf(clazz2)) {
					list.add(clazz2);
				}
			}
			result.put(clazz, list);
		}

		return result;
	}

}
