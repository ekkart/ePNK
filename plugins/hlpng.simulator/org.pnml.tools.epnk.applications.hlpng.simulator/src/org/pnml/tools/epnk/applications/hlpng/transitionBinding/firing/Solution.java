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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing;

public class Solution
{
	private boolean success;
	private boolean manualInput;
	
	public Solution(boolean success, boolean manualInput)
	{
		this.success = success;
		this.manualInput = manualInput;
	}
	
	public boolean isSuccess()
    {
    	return success;
    }
	public boolean isManualInput()
    {
    	return manualInput;
    }
}
