package com.myproject.bride.lib.data;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BookingDateVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private Date dateTime;
	private int time;
	// 1 day, 2 night
	private int idVenue;
	private int isDay;
	private int isNight;
	private long dateTimeMilisecond;

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

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getIdVenue() {
		return idVenue;
	}

	public void setIdVenue(int idVenue) {
		this.idVenue = idVenue;
	}

	

	public long getDateTimeMilisecond() {
		return dateTimeMilisecond;
	}

	public void setDateTimeMilisecond(long dateTimeMilisecond) {
		this.dateTimeMilisecond = dateTimeMilisecond;
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

}
