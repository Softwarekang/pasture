package cn.e3mall.service;

import cn.e3mall.until.PastureResult;

public interface UserService {
	PastureResult login(String userName, String passWord);
	PastureResult register(String userName,String passWord,String manlocation,String phoneNumber);
	PastureResult getUserByUserName(String userName);
	PastureResult getUserById(String id);
	PastureResult getAllUser();
	PastureResult getUserByManLocation(String manLocation);
	PastureResult updateUserInfo(String id,String userName,String passWord,String manlocation,String phoneNumber);
	PastureResult deleteUserById(String id);
	PastureResult pagingGetUser(String page, String rows);
}
