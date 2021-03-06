package com.myproject.bride.trx.logic.trx;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.data.ConfirmDataVO;
import com.myproject.bride.lib.service.BrideEngineException;
import com.myproject.bride.lib.service.MasterService;
import com.myproject.bride.lib.utils.MessageUtils;
import com.myproject.bride.trx.logic.BaseQueryLogic;


public class UploadImages implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory.getLogger(UploadImages.class);
	
	@Autowired
	private MasterService masterService;

	
	@Override
	public String process(HttpServletRequest request,HttpServletResponse response,String data, ObjectMapper mapper, String pathInfo) {
		LOG.debug("Start process Query :"+pathInfo);		
		String result = "";		
		try {						
			ConfirmDataVO confirmDataVO = mapper.readValue(data, ConfirmDataVO.class);
			LOG.debug("Parameter confirmDataVO :"+confirmDataVO);
			masterService.confirmBooking(confirmDataVO);
//			String x = mapper.writeValueAsString(loginDataVO);
			result = MessageUtils.handleSuccess("Konfirmasi Berhasil", mapper);
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
