package com.behsa.qpigw;

import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

@Service
public class RabbitConsumer {


    @Autowired
    private Gson gson;
    @Autowired
    private ResponseRepository responseRepository;
    @Autowired
    private ResponseMessage responseMessage;
    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);

    @RabbitListener(queues = "saeed")
    public void Consumer1(String message) {
        responseMessage = gson.fromJson(message, ResponseMessage.class);
        responseRepository.save(responseMessage);
    }

//    @RabbitListener(queues = "saeed")
//    public void Consumer2(String message) {
//       logger.debug(message);
//    }
//
//    @RabbitListener(queues = "saeed")
//    public void Consumer3(String message) {
//        System.out.println("Received fanout 3 message: " + message);
//    }
}

