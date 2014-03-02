/**
 * 
 */
package org.remus.mediaexeutor.data;

/**
 * @author seidelt
 * 
 */
public class ResultDataElement {

	public ResultDataElement(final String data, final ParamDataType filepath) {
		super();
		this.data = data;
		paramType = filepath;
	}

	private final String data;

	private final ParamDataType paramType;

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

}
