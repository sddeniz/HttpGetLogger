package com.behsa.qpigw.consumer1;

import com.behsa.qpigw.ResponseMessage;
import com.behsa.qpigw.jpa.ResponseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

@Service
public class RabbitConsumer {


    @Autowired
    private Gson gson;
    @Autowired
    private ResponseRepository responseRepository;

    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);

    @RabbitListener(queues = "saeed")
    public void Consumer1(String message) {
       ResponseMessage responseMessage = gson.fromJson(message, ResponseMessage.class);
        responseRepository.save(responseMessage);
    }


}

