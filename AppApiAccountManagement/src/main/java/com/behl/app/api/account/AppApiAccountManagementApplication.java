package com.behl.app.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApiAccountManagementApplication.class, args);
	}

}
