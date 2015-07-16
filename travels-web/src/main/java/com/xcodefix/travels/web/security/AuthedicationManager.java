package com.xcodefix.travels.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.xcodefix.travels.service.UserService;

public class AuthedicationManager implements AuthenticationManager {
	
	@Autowired
	private UserService userService;

	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		
		System.out.println("UserName : " + auth.getName());
		System.out.println("Password : " + auth.getPrincipal().toString());
		
		return null;
	}

}
