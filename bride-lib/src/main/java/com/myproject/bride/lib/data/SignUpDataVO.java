package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SignUpDataVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
