package com.xiaoqiang.util;

import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.replication.ReplicationResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InsertIndex {
    public static void main(String[] args) {

            RestHighLevelClient client = InitDemo.getClient();
            IndexRequest request = new IndexRequest("user");
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("name", "光头111强");
            jsonMap.put("age", 25);
            jsonMap.put("id",4);
             request.id("3").source(jsonMap);

           IndexResponse indexResponse = null;
            try {
                indexResponse = client.index(request, RequestOptions.DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String index = indexResponse.getIndex();
            System.out.println(index);



    }
}
