package com.myproject.bride.lib.mapper;

import java.util.List;

import com.myproject.bride.lib.data.VenueParamVO;
import com.myproject.bride.lib.data.VenueVO;

public interface VenueMapper {
	
	
	public List<VenueVO> getListVenue(VenueParamVO venueParamVO);
	
}
