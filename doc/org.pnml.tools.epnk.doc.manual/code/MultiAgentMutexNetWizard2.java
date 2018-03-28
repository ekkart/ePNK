public PetriNetDoc createPetriNetDoc(int number) {
	PetriNetDoc doc = PnmlcoremodelFactory.
		eINSTANCE.createPetriNetDoc();
	
	PetriNet net = PnmlcoremodelFactory.eINSTANCE.createPetriNet();
	net.setId("n1");
	doc.getNet().add(net);
	PetriNetType type = PtnetFactory.eINSTANCE.createPTNet();
	net.setType(type);
	
	Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
	nameLabel.setText("Mutual exclusion");
	net.setName(nameLabel);
	
	Page page = createPage(type, "pg0", "semaphor page");
	EList<Page> pages = net.getPage();
	pages.add(page);
	
	Place semaphor = this.createPlace(
		type, "semaphor", "semaphor", 1, 380, 140);
	page.getObject().add(semaphor);
	
	for (int i=1; i<= number; i++) {
		page = createAgentPage(type, semaphor, i);
		pages.add(page);
	}
	
	return doc;
}	
