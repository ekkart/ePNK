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
package org.pnml.tools.epnk.applications.hlpng.simulator;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

public class MSValueList implements IMSValue
{
	private IMSValue msValue = null;
	private List<IValue> valueLine = null;
	
	MSValueList()
	{
		RuntimeValueFactory factory = new RuntimeValueFactory();
		this.msValue = factory.createMSValue();
		this.valueLine = new ArrayList<IValue>();
	}

	@Override
	public Collection<Entry<IValue, Integer>> entrySet()
	{
		List<Entry<IValue, Integer>> entryList =
				new ArrayList<Entry<IValue,Integer>>();
		
		for(IValue key : valueLine)
		{
			if(contains(key))
			{
				Integer value = get(key);
				Entry<IValue, Integer> entry =
					    new AbstractMap.SimpleEntry<IValue, Integer>(key, value);
				entryList.add(entry);	
			}
		}
		return entryList;
	}

	@Override
	public void put(IValue value, Integer multiplicity)
	{
		if(multiplicity > 0 && msValue.contains(value))
		{
			System.err.println("WRN: MSValueList: The list already contains the value.");
		}
		else
		{
			valueLine.add(value);
		}
		msValue.put(value, multiplicity);
	}

	@Override
	public void remove(IValue value)
	{
		msValue.remove(value);
		valueLine.remove(value);
	}

	@Override
	public void putAll(Collection<Entry<IValue, Integer>> entrySet)
	{
		for(Entry<IValue, Integer> entry : entrySet)
		{
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear()
	{
		msValue.clear();
		valueLine.clear();
	}

	@Override
    public Sort getSort()
    {
	    return msValue.getSort();
    }

	@Override
    public void setSort(Sort sort)
    {
		msValue.setSort(sort);
    }

	@Override
    public int size()
    {
	    return msValue.size();
    }

	@Override
    public boolean contains(IValue value)
    {
	    return msValue.contains(value);
    }

	@Override
    public Integer get(IValue value)
    {
	    return msValue.get(value);
    }
	
	@Override
    public String toString()
    {
		return msValue.toString();
    }

	@Override
    public int hashCode()
    {
		return msValue.hashCode();
    }

	@Override
    public boolean equals(Object obj)
    {
	    return msValue.equals(obj);
    }
}
