package org.pnml.tools.epnk.actions.commands;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

public class AddMissingIDsCommand extends CompoundCommand {

	public AddMissingIDsCommand(PetriNetDoc document) {
		super(0);
						
		// In a first step collect all existing ids
		Set<String> usedIDs = new HashSet<String>();
		
		TreeIterator<EObject> iterator = document.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof ID) {
				String id = ((ID) object).getId();
				if (id != null && !id.equals("")) {
					usedIDs.add(id);
				}
			}
		}
			

		
		// initialize counters for different kind of IDs:
		// net, page, place, transition, reference place, reference transition, arc, and
		// all the others
		int nMax = 0;
		int pgMax = 0;
		int pMax = 0;
		int tMax = 0;
		int rpMax = 0;
		int rtMax = 0;
		int aMax = 0;
		int max = 0;
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(document);
		
		
		// next iterate over all contained objects and set the value of the id if
		// it is an ID object and the id is not yet set

		iterator = document.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof ID) {
				String id = ((ID) object).getId();

				boolean isint = true;
				try {
					Integer.parseInt(id);
				} catch (NumberFormatException e) {
					isint = false;
				} 
				
				if (isint || id == null || id.equals("")) {
					String newID = "";
					do{
						if (object instanceof PetriNet) {
							newID = "n"+(++nMax);
						} else if (object instanceof Page) {
							newID = "pg"+(++pgMax);
						} else if (object instanceof Place) {
							newID = "p"+(++pMax);
						} else if (object instanceof Transition) {
							newID = "t"+(++tMax);
						} else if (object instanceof RefPlace) {
							newID = "rp"+(++rpMax);
						} else if (object instanceof RefTransition) {
							newID = "rt"+(++rtMax);
						} else if (object instanceof Arc) {
							newID = "a"+(++aMax);
						} else {
							newID = "id"+(++max);
						}
					} while (usedIDs.contains(newID));
					
					usedIDs.add(newID);
					append(new SetCommand(domain, object,
							PnmlcoremodelPackage.eINSTANCE.getID_Id(), newID));
				}
			}
		}
	}

	@Override
	public String getDescription() {
		return "Adds a unique ID to every Petri net and its objects of a document.";
	}

	@Override
	public String getLabel() {

		return "Add missing IDs";
	}

}