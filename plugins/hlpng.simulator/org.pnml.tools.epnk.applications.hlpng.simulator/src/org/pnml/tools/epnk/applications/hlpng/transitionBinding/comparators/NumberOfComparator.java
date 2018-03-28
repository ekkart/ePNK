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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators;

import java.util.Map;
import java.util.Map.Entry;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.PosValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermAssignment;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class NumberOfComparator implements IComparable
{
	private IComparable comparisonManager = null;
	
	public NumberOfComparator(IComparable comparisonManager)
	{
		this.comparisonManager = comparisonManager;
	}
	
	@Override
    public boolean compare(Term refValue, IValue testValue,
            Map<TermWrapper, TermAssignment> assignments)
    {
		if(!(refValue instanceof NumberOf || testValue instanceof IMSValue))
	    {
	    	return false;
	    }
	    
		NumberOf nof = (NumberOf)refValue;
		IMSValue v2 = (IMSValue)testValue;
		
		boolean wasMatch = false;
    	for(Entry<IValue, Integer> entry : v2.entrySet())
    	{    		
    		Integer m = entry.getValue();
    		PosValue multiplicity = new PosValue();
    		multiplicity.setN(m);
    		multiplicity.setSort(IntegersFactory.eINSTANCE.createPositive());
    		
    		if(comparisonManager.compare( 
    				nof.getSubterm().get(0), multiplicity, assignments) &&
    				comparisonManager.compare( 
    	    				nof.getSubterm().get(1), entry.getKey(), assignments))
    		{
    			wasMatch = true;
    		}
    	}
    	return wasMatch;
    }

}
