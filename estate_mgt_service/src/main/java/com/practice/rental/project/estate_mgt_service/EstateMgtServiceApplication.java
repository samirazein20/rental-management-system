package com.practice.rental.project.estate_mgt_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EstateMgtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstateMgtServiceApplication.class, args);
	}

}
