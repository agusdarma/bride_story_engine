package com.myproject.bride.lib.mapper;

import java.util.List;

import com.myproject.bride.lib.data.BookingDateVO;
import com.myproject.bride.lib.data.BookingParamVO;
import com.myproject.bride.lib.data.ResultMyBookingVO;
import com.myproject.bride.lib.entity.BookingDate;

public interface BookingDateMapper {
	
	public int createBookingDate(BookingDateVO bookingDateVO);
	
	public int updateBookingDate(BookingDateVO bookingDateVO);
	
	public BookingDate findBookingDateByParam(BookingDateVO bookingDateVO);
	
	public List<ResultMyBookingVO> getListMyBooking(BookingParamVO bookingParamVO);
	
}
