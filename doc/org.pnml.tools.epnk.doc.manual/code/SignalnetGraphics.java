public class SignalnetGraphics extends GraphicalExtension {

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(SignalnetsPackage.eINSTANCE.getSignalNet());
		return list;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(SignalnetsPackage.eINSTANCE.getSignalNet())) {
			list.add(SignalnetsPackage.eINSTANCE.getArc());
			list.add(SignalnetsPackage.eINSTANCE.getPlace());
		}
		return list;
	}

	@Override
	public ArcFigure createArcFigure(Arc arc) {
		if (arc instanceof org.pnml.tools.epnk.pntypes.signalnets.Arc) {
			return new SignalnetArcFigure(
					(org.pnml.tools.epnk.pntypes.signalnets.Arc) arc);
		}
		return null;
	}

	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof
				org.pnml.tools.epnk.pntypes.signalnets.Place) {
			return new SignalnetPlaceFigure(
					(org.pnml.tools.epnk.pntypes.signalnets.Place) place);
		}
		return null;
	}

}
