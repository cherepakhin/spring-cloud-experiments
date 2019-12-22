package ru.perm.v.eureka1.consumer.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.eureka1.consumer.Consumer1Client;

@RestController
@RequestMapping("/consume-ctrl1")
public class ClientCtrl1 {

	@Autowired
	Consumer1Client consumer1Client;

	@GetMapping("")
	public String getCtrl1Message() {
		return consumer1Client.getCtrl1Message();
	}
}
