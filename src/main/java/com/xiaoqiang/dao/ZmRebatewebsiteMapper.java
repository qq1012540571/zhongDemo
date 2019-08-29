package com.xiaoqiang.dao;

import com.xiaoqiang.entiy.ZmRebatewebsite;
import com.xiaoqiang.entiy.ZmTopcoupon;

import java.util.List;

public interface ZmRebatewebsiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZmRebatewebsite record);

    int insertSelective(ZmRebatewebsite record);

    ZmRebatewebsite selectByPrimaryKey(Integer id);

    List<ZmRebatewebsite> selectAll();
    int updateByPrimaryKeySelective(ZmRebatewebsite record);

    int updateByPrimaryKey(ZmRebatewebsite record);
}