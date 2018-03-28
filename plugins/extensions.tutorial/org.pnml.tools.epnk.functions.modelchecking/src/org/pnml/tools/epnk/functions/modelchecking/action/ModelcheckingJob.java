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
 * Copyright (C) 2010, 2017 Ekkart Kindler, ekki@dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.functions.modelchecking.action;

import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKJob;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;
import org.pnml.tools.epnk.pntypes.ptnet.Place;

import de.upb.swt.mcie.formulas.BinaryOp;
import de.upb.swt.mcie.formulas.Constant;
import de.upb.swt.mcie.formulas.Formula;
import de.upb.swt.mcie.formulas.UnaryOp;
import de.upb.swt.mcie.formulas.Variable;
import de.upb.swt.mcie.mc.Transitionsystem;
import de.upb.swt.mcie.parser.Parser;
import de.upb.swt.mcie.robdds.ChangeSet;
import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;

public class ModelcheckingJob extends AbstractEPNKJob {
	
	private String LF = System.getProperty("line.separator");
	
	private String defaultformula =
			"AG EX true, # there are no deadlocks" + LF +
			"EG EX true  # there exists an infinite path";
	
	private Map<Place,Variable> place2variable; 
	private Map<Place,Variable> place2primedvariable; 
	private Vector<Formula>     transitions;
	private Formula             init;
	private Formula[]           formulas;
	
	private Transitionsystem transitionsystem;
	
	private Set<String>         placeNames;
	private int                 genNumber;
	

	
	private boolean duplicateNames;
	private String result;
  
	public ModelcheckingJob(PetriNet petrinet, String defaultInput) {
		super(petrinet, "ePNK: Model checking job");
		if (defaultInput != null) {
			defaultformula = defaultInput;
		}
		
		place2variable = new HashMap<Place,Variable>();
		place2primedvariable = new HashMap<Place,Variable>();
		transitions    = new Vector<Formula>();
		placeNames    = new HashSet<String>();
		duplicateNames = false;
	}

	@Override
	protected boolean prepare() {
		FlatAccess flat = FlatAccess.getFlatAccess(getPetriNet());
		
		// Create the formula representing the initial marking
		init = new Constant(1);
		for (org.pnml.tools.epnk.pnmlcoremodel.Place p : flat.getPlaces()) {
			if (p instanceof Place) {
				Place place = (Place) p;
				registerPlace(place);

				PTMarking marking = place.getInitialMarking();
				if (marking != null && marking.getText().getValue() > 0) {
					init = new BinaryOp(BinaryOp.AND,
							init,
							place2variable.get(place));
				} else {
					init = new BinaryOp(BinaryOp.AND,
							init,
							new UnaryOp(UnaryOp.NOT,place2variable.get(place)));
				}  
			}
		}		

		// Create the transition formulas
		for (Transition transition : flat.getTransitions() ) {
			Set<Place> preset = new HashSet<Place>();
			for (Arc arc : flat.getIn(transition)) {
				preset.add((Place) flat.resolve((PlaceNode) arc.getSource()));
			}

			Set<Place> postset = new HashSet<Place>();
			for (Arc arc : transition.getOut() ) {
				postset.add((Place) flat.resolve((PlaceNode) arc.getTarget()));
			}

			Formula formula = new Constant(1);
			for (Place p : preset) {
				formula = new BinaryOp(BinaryOp.AND,
						formula,
						place2variable.get(p));
			}

			for (Place p : postset) {
				if (! preset.contains(p) ) {
					formula = new BinaryOp(BinaryOp.AND,
							formula,
							new UnaryOp(UnaryOp.NOT,place2variable.get(p)));	
				}
			}

			for (Place p : postset) {
				if (! preset.contains(p)) {
					// For efficiency reasons, we add this variable only
					// if it changes its value (otherwise the changesets
					// will take care of that it is not changed, since the
					// variable does not occur primed in the formula).
					formula = new BinaryOp(BinaryOp.AND,
							formula,
							place2primedvariable.get(p));
				}
			}

			for (Place p : preset) {
				if (! postset.contains(p) ) {
					formula = new BinaryOp(BinaryOp.AND,
							formula,
							new UnaryOp(UnaryOp.NOT,place2primedvariable.get(p)));	
				}
			}

			transitions.add(formula);
		}
		
		if (duplicateNames) {
			MessageDialog.openInformation(
					null,
					"ePNK: Model checker",
					"The Petri net has places with duplicate names!" + LF +
					"You can proceed with model checking, but your formula" + LF +
					"should not contain any of the duplicate names."
			);
		}

		InputDialog dlg = new InputDialog(
				null,
				"ePNK: Model checker",
				"Enter a comma separated list of temporal formulas please:",
				defaultformula,
				null) {
			
			@Override
			protected Control createDialogArea(Composite parent) {
				Control result = super.createDialogArea(parent);
				Text text = getText();
				GridData data = new GridData(SWT.FILL, SWT.TOP, true, false);
				data.heightHint = convertHeightInCharsToPixels(4);
				text.setLayoutData(data);
				return result;
			}

			@Override
			protected int getInputTextStyle() {
				return SWT.MULTI | SWT.BORDER;
			}

		};
		dlg.open();

		if(dlg.getReturnCode()!=Window.OK) //Didn't click on OK!
			return false;

		defaultformula = dlg.getValue();
		
		do {
			try {
				Parser parser = new Parser(new StringReader(defaultformula));
				formulas = parser.parseFormulaList();
				parser.parseEnd();
			} catch (Exception e) {
				formulas = null;
				dlg = new InputDialog(
						null,
						"ePNK: Model checker",
						"Syntax error in formula:" + LF +
						e.toString() + LF +
						"Fix the error please or press cancel:",
						defaultformula,
						null) {

					@Override
					protected Control createDialogArea(Composite parent) {
						Control result = super.createDialogArea(parent);
						Text text = getText();
						GridData data = new GridData(SWT.FILL, SWT.TOP, true, false);
						data.heightHint = convertHeightInCharsToPixels(4);
						text.setLayoutData(data);
						return result;
					}

					@Override
					protected int getInputTextStyle() {
						return SWT.MULTI | SWT.BORDER;
					}

				};
				dlg.open();

				if(dlg.getReturnCode()!=Window.OK) // Didn't click on OK!
					return false;

				defaultformula = dlg.getValue();
			}
		} while (formulas == null);
		
		Name name = getPetriNet().getName();
		String netref = "";
		if ( name != null && name.getText()!= null) {
			netref = " on net " + name.getText();
		}
			
		this.setName("Model checking job" + netref +": " + defaultformula);
		
		Context context = new Context();
		ROBDD is = init.toROBDD(context);
		ROBDD ts[] = new ROBDD[transitions.size()];
		ChangeSet css[] = new ChangeSet[transitions.size()];

		for (int i = 0; i< ts.length; i++) {
			ts[i] = transitions.get(i).toROBDD(context);
			css[i] = new ChangeSet(context);
			transitions.get(i).addChangedVariables(css[i]);				
		}
		transitionsystem = new Transitionsystem(context,is,ts,css);
		
		return true;
	}
	
	public void registerPlace(Place place) {
		String name = null;
		if (!place2variable.containsKey(place)) {
			Name nameLabel = place.getName();			
			if (nameLabel != null) {
				name = nameLabel.getText();
				if (placeNames.contains(name)) {
					name = null;
					duplicateNames = true;
				}
			}
			
			// if there is no name (or a duplicate one) generate
			// a unique name for this place
			while (name == null) {
				name = "@generated" + genNumber++;
				if (placeNames.contains(name)) {
					name = null;
				}

			}
			
			placeNames.add(name);
			Variable v = new Variable(name,false);
			place2variable.put(place, v);
			Variable vp = new Variable(name,true);
			place2primedvariable.put(place, vp);
		}
	}
	
	@Override
	protected String getInput() {
		return defaultformula;
	}

	@Override
	protected void run() {
		result = "Model checking results:" + LF;
		for (int i = 0; i < formulas.length; i++) {
			ROBDD obdd = formulas[i].toROBDD(transitionsystem);
			result = result + " " + formulas[i] + ": " + transitionsystem.isValid(obdd) + LF; 
		} 
	}
	
	@Override
	protected void canceling() {
		if (transitionsystem != null) {
			transitionsystem.abort();
		}
	}
	
	@Override
	protected void showResult() {
		MessageDialog.openInformation(
				null,
				"ePNK: Model checker",
				result
		);
	}
}
