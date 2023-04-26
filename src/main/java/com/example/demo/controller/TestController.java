package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String test() {
		return "index";
	}

	@GetMapping("/list")
	public String test2() {
		return "orders/orderList";
	}

	@GetMapping("/default")
	public String test3() {
		return "layout/default";
	}

}
