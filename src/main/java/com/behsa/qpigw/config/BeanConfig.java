package com.behsa.qpigw.config;


import com.google.gson.Gson;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
    @Value("${exchange.name}")
    private String exchangeName;

    @Value("${queue.name.consumer}")
    private String queueNameConsumer;
    @Value("${bind}")
    private String routineKeyBind;


    @Bean("saeed")
    Queue queueRequest() {
        return new Queue(queueNameConsumer, false);
    }

    @Bean
    DirectExchange getDirectExchange() {
        return new DirectExchange(exchangeName, true, false);
    }


    @Bean
    Binding bindingRequest(@Qualifier("saeed") Queue queueRequest, DirectExchange exchange) {
        return BindingBuilder.bind(queueRequest).to(exchange).with(routineKeyBind);
    }

    @Bean
    MessageListenerAdapter getMessageListenerAdapter() {
        return new MessageListenerAdapter();
    }


    @Bean
    Gson getGson() {
        return new Gson();
    }

}
