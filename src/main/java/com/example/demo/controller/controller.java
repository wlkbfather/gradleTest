package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {
	
	@GetMapping("/test01")
	public String example01() {
		return "Hello World!!";
	}
	
	@GetMapping("/test02")
	public String example02() {
		return "GOGOGO";
	}
}
