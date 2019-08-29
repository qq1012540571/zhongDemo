package com.xiaoqiang.dao;

import com.xiaoqiang.entiy.ZmTbkitem;

import java.util.List;

public interface ZmTbkitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZmTbkitem record);

    int insertSelective(ZmTbkitem record);

    ZmTbkitem selectByPrimaryKey(Integer id);

    List<ZmTbkitem> selectAll();

    int updateByPrimaryKeySelective(ZmTbkitem record);

    int updateByPrimaryKey(ZmTbkitem record);
}