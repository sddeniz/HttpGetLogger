package com.behsa.qpigw.consumer2;

import com.behsa.qpigw.consumer1.RabbitConsumer;
import com.behsa.qpigw.jpa.ResponseRepository;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecConsumer {

    @Autowired
    private Gson gson;
    @Autowired
    private ResponseRepository responseRepository;

    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);

    @RabbitListener(queues = "saeed")
    public void secConsumer(String message) {
        logger.debug(message);
    }

}
