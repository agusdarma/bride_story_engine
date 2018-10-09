package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VenueParamVO extends LoginDataVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private int categoryId;
	private String categoryName;
	private String countryName;
	private int countryId;
	private String cityName;
	private int cityId;
	private int idVenue;
	private long bookingDate;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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

	public long getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(long bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getIdVenue() {
		return idVenue;
	}

	public void setIdVenue(int idVenue) {
		this.idVenue = idVenue;
	}

	
}
