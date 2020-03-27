package com.lijianan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceProduceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProduceApplication.class,args);
    }
}
