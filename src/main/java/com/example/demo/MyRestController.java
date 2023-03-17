package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyRestController {
	
	@GetMapping()
	public String getGreeting(){
		return "Hello Jeniks CI/CD ";
	}

}
