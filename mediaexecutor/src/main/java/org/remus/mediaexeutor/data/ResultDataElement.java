/**
 * 
 */
package org.remus.mediaexeutor.data;

/**
 * @author seidelt
 * 
 */
public class ResultDataElement {

	public ResultDataElement(final String paramId, final String data,
			final ParamDataType filepath, final String doc) {
		super();
		this.paramId = paramId;
		this.data = data;
		paramType = filepath;
		this.doc = doc;
	}

	private final String data;

	private final ParamDataType paramType;

	private String paramId;

	private final String doc;

	public String getData() {
		return data;
	}

	public ParamDataType getParamType() {
		return paramType;
	}

	@Override
	public String toString() {
		return "ResultDataElement [data=" + data + ", paramType=" + paramType
				+ "]";
	}

	public String getParamId() {
		return paramId;
	}

	public void setParamId(final String paramId) {
		this.paramId = paramId;
	}

	public String getDoc() {
		return doc;
	}

}
