package com.login.google.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class LoginController {

	@GetMapping("/greet")
	public RedirectView greet() {
		RedirectView redirectView = new  RedirectView();
		redirectView.setUrl("http://127.0.0.1:5500/home.html");
		return redirectView;
	}
	
	@GetMapping("/current-user-principal")
	public Principal curerentUser(Principal principal) {
		return principal;
	}

	@GetMapping("/current-user-details")
	public ResponseEntity<Map<String, Object>> authUser(@AuthenticationPrincipal OAuth2User user){
		return (ResponseEntity<Map<String, Object>>) user.getAttributes();
	}
	
}
