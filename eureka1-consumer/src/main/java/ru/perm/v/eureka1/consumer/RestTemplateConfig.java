package ru.perm.v.eureka1.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	private static final Logger logger = LoggerFactory.getLogger(RestTemplateConfig.class);

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		logger.info("***********************");
		logger.info("Config RestTemplate");
		logger.info("***********************");
		return new RestTemplate();
	}
}
