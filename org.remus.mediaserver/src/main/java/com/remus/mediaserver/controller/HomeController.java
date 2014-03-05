package com.remus.mediaserver.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.remus.mediaserver.controller.data.JobInfo;
import com.remus.mediaserver.service.ExecutionService;
import com.remus.mediaserver.service.JobStatus;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	public static final int SHOW_JOBS_COUNT = 10;

	@Inject
	private ExecutionService executionService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String programs(final Locale locale, final Model model,
			final HttpServletRequest request) {
		final List<JobInfo> runningJobs = new ArrayList<JobInfo>();
		final List<JobInfo> finishedJobs = new ArrayList<JobInfo>();
		final Collection<JobInfo> findAllJobs = executionService.findAllJobs();
		for (final JobInfo jobInfo : findAllJobs) {
			if (jobInfo.getStatus() == JobStatus.FINISHED
					&& finishedJobs.size() < SHOW_JOBS_COUNT) {
				executionService.generateOutputs(jobInfo, request);
				finishedJobs.add(jobInfo);
			} else if (jobInfo.getStatus() == JobStatus.RUNNING
					&& runningJobs.size() < SHOW_JOBS_COUNT) {
				runningJobs.add(jobInfo);
			}
			if (runningJobs.size() == SHOW_JOBS_COUNT
					&& finishedJobs.size() == SHOW_JOBS_COUNT) {
				break;
			}
		}

		model.addAttribute("runningJobs", runningJobs);
		model.addAttribute("finishedJobs", finishedJobs);

		return "home";
	}

}
