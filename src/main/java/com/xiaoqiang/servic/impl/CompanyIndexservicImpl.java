package com.xiaoqiang.servic.impl;

import com.xiaoqiang.dao.CompanyDao;
import com.xiaoqiang.entiy.Company;
import com.xiaoqiang.servic.search.CompanyIndexservic;

import com.xiaoqiang.util.CompanyKey;
import com.xiaoqiang.util.InitDemo;
import org.apache.lucene.search.TotalHits;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CompanyIndexservicImpl implements CompanyIndexservic {
    private static final Logger logger = LoggerFactory.getLogger(CompanyIndexservic.class);
    private static final String INDEX_NAME = "mycompany";

    private RestHighLevelClient client = InitDemo.getClient();
    @Autowired
    private CompanyDao companyDao;

    @Override
    public void index(Long companyId) {
        Company company = companyDao.findOne(companyId);
        if (company == null) {
            logger.error("Index Company {} does not exist", companyId);
            return;
        }
        SearchRequest searchRequest = new SearchRequest(INDEX_NAME);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termQuery(CompanyKey.companyId, company.getId()));
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = null;
        try {
            searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug(searchRequest.toString());
        SearchHits hits = searchResponse.getHits();
        TotalHits totalHits = hits.getTotalHits();
        long numHits = totalHits.value;
        boolean success;
        if (numHits == 0) {
            success = create(company);
        } else if (numHits == 1) {
            success = update(company);
        } else {
            success = deleteAndCreate(numHits, company);
        }
        if (success) {
            logger.debug("创建索引成功" + company.getId());
        }
    }

    private boolean create(Company company) {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put(CompanyKey.companyName, company.getCompanyname());
        jsonMap.put(CompanyKey.companyId, company.getId());
        IndexRequest indexRequest = new IndexRequest("mycompany")
                .id(String.valueOf(company.getId())).source(jsonMap);
        logger.debug("获取公司id=" + company.getId());
        IndexResponse indexResponse = null;
        try {
            indexResponse = client.index(indexRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            logger.error("创建失败失败Id=" + company.getId(), e);
        }
        if (indexResponse.getResult() == DocWriteResponse.Result.CREATED) {
            return true;
        } else {
            return false;
        }

    }

    private boolean update(Company company) {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("companyname", company.getCompanyname());
        jsonMap.put("id", company.getId());
        UpdateRequest request = new UpdateRequest(INDEX_NAME, company.getId().toString()).doc(jsonMap);
        UpdateResponse updateResponse = null;
        try {
            updateResponse = client.update(
                    request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            logger.error("更新失败失败Id=" + company.getId(), e);
        }

        if (updateResponse.getResult() == DocWriteResponse.Result.UPDATED) {
            return true;
        } else {
            return false;
        }


    }

    private boolean deleteAndCreate(long total, Company company) {
        DeleteByQueryRequest request =
                new DeleteByQueryRequest(INDEX_NAME);
        request.setQuery(new TermQueryBuilder(CompanyKey.companyId, company.getId()));
        BulkByScrollResponse bulkResponse = null;
        try {
            bulkResponse =
                    client.deleteByQuery(request, RequestOptions.DEFAULT);
            logger.debug("delete company " + bulkResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
        long deleted = bulkResponse.getDeleted();
        if (deleted != total) {
            logger.warn("应该要删除{},但是只删除了{}", total, deleted);
            return false;
        } else {
            return create(company);
        }

    }


    @Override
    public void remvoe(Long companyId) {
        DeleteByQueryRequest request =
                new DeleteByQueryRequest(INDEX_NAME);
        request.setQuery(new TermQueryBuilder(CompanyKey.companyId, companyId));
        BulkByScrollResponse bulkResponse = null;
        try {
            bulkResponse =
                    client.deleteByQuery(request, RequestOptions.DEFAULT);
            logger.debug("delete company " + bulkResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }

        long deleted = bulkResponse.getDeleted();
        logger.debug("删除了{}条", deleted);


    }

    @Override
    public void search(String name) {
        SearchRequest searchRequest = new SearchRequest(INDEX_NAME);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchPhraseQuery(CompanyKey.companyName, name));
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = null;
        try {
            searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SearchHits hits = searchResponse.getHits();
        TotalHits totalHits = hits.getTotalHits();
// the total number of hits, must be interpreted in the context of totalHits.relation
        long numHits = totalHits.value;
// whether the number of hits is accurate (EQUAL_TO) or a lower bound of the total (GREATER_THAN_OR_EQUAL_TO)
        TotalHits.Relation relation = totalHits.relation;
        float maxScore = hits.getMaxScore();

        SearchHit[] searchHits = hits.getHits();
        for (SearchHit hit : searchHits) {
            // do something with the SearchHit
            String index = hit.getIndex();
            String id = hit.getId();
            float score = hit.getScore();
            String sourceAsString = hit.getSourceAsString();
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            String documentTitle = (String) sourceAsMap.get(CompanyKey.companyName);


            System.out.println(index + "  " + id + " " + score + " " + sourceAsString + " " + documentTitle);
        }
    }
}
