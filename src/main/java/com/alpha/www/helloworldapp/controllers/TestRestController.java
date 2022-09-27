package com.alpha.www.helloworldapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "hello world";
	}

}
