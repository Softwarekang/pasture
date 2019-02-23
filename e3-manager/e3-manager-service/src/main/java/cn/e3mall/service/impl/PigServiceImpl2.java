package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.PigMapper;
import cn.e3mall.mapper.UserMapper;
import cn.e3mall.pojo.Pig;
import cn.e3mall.pojo.User;
import cn.e3mall.service.PigService;
import cn.e3mall.service.UserService;

@Service
public class PigServiceImpl2 implements PigService {
	@Autowired
	private PigMapper pigMapper;
	@Override
	public Pig selectById(Integer id) {
		// TODO Auto-generated method stub
		return pigMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Pig> select() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
