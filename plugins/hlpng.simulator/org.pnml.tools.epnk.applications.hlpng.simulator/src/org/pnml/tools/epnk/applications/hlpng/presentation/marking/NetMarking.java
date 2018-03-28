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
package org.pnml.tools.epnk.applications.hlpng.presentation.marking;

import java.util.ArrayList;
import java.util.List;

import org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl;

public class NetMarking extends NetAnnotationImpl
{
	private List<AbstractMarking> markings = new ArrayList<AbstractMarking>();

	public List<AbstractMarking> getMarkings()
    {
    	return markings;
    }

	public void setMarkings(List<AbstractMarking> markings)
    {
    	this.markings = markings;
    }
}
