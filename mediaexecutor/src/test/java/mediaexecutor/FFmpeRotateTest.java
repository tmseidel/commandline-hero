package mediaexecutor;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.remus.mediaexeutor.base.Executor;
import org.remus.mediaexeutor.data.JobStatus;
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
		final Ffmpeg_Rotate ffmpeg_Rotate2 = Ffmpeg_Rotate.create("2",
				"C:\\Users\\seidelt\\Downloads\\MOV_0631.mp4",
				"C:\\Users\\seidelt\\Downloads\\4_MOV_0631.mp4");
		final Ffmpeg_Rotate ffmpeg_Rotate3 = Ffmpeg_Rotate.create("2",
				"C:\\Users\\seidelt\\Downloads\\MOV_0631.mp4",
				"C:\\Users\\seidelt\\Downloads\\5_MOV_0631.mp4");
		final Ffmpeg_Rotate ffmpeg_Rotate4 = Ffmpeg_Rotate.create("2",
				"C:\\Users\\seidelt\\Downloads\\MOV_0631.mp4",
				"C:\\Users\\seidelt\\Downloads\\6_MOV_0631.mp4");

		final Executor executor = new Executor(2);
		executor.schedule(ffmpeg_Rotate);
		executor.schedule(ffmpeg_Rotate2);
		executor.schedule(ffmpeg_Rotate3);
		executor.schedule(ffmpeg_Rotate4);

		while (executor.findJobsByStatus(JobStatus.FINISHED).size() != 4) {
			System.out.println(executor.findJobsByStatus(JobStatus.FINISHED));
			Thread.sleep(2000);
		}
	}

}
