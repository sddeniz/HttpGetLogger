package com.behsa.qpigw.elasticsearch;


import com.behsa.qpigw.ResponseMessage;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface ProductRepository
            extends ElasticsearchRepository<ResponseMessage, String> {

    }

