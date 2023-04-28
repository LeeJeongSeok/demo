package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String test() {
		return "layout/default";
	}

	@GetMapping("/member")
	public String member() {
		return "layout/member";
	}

	@GetMapping("/login")
	public String login() {
		return "member/login";
	}

	@GetMapping("/order-list")
	public String test2() {
		return "orders/orderList";
	}

	@GetMapping("/coupon-list")
	public String couponList() {
		return "coupon/couponList";
	}

	@GetMapping("/point-list")
	public String pointList() {
		return "point/pointList";
	}

	@GetMapping("/delivery-list")
	public String deliveryList() {
		return "delivery/deliveryList";
	}

	@GetMapping("/product-complete")
	public String productComplete() {
		return "product/productReplyComplete";
	}

	@GetMapping("/product-stay")
	public String productStay() {
		return "product/productReplyStay";
	}

	@GetMapping("/default")
	public String test3() {
		return "layout/default";
	}

	@GetMapping("/product/list")
	public String test4() {
		return "productReplyComplete";
	}

}
