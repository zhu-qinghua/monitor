package org.cbd.mapper;

import org.cbd.pojo.Guanjianci;

public interface GuanjianciMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Guanjianci record);

    int insertSelective(Guanjianci record);

    Guanjianci selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Guanjianci record);

    int updateByPrimaryKey(Guanjianci record);
}