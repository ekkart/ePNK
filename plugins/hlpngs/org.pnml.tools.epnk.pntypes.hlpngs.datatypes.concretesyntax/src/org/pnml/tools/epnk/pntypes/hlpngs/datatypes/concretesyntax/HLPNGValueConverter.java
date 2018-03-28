package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesFactory;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;

public class HLPNGValueConverter extends DefaultTerminalConverters {

    @ValueConverter(rule = "NAT")
    public IValueConverter<NonNegativeInteger> NAT() {
        return new IValueConverter<NonNegativeInteger>() {
            public NonNegativeInteger toValue(String string, INode node) {
                NonNegativeInteger result = (NonNegativeInteger)
                	PnmldatatypesFactory.eINSTANCE.createFromString(
                			PnmldatatypesPackage.eINSTANCE.getNonNegativeInteger(),
                			string);
                if (result == null)
                    throw new ValueConverterException("Illegal value", node, null);
                else {
                	return result;
                }
            }

            public String toString(NonNegativeInteger value) {
                return value.toString();
            }

        };
    }
}
