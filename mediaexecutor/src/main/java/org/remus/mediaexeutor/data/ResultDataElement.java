/**
 * 
 */
package org.remus.mediaexeutor.data;

/**
 * @author seidelt
 * 
 */
public class ResultDataElement {

	
	public ResultDataElement(final String paramId, final String data, final ParamDataType filepath) {
		super();
		this.paramId = paramId;
		this.data = data;
		paramType = filepath;
	}

	private final String data;

	private final ParamDataType paramType;
	
	private String paramId;


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

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

}
