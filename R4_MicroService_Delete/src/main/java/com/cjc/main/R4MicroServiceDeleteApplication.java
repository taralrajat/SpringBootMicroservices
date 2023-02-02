package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class R4MicroServiceDeleteApplication {

	public static void main(String[] args) {
		System.out.println("Delete--Application");
		SpringApplication.run(R4MicroServiceDeleteApplication.class, args);
	}

}
