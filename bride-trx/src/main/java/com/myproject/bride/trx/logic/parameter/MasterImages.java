package com.myproject.bride.trx.logic.parameter;

import java.io.File;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.service.ImagesService;
import com.myproject.bride.lib.utils.CommonUtil;
import com.myproject.bride.lib.utils.Constants;
import com.myproject.bride.trx.logic.BaseQueryLogic;

public class MasterImages implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory
			.getLogger(MasterImages.class);

	@Autowired
	private ImagesService imagesService;

	@Override
	public File process(HttpServletRequest request,
			HttpServletResponse response, String data, ObjectMapper mapper,
			String pathInfo) {
		LOG.debug("Start process Query :" + pathInfo);
		HashMap<String, String> param = CommonUtil.parseParameterQuery(request);
		LOG.debug("Parameter Query :" + param);
		File result = null;
		try {
			result = imagesService.getImageByFileName(param
					.get(Constants.KEY_IMAGE_NAME));
		} catch (Exception e) {
			LOG.error("Unexpected exception when processing " + pathInfo, e);
		}
		return result;
	}

}
