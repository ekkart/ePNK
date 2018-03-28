metadata.add(TermsPackage.eINSTANCE.getOperator_Subterm(), 
		TermsPackage.eINSTANCE.getOperator(),
		TermsPackage.eINSTANCE.getTerm(), 
		"subterm",
		null,
		HLPNGFactory.getHLPNGFactory());

metadata.add(null,
		HlpngserialisationPackage.eINSTANCE.getTermAssoc(),
		TermsPackage.eINSTANCE.getVariable(), 
		"variable",
		null,
		HLPNGFactory.getHLPNGFactory());
		
metadata.add(null,
		HlpngserialisationPackage.eINSTANCE.getTermAssoc(),
		TermsPackage.eINSTANCE.getUserOperator(), 
		"useroperator",
		null,
		HLPNGFactory.getHLPNGFactory());