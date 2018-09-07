package com.myproject.bride.lib.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ResultMyBookingVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private BookingDateVO bookingDateVO;
	private VenueVO venueVO;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public BookingDateVO getBookingDateVO() {
		return bookingDateVO;
	}

	public void setBookingDateVO(BookingDateVO bookingDateVO) {
		this.bookingDateVO = bookingDateVO;
	}

	public VenueVO getVenueVO() {
		return venueVO;
	}

	public void setVenueVO(VenueVO venueVO) {
		this.venueVO = venueVO;
	}

	

}
