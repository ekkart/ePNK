FlatAccess flat = FlatAccess.getFlatAccess(getPetriNet());

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