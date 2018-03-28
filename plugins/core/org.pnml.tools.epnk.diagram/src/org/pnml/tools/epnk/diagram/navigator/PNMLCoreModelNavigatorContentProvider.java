package org.pnml.tools.epnk.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import java.util.LinkedList;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyObjectEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefTransitionEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.TransitionEditPart;
import org.pnml.tools.epnk.diagram.part.Messages;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
public class PNMLCoreModelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings("serial")
	public PNMLCoreModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<PNMLCoreModelNavigatorItem> result = new ArrayList<PNMLCoreModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof PNMLCoreModelNavigatorGroup) {
			PNMLCoreModelNavigatorGroup group = (PNMLCoreModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PNMLCoreModelNavigatorItem) {
			PNMLCoreModelNavigatorItem navigatorItem = (PNMLCoreModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {

		case PlaceEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup incominglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Place_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup outgoinglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Place_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LabelProxyEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup outgoinglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_LabelProxy_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArcEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PNMLCoreModelNavigatorGroup target = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Arc_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup source = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Arc_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefPlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefTransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(PlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefPlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefTransitionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RefTransitionEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup incominglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_RefTransition_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup outgoinglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_RefTransition_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PageEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			PNMLCoreModelNavigatorGroup links = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Page_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(PlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefPlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(Page2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefTransitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(PageLabelProxyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case LabelProxyObjectEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PNMLCoreModelNavigatorGroup target = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_LabelProxyObject_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup source = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_LabelProxyObject_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefPlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(Page2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(RefTransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TransitionEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup incominglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Transition_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup outgoinglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Transition_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RefPlaceEditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup incominglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_RefPlace_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PNMLCoreModelNavigatorGroup outgoinglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_RefPlace_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Page2EditPart.VISUAL_ID: {
			LinkedList<PNMLCoreModelAbstractNavigatorItem> result = new LinkedList<PNMLCoreModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			PNMLCoreModelNavigatorGroup incominglinks = new PNMLCoreModelNavigatorGroup(
					Messages.NavigatorGroupName_Page_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PNMLCoreModelVisualIDRegistry
							.getType(LabelProxyObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PageEditPart.MODEL_ID.equals(PNMLCoreModelVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PNMLCoreModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<PNMLCoreModelNavigatorItem> result = new ArrayList<PNMLCoreModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new PNMLCoreModelNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof PNMLCoreModelAbstractNavigatorItem) {
			PNMLCoreModelAbstractNavigatorItem abstractNavigatorItem = (PNMLCoreModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
