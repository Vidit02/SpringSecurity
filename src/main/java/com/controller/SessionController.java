package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
	
	@GetMapping("/signup")
	public ResponseEntity<?> getSignup(){
		return ResponseEntity.ok("Success");
	}
}
