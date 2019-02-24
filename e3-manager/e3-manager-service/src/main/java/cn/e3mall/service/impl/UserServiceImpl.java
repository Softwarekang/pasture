package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.mapper.UserMapper;
import cn.e3mall.pojo.User;
import cn.e3mall.pojo.UserExample;
import cn.e3mall.service.UserService;
import cn.e3mall.until.PastureResult;

@Service
public class UserServiceImpl implements UserService {
	@Autowired 
	private UserMapper UserMapper;
	
	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#login(java.lang.String, java.lang.String)
	 * 用户登录
	 */
	@Override
	public PastureResult login(String userName,String passWord) {
		PastureResult pastureResult = new PastureResult();
		User user = UserMapper.selectByUserName(userName);
		try{
			if(user == null) {
			pastureResult.setMessage("用户不存在");
		} else if(!passWord.trim().equals(user.getPassword())) {
			pastureResult.setMessage("密码错误");
		} else {
			pastureResult.setMessage("登录成功");
			pastureResult.setStatus(0);
			pastureResult.setData(user);
		}
		}catch (Exception e) {
			pastureResult.setStatus(500);
			pastureResult.setMessage("服务器处理错误");
		}
		return pastureResult;
	}
	
	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#register(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 *  用户注册
	 */

	@Override
	public PastureResult register(String userName, String passWord, String manlocation, String phoneNumber) {
		PastureResult pastureResult = new PastureResult();
		int max = UserMapper.getMaxId() + 1;
		try{
			if(UserMapper.selectByUserName(userName) == null) {
			User user = new User();
			user.setId(max);
			user.setManlocation(manlocation);
			user.setUsername(userName);
			user.setPassword(passWord);
			user.setPhonenumber(phoneNumber);
			UserMapper.insertSelective(user);
			pastureResult.setData(user);
			pastureResult.setMessage("注册成功");
			pastureResult.setStatus(0);
			}else {
				pastureResult.setMessage("注册失败");
			}
		}catch (Exception e) {
			pastureResult.setStatus(500);
			pastureResult.setMessage("服务器处理错误");
		}
		return pastureResult;
	}

	
	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#getUserById(java.lang.String)
	 * 通过name获得user
	 */
	@Override
	public PastureResult getUserByUserName(String userName) {
		PastureResult pastureResult = new PastureResult();
		User user = UserMapper.selectByUserName(userName);
		try {
			if(user == null) {
				pastureResult.setMessage("未查找到此用户");
			} else {
				pastureResult.setStatus(0);
				pastureResult.setMessage("查到此用户");
				pastureResult.setData(user);
			}
		} catch (Exception e) {
			pastureResult.setStatus(500);
			pastureResult.setMessage("服务器出错");
		}
		return pastureResult;
	}

	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#getUserById(java.lang.String)
	 * 通过id查询user
	 */
	@Override
	public PastureResult getUserById(String id) {
		PastureResult pastureResult = new PastureResult();	
		try {
			if(id == null) {
				pastureResult.setMessage("无此用户");
			}else {
				User user = UserMapper.selectByPrimaryKey(Integer.valueOf(id));
				pastureResult.setData(user);
				pastureResult.setMessage("查到此用户");
				pastureResult.setStatus(0);
			}
		}catch (Exception e) {
			pastureResult.setStatus(0);
			pastureResult.setMessage("服务器出错");
		}
		
		return pastureResult;
	}

	@Override
	public PastureResult getAllUser() {
		PastureResult pastureResult = new PastureResult();
		pastureResult.setStatus(0);
		pastureResult.setMessage("查询成功");
		pastureResult.setData(UserMapper.getAllUser());
		return pastureResult;
	}
	
	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#getUserByManLocation(java.lang.String)
	 * 通过管理地点获得user
	 */
	@Override
	public PastureResult getUserByManLocation(String manLocation) {
		PastureResult pastureResult = new PastureResult();
		List<User> users = UserMapper.getUserByManLocation(manLocation);
		pastureResult.setMessage("查询成功");
		pastureResult.setStatus(0);
		pastureResult.setData(users);
		return pastureResult;
	}

	@Override
	public PastureResult updateUserInfo(String id, String userName, String passWord, String manlocation,
			String phoneNumber) {
		PastureResult pastureResult = new PastureResult();
		User user = new User(Integer.valueOf("1"), "2", "2", "2", "2");
		System.out.println(user.getManlocation());
		try {
			if(UserMapper.updateUserInfo(user) > 0) {
				pastureResult.setMessage("更新成功");
				pastureResult.setStatus(0);
			}
		} catch (Exception e) {
			pastureResult.setMessage("服务器处理错误");
			pastureResult.setStatus(500);
		}
		return pastureResult;
	}

	@Override
	public PastureResult deleteUserById(String id) {
		PastureResult pastureResult = new PastureResult();
		try {
			if(UserMapper.deleteByPrimaryKey(Integer.valueOf(id)) > 0) {
				pastureResult.setStatus(0);
				pastureResult.setMessage("删除成功");
			}else {
				pastureResult.setMessage("删除失败");
			}
		}catch (Exception e) {
			pastureResult.setMessage("服务器出错");
			pastureResult.setStatus(500);
		}
		return pastureResult;
	}

	/*
	 * （非 Javadoc）
	 * @see cn.e3mall.service.UserService#pagingGetUser()
	 * 分页查询user
	 */
	@Override
	public PastureResult pagingGetUser(String page, String rows) {
		PastureResult pastureResult = new PastureResult();
		List<User> userList = null;
		try {
			// 设置分页信息， 第几页，一页多少
			PageHelper.startPage(1, 10);
			UserExample userExample = new UserExample();
			userList = UserMapper.selectByExample(userExample);
			PageInfo<User> pageInfo = new PageInfo<>(userList);
			pastureResult.setMessage("查询成功");
			pastureResult.setStatus(0);
			pastureResult.setData(userList);
			System.out.println(userList.size());
			System.out.println(userList.get(0).getUsername());
			
		}catch (Exception e) {
			pastureResult.setMessage("服务器出错");
			pastureResult.setStatus(500);
		}
		return pastureResult;
	}
	
	
	

}
