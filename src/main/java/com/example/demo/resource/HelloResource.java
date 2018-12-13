package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/techtalk")
public class HelloResource {

	@GetMapping
	public String hello() {
		return "Welcome to Virtualization & Dockerization TeckTalk...";
	}
	
}
