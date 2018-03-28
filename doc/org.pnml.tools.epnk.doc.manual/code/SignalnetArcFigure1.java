public class SignalnetArcFigure extends ArcFigure {
	
	private enum Type { NORMAL, READ, INHIBIT, SIGNAL }
	
	private Type type;
	
	public SignalnetArcFigure(Arc arc) {
		super(arc);
		type = getType();
		setGraphics();
	}
	
	@Override
	public void update() {
		Type oldType = type;
		type = getType();
		if (oldType != type) {
			setGraphics();
	}	}

	private void setGraphics() {
		RotatableDecoration targetDecorator = null;
		RotatableDecoration sourceDecorator = null;

		if (type == Type.READ) {
			targetDecorator = new ReisigsArrowHeadDecoration();
			sourceDecorator = new ReisigsArrowHeadDecoration();
		} else if (type == Type.INHIBIT) {
			targetDecorator =  new CircleDecoration();
		} else if (type == Type.SIGNAL) {
			sourceDecorator = new FlashDecoration();
			targetDecorator = new ReisigsArrowHeadDecoration();
		} else {
			targetDecorator = new ReisigsArrowHeadDecoration();
		} 

		this.setTargetDecoration(targetDecorator);
		this.setSourceDecoration(sourceDecorator);
	}
	
	...
