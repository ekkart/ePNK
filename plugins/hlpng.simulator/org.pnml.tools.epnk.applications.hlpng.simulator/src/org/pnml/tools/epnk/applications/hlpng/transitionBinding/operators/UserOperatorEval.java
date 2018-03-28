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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.VariableWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class UserOperatorEval implements IEvaluator
{
	private List<IEvaluator> arbitraryOperatorEvaluators = null;
	private EvaluationManager evaluationManager = null;
	
	public UserOperatorEval(EvaluationManager evaluationManager)
	{
		this.evaluationManager = evaluationManager;
	}
	
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{		
		UserOperator userOperator = (UserOperator)term;
		if(userOperator.getDeclaration() instanceof NamedOperator)
		{
			NamedOperator namedOperator = (NamedOperator) userOperator.getDeclaration();
			
			Map<TermWrapper, IValue> newAssignments = new HashMap<TermWrapper, IValue>();
			for(int i = 0; i < userOperator.getSubterm().size(); i++)
			{
				Term subterm = userOperator.getSubterm().get(i);
				IValue value = evaluationManager.evaluate(subterm, assignments);
				
				VariableWrapper varWrapper = new VariableWrapper();
				Variable var = TermsFactory.eINSTANCE.createVariable();
				var.setRefvariable(namedOperator.getParameters().get(i));
				varWrapper.setRootTerm(var);
				varWrapper.setVariable(var);
				
				newAssignments.put(varWrapper, value);
			}	
			return evaluationManager.evaluate(namedOperator.getDef(), newAssignments);
		}
		if(userOperator.getDeclaration() instanceof ArbitraryOperator)
		{
			for(IEvaluator aEval : arbitraryOperatorEvaluators)
			{
				if(aEval.validate(term) == null)
				{
					return aEval.evaluate(term, evaluationManager, assignments);
				}
			}
		}
		
		throw new RuntimeException("Unknown user operator: " + term);
	}

	public List<IEvaluator> getArbitraryOperatorEvaluators()
    {
    	return arbitraryOperatorEvaluators;
    }

	public void setArbitraryOperatorEvaluators(List<IEvaluator> evals)
    {
    	this.arbitraryOperatorEvaluators = evals;
    }

	@Override
    public String validate(Object term)
    {
    	if(term instanceof UserOperator)
    	{
    		UserOperator userOperator = (UserOperator)term;
    		
    		if(userOperator.getDeclaration() instanceof NamedOperator)
    		{
    			for(Term subterm : userOperator.getSubterm())
    			{
    				String err = evaluationManager.validate(subterm);
    				if(err != null)
    				{
    					return err;
    				}
    			}	
    			return null;
    		}
    		if(userOperator.getDeclaration() instanceof ArbitraryOperator)
    		{
    			if(arbitraryOperatorEvaluators == null || arbitraryOperatorEvaluators.size() == 0)
    			{
    				ArbitraryOperator op = (ArbitraryOperator) userOperator.getDeclaration();
    				
    				return "The arbitrary operator\n" + op.getName();
    			}
    			for(IEvaluator aEval : arbitraryOperatorEvaluators)
    			{
    				if(aEval.validate(term) == null)
    				{
    					return null;
    				}
    			}
    			
    			if(term instanceof UserOperator)
    			{
    				String name = ((UserOperator)term).getDeclaration().getName();
    				return "(user defined) " + name;
    			}
    		}	
    	}
		
		return "Unknown: " + term;
    }
}
