package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Graphicksmagick_ResizeAbsolute;
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
public class Graphicksmagick_ResizeAbsoluteController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Graphicksmagick_ResizeAbsolute.getMeta());
	}

	@RequestMapping(value = "/graphicksmagick_resizeabsolute", method = RequestMethod.GET)
	public String resizeabsolute(final Model model) {
		return "generated/Graphicksmagick_ResizeAbsolute";
	}

	@RequestMapping(value = "/graphicksmagick_resizeabsolute_run", method = RequestMethod.POST)
	public String resizeabsoluteRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String width = executionService.processStringInput(
				request4011, "width");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_ResizeAbsolute graphicksmagick_resizeabsolute = Graphicksmagick_ResizeAbsolute
				.create(in,
				width,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_resizeabsolute);
		model4011.addAttribute("jobId", run4011);
		return "redirect:home";

	}

	@RequestMapping(value = "/graphicksmagick_resizeabsolute_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String in = executionService.processPathInput(
				request4011, "in");
		
		final String width = executionService.processStringInput(
				request4011, "width");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_ResizeAbsolute graphicksmagick_resizeabsolute = Graphicksmagick_ResizeAbsolute
				.create(in,
				width,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_resizeabsolute);
		return run4011;

	}

}

