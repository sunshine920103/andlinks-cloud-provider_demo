package com.andlinks.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AndlinksCloudProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndlinksCloudProviderDemoApplication.class, args);
	}
}