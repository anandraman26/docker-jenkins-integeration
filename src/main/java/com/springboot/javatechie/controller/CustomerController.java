package com.springboot.javatechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CustomerController {
	
	@GetMapping("/")
	public String getCustomer() {
		return "hello";
	}
	
	@GetMapping("/get")
	public String getuCustomer() {
		return "hello get";
	}

}
