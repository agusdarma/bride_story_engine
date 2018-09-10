package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BookingParamVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String email;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
