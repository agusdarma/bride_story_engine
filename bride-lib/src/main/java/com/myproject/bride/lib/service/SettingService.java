package com.myproject.bride.lib.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bride.lib.entity.SystemSetting;
import com.myproject.bride.lib.mapper.SystemSettingMapper;

@Service
public class SettingService {
	private static final Logger LOG = LoggerFactory
			.getLogger(SettingService.class);
	
	@Autowired
	private SystemSettingMapper systemSettingMapper;

	public SystemSetting getSettingById(int id) throws BrideEngineException {
		LOG.debug("process getSettingById with id " + id);
		SystemSetting setting = systemSettingMapper.getSettingById(id);
		return setting;
	}

}