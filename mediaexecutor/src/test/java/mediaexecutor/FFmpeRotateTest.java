package mediaexecutor;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.remus.mediaexeutor.base.Executor;
import org.remus.mediaexeutor.base.IStatus;
import org.remus.mediaexeutor.base.TaskChangeEvent;
import org.remus.mediaexeutor.base.TaskListener;
import org.remus.mediaexeutor.exec.Ffmpeg_Rotate;

public class FFmpeRotateTest {

	// @Test
	// public void testExecuteFfmpeg_Rotate_Arguments()
	// throws InterruptedException, ExecutionException {
	// final Ffmpeg_Rotate ffmpeg_Rotate = Ffmpeg_Rotate.create("2",
	// "C:\\Users\\seidelt\\Downloads\\MOV_0631.mp4",
	// "C:\\Users\\seidelt\\Downloads\\1_MOV_0631.mp4");
	//
	// final ExecutorService executor = Executors.newSingleThreadExecutor();
	// final Future<Result> future = executor.submit(ffmpeg_Rotate);
	// final Result iStatus = future.get();
	//
	// System.out.println(iStatus);
	// }

	@Test
	public void testExecuteFfmpeg_Rotate_Arguments2()
			throws InterruptedException, ExecutionException {
		final Ffmpeg_Rotate ffmpeg_Rotate = Ffmpeg_Rotate.create("2",
				"C:\\Users\\seidelt\\Downloads\\MOV_0631.mp4",
				"C:\\Users\\seidelt\\Downloads\\2_MOV_0631.mp4");

		final Executor executor = new Executor(2);
		executor.schedule(ffmpeg_Rotate);
		final boolean[] terminate = { false };
		executor.addListener(new TaskListener() {

			public void taskStarted(final TaskChangeEvent e) {
				System.out.println("STARTED " + e.getExecutionInstruction());

			}

			public void taskScheduled(final TaskChangeEvent e) {
				// TODO Auto-generated method stub

			}

			public void taskFinished(final TaskChangeEvent e) {
				System.out.println(e.getExecutionInstruction());
				final IStatus status = e.getExecutionInstruction()
						.getExecutionStatus();
				terminate[0] = true;
			}
		});

		while (!terminate[0]) {
			Thread.sleep(2000);
		}
	}

}
