/**
 * 
 */
package org.remus.mediaexeutor.base;

import java.util.Date;

/**
 * @author seidelt
 * 
 */
public class TaskChangeEvent {

	public TaskChangeEvent(final ExecutionInstruction executionInstruction,
			final Date time) {
		super();
		this.executionInstruction = executionInstruction;
		this.time = time;
	}

	private final ExecutionInstruction executionInstruction;

	private final Date time;

	public ExecutionInstruction getExecutionInstruction() {
		return executionInstruction;
	}

	public Date getTime() {
		return time;
	}

}
