page = null;
if (selection instanceof IStructuredSelection) {
	IStructuredSelection structuredSelection = 
		(IStructuredSelection) selection;
	if (structuredSelection.size() == 1) {
		Object selected = structuredSelection.getFirstElement();
		if (selected instanceof Page) {
			page = (Page) selected;
		} else if ( selected instanceof EditPart ) {
			EditPart part = (EditPart) selected;
			Object model = part.getModel();
			if (model != null && model instanceof View) {
				EObject object = ((View) model).getElement();
				if (object != null && object instanceof Page) {
					page = (Page) object;
}	}	}	}	}