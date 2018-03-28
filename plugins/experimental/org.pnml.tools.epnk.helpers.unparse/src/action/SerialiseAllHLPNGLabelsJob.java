/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package action;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKJob;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

import parserrules.Rules;
import serializer.Serializer;

public class SerialiseAllHLPNGLabelsJob extends AbstractEPNKJob {
	
    private boolean aborted;
    
    private Rules rules;
    
    private String result; 
    
	public SerialiseAllHLPNGLabelsJob(PetriNet petrinet, String defaultInput) {
		super(petrinet, "ePNK: Serialise HLPNG labels");
		aborted = false;
	}


	@Override
	protected boolean prepare() {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI("platform:/plugin/org.pnml.tools.epnk.helpers.unparse/model/HLPNG-Rules.xmi");
		Resource resource = resourceSet.getResource(uri, true);
		EObject rulesObj = resource.getContents().get(0);
		
		if (rulesObj == null || !(rulesObj instanceof Rules)) {
			MessageDialog.openInformation(
					null,
					"ePNK: Serialise HLPNG labels",
					"Serialisation rules could not be loaded!"
			);	
			return false;
		} 
	    rules = (Rules) rulesObj;
		return true;
	}

	

	/*
	@Override
	protected String getInput() {
		return null;
	}
	*/

	@Override
	protected void run() {
		int success = 0;
		int fail = 0;
		PetriNet petrinet = this.getPetriNet();
		EditingDomain domain = 
			AdapterFactoryEditingDomain.getEditingDomainFor(this.getPetriNet());
		CompoundCommand command = null;
		if (domain != null) {
			command = new CompoundCommand();
			command.setLabel("Serialise Labels");
		}

		TreeIterator<EObject> iterator = petrinet.eAllContents();
		while (iterator.hasNext() && !aborted) {
			EObject object = iterator.next();
			
			String kind = null;			
			if (object instanceof HLAnnotation ||
					object instanceof Condition ||
					object instanceof HLMarking) {
				kind = "Term";
			} else if (object instanceof Declaration) {
				kind = "Declarations";
			} else if (object instanceof Type) {
				kind = "Sort";
			}

			if (kind != null) {
				StructuredLabel label = ((StructuredLabel) object);
				EObject structure = (EObject) label.eGet(label.getStructuralFeature());
				
				
				String text = (new Serializer(null,rules)).unparse(structure, kind);
				if (text == null) {
					fail++;
				} else {
					success++;
				}

				if (command == null) {
					label.setText(text);
				} else {
					command.append(
						new SetCommand(
								domain,
								label,
								StructuredpntypemodelPackage.eINSTANCE.getStructuredLabel_Text(),
								text));
				}
			}
			
			if (object instanceof Label) {
				iterator.prune();
			}
		}

		if (!aborted) {
			if (command != null) {
				domain.getCommandStack().execute(command);
			}
			result = "Label serialisation completed: \r\n" +
					 "  " + success + " labels successfully labels set\r\n" +
					 "  " + fail + " labels could not be set";
		} else {
			result = "Label serialisation aborted.";

		}

	}
	
	@Override
	protected void canceling() {
		aborted = true;
	}
	
	@Override
	protected void showResult() {
		MessageDialog.openInformation(
				null,
				"ePNK: Serialise HLPNG labels",
				result
		);
	}
}
