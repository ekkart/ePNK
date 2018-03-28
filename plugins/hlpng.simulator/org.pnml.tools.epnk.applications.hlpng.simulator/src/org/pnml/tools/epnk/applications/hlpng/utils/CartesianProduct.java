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
package org.pnml.tools.epnk.applications.hlpng.utils;

import java.util.ArrayList;
import java.util.List;

public class CartesianProduct<T>
{
	public List<List<T>> pairProduct(List<T> set1, List<T> set2)
	{
		List<List<T>> result = new ArrayList<List<T>>();
		
		for(T item1 : set1)
		{
			for(T item2 : set2)
			{
				List<T> subset = new ArrayList<T>();
				subset.add(item1);
				subset.add(item2);
				result.add(subset);
			}
		}
		return result;
	}
	
	public List<List<T>> product(List<List<T>> set1, List<T> set2)
	{
		List<List<T>> result = new ArrayList<List<T>>();
		
		for(List<T> subset1 : set1)
		{
			for(T item2 : set2)
			{
				List<T> subset = new ArrayList<T>(subset1);
				subset.add(item2);
				result.add(subset);
			}
		}
		return result;
	}
	
	public List<List<T>> product(List<List<T>> set)
	{
		if(set.size() == 0)
		{
			return set;
		}
		
		if(set.size() == 1)
		{
			List<List<T>> result = new ArrayList<List<T>>();
			for(T t : set.get(0))
			{
				List<T> tmp = new ArrayList<T>();
				tmp.add(t);
				result.add(tmp);
			}
			return result;
		}
		
		List<List<T>> result = pairProduct(set.get(0), set.get(1));
		
		for(int i = 2; i < set.size(); i++)
		{
			result = product(result, set.get(i));
		}

		return result;
	}
}
