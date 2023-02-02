package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class R1MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("Eureka--Server");
		SpringApplication.run(R1MicroServiceEurekaServerApplication.class, args);
	}

}
