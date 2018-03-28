public class CalculateTransitionContext extends Application {
	
	public CalculateTransitionContext(PetriNet petrinet) {
		super(petrinet);
	}

	public void initializeContents() {
		
		NetAnnotations netAnnotations = this.getNetAnnotations();
		PetriNet petrinet = this.getPetrinet();
		
		for (Transition transition: (new FlatAccess(petrinet)).
				getTransitions()) {
			NetAnnotation netAnnotation = NetannotationsFactory.
					eINSTANCE.createNetAnnotation();
			netAnnotation.setNet(petrinet);
			
			...
			
			netAnnotations.getNetAnnotations().add(netAnnotation);
		}
		
		if (netAnnotations.getNetAnnotations().size() > 0) {
			netAnnotations.setCurrent(
					netAnnotations.getNetAnnotations().get(0));
		}
	}
}
