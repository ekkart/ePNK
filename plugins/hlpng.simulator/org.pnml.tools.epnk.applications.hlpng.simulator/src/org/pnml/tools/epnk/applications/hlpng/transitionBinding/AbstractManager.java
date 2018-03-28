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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractManager<K, T> implements IManager<K, T>
{
	private Map<Object, K> handlers = new HashMap<Object, K>();
	
	@Override
	public void register(Object target, K eval)
	{
		handlers.put(target, eval);
	}
	
	@Override
	public void unregister(Object target)
	{
		handlers.remove(target);
	}
	
	@Override
	public boolean contains(Class<? extends T> o)
	{
		return handlers.containsKey(o);
	}
	
	@Override
	public K getHandler(Class<? extends T> targetClass)
	{
		if(handlers.containsKey(targetClass))
		{
			return handlers.get(targetClass);
		}
		if(handlers.containsKey(targetClass.getPackage()))
		{
			return handlers.get(targetClass.getPackage());
		}
		return null;
	}
}
