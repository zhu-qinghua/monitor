package org.cbd.mapper;

import org.cbd.pojo.Cuowuma;

public interface CuowumaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cuowuma record);

    int insertSelective(Cuowuma record);

    Cuowuma selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cuowuma record);

    int updateByPrimaryKey(Cuowuma record);
}