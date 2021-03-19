package com.salama.user.server.registary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServerRegistaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegistaryApplication.class, args);
	}

}
