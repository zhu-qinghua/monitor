package org.cbd.mapper;

import org.cbd.pojo.Canguan;

public interface CanguanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Canguan record);

    int insertSelective(Canguan record);

    Canguan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Canguan record);

    int updateByPrimaryKey(Canguan record);
}