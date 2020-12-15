package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" as a message "Hello world"
	@GetMapping("/")
	public String sayHello() {
		return "Hello world!! Time on the server is " + LocalDateTime.now();
	}
}
