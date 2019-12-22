package ru.perm.v.eureka1.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Consumer1Client {

	private static final Logger logger = LoggerFactory.getLogger(Consumer1Client.class);
	private RestTemplate rest;
	@Value("${service-ctrl1}")
	String service;

	public Consumer1Client(@LoadBalanced RestTemplate rest) {
		this.rest = rest;
	}

	public String getCtrl1Message() {
		logger.info(rest.toString());
		String msg = rest.getForObject(service, String.class);
		logger.info(msg);
		return msg;
	}
}
