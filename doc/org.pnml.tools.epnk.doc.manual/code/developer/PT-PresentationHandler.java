public class PTSimulationPresentationHandler implements 
										IPresentationHandler {

	private static final BLUE = ColorConstants.blue;
	private static final LIGHTGREY = ColorConstants.lightGray;
	
	@Override
	public IFigure handle(ObjectAnnotation annotation,
			AbstractGraphicalEditPart editPart) {
		if (annotation instanceof TransitionActivationAnnotation) {
			TransitionActivationAnnotation activationAnnotation =
					(TransitionActivationAnnotation) annotation;
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart gep = (GraphicalEditPart) editPart;
				java.lang.Object modelObject =
						gep.resolveSemanticElement();
				if (modelObject instanceof TransitionNode) {
					RectangleOverlay overlay =
							new RectangleOverlay(gep);
					if (activationAnnotation.getMode().
							equals(Mode.ENABLED)) {
						overlay.setForegroundColor(BLUE);
						overlay.setBackgroundColor(BLUE);
					}
					return overlay;  }	}
		} else if (annotation instanceof PlaceSelectionAnnotation) {
			PlaceSelectionAnnotation placeAnnotation = 
					(PlaceSelectionAnnotation) annotation;
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart gep = (GraphicalEditPart) editPart;
				java.lang.Object modelObject =
						gep.resolveSemanticElement();
				if (modelObject instanceof PlaceNode) {
					EllipseOverlay overlay = new EllipseOverlay(gep);
					if (!placeAnnotation.isSelected()) {
						overlay.setForegroundColor(LIGHTGREY);
						overlay.setBackgroundColor(LIGHTGREY);
					}
					return overlay; }	}	}
		return null;
}	}