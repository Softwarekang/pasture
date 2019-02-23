package cn.e3mall.service;


import java.util.List;

import cn.e3mall.pojo.Pig;

public interface PigService {
	Pig selectById(Integer id);
	List<Pig> select();
}
