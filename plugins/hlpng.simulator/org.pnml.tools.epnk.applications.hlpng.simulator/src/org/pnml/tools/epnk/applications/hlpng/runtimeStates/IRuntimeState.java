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
package org.pnml.tools.epnk.applications.hlpng.runtimeStates;

import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IDWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TransitionCheck;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

public interface IRuntimeState
{
	public FiringMode getFiringMode();
	public void setFiringMode(FiringMode firingMode);
	
	public Map<IDWrapper, IMSValue> getValues();
	public Map<IDWrapper, IMSValue> getClonedValues();
	public Map<IDWrapper, TransitionCheck> getModes();
	
	public void addValue(Place place, IMSValue value);
	public IMSValue getValue(Place place);
	public IMSValue getValue(IDWrapper place);
	public Set<IDWrapper> getPlaces();
	
	public void addFiringModes(Transition transition, TransitionCheck modes);
	public void removeFiringModes(Transition transition);
	public TransitionCheck getFiringModes(Transition transition);
	public TransitionCheck getFiringModes(IDWrapper transition);
	public Set<IDWrapper> getTransitions();
	
	public boolean equals(Object obj);
}
