package com.practice.rentalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserMgtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMgtServiceApplication.class, args);
    }

}
