/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing;

import java.util.Set;

public class TransitionCheck
{
	private boolean success;
	private Set<FiringMode> modes;
	private boolean manualInput;
	
	public TransitionCheck(final Set<FiringMode> modes, final boolean success,
			final boolean manualInput)
	{
		this.success = success;
		this.modes = modes;
		this.manualInput = manualInput;
	}
	public boolean isSuccess()
    {
    	return success;
    }
	public Set<FiringMode> getModes()
    {
    	return modes;
    }
	public boolean isManualInput()
    {
    	return manualInput;
    }
}
