package com.xiaoqiang.servic.impl;

import com.xiaoqiang.dao.ZmRebatewebsiteMapper;
import com.xiaoqiang.entiy.ZmRebatewebsite;
import com.xiaoqiang.entiy.ZmTopcoupon;
import com.xiaoqiang.servic.search.ZmRebatewebsiteService;
import com.xiaoqiang.util.InsertIndexTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄豪强
 * @create 2019/8/14 10:26
 */
@Service
public class ZmRebatewebsiteServiceImpl implements ZmRebatewebsiteService {
    private static  final Logger logger= LoggerFactory.getLogger(ZmRebatewebsiteService.class);
    @Autowired
    private  ZmRebatewebsiteMapper zmRebatewebsiteMapper;
    public void insertTopCoupon() {
        List<ZmRebatewebsite> list = zmRebatewebsiteMapper.selectAll();
        String name="zm_rebatewebsite";
        try {
            InsertIndexTemplate.insertIndex(list,name);
        }
        catch (Exception e)
        {
            logger.error("插入失败",e);
        }
        logger.debug("插入成功");
    }
}
