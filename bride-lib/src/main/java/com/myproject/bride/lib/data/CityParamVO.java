package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CityParamVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String countryId;
	private String param;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
}
