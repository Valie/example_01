package com.a_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //激活服务发现
@SpringBootApplication
public class AServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AServiceApplication.class, args);
	}

}
