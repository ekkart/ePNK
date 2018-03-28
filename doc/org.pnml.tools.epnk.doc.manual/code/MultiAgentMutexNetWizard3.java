public Page createAgentPage(PetriNetType type, Place sem, int i) {
	Page page = createPage(type, "pg"+i, "agent"+i);
	
	Place idle = createPlace(type, "idl"+i, "idl"+i, 1, 100, 220);
	Place pending = createPlace(type, "pen"+i, "pen"+i, 0, 100, 60);
	Place critical = createPlace(type, "cri"+i, "cri"+i, 0, 300, 140);
	RefPlace semRef = createRefPlace("sem"+i, "sem", sem, 380, 140);	
	Transition t1 = createTransition(type, "t1."+i, "t1."+i, 40, 140);
	Transition t2 = createTransition(type, "t2."+i, "t2."+i, 220, 60);
	Transition t3 = createTransition(type, "t3."+i, "t3."+i, 220,220);
	
	Arc a1 = createArc(type, "a1."+i, idle, t1);
	Arc a2 = createArc(type, "a2."+i, t1, pending);
	...
	Arc a6 = createArc(type, "a6."+i, t3, idle);
	
	Arc a7 = createArc(type, "a7."+i, semRef, t2);
	Coordinate coordinate =
		PnmlcoremodelFactory.eINSTANCE.createCoordinate();
	coordinate.setX(300);
	coordinate.setY(60);
	ArcGraphics arcGraphics =
		PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
	arcGraphics.getPosition().add(coordinate);
	a7.setGraphics(arcGraphics);

	Arc a8 = createArc(type, "a8."+i, t3, semRef);
	...
	a8.setGraphics(arcGraphics);
	
	EList<Object> contents = page.getObject();
	contents.add(idle);
	contents.add(pending);
	...
	contents.add(t3);
	contents.add(a1);
	...
	contents.add(a8);

	return page;		
}
