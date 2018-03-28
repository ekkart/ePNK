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
package org.pnml.tools.epnk.applications.hlpng.network;

import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.network.utils.NodeWrapper;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;

public abstract class AbstractFunction implements IEvaluator
{
	protected RuntimeValueFactory runtimeValueFactory = null;
	
	protected Integer[][] graph = null;
	protected Map<String, NodeWrapper> nodeMap = null;
	protected Map<Integer, NodeWrapper> nodeIdMap = null;

	public RuntimeValueFactory getRuntimeValueFactory()
    {
    	return runtimeValueFactory;
    }

	public void setRuntimeValueFactory(RuntimeValueFactory runtimeValueFactory)
    {
    	this.runtimeValueFactory = runtimeValueFactory;
    }
	
	public Integer[][] getGraph()
    {
    	return graph;
    }

	public void setGraph(Integer[][] graph)
    {
    	this.graph = graph;
    }

	public Map<String, NodeWrapper> getNodeMap()
    {
    	return nodeMap;
    }

	public void setNodeMap(Map<String, NodeWrapper> nodeMap)
    {
    	this.nodeMap = nodeMap;
    }

	public Map<Integer, NodeWrapper> getNodeIdMap()
    {
    	return nodeIdMap;
    }

	public void setNodeIdMap(Map<Integer, NodeWrapper> nodeIdMap)
    {
    	this.nodeIdMap = nodeIdMap;
    }
}
