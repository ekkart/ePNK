package org.pnml.tools.epnk.toolspecific.tokenpositions.factory;

import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.toolspecific.extension.
   ToolspecificExtensionFactory;
import org.pnml.tools.epnk.toolspecific.tokenpositions.
   TokenpositionsFactory;


public class TokenpositionsExtensionFactory
		implements ToolspecificExtensionFactory {

	private final static String toolname =     "org.pnml.tool";
	private final static String toolversion =  "1.0";

	public ToolInfo createToolInfo(String tool, String version) {
		// ToolInfo object does not depend on these values:
		return createToolInfo();
	}

	public ToolInfo createToolInfo() {
		return TokenpositionsFactory.eINSTANCE.createPNMLToolInfo();
	}

	public String getToolName() {
		return toolname;
	}

	public String getToolVersion() {
		return toolversion;
	}

}
