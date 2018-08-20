package com.myproject.bride.lib.data;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.myproject.bride.lib.entity.BookingDate;
import com.myproject.bride.lib.entity.Venue;

public class VenueVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Venue venue;
	private List<BookingDate> listBookingDates;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public List<BookingDate> getListBookingDates() {
		return listBookingDates;
	}

	public void setListBookingDates(List<BookingDate> listBookingDates) {
		this.listBookingDates = listBookingDates;
	}

}
