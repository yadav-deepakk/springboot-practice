package com.example.springboot.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/home")
	public String HelloWorld() {
		return "<H2 align='center'>Hello World!<H2>";
	}

}
