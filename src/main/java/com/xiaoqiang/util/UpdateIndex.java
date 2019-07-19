package com.xiaoqiang.util;

import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;

public class UpdateIndex {

    public static void main(String[] args) throws IOException {

         RestHighLevelClient client=InitDemo.getClient();
        UpdateRequest request = new UpdateRequest("posts", "1");
        String jsonString = "{" +
                "\"user\":\"陈小五\"," +
                "\"postDate\":\"1996-08-14\"" +
                "}";
        request.doc(jsonString, XContentType.JSON);
        request.scriptedUpsert(true);
        UpdateResponse updateResponse = client.update(
                request, RequestOptions.DEFAULT);
        String index = updateResponse.getIndex();
        String id = updateResponse.getId();
        long version = updateResponse.getVersion();
        if (updateResponse.getResult() == DocWriteResponse.Result.CREATED) {
                                System.out.println("创建");
        } else if (updateResponse.getResult() == DocWriteResponse.Result.UPDATED) {
            System.out.println("更新");
        } else if (updateResponse.getResult() == DocWriteResponse.Result.DELETED) {
            System.out.println("删除");
        } else if (updateResponse.getResult() == DocWriteResponse.Result.NOOP) {

        }
    }
}
