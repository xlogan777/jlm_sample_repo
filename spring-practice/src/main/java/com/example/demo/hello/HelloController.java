package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@RequestMapping("/hello") // Request mapping maps only to a get method by
								// default
	public String sayHi() {
		return "Hi";
	}
}
