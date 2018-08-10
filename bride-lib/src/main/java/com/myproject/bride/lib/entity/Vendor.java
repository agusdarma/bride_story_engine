package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String urlProfileImage;
	private String vendorName;
	private String countReviews;
	private String categoryName;
	private int categoryId;
	private String cityName;
	private int cityId;
	private int status;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
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

	public String getUrlProfileImage() {
		return urlProfileImage;
	}

	public void setUrlProfileImage(String urlProfileImage) {
		this.urlProfileImage = urlProfileImage;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCountReviews() {
		return countReviews;
	}

	public void setCountReviews(String countReviews) {
		this.countReviews = countReviews;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
