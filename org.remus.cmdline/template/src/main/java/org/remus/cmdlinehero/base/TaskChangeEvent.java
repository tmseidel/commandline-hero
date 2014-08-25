/**
 * 
 */
package org.remus.cmdlinehero.base;

import java.util.Date;

/**
 * A class to track changes while executing {@link ExecutionInstruction}s
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
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
