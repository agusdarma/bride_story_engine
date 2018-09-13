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
	private String namaPernikahan;
	private String namaPenanggungJawab1;
	private String handPhone1;
	private String namaPenanggungJawab2;
	private String handPhone2;
	private String userEmailBooking;
	private int status;
	private Date createdOn;
	private String createdBy;
	private Date updatedOn;
	private String updatedBy;
	private String fileNameImage;
		

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

	public String getNamaPernikahan() {
		return namaPernikahan;
	}

	public void setNamaPernikahan(String namaPernikahan) {
		this.namaPernikahan = namaPernikahan;
	}

	public String getNamaPenanggungJawab1() {
		return namaPenanggungJawab1;
	}

	public void setNamaPenanggungJawab1(String namaPenanggungJawab1) {
		this.namaPenanggungJawab1 = namaPenanggungJawab1;
	}

	public String getHandPhone1() {
		return handPhone1;
	}

	public void setHandPhone1(String handPhone1) {
		this.handPhone1 = handPhone1;
	}

	public String getNamaPenanggungJawab2() {
		return namaPenanggungJawab2;
	}

	public void setNamaPenanggungJawab2(String namaPenanggungJawab2) {
		this.namaPenanggungJawab2 = namaPenanggungJawab2;
	}

	public String getHandPhone2() {
		return handPhone2;
	}

	public void setHandPhone2(String handPhone2) {
		this.handPhone2 = handPhone2;
	}

	public String getUserEmailBooking() {
		return userEmailBooking;
	}

	public void setUserEmailBooking(String userEmailBooking) {
		this.userEmailBooking = userEmailBooking;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getFileNameImage() {
		return fileNameImage;
	}

	public void setFileNameImage(String fileNameImage) {
		this.fileNameImage = fileNameImage;
	}

}
