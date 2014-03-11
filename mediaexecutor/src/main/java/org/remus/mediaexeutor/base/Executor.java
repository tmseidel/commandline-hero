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
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

/**
 * An executor of {@link ExecutionInstruction}s. Has also the ability to handle
 * {@link TaskListener} and their respective Events
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
 * 
 */
public class Executor {

	private final ExecutorService pool;

	private final Set<TaskListener> listeners = new CopyOnWriteArraySet<TaskListener>();

	private final Logger LOGGER = Logger.getLogger(Executor.class);

	public Executor(final int threadCount) {
		pool = Executors.newFixedThreadPool(threadCount);
	}

	public void schedule(final ExecutionInstruction job) {
		final String string = UUID.randomUUID().toString();
		job.setRuntimeId(string);
		job.setExecutor(this);
		notifySchedule(job);
		pool.submit(job);
	}

	public void shutdown() {
		pool.shutdown();
	}

	final void notifySchedule(final ExecutionInstruction instruction) {
		LOGGER.info(MessageFormat.format("Scheduled job {0}", instruction
				.getClass().getSimpleName()));
		for (final TaskListener listener : listeners) {
			try {
				listener.taskScheduled(new TaskChangeEvent(instruction,
						new Date()));
			} catch (final Throwable t) {
				// do nothing
			}
		}
	}

	final void notifyStart(final ExecutionInstruction instruction) {
		for (final TaskListener listener : listeners) {
			try {
				listener.taskStarted(new TaskChangeEvent(instruction,
						new Date()));
			} catch (final Throwable t) {
				// do nothing
			}
		}
	}

	final void notifyFinish(final ExecutionInstruction instruction) {
		for (final TaskListener listener : listeners) {
			try {
				listener.taskFinished(new TaskChangeEvent(instruction,
						new Date()));
			} catch (final Throwable t) {
				// do nothing
			}
		}
	}

	public final void addListener(final TaskListener listener) {
		listeners.add(listener);
	}

	public final void removeListener(final TaskListener listener) {
		listeners.remove(listener);
	}

}
