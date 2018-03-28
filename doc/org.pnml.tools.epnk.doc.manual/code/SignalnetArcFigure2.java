	...
	
	private Type getType() {
		if (this.arc instanceof Arc) {
			ArcType arctype = ((Arc) arc).getType();
			if (arctype != null) {
				switch (arctype.getText().getValue()) {
				case ArcTypes.READ_VALUE:
					return Type.READ;
				case ArcTypes.INHIBIT_VALUE:
					return Type.INHIBIT;
				}
			} else {
				Node source = arc.getSource();
				Node target = arc.getTarget();
				if (source instanceof TransitionNode && 
					target instanceof TransitionNode) {
					return Type.SIGNAL;
				} 
			}
		}
		return Type.NORMAL;
	}

}
