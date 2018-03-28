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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import networkmodel.Category;
import networkmodel.Node;

import org.pnml.tools.epnk.applications.hlpng.network.utils.NodeWrapper;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.ISortEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;

public class InputFunction extends AbstractFunction implements ISortEvaluator
{
	protected List<Category> categories = null;
	private List<NodeWrapper> nodes = null;
	
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		Operator operator = (Operator) term;
		List<IValue> values = new ArrayList<IValue>();
		for(Term subterm : operator.getSubterm())
		{
			IEvaluator evaluator = evaluationManager.getHandler(subterm.getClass()); 
			IValue value = evaluator.evaluate(subterm, evaluationManager, assignments);
			values.add(value);
		}
			
		UserOperator uOp = (UserOperator) operator;
		
		IMSValue msValue = runtimeValueFactory.createMSValue();
		msValue.setSort(uOp.getOutputSort());
		
		List<Node> nodesInCategory = getNodes(uOp.getName(), categories);
		
		for(Node n : nodesInCategory)
		{
			StringValue sValue = new Agent();
			sValue.setData(n.getLabel());
			sValue.setSort(TermsFactory.eINSTANCE.createUserSort());
			
			msValue.put(sValue, 1);
		}
		return msValue;
    }
	
	protected boolean isCategory(String categoryName, List<Category> categories)
	{
		if(categories == null)
		{
			return false;
		}
		for(Category c : categories)
		{
			if(c.getName().equals(categoryName))
			{
				return true;
			}
		}
		return false;
	}
	
	protected List<Node> getNodes(String categoryName, List<Category> categories)
	{
		for(Category c : categories)
		{
			if(c.getName().equals(categoryName))
			{
				return c.getNode();
			}
		}
		return null;
	}

	@Override
    public IValue evaluate(Sort sort)
    {
		IMSValue msValue = runtimeValueFactory.createMSValue();
		msValue.setSort(sort);
		
		List<Node> nodesInCategory = new ArrayList<Node>();
		for(NodeWrapper n : nodes)
		{
			nodesInCategory.add(n.getNode());
		}
		for(Node n : nodesInCategory)
		{
			StringValue sValue = new Agent();
			sValue.setData(n.getLabel());
			sValue.setSort(TermsFactory.eINSTANCE.createUserSort());
			
			msValue.put(sValue, 1);
		}
	    return msValue;
    }
	
	@Override
    public String validate(Object obj)
    {
		if(obj instanceof UserOperator)
		{
			String name = ((UserOperator)obj).getDeclaration().getName();
			if(isCategory(name, categories))
			{
				return null;
			}
		}
		return "User defined\n" + String.valueOf(obj);
    }

	public List<Category> getCategories()
    {
    	return categories;
    }

	public void setCategories(List<Category> categories)
    {
    	this.categories = categories;
    }

	public List<NodeWrapper> getNodes()
    {
    	return nodes;
    }

	public void setNodes(List<NodeWrapper> nodes)
    {
    	this.nodes = nodes;
    }
}
