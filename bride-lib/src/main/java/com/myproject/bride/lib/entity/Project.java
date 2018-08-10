package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String urlImageProject;
	private String titleProject;
	private int vendorId;
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
	public String getUrlImageProject() {
		return urlImageProject;
	}
	public void setUrlImageProject(String urlImageProject) {
		this.urlImageProject = urlImageProject;
	}
	public String getTitleProject() {
		return titleProject;
	}
	public void setTitleProject(String titleProject) {
		this.titleProject = titleProject;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	

}
