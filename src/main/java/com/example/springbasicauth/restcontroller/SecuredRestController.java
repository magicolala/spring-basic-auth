package com.example.springbasicauth.restcontroller;

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
	public String adminEndPoint() {
		
		return "Admin sécurisé";
	}

}
