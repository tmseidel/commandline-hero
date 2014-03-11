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
import org.remus.mediaexeutor.data.Meta;
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
	
	private static Meta meta; 
	
	static {
		meta = new Meta();
		meta.setId("ffmpeg_rotate");
		meta.setProgram("ffmpeg");
		meta.setFunction("rotate");
		meta.setDoc("Rotates a video.");
		meta.setDocUrl("http://www.mediaserver/commands/ffmpeg_rotate.htm");
		meta.addInputParameter("in","The input file");
		meta.addInputParameter("rotationType","Possible rotations:		<ul>			<li>0 = 90CounterCLockwise and Vertical Flip (default)</li>			<li>1 = 90Clockwise</li>			<li>2 = 90CounterClockwise</li>			<li>3 = 90Clockwise and Vertical Flip</li>		</ul>");
		meta.addInputParameter("out","The output path");
	}
		
	
	public Ffmpeg_Rotate(final Arguments createArguments) {
		super(createArguments);
	}
	
	public static Meta getMeta() {
		return meta;
	}
	
	public static Ffmpeg_Rotate create(final String in,
	final String rotationType,
	final String out
	) {
		return new Ffmpeg_Rotate(createArguments(in,
		rotationType,
		out
		));
	}
	private static Arguments createArguments(final String in,
	final String rotationType,
	final String out
	) {
		final Arguments arguments = new Arguments();
		return arguments
		.add("in", in)
		.add("rotationType", rotationType)
		.add("out", out)
				;
	}
	public boolean checkArguments() {
		boolean valid = true;
		
		valid &= checkArgument(arguments.get("in"), ParamDataType.PATH,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("rotationType"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		valid &= checkArgument(arguments.get("out"), ParamDataType.PATH,
				ParamType.OUTPUT);
		if (!valid) {
			return false;
		}
		return true;
	}
	
	@Override
	protected int internalExecute() throws IOException {
		LOGGER.info("Starting execution with arguments: " + arguments);
		final String in = arguments.get("in");
		final String rotationType = arguments.get("rotationType");
		final String out = arguments.get("out");
		final CommandLine cmd = new CommandLine("ffmpeg");
		cmd.addArgument("-i");
		cmd.addArgument(in);
		cmd.addArgument("-vf");
		cmd.addArgument("\"transpose="+rotationType+"\"");
		cmd.addArgument(out);
		final DefaultExecutor executor = new DefaultExecutor();
		LOGGER.info("About to execute: " + cmd);
		executor.setStreamHandler(new PumpStreamHandler(getProcessStream(),
				getErrorStream()));
		int execute;
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
	public List<ResultDataElement> getOutputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("out",arguments.get("out"),
				ParamDataType.PATH, "The output path"));
		return returnValue;
	}
	
	@Override
	public List<ResultDataElement> getInputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("in",arguments.get("in"),
				ParamDataType.PATH, "The input file"));
		returnValue.add(new ResultDataElement("rotationType",arguments.get("rotationType"),
				ParamDataType.STRING, "Possible rotations:		<ul>			<li>0 = 90CounterCLockwise and Vertical Flip (default)</li>			<li>1 = 90Clockwise</li>			<li>2 = 90CounterClockwise</li>			<li>3 = 90Clockwise and Vertical Flip</li>		</ul>"));
		return returnValue;
	}
	
}
