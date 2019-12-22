package ru.perm.v.eureka1.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/ctrl1")
public class Ctrl1 {

	private final static Logger logger = LoggerFactory.getLogger(Ctrl1.class);

	@GetMapping
	public String getSimple() {
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		logger.info(String.format("getSimple() %s",time));
		return time;
	}
}
