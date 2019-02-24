package cn.e3mall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.e3mall.pojo.User;
import cn.e3mall.pojo.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /*
     * 自定义接口
     */
    
    User selectByUserName(String userName);
    
    List<User> getAllUser();
    
    List<User> getUserByManLocation(String manlocation);
    
    int getMaxId();
    
    int updateUserInfo(@Param("user") User user);
    
}