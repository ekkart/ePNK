/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.simulator.views;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class SimulationViewLabelProvider extends LabelProvider implements
        ITableLabelProvider
{
	public String getColumnText(Object obj, int index)
	{
		return getText(obj);
	}

	public Image getColumnImage(Object obj, int index)
	{
		return getImage(obj);
	}

	public Image getImage(Object obj)
	{
		return PlatformUI.getWorkbench().getSharedImages()
		        .getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
}
