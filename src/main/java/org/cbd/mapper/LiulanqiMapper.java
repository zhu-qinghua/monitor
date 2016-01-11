package org.cbd.mapper;

import org.cbd.pojo.Liulanqi;

public interface LiulanqiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Liulanqi record);

    int insertSelective(Liulanqi record);

    Liulanqi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Liulanqi record);

    int updateByPrimaryKey(Liulanqi record);
}