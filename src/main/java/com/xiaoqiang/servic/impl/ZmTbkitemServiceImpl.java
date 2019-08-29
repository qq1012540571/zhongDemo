package com.xiaoqiang.servic.impl;

import com.xiaoqiang.dao.ZmTbkitemMapper;
import com.xiaoqiang.entiy.ZmTbkitem;
import com.xiaoqiang.servic.search.ZmTbkitemService;
import com.xiaoqiang.util.InsertIndexTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄豪强
 * @create 2019/8/14 14:03
 */
@Service
public class ZmTbkitemServiceImpl implements ZmTbkitemService {
    private static final Logger logger= LoggerFactory.getLogger(ZmTbkitemService.class);
    @Autowired
    ZmTbkitemMapper zmTbkitemMapper;
    @Override
    public void createIndex() {

        logger.debug("开始");
        List<ZmTbkitem> list=zmTbkitemMapper.selectAll();
        String name="zm_tbkitem";
        InsertIndexTemplate.insertIndex(list,"zm_tbkitem");

    }
}
