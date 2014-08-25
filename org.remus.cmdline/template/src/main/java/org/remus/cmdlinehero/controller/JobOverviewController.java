package org.remus.cmdlinehero.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.remus.cmdlinehero.controller.data.JobInfo;
import org.remus.cmdlinehero.service.ExecutionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
 * 
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
		final JobInfo findJobById = executionService.findJobById(jobId);
		if (findJobById != null) {
			if (jobInfo.getStatus() == JobStatus.FINISHED) {
				executionService.generateOutputs(findJobById, request);
			}
			executionService.refreshStds(findJobById);
			returnValue = findJobById;
		}
		return returnValue;

	}

	@RequestMapping(value = "alljobs/json", method = RequestMethod.GET)
	public @ResponseBody
	JobInfo[] findAllJobs(final HttpServletRequest request) {
		final Collection<JobInfo> findAllJobs = executionService.findAllJobs();
		for (final JobInfo jobInfo : findAllJobs) {
			if (jobInfo.getStatus() == JobStatus.FINISHED {
				executionService.generateOutputs(jobInfo, request);
			}
			executionService.refreshStds(jobInfo);
		}
		return findAllJobs.toArray(new JobInfo[findAllJobs.size()]);

	}

}
