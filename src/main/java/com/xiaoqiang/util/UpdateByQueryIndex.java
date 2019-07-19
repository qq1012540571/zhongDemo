package com.xiaoqiang.util;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.UpdateByQueryRequest;

import java.io.IOException;

public class UpdateByQueryIndex {

    public static void main(String[] args) throws IOException {
        RestHighLevelClient client = InitDemo.getClient();
        UpdateByQueryRequest request =
                new UpdateByQueryRequest("posts", "hero");
        request.setSize(10);
        request.setQuery(new TermQueryBuilder("user", "黄帅哥"));

        BulkByScrollResponse bulkResponse =
                client.updateByQuery(request, RequestOptions.DEFAULT);
    }
}
