package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Graphicksmagick_DrawText;
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
public class Graphicksmagick_DrawTextController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Graphicksmagick_DrawText.getMeta());
	}

	@RequestMapping(value = "/graphicksmagick_drawtext", method = RequestMethod.GET)
	public String drawtext(final Model model) {
		return "generated/Graphicksmagick_DrawText";
	}

	@RequestMapping(value = "/graphicksmagick_drawtext_run", method = RequestMethod.POST)
	public String drawtextRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String x = executionService.processStringInput(
				request4011, "x");
		
		final String y = executionService.processStringInput(
				request4011, "y");
		
		final String text = executionService.processStringInput(
				request4011, "text");
		
		final String color = executionService.processStringInput(
				request4011, "color");
		
		final String fontsize = executionService.processStringInput(
				request4011, "fontsize");
		
		final String file = executionService.processPathInput(
				request4011, "file");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_DrawText graphicksmagick_drawtext = Graphicksmagick_DrawText
				.create(x,
				y,
				text,
				color,
				fontsize,
				file,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_drawtext);
		model4011.addAttribute("jobId", run4011);
		return "redirect:home";

	}

	@RequestMapping(value = "/graphicksmagick_drawtext_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String x = executionService.processStringInput(
				request4011, "x");
		
		final String y = executionService.processStringInput(
				request4011, "y");
		
		final String text = executionService.processStringInput(
				request4011, "text");
		
		final String color = executionService.processStringInput(
				request4011, "color");
		
		final String fontsize = executionService.processStringInput(
				request4011, "fontsize");
		
		final String file = executionService.processPathInput(
				request4011, "file");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Graphicksmagick_DrawText graphicksmagick_drawtext = Graphicksmagick_DrawText
				.create(x,
				y,
				text,
				color,
				fontsize,
				file,
				out
				);
		final String run4011 = executionService.run(graphicksmagick_drawtext);
		return run4011;

	}

}

