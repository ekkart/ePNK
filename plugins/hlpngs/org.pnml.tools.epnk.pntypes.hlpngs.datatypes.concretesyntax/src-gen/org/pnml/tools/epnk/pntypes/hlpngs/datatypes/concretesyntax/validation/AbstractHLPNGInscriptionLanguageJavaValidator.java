package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractHLPNGInscriptionLanguageJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/hlpnginscriptiondocument"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/terms"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/booleans"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/integers"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/multisets"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/finiteintranges"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/partitions"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/strings"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/dots"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/finiteenumerations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/cyclicenumerations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/lists"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.pnml.tools/epnk/types/hlpngs/datatypes/arbitrarydeclarations"));
		return result;
	}

}
