package com.xiaoqiang.dao;



import com.xiaoqiang.entiy.ZmTopcoupon;

import java.util.List;

public interface ZmTopcouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZmTopcoupon record);

    int insertSelective(ZmTopcoupon record);

    ZmTopcoupon selectByPrimaryKey(Integer id);


    List<ZmTopcoupon> selectAll();



    int updateByPrimaryKeySelective(ZmTopcoupon record);

    int updateByPrimaryKey(ZmTopcoupon record);
}