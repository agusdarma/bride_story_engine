package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Country implements Serializable {
	private static final long serialVersionUID = 1L;
	private String countryName;
	private boolean selected;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	

}
