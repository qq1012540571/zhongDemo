package com.xiaoqiang.util;

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

import java.io.IOException;

public class BulkIndex {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient client=InitDemo.getClient();
        BulkRequest request = new BulkRequest();
        request.add(new DeleteRequest("post1").id("1"));
        request.add(new IndexRequest("post1").id("2")
                .source(XContentType.JSON,"field", "bar"));
        request.add(new IndexRequest("post1").id("3")
                .source(XContentType.JSON,"field", "baz"));

        BulkResponse bulkResponse = client.bulk(request, RequestOptions.DEFAULT);
        for(BulkItemResponse bulkItemResponse:bulkResponse) {
            DocWriteResponse itemResponse = bulkItemResponse.getResponse();

            switch (bulkItemResponse.getOpType()) {
                case INDEX:
                case CREATE:
                    IndexResponse indexResponse = (IndexResponse) itemResponse;
                    System.out.println(indexResponse.getResult());
                    break;
                case UPDATE:
                    UpdateResponse updateResponse = (UpdateResponse) itemResponse;
                    System.out.println(updateResponse.getResult());
                    break;
                case DELETE:
                    DeleteResponse deleteResponse = (DeleteResponse) itemResponse;
                    System.out.println(deleteResponse.getResult());
            }
        }
    }

}
