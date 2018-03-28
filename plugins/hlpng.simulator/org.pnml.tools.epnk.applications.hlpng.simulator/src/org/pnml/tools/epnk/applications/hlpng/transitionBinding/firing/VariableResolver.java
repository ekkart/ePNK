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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.pnml.tools.epnk.applications.hlpng.dialogs.InputDialogJob;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.utils.Pair;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.HLPNGParser;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

import parserrules.Rules;
import serializer.Serializer;

public class VariableResolver
{   
    private final Map<TermWrapper, TermAssignment> termMap;
    private final ReversibleOperationManager reversibleOperationManager;
    private final EvaluationManager evaluationManager;
    
    private final Rules rules;
    private final Display display;
    
    private final VariableDependencyManager dependencyManager;
    
    public VariableResolver(Map<TermWrapper, TermAssignment> tm,
            ReversibleOperationManager reversibleOperationManager,
            EvaluationManager evaluationManager, Rules rules,
            Display display)
    {
        this.display = display;
        this.rules = rules;
        this.termMap = tm;
        this.reversibleOperationManager = reversibleOperationManager;
        this.evaluationManager = evaluationManager;
        
        this.dependencyManager = new VariableDependencyManager(tm, reversibleOperationManager);
    }
    
    public Solution solve(boolean force)
    {
    	boolean manualInput = false;
    	
        while(dependencyManager.hasNext())
        {
            final Pair<Set<TermWrapper>, TermAssignment> pair = 
                    dependencyManager.next();
            final TermAssignment termAssignment = pair.getValue();
            final Set<TermWrapper> varSet = pair.getKey();
            
            boolean showDialog = true;
            
            while(showDialog)
            {
            	// is reversible
                if(dependencyManager.isReversible(termAssignment.getTermWrapper()) &&
                		reversibleOperationManager.contains(termAssignment.
                				getTermWrapper().getRootTerm().getClass()))
                {
                    // can resolve all unknown variables 
                    if(reversibleOperationManager.resolveAll(termAssignment.getValues(),
                            termAssignment.getTermWrapper().getRootTerm(), termMap))
                    {
                        showDialog = false;
                    }
                }
                // a dialog pops up to ask for a sufficient solution
                if(showDialog)
                {
                    final Map<String, String> knownValues = new HashMap<String, String>();
                    for(TermWrapper var : dependencyManager.getVars(termAssignment.getTermWrapper()))
                    {
                        if(termMap.containsKey(var))
                        {
                            varSet.remove(var);
                            
                            knownValues.put(var.getName(), 
                                    termMap.get(var).getValues().toString());
                        }
                    }
                    
                    // let's leave it for now
                    if(!force && varSet.size() > 0)
                    {
                    	return new Solution(false, false);
                    }
                    if(varSet.size() > 0)
                    {
                    	final String termTxt = (new Serializer(null, rules))
                                .unparse(termAssignment.getTermWrapper().getRootTerm(), "Term");
                    	
                    	final InputDialogJob inputThread = 
                                new InputDialogJob(display, knownValues, 
                                        "The Simulator cannot solve the following equation:\n"
                                                + termTxt + "=" + termAssignment.getValues() + "\n"
                                                + "Please, provide a sufficient part of the solution!",
                                        "Currently the following variable bindings are known:",
                                        varSet);
                        display.syncExec(inputThread);
                        
                        if(!inputThread.isCanceled())
                        {
                        	Map<TermWrapper, TermAssignment> localTermMap = null;
                        	try
                            {
                        		localTermMap = parseSolution(inputThread.getMapping(), 
	                            		evaluationManager, varSet, display.getActiveShell());
                        		manualInput = true;
                            }
                            catch(Exception e){}
                            
                        	if(localTermMap != null)
                        	{
                        		for(TermWrapper key: localTermMap.keySet())
	                            {
	                            	if(!termMap.containsKey(key))
	                            	{
	                            		termMap.put(key, localTermMap.get(key));
	                            	}
	                            	else
	                            	{
	                            		termMap.get(key).getValues().addAll(localTermMap.get(key).getValues());
	                            	}
	                            }
                        	}
                        }
                        else
                        {
                        	return new Solution(false, false);
                        }
                    }
                    else
                    {
                    	showDialog = false;
                    }
                }
            }
        }
        // all variables were resolved successfully
        return new Solution(true, manualInput);
    }
    
    private static Map<TermWrapper, TermAssignment> parseSolution(final Map<TermWrapper, String> map, 
            final EvaluationManager evaluationManager,
            final Set<TermWrapper> varSet, final Shell shell) throws Exception
    {
    	final Map<TermWrapper, TermAssignment> termMap = 
    			new HashMap<TermWrapper, TermAssignment>();
    	
        for(Entry<TermWrapper, String> entry : map.entrySet())
        {
        	for(String value : entry.getValue().split(";\\s*"))
        	{
                Term term = HLPNGParser.getHLPNGParser().parseTerm(value);

                if(term != null)
                {
                	if(isGroundTerm(term))
                	{
                		if(entry.getKey().getRootTerm().getSort().isSuperSortOf(term.getSort()))
                		{
                			TermWrapper variable = entry.getKey();

                            final Set<IValue> values = evaluationManager.evaluateAll(term, termMap);

                            if(termMap.containsKey(variable))
                            {
                                termMap.get(variable).getValues().addAll(values);
                            }
                            else
                            {
                                TermAssignment ta = new TermAssignment();
                                ta.getValues().addAll(values);
                                ta.setTermWrapper(variable);

                                termMap.put(variable, ta);
                            }	
                		}
                		else
                		{
                			MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR);
                    		mb.setMessage("The required sort is: " + 
                    				entry.getKey().getRootTerm().getSort() + "\n" +
                    						"The given term sort is " + term.getSort());
                    		mb.open();
                		}	
                	}
                	else
                	{
                		MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR);
                		mb.setMessage("The term " + value + " is not a " +
                				"ground term!");
                		mb.open();
                	}
                }
                	
        	}
        }
        return termMap;
    }
    
    private static boolean isGroundTerm(Term term)
    {
        final Iterator<EObject> iterator = term.eAllContents();
        while(iterator.hasNext())
        {
            if(iterator.next() instanceof Variable)
            {
                return false;
            }
        }
        return true;
    }
}
