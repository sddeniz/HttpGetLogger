package com.behsa.qpigw.consumer3;

import com.behsa.qpigw.ResponseMessage;
import com.behsa.qpigw.elasticsearch.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSearchService {
    @Autowired
    private ProductRepository productRepository;

    public void createProductIndexBulk(final List<ResponseMessage> products) {
        productRepository.saveAll(products);
    }

    public void createProductIndex(final ResponseMessage product) {
        productRepository.save(product);
    }
}
