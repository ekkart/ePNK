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

public interface IManager<K, T>
{
	public void register(Object o, K operator);
	
	public void unregister(Object o);

	public boolean contains(Class<? extends T> o);
	
	public K getHandler(Class<? extends T> o);
}
