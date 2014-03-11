package org.remus.mediaexeutor.data;

import java.util.HashMap;
import java.util.Map;

public class Meta {

	private String id;

	private String program;

	private String function;

	private String doc;

	private String docUrl;

	private String className;

	private final Map<String, String> inputParameter = new HashMap<String, String>();

	private final Map<String, String> outputParameter = new HashMap<String, String>();

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(final String program) {
		this.program = program;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(final String function) {
		this.function = function;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(final String doc) {
		this.doc = doc;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(final String docUrl) {
		this.docUrl = docUrl;
	}

	public void addInputParameter(final String key, final String value) {
		inputParameter.put(key, value);
	}

	public void addOutputParameter(final String key, final String value) {
		outputParameter.put(key, value);
	}

	public Map<String, String> getInputParameter() {
		return inputParameter;
	}

	public Map<String, String> getOutputParameter() {
		return outputParameter;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(final String className) {
		this.className = className;
	}

}
