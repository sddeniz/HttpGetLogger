package com.behsa.qpigw.consumer3;

import com.behsa.qpigw.ResponseMessage;
import com.behsa.qpigw.consumer1.RabbitConsumer;
import com.behsa.qpigw.elasticsearch.ProductRepository;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdConsumer {

    @Autowired
    private Gson gson;
    @Autowired
    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);

    @RabbitListener(queues = "saeed")
    public void thirdConsumer(String message) {
        ResponseMessage responseMessage = gson.fromJson(message, ResponseMessage.class);
        productRepository.save(responseMessage);
    }

}
