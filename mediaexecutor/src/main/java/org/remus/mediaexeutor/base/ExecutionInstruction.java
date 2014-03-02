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
package org.remus.mediaexeutor.base;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Callable;

import org.remus.mediaexeutor.data.JobStatus;
import org.remus.mediaexeutor.data.ParamDataType;
import org.remus.mediaexeutor.data.ParamType;
import org.remus.mediaexeutor.data.Result;
import org.remus.mediaexeutor.data.ResultDataElement;

/**
 * @author seidelt
 * 
 */
public abstract class ExecutionInstruction implements Callable<Result> {

	private OutputStream processStream = System.out;

	private OutputStream errorStream = System.err;

	protected final Arguments arguments;

	private JobStatus status;

	public abstract String getId();

	public ExecutionInstruction(final Arguments arguments) {
		this.arguments = arguments;
	}

	public String getDoc() {
		return null;
	}

	public String getDocUrl() {
		return null;
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

	void setStatus(final JobStatus status) {
		this.status = status;
	}

	public JobStatus getStatus() {
		return status;
	}

	public Result call() throws Exception {
		setStatus(JobStatus.STARTED);
		final boolean argumentsValid = checkInputArgumentsBeforeExecution();
		IStatus returnStatus = Status.OK_STATUS;
		if (argumentsValid) {
			try {
				internalExecute();
			} catch (final Exception e) {
				returnStatus = new Status(500, "execution",
						"Error executing instruction", e);
			}
		}
		setStatus(JobStatus.FINISHED);
		return new Result(returnStatus, getOutputElements());
	}

	protected abstract List<ResultDataElement> getOutputElements();

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

}
