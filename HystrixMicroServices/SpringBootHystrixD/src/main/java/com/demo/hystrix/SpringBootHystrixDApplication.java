package com.demo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringBootHystrixDApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHystrixDApplication.class, args);
	}

}
