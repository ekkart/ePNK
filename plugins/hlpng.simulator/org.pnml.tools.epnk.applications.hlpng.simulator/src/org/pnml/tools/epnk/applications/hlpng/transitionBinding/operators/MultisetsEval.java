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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.runtime.operations.AbstractValueMath;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Subtract;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

public class MultisetsEval implements IEvaluator
{
    private ISortEvaluator sortEvaluator = null;
    private RuntimeValueFactory factory = null;
    
    public MultisetsEval(RuntimeValueFactory factory)
    {
        this.factory = factory; 
    }
    
    @Override
    public IValue evaluate(Term term, EvaluationManager evaluationManager,
            Map<TermWrapper, IValue> assignments) throws UnknownVariableException
    {
        Operator operator = (Operator) term;
        List<IValue> values = new ArrayList<IValue>();
        for(Term subterm : operator.getSubterm())
        {
            IValue value = evaluationManager.evaluate(subterm, evaluationManager, assignments);
            values.add(value);
        }
        if(operator instanceof NumberOf)
        {
            IMSValue set = this.factory.createMSValue();
            set.setSort(operator.getSort());
            int multiplicity = ((NumberValue)values.get(0)).getN();
            
            if(values.get(1) instanceof IMSValue)
            {
                IMSValue msValue = this.factory.createMSValue();
                msValue.setSort(values.get(1).getSort());
                
                for(Entry<IValue, Integer> value : ((IMSValue)values.get(1)).entrySet())
                {
                    msValue.put(value.getKey(), value.getValue());
                }
                set.put(msValue, multiplicity);
            }
            else
            {
                set = AbstractValueMath.add(set, values.get(1), multiplicity, this.factory);    
            }

            return set;
        }
        if(operator instanceof Add)
        {
            IMSValue set = this.factory.createMSValue();
            set.setSort(operator.getSort());
            
            for(IValue value : values)
            {
                IMSValue ms = (IMSValue) value;
                set = AbstractValueMath.append(set, ms, this.factory);
            }
            return set;
        }
        if(operator instanceof Subtract)
        {
            IMSValue set = (IMSValue) values.get(0);
            
            for(int i = 1; i < values.size(); i++)
            {
                IMSValue ms = (IMSValue) values.get(i);
                set = AbstractValueMath.subtract(set, ms, this.factory);
            }
            return set;
        }
        if(operator instanceof All)
        {
            All allOp = (All) operator;
            return sortEvaluator.evaluate(allOp.getRefsort());
        }
        if(operator instanceof Empty)
        {
        	IMSValue msValue = this.factory.createMSValue();
        	msValue.setSort(operator.getOutputSort());
        	
        	return msValue;
        }
        return null;
    }

    public void setSortEvaluator(
            ISortEvaluator dataTypeEvaluationManager)
    {
        this.sortEvaluator = dataTypeEvaluationManager;
    }

    @Override
    public String validate(Object term)
    {
        if(term instanceof NumberOf)
        {
            return null;
        }
        if(term instanceof Add)
        {
            return null;
        }
        if(term instanceof Subtract)
        {
            return null;
        }
        if(term instanceof Empty)
        {
        	return null;
        }
        if(term instanceof All)
        {
            All all = (All)term;
            if(sortEvaluator == null)
            {
                if(all.getRefsort() instanceof UserSort)
                {
                    String name = ((UserSort)all.getRefsort()).
                            getDeclaration().getName();
                    return "User defined sort\n" + name;
                }
                return "all:" + all.getRefsort().getClass().getName();
            }
            
            return sortEvaluator.validate(all);
        }
        return term.getClass().toString();
    }
}
