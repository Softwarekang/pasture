package cn.e3mall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.e3mall.pojo.Pig;
import cn.e3mall.service.PigService;

@RequestMapping("/pig")
@Controller
public class PigController {
	@Autowired
	private PigService pigService;
	
	@RequestMapping("/selectById")
	public String selectById(HttpServletRequest request, Model mv){
		Pig pig = pigService.selectById(Integer.valueOf(request.getParameter("id")));
		System.out.println("66"+pig.getAge());
		return null;
	}
}
