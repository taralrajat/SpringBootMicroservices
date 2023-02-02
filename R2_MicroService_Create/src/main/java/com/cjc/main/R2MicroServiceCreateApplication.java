package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class R2MicroServiceCreateApplication {

	public static void main(String[] args) {
		System.out.println("Create--Application");
		SpringApplication.run(R2MicroServiceCreateApplication.class, args);
	}

}
