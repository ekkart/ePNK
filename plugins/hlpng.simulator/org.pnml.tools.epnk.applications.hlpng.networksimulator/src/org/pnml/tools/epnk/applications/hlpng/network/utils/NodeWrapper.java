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
package org.pnml.tools.epnk.applications.hlpng.network.utils;

import networkmodel.Node;

public class NodeWrapper
{
	private int id = 0;
	private Node node = null;
	
	public NodeWrapper(int id, Node node)
	{
		this.id = id;
		this.node = node;
	}

	public int getId()
    {
    	return id;
    }

	public Node getNode()
    {
    	return node;
    }

	@Override
    public String toString()
    {
	    return "NodeWrapper [id=" + id + ", node=" + node + "]";
    }
}
