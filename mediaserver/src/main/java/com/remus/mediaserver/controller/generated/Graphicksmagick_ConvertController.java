package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Graphicksmagick_Convert;
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
public class Graphicksmagick_ConvertController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Graphicksmagick_Convert.getMeta());
	}

	@RequestMapping(value = "/graphicksmagick_convert", method = RequestMethod.GET)
	public String convert(final Model model) {
		return "generated/Graphicksmagick_Convert";
	}

	@RequestMapping(value = "/graphicksmagick_convert_run", method = RequestMethod.POST)
	public String convertRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_Convert graphicksmagick_convert = Graphicksmagick_Convert
				.create(in,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_convert);
		model4011.addAttribute("jobId", run4011);
		return "redirect:home";

	}

	@RequestMapping(value = "/graphicksmagick_convert_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_Convert graphicksmagick_convert = Graphicksmagick_Convert
				.create(in,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_convert);
		return run4011;

	}

}

