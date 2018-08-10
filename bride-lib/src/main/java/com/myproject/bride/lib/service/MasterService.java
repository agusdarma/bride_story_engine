package com.myproject.bride.lib.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bride.lib.data.CityParamVO;
import com.myproject.bride.lib.data.VendorVO;
import com.myproject.bride.lib.entity.Carousel;
import com.myproject.bride.lib.entity.Category;
import com.myproject.bride.lib.entity.City;
import com.myproject.bride.lib.entity.Country;
import com.myproject.bride.lib.mapper.CarouselMapper;
import com.myproject.bride.lib.mapper.CategoryMapper;
import com.myproject.bride.lib.mapper.CityMapper;
import com.myproject.bride.lib.mapper.CountryMapper;
import com.myproject.bride.lib.mapper.VendorMapper;

@Service
public class MasterService {
	private static final Logger LOG = LoggerFactory
			.getLogger(MasterService.class);

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private CountryMapper countryMapper;

	@Autowired
	private CityMapper cityMapper;

	@Autowired
	private CarouselMapper carouselMapper;

	@Autowired
	private VendorMapper vendorMapper;

	public List<VendorVO> getListVendor() throws BrideEngineException {
		LOG.debug("process getListVendor");
		List<VendorVO> listVendorVOs = vendorMapper.getListVendor();
		return listVendorVOs;

	}

	public List<Category> getListCategories() throws BrideEngineException {
		LOG.debug("process GetListCategories");
		List<Category> listCategories = categoryMapper.getListCategories();
		return listCategories;

	}

	public List<Country> getListCountries() throws BrideEngineException {
		LOG.debug("process GetListCountries");
		List<Country> listCountries = countryMapper.getListCountries();
		return listCountries;

	}

	public List<Country> getListCountryWithParam(String param)
			throws BrideEngineException {
		LOG.debug("process GetListCountries with param " + param);
		param = param.replace("\n", "").replace("\r", "");
		List<Country> listCountries = countryMapper
				.getListCountryWithParam(param);
		return listCountries;

	}

	public List<City> getListCityByCountry(CityParamVO cityParamVO)
			throws BrideEngineException {
		LOG.debug("process getListCityByCountry with cityParamVO "
				+ cityParamVO);
		List<City> listCities = cityMapper.getListCityByCountry(cityParamVO);
		return listCities;

	}

	public List<Carousel> getListCarousel() throws BrideEngineException {
		LOG.debug("process getListCarousel");
		List<Carousel> listCarousels = carouselMapper.getListCarousel();
		return listCarousels;

	}

}