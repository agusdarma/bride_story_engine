package com.myproject.bride.lib.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bride.lib.entity.Category;
import com.myproject.bride.lib.mapper.CategoryMapper;

@Service
public class MasterService {
	private static final Logger LOG = LoggerFactory
			.getLogger(MasterService.class);

	@Autowired
	private CategoryMapper categoryMapper;

	public List<Category> getListCategories() throws BrideEngineException {
		LOG.debug("process GetListCategories");
		List<Category> listCategories = categoryMapper.getListCategories();		
		return listCategories;

	}

}