package com.example.springboot.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/search")
	public String search(@RequestParam(name = "q", required = true) String q) {
		return "<h3 align='center'>Searching for " + q + "...</h3>";
	}

	@PostMapping("/post")
	public ResponseEntity<String> post(@RequestBody String requestBody) {
		return new ResponseEntity<>("Received request with body: " + requestBody, HttpStatus.OK);

	}

}
