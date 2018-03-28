public void createPNMLFile(String path, int number) {
	PetriNetDoc doc = createPetriNetDoc(number);
	
	final URI uri = URI.createURI(path);
	ResourceSet resourceSet = new ResourceSetImpl();
	final Resource resource = resourceSet.createResource(uri);
	EList<EObject> contents = resource.getContents();
	contents.add(doc);
	try {
		resource.save(null);
	} catch (IOException e) {
		// Do nothing for now if file could not be saved.
	}
}
