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

import java.util.List;

import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import Appearence.Shape;

public class TRIGGER extends AbstractFunction
{
	@Override
	public IValue execute(List<IValue> values)
	{
		// model object
		StringValue modelStr = (StringValue)values.get(0);

		Shape shape = shapeMap.get(modelStr.getData());
		
		animator.trigger(visualSimulator.getModelId(shape.getId()));
		
		visualSimulator.registerAnimation(visualSimulator.getModelId(shape.getId()));
		
		IMSValue ms = factory.createMSValue();
		ms.setSort(TermsFactory.eINSTANCE.createMultiSetSort());
		
		return ms;
	}

}
