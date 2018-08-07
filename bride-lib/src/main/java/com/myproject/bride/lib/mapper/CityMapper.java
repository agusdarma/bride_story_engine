package com.myproject.bride.lib.mapper;

import java.util.List;

import com.myproject.bride.lib.data.CityParamVO;
import com.myproject.bride.lib.entity.City;

public interface CityMapper {
	
	public List<City> getListCityByCountry(CityParamVO cityParamVO);
	
}
