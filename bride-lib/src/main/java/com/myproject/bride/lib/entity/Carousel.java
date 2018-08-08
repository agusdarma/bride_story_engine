package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Carousel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String imageName;
	private int status;
	private int id;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
