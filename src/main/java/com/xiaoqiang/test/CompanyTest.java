package com.xiaoqiang.test;

import com.xiaoqiang.servic.search.CompanyIndexservic;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyTest extends BaseJunit4Test {

    @Autowired
    CompanyIndexservic companyIndexservic;

    @Test
    @Ignore
    public void test() {
        Long id=37L;
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
    public void search()
    {
        String name="国任黄豪强";
        companyIndexservic.search(name);
    }
}
