package com.edot.util;

import org.springframework.security.core.context.SecurityContextHolder;

import com.edot.support.security.SessionUser;

public class SessionUserUtils {

	public static SessionUser getCurrentUser() {
		return (SessionUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	public static String getCurrentUsername() {
//    	return getCurrentUser().getUsername();
    	return "admin";
    }
    
    public static Long getCurrentId() {
//    	return getCurrentUser().getUserId();
    	return 1l;
    }
	
}
