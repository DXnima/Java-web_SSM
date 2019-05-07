package com.dx21601.dao;

import com.dx21601.pojo.Hours;

public interface HoursMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hours record);

    int insertSelective(Hours record);

    Hours selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hours record);

    int updateByPrimaryKey(Hours record);
}