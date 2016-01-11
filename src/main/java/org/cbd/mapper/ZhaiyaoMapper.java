package org.cbd.mapper;

import org.cbd.pojo.Zhaiyao;

public interface ZhaiyaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zhaiyao record);

    int insertSelective(Zhaiyao record);

    Zhaiyao selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zhaiyao record);

    int updateByPrimaryKey(Zhaiyao record);
}