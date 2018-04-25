package com.alec.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainREST {

	@RequestMapping("/health")
	public String health() {
		return "I'm alright, how about you?";
	}

}
