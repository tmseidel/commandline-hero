/**
 * 
 */
package com.remus.mediaserver.controller;

import javax.inject.Inject;

import org.remus.mediaexeutor.base.ExecutionInstruction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.remus.mediaserver.controller.data.JobInfo;
import com.remus.mediaserver.service.ExecutionService;

/**
 * @author seidelt
 * 
 */
@Controller
public class JobOverviewController {

	@Inject
	private ExecutionService executionService;

	@RequestMapping(value = "jobstatus/{jobId}/json", method = RequestMethod.GET)
	public @ResponseBody
	JobInfo findJobById(@PathVariable final String jobId) {
		JobInfo returnValue = null;
		final ExecutionInstruction findJobById = executionService
				.findJobById(jobId);
		if (findJobById != null) {
			returnValue = new JobInfo();
			returnValue.setId(jobId);
			returnValue.setStatus(executionService.findStatusById(jobId));
			returnValue.setExecutionResult(returnValue.getExecutionResult());
		}
		return returnValue;

	}

}
