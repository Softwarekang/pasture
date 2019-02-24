package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.mapper.UserMapper;
import cn.e3mall.service.UserService;
import cn.e3mall.until.PastureResult;


/*
 * 用户管理层
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired 
	private UserService UserService;
	
	/*
	 * 用户登录
	 */
	@RequestMapping("/login")
	@ResponseBody
	public PastureResult login(String userName,String passWord) {
		return UserService.login(userName, passWord);
	}
	
	/*
	 * 用户注册
	 */
	@RequestMapping("/register")
	@ResponseBody
	public PastureResult register(String userName, String passWord, String manlocation,String phoneNumber ) {
		return UserService.register(userName, passWord, manlocation, phoneNumber);
	}
	
	/*
	 * 通过name查找用户
	 */
	@RequestMapping("/getUserByName")
	@ResponseBody
	public PastureResult getUser(String userName) {
		return UserService.getUserByUserName(userName);
	}
	
	/*
	 * 通过id查用户
	 */
	@RequestMapping("/getUserById")
	@ResponseBody
	public PastureResult getUserById(String id) {
		return UserService.getUserById(id);
	}
	
	/**
	 * 查询所有用户信息
	 */
	@RequestMapping("/getAllUser")
	@ResponseBody
	public PastureResult getAllUser() {
		return UserService.getAllUser();
	}
	
	/*
	 * 通过管理地点查找用户信息
	 */
	@RequestMapping("/getUserByManLocation")
	@ResponseBody
	public PastureResult getUserByManLocation() {
		return UserService.getUserByManLocation("m87");
	}
	
	/*
	 * 修改用户信息
	 */
	@RequestMapping("/updateUserInf0")
	@ResponseBody
	public PastureResult updateUserInfo(String id,String userName, String passWord, String manlocation,String phoneNumber) {
		return UserService.updateUserInfo(id, userName, passWord, manlocation, phoneNumber);
	}
	
	/*
	 * 注销用户信息
	 */
	@RequestMapping("/deleteUser")
	@ResponseBody
	public PastureResult deleteUser(String id) {
		return UserService.deleteUserById("1");
	}
	
	/*
	 * 用户进行分页查询
	 */
	@RequestMapping("/pagingGetUser")
	@ResponseBody
	public PastureResult pagingGetUser(String page, String rows) {
		return UserService.pagingGetUser(page,rows);
	}
}  

