package com.myproject.bride.lib.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myproject.bride.lib.entity.City;

public interface CityMapper {
	
	public List<City> getListCityByCountry(@Param("countryId") int countryId);
	
}
