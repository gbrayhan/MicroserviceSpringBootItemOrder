package com.appmicroservice.serviceorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceOrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrdersApplication.class, args);
    }

}
