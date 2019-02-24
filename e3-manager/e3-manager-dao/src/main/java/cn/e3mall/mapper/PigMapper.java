package cn.e3mall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.e3mall.pojo.Pig;
import cn.e3mall.pojo.PigExample;

public interface PigMapper {
    int countByExample(PigExample example);

    int deleteByExample(PigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pig record);

    int insertSelective(Pig record);

    List<Pig> selectByExample(PigExample example);

    Pig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pig record, @Param("example") PigExample example);

    int updateByExample(@Param("record") Pig record, @Param("example") PigExample example);

    int updateByPrimaryKeySelective(Pig record);

    int updateByPrimaryKey(Pig record);
}