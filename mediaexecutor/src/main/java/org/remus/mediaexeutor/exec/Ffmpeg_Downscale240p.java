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
public class Ffmpeg_Downscale240p extends ExecutionInstruction {
	private final Logger LOGGER = Logger.getLogger(Ffmpeg_Downscale240p.class);
	
	private static Meta meta; 
	
	static {
		meta = new Meta();
		meta.setId("ffmpeg_downscale240p");
		meta.setProgram("ffmpeg");
		meta.setFunction("downscale240p");
		meta.setDoc("Downscales a 16:9 video to 240p");
		meta.setDocUrl("");
		meta.addInputParameter("in","The source video file");
		meta.addInputParameter("out","The video output");
	}
		
	
	public Ffmpeg_Downscale240p(final Arguments createArguments) {
		super(createArguments);
	}
	
	public static Meta getMeta() {
		return meta;
	}
	
	public static Ffmpeg_Downscale240p create(final String in,
	final String out
	) {
		return new Ffmpeg_Downscale240p(createArguments(in,
		out
		));
	}
	private static Arguments createArguments(final String in,
	final String out
	) {
		final Arguments arguments = new Arguments();
		return arguments
		.add("in", in)
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
		final String out = arguments.get("out");
		final CommandLine cmd = new CommandLine("ffmpeg");
		cmd.addArgument("-i");
		cmd.addArgument(in);
		cmd.addArgument("-filter:v");
		cmd.addArgument("scale=400:240");
		cmd.addArgument("-sws_flags");
		cmd.addArgument("lanczos");
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
				ParamDataType.PATH, "The video output"));
		return returnValue;
	}
	
	@Override
	public List<ResultDataElement> getInputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("in",arguments.get("in"),
				ParamDataType.PATH, "The source video file"));
		return returnValue;
	}
	
}
