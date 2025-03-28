package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/taskproducer")
public class KafkaTaskController {

	@Autowired
	KafkaTaskProducer kp;

	@GetMapping(value = "/send/{a}")
	public String sendthis(@PathVariable String a) {
		kp.sendmessage(a);
		return a + " message is sent";
	}

}
