package com.xiaoqiang.util;

import com.xiaoqiang.entiy.ZmTopcoupon;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 黄豪强
 * @create 2019/8/14 10:29
 */
public class InsertIndexTemplate {

    public static  <T> void  insertIndex(List<T> list,String index)
    {
        RestHighLevelClient client = InitDemo.getClient();
        BulkRequest request = new BulkRequest();
        List<Map> mapList = new ArrayList<>();
        for (T nameEntity : list) {
            Map map = new HashMap();
            try {
                map = BeanOfMap.bean2Map(nameEntity);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            mapList.add(map);
        }
        for (Map map : mapList) {
            request.add(new IndexRequest(index).id(String.valueOf(map.get("id"))).source(map));
        }
        BulkResponse bulkResponse = null;
        try {
            bulkResponse = client.bulk(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
