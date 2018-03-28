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

import java.util.List;
import java.util.Set;

import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeState;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IDWrapper;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class NetMarkingManager
{
	private PetriNet petrinet = null;
	private FlatAccess flatAccess = null;
	
	public NetMarkingManager(PetriNet petrinet, FlatAccess flatAccess)
	{
		this.petrinet = petrinet;
		this.flatAccess = flatAccess;
	}

    public NetMarking createNetMarking(IRuntimeState state)
    {       
        NetMarking netMarking = new NetMarking();
        netMarking.setNet(petrinet);
        
        // creates a marking for place runtime marking
        for(IDWrapper wrapper : state.getPlaces())
        {
        	// for each respective reference place
            final List<RefPlace> refPlaces = flatAccess.getRefPlaces((Place)wrapper.getId());
            if(refPlaces != null)
            {
            	for(RefPlace rp : refPlaces)
                {
                	PlaceMarking marking  = new PlaceMarking();
                    marking.setMsValue(state.getValue(wrapper));
                    marking.setObject(rp);
                    
                    netMarking.getMarkings().add(marking);
                    netMarking.getObjectAnnotations().add(marking);
                }	
            }
            
            PlaceMarking marking  = new PlaceMarking();
            marking.setMsValue(state.getValue(wrapper));
            marking.setObject((Place)wrapper.getId());
            
            netMarking.getMarkings().add(marking);
            netMarking.getObjectAnnotations().add(marking);
        }
        
        // creates a marking for transitions
        for(IDWrapper wrapper : state.getTransitions())
        {
        	final Transition transition = (Transition)wrapper.getId();
        	final boolean fired = state.getFiringMode() != null && 
        			state.getFiringMode().getTransition().equals(transition);
        	final boolean success = state.getFiringModes(wrapper).isSuccess();
        	final boolean manualInput = state.getFiringModes(wrapper).isManualInput();
        	final Set<FiringMode> modes = state.getFiringModes(wrapper).getModes();
        	
        	if(!success || (modes != null && modes.size() > 0))
        	{
            	// for each respective reference transition
                final List<RefTransition> refTransitions = flatAccess.getRefTransitions(transition);
                if(refTransitions != null)
                {
                	for(RefTransition rp : refTransitions)
                    {
                		TransitionMarking marking = new TransitionMarking();
                		if(modes != null && modes.size() > 0)
                		{
                			marking.getModes().addAll(modes);	
                		} 
                        marking.setFired(fired);
                        marking.setSuccess(success);
                        marking.setManualInput(manualInput);
                        marking.setObject(rp);
                        
                        netMarking.getMarkings().add(marking);
                        netMarking.getObjectAnnotations().add(marking);
                    }	
                }
                
                TransitionMarking marking = new TransitionMarking();
                if(modes != null && modes.size() > 0)
        		{
        			marking.getModes().addAll(modes);	
        		}
                marking.setFired(fired);
                marking.setSuccess(success);
                marking.setManualInput(manualInput);
                marking.setObject(transition);
                
                netMarking.getMarkings().add(marking);
                netMarking.getObjectAnnotations().add(marking);	
        	}
        }

        return netMarking;
    }
}
