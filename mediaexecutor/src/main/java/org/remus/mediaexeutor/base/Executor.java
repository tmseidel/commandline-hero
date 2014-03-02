/**
 * Copyright (c) 2014 Tom Seidel, Remus Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.remus.mediaexeutor.base;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.log4j.Logger;
import org.remus.mediaexeutor.data.JobStatus;
import org.remus.mediaexeutor.data.Result;

/**
 * @author seidelt
 * 
 */
public class Executor {

	private final ExecutorService pool;

	private final List<ExecutionInstruction> jobs = new ArrayList<ExecutionInstruction>();

	private final List<Future<Result>> futureResulkts = new ArrayList<Future<Result>>();

	private final Logger LOGGER = Logger.getLogger(Executor.class);

	public Executor(final int threadCount) {
		pool = Executors.newFixedThreadPool(threadCount);
	}

	public void schedule(final ExecutionInstruction job) {
		job.setStatus(JobStatus.SCHEDULED);
		LOGGER.info(MessageFormat.format("Scheduled job {0}", job.getId()));
		jobs.add(job);
		final Future<Result> submit = pool.submit(job);
		futureResulkts.add(submit);
	}

	public List<ExecutionInstruction> findJobsByStatus(final JobStatus status) {
		final ArrayList<ExecutionInstruction> list = new ArrayList<ExecutionInstruction>(
				jobs);
		CollectionUtils.filter(list, new Predicate() {

			public boolean evaluate(final Object object) {
				return ((ExecutionInstruction) object).getStatus() == status;
			}
		});
		return Collections.unmodifiableList(list);

	}

}
