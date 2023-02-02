package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class R5MicroServiceUpdateApplication {

	public static void main(String[] args) {
		System.out.println("Update---Application");
		SpringApplication.run(R5MicroServiceUpdateApplication.class, args);
	}

}
