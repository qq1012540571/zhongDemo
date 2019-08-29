package com.xiaoqiang.util;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * 
 * @Description: 获取Java High Level REST Client客户端
 * @author lgs
 * @date
 *
 */
@Configuration
public class InitDemo {
    @Bean
    public static RestHighLevelClient getClient() {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.8.47", 9200, "http")));

        return client;
    }
}