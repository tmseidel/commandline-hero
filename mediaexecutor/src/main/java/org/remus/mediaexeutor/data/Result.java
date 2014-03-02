/**
 * 
 */
package org.remus.mediaexeutor.data;

import java.util.List;

import org.remus.mediaexeutor.base.IStatus;

/**
 * @author seidelt
 * 
 */
public class Result {

	public Result(final IStatus status, final List<ResultDataElement> elements) {
		super();
		this.status = status;
		this.elements = elements;
	}

	private final IStatus status;

	private final List<ResultDataElement> elements;

	public IStatus getStatus() {
		return status;
	}

	public List<ResultDataElement> getElements() {
		return elements;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", elements=" + elements + "]";
	}

}
