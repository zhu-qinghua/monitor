package org.cbd.mapper;

import org.cbd.pojo.Zhuji;

public interface ZhujiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zhuji record);

    int insertSelective(Zhuji record);

    Zhuji selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zhuji record);

    int updateByPrimaryKey(Zhuji record);
}