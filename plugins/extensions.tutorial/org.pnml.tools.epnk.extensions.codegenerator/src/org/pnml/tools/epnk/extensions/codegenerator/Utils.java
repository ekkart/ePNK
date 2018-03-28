package org.pnml.tools.epnk.extensions.codegenerator;

public class Utils {
	
	/**
	 * Converts a String to a reasonable class name. If the String is empty, the
	 * String "Petrinet" is used.
	 * 
	 * @param name
	 * @return a class name
	 */
	public static String convert2ClassName(String name) {
		if (name != null && name.length() > 0) {
			String result = "";
			if (Character.isJavaIdentifierStart(name.charAt(0))) {
				result = ("" + name.charAt(0)).toUpperCase();
			} else {
				result = "_";
			}
			for (int i = 1; i < name.length(); i++) {
				if (Character.isJavaIdentifierPart(name.charAt(i))) {
					result = result + name.charAt(i);
				} else {
					result = result + "_";
				}				
			}
			return result;
		} else {
			return "Petrinet";
		}
	}

}
