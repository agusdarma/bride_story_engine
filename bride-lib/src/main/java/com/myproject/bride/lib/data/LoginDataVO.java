package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LoginDataVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	private String sessionData;
	private long sessionDate;
	private int timeOutLoginSetting;	
	private int userType;

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

	public String getSessionData() {
		return sessionData;
	}

	public void setSessionData(String sessionData) {
		this.sessionData = sessionData;
	}

	public long getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(long sessionDate) {
		this.sessionDate = sessionDate;
	}

	public int getTimeOutLoginSetting() {
		return timeOutLoginSetting;
	}

	public void setTimeOutLoginSetting(int timeOutLoginSetting) {
		this.timeOutLoginSetting = timeOutLoginSetting;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	

	

}
