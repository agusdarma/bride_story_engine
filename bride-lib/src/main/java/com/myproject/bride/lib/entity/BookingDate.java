package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BookingDate implements Serializable {
	private static final long serialVersionUID = 1L;
	 private int id;	 
	 private long bookingDate;
	 private int isDay;
	 private int isNight;
	 private int idVenue;

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

	public long getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(long bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getIsDay() {
		return isDay;
	}

	public void setIsDay(int isDay) {
		this.isDay = isDay;
	}

	public int getIsNight() {
		return isNight;
	}

	public void setIsNight(int isNight) {
		this.isNight = isNight;
	}

	public int getIdVenue() {
		return idVenue;
	}

	public void setIdVenue(int idVenue) {
		this.idVenue = idVenue;
	}

		
}
