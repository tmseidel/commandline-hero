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
public class Cutycapt_MakeWebShot extends ExecutionInstruction {
	private final Logger LOGGER = Logger.getLogger(Cutycapt_MakeWebShot.class);
	
	private static Meta meta; 
	
	static {
		meta = new Meta();
		meta.setId("cutycapt_makewebshot");
		meta.setProgram("cutycapt");
		meta.setFunction("makeWebShot");
		meta.setDoc("Makes a screenshot of a website.");
		meta.setDocUrl("http://cutycapt.sourceforge.net/");
		meta.setClassName(Cutycapt_MakeWebShot.class.getName());
		meta.addInputParameter("url","The url to grab");
		meta.addOutputParameter("out","The output path to the image");
	}
		
	
	public Cutycapt_MakeWebShot(final Arguments createArguments) {
		super(createArguments);
	}
	
	public static Meta getMeta() {
		return meta;
	}
	
	public static Cutycapt_MakeWebShot create(final String url,
	final String out
	) {
		return new Cutycapt_MakeWebShot(createArguments(url,
		out
		));
	}
	private static Arguments createArguments(final String url,
	final String out
	) {
		final Arguments arguments = new Arguments();
		return arguments
		.add("url", url)
		.add("out", out)
				;
	}
	public boolean checkArguments() {
		boolean valid = true;
		
		valid &= checkArgument(arguments.get("url"), ParamDataType.STRING,
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
		final String url = arguments.get("url");
		final String out = arguments.get("out");
		final CommandLine cmd = new CommandLine("CutyCapt");
		cmd.addArgument("--url="+url);
		cmd.addArgument("--out="+out);
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
				ParamDataType.PATH, "The output path to the image"));
		return returnValue;
	}
	
	@Override
	public List<ResultDataElement> getInputElements() {
		final List<ResultDataElement> returnValue = new ArrayList<ResultDataElement>();
		returnValue.add(new ResultDataElement("url",arguments.get("url"),
				ParamDataType.STRING, "The url to grab"));
		return returnValue;
	}
	
}
