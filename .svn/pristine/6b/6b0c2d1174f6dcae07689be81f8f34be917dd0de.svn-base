package com.edot.service;

import com.edot.web.request.LoginRequest;
import com.edot.web.request.LoginResponse;
import com.edot.web.request.RegisterCompanyRequest;
import com.edot.web.request.RegisterPersonRequest;

public interface BizUserService extends BaseService {
	
	/**
	 * 个人注册
	 * @param registerRequest
	 * @throws Exception
	 */
	public void register(RegisterPersonRequest registerRequest) throws Exception;
	
	/**
	 * 企业注册
	 * @param registerRequest
	 * @throws Exception
	 */
	public void register(RegisterCompanyRequest registerRequest) throws Exception;
	
	/**
	 * 登录
	 * @param loginRequest
	 * @return
	 * @throws Exception
	 */
	public LoginResponse login(LoginRequest loginRequest) throws Exception;
}
