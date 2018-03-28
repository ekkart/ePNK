for (Transition transition: (new FlatAccess(petrinet)).
		getTransitions()) {
	NetAnnotation netAnnotation = NetannotationsFactory.
			eINSTANCE.createNetAnnotation();
	netAnnotation.setNet(petrinet);
	ObjectAnnotation objectAnnotation = NetannotationsFactory.
			eINSTANCE.createObjectAnnotation();
	objectAnnotation.setObject(transition);
	netAnnotation.getObjectAnnotations().add(objectAnnotation);

	for (Arc arc:transition.getIn()) {
		objectAnnotation = NetannotationsFactory.
				eINSTANCE.createObjectAnnotation();
		objectAnnotation.setObject(arc);
		netAnnotation.getObjectAnnotations().add(objectAnnotation);
				
		objectAnnotation = NetannotationsFactory.
				eINSTANCE.createObjectAnnotation();
		objectAnnotation.setObject(arc.getSource());
		netAnnotation.getObjectAnnotations().add(objectAnnotation);
	}
			
	for (Arc arc:transition.getOut()) {
		objectAnnotation = NetannotationsFactory.
				eINSTANCE.createObjectAnnotation();
		objectAnnotation.setObject(arc);
		netAnnotation.getObjectAnnotations().add(objectAnnotation);
				
		objectAnnotation = NetannotationsFactory.
				eINSTANCE.createObjectAnnotation();
		objectAnnotation.setObject(arc.getTarget());
		netAnnotation.getObjectAnnotations().add(objectAnnotation);
	}
			
	netAnnotations.getNetAnnotations().add(netAnnotation);
}