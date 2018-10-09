package com.myproject.bride.trx.logic.trx;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.data.LoginDataVO;
import com.myproject.bride.lib.data.ResultMyBookingVO;
import com.myproject.bride.lib.service.BrideEngineException;
import com.myproject.bride.lib.service.MasterService;
import com.myproject.bride.lib.utils.MessageUtils;
import com.myproject.bride.trx.logic.BaseQueryLogic;

public class GetListPaymentByUser implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory.getLogger(GetListPaymentByUser.class);
	
	@Autowired
	private MasterService masterService;

	@Override
	public String process(HttpServletRequest request,HttpServletResponse response,String data, ObjectMapper mapper, String pathInfo) {
		LOG.debug("Start process Query :"+pathInfo);		
		String result = "";
		try {						
			LoginDataVO loginDataVO = mapper.readValue(data, LoginDataVO.class);			
			LOG.debug("Parameter loginDataVO :"+loginDataVO);
			List<ResultMyBookingVO> listPayment =  masterService.getListPaymentByUser(loginDataVO);
			String x = mapper.writeValueAsString(listPayment);
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
