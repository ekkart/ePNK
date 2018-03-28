/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */

package org.pnml.tools.epnk.toolspecific.tokenpositions.factory;

import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensionFactory;
import org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsFactory;

// @generated NOT
// @author eki
public class TokenpositionsExtensionFactory implements ToolspecificExtensionFactory {
	
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
