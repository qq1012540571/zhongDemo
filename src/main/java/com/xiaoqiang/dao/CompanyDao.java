package com.xiaoqiang.dao;

import com.xiaoqiang.entiy.Company;


import java.util.List;

public interface CompanyDao {

     public List<Company> selectUser();

     public  Company findOne(Long id);

}
