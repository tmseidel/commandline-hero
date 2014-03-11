package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Ffmpeg_Downscale360p;
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
public class Ffmpeg_Downscale360pController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Ffmpeg_Downscale360p.getMeta());
	}

	@RequestMapping(value = "/ffmpeg_downscale360p", method = RequestMethod.GET)
	public String downscale360p(final Model model) {
		return "generated/Ffmpeg_Downscale360p";
	}

	@RequestMapping(value = "/ffmpeg_downscale360p_run", method = RequestMethod.POST)
	public String downscale360pRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Ffmpeg_Downscale360p ffmpeg_downscale360p = Ffmpeg_Downscale360p
				.create(in,
				out
				);
		final String run4011 = executionService.run(ffmpeg_downscale360p);
		model4011.addAttribute("jobId", run4011);
		return "home";

	}

	@RequestMapping(value = "/ffmpeg_downscale360p_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Ffmpeg_Downscale360p ffmpeg_downscale360p = Ffmpeg_Downscale360p
				.create(in,
				out
				);
		final String run4011 = executionService.run(ffmpeg_downscale360p);
		return run4011;

	}

}

