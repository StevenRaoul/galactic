package com.jacoste.galactic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured")
public class SecuredRestController {
	@GetMapping
	public String securedEndpoint() {
		return "Sécurisé";
	}
	
	@GetMapping("/admin")
	public String securedAdmin() {
		return "Admin Sécurisé";
	}
	
	
}
