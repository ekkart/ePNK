public String[] getOverviewInfo(IFile file) {
	String[] result = {"No ePNK file selected"};
	String extension = file.getFileExtension();
	if (extension != null && 
			(extension.equals("pnml" ) || extension.equals("pnx"))) {
		String path = file.getLocationURI().toString();
		URI uri = URI.createURI(path);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;
		try {
			resource = resourceSet.getResource(uri, true);
		} catch (Exception e) {
			result[0] = "File could not be read.";
			return result;						
		}

		List<EObject> contents = resource.getContents();
		if (contents != null && contents.size() > 0) {
			EObject object = contents.get(0);
			if (object instanceof PetriNetDoc) {
				PetriNetDoc document = (PetriNetDoc) object;
				List<PetriNet> nets = document.getNet();
				int no = nets.size();							
				result = new String[no + 1];
				result[0] = "The Petri Net Document contains "
					+ no + (no == 1 ? " net" : " nets:");
				no = 1;
				for (PetriNet net : nets) {
					String name = net.getName() != null ?
							net.getName().getText() : "unknown";
					String type = net.getType() != null ?
							net.getType().toString() : "unknown";
					result[no++] = "  " + name + ": " + type;
				}
			} else result[0] = "The file does not contain a PetriNetDoc.";
		} else result[0] = "The file does not contain any element.";
	}
	return result;
}

