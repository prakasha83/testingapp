package com.xcodefix.travels.web.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.xcodefix.travels.service.UserService;

public class AuthedicationManager implements AuthenticationManager {
	
	@Autowired
	private UserService userService;
	
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		
		String userName = auth.getName();
		String password = auth.getPrincipal().toString();
		
		com.xcodefix.entity.model.User user = userService.authenticate(userName, password);
		
		final List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
		grantedAuths.add(new SimpleGrantedAuthority("admin"));
		UserDetails principal = new User(userName, password, grantedAuths);
    	
    	UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);   
    	
    	userAuth.setDetails(user);
    	
		return userAuth;
	}

}
