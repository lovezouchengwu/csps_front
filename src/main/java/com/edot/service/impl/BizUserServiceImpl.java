package com.edot.service.impl;

import org.springframework.stereotype.Service;

import com.edot.service.BizUserService;
import com.edot.util.ApiUrls;
import com.edot.web.request.LoginRequest;
import com.edot.web.request.LoginResponse;
import com.edot.web.request.RegisterCompanyRequest;
import com.edot.web.request.RegisterPersonRequest;

@Service
public class BizUserServiceImpl extends BaseServiceImpl implements BizUserService {

	@Override
	public void register(RegisterPersonRequest registerRequest) throws Exception {
		httpApiClient.post(ApiUrls.REGISTER_PERSON, registerRequest, Object.class);
	}

	@Override
	public void register(RegisterCompanyRequest registerRequest) throws Exception {
		httpApiClient.post(ApiUrls.REGISTER_COMPANY, registerRequest, Object.class);
	}

	@Override
	public LoginResponse login(LoginRequest loginRequest) throws Exception {
		return httpApiClient.post(ApiUrls.LOGIN, loginRequest, LoginResponse.class);
	}
	
}
