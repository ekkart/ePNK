Name name = getPetriNet().getName();
String netref = "";
if ( name != null && name.getText()!= null) {
	netref = " on net " + name.getText();
}
			
this.setName("Model checking job" + netref +": " + defaultformula);
	
Context context = new Context();
ROBDD is = init.toROBDD(context);
ROBDD ts[] = new ROBDD[transitions.size()];
ChangeSet css[] = new ChangeSet[transitions.size()];

for (int i = 0; i< ts.length; i++) {
	ts[i] = transitions.get(i).toROBDD(context);
	css[i] = new ChangeSet(context);
	transitions.get(i).addChangedVariables(css[i]);				
}
transitionsystem = new Transitionsystem(context,is,ts,css);
	
return true;