package org.cbd.mapper;

import org.cbd.pojo.Xiazai;

public interface XiazaiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xiazai record);

    int insertSelective(Xiazai record);

    Xiazai selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xiazai record);

    int updateByPrimaryKey(Xiazai record);
}