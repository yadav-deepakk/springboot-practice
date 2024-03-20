package com.example.springboot.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/home")
	public String helloWorld() {
		return "<H2 align='center'>Hello World!<H2>";
	}
	
	@GetMapping("/greetuser/{userName}")
	public String greetUser(@PathVariable String userName) {
		return "<H2 align='center'>Hello " + userName + "<H2>"; 
	}


}
