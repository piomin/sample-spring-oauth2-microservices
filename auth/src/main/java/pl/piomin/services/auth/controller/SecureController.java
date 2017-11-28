package pl.piomin.services.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@GetMapping("/ping")
	public String ping() {
		return "Secure Hello!";
	}
	
}
