/**
 * 
 */
package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Ffmpeg_Rotate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.remus.mediaserver.service.ExecutionService;

/**
 * @author seidelt
 * 
 */
@Controller
public class FfmpegController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Ffmpeg_Rotate.class);
	}

	@RequestMapping(value = "/ffmpeg_rotate", method = RequestMethod.GET)
	public String rotate(final Model model) {
		model.addAttribute("doc", Ffmpeg_Rotate.getDoc());
		model.addAttribute("docurl", Ffmpeg_Rotate.getDocUrl());
		model.addAttribute("id", Ffmpeg_Rotate.getId());
		return "Ffmpeg_Rotate";
	}

	@RequestMapping(value = "/ffmpeg_rotate/run", method = RequestMethod.POST)
	public String rotateRun(final MultipartHttpServletRequest request,
			final Model model) {
		final String rotationType = executionService.processStringInput(
				request, "rotationType");
		final String in = executionService.processPathInput(request, "in");
		final String out = executionService.processPathOutput(request, "out");
		final Ffmpeg_Rotate rotate = Ffmpeg_Rotate
				.create(rotationType, in, out);
		final String run = executionService.run(rotate);
		model.addAttribute("jobId", run);
		return "job_scheduled";

	}

	@RequestMapping(value = "/ffmpeg_rotate/runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request) {
		final String rotationType = executionService.processStringInput(
				request, "rotationType");
		final String in = executionService.processPathInput(request, "in");
		final String out = executionService.processPathOutput(request, "out");
		final Ffmpeg_Rotate rotate = Ffmpeg_Rotate
				.create(rotationType, in, out);
		final String run = executionService.run(rotate);
		return run;

	}

}
