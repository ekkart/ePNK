/* This was an alternative implementation of the SAXPNMLHandler
 * which uses a stack instead of a simple object to pass values
 * between the different methods of the SAXHanlder. I made this
 * when tracking down a bug -- which was somewhere completely
 * else (in a careless implementation of the method getFeatureElementMap
 * in the ExtendedPNMLMetaData. Since I deem this to look a bit
 * nicer, I keep this implementation for now. But the stack is
 * not really needed -- therefore I do not use this implementation.
 */ 
package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

class StackElement {
	
}

class FeatureElement extends StackElement {
	PNMLFeatureElementMap featureElementMap = null;
	String  element = null;	
}

class ObjectElement extends StackElement {
	EObject object = null;
}



//@generated NOT
public class SAXPNMLHandler extends SAXXMLHandler implements IAttributeProvider {
	
	/* FIXME delete remainders of first experiments with places
	private enum ObjectType  { place, transition };
	*/
	
	private ExtendedPNMLMetaData extendedPNMLMetaData;
	
	/* FIXME delete remainders of original experiments with places
	private ObjectType last = null;	
	private Place place = null;
	*/
	
	private Vector<StackElement> stack = new Vector<StackElement>();
	private Vector<StackElement> objectStack = new Vector<StackElement>();
	
	/*
	private PNMLFeatureElementMap currentFeatureElementMap = null;
	// FIXME would be nicer, if we would not need this (could be done with including
	//       the name of the element in the class PNMLFeatureElementMap.
	private String currentElement = null;
	private EObject currentObject = null;
    */
	public SAXPNMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options, ExtendedPNMLMetaData extendedPNMLMetaData) {
		super(xmiResource, helper, options);
		this.extendedPNMLMetaData = extendedPNMLMetaData;
	}

	@Override
	protected EPackage getPackageForURI(String uriString) {
		// FIXME
		if (uriString == null || uriString.equals("")) {
			return PnmlcoremodelPackage.eINSTANCE;
		}
		
		return super.getPackageForURI(uriString);
	}

	@Override
	protected EStructuralFeature getFeature(EObject object, String prefix,
			String name, boolean isElement) {
		
		/* FIXME delete remainders of original experiments with places
		// FIXME quick and dirty hack to read place features	
		if (object instanceof Page && "".equals(prefix) && "place".equals(name)) {
			last = ObjectType.place;
			return PnmlcoremodelPackage.eINSTANCE.getPage_Object();
			
		}
		*/
		
		PNMLFeatureElementMap featureElementMap = extendedPNMLMetaData.getFeatureElementMap(object, name, isElement, this);
		if (featureElementMap != null) {
			FeatureElement contentElement = new FeatureElement();
			contentElement.featureElementMap = featureElementMap;
			contentElement.element = name;
			stack.add(contentElement);
			return featureElementMap.getFeature();
		} else {
			stack.add(new StackElement());
		}
		
		// FIXME experiment for setting attributes (in this case the type attribute of nets
		if (!isElement) {
			List<PNMLFeatureAttributeMap> featureMapList = extendedPNMLMetaData.getFeatureAttributeMapList(object);
			if (featureMapList != null && featureMapList.size() > 0) {
				for (PNMLFeatureAttributeMap featureMap: featureMapList) {
					if (featureMap.getAttributeName().equals(name)) {
						return featureMap.getFeature();
					}
				}
			}
		}
			
		return super.getFeature(object, prefix, name, isElement);
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {
		
		// TODO this needs to be carefully checked.
		StackElement element = stack.remove(stack.size()-1);
		
		if (element instanceof FeatureElement ) {
			FeatureElement contentElement = (FeatureElement) element;
			if (feature.equals(contentElement.featureElementMap.getFeature()) &&
					(contentElement.featureElementMap.getContainer() == null || 
							contentElement.featureElementMap.getContainer().isInstance(peekObject))) {
				ObjectElement objectElement = new ObjectElement();
				objectElement.object =  contentElement.featureElementMap.getFactory().createObject(peekObject, contentElement.element, contentElement.featureElementMap.getAttribute(), this);
				objectStack.add(objectElement);
				this.handleObjectAttribs(objectElement.object);
				// super.createObject(peekObject,null);
				// return;
			} else {
				// FIXME if this happens, there is probably something wrong
				boolean test = false;
			}
		} else {
			objectStack.add(new StackElement());
		}
				
		super.createObject(peekObject, feature);
	}

	@Override
	protected EObject validateCreateObjectFromFactory(EFactory factory,
			String typeName, EObject newObject, EStructuralFeature feature) {
		
		
		// FIXME right now, we jump over the built- validation! But we eventually
		//       need to implement our own one (otherwise the complete serialisation
		//       could easily be compromised by bad ExtendedPNMLMetaData!

		StackElement stackElement = objectStack.remove(objectStack.size()-1);
		
		if (newObject == null && stackElement instanceof ObjectElement) {
			ObjectElement objectElement = (ObjectElement) stackElement;
			EObject object = objectElement.object;
			return object;
		} 
		
		/*
		if (newObject == null && currentObject != null) {
			EObject object = currentObject;
			currentObject = null;
			return object;
		}
		*/
		
		return super.validateCreateObjectFromFactory(factory, typeName, newObject,
				feature);
	}

	@Override
	protected void handleXMLNSAttribute(String attrib, String value) {
		// FIXME for now the xmlns attribute of the PNML element is ignored
		if ("xmlns".equals(attrib) && elements.size() == 1) {
			Object o = elements.get(0);
			if ("pnml".equals(o)) {
			    if (!"http://www.pnml.org/version-2009/grammar/pnml".equals(value)) {
					this.reportUnknownFeature("", attrib, false, null, value);
			    }	
				return;
			}
		}
		super.handleXMLNSAttribute(attrib, value);
	}
	
	@Override
	protected void handleObjectAttribs(EObject obj) {
		// FIXME right now the id of a net is ignored! This
		//       needs to be fixed (maybe by introducing an explicit mapping).
		List<EStructuralFeature> featureList = extendedPNMLMetaData.getAttributeFeatures(obj);
		if (featureList != null && featureList.size() > 0) {
			for (EStructuralFeature feature: featureList) {
			extendedPNMLMetaData.setAttribute(
					obj, 
					extendedPNMLMetaData.getAttribute(obj, feature),
					this);
			}
			return;
		}
		
		super.handleObjectAttribs(obj);
	}
		

	@Override
	public String getValue(String attribute) {
		return attribs.getValue(attribute);
	}





	
}
