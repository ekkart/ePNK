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

public class TableRecord
{
	private String[] text = null;
	private Object data = null;
	
	public String[] getText()
    {
    	return text;
    }
	public void setText(String[] text)
    {
    	this.text = text;
    }
	public Object getData()
    {
    	return data;
    }
	public void setData(Object data)
    {
    	this.data = data;
    }
}
