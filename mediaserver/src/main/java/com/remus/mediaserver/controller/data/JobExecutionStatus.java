/**
 * 
 */
package com.remus.mediaserver.controller.data;

/**
 * @author Tom
 *
 */
public class JobExecutionStatus {
	
	public JobExecutionStatus(int returnCode, String description) {
		super();
		this.returnCode = returnCode;
		this.description = description;
	}

	private int returnCode;
	
	private String description;

	public int getReturnCode() {
		return returnCode;
	}

	public String getDescription() {
		return description;
	}

}
