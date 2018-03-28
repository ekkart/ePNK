package org.pnml.tools.epnk.graphics.datatypes;

/**
 * A data type representing a URI. Actually the syntax of the URI is
 * not checked at all.
 * 
 * @author eki
 *
 */
// @generated NOT
public class URI {
	
	private String value;
	
	public URI(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof URI) {
			return (this.value != null && this.value.equals(((URI) other).value)) ||
				(this.value == null && ((URI) other).value == null) ;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		if (this.value != null) {
			return this.value.hashCode();
		}
		return 0;
	}

}
