
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HLPNGInscriptionLanguageStandaloneSetup extends HLPNGInscriptionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new HLPNGInscriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

