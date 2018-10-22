package com.javatechclub.HelloWorldOpenShift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldResource {
	
	@GetMapping("/test")
	public String test() {
		return "Hello World from openshift";
	}
}
