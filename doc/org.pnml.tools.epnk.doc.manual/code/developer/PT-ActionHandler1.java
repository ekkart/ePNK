@Override
public boolean mouseDoubleClicked(
		MouseEvent arg0, ObjectAnnotation annotation) {
	NetAnnotations netAnnotations = app.getNetAnnotations();
	NetAnnotation current = netAnnotations.getCurrent();
	PetriNet net = app.getPetrinet();
		
	if (current.getObjectAnnotations().contains(annotation)) {
		Object object = annotation.getObject();
		if (annotation instanceof TransitionActivationAnnotation &&
				object instanceof TransitionNode) {
			FlatAccess fn = FlatAccess.getFlatAccess(net);
			Transition t = fn.resolve((TransitionNode) object);
				
			Map<Place,Integer> marking1 = app.computeMarking();
			if (app.enabled(marking1, t)) {
				Map<Place,Integer> marking2 =
						app.fireTransition(marking1, t);
				NetAnnotation netAnnotation =
						app.computeAnnotation(marking2);
				netAnnotation.setNet(net);
				
				TransitionActivationAnnotation ta =
						((TransitionActivationAnnotation) annotation);
				List<ObjectAnnotation> clearPlaceAnnotations =
						new ArrayList<ObjectAnnotation>();
				for (ObjectAnnotation oa:
						current.getObjectAnnotations()) {
					if (oa instanceof TransitionActivationAnnotation &&
							oa != ta ) {
						((TransitionActivationAnnotation) oa).
							setMode(Mode.ENABLED);
					} else if (oa instanceof PlaceSelectionAnnotation) {
						clearPlaceAnnotations.add(oa);
				}	}
				current.getObjectAnnotations().
					removeAll(clearPlaceAnnotations);
				transitionAnnotation.setMode(Mode.FIRED);
