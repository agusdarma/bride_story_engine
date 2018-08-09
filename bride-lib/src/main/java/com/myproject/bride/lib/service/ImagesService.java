package com.myproject.bride.lib.service;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ImagesService {
	private static final Logger LOG = LoggerFactory
			.getLogger(ImagesService.class);

	private String pathName = "";

	public File getImageByFileName(String fileName) throws BrideEngineException {
		LOG.debug("process getImageByFileName with name {} ", new String(
				fileName));
		File result = null;
		try {
			String pathFull = pathName + fileName;
			LOG.debug("get image from {} ", new String(pathFull));
			result = new File(pathFull);
		} catch (Exception e) {
			LOG.error("Unexpected exception when processing getImageByFileName "
					+ e);
		}
		return result;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

}