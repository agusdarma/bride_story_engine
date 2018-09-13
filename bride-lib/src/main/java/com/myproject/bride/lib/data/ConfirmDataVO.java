package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ConfirmDataVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String image;
	private String email;
	private int bookingId;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	

}
