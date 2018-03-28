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
package org.pnml.tools.epnk.applications.hlpng.runtime;

import java.util.Collection;
import java.util.Map.Entry;

public interface IMSValue extends IValue
{
	public Collection<Entry<IValue, Integer>> entrySet();
	public int size();
	public boolean contains(IValue value);
	public Integer get(IValue value);
	public void put(IValue value, Integer multiplicity);
	public void remove(IValue value);
	public void putAll(Collection<Entry<IValue, Integer>> entrySet);
	public void clear();
}
