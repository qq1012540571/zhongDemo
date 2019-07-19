package com.xiaoqiang.test;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:applicationContext-mvc.xml"
	 ,"classpath:mybatis-config.xml"})
public class BaseJunit4Test {


}
