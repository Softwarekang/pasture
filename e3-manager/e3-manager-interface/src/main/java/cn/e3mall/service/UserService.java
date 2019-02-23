package cn.e3mall.service;

import cn.e3mall.pojo.User;

public interface UserService {
	User  selectByUserName(String userName);
	int insert(User user);
}
