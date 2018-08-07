package com.myproject.bride.lib.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myproject.bride.lib.entity.Country;

public interface CountryMapper {
	
	
	public List<Country> getListCountries();
	public List<Country> getListCountryWithParam(@Param("ss") String ss);
	
}
