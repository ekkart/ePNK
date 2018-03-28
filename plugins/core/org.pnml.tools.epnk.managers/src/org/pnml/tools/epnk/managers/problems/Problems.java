package org.pnml.tools.epnk.managers.problems;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

public class Problems {
	
	final private String newline = System.getProperty("line.separator");
	
	private EObject object;
	
	private List<IMarker> markerlist;
	private int severity;
	
	public Problems(EObject object) {
		super();
		this.object = object;
		this.markerlist = new ArrayList<IMarker>();
		this.severity = IMarker.SEVERITY_INFO;
	}

	public EObject getObject() {
		return this.object;
	}
	
	public int getSeverity() {
		if (object instanceof StructuredLabel) {
			StructuredLabel label = (StructuredLabel) object;
			if (label.eGet(label.getStructuralFeature()) == null) {
				return IMarker.SEVERITY_WARNING;
			}
		}
		return this.severity;
	}
	
	public String getProblemInfo() {
		String result = "No problems reported";
		if (markerlist.size() == 1) {
			result =
				"Problem:" + newline +
				"   " + markerlist.get(0).getAttribute(IMarker.MESSAGE, "no specifics (unfortunately)");
		} else if (markerlist.size() > 1) {
			result = "Problems:";
			for (IMarker marker: markerlist) {
				result += newline +
					" - " + marker.getAttribute(IMarker.MESSAGE, "no specifics (unfortunately)");
			}
		} else if (object instanceof StructuredLabel) {
			StructuredLabel label = (StructuredLabel) object;
			if (label.eGet(label.getStructuralFeature()) == null) {
				result =
					"Problem:" + newline +
					"   Label could not be parsed!";
			}
		}
		return result;
	}
	
	
	protected void addMarker(IMarker marker) {
		if (!markerlist.contains(marker)) {
			markerlist.add(marker);
			int severity = marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			if (severity > this.severity) {
				this.severity = severity;
			}
		}
	}
	
	protected void removeMarker(IMarker marker) {
		markerlist.remove(marker);
		this.severity = IMarker.SEVERITY_INFO;
		for (IMarker marker2: markerlist) {
			int severity = marker2.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			if (severity > this.severity) {
				this.severity = severity;
			}
		}
	}
}
