package com.edot.support.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.edot.service.BizUserService;
import com.edot.util.MD5Utils;
import com.edot.web.request.LoginRequest;
import com.edot.web.request.LoginResponse;

/**
 * Created by tony on 16/3/1.
 */
public class CspsUserDetailsService {

    @Autowired
    private BizUserService userService;

    public UserDetails loadUserByUsername(String username, String password) throws Exception {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(MD5Utils.MD5(password, username));
        LoginResponse response;
        try {
        	response = userService.login(loginRequest);
        } catch(Exception exception) {
        	if ("user.not.exist".equals(exception.getMessage())) {
        		throw new UsernameNotFoundException(username);
        	} else {
        		throw new Exception(exception.getMessage());
        	}
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + response.getType()));
        SessionUser user = new SessionUser(username, loginRequest.getPassword(), authorities);
        user.setUserId(response.getId());
        return user;
    }
}
