package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.e3mall.mapper.UserMapper;
import cn.e3mall.pojo.User;
import cn.e3mall.service.UserService;


/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserName(userName);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}
	
	

}
