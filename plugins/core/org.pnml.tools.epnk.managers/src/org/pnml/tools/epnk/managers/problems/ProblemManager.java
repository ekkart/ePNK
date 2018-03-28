package org.pnml.tools.epnk.managers.problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.pnml.tools.epnk.pnmlcoremodel.Attribute;
import org.pnml.tools.epnk.pnmlcoremodel.Label;

public class ProblemManager {
	
	private Resource resource;
	private AdapterFactoryEditingDomain domain;
	
	private Map<EObject,Problems> object2problems; 
	private HashMap<IMarker,Problems> marker2problems;
	
	private Map<EObject,List<NotificationListener>> listeners;

	public ProblemManager(Resource resource) {
		super();
		this.resource = resource;
		this.domain = this.getEditingDomain();
		
		this.object2problems = null;
		this.listeners = new HashMap<EObject,List<NotificationListener>>();
		this.marker2problems = null;
	}
	
	public void refreshMarkers() {
		if (resource != null) {
			this.object2problems = new HashMap<EObject,Problems>();
			this.marker2problems = new HashMap<IMarker,Problems>();

			IMarker[] markers = null;
			URI uri = resource.getURI();
			String path = uri.toPlatformString(false);
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IFile file  = root.getFile(new Path(path));
			try {
				markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
			} catch (CoreException e) {
			}

			if (markers != null) {
				for (int i = 0; i < markers.length; i++) {
					addMarker(markers[i]);
				}
			}
			notifyListeners();
		}
	}
	
	public void refreshMarkers(Collection<IMarkerDelta> markerDeltas) {
		Set<EObject> touched = new HashSet<EObject>();
		if (this.object2problems != null && marker2problems != null) {
			for (IMarkerDelta delta: markerDeltas) {
				IMarker marker = delta.getMarker();
				if (delta.getKind() == IResourceDelta.REMOVED) {
					Problems problems = marker2problems.get(marker);
					if (problems != null) {
						EObject object = problems.getObject();
						problems.removeMarker(marker);
						marker2problems.remove(marker);
						if (object != null) {
							touched.add(object);
						}
					}
				} else if (delta.getKind() == IResourceDelta.ADDED) {
					String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
					if (uriAttribute != null) {
						Problems problems = addMarker(marker);
						if (problems != null) {
							EObject object = problems.getObject();
							if (object != null) {
								touched.add(object);
							}
						}
					}
				} else if (delta.getKind() == IResourceDelta.CHANGED) {
					Problems problems = marker2problems.get(marker);

					if (problems != null) {
						EObject object = problems.getObject();
						if (object != null) {
							touched.add(object);
						}
					} else {
						// eki: it appears as if the markers are add with the most cruicial attributes not set. Therefore,
						//      we cannot add them in the ADDED changes. That is why we need do the add here when dealing
						//      with a changed delta (but only try if uri attribute is set).
						String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
						if (uriAttribute != null) {
							problems = addMarker(marker);
							if (problems != null) {
								EObject object = problems.getObject();
								if (object != null) {
									touched.add(object);
								}
							}
						}
					}
				}
			} 
		}
		for (EObject object: touched) {
			notifyListeners(object);
		}
	}
	
	public Problems getProblems(EObject object) {
		if (resource != null) {
			if (this.object2problems == null) {
				refreshMarkers();
			}

			Problems problems =  this.object2problems.get(object);
			if (problems == null) {
				problems = new Problems(object);
			}
			return problems;
		} else {
			return null;
		}
	}
	
	public void addListener(NotificationListener listener, EObject object) {
		if (this.listeners != null && listener != null && object != null) {
			List<NotificationListener> list = listeners.get(object);
			if (list == null) {
				list = new ArrayList<NotificationListener>();
				this.listeners.put(object, list);
			}
			list.add(listener);
		}
	}
	
	public void removeListener(NotificationListener listener, EObject object) {
		if (this.listeners != null && listener != null && object !=null) {
			List<NotificationListener> list = this.listeners.get(object);
            if (list != null) {
    			list.remove(listener);
    			if (list.isEmpty()) {
    				this.listeners.remove(list);
    			}
            }
		}
	}
	
	public void dispose() {
		this.listeners = null;
		this.object2problems = null;
		this.domain = null;
		this.resource = null;
	}
	
	private AdapterFactoryEditingDomain getEditingDomain() {
		// eki: mostly copied from AdapterFactoryEditingDomain.getEditingDomainFor()
		EditingDomain domain = null;
		if (resource != null) {
			IEditingDomainProvider editingDomainProvider =
				(IEditingDomainProvider) EcoreUtil.getExistingAdapter(
						resource,
						IEditingDomainProvider.class);
			if (editingDomainProvider != null) {
				domain = editingDomainProvider.getEditingDomain();
			} 

			if (domain == null) {
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet instanceof IEditingDomainProvider) {
					domain =
						((IEditingDomainProvider)resourceSet).getEditingDomain();
				}

				if (domain == null && resourceSet != null) {
					editingDomainProvider =
						(IEditingDomainProvider) EcoreUtil.getExistingAdapter(
								resourceSet,
								IEditingDomainProvider.class);
					if (editingDomainProvider != null) {
						domain = editingDomainProvider.getEditingDomain();
					}
				}
			}	
		}
		
		if (domain != null && domain instanceof AdapterFactoryEditingDomain) {
			return (AdapterFactoryEditingDomain) domain;
		} else {
			return null;
		}
	}

	private Problems addMarker(IMarker marker) {
		if (domain != null) {
			String type = null;
			try {
				type = marker.getType();
			} catch (CoreException e) {}

			if (type != null && type.equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject object = null;
					try {
						object = domain.getResourceSet().getEObject(uri, true);
						object = getClosestPetriNetElement(object);
					} catch (RuntimeException e) {
					    // In order to avoid crashing the editor when the URI
						// of a marker is invalid or the object does not exist,
						// a RuntimeException needs to be caught here.
					}
					
					if (object != null) {
						Problems problems = this.object2problems.get(object);
						if (problems == null) {
							problems = new Problems(object);
							object2problems.put(object, problems);
						}
						marker2problems.put(marker, problems);
						problems.addMarker(marker);
						return problems;
					}
				}
			}
		}		
		return null;
	}

	private EObject getClosestPetriNetElement(EObject object) {
		while (object != null &&
				!(object instanceof org.pnml.tools.epnk.pnmlcoremodel.Object) &&
				!(object instanceof Label && !(object instanceof Attribute))) {
			object = object.eContainer();
		}
		return object;
	}
	
	private void notifyListeners() {
		if (this.listeners != null) {
			Set<EObject> objects = this.listeners.keySet();
			for (EObject object: objects) {
				notifyListeners(object);
			}
		}
	}
	
	private void notifyListeners(EObject object) {
		if (this.listeners != null) {
			List<NotificationListener> list = this.listeners.get(object);
			NotificationImpl notification = new ProblemNotification(this);
			if (list != null) {
				for (NotificationListener listener: list) {
					listener.notifyChanged(notification);
				}
			}
		}
	}

}
