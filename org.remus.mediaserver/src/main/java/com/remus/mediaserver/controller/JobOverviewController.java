/**
 * 
 */
package com.remus.mediaserver.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.remus.mediaexeutor.base.ExecutionInstruction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.remus.mediaserver.controller.data.JobExecutionStatus;
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
	JobInfo findJobById(@PathVariable final String jobId,
			final HttpServletRequest request) {
		JobInfo returnValue = null;
		final ExecutionInstruction findJobById = executionService
				.findJobById(jobId);
		if (findJobById != null) {
			returnValue = toJobInfo(findJobById, request);
		}
		return returnValue;

	}

	@RequestMapping(value = "alljobs/json", method = RequestMethod.GET)
	public @ResponseBody
	JobInfo[] findAllJobs(final HttpServletRequest request) {
		final Collection<ExecutionInstruction> findAllJobs = executionService
				.findAllJobs();
		final JobInfo[] allJobs = new JobInfo[findAllJobs.size()];
		int i = 0;
		for (final ExecutionInstruction executionInstruction : findAllJobs) {
			allJobs[i++] = toJobInfo(executionInstruction, request);
		}
		return allJobs;

	}

	private JobInfo toJobInfo(final ExecutionInstruction findJobById,
			final HttpServletRequest request) {
		final String jobId = findJobById.getRuntimeId();
		final JobInfo returnValue = new JobInfo();
		returnValue.setId(jobId);
		returnValue.setStatus(executionService.findStatusById(jobId));
		if (findJobById.getExecutionStatus() != null) {
			returnValue.setExecutionResult(new JobExecutionStatus(findJobById
					.getExecutionStatus().getCode(), findJobById
					.getExecutionStatus().getMessage()));

		}
		returnValue.setOutputs(executionService.buildOutputs(findJobById,
				request));
		return returnValue;
	}

}
