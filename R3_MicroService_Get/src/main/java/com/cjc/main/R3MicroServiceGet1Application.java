package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class R3MicroServiceGet1Application {

	public static void main(String[] args) {
		System.out.println("Get--Application");
		SpringApplication.run(R3MicroServiceGet1Application.class, args);
	}

}
