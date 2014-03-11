package com.remus.mediaserver.controller.generated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.remus.mediaexeutor.exec.Cutycapt_MakeWebShot;
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
public class Cutycapt_MakeWebShotController {

	@Inject
	private ExecutionService executionService;

	@PostConstruct
	public void register() {
		executionService.register(Cutycapt_MakeWebShot.getMeta());
	}

	@RequestMapping(value = "/cutycapt_makewebshot", method = RequestMethod.GET)
	public String makewebshot(final Model model) {
		return "generated/Cutycapt_MakeWebShot";
	}

	@RequestMapping(value = "/cutycapt_makewebshot_run", method = RequestMethod.POST)
	public String makewebshotRun(final MultipartHttpServletRequest request4011,
			final Model model4011) {
		final String url = executionService.processStringInput(
				request4011, "url");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Cutycapt_MakeWebShot cutycapt_makewebshot = Cutycapt_MakeWebShot
				.create(url,
				out
				);
		final String run4011 = executionService.run(cutycapt_makewebshot);
		model4011.addAttribute("jobId", run4011);
		return "redirect:home";

	}

	@RequestMapping(value = "/cutycapt_makewebshot_runservice", method = RequestMethod.POST)
	public @ResponseBody
	String rotateRunService(final MultipartHttpServletRequest request4011) {
		final String url = executionService.processStringInput(
				request4011, "url");
		
		final String out = executionService.processPathOutput(
				request4011, "out");
		
		final Cutycapt_MakeWebShot cutycapt_makewebshot = Cutycapt_MakeWebShot
				.create(url,
				out
				);
		final String run4011 = executionService.run(cutycapt_makewebshot);
		return run4011;

	}

}

