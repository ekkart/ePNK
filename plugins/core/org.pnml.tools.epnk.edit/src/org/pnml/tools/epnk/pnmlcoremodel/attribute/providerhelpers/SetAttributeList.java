package org.pnml.tools.epnk.pnmlcoremodel.attribute.providerhelpers;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * Command that changed the list of attributes when changed in the property window.
 * 
 * @generated NOT (complete class written manually)
 * @author eki
 */
public class SetAttributeList extends CompoundCommand {
		
	public SetAttributeList(EditingDomain domain, EObject object, EClass attributeClass,
			EReference feature, Collection<?> list) {
		super("Set attribute " + feature.getName());
		if (domain != null && object != null && feature != null && attributeClass != null && list != null) {
			EStructuralFeature textFeature = attributeClass.getEStructuralFeature("text");
			if (textFeature != null) {
				this.append(new RemoveCommand(domain, object, feature, (Collection<?>) object.eGet(feature)));

				for (Object obj: list) {
					Attribute attribute = (Attribute) attributeClass.getEPackage().getEFactoryInstance().create(attributeClass);
					if (attribute != null) {
						attribute.eSet(textFeature, obj);
						this.append(new AddCommand(domain, object, feature, attribute));
					}
				}
			}
		}
	}

}
