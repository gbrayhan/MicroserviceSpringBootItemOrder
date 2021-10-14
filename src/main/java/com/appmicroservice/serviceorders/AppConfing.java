package com.appmicroservice.serviceorders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfing {

    @Bean("clientRest")
    public RestTemplate registerRestTemplate(){
        return new RestTemplate();
    }
}
