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
import geditor.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.ProductValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;

import Appearence.Shape;

public class APPEAR_POINT extends AbstractFunction
{
	private Map<String, Integer> visibleObjects = new HashMap<String, Integer>();

	@Override
	public IValue execute(List<IValue> values)
	{
		ProductValue productValue = (ProductValue)values.get(0);
		
		// model object comes first
		StringValue modelStr = (StringValue)productValue.getComponents().get(0);
		
		// geometry object comes second
		StringValue geoStr = (StringValue)productValue.getComponents().get(1);
				
		Shape shape = shapeMap.get(modelStr.getData());
		GObject gObj = geometryMap.get(geoStr.getData());

		int modelId = visualSimulator.getModelId(shape.getId());

		// hides other objects on the point location
		if(gObj instanceof Point)
		{
			if(visibleObjects.containsKey(gObj.getId()))
			{
				animator.appear(visibleObjects.get(gObj.getId()), gObj, false);	
			}
			
			visibleObjects.put(gObj.getId(), modelId);
		}

		animator.appear(modelId, gObj, true);
		
		return null;
	}

}
