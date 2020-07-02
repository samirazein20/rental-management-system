package com.practice.rental.project.contracts_mgt_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContractsMgtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractsMgtServiceApplication.class, args);
    }

}
