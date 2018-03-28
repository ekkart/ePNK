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