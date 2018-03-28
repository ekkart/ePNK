
	
	public Page createAgentPage(PetriNetType type, Place semaphor, int i) {
		Page page = createPage(type, "pg"+i, "agent"+i);
		
		Place idle = createPlace(type, "idle"+i, "idle"+i, 1, 100, 220);
		Place pending = createPlace(type, "pending"+i, "pending"+i, 0, 100, 60);
		Place critical = createPlace(type, "critical"+i, "critical"+i, 0, 300, 140);

		RefPlace semRef = createRefPlace("semaphor"+i, "semaphor", semaphor, 380, 140);
		
		Transition t1 = createTransition(type, "t1."+i, "t1."+i, 40, 140);
		Transition t2 = createTransition(type, "t2."+i, "t2."+i, 220, 60);
		Transition t3 = createTransition(type, "t3."+i, "t3."+i, 220, 220);
		
		Arc a1 = createArc(type, "a1."+i, idle, t1);
		Arc a2 = createArc(type, "a2."+i, t1, pending);
		Arc a3 = createArc(type, "a3."+i, pending, t2);
		Arc a4 = createArc(type, "a4."+i, t2, critical);
		Arc a5 = createArc(type, "a5."+i, critical, t3);
		Arc a6 = createArc(type, "a6."+i, t3, idle);
		
		Arc a7 = createArc(type, "a7."+i, semRef, t2);
		Coordinate coordinate = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		coordinate.setX(300);
		coordinate.setY(60);
		ArcGraphics arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
		arcGraphics.getPosition().add(coordinate);
		a7.setGraphics(arcGraphics);
		
		Arc a8 = createArc(type, "a8."+i, t3, semRef);
		coordinate = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		coordinate.setX(300);
		coordinate.setY(220);
		arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
		arcGraphics.getPosition().add(coordinate);
		a8.setGraphics(arcGraphics);
		
		EList<Object> contents = page.getObject();
		contents.add(idle);
		contents.add(pending);
		contents.add(critical);
		contents.add(semRef);
		contents.add(t1);
		contents.add(t2);
		contents.add(t3);
		contents.add(a1);
		contents.add(a2);
		contents.add(a3);
		contents.add(a4);
		contents.add(a5);
		contents.add(a6);
		contents.add(a7);
		contents.add(a8);

		return page;		
	}
	
	public Page createPage(PetriNetType type, String id, String name) {
		Page page = type.createPage();
		page.setId(id);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		page.setName(nameLabel);
		return page;
	}
	
	public Place createPlace(PetriNetType type, String id, String name, int marking, float x, float y) {
		Place place = (Place) type.createPlace();
		place.setId(id);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		place.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);

		
		nameLabel.setGraphics(labelPos);
		place.setName(nameLabel);
		if (marking > 0) {
			PTMarking markingLabel = PtnetFactory.eINSTANCE.createPTMarking();
			NonNegativeInteger value = new NonNegativeInteger(""+marking);
			markingLabel.setText(value);
			labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
			offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
			offset.setX(0);
			offset.setY(-40);
			labelPos.setOffset(offset);
			markingLabel.setGraphics(labelPos);
			place.setInitialMarking(markingLabel);
		}
		return place;
	}
	
	public Transition createTransition(PetriNetType type, String id, String name, float x, float y) {
		Transition transition = type.createTransition();
		transition.setId(id);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		transition.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);
		nameLabel.setGraphics(labelPos);
		transition.setName(nameLabel);
		return transition;
	}
	
	public RefPlace createRefPlace(String id, String name, PlaceNode place, float x, float y) {
		RefPlace refPlace = PnmlcoremodelFactory.eINSTANCE.createRefPlace();
		refPlace.setId(id);
		refPlace.setRef(place);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		refPlace.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);
		nameLabel.setGraphics(labelPos);
		refPlace.setName(nameLabel);
		return refPlace;
	}
	
	public Arc createArc(PetriNetType type, String id, Node source, Node target) {
		Arc arc = type.createArc();
		arc.setId(id);
		arc.setSource(source);
		arc.setTarget(target);
		return arc;	
	}
}