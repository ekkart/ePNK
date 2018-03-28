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

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.AbstractManager;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

public class SortEvaluationManager extends AbstractManager<ISortEvaluator, Sort> implements ISortEvaluator
{
	@Override
	public IValue evaluate(Sort sort)
	{
		ISortEvaluator evaluator = getHandler(sort.getClass());
		
		return evaluator.evaluate(sort);
	}

	@Override
    public String validate(Object obj)
    {
	    if(obj instanceof All)
	    {
	    	All all = (All) obj;
	    	
			ISortEvaluator eval = getHandler(all.getRefsort().getClass());
			
			if(eval == null)
			{
				return "all:" + all.getRefsort().getClass().getName();
			}
			return eval.validate(all.getRefsort());
	    }
	    return null;
    }
}
