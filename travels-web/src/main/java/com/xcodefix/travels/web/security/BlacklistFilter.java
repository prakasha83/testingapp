package com.xcodefix.travels.web.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

public class BlacklistFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		// Retrieve user details
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        // Filter only if user details is not empty; otherwise there's nothing to filter
        if (authentication != null)
        {
        	if (authentication instanceof AnonymousAuthenticationToken)
        	{
        		System.out.println("Anonymous Access Denied");
	            throw new AccessDeniedException("No logged in user");
	        }
	        
        }
        
        // User details are not empty
        logger.debug("Continue with remaining filters");
        filterChain.doFilter(request, response);
	}
}
