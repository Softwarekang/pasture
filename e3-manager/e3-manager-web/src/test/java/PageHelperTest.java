import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.e3mall.mapper.UserMapper;
import cn.e3mall.pojo.User;
import cn.e3mall.pojo.UserExample;

public class PageHelperTest {
	@Test
	public void testPageHelper() throws Exception{
		// 初始化spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		// 获得mapper代理对象
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		// 执行语句前设置分页信息使用PageHelper的startPage方法
		PageHelper.startPage(1, 10);
		// 执行查询
		UserExample userExample = new UserExample();
		List<User> list = userMapper.selectByExample(userExample);
		// 取分页信息 1.总记录数 2.总页数...
		PageInfo<User> pageInfo = new PageInfo<>(list);
		// 总数
		//System.out.println(pageInfo.getTotal());
		// 多少页
		//System.out.println(pageInfo.getPages());
		// 每页多少
		//System.out.println(pageInfo.getPageSize());
		System.out.println(list.size());
		System.out.println(list.get(0).getUsername());
		
		
		
	}
}
