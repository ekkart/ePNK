...

InputDialog dlg = new InputDialog(
		null,
		"ePNK: Model checker",
		"Enter a comma separated list of temporal formulas please:",
		defaultformula,
		null);
dlg.open();

if(dlg.getReturnCode()!=Window.OK)
	return false;

defaultformula = dlg.getValue();
		
do {
	try {
		Parser parser = new Parser(new StringReader(defaultformula));
		formulas = parser.parseFormulaList();
		parser.parseEnd();
	} catch (Exception e) {
		formulas = null;
		dlg = new InputDialog(
				null,
				"ePNK: Model checker",
				"Syntax error in formula:" + LF +  
				e.toString() + LF +
				"Fix the error please or press cancel:",
				defaultformula,
				null);
		dlg.open();

		if(dlg.getReturnCode()!=Window.OK) // Didn't click on OK!
			return false;
		defaultformula = dlg.getValue();
	}
} while (formulas == null);