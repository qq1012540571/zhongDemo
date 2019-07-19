package com.xiaoqiang.test;

import com.xiaoqiang.dao.CompanyDao;
import com.xiaoqiang.entiy.Company;
import com.xiaoqiang.util.InitDemo;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.replication.ReplicationResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test extends BaseJunit4Test {
    @Autowired
    CompanyDao userDao;

    @Test
    public void test() {
        List<Company> list = userDao.selectUser();
        RestHighLevelClient client = InitDemo.getClient();

        for (Company user : list) {
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("companyId", String.valueOf(user.getId()));
            jsonMap.put("companyname", user.getCompanyname());
            IndexRequest indexRequest = new IndexRequest("mycompany")
                    .id(String.valueOf(user.getId())).source(jsonMap);

            IndexResponse indexResponse = null;
            try {
                indexResponse = client.index(indexRequest, RequestOptions.DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String index = indexResponse.getIndex();
            String id = indexResponse.getId();
            if (indexResponse.getResult() == DocWriteResponse.Result.CREATED) {
                System.out.println("创建索引" + user.getCompanyname());
            } else if (indexResponse.getResult() == DocWriteResponse.Result.UPDATED) {
                System.out.println("更新索引");
            }
            ReplicationResponse.ShardInfo shardInfo = indexResponse.getShardInfo();
            if (shardInfo.getTotal() != shardInfo.getSuccessful()) {
                System.out.println("失败数量");
            }
            if (shardInfo.getFailed() > 0) {
                for (ReplicationResponse.ShardInfo.Failure failure :
                        shardInfo.getFailures()) {
                    String reason = failure.reason();
                    System.out.println(reason);
                }
            }
        }
    }


}
