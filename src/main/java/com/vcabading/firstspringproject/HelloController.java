package com.vcabading.firstspringproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("")
	public String hello() {
		return "Hello Spring World!";
	}
	
	@RequestMapping("/yo")
	public String yo() {
		return "You got this BRO!";
	}
}
