				for (Arc arc: fn.getOut(transition)) {
					Object o2 = arc.getTarget();
					if (o2 instanceof PlaceNode) {
						Place target = fn.resolve((PlaceNode) o2);
						if (target != null) {
							PlaceSelectionAnnotation placeAnnotation =
									PtnetsimulatorFactory.eINSTANCE.
										createPlaceSelectionAnnotation();
							placeAnnotation.setObject(target);
							placeAnnotation.setSelected(true);
							current.getObjectAnnotations().add(placeAnnotation);
							for (PlaceNode ref: fn.getRefPlaces(target)) {
								placeAnnotation = PtnetsimulatorFactory.eINSTANCE.
										createPlaceSelectionAnnotation();
								placeAnnotation.setObject(ref);
								placeAnnotation.setSelected(true);
								current.getObjectAnnotations().
									add(placeAnnotation);
				}	}	}	}	
				app.deleteNetAnnotationAfterCurrent();
				app.addNetAnnotationAsCurrent(netAnnotation);
				return true;
	}	}	}
	return false;
}