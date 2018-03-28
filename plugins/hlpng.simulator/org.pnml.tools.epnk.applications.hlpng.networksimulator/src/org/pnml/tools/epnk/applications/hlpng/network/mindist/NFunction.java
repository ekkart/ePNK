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
package org.pnml.tools.epnk.applications.hlpng.network.mindist;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.network.AbstractFunction;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.ProductValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;

public class NFunction extends AbstractFunction
{
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
			
		int nodeId = nodeMap.get(((StringValue)values.get(0)).getData()).getId();
		UserOperator uOp = (UserOperator) operator;
		
		IMSValue msValue = runtimeValueFactory.createMSValue();
		msValue.setSort(uOp.getOutputSort());
		
		for(int i = 0; i < graph.length; i++)
		{
			if(graph[nodeId][i] != null)
			{
				ProductValue pValue = new ProductValue();
				pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
				{
					StringValue strValue = new StringValue();
					strValue.setData(nodeIdMap.get(i).getNode().getLabel());
					strValue.setSort(TermsFactory.eINSTANCE.createUserSort());
					
					pValue.getComponents().add(strValue);
				}
				pValue.getComponents().add(values.get(1));	
				
				msValue.put(pValue, 1);
			}
		}
		
	    return msValue;
    }
	
	@Override
    public String validate(Object term)
    {
	    return null;
    }
}
