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
package org.pnml.tools.epnk.applications.hlpng.contributors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.functions.APPEAR_POINT;
import org.pnml.tools.epnk.applications.hlpng.functions.MOVE;
import org.pnml.tools.epnk.applications.hlpng.functions.READY;
import org.pnml.tools.epnk.applications.hlpng.functions.TRIGGER;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.extensions.IUserExtensions;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;

public class ExtensionManager implements IUserExtensions
{
	private Map<String, IEvaluator> handlers = new HashMap<String, IEvaluator>();
	
	public ExtensionManager()
	{
		register("APPEAR_POINT", new APPEAR_POINT());
		register("MOVE", new MOVE());
		register("READY", new READY());
		register("TRIGGER", new TRIGGER());
	}
	
	public void register(String name, IEvaluator eval)
	{
		this.handlers.put(name, eval);
	}
	
	public Collection<IEvaluator> getEvaluators()
	{
		return this.getHandlers().values();
	}
	
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		String name = ((UserOperator)term).getDeclaration().getName();
		IEvaluator eval = this.handlers.get(name);
	    return eval.evaluate(term, evaluationManager, assignments);
    }

	public Map<String, IEvaluator> getHandlers()
    {
    	return handlers;
    }

	@Override
    public String validate(Object term)
    {
		if(term instanceof UserOperator)
		{
			String name = ((UserOperator)term).getDeclaration().getName();
			IEvaluator eval = this.handlers.get(name);
			if(eval != null)
			{
				return null;
			}
			return "(user defined) " + name;
		}
		
	    return "(unknown) " + term;
    }

	@Override
    public IValue evaluate(Sort sort)
    {
	    return null;
    }
}
