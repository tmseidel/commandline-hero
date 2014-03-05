/**
 * 
 */
package com.remus.mediaserver.controller.data;

import java.util.Map;

import com.remus.mediaserver.service.JobStatus;

/**
 * @author seidelt
 * 
 */
public class JobInfo {

	private String id;

	private JobStatus status;

	private Map<String, String> outputs;

	private Map<String, String> inputs;

	private JobExecutionStatus executionResult;

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

	public JobExecutionStatus getExecutionResult() {
		return executionResult;
	}

	public void setExecutionResult(final JobExecutionStatus executionResult) {
		this.executionResult = executionResult;
	}

	public Map<String, String> getInputs() {
		return inputs;
	}

	public void setInputs(final Map<String, String> inputs) {
		this.inputs = inputs;
	}

}
