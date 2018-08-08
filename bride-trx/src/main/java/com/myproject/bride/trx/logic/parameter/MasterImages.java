package com.myproject.bride.trx.logic.parameter;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.service.MasterService;
import com.myproject.bride.trx.logic.BaseQueryLogic;

public class MasterImages implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory.getLogger(MasterImages.class);
	
	@Autowired
	private MasterService masterService;

	@Override
	public File process(HttpServletRequest request,HttpServletResponse response,String data, ObjectMapper mapper, String pathInfo) {
		LOG.debug("Start process Query :"+pathInfo);		
		File result = null;
		try {						
			result = new File("D://lake.jpg");
		} catch (Exception e) {
			LOG.error("Unexpected exception when processing " + pathInfo, e);
		}
		return result;
	}

}
