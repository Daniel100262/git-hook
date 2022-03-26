package com.company.githook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class ValidationController {
	
	@GetMapping
	public ResponseEntity<String> validate() {
		return ResponseEntity.ok("The API is running!");
	}
	
	@PostMapping
	public ResponseEntity<String> newEndpoint() {
		return ResponseEntity.ok("Hi! I'm the new endpoint!);
	}
}
