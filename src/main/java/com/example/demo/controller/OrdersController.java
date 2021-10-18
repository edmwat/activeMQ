package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping(value="/api")
public class OrdersController {


	public void postOrder() {}


	@GetMapping 
	public String getOrderList() {
		String returnMessage ="This is the expected return message";
		return returnMessage;
	}

}
