/**
 * 
 */
package org.remus.cmdlinehero.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.remus.cmdlinehero.base.ExecutionInstruction;
import org.remus.cmdlinehero.data.ResultDataElement;
import org.remus.cmdlinehero.service.ExecutionService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tom
 * 
 */
@Controller
public class DownloadController {

	@Inject
	private ExecutionService executionService;

	@RequestMapping(value = "/download/{jobId}/{paramId}", method = RequestMethod.GET)
	@ResponseBody
	public FileSystemResource download(
			@PathVariable("jobId") final String jobId,
			@PathVariable("paramId") final String paramId,
			final HttpServletResponse response) {
		final ExecutionInstruction jobById = executionService
				.findExecutionById(jobId);
		if (jobById != null && jobById.getExecutionStatus().isOK()) {
			final List<ResultDataElement> elements = jobById
					.getOutputElements();
			for (final ResultDataElement resultDataElement : elements) {
				if (paramId.equals(resultDataElement.getParamId())) {
					final String name = FilenameUtils.getName(resultDataElement
							.getData());
					try {
						response.setHeader("Content-Type",
								"application/octet-stream");
						response.setHeader("Content-Disposition",
								"attachment; filename=" + name);
						return new FileSystemResource(
								resultDataElement.getData());

					} finally {
						try {
							response.flushBuffer();
						} catch (final IOException e) {
							// skip
						}
					}
				}
			}
		}
		throw new IllegalArgumentException(
				"The requested file could not be found.");

	}

	@RequestMapping(value = "/url/{jobId}/{paramId}", method = RequestMethod.GET)
	public ModelAndView redirect(@PathVariable("jobId") final String jobId,
			@PathVariable("paramId") final String paramId) {
		final ExecutionInstruction jobById = executionService
				.findExecutionById(jobId);
		if (jobById != null) {
			final List<ResultDataElement> elements = jobById
					.getOutputElements();
			for (final ResultDataElement resultDataElement : elements) {
				if (paramId.equals(resultDataElement.getParamId())) {
					return new ModelAndView("redirect:"
							+ resultDataElement.getData());
				}
			}
		}
		throw new IllegalArgumentException(
				"The requested url could not be found.");

	}

}
