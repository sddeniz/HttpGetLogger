package com.behsa.qpigw.config;


import com.google.gson.Gson;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableElasticsearchRepositories("com.behsa.qpigw.elasticsearch")
@EnableJpaRepositories("com.behsa.qpigw.jpa")
public class BeanConfig {
    @Value("${exchange.name}")
    private String exchangeName;

    @Value("${queue.name.consumer}")
    private String queueNameConsumer;
    @Value("${bind}")
    private String routineKeyBind;


    @Bean("saeed")
    Queue queueRequest() {
        return new Queue(queueNameConsumer, true);
    }

    @Bean
    FanoutExchange getExchange() {
        return new FanoutExchange(exchangeName, true, false);
    }


    @Bean
    Binding bindingRequest(@Qualifier("saeed") Queue queueRequest, FanoutExchange exchange) {
        return BindingBuilder.bind(queueRequest).to(exchange);
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
