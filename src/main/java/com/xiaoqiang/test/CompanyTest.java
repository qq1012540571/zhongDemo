package com.xiaoqiang.test;

import com.xiaoqiang.dao.ZmTopcouponMapper;
import com.xiaoqiang.entiy.ZmTopcoupon;
import com.xiaoqiang.servic.search.CompanyIndexservic;
import com.xiaoqiang.servic.search.ZmRebatewebsiteService;
import com.xiaoqiang.servic.search.ZmTbkitemService;
import com.xiaoqiang.servic.search.ZmTopCouponService;
import com.xiaoqiang.util.BeanOfMap;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyTest extends BaseJunit4Test {

    @Autowired
    private CompanyIndexservic companyIndexservic;
    @Autowired
   private  ZmTopCouponService zmTopcouponMapper;
    @Autowired
    private ZmRebatewebsiteService zmRebatewebsiteService;
    @Autowired
    private ZmTbkitemService zmTbkitemService;
    @Test
    @Ignore
    public void select() throws IllegalAccessException, IOException {
                  zmTopcouponMapper.insertTopCoupon();

    }
    @Test

    public  void createIndex()
    {
        zmTbkitemService.createIndex();
    }
    @Test
    @Ignore
    public void test() {
        Long id=37L;
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext();
        companyIndexservic.index(id);
    }

    @Test
    @Ignore
    public void remove()
    {
        Long id=37L;
        companyIndexservic.remvoe(id);
    }
    @Test
    @Ignore
    public void create()
    {
        String name="中国人寿（青岛）";
        companyIndexservic.search(name);
    }
}
