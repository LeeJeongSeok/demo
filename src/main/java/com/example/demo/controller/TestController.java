package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

	@GetMapping("/")
	public String test() {
		return "index";
	}

	@PostMapping("/")
	public String test2() {
		return "Hello World";
	}

}
