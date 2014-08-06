/**
 * Copyright (c) 2014 Tom Seidel, Remus Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.remus.cmdlinehero.base;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.remus.cmdlinehero.data.ParamDataType;
import org.remus.cmdlinehero.data.ParamType;
import org.remus.cmdlinehero.data.ResultDataElement;

/**
 * @author seidelt
 * 
 */
public abstract class ExecutionInstruction implements Runnable {

	private final Logger LOGGER = Logger.getLogger(ExecutionInstruction.class);

	private OutputStream processStream = System.out;

	private OutputStream errorStream = System.err;

	protected final Arguments arguments;

	private IStatus executionStatus;

	private Executor executor;

	private String runtimeId;

	public ExecutionInstruction(final Arguments arguments) {
		this.arguments = arguments;
	}

	protected abstract int internalExecute() throws IOException;

	public boolean checkInputArgumentsBeforeExecution() {
		return true;
	}

	public boolean checkOutputArgumentsAfterExecution() {
		return true;
	}

	protected boolean checkArgument(final String string,
			final ParamDataType filepath, final ParamType input) {
		return true;
	}

	public void run() {
		final boolean argumentsValid = checkInputArgumentsBeforeExecution();
		executionStatus = Status.OK_STATUS;
		if (argumentsValid) {
			executor.notifyStart(this);
			try {
				internalExecute();
			} catch (final Throwable e) {
				executionStatus = new Status(IStatus.ERROR, "execution",
						IStatus.ERROR, "Error executing instruction", e);
			} finally {
				executor.notifyFinish(this);
			}
		}

	}

	public abstract List<ResultDataElement> getOutputElements();

	public abstract List<ResultDataElement> getInputElements();

	public OutputStream getProcessStream() {
		return processStream;
	}

	public void setProcessStream(final OutputStream processStream) {
		this.processStream = processStream;
	}

	public OutputStream getErrorStream() {
		return errorStream;
	}

	public void setErrorStream(final OutputStream errorStream) {
		this.errorStream = errorStream;
	}

	public IStatus getExecutionStatus() {
		return executionStatus;
	}

	public void setExecutor(final Executor executor) {
		this.executor = executor;
	}

	public String getRuntimeId() {
		return runtimeId;
	}

	public void setRuntimeId(final String runtimeId) {
		this.runtimeId = runtimeId;
	}

}
