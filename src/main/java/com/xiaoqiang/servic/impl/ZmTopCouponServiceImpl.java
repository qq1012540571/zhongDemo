package com.xiaoqiang.servic.impl;

import com.xiaoqiang.dao.ZmTopcouponMapper;
import com.xiaoqiang.entiy.ZmTopcoupon;
import com.xiaoqiang.servic.search.CompanyIndexservic;
import com.xiaoqiang.servic.search.ZmTopCouponService;
import com.xiaoqiang.util.BeanOfMap;
import com.xiaoqiang.util.InitDemo;
import com.xiaoqiang.util.InsertIndexTemplate;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 黄豪强
 * @create 2019/8/13 13:49
 */
@Service
public class ZmTopCouponServiceImpl implements ZmTopCouponService {

    private static final Logger logger = LoggerFactory.getLogger(CompanyIndexservic.class);
    @Autowired
    private ZmTopcouponMapper zmTopcouponMapper;

    @Override
    @Transactional
    public void insertTopCoupon() {

        List<ZmTopcoupon> list = zmTopcouponMapper.selectAll();
        String name="zm_topcoupon";
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
