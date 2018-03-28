package org.pnml.tools.epnk.gmf.extensions.graphics.registry;

import org.pnml.tools.epnk.gmf.extensions.graphics.IGraphicalExtension;

public class ComparableExtensionReference implements Comparable<ComparableExtensionReference> {

    private int level;
    private IGraphicalExtension extension;
      
	public ComparableExtensionReference(IGraphicalExtension extension,int level) {
		super();
		this.extension = extension;
	}

	@Override
	public int compareTo(ComparableExtensionReference o) {
		if (this.level > o.level) {
			return -1;
		} else if (this.level == o.level) {
			return 0;
		}
		return 1;
	}
	
	public IGraphicalExtension getExtension() {
		return extension;
	}

}
