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

import org.pnml.tools.epnk.applications.hlpng.network.utils.NodeWrapper;
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

public class MFunction extends AbstractFunction
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
            
        UserOperator uOp = (UserOperator) operator;
        
        IMSValue msValue = runtimeValueFactory.createMSValue();
        msValue.setSort(uOp.getOutputSort());
        
        for(IValue value : getMessages(graph, nodeIdMap))
        {
            msValue.put(value, 1);
        }
        
        return msValue;
    }
    
    private static List<IValue> getMessages(Integer[][] graph,
            Map<Integer, NodeWrapper> nodeIdMap)
    {
    	List<IValue> messages = new ArrayList<IValue>();
    	for(int i = 0; i < graph.length; i++)
    	{
    		for(int j = 0; j < graph[i].length; j++)
        	{
        		if(graph[i][j] != null)
        		{
        			StringValue strVal0 = new Agent();
                    strVal0.setData(nodeIdMap.get(i).getNode().getLabel());
                    strVal0.setSort(TermsFactory.eINSTANCE.createUserSort());
                    
                    StringValue strVal1 = new Agent();
                    strVal1.setData(nodeIdMap.get(j).getNode().getLabel());
                    strVal1.setSort(TermsFactory.eINSTANCE.createUserSort());
                    
                    ProductValue pValue = new ProductValue();
                    pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
                    pValue.getComponents().add(strVal0);
                    pValue.getComponents().add(strVal1);
                    
                    messages.add(pValue);   
        		}
        	}
    	}
    		 
        return messages; 
    }

	@Override
    public String validate(Object term)
    {
	    return null;
    }
}
