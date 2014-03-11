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
 * 
 * WARNING: This class is generated code. Please do not modify its content.
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
 * 
 * 
 */
@Controller
public class Ffmpeg_RotateController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Ffmpeg_Rotate.getMeta());
	}

	@RequestMapping(value = "/ffmpeg_rotate", method = RequestMethod.GET)
	public String rotate(final Model model) {
		return "generated/Ffmpeg_Rotate";
	}

	@RequestMapping(value = "/ffmpeg_rotate_run", method = RequestMethod.POST)
	public String rotateRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String rotationType = executionService.processStringInput(
				request4011, "rotationType");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Ffmpeg_Rotate ffmpeg_rotate = Ffmpeg_Rotate
				.create(in,
				rotationType,
				out
				);
		final String run4011 = executionService.run(ffmpeg_rotate);
		model4011.addAttribute("jobId", run4011);
		return "home";

	}

	@RequestMapping(value = "/ffmpeg_rotate_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String rotationType = executionService.processStringInput(
				request4011, "rotationType");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Ffmpeg_Rotate ffmpeg_rotate = Ffmpeg_Rotate
				.create(in,
				rotationType,
				out
				);
		final String run4011 = executionService.run(ffmpeg_rotate);
		return run4011;

	}

}

