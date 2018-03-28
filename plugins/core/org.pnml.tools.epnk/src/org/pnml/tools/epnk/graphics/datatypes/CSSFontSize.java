package org.pnml.tools.epnk.graphics.datatypes;

import java.awt.Font;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.StyleSheet;

// @generated NOT
public class CSSFontSize {
	
	private String value;
	private int size;
	
	public CSSFontSize(String value) throws IllegalFormatException {
		this.value = value;
		
		StyleSheet sheet = new StyleSheet();
		AttributeSet attributeSet = null;
		try {
			attributeSet = sheet.getDeclaration("font-size: " + value);
		} catch (Exception e) { 
			
		}
		if (attributeSet == null) {
			throw new IllegalFormatException("Not a font size: " + value);
		}
	    Font font = sheet.getFont(attributeSet);
		if (font == null) {
			throw new IllegalFormatException("Not a font size: " + value);
		}
		
		size = font.getSize();
	}
	
	public CSSFontSize(int size) {
		if (size < 0) {
			size = 9;
		}
		this.value = size +"pt";
		this.size = size;
	}

	@Override
	public String toString() {
		return value;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof CSSFontSize) {
			return this.getSize() == ((CSSFontSize) other).getSize();
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return this.getSize();
	}

}
