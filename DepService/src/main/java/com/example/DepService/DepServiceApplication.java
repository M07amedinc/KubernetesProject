package com.example.DepService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class DepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepServiceApplication.class, args);
	}

}
