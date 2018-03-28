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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.network.InputFunction;
import org.pnml.tools.epnk.applications.hlpng.network.MFunction;
import org.pnml.tools.epnk.applications.hlpng.network.RFunction;
import org.pnml.tools.epnk.applications.hlpng.network.SFunction;
import org.pnml.tools.epnk.applications.hlpng.network.mindist.NFunction;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.extensions.IUserExtensions;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarySort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;


public class NetworkExtensionManager implements IUserExtensions
{
	private Map<String, IEvaluator> handlers = new HashMap<String, IEvaluator>();
	private InputFunction inputFunction = null;
	private SFunction sender = null;
	private RFunction receiver = null;
	private MFunction messages = null;
	
	public NetworkExtensionManager()
	{
		this.inputFunction = new InputFunction();
		this.sender = new SFunction();
		this.receiver = new RFunction();
		this.messages = new MFunction();
		
		register("S", sender);
        register("R", receiver);
        register("M", messages);
        
		// min dist
        register("N", new NFunction());
	}
	
	public void register(String name, IEvaluator eval)
	{
		this.handlers.put(name, eval);
	}
	
	public Collection<IEvaluator> getEvaluators()
	{
		List<IEvaluator> evals = new ArrayList<IEvaluator>();
		evals.addAll(this.getHandlers().values());
		evals.add(inputFunction);
		return evals;
	}
	
	public IEvaluator getEvaluator(String name)
	{
		return this.handlers.get(name);
	}
	
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		// a name of a user defined function
		String name = ((UserOperator)term).getDeclaration().getName();
		// find an evaluator associated with this name
		IEvaluator eval = this.handlers.get(name);
		// let the evaluator to do the job
		if(eval != null)
		{
			return eval.evaluate(term, evaluationManager, assignments);
		}
		return inputFunction.evaluate(term, evaluationManager, assignments);
    }

	public Map<String, IEvaluator> getHandlers()
    {
    	return handlers;
    }

	@Override
    public String validate(Object obj)
    {
		if(obj instanceof UserOperator)
		{
			String name = ((UserOperator)obj).getDeclaration().getName();
			IEvaluator eval = this.handlers.get(name);
			if(eval != null)
			{
				return null;
			}
			else
			{
				String err = inputFunction.validate(obj);
				if(err == null)
				{
					return null;
				}
			}
			return "User defined\n" + name;
		}
		if(obj instanceof UserSort)
		{
			UserSort userSort = (UserSort) obj;
			if(userSort.getDeclaration() instanceof ArbitrarySort &&
					userSort.getDeclaration().getName().equals("AGENT"))
			{
				return null;
			}
			else
			{
				return "User defined sort\n" + userSort.getDeclaration().getName();
			}
		}
		return null;
    }

	public InputFunction getInputFunction()
    {
    	return inputFunction;
    }

	@Override
    public IValue evaluate(Sort sort)
    {
	    if(sort instanceof UserSort && 
	    		((UserSort)sort).getDeclaration() instanceof ArbitrarySort &&
	    		((UserSort)sort).getDeclaration().getName().equals("AGENT"))
	    {
	    	return inputFunction.evaluate(sort);
	    }
	    return null;
    }

	public SFunction getSender()
    {
    	return sender;
    }

	public RFunction getReceiver()
    {
    	return receiver;
    }

	public MFunction getMessages()
    {
    	return messages;
    }
}
