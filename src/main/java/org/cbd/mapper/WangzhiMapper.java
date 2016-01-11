package org.cbd.mapper;

import org.cbd.pojo.Wangzhi;

public interface WangzhiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wangzhi record);

    int insertSelective(Wangzhi record);

    Wangzhi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wangzhi record);

    int updateByPrimaryKey(Wangzhi record);
}