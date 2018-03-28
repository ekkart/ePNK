public void registerExtendedPNMLMetaData(
		ExtendedPNMLMetaData metadata) {
    ...
    
	metadata.add(
			HlpngdefinitionPackage.eINSTANCE.getType_Structure(), 
			HlpngdefinitionPackage.eINSTANCE.getType(),
			TermsPackage.eINSTANCE.getSort(), 
			"structure",
			null,
			HLPNGFactory.getHLPNGFactory());

	metadata.add(
			HlpngdefinitionPackage.eINSTANCE.getHLMarking_Structure(), 
			HlpngdefinitionPackage.eINSTANCE.getHLMarking(),
			TermsPackage.eINSTANCE.getTerm(), 
			"structure",
			null,
			HLPNGFactory.getHLPNGFactory());

	metadata.add(
			HlpngdefinitionPackage.eINSTANCE.getCondition_Structure(), 
			HlpngdefinitionPackage.eINSTANCE.getCondition(),
			TermsPackage.eINSTANCE.getTerm(), 
			"structure",
			null,
			HLPNGFactory.getHLPNGFactory());
	
    ...
}