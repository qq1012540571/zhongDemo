package com.xiaoqiang.controller;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
@Controller
@RequestMapping("/")
public class ElastisSearchController {



   /* @RequestMapping(value = "/elasticsearch", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity elasticsearch(@RequestParam(name = "id", defaultValue = "") String id) {
        String source = null;
        if (null == id) return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        GetRequest getRequest = new GetRequest("test", String.valueOf(id));
        try {
            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
            if (getResponse.isExists()) {
                source = getResponse.getSourceAsString();


            }
        } catch (IOException e) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(source, HttpStatus.OK);
    }*/

}
