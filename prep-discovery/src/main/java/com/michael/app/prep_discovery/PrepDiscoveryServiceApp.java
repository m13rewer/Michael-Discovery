package com.michael.app.prep_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrepDiscoveryServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(PrepDiscoveryServiceApp.class, args);
	}
}
