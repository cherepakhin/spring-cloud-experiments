package ru.perm.v.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka1-service1")
public interface FeignClient1 {

	@GetMapping("/ctrl1")
	public String getTime();

}
