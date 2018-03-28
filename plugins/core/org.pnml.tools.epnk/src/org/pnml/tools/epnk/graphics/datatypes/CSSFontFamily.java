package org.pnml.tools.epnk.graphics.datatypes;

import java.awt.Font;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.StyleSheet;

// @generated NOT
public class CSSFontFamily {
	
	private String value;
	private Font font;
	
	public CSSFontFamily(String value) throws IllegalFormatException {
		this.value = value;
		
		StyleSheet sheet = new StyleSheet();
		AttributeSet attributeSet = null;
		try {
			attributeSet = sheet.getDeclaration("font-family: " + value + ";");
		} catch (Exception e) { 
			
		}
		if (attributeSet == null) {
			throw new IllegalFormatException("Not a font family: " + value);
		}
	    font = sheet.getFont(attributeSet);
		if (font == null) {
			throw new IllegalFormatException("Not a font family: " + value);
		}
	}

	@Override
	public String toString() {
		return value;
	}
	
	public Font getFont() {
		return font;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof CSSFontFamily) {
			return this.getFont().equals(((CSSFontFamily) other).getFont());
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return this.getFont().hashCode();
	}

}
