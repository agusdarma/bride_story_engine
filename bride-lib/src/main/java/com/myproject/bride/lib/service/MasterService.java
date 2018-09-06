package com.myproject.bride.lib.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.bride.lib.data.BookingDateVO;
import com.myproject.bride.lib.data.CityParamVO;
import com.myproject.bride.lib.data.LoginDataVO;
import com.myproject.bride.lib.data.VendorVO;
import com.myproject.bride.lib.data.VenueParamVO;
import com.myproject.bride.lib.data.VenueVO;
import com.myproject.bride.lib.entity.BookingDate;
import com.myproject.bride.lib.entity.Carousel;
import com.myproject.bride.lib.entity.Category;
import com.myproject.bride.lib.entity.City;
import com.myproject.bride.lib.entity.Country;
import com.myproject.bride.lib.entity.UserData;
import com.myproject.bride.lib.mapper.BookingDateMapper;
import com.myproject.bride.lib.mapper.CarouselMapper;
import com.myproject.bride.lib.mapper.CategoryMapper;
import com.myproject.bride.lib.mapper.CityMapper;
import com.myproject.bride.lib.mapper.CountryMapper;
import com.myproject.bride.lib.mapper.UserDataMapper;
import com.myproject.bride.lib.mapper.VendorMapper;
import com.myproject.bride.lib.mapper.VenueMapper;
import com.myproject.bride.lib.utils.CipherUtil;
import com.myproject.bride.lib.utils.WebException;

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
	
	@Autowired
	private VenueMapper venueMapper;
	
	@Autowired
	private BookingDateMapper bookingDateMapper;
	
	@Autowired
	private UserDataMapper userDataMapper;
	
	public LoginDataVO doLogin(LoginDataVO loginDataVO) throws BrideEngineException {
		LOG.debug("process doLogin with param " + loginDataVO);
		UserData userData = userDataMapper.findUserDataByEmail(loginDataVO);
		if(userData == null){	
			throw new BrideEngineException(WebException.NE_USER_DATA_INVALID);
		}
		String plainPass = loginDataVO.getPassword();
		String encPassword = CipherUtil.passwordDigest(userData.getEmail(), plainPass);
		if (!encPassword.equals(userData.getPassword())){			
			throw new BrideEngineException(WebException.NE_USER_DATA_INVALID_PASS);
		} 
		String sessionData = CipherUtil.generateAlphaNumeric(32);
		Date now = new Date();
		userData.setSessionData(sessionData);
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTimeInMillis(now.getTime());
		userData.setSessionOn(now);
		userData.setSessionDate(now.getTime());
		loginDataVO.setSessionData(sessionData);
		loginDataVO.setSessionDate(now.getTime());
		
		int hasil = userDataMapper.updateUserData(userData);
		LOG.debug(hasil + " row affected ");
		loginDataVO.setPassword("");
		
		return loginDataVO;

	}
	
	@Transactional
	public void createUpdateBookingDate(BookingDateVO bookingDateVO) throws BrideEngineException {
		LOG.debug("createUpdateBookingDate : " + bookingDateVO);
		bookingDateVO.setIsDay(0);
		bookingDateVO.setIsNight(0);
		if(1 == bookingDateVO.getTime()){
			bookingDateVO.setIsDay(1);
		}else if(2 == bookingDateVO.getTime()){
			bookingDateVO.setIsNight(1);
		}
		int result;
		BookingDate booVo = bookingDateMapper.findBookingDateByParam(bookingDateVO);
		if(booVo!=null){
			if(booVo.getIsDay() == 1 && bookingDateVO.getIsDay() == 1){
				throw new BrideEngineException(WebException.NE_BOOKING_DUPLICATE);
			}
			if(booVo.getIsNight() == 1 && bookingDateVO.getIsNight() == 1){
				throw new BrideEngineException(WebException.NE_BOOKING_DUPLICATE);
			}
			if(booVo.getIsDay() == 1){
				bookingDateVO.setIsDay(1);
			}
			if(booVo.getIsNight() == 1){
				bookingDateVO.setIsNight(1);
			}
			result = bookingDateMapper.updateBookingDate(bookingDateVO);
			LOG.debug("updateBookingDate success with param : " + bookingDateVO);
		}else{
			result = bookingDateMapper.createBookingDate(bookingDateVO);
			LOG.debug("createBookingDate success with param : " + bookingDateVO);
		}
		
		
		LOG.debug(result +" row affected");				
	}
	
	public List<VenueVO> getListSimilarVenue(VenueParamVO venueParamVO) throws BrideEngineException {
		LOG.debug("process getListSimilarVenue");
		List<VenueVO> listVenues = venueMapper.getListSimilarVenue(venueParamVO);
		return listVenues;

	}
	
	public List<VenueVO> getListVenue(VenueParamVO venueParamVO) throws BrideEngineException {
		LOG.debug("process getListVenue");
		List<VenueVO> listVenues = venueMapper.getListVenue(venueParamVO);
		return listVenues;

	}
	
	public List<VenueVO> GetVenueById(VenueParamVO venueParamVO) throws BrideEngineException {
		LOG.debug("process getVenueById");
		List<VenueVO> listVenues = venueMapper.getVenueById(venueParamVO);
		return listVenues;

	}


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