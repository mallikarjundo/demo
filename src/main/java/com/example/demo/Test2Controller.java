package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

	@GetMapping("/ram")
	public String test() {
		return "srisri";
	}
}
