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
public class Graphicksmagick_DrawText extends ExecutionInstruction {
	private final Logger LOGGER = Logger.getLogger(Graphicksmagick_DrawText.class);
	
	private static Meta meta; 
	
	static {
		meta = new Meta();
		meta.setId("graphicksmagick_drawtext");
		meta.setProgram("graphicksmagick");
		meta.setFunction("drawText");
		meta.setDoc("Draws text to a certain position");
		meta.setDocUrl("");
		meta.setClassName(Graphicksmagick_DrawText.class.getName());
		meta.addInputParameter("x","The x position (positive Integer)");
		meta.addInputParameter("y","The y position (positive Integer)");
		meta.addInputParameter("text","The text");
		meta.addInputParameter("color","The color of the text");
		meta.addInputParameter("fontsize","The size of the text");
		meta.addInputParameter("file","The input file");
		meta.addOutputParameter("out","The resulting output");
	}
		
	
	public Graphicksmagick_DrawText(final Arguments createArguments) {
		super(createArguments);
	}
	
	public static Meta getMeta() {
		return meta;
	}
	
	public static Graphicksmagick_DrawText create(final String x,
	final String y,
	final String text,
	final String color,
	final String fontsize,
	final String file,
	final String out
	) {
		return new Graphicksmagick_DrawText(createArguments(x,
		y,
		text,
		color,
		fontsize,
		file,
		out
		));
	}
	private static Arguments createArguments(final String x,
	final String y,
	final String text,
	final String color,
	final String fontsize,
	final String file,
	final String out
	) {
		final Arguments arguments = new Arguments();
		return arguments
		.add("x", x)
		.add("y", y)
		.add("text", text)
		.add("color", color)
		.add("fontsize", fontsize)
		.add("file", file)
		.add("out", out)
				;
	}
	public boolean checkArguments() {
		boolean valid = true;
		
		valid &= checkArgument(arguments.get("x"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("y"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("text"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("color"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("fontsize"), ParamDataType.STRING,
				ParamType.INPUT);
		if (!valid) {
			return false;
		}
		
		valid &= checkArgument(arguments.get("file"), ParamDataType.PATH,
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
		final String x = arguments.get("x");
		final String y = arguments.get("y");
		final String text = arguments.get("text");
		final String color = arguments.get("color");
		final String fontsize = arguments.get("fontsize");
		final String file = arguments.get("file");
		final String out = arguments.get("out");
		final CommandLine cmd = new CommandLine("gm");
		cmd.addArgument("convert");
		cmd.addArgument("-font");
		cmd.addArgument("Arial");
		cmd.addArgument("-fill");
		cmd.addArgument(color);
		cmd.addArgument("-pointsize");
		cmd.addArgument(fontsize);
		cmd.addArgument("-draw");
		cmd.addArgument("\"text "+x+","+y+" \'"+text+"\'\"");
		cmd.addArgument(file);
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
				ParamDataType.PATH, "The resulting output"));
		return returnValue;
	}
	
	@Override
	public List<ResultDataElement> getInputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("x",arguments.get("x"),
				ParamDataType.STRING, "The x position (positive Integer)"));
		returnValue.add(new ResultDataElement("y",arguments.get("y"),
				ParamDataType.STRING, "The y position (positive Integer)"));
		returnValue.add(new ResultDataElement("text",arguments.get("text"),
				ParamDataType.STRING, "The text"));
		returnValue.add(new ResultDataElement("color",arguments.get("color"),
				ParamDataType.STRING, "The color of the text"));
		returnValue.add(new ResultDataElement("fontsize",arguments.get("fontsize"),
				ParamDataType.STRING, "The size of the text"));
		returnValue.add(new ResultDataElement("file",arguments.get("file"),
				ParamDataType.PATH, "The input file"));
		return returnValue;
	}
	
}
