package com.myproject.bride.lib.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private String password;
	private String sessionData;
	private long sessionDate;
	private Date sessionOn;
	private int userType;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getSessionOn() {
		return sessionOn;
	}

	public void setSessionOn(Date sessionOn) {
		this.sessionOn = sessionOn;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

}
