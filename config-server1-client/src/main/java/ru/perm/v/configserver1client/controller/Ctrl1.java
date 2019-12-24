package ru.perm.v.configserver1client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${spring.application.name}/ctrl1")
public class Ctrl1 {

	@Value("${nameProp}")
	String prop;

	@GetMapping("")
	public String getProp() {
		return prop;
	}
}
