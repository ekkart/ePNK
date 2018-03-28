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
package org.pnml.tools.epnk.applications.hlpng.presentation;

import org.pnml.tools.epnk.applications.hlpng.presentation.popup.AbstractMenuItem;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;

public class FiringModePopupMenuItem extends AbstractMenuItem
{
	private FiringMode mode = null;
	
	public FiringMode getMode()
    {
    	return mode;
    }

	public FiringModePopupMenuItem(String name, FiringMode mode)
	{
		super(name);
		this.mode = mode;
	}
	
}
