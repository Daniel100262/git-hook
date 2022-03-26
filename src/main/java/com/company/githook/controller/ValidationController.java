package com.company.githook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class ValidationController {
	
	@GetMapping
	public ResponseEntity<String> validate() {
		return ResponseEntity.ok("The API is running!);
	}
	
}
