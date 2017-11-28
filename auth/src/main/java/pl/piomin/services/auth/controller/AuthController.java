package pl.piomin.services.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@GetMapping("/ping")
	public String ping() {
		return "Hello!";
	}
	
}
