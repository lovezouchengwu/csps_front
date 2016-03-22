package com.edot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edot.service.BacAreaService;
import com.edot.service.BizUserService;
import com.edot.util.MD5Utils;
import com.edot.web.request.RegisterCompanyRequest;
import com.edot.web.request.RegisterPersonRequest;

@Controller
public class GlobalController extends BaseController {
	
	@Autowired
    private BizUserService bizUserService;
	@Autowired
	private BacAreaService bacAreaService;
    @Autowired
    @Qualifier("org.springframework.security.authenticationManager")
    protected AuthenticationManager authenticationManager;
    
    @RequestMapping(value = "/preRegister", method = RequestMethod.GET)
    public String preRegister() {
    	return "common/register";
    }

    @RequestMapping(value = "/register/person", method = RequestMethod.POST)
    public String register(@Valid RegisterPersonRequest registerRequest, HttpServletRequest request, Model model) throws Exception {
    	String password = registerRequest.getPassword();
    	registerRequest.setPassword(MD5Utils.MD5(password, registerRequest.getUsername()));
    	bizUserService.register(registerRequest);
        model.addAttribute("user", registerRequest);
        // 注册后自动登录,待测试
        login(registerRequest.getUsername(), password, request);
        return "common/registerOk";
    }
    
    @RequestMapping(value = "/preRegister2", method = RequestMethod.GET)
    public String preRegister2(Model model) throws Exception {
    	model.addAttribute("areas", bacAreaService.list(1l));
    	return "common/register2";
    }
    
    @RequestMapping(value = "/register/company", method = RequestMethod.POST)
    public String register(@Valid RegisterCompanyRequest registerRequest, HttpServletRequest request, Model model) throws Exception {
    	String password = registerRequest.getPassword();
    	registerRequest.setPassword(MD5Utils.MD5(password, registerRequest.getUsername()));
    	bizUserService.register(registerRequest);
        model.addAttribute("user", registerRequest);
        // 注册后自动登录,待测试
        login(registerRequest.getUsername(), password, request);
        return "common/registerOk";
    }

	@RequestMapping(value = "/preLogin", method = RequestMethod.GET)
	public String preLogin() {
		return "common/login";
	}
	
	// 使用用户名密码登录
	private void login(String username, String password, HttpServletRequest request) throws Exception {
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        token.setDetails(new WebAuthenticationDetails(request));
        Authentication authenticatedUser = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
        request.getSession().setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());
	}
}
