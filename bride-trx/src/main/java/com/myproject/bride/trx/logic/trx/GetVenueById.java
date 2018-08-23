package com.myproject.bride.trx.logic.trx;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.data.VenueParamVO;
import com.myproject.bride.lib.data.VenueVO;
import com.myproject.bride.lib.service.BrideEngineException;
import com.myproject.bride.lib.service.MasterService;
import com.myproject.bride.lib.utils.MessageUtils;
import com.myproject.bride.trx.logic.BaseQueryLogic;

public class GetVenueById implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory.getLogger(GetVenueById.class);
	
	@Autowired
	private MasterService masterService;

	@Override
	public String process(HttpServletRequest request,HttpServletResponse response,String data, ObjectMapper mapper, String pathInfo) {
		LOG.debug("Start process Query :"+pathInfo);		
		String result = "";
		try {						
			VenueParamVO venueParamVO = mapper.readValue(data, VenueParamVO.class);
//			Calendar calendar = Calendar.getInstance();
//			calendar.setTimeInMillis(venueParamVO.getBookingDate());
//			Date bookingDate = calendar.getTime();
//			LOG.debug("Parameter BookingDate :"+bookingDate);
			LOG.debug("Parameter venueParamVO :"+venueParamVO);
			List<VenueVO> listVenues =  masterService.GetVenueById(venueParamVO);
			String x = mapper.writeValueAsString(listVenues);
			result = MessageUtils.handleSuccess(x, mapper);
		} catch (BrideEngineException e) {
			LOG.error("BrideEngineException when processing " + pathInfo, e);
			result = MessageUtils.handleException(e, "", mapper);
		} catch (Exception e) {
			LOG.error("Unexpected exception when processing " + pathInfo, e);
			result = MessageUtils.handleException(e, "Unexpected exception when processing "+ e.getMessage(), mapper);
		}
		return result;
	}

}
