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
package org.pnml.tools.epnk.applications.hlpng.presentation.popup;

import java.util.List;

public class AbstractMenuCategory extends AbstractMenuItem
{

	protected List<AbstractMenuItem> items = null;

	public AbstractMenuCategory(String name)
	{
		super(name);
	}

	public List<AbstractMenuItem> getItems()
    {
    	return items;
    }

	public void setItems(List<AbstractMenuItem> items)
    {
    	this.items = items;
    }

}
