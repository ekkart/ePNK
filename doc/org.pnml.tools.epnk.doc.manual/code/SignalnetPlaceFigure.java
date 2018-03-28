public class SignalnetPlaceFigure extends PlaceFigure {

	public SignalnetPlaceFigure(Place place) {
		super(place);
	}

	public void update() {
		this.repaint();
	}
	
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		Rectangle rectangle = this.getClientArea();

		int m = 0;
		if (place instanceof Place)
			m = getMarking((Place) place);
		int cx = rectangle.x + rectangle.width/2;
		int cy = rectangle.y + rectangle.height/2;
		if (m == 0) {
			return;
		} else if (m == 1) {
			graphics.setBackgroundColor(getForegroundColor());
			graphics.fillOval(cx-6, cy-6, 12, 12);
		} else if (m == 2) {
			graphics.setBackgroundColor(getForegroundColor());
			graphics.fillOval(cx-11, cy-11, 12, 12);
			graphics.fillOval(cx, cy, 12, 12);
		} else if (m == 3) {
			graphics.setBackgroundColor(getForegroundColor());
			graphics.fillOval(cx-6, cy-13, 12, 12);
			graphics.fillOval(cx-13, cy, 12, 12);
			graphics.fillOval(cx+1, cy, 12, 12);
		} else if (m == 4) {
			...
		} else {
			graphics.drawString(""+m, cx-5, cy-7);
	}	}

	private int getMarking(Place place) { ... }
}
