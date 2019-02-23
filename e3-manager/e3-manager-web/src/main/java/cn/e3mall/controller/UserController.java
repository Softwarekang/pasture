package cn.e3mall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.e3mall.pojo.User;
import cn.e3mall.service.UserService;

/*
 * 用户管理层
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model mv, HttpSession session){
		String userName = request.getParameter("userName");
        String password = request.getParameter("passWord");
        System.out.println(userName+password);
        if(userName.equals("")){
            mv.addAttribute("loginInfo","用户名不能为空");
            return "user/login";
        }else if(password.equals("")){
            mv.addAttribute("loginInfo","密码不能为空");
            return "user/login";
        }else{
            User user = userService.selectByUserName(userName);
            if(user != null && (user.getPassword().equals(password))){
                // 获取user的id值进行
                User user1 = userService.selectByUserName(userName);
                session.setAttribute("userName",userName);
                mv.addAttribute("userId",user1.getId());
                request.getSession().setAttribute("username",userName);
                mv.addAttribute("loginInfo",userName);
                return "article/listAll";
            }else {
                mv.addAttribute("loginInfo","用户名或密码错误");
                return "user/login";
            }
        }
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request, Model mv){
		System.out.println("66");
		String userName = request.getParameter("userName");
		String password1 = request.getParameter("passWord1");
		String password2 = request.getParameter("passWord2");
		String manlocation = request.getParameter("manlocation");
		String phoneNumber = request.getParameter("phoneNumber");
		Boolean register = true;
        if(userName.equals("")){
            mv.addAttribute("registerInfo","用户名不能为空");
            register = false;
        } else if(password1.equals("")){
            mv.addAttribute("registerInfo","密码不能为空");
            register = false;
        } else if(password2.equals("")){
            mv.addAttribute("registerInfo","请输入确定密码");
            register = false;
        } else if(!password1.equals(password2)){
            mv.addAttribute("registerInfo","两次密码输入不同");
            register = false;
        }else if (manlocation.equals("")) {
            mv.addAttribute("registerInfo","管理地点不能为空");
            register = false;
        } else if(phoneNumber.equals("")){
        	 mv.addAttribute("registerInfo","联系方式不能为空");
             register = false;
        }else{
        	
        }
        if(register){
            userService.insert(new User(null,userName,password1,manlocation,phoneNumber));
            return "user/login";
        }else{
            return "user/regist";
        }
	}
	/*
	 * 
	 */
	
}  
