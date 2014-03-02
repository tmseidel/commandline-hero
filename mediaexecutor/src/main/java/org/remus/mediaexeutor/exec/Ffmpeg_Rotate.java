package org.remus.mediaexeutor.exec;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.log4j.Logger;
import org.remus.mediaexeutor.base.Arguments;
import org.remus.mediaexeutor.base.ExecutionInstruction;
import org.remus.mediaexeutor.data.ParamDataType;
import org.remus.mediaexeutor.data.ParamType;
import org.remus.mediaexeutor.data.ResultDataElement;

/**
 * 
 * WARNING: This class is generated code. Please do not modify its content.
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
 * 
 * 
 */
public class Ffmpeg_Rotate extends ExecutionInstruction {

	private final Logger LOGGER = Logger.getLogger(Ffmpeg_Rotate.class);

	public Ffmpeg_Rotate(final Arguments createArguments) {
		super(createArguments);
	}

	public static Ffmpeg_Rotate create(final String rotationType,
			final String in, final String out) {
		return new Ffmpeg_Rotate(createArguments(rotationType, in, out));
	}

	private static Arguments createArguments(final String rotationType,
			final String in, final String out) {
		final Arguments arguments = new Arguments();
		return arguments.add("rotationType", rotationType).add("in", in)
				.add("out", out);
	}

	@Override
	public boolean checkInputArgumentsBeforeExecution() {
		boolean valid = true;
		valid &= checkArgument(arguments.get("in"), ParamDataType.FILEPATH,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		valid &= checkArgument(arguments.get("out"), ParamDataType.FILEPATH,
				ParamType.OUTPUT);
		if (!valid) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkOutputArgumentsAfterExecution() {
		boolean valid = true;
		valid &= checkArgument(arguments.get("out"), ParamDataType.FILEPATH,
				ParamType.OUTPUT);
		if (!valid) {
			return false;
		}
		return true;
	}

	@Override
	protected int internalExecute() throws IOException {
		LOGGER.info("Starting execution with arguments: " + arguments);
		final String rotationType = arguments.get("rotationType");
		final String in = arguments.get("in");
		final String out = arguments.get("out");

		final CommandLine cmd = new CommandLine("ffmpeg");
		cmd.addArgument("-i").addArgument(in);
		cmd.addArgument("-vf")
				.addArgument("\"transpose=" + rotationType + "\"");
		cmd.addArgument(out);

		final DefaultExecutor executor = new DefaultExecutor();
		LOGGER.info("About to execute: " + cmd);
		executor.setStreamHandler(new PumpStreamHandler(getProcessStream(),
				getErrorStream()));
		final int execute;
		try {
			execute = executor.execute(cmd);
			LOGGER.info(MessageFormat.format(
					"Execution finished with Code {0}", execute));
		} catch (final IOException e) {
			LOGGER.error(e);
			throw e;
		}
		return execute;
	}

	@Override
	public String getDoc() {
		return "Rotates a video: Possible rotationtypes: \r\n"
				+ "				0 = 90CounterCLockwise and Vertical Flip (default),\r\n"
				+ "				1 = 90Clockwise\r\n" + "				2 = 90CounterClockwise\r\n"
				+ "				3 = 90Clockwise and Vertical Flip";
	}

	@Override
	public String getId() {
		return "ffmpeg_rotate";
	}

	@Override
	protected List<ResultDataElement> getOutputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement(arguments.get("out"),
				ParamDataType.FILEPATH));
		return returnValue;
	}

}
