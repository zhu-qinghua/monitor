package org.cbd.mapper;

import org.cbd.pojo.Jiqiren;

public interface JiqirenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jiqiren record);

    int insertSelective(Jiqiren record);

    Jiqiren selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jiqiren record);

    int updateByPrimaryKey(Jiqiren record);
}