package com.wqh.weatherdata.config;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanqh
 * @date 2018/01/31 11:22
 * @description:
 */
@Configuration
public class RestConfig {

    @Autowired
    private RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate(){
        return builder.build();
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
