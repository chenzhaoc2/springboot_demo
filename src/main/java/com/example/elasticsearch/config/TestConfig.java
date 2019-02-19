package com.example.elasticsearch.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

    public static void main(String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ElasticsearchConfig.class);
        context.getBean("transportClient");
        System.out.println(1);
    }
}
