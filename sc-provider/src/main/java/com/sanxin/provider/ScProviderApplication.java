package com.sanxin.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScProviderApplication.class, args);
    }
}
