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
package org.pnml.tools.epnk.applications.hlpng.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class EvaluationValidator extends AbstractModelConstraint
{
	public IStatus validate(IValidationContext ctx)
	{
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		if(!(eType == EMFEventType.NULL && eObj instanceof PetriNet))
		{
			return ctx.createSuccessStatus();
		}
		final PetriNet pNet = (PetriNet)eObj;

		if(!(pNet.getType() instanceof HLPNG))
		{
			return ctx.createSuccessStatus();
		}
		
		final EvaluationManager evaluationManager = 
				ResourceManager.getCachedEvaluationManager();
			
		// In the case of batch mode.
		if(evaluationManager != null && pNet.getType() instanceof HLPNG)
			// ekki@dtu.dk, May 3, 2016: added condition evaluationManager != null in order
			//   to avoid deactivating of this constraint due to a NullPointerException when
			//   this constraint is evaluated before the evaluationManager is created.
			// TODO: This a quick fix; this problem should be fixed properly by actually
			//   initializing the evaluationManager on demand; but this needs a
			//   more careful look, which I do not have time for right now.
		{
			List<String> errorMessages = check(pNet, evaluationManager);
			if(errorMessages != null && errorMessages.size() > 0)
			{
				StringBuffer buffer = new StringBuffer("\n");
				for(String str : errorMessages)
				{
					buffer.append(str + "\n");
				}
				
				return ctx.createFailureStatus(new Object[] { buffer.toString() + "\n" });
			}	
		}
		return ctx.createSuccessStatus();
	}
	
	private static List<String> check(PetriNet petriNet, EvaluationManager evaluationManager)
	{
		List<String> errorMessages = new ArrayList<String>();
		
		FlatAccess flatAccess = FlatAccess.getFlatAccess(petriNet);
		
		// check places
		for(org.pnml.tools.epnk.pnmlcoremodel.Place p : flatAccess.getPlaces())
		{
			Place place = (Place)p;
			if(place.getHlinitialMarking() != null && 
					place.getHlinitialMarking().getStructure() != null)
			{
				String err = evaluationManager.validate(place.getHlinitialMarking().getStructure());
				if(err != null)
				{
					errorMessages.add(err);	
				}
			}
		}
		// check transitions
		for(org.pnml.tools.epnk.pnmlcoremodel.Transition t : flatAccess.getTransitions())
		{
			Transition transition = (Transition)t;
			if(transition.getCondition() != null && 
					transition.getCondition().getStructure() != null)
			{
				String err = evaluationManager.validate(transition.getCondition().getStructure());
				if(err != null)
				{
					errorMessages.add(err);	
				}
			}
		}
		// check arc inscriptions
		for(org.pnml.tools.epnk.pnmlcoremodel.Transition t : flatAccess.getTransitions())
		{
			Transition transition = (Transition)t;
			
			List<org.pnml.tools.epnk.pnmlcoremodel.Arc> arcs = 
					new ArrayList<org.pnml.tools.epnk.pnmlcoremodel.Arc>();
			arcs.addAll(flatAccess.getIn(transition));
			arcs.addAll(flatAccess.getOut(transition));
			
			for(org.pnml.tools.epnk.pnmlcoremodel.Arc a : arcs)
			{
				Arc arc = (Arc) a;
				
				if(arc.getHlinscription() != null && 
						arc.getHlinscription().getStructuralFeature() != null)
				{
					String err = evaluationManager.validate(arc.getHlinscription().getStructure());
					if(err != null)
					{
						errorMessages.add(err);	
					}
				}
			}
		}
		return errorMessages;
	}
}
