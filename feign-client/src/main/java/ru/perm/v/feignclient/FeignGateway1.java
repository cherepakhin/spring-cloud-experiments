package ru.perm.v.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign1")
public class FeignGateway1 {
	@Autowired
	FeignClient1 feignClient1;

	@GetMapping("/ctrl1")
	public String getCtrl1() {
		return feignClient1.getTime();
	}
}
