/**
 * 
 */
package org.remus.cmdlinehero.controller.data;

import java.util.Date;
import java.util.Map;

import org.remus.cmdlinehero.data.PrintMode;
import org.remus.cmdlinehero.service.JobStatus;

/**
 * @author seidelt
 * 
 */
public class JobInfo {

	private String id;

	private JobStatus status;

	private Date scheduledDate;

	private Date finishedDate;

	private Map<String, String> outputs;

	private Map<String, String> inputs;

	private JobExecutionStatus executionResult;

	private PrintMode printMode;

	private String stdErr;

	private String stdOut;

	private String metaId;

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

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(final Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public Date getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(final Date finishedDate) {
		this.finishedDate = finishedDate;
	}

	public String getMetaId() {
		return metaId;
	}

	public void setMetaId(final String metaId) {
		this.metaId = metaId;
	}

	public String getStdOut() {
		return stdOut;
	}

	public void setStdOut(final String stdOut) {
		this.stdOut = stdOut;
	}

	public String getStdErr() {
		return stdErr;
	}

	public void setStdErr(final String sdtErr) {
		this.stdErr = sdtErr;
	}

	public PrintMode getPrintMode() {
		return printMode;
	}

	public void setPrintMode(final PrintMode printMode) {
		this.printMode = printMode;
	}

}
