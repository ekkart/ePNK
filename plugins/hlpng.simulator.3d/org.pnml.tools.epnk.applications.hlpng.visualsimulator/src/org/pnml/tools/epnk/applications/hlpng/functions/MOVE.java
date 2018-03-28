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
package org.pnml.tools.epnk.applications.hlpng.functions;

import geditor.GObject;

import java.util.List;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.ProductValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;

import Appearence.Shape;

public class MOVE extends AbstractFunction
{
	@Override
	public IValue execute(List<IValue> values)
	{
		ProductValue pValue = (ProductValue)values.get(0);
		
		// model object comes first
		StringValue modelStr = (StringValue)pValue.getComponents().get(0);
		
		// geometry object comes second
		StringValue geoStr = (StringValue)pValue.getComponents().get(1);
		
		// speed comes third
		NumberValue speed = (NumberValue)pValue.getComponents().get(2);
		
		Shape shape = shapeMap.get(modelStr.getData());
		GObject gObj = geometryMap.get(geoStr.getData());
		
		animator.move(visualSimulator.getModelId(shape.getId()), 
				visualSimulator.getStaticItemId(gObj.getId()), speed.getN());
		
		visualSimulator.registerAnimation(visualSimulator.getModelId(shape.getId()));
		
		return null;
	}

}
