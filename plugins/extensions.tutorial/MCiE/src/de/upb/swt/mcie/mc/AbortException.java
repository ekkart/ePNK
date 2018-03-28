/*
 *  This file is part of the Model Checking in Education (MCiE) project, which
 *  provides sample implementations for some model checking techniques. 
 *  Copyright (C) 2004 Ekkart Kindler, kindler@upb.de
 *  Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 *
 *  MCiE is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; version 2 of the License.
 *
 *  MCiE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MCiE; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package de.upb.swt.mcie.mc;

/**
 * Exception that indicates that a model checking operation on a model
 * was explicitly aborted.
 * 
 * @author Ekkart Kindler, eki@imm.dtu.dk
 *
 */
@SuppressWarnings("serial")
public class AbortException extends RuntimeException {
	

    /**
     * Converts the exception to its {@link String} representation.
     */
	public String toString() {
		return "Model checking operation aborted";
	}
}
