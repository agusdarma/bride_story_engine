package com.myproject.bride.lib.mapper;

import com.myproject.bride.lib.data.LoginDataVO;
import com.myproject.bride.lib.entity.UserData;

public interface UserDataMapper {

	public UserData findUserDataByEmail(LoginDataVO loginDataVO);
	
	public int updateUserData(UserData userData);
	
	public int createUserData(UserData userData);

}
