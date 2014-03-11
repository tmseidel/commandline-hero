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
public class Graphicksmagick_ResizeAbsolute extends ExecutionInstruction {
	private final Logger LOGGER = Logger.getLogger(Graphicksmagick_ResizeAbsolute.class);
	
	private static Meta meta; 
	
	static {
		meta = new Meta();
		meta.setId("graphicksmagick_resizeabsolute");
		meta.setProgram("graphicksmagick");
		meta.setFunction("resizeAbsolute");
		meta.setDoc("Converts an image from one filetype to another");
		meta.setDocUrl("http://cutycapt.sourceforge.net/");
		meta.setClassName(Graphicksmagick_ResizeAbsolute.class.getName());
		meta.addInputParameter("in","The input image");
		meta.addInputParameter("width","The new width in pixels");
		meta.addOutputParameter("out","The output name of the image");
	}
		
	
	public Graphicksmagick_ResizeAbsolute(final Arguments createArguments) {
		super(createArguments);
	}
	
	public static Meta getMeta() {
		return meta;
	}
	
	public static Graphicksmagick_ResizeAbsolute create(final String in,
	final String width,
	final String out
	) {
		return new Graphicksmagick_ResizeAbsolute(createArguments(in,
		width,
		out
		));
	}
	private static Arguments createArguments(final String in,
	final String width,
	final String out
	) {
		final Arguments arguments = new Arguments();
		return arguments
		.add("in", in)
		.add("width", width)
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
		
		valid &= checkArgument(arguments.get("width"), ParamDataType.STRING,
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
		final String width = arguments.get("width");
		final String out = arguments.get("out");
		final CommandLine cmd = new CommandLine("gm");
		cmd.addArgument("convert");
		cmd.addArgument("-scale");
		cmd.addArgument(width);
		cmd.addArgument(in);
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
				ParamDataType.PATH, "The output name of the image"));
		return returnValue;
	}
	
	@Override
	public List<ResultDataElement> getInputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("in",arguments.get("in"),
				ParamDataType.PATH, "The input image"));
		returnValue.add(new ResultDataElement("width",arguments.get("width"),
				ParamDataType.STRING, "The new width in pixels"));
		return returnValue;
	}
	
}
