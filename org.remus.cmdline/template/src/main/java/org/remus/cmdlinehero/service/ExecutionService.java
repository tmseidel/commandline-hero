/**
 * 
 */
package org.remus.cmdlinehero.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.remus.cmdlinehero.base.ExecutionInstruction;
import org.remus.cmdlinehero.base.Executor;
import org.remus.cmdlinehero.base.IStatus;
import org.remus.cmdlinehero.base.TaskChangeEvent;
import org.remus.cmdlinehero.base.TaskListener;
import org.remus.cmdlinehero.controller.data.JobExecutionStatus;
import org.remus.cmdlinehero.controller.data.JobInfo;
import org.remus.cmdlinehero.data.Meta;
import org.remus.cmdlinehero.data.ResultDataElement;
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

	private final List<Meta> knownClasses = new ArrayList<Meta>();

	protected Map<String, JobInfo> id2InfoMap = new HashMap<String, JobInfo>();

	private final TaskListener taskListener = new TaskListener() {

		@Override
		public void taskStarted(final TaskChangeEvent e) {
			id2InfoMap.get(e.getExecutionInstruction().getRuntimeId())
					.setStatus(JobStatus.RUNNING);

		}

		@Override
		public void taskScheduled(final TaskChangeEvent e) {
			final JobInfo jobInfo = toJobInfo(e.getExecutionInstruction());
			jobInfo.setStatus(JobStatus.SCHEDULED);
			jobInfo.setScheduledDate(new Date());
			id2InfoMap.put(e.getExecutionInstruction().getRuntimeId(), jobInfo);
			id2JobMap.put(e.getExecutionInstruction().getRuntimeId(),
					e.getExecutionInstruction());

		}

		@Override
		public void taskFinished(final TaskChangeEvent e) {
			final JobInfo jobInfo = id2InfoMap.get(e.getExecutionInstruction()
					.getRuntimeId());
			jobInfo.setStatus(JobStatus.FINISHED);
			jobInfo.setFinishedDate(new Date());
			final IStatus executionStatus = e.getExecutionInstruction()
					.getExecutionStatus();
			jobInfo.setExecutionResult(new JobExecutionStatus(executionStatus
					.getCode(), executionStatus.toString()));

		}
	};

	@PostConstruct
	private void onStart() {
		final File input = new File(inputDir);
		if (input.exists() && input.isDirectory()) {
			final File[] listFiles = input.listFiles();
			for (final File file : listFiles) {
				FileUtils.deleteQuietly(file);
			}
		} else {
			input.mkdirs();
		}
		final File output = new File(outputDir);
		if (output.exists() && output.isDirectory()) {
			final File[] listFiles = output.listFiles();
			for (final File file : listFiles) {
				FileUtils.deleteQuietly(file);
			}
		} else {
			output.mkdirs();
		}
		executor.addListener(taskListener);
	}

	@PreDestroy
	private void stop() {
		executor.removeListener(taskListener);
		executor.shutdown();

	}

	public void register(final Meta meta) {
		knownClasses.add(meta);
	}

	public JobInfo findJobById(final String id) {
		return id2InfoMap.get(id);
	}

	public ExecutionInstruction findExecutionById(final String id) {
		return id2JobMap.get(id);
	}

	public Collection<JobInfo> findAllJobs() {
		return id2InfoMap.values();
	}

	public Collection<JobInfo> findAllJobsByState(final JobStatus state) {
		final List<JobInfo> values = new ArrayList<JobInfo>(id2InfoMap.values());
		CollectionUtils.filter(values, new Predicate() {

			@Override
			public boolean evaluate(final Object object) {
				return ((JobInfo) object).getStatus() == state;
			}
		});
		return values;
	}

	public String processStringInput(final MultipartHttpServletRequest request,
			final String name) {

		return String.valueOf(request.getParameter(name));

	}

	public JobStatus getStatusByJobId(final String jobId) {
		return id2StatusMap.get(jobId);
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
				final File folder = new File(inputDir
						+ UUID.randomUUID().toString() + File.separator);
				folder.mkdirs();
				final File file = new File(folder, FilenameUtils.getName(mpf
						.getOriginalFilename()));
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

	public Map<String, String> buildOutputs(
			final ExecutionInstruction findJobById,
			final HttpServletRequest request) {
		final List<ResultDataElement> outputElements = findJobById
				.getOutputElements();
		final Map<String, String> returnValue = new HashMap<String, String>();
		final String baseUrl = String.format("%s://%s:%d%s/",
				request.getScheme(), request.getServerName(),
				request.getServerPort(), request.getContextPath());
		for (final ResultDataElement resultDataElement : outputElements) {
			switch (resultDataElement.getParamType()) {
			case PATH:
				// the local path
				returnValue.put(resultDataElement.getParamId(), baseUrl
						+ "download/" + findJobById.getRuntimeId() + "/"
						+ resultDataElement.getParamId());
				break;
			case URL:
				// the local path
				returnValue.put(resultDataElement.getParamId(),
						baseUrl + "url" + findJobById.getRuntimeId() + "/"
								+ resultDataElement.getParamId());
			case STRING:
				// the output of the console
				returnValue.put(resultDataElement.getParamId(), findJobById
						.getProcessString().toString());
				break;
			default:
				break;
			}

		}
		return returnValue;
	}

	public List<Meta> getKnownClasses() {
		return knownClasses;
	}

	public JobInfo toJobInfo(final ExecutionInstruction findJobById) {
		final String jobId = findJobById.getRuntimeId();
		final JobInfo returnValue = new JobInfo();
		returnValue.setId(jobId);
		final List<Meta> classes = getKnownClasses();
		for (final Meta meta : classes) {
			if (meta.getClassName().equals(findJobById.getClass().getName())) {
				returnValue.setMetaId(meta.getId());
				returnValue.setPrintMode(meta.getMode());
				break;
			}
		}
		returnValue.setStatus(findStatusById(jobId));
		if (findJobById.getExecutionStatus() != null) {
			returnValue.setExecutionResult(new JobExecutionStatus(findJobById
					.getExecutionStatus().getCode(), findJobById
					.getExecutionStatus().getMessage()));

		}
		returnValue.setInputs(buildInputs(findJobById));
		return returnValue;
	}

	public void generateOutputs(final JobInfo info,
			final HttpServletRequest request) {
		if (info.getOutputs() == null && id2JobMap.get(info.getId()) != null
				&& info.getExecutionResult().getReturnCode() == IStatus.OK) {
			info.setOutputs(buildOutputs(id2JobMap.get(info.getId()), request));
		}

	}

	public void refreshStds(final JobInfo info) {
		info.setStdOut(id2JobMap.get(info.getId()).getProcessString()
				.toString());
		info.setStdErr(id2JobMap.get(info.getId()).getErrorString().toString());

	}

	public Map<String, String> buildInputs(
			final ExecutionInstruction findJobById) {
		final List<ResultDataElement> inputElements = findJobById
				.getInputElements();
		final Map<String, String> returnValue = new HashMap<String, String>();
		for (final ResultDataElement resultDataElement : inputElements) {
			switch (resultDataElement.getParamType()) {
			case PATH:
				// the local path
				returnValue.put(resultDataElement.getParamId(),
						FilenameUtils.getName(resultDataElement.getData()));
				break;
			case URL:
			case STRING:
				// the local path
				returnValue.put(resultDataElement.getParamId(),
						resultDataElement.getData());
				break;
			default:
				break;
			}

		}
		return returnValue;
	}

}
