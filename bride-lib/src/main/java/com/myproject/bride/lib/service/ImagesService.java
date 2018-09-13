package com.myproject.bride.lib.service;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.myproject.bride.lib.data.ConfirmDataVO;
import com.myproject.bride.lib.utils.CommonUtil;

@Service
public class ImagesService {
	private static final Logger LOG = LoggerFactory
			.getLogger(ImagesService.class);

	private String pathName = "";

	public String confirmBookingProcess(ConfirmDataVO confirmDataVO)
			throws BrideEngineException, IOException {
		LOG.debug("process createFileToServer with byte {} ", new String(
				confirmDataVO.getImage()));
		byte[] decodedBytes = Base64.getDecoder().decode(
				confirmDataVO.getImage());
		Date now = new Date();
		String fileName = CommonUtil.displayFileName(now) + "_"
				+ confirmDataVO.getBookingId() + ".jpg";
		String pathFull = pathName + fileName;

		FileUtils.writeByteArrayToFile(new File(pathFull), decodedBytes);
		LOG.debug("create file success");
		return fileName;
	}

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