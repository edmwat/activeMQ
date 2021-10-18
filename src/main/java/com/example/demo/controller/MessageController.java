package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DispatcherService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping(value="/api")
@AllArgsConstructor 
public class MessageController {
	@Autowired
	DispatcherService dispatcherService;
	
	//Post new messages
	@PostMapping(value="/send")
	public ResponseEntity<String> send(@RequestBody String message){
		
		dispatcherService.sendMessage(message);
		
		return new ResponseEntity<String>("Messae sent: "+message, HttpStatus.OK);
	}
}
