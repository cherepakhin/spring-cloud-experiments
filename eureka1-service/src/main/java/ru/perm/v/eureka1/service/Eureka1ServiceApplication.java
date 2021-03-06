package ru.perm.v.eureka1.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// Участие в регистрации о обнаружении сервисов с помощью Spring Cloud
@EnableDiscoveryClient
@SpringBootApplication
public class Eureka1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eureka1ServiceApplication.class, args);
	}

}
