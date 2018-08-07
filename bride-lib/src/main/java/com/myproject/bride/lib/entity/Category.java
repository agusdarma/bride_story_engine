package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private String categoryName;
	private int categoryId;
	private boolean selected;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
