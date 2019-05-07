package com.dx21601.dao;

import com.dx21601.pojo.Drom;

public interface DromMapper {
    int deleteByPrimaryKey(String dId);

    int insert(Drom record);

    int insertSelective(Drom record);

    Drom selectByPrimaryKey(String dId);

    int updateByPrimaryKeySelective(Drom record);

    int updateByPrimaryKey(Drom record);
}