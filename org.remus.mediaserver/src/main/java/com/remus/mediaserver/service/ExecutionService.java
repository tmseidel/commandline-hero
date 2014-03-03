/**
 * 
 */
package com.remus.mediaserver.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.remus.mediaexeutor.base.ExecutionInstruction;
import org.remus.mediaexeutor.base.Executor;
import org.remus.mediaexeutor.base.TaskChangeEvent;
import org.remus.mediaexeutor.base.TaskListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * @author seidelt
 * 
 */
@Service
public class ExecutionService {

	@Inject
	private Executor executor;

	@Value("${location.inputDir}")
	private String inputDir;

	@Value("${location.outputDir}")
	private String outputDir;

	private final Map<String, ExecutionInstruction> id2JobMap = new HashMap<String, ExecutionInstruction>();

	private final Map<String, JobStatus> id2StatusMap = new HashMap<String, JobStatus>();

	@PostConstruct
	private void onStart() {
		executor.addListener(new TaskListener() {

			@Override
			public void taskStarted(final TaskChangeEvent e) {
				id2StatusMap.put(e.getExecutionInstruction().getRuntimeId(),
						JobStatus.RUNNING);

			}

			@Override
			public void taskScheduled(final TaskChangeEvent e) {
				id2JobMap.put(e.getExecutionInstruction().getRuntimeId(),
						e.getExecutionInstruction());
				id2StatusMap.put(e.getExecutionInstruction().getRuntimeId(),
						JobStatus.SCHEDULED);

			}

			@Override
			public void taskFinished(final TaskChangeEvent e) {
				id2StatusMap.put(e.getExecutionInstruction().getRuntimeId(),
						JobStatus.FINISHED);

			}
		});
	}

	public void register(final Class<? extends ExecutionInstruction> class1) {

	}

	public ExecutionInstruction findJobById(final String id) {
		return id2JobMap.get(id);
	}

	public String processStringInput(final MultipartHttpServletRequest request,
			final String name) {

		return String.valueOf(request.getParameter(name));

	}

	public String processPathInput(final MultipartHttpServletRequest request,
			final String name) {
		// 1. build an iterator
		final Iterator<String> itr = request.getFileNames();

		String returnValue = null;

		MultipartFile mpf = null;

		// 2. get each file
		while (itr.hasNext()) {

			// 2.1 get next MultipartFile
			mpf = request.getFile(itr.next());
			if (mpf.getName().equals(name)) {
				final String extension = FilenameUtils.getExtension(mpf
						.getOriginalFilename());
				final File file = new File(inputDir
						+ UUID.randomUUID().toString() + "." + extension);
				try {
					final FileOutputStream output = new FileOutputStream(file);
					IOUtils.copyLarge(mpf.getInputStream(), output);
					IOUtils.closeQuietly(output);
					returnValue = file.getAbsolutePath();
				} catch (final FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}

		return returnValue;
	}

	public String processPathOutput(final MultipartHttpServletRequest request,
			final String name) {
		final String valueOf = String.valueOf(request.getParameter(name));
		final File folder = new File(outputDir + UUID.randomUUID().toString()
				+ File.separator);
		folder.mkdirs();
		return folder.getAbsolutePath() + File.separator + valueOf;
	}

	public String run(final ExecutionInstruction job) {
		executor.schedule(job);
		return job.getRuntimeId();
	}

	public JobStatus findStatusById(final String jobId) {
		return id2StatusMap.get(jobId);
	}

}
