package org.pnml.tools.epnk.graphics.datatypes;

import java.awt.Color;

import javax.swing.text.html.StyleSheet;

import org.eclipse.swt.graphics.RGB;

// @generated NOT
public class CSSColor {
	
	private final RGB colour;
	
	private String value;
	
	public CSSColor(String value) throws IllegalFormatException  {
		this.value = value;

		Color colour = null;
		StyleSheet sheet = new StyleSheet();
		if (value.toLowerCase().equals("orange")) {
			// In addition to the 16 VGA color names, CSS 2.1 also supports
			// the colour orange by name; since this case is not covered by the
			// stringToColor method below, this is a special case.
			colour = sheet.stringToColor("#ffa500");
		} else {
			colour = sheet.stringToColor(value);
		}

		if (colour == null) {
			throw new IllegalFormatException("The color attribute is not in CSS2 format: " + value);
		} else {
			this.colour = new RGB(colour.getRed(), colour.getGreen(), colour.getBlue());
		}
	}
	
	public CSSColor(RGB colour) {
		if (colour != null) {
			this.colour = colour;
			this.value = "#"+intToHex(colour.red) + intToHex(colour.green) + intToHex(colour.blue);
		} else {
			throw new IllegalArgumentException("Color argument must not be null!");
		}
	}
	
	private static String intToHex(int i) {
		String result = Integer.toHexString(i);
		if (result.length() < 2) {
			result = "0"+result;
		}
		return result;
	}

	@Override
	public String toString() {
		return value;
	}
	
	public RGB getRGB() {
		return colour;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof CSSColor) {
			return this.getRGB().equals(((CSSColor) other).getRGB());
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return this.getRGB().hashCode();
	}

}
