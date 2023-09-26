package com.example.docker.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDockerController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to First Docker Application..!!";
	}

}
