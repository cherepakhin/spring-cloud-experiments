package ru.perm.v.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
// Участие в регистрации о обнаружении сервисов с помощью Spring Cloud
@EnableDiscoveryClient
public class FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}
