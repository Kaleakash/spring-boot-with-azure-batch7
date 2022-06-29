package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to Spring boot with Azure created by Akash Kale";
	}
}
