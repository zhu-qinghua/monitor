package org.cbd.mapper;

import org.cbd.pojo.Xitong;

public interface XitongMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xitong record);

    int insertSelective(Xitong record);

    Xitong selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xitong record);

    int updateByPrimaryKey(Xitong record);
}