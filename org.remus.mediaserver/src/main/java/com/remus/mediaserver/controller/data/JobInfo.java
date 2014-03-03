/**
 * 
 */
package com.remus.mediaserver.controller.data;

import java.util.Map;

import org.remus.mediaexeutor.base.IStatus;

import com.remus.mediaserver.service.JobStatus;

/**
 * @author seidelt
 * 
 */
public class JobInfo {

	private String id;

	private JobStatus status;

	private Map<String, String> outputs;

	private IStatus executionResult;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(final JobStatus status) {
		this.status = status;
	}

	public Map<String, String> getOutputs() {
		return outputs;
	}

	public void setOutputs(final Map<String, String> outputs) {
		this.outputs = outputs;
	}

	public IStatus getExecutionResult() {
		return executionResult;
	}

	public void setExecutionResult(final IStatus executionResult) {
		this.executionResult = executionResult;
	}

}
