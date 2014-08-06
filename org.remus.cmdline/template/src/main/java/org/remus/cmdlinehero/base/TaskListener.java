/**
 * 
 */
package org.remus.cmdlinehero.base;

/**
 * @author seidelt
 * 
 */
public interface TaskListener {

	void taskStarted(final TaskChangeEvent e);

	void taskScheduled(final TaskChangeEvent e);

	void taskFinished(final TaskChangeEvent e);

}
