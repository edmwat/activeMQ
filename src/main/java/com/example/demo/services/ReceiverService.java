package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class ReceiverService {
	Logger log = LoggerFactory.getLogger(ReceiverService.class);
	
	@JmsListener(destination = "${jms.queue}")
	public void receiveMessage(String message) {
		log.info("Received message: "+message);
	}
}
