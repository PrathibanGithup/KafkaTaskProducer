package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaTaskProducer {

	@Autowired
	KafkaTemplate<String, String> kt;

	@Value("${my.topic.name}")
	private String topic;

	public void sendmessage(String msg) {
		kt.send(topic, msg);
	}
}
