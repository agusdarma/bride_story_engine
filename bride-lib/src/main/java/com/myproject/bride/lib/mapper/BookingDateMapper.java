package com.myproject.bride.lib.mapper;

import com.myproject.bride.lib.data.BookingDateVO;
import com.myproject.bride.lib.entity.BookingDate;

public interface BookingDateMapper {
	
	public int createBookingDate(BookingDateVO bookingDateVO);
	
	public int updateBookingDate(BookingDateVO bookingDateVO);
	
	public BookingDate findBookingDateByParam(BookingDateVO bookingDateVO);
	
}
