package com.xiaoqiang.servic.search;

public interface CompanyIndexservic {
    /**
     * 索引目标公司
     *
     * @param companyId
     */
    void index(Long companyId);

    /**
     * 移除公司索引
     *
     * @param companyId
     */
    void remvoe(Long companyId);

    /**
     * 搜索公司
     *
     * @param companyId
     */
    void search(String name);




}
